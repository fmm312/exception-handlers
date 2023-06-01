package com.exceptions.demoexceptionhandles.handler;

import com.exceptions.demoexceptionhandles.dto.ErrorDto;
import com.exceptions.demoexceptionhandles.exception.ValorZeroException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ValorZeroExceptionHandler {

	@ResponseStatus(HttpStatus.PRECONDITION_FAILED)
	@ResponseBody
	@ExceptionHandler(ValorZeroException.class)
	public ErrorDto handler(ValorZeroException ex) {
		return new ErrorDto(
				ex.getMessage(),
				ex.getLancamento()
		);
	}

}
