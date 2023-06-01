package com.exceptions.demoexceptionhandles.api;

import com.exceptions.demoexceptionhandles.dto.FinanceiroDto;
import com.exceptions.demoexceptionhandles.service.FinanceiroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/financeiro")
public class FinanceiroApi {

	@Autowired
	private FinanceiroService financeiroService;

	@PostMapping
	public FinanceiroDto salvar(@RequestBody FinanceiroDto financeiro) {
		return financeiroService.salvar(financeiro);
	}

}
