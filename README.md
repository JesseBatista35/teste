Vamos na ordem: primeiro o PARAMETROS (spr3), que é só troca de versão, depois o SIRUR 3.55.51.01.

Antes de começar, baixe na sua estação os dois .ear do Teams: o sifec-ccr-parametros-spr3.ear (do Rodrigo) e o .ear da 3.55.51.01 (do Michael).

0. Deixe o log aberto na 473 (10.116.97.79)
sudo tail -f /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | grep -E "WFLYSRV0010|WFLYSRV0016|WFLYSRV0027|WFLYSRV0021|ERROR|Caused by|Duplicate generator|ORA-|parametros|sirur"
1. PARAMETROS spr3

Confira se o João Pedro já atualizou. No CLI da 471:

/deployment=SICCR-PARAMETROS:read-attribute(name=runtime-name)
sifec-ccr-parametros-spr3.ear: já está atualizado. Pule para o SIRUR.
sifec-ccr-parametros.ear: atualize pela console (https://eap74-nprd.des.caixa:9443): Deployments → Content Repository → SICCR-PARAMETROS → seta ao lado de View → Replace → selecione o sifec-ccr-parametros-spr3.ear → confirme.

No log, o esperado é WFLYSRV0016 ... substituída pela implantação "sifec-ccr-parametros-spr3.ear".

2. SIRUR 3.55.51.01

Na console:

Content Repository → SIRUR → seta → Replace → selecione o .ear da 3.55.51.01 → confirme.
Server Groups → sifec-intranet → Add → Deploy Existing Content → marque SIRUR → Deploy.

No log:

WFLYSRV0010: "SIRUR" foi implantado: subiu, o ajuste do Michael funcionou.
Duplicate generator name gen de novo: o ajuste não pegou nas duas unidades. Me manda o trecho.
WFLYSRV0021 com outro erro: me manda o trecho para analisarmos.

Me manda o log de cada um assim que rodar.
