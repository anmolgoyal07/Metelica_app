package com.sapient.marketdataservice.dto;

/**
 * Used to send Generic response from service.
 *
 * @param <T>
 */
public class ResponseDTO<T> {
	private String status;
	private String message;
	private T data;

	public ResponseDTO() {
	}

	public ResponseDTO(String status, String message) {
		this.status = status;
		this.message = message;
	}

	public ResponseDTO(String status, String message, T data) {
		this.status = status;
		this.message = message;
		this.data = data;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "ResponseDTO [status=" + status + ", message=" + message + ", data=" + data + "]";
	}

}