package com.exceptions.demoexceptionhandles.dto;

public class ErrorDto {

	private String message;
	private String lancamento;

	public ErrorDto(String message, String lancamento) {
		this.message = message;
		this.lancamento = lancamento;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getLancamento() {
		return lancamento;
	}

	public void setLancamento(String lancamento) {
		this.lancamento = lancamento;
	}
}
