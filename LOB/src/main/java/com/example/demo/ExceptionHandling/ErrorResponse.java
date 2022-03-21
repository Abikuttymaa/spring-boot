package com.example.demo.ExceptionHandling;

import java.util.Date;
import java.util.List;

public class ErrorResponse {
	 private int statusCode;
	  private Date timestamp;
	  private String message;
	  private String description;
	  
		public ErrorResponse() {
			
		}

	public ErrorResponse(int statusCode, Date timestamp, String message, String description) {
		super();
		this.statusCode = statusCode;
		this.timestamp = timestamp;
		this.message = message;
		this.description = description;
	}

	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setTimestamp(long currentTimeMillis) {
		
	}
	public List<String> getDetails() {
		return details;
	}
	public void setDetails(List<String> details) {
		this.details = details;
	}
	
	private List<String> details;
	
	
	public ErrorResponse(String message, List<String> details) {
		super();
		this.message=message;
		this.details=details;
		
	}

	public ErrorResponse(String string, String message, Object ErrorResponse) {
	}

	
	
}
