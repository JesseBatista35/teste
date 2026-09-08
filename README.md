Nota de encerramento — Validação SIARG/DES pós-migração SSL para VIP

Realizada validação completa da cadeia de publicação da aplicação SIARG após a migração de SSL para o balanceador (VIP 10.116.180.5), conforme diretriz de Infraestrutura/Segurança (REQs 145741048, 145749435 e 145748985).

Itens validados no servidor caddeapllx2577 (10.116.201.44):

DNS siarg-interno.esteiras.des.caixa resolvendo corretamente para o VIP.
Conectividade VIP → VM confirmada.
vhost.conf do Apache (/opt/httpd/conf.d/vhost.conf) ajustado corretamente para o novo modelo: diretivas SSL locais desativadas, porta 443 operando em HTTP puro conforme esperado (SSL terminado no VIP).
Proxy reverso Apache → JBoss via AJP (porta 8009) funcionando normalmente.
Aplicação SIARG (JBoss EAP 7.4.18) respondendo corretamente; roteamento JSF (/siarg/ → /siarg/index) validado via curl.

Conclusão: a esteira e a publicação da aplicação estão corretamente adequadas ao novo modelo arquitetural, sem pendências de infraestrutura relacionadas à migração de SSL.

Observação à parte (não relacionada à migração): identificado erro intermitente e pré-existente na aplicação (NoClassDefFoundError: org.omnifaces.config.WebXmlSingleton, com primeira ocorrência registrada em 04/09/2026), que mascara respostas 404 legítimas como erro 500. A URL de teste original (/siarg/login) não corresponde a um endpoint válido da aplicação, o que, combinado a esse bug, gerou a percepção de indisponibilidade. Recomendado encaminhamento ao time de desenvolvimento do SIARG para tratativa do bug no OmniFaces.

Status: encerrado do lado CESTI/Infraestrutura.
