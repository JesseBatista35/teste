Olá Cid, tudo bem?
Estamos configurando o Application Insights para a aplicação SISME (ambiente DES) e chegamos numa dúvida sobre responsabilidade.
O que já temos:

Acesso de proxy liberado (proxydes.caixa) para os endpoints da Azure necessários ao Application Insights.
DNS solicitado e liberado.

O que falta:

O recurso Application Insights do SISME ainda não existe no Azure. Verificamos, como referência, que outros sistemas (ex.: SISAG) possuem um recurso próprio no padrão appi-<sistema>-des, dentro de um resource group rg-<sistema>-des, na assinatura "Serviços Compartilhados - DES".

Nossa dúvida é: qual equipe é responsável por provisionar esse recurso para o SISME? Precisamos dele criado para obter a Connection String e finalizar a configuração do agente na aplicação.
Poderia nos orientar quem devemos acionar?
Desde já agradecemos.
