package com.exceptions.demoexceptionhandles.service;

import com.exceptions.demoexceptionhandles.dto.FinanceiroDto;
import com.exceptions.demoexceptionhandles.exception.ValorZeroException;
import org.springframework.stereotype.Service;

@Service
public class FinanceiroService {

	public FinanceiroDto salvar(FinanceiroDto financeiro) {
		validarValores(financeiro);
		financeiro.setId(1L);
		return financeiro;
	}

	private void validarValores(FinanceiroDto financeiro) {
		if (financeiro.getValor() == null || financeiro.getValor().doubleValue() == 0) {
			throw new ValorZeroException(
					"O valor do lançamento não pode ser 0 ou null",
					financeiro.getLancamento());
		}
	}

}
