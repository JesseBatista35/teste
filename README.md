ASSUNTO: [SAST] Erro ScanCentral 24.4.0 - Falha ao Gerar Especificação de Scan

Segue error report de falha no ScanCentral:

ERRO:
- Error generating scan specification
- Couldn't create a specification for /opt/ads-agent/_work/127/s
- Exit code 1

CONTEXTO:
- Versão ScanCentral: 24.4.0
- Controller: http://sast.caixa/scancentral-ctrl (respondendo OK)
- Modo: Remote translation mode com auto build tool detection
- Projeto: Node.js (npm ci executado com sucesso - 1388 packages instalados)
- Erro adicional: Python dependencies collecting finished with errors

LOGS:
- scancentral.log: /home/sadscp01/.fortify/scancentral-24.4.0/log

AÇÃO NECESSÁRIA:
Investigar por que ScanCentral não consegue gerar especificação mesmo com dependências instaladas corretamente e controller respondendo.

Obrigado,
[Seu nome - Analista de Esteiras DevOps]
