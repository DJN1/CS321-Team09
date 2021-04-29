package com.uah.cs321;

import java.util.ArrayList;
import java.util.Collections;

enum MailBoxType {
	INBOX,
	SENT,
	TRASH
}

/**
 *
 * @author Zach, Colin, Caleb, David
 */
public class Mailboxes {

	private final String mailboxUserEmailAddress;
	private final ArrayList<Email> sentBox;
	private final ArrayList<Email> inbox;
	private final ArrayList<Email> trashBox;

	public Mailboxes(String emailAddress) {
		this.mailboxUserEmailAddress = emailAddress;
		this.sentBox = new ArrayList<>();
		this.inbox = new ArrayList<>();
		this.trashBox = new ArrayList<>();
	}

	public String getMailboxUserEmailAddress() {
		return this.mailboxUserEmailAddress;
	}

	public ArrayList<Email> getSentBox() {
		return this.sentBox;
	}

	public ArrayList<Email> getInbox() {
		return this.inbox;
	}

	public ArrayList<Email> getTrashBox() {
		return this.trashBox;
	}

	public void sendEmailToTrash(Email aEmail, MailBoxType inboxType) {
		Email emailToMove;
		if (inboxType == MailBoxType.INBOX) {
			emailToMove = this.getEmailFromBox(aEmail, this.inbox);
			this.trashBox.add(0, emailToMove);
			this.removeEmailFromBox(aEmail, this.inbox);

		} else {
			emailToMove = this.getEmailFromBox(aEmail, this.sentBox);
			this.trashBox.add(0, emailToMove);
			this.removeEmailFromBox(aEmail, this.sentBox);
		}
	}

	public void deleteEmailFromTrash(Email aEmail) {
		removeEmailFromBox(aEmail, this.trashBox);
	}

	public void restoreEmailFromTrash(Email aEmail) {
		if (this.mailboxUserEmailAddress.equals(aEmail.getSender().getEmailAddress())) {
			this.sentBox.add(aEmail);
			sortEmailsDescByTimeStamp(sentBox);
		} else {
			this.inbox.add(aEmail);
			sortEmailsDescByTimeStamp(inbox);
		}

		deleteEmailFromTrash(aEmail);
	}

	public void emptyTrash() {
		this.trashBox.clear();
	}

	private void removeEmailFromBox(Email aEmail, ArrayList<Email> emailBox) {
		var emailToRemove = emailBox.indexOf(getEmailFromBox(aEmail, emailBox));
		emailBox.remove(emailToRemove);
	}

	private Email getEmailFromBox(Email aEmail, ArrayList<Email> emailBox) {
		return emailBox.stream().filter(email -> email.getSubject().equals(aEmail.getSubject())).findFirst().orElse(null);
	}

	private void sortEmailsDescByTimeStamp(ArrayList<Email> emailBox) {
		Collections.sort(emailBox, (Email e1, Email e2) -> e2.getTimeStamp().compareTo(e1.getTimeStamp()));
	}
}
