O PARAMETROS ainda está na versão anterior (sifec-ccr-parametros.ear, que é a 3.3.1.1). Enquanto o Jeferson faz o Replace pela console, deixe o log aberto na 473:

sudo tail -f /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | grep -E "WFLYSRV0010|WFLYSRV0016|WFLYSRV0027|WFLYSRV0021|WFLYUT0021|WELD-00|ERROR|Caused by|parametros"

O que observar:

WFLYSRV0027 ... sifec-ccr-parametros-spr3.ear: começou a subir.
WFLYUT0021: contextos /ccr-parametros-web e /ccr-parametros-api registrados.
WFLYSRV0016 ... substituída pela implantação "sifec-ccr-parametros-spr3.ear": concluído com sucesso.
WFLYSRV0021: foi revertido. A versão anterior continua no ar. Me manda o trecho.

Depois de concluir, confirme no CLI:

/deployment=SICCR-PARAMETROS:read-attribute(name=runtime-name)

O resultado deve ser sifec-ccr-parametros-spr3.ear. E teste a API na sua estação:

curl -k -s -o NUL -w "%{http_code}\n" https://migracaosifec.des.caixa/ccr-parametros-api/
