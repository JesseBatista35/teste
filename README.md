RESOLUÇÃO – LEVANTAMENTO DE VARIÁVEIS DE AMBIENTE LDAP – SICIA

Atendida a solicitação de levantamento das variáveis STRATEGY, LDAP_URL, LDAP_USER_BASE e LDAP_GROUP_BASE do SICIA nos ambientes DES, TQS, HMP, PILOTO e PRD.

RESUMO

DES

URL: des.sicia.pedes.caixa
Servidor: sctdeapllx0094.df.caixa (10.116.83.94)
STRATEGY=user

TQS

URL: tqs.sicia.pedes.caixa
Servidor: scttqapllx0013.df.caixa (10.116.18.118)
STRATEGY=user

HMP

URL: hmp.sicia.proinfo.caixa (frontend sp.frontend.proinfo.caixa / 10.116.114.124)
Servidor: scthmapllx0110.df.caixa (10.116.117.168)
STRATEGY=ldap-search

PILOTO

URL: piloto.sicia.caixa (VIP 10.123.6.86)
Servidor: cctcoitrlx008.df.caixa (10.123.38.230)
STRATEGY=ldap-search

PRD

URL: sicia.caixa (frontend ctc.frontend.proinfo.caixa / 10.123.6.10)
Servidor: cctdcapllx0632.df.caixa (10.123.40.149)
STRATEGY=ldap-search

Variáveis de LDAP (iguais em todos os ambientes):
LDAP_URL=ldap://ldapcluster.corecaixa:489
LDAP_USER_BASE=ou=People,o=caixa
LDAP_GROUP_BASE=ou=Groups, o=caixa
Obs.: LDAP_GROUP_BASE contém um espaço após a vírgula, conforme configurado na aplicação.

EVIDÊNCIAS – DES (sctdeapllx0094 / 10.116.83.94)

Coleta feita pela equipe DES/TQS NPRD. A aplicação é Node.js gerenciada por PM2 (pm2-sicia.service), em /opt/sicia/server.

p585600@SCTDEAPLLX0094:~$ sudo cat /proc/29599/environ | tr '\0' '\n' | grep -E '^(STRATEGY|LDAP_URL|LDAP_USER_BASE|LDAP_GROUP_BASE)='
STRATEGY=user
LDAP_URL=ldap://ldapcluster.corecaixa:489
LDAP_USER_BASE=ou=People,o=caixa
LDAP_GROUP_BASE=ou=Groups, o=caixa

PID 29599 = node /opt/sicia/server/services/ldap/index.js. Valores idênticos nos processos 29619, 29630, 29638 e 29666.
Origem da configuração: /opt/sicia/server/ecosystem/deploy/env/des.js e env/common/index.js

EVIDÊNCIAS – TQS (scttqapllx0013 / 10.116.18.118)

Coleta feita pela equipe DES/TQS NPRD.

p585600@SCTTQAPLLX0013:~$ P=$(pgrep -f 'services/ldap/index.js'); echo "PID=$P"
PID=24846
p585600@SCTTQAPLLX0013:~$ sudo cat /proc/$P/environ | tr '\0' '\n' | grep -E '^(STRATEGY|LDAP_URL|LDAP_USER_BASE|LDAP_GROUP_BASE)='
LDAP_GROUP_BASE=ou=Groups, o=caixa
LDAP_USER_BASE=ou=People,o=caixa
LDAP_URL=ldap://ldapcluster.corecaixa:489
STRATEGY=user

EVIDÊNCIAS – HMP (scthmapllx0110 / 10.116.117.168)

Coleta feita com apoio da Infraestrutura. Servidor identificado pelo upstream do nginx no frontend sp.frontend.proinfo.caixa:

upstream siciaRest { server scthmapllx0110.df.caixa:8444; }
upstream siciaSocket { server scthmapllx0110.df.caixa:8443; }
server_name hmp.sicia.proinfo.caixa;

ping scthmapllx0110.df.caixa -> 10.116.117.168

== 10997 node /opt/sicia/server/index.js
LDAP_GROUP_BASE=ou=Groups, o=caixa
LDAP_USER_BASE=ou=People,o=caixa
LDAP_URL=ldap://ldapcluster.corecaixa:489
STRATEGY=ldap-search
SICIA_ENV=HMP

Valores idênticos nos processos 10998, 11047, 11048 e 11059.

EVIDÊNCIAS – PILOTO (cctcoitrlx008 / 10.123.38.230)

Coleta feita com apoio da Infraestrutura. Servidor identificado pelo upstream do nginx (WO0000019989829):

upstream siciaRest { server 10.123.38.230:8444; # server cctdcapllx0632.df.caixa:8444; }
upstream siciaSocket { ip_hash; server 10.123.38.230:8443; server 10.123.38.230:9001; server 10.123.38.230:9002; }

root@cctcoitrlx008:/opt/sicia# hostname -f
cctcoitrlx008.df.caixa
root@cctcoitrlx008:/opt/sicia# hostname -I
10.123.38.230

== 10845 node /opt/sicia/server/services/ldap/index.js
LDAP_GROUP_BASE=ou=Groups, o=caixa
LDAP_USER_BASE=ou=People,o=caixa
LDAP_URL=ldap://ldapcluster.corecaixa:489
STRATEGY=ldap-search
SICIA_ENV=PILOTO_PRD

Valores idênticos nos processos 14423, 14429, 14435 e 25491.

EVIDÊNCIAS – PRD (cctdcapllx0632 / 10.123.40.149)

Coleta feita com apoio da Infraestrutura.

nslookup cctdcapllx0632.df.caixa -> 10.123.40.149

== 14542 /opt/sicia/.nvm/versions/node/v8.1.3/bin/node ... workerpool/dist/worker.js
SICIA_ENV=PRD
STRATEGY=ldap-search
LDAP_URL=ldap://ldapcluster.corecaixa:489
LDAP_USER_BASE=ou=People,o=caixa
LDAP_GROUP_BASE=ou=Groups, o=caixa

Valores idênticos nos processos 14571, 16891 e 16938.

CORREÇÕES EM RELAÇÃO AOS DADOS DA ABERTURA

Os IPs e hostnames informados para HMP, PILOTO e PRD não eram dos servidores da aplicação:

nslookup hmp.sicia.proinfo.caixa -> sp.frontend.proinfo.caixa (10.116.114.124) - frontend compartilhado SP
nslookup scthmdadlx0002.df.caixa -> 10.116.125.12 - servidor de banco do HMP
nslookup piloto.sicia.caixa -> 10.123.6.86 - VIP (IPAM: rede VIP_INTRA_EXTER, WO0000038491059)
nslookup sicia.caixa -> ctc.frontend.proinfo.caixa (10.123.6.10) - frontend compartilhado CTC

Tentativas de acesso direto a partir do jump server cadsvitrlx100:
ssh 10.116.114.124 -> Permission denied (publickey,password)
ssh 10.123.6.86 -> Connection refused (porta 22)
ssh 10.123.6.10 -> Connection refused (porta 22)
