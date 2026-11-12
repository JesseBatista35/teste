Três frentes hoje. Vou na ordem mais rápida: SICDT, depois SIRUR, depois o SIEMP.

1. SICDT 3.24.3.004 (build novo do Inocêncio)

Na 471, como root, baixe o pacote:

curl -s -o /tmp/sifec-cdt-3.24.3.004.ear http://binario.caixa:8081/repository/releases/br/gov/caixa/sicdt/sifec-cdt/3.24.3.004/sifec-cdt-3.24.3.004.ear && ls -l /tmp/sifec-cdt-3.24.3.004.ear

Depois, no CLI, substitua o pacote atual. O --force troca o conteúdo do SICDT-FEC e faz o redeploy no sifec-intranet:

deploy /tmp/sifec-cdt-3.24.3.004.ear --name=SICDT-FEC --runtime-name=sifec-cdt-3.24.3.004.ear --force

Log na 473:

sudo tail -f /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | grep -E "WFLYSRV0010|WFLYSRV0027|WFLYSRV0021|ERROR|Caused by|cdt|ConectorException"
2. SIRUR 3.55.51.01 (persistence.xml ajustado pelo Michael)

Antes do deploy, confira o banco. Ficou pendente o ORA-01017, que é nosso. No CLI da 471:

/host=hc_cbrdeapllx473/server=sifec-intranet_node1_lx473/subsystem=datasources/data-source="jdbc/OracleSirurDS":test-connection-in-pool
[true]: o banco está ok, pode seguir.
Falhou: me manda a saída antes do deploy. Pode ser o mesmo caso do SIBAN, com credencial diferente do 6.4.

Para o deploy, falta o link do Nexus da 3.55.51.01. Peça ao Michael ou procure no Nexus por sifec-sirur. Com o link em mãos:

curl -s -o /tmp/sifec-sirur-3.55.51.01.ear "LINK_DO_NEXUS"

Me passe o link que eu monto esse comando já pronto.

Depois do download, no CLI:

deploy /tmp/sifec-sirur-3.55.51.01.ear --name=SIRUR --runtime-name=sifec-sirur-3.55.51.01.ear --force
/server-group=sifec-intranet/deployment=SIRUR:add(enabled=true)
3. SIEMP: o DNS foi atendido, e agora?

O DNS já resolve: siemp.des.caixa → 10.116.180.9 (VIP). Pela esteira não falta nada, porque o caminho VIP → VM já está funcionando. O 404 - Not Found da tela é a página padrão do JBoss, o que mostra que a requisição chegou no servidor. O problema é o caminho: o EAR do SIEMP publica o contexto /siemp (contextRoot no pom), e não /siemp_java.

Teste:

https://siemp.des.caixa/siemp

Se abrir, só falta conferir dois pontos:

“Não seguro” no navegador: pode ser a cadeia do certificado. Clique no cadeado → certificado e veja se o nome é siemp.des.caixa e quem é o emissor.
Login (SSO): se o SIEMP usa Keycloak, o client precisa aceitar o redirect https://siemp.des.caixa/*. Se o login voltar com erro de redirect, esse ajuste é no Keycloak.
Respostas

Para o Denilson (SIEMP):

Bom dia, Denilson! O DNS siemp.des.caixa foi criado hoje (WO0000082275737) e já aponta para o VIP. O 404 que você viu vem do próprio JBoss, ou seja, a requisição está chegando no servidor. O contexto publicado pelo EAR é /siemp. Consegue testar em https://siemp.des.caixa/siemp?

Para o Michael (SIRUR):

Obrigado, Michael! Pode me passar o link do Nexus da 3.55.51.01? Já faço o deploy no 7.4 e acompanho o log para ver se o ajuste no persistence.xml resolve.

Para o Inocêncio (SICDT):

Obrigado, Inocêncio! Vou fazer o redeploy da 3.24.3.004 agora e te aviso quando estiver no ar para a validação final.
