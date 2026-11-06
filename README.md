1. Veja como está o RURAL no domain (CLI do 471):

:read-children-names(child-type=deployment)
/server-group=sifec-intranet:read-children-names(child-type=deployment)
O primeiro lista o que está no repositório. Procure algo como SIFEC-RURAL4.
O segundo lista o que está atribuído ao sifec-intranet.

2. Confira a cadeia do outro endpoint que os módulos usam (no 473). Se for a mesma AC Icptestes, já está coberto:

echo | openssl s_client -connect api.des.caixa:443 -showcerts 2>/dev/null | grep -E "^ *[0-9]+ s:|^ *i:"

3. Subir o RURAL (CLI do 471), conforme o resultado do passo 1:

Está no repositório, mas não no sifec-intranet:
deploy --name=SIFEC-RURAL4 --server-groups=sifec-intranet
Já está no sifec-intranet, mas desabilitado:
/server-group=sifec-intranet/deployment=SIFEC-RURAL4:deploy
Não está em nenhum dos dois: é Upload pela console, com o .ear que os devs mandarem.

Ajuste o nome se no passo 1 aparecer outro, como SIFEC-RURAL.

4. Acompanhe no 473 (abra antes de subir):

sudo tail -f /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | grep -E "WFLYSRV0010|WFLYCTL0013|ERROR|PKIX|rural|RURAL|FileNotFound|keystore"
WFLYSRV0010: ... rural: subiu.
PKIX: falta outra AC no truststore. Me mande o host que aparecer.
FileNotFound/keystore com caminho C:/...: é outra property com caminho de Windows (DATAPREV_CERTIFICADO_CAIXA_PATH, SIAPX_WS_MPOG_TRUST_STORE). Ajustamos também.

Pode me mandar a saída do passo 1 primeiro.
