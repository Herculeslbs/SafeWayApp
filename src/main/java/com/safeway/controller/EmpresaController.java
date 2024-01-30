package com.safeway.controller;

import com.safeway.model.Empresa;
import com.safeway.service.EmpresaService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/empresas")

public class EmpresaController {

	private final EmpresaService empresaService;

    public EmpresaController(EmpresaService empresaService) {
        this.empresaService = empresaService;
    }

    @PostMapping("/deposito")
    public String realizarDeposito(@RequestParam String cnpj, @RequestParam double valor) {
        // Assume que a empresa está autenticada e obtida de uma sessão
        Empresa empresa = new Empresa();
        empresa.setCnpj(cnpj);

        empresaService.realizarDeposito(empresa, valor);
        return "Depósito realizado com sucesso!";
    }

    @PostMapping("/saque")
    public String realizarSaque(@RequestParam String cnpj, @RequestParam double valor) {
        // Assume que a empresa está autenticada e obtida de uma sessão
        Empresa empresa = new Empresa();
        empresa.setCnpj(cnpj);

        empresaService.realizarSaque(empresa, valor);
        return "Saque realizado com sucesso!";
    }
}