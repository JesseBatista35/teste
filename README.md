Prezados,

Para agilizar a resolução, propomos alinharmos via Teams com todos os envolvidos (Esteira DevOps, equipe de Mainframe e comunidade Depósitos e Captação), já que não temos visibilidade da análise técnica realizada pela equipe de Mainframe na REQ anterior (REQ000145849640) — apenas o resultado registrado na nota, sem evidências (logs, prints de transação no CICS, etc.) anexadas que permitam confirmar em qual ambiente (DES ou TQS) a verificação foi de fato realizada.

Do nosso lado, levantamos uma nova evidência que gostaríamos de apresentar na reunião: os logs da aplicação em TQS (pod sid01-lancamentos-financeiros-okd4-tqs-45-wj5fm), cobrindo o período de 04/09 a 15/09, mostram de forma consistente o erro:

javax.xml.ws.soap.SOAPFaultException: Resource https://cicsweb.tqs.caixa:2587/sid01/lancamentoV4 not found

Esse é um fault SOAP estruturado — ou seja, a requisição chega ao CICS Web e é processada, mas o recurso não é encontrado (equivalente a um 404), o que é diferente de "a chamada não está sendo recebida". O padrão se repete de forma constante ao longo de 11 dias, sem variação por horário, o que aponta para uma questão de configuração de roteamento (URIMAP) no CICS para esse path/porta em TQS, e não para instabilidade de rede/proxy.

Como não temos acesso ao ambiente CICS/Mainframe, essa verificação está fora do nosso escopo — por isso sugerimos a reunião para alinharmos diretamente com quem tem esse acesso e evitarmos retrabalho de idas e vindas pela WO.
