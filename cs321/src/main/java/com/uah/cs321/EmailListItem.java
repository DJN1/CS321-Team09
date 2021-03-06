/**
 * Class: EmailListItem.java
 * Purpose: Creates email list item for inboxes with sender, subject and timestamp.
 */
package com.uah.cs321;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.GroupLayout;
import javax.swing.JLabel;
import javax.swing.LayoutStyle;

/**
 *
 * @author David, Colin, Caleb, Zach
 */
public class EmailListItem extends javax.swing.JPanel {

	/**
	 * Creates new form EmailListItem
	 *
	 * @param email email associated with tile
	 * @param currentInboxType type of current Mailbox
	 */
	public EmailListItem(Email email, MailBoxType currentInboxType) {
		this.email = email;
		this.currentInboxType = currentInboxType;
		initComponents();
	}

	// creates ui
	private void initComponents() {

		senderEmailLabel = new JLabel();
		timeStampLabel = new JLabel();
		subjectLabel = new JLabel();

		setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0, 0, 0)));
		setPreferredSize(new Dimension(967, 64));
		addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent evt) {
				formMouseClicked(evt);
			}
		});

		senderEmailLabel.setFont(new Font("Segoe UI", 0, 18)); // NOI18N
		senderEmailLabel.setText(this.email.getSender().getEmailAddress());

		timeStampLabel.setFont(new Font("Segoe UI", 0, 18)); // NOI18N
		timeStampLabel.setText(this.email.getTimeStamp().toString());

		subjectLabel.setFont(new Font("Segoe UI", 0, 18)); // NOI18N
		subjectLabel.setText(this.email.getSubject());

		javax.swing.GroupLayout layout = new GroupLayout(this);
		this.setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup()
								.addContainerGap()
								.addComponent(senderEmailLabel)
								.addGap(392, 392, 392)
								.addComponent(subjectLabel)
								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 404, Short.MAX_VALUE)
								.addComponent(timeStampLabel)
								.addContainerGap())
		);
		layout.setVerticalGroup(
				layout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup()
								.addGap(18, 18, 18)
								.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
										.addComponent(senderEmailLabel)
										.addComponent(timeStampLabel)
										.addComponent(subjectLabel))
								.addContainerGap(19, Short.MAX_VALUE))
		);
	}

	// opens email that was clicked
	private void formMouseClicked(MouseEvent evt) {
		new EmailView(null, true, this.email, this.currentInboxType).setVisible(true);
	}

	private final Email email;
	private final MailBoxType currentInboxType;
	private JLabel senderEmailLabel;
	private JLabel timeStampLabel;
	private JLabel subjectLabel;
}
