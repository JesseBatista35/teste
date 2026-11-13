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





root@cbrdeapllx471 p585600]#
[root@cbrdeapllx471 p585600]# curl -k -L -s -o /tmp/sifec_lcr_1.117.1.ear "https://fontes.caixa/deploy/deposito_captacao/-/raw/main/SILCR/05-Implantacao/Build/sifec_lcr_1.117.1.ear?ref_type=heads" && ls -l /tmp/sifec_lcr_1.117.1.ear && file /tmp/sifec_lcr_1.117.1.ear
-rw-r--r-- 1 root root 10373 Nov 13 14:48 /tmp/sifec_lcr_1.117.1.ear
/tmp/sifec_lcr_1.117.1.ear: HTML document, UTF-8 Unicode text, with very long lines
[root@cbrdeapllx471 p585600]#
[root@cbrdeapllx471 p585600]#
[root@cbrdeapllx471 p585600]#
[root@cbrdeapllx471 p585600]#




[domain@localhost:9999 /]
[domain@localhost:9999 /] deploy /tmp/sifec_lcr_1.117.1.ear --name=SILCR --runtime-name=sifec_lcr_1.117.1.ear --force
[domain@localhost:9999 /] /server-group=sifec-intranet/deployment=SILCR:add(enabled=true)
{
    "outcome" => "failed",
    "result" => undefined,
    "failure-description" => {"WFLYDC0074: Operation failed or was rolled back on all servers. Server failures:" => {"server-group" => {"sifec-intranet" => {"host" => {"hc_cbrdeapllx473" => {"sifec-i
ntranet_node1_lx473" => {"WFLYCTL0080: Falha de serviços" => {"jboss.deployment.unit.\"sifec_lcr_1.117.1.ear\".STRUCTURE" => "WFLYSRV0153: Falha ao processar a fase STRUCTURE de deployment \"sifec_lc
r_1.117.1.ear\"
    Caused by: org.jboss.as.server.deployment.DeploymentUnitProcessingException: WFLYSRV0160: Falha ao montar o conteúdo de implantação
    Caused by: java.util.zip.ZipException: error in opening zip file"}}}}}}}},
    "rolled-back" => true,
    "server-groups" => {"sifec-intranet" => {"host" => {"hc_cbrdeapllx473" => {"sifec-intranet_node1_lx473" => {"response" => {
        "outcome" => "failed",
        "result" => undefined,
        "failure-description" => {"WFLYCTL0080: Falha de serviços" => {"jboss.deployment.unit.\"sifec_lcr_1.117.1.ear\".STRUCTURE" => "WFLYSRV0153: Falha ao processar a fase STRUCTURE de deployment \
"sifec_lcr_1.117.1.ear\"
    Caused by: org.jboss.as.server.deployment.DeploymentUnitProcessingException: WFLYSRV0160: Falha ao montar o conteúdo de implantação
    Caused by: java.util.zip.ZipException: error in opening zip file"}},
        "rolled-back" => true
    }}}}}}
}

[domain@localhost:9999 /]




[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$ sudo tail -f /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | grep -E "WFLYSRV0010|WFLYSRV0027|WFLYSRV0021|WFLYUT0021|ERROR|Caused by|WELD-001408|Duplicate|ORA-|lcr|LCR|sirur|SIRUR|sifec-2"

We trust you have received the usual lecture from the local System
Administrator. It usually boils down to these three things:

    #1) Respect the privacy of others.
    #2) Think before you type.
    #3) With great power comes great responsibility.

[sudo] password for p585600:
14:48:56,253 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0027: Iniciando a implantação do "SILCR" (runtime-name: "sifec_lcr_1.117.1.ear")
14:48:56,443 ERROR [org.jboss.msc.service.fail] (MSC service thread 1-1) MSC000001: Failed to start service jboss.deployment.unit."sifec_lcr_1.117.1.ear".STRUCTURE: org.jboss.msc.service.StartException in service jboss.deployment.unit."sifec_lcr_1.117.1.ear".STRUCTURE: WFLYSRV0153: Falha ao processar a fase STRUCTURE de deployment "sifec_lcr_1.117.1.ear"
Caused by: org.jboss.as.server.deployment.DeploymentUnitProcessingException: WFLYSRV0160: Falha ao montar o conteúdo de implantação
Caused by: java.util.zip.ZipException: error in opening zip file
14:48:56,458 ERROR [org.jboss.as.controller.management-operation] (ServerService Thread Pool -- 150) WFLYCTL0013: Falha na operação ("add") - endereço ([("deployment" => "SILCR")]) - falha na descrição: {"WFLYCTL0080: Falha de serviços" => {"jboss.deployment.unit.\"sifec_lcr_1.117.1.ear\".STRUCTURE" => "WFLYSRV0153: Falha ao processar a fase STRUCTURE de deployment \"sifec_lcr_1.117.1.ear\"
    Caused by: org.jboss.as.server.deployment.DeploymentUnitProcessingException: WFLYSRV0160: Falha ao montar o conteúdo de implantação
    Caused by: java.util.zip.ZipException: error in opening zip file"}}
14:48:56,458 ERROR [org.jboss.as.controller.management-operation] (ServerService Thread Pool -- 150) WFLYCTL0013: Falha na operação ("add") - endereço ([("deployment" => "SILCR")]) - falha na descrição: {"WFLYCTL0080: Falha de serviços" => {"jboss.deployment.unit.\"sifec_lcr_1.117.1.ear\".STRUCTURE" => "WFLYSRV0153: Falha ao processar a fase STRUCTURE de deployment \"sifec_lcr_1.117.1.ear\"
    Caused by: org.jboss.as.server.deployment.DeploymentUnitProcessingException: WFLYSRV0160: Falha ao montar o conteúdo de implantação
    Caused by: java.util.zip.ZipException: error in opening zip file"}}
14:48:56,466 ERROR [org.jboss.as.server] (ServerService Thread Pool -- 150) WFLYSRV0021: O procedimento da implantação "sifec_lcr_1.117.1.ear" foi revertido com mensagem de falha:
{"WFLYCTL0080: Falha de serviços" => {"jboss.deployment.unit.\"sifec_lcr_1.117.1.ear\".STRUCTURE" => "WFLYSRV0153: Falha ao processar a fase STRUCTURE de deployment \"sifec_lcr_1.117.1.ear\"
    Caused by: org.jboss.as.server.deployment.DeploymentUnitProcessingException: WFLYSRV0160: Falha ao montar o conteúdo de implantação
    Caused by: java.util.zip.ZipException: error in opening zip file"}}
14:48:56,469 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0028: Implantação interrompida SILCR (runtime-name: sifec_lcr_1.117.1.ear) em 3ms


