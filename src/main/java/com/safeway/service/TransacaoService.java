package com.safeway.service;

import com.safeway.model.Transacao;

public interface TransacaoService {
    Transacao criarTransacao(String tipo, double valor);
    void notificarCliente(String tipo, String cpf);
}