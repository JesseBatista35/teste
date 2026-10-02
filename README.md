package br.gov.caixa.siapo.movimentacao.application;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ProcessamentoSisfinService extends ProcessamentoService {

    @Override
    public void executar() {
        // Implementação específica do processamento Sisfin
    }

}
