Para ter certeza, teste direto no JBoss, sem passar pelo Apache.

1. Na 471, no CLI: descobrir o offset de porta do servidor

/host=hc_cbrdeapllx473/server-config=sifec-intranet_node1_lx473:read-attribute(name=socket-binding-port-offset)

2. Na 473: testar direto na porta do servidor

A porta é 8080 mais o offset que apareceu. Exemplo: com offset 100, a porta é 8180.

sudo ss -ltnp | grep java

Esse comando lista as portas abertas pelo JBoss, para você confirmar a porta HTTP. Depois:

curl -s -o /dev/null -w "%{http_code}\n" http://localhost:8180/ccr-parametros-web/
curl -s -o /dev/null -w "%{http_code}\n" http://localhost:8180/ccr-parametros-api/

(troque 8180 pela porta que você confirmou)

API 200 e web 404 direto no JBoss: o web não tem página na raiz. Só o João Pedro sabe a rota certa, e não é problema de ambiente.
Web 200/302 direto no JBoss, mas 404 pela URL: é o Apache que não encaminha o contexto web. Aí a correção é nossa.
O hash na 471

O grep não achou nada porque o find pegou outro domain.xml primeiro. Rode procurando em todos:

sudo grep -H -A2 'deployment name="SICCR-PARAMETROS"' $(sudo find /opt/jboss -name domain.xml)

O -H mostra de qual arquivo veio cada linha. Compare o sha1 com o do 6.4: 17eb02c18df167b8c50d388445f7a02cd4dd2c9e.





[root@cbrdeapllx471 p585600]# /opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=localhost:9999
[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /] /host=hc_cbrdeapllx473/server-config=sifec-intranet_node1_lx473:read-attribute(name=socket-binding-port-offset)
{
    "outcome" => "success",
    "result" => 2570
}

[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /]



[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$ sudo ss -ltnp | grep java

We trust you have received the usual lecture from the local System
Administrator. It usually boils down to these three things:

    #1) Respect the privacy of others.
    #2) Think before you type.
    #3) With great power comes great responsibility.

[sudo] password for p585600:
LISTEN 0      4096    10.116.97.79:10800      0.0.0.0:*    users:(("java",pid=2478826,fd=573))
LISTEN 0      4096    10.116.97.79:11013      0.0.0.0:*    users:(("java",pid=2480402,fd=982))
LISTEN 0      4096    10.116.97.79:11163      0.0.0.0:*    users:(("java",pid=2478826,fd=574))
LISTEN 0      50      10.116.97.79:6248       0.0.0.0:*    users:(("java",pid=2478826,fd=608))
LISTEN 0      4096    10.116.97.79:10579      0.0.0.0:*    users:(("java",pid=2480402,fd=928))
LISTEN 0      4096    10.116.97.79:10650      0.0.0.0:*    users:(("java",pid=2480402,fd=964))
LISTEN 0      4096    10.116.97.79:10729      0.0.0.0:*    users:(("java",pid=2478826,fd=572))
LISTEN 0      50      10.116.97.79:56920      0.0.0.0:*    users:(("java",pid=2478826,fd=612))
LISTEN 0      50      10.116.97.79:9999       0.0.0.0:*    users:(("java",pid=1752728,fd=456))
LISTEN 0      50         127.0.0.1:41527      0.0.0.0:*    users:(("java",pid=1752707,fd=112))
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$ curl -s -o /dev/null -w "%{http_code}\n" http://localhost:8180/ccr-parametros-web/
000
[p585600@cbrdeapllx473 ~]$ curl -s -o /dev/null -w "%{http_code}\n" http://localhost:8180/ccr-parametros-api/
000
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$

