package com.safeway.service;

import com.safeway.model.Cliente;

public interface ClienteService {
    Cliente realizarDeposito(String cpf, double valor);
    Cliente realizarSaque(String cpf, double valor);
}