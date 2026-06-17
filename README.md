REQ000144492006 - RELATÓRIO FINAL
Prezados CETEL/TELEDATA,
Foi concluída a investigação solicitada sobre o VIP 10.116.181.172 e porta 443.
PROBLEMA 1: DUPLICAÇÃO DE VMs - RESOLVIDO
Durante a investigação, foi identificado conflito de IPs na infraestrutura de Esteiras Ageis. Duas máquinas virtuais estavam configuradas com o mesmo endereço IP 10.116.201.129:

VM CADDEAPLLX2673 (ECAPT-BANCARIO-TQS): Identificada como máquina duplicada e removida
VM CADDEAPLLX2520 (ECAPT-SOCIAL-TQS): Mantida em produção

A máquina duplicada foi deletada do ambiente vSphere em 17 de junho de 2026 às 14:43.
PROBLEMA 2: PORTA 443 - DIAGNOSTICADO
Foi realizado diagnóstico completo do servidor 10.116.201.129. O resultado é o seguinte:

JBoss EAP 8 está respondendo normalmente
HTTPS está ativo na porta 8443
Certificado CT2026_APT-BANCARIO está instalado e válido
TLSv1.2 está funcionando
Porta 443 não possui aplicação ouvindo

Teste realizado:

curl -k https://10.116.201.129:8443/

Resultado: HTTP/2 200 - Welcome to JBoss EAP 8
AÇÃO NECESSÁRIA
O VIP 10.116.181.172 precisa ser configurado para:

Aceitar conexões HTTPS na porta 443
Rotear o tráfego para 10.116.201.129:8443

Sem essa configuração do roteamento, o VIP continuará indisponível.
RESUMO
Infraestrutura: OK

Aplicação: OK

Certificado: OK

Roteamento VIP: Pendente de ação da equipe CETEL
Solicitamos que procedam com a configuração necessária no VIP para finalizar esta demanda.
