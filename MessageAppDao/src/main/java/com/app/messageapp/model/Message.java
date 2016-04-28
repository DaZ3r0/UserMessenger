package com.app.messageapp.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the messages database table.
 * 
 */
@Entity
@Table(name="messages")
@NamedQuery(name="Message.findAll", query="SELECT m FROM Message m")
public class Message implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String messageId;

	@Lob
	private String attachment;

	@Lob
	private String messageText;

	private byte read;

	private byte readByAll;

	@Temporal(TemporalType.TIMESTAMP)
	private Date readTime;

	@Temporal(TemporalType.TIMESTAMP)
	private Date receivedTime;

	@Temporal(TemporalType.TIMESTAMP)
	private Date sentTime;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="sender")
	private User user1;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="receiver")
	private User user2;

	public Message() {
	}

	public String getMessageId() {
		return this.messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	public String getAttachment() {
		return this.attachment;
	}

	public void setAttachment(String attachment) {
		this.attachment = attachment;
	}

	public String getMessageText() {
		return this.messageText;
	}

	public void setMessageText(String messageText) {
		this.messageText = messageText;
	}

	public byte getRead() {
		return this.read;
	}

	public void setRead(byte read) {
		this.read = read;
	}

	public byte getReadByAll() {
		return this.readByAll;
	}

	public void setReadByAll(byte readByAll) {
		this.readByAll = readByAll;
	}

	public Date getReadTime() {
		return this.readTime;
	}

	public void setReadTime(Date readTime) {
		this.readTime = readTime;
	}

	public Date getReceivedTime() {
		return this.receivedTime;
	}

	public void setReceivedTime(Date receivedTime) {
		this.receivedTime = receivedTime;
	}

	public Date getSentTime() {
		return this.sentTime;
	}

	public void setSentTime(Date sentTime) {
		this.sentTime = sentTime;
	}

	public User getUser1() {
		return this.user1;
	}

	public void setUser1(User user1) {
		this.user1 = user1;
	}

	public User getUser2() {
		return this.user2;
	}

	public void setUser2(User user2) {
		this.user2 = user2;
	}

}