package com.safeway.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.safeway.service.ClienteService;

@RestController
@RequestMapping("/clientes")

public class ClienteController {
	
	private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @PostMapping("/deposito")
    public String realizarDeposito(@RequestParam String cpf, @RequestParam double valor) {
        clienteService.realizarDeposito(cpf, valor);
        return "Depósito realizado com sucesso!";
    }

    @PostMapping("/saque")
    public String realizarSaque(@RequestParam String cpf, @RequestParam double valor) {
        clienteService.realizarSaque(cpf, valor);
        return "Saque realizado com sucesso!";
    }
}