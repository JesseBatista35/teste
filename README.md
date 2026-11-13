PASSO 0: abrir as janelas
Janela 1, na 473 (10.116.97.79): log em tempo real. Deixe aberta o tempo todo.
sudo tail -f /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | grep -E "WFLYSRV0010|WFLYSRV0027|WFLYSRV0021|WFLYUT0021|ERROR|Caused by|WELD-001408|Duplicate|ORA-|lcr|LCR|sirur|SIRUR|sifec-2"
Janela 2, na 471 (10.116.97.59): como root. É onde você baixa os pacotes.
Janela 3, na 471: CLI do JBoss.
/opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=localhost:9999
PASSO 1: LCR

1.1 Na janela 2, baixe o pacote:

curl -k -L -s -o /tmp/sifec_lcr_1.117.1.ear "https://fontes.caixa/deploy/deposito_captacao/-/raw/main/SILCR/05-Implantacao/Build/sifec_lcr_1.117.1.ear?ref_type=heads" && ls -l /tmp/sifec_lcr_1.117.1.ear && file /tmp/sifec_lcr_1.117.1.ear
Zip archive data: siga para o 1.2.
HTML: baixe pelo navegador e suba pela console. Content Repository → SILCR → Replace. Depois Server Groups → sifec-intranet → Add → Deploy Existing Content → SILCR. Em seguida, pule para o 1.3.

1.2 Na janela 3, faça o deploy:

deploy /tmp/sifec_lcr_1.117.1.ear --name=SILCR --runtime-name=sifec_lcr_1.117.1.ear --force
/server-group=sifec-intranet/deployment=SILCR:add(enabled=true)

1.3 Olhe a janela 1:

WFLYSRV0010 "SILCR" foi implantado: ✅ subiu. Vá para o 1.4.
WFLYSRV0021: foi revertido. Me manda o log.

1.4 Na janela 3, confira o Keycloak do LCR:

/profile=full-ha-sifec-intranet/subsystem=keycloak:read-children-names(child-type=secure-deployment)

Se o lcr-web.war não aparecer na lista, me avise.

PASSO 2: SIRUR 3.55.51.02

2.1 Na janela 2, baixe o pacote:

curl -s -o /tmp/sifec-sirur-3.55.51.02.ear http://binario.caixa:8081/repository/releases/br/gov/caixa/sirur/sifec-sirur/3.55.51.02/sifec-sirur-3.55.51.02.ear && ls -l /tmp/sifec-sirur-3.55.51.02.ear && file /tmp/sifec-sirur-3.55.51.02.ear

2.2 Na janela 3, faça o deploy:

deploy /tmp/sifec-sirur-3.55.51.02.ear --name=SIRUR --runtime-name=sifec-sirur-3.55.51.02.ear --force
/server-group=sifec-intranet/deployment=SIRUR:add(enabled=true)

2.3 Olhe a janela 1:

WFLYSRV0010 "SIRUR" foi implantado: ✅ subiu.
entityManagerFactory, Duplicate generator ou WFLYSRV0021: me manda o log.
PASSO 3: CCR, o 401 do Edson

3.1 Na 473, veja por que o token foi recusado:

sudo grep -nE "AdapterTokenVerifier|Failed to verify token|publicKey|Token is not active|Invalid token|realm|ccr-api" /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | tail -15

3.2 Na janela 2 (471), veja o Keycloak do ccr-api no 7.4:

grep -n -A15 'secure-deployment name="ccr-api' /opt/jboss/jboss-eap/dc/configuration/domain.xml | grep -vi secret

3.3 No 6.4 (10.116.88.20), veja o mesmo bloco:

sudo grep -n -A15 'secure-deployment name="ccr-api' /opt/jboss/jboss-eap/dc/configuration/domain.xml | grep -vi secret | head -40

3.4 Me manda as três saídas. Eu comparo e te passo os comandos de correção.

PASSO 4: SIFEC 2.161.2.0

4.1 Na janela 2, baixe o pacote:

curl -s -o /tmp/sifec-2.161.2.0.ear http://binario.caixa:8081/repository/releases/br/gov/caixa/fec/sifec/2.161.2.0/sifec-2.161.2.0.ear && ls -l /tmp/sifec-2.161.2.0.ear && file /tmp/sifec-2.161.2.0.ear

4.2 Na janela 3, faça o deploy. Ele troca o SIFEC atual (2.160.4.0) e faz o redeploy automático:

deploy /tmp/sifec-2.161.2.0.ear --name=SIFEC --runtime-name=sifec-2.161.2.0.ear --force

4.3 Na janela 1, o esperado é WFLYSRV0016 ... substituída pela implantação "sifec-2.161.2.0.ear".

PASSO 5: fim do dia
Confira tudo que está no ar, na janela 3:
/server-group=sifec-intranet:read-children-resources(child-type=deployment)
Me manda a saída que eu monto o resumo do dia para a sala.

Regra geral: se aparecer WFLYSRV0021 em qualquer passo, pare e me mande o log antes de seguir para o próximo.


