package com.safeway.service;

import com.safeway.model.Empresa;

public interface EmpresaService {
    Empresa realizarDeposito(Empresa empresa, double valor);
    Empresa realizarSaque(Empresa empresa, double valor);
    void enviarCallback(Empresa empresa, String tipoTransacao);
}