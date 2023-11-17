package com.example.userRegisteration;


public class EmailRequest {

    private String recipient;
    private String subject;
    private String body;
	public String getRecipient() {
		return recipient;
	}
	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public EmailRequest(String recipient, String subject, String body) {
		this.recipient = recipient;
		this.subject = subject;
		this.body = body;
	}
	@Override
	public String toString() {
		return "EmailRequest [recipient=" + recipient + ", subject=" + subject + ", body=" + body + "]";
	}

    // getters and setters
}
