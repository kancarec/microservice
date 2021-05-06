package com.rabbit.micro.data;

public class SmsRequest {
	private String message;
	private String clientName;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	@Override
	public String toString() {
		return "SmsRequest [message=" + message + ", clientName=" + clientName + "]";
	}

}
