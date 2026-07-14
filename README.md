Resumo do troubleshooting — SIOUV (REQ000144870440)
Situação: SIOUV (JBoss 6.4, ambiente DES) apresentando erro de conexão com banco, mesmo após validação da CRQ000001446706 (migração orad01ng → CDBD01NGPDB001).
O que já foi verificado e confirmado:

Erro identificado no log da aplicação (server.log, host siouv_node1_lx0002): Listener refused the connection, no datasource java:/jdbc/OracleSiouvDS.
A connection-url do datasource já está corrigida no domain controller (profile full-ha-siouv), apontando corretamente para oracle-nprd-1000.caixa:1521/prim_D01NGSRV.
Testamos conectividade de rede do host de aplicação até o novo banco na porta 1521 — conexão TCP responde normalmente. Descarta bloqueio de firewall/rede.
Mesmo com URL correta e rede OK, o erro persiste, inclusive em ocorrências posteriores à confirmação da correção da URL.

O que ainda não conseguimos confirmar (fora do escopo/acesso desta esteira):

Se o service name prim_D01NGSRV está de fato ativo e registrado no listener Oracle do lado do banco (precisa de tnsping ou verificação direta do DBA).
Se a credencial SOUVBD01 usada pelo datasource é válida no banco novo pós-migração.
Se o domain controller e o host de aplicação (lx0002) estão sincronizados — não foi possível confirmar porque o canal de management (porta 9990) estava indisponível durante a análise, tanto no slave quanto tentando acessar o master diretamente.

Conclusão até o momento: o problema não é URL antiga nem bloqueio de rede — ambos descartados com evidência. A causa mais provável está no lado do banco (listener/serviço/credencial) ou na sincronização do domain, e precisa de acesso que não temos nesta esteira (DBA e/ou management do domain).
