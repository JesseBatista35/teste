W.O. FECHADA - Ajuste de Rota OKD Realizado
Problema identificado e resolvido conforme solicitado.
A rota única estava causando conflito entre frontend e API, resultando em erro 405 quando tentava acessar a API sem o prefixo /api.
Solução implementada:

Rota 1: integra.iniciadora (/) → siinp-nucleo-web-tqs (Frontend)
Rota 2: integra.iniciadora-api (/api) → siinp-nucleo-tqs (API com rewrite-target para remover /api)

Resultado esperado:

Chamada externa: https://integra.iniciadora.caixa.gov.br/api/inic-pagto/nucleo/v1/jornada
Chega no backend como: /inic-pagto/nucleo/v1/jornada

Configuração concluída e validação em progresso pela comunidade técnica. W.O. aguardando feedback final antes do fechamento definitivo.
