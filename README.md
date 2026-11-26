ORIGEM:
10.116.223.11
 
DESTINO:
cnpexdadvm01-scan4.extra.caixa.gov.br port=1521
sicns.caixa porta 443
 
 
 
 
 
 
REQ000147185286
	Por favor, verificar e ajustar
 
Repositório: SISPI-api-tarifacao
 
Erro  para gerar pipeline (Build)
 
Erro no passo: Login Cluster
 
Link da pipeline (Build)
https://devops.caixa/projetos/Caixa/_build/results?buildId=889716&view=logs&j=275f1d19-1bd8-5591-b06b-07d489ea915a&t=c02c59fe-b179-526b-4b13-fb4141c1ec4e
 
Impacto: migração para o GIT HUB
 
Emilio Luiz Ribeiro
 
estamos nessa sala
 
Joao, consegue dar uma força aqui, o SPX está fora em DES
 
 
 
sh-4.4$ curl -v telnet://sicsn.caixa

* Rebuilt URL to: telnet://sicsn.caixa/

*   Trying 10.221.142.2...

* TCP_NODELAY set

* Connected to sicsn.caixa (10.221.142.2) port 23 (#0)
 
sh-4.4$ curl -kv https://sicsn.caixa

* Rebuilt URL to: https://sicsn.caixa/

*   Trying 10.221.142.2...

* TCP_NODELAY set

* Connected to sicsn.caixa (10.221.142.2) port 443 (#0)

* ALPN, offering h2

* ALPN, offering http/1.1

* successfully set certificate verify locations:

*   CAfile: /etc/pki/tls/certs/ca-bundle.crt

  CApath: none

* TLSv1.3 (OUT), TLS handshake, Client hello (1):

* OpenSSL SSL_connect: SSL_ERROR_SYSCALL in connection to sicsn.caixa:443 

* Closing connection 0

curl: (35) OpenSSL SSL_connect: SSL_ERROR_SYSCALL in connection to sicsn.caixa:443 

sh-4.4$
 
2026-11-25T20:02:23.8565709Z O IP de Saída do projeto: sispx-des já estava configurado com o IP: 10.116.223.11
 
sh-4.4$ curl -v telnet://sicsn.caixa

* Rebuilt URL to: telnet://sicsn.caixa/

*   Trying 10.221.142.2...

* TCP_NODELAY set

* Connected to sicsn.caixa (10.221.142.2) port 23 (#0)

^C

sh-4.4$
 
 
 
10.116.208.0 255.255.240.0 /20
 
host range	10.116.208.1-10.116.223.254
 
 
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
connection options=[host=cnpexdadvm01-scan4.extra.caixa.gov.br port=1521 protocol=TCP service_name=CDBD08NGPDB017 addr=(ADDRESS=(PROTOCOL=TCP)(HOST=cnpexdadvm01-scan4.extra.caixa.gov.br)(PORT=1521)) conn_data=(DESCRIPTION=(ADDRESS=(PROTOCOL=TCP)(PORT=1521)(HOST=240.240.180.182)(HOSTNAME=cnpexdadvm01-scan4.extra.caixa.gov.br))(CONNECT_DATA=(CID=(PROGRAM=QuarkusEntryPoint)(HOST=sispx-pix-gestao-des-391-ld6h8)(USER=1001))(SERVICE_NAME=CDBD08NGPDB017))) done=true]
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-11-25 18:09:37,367 INFO [ora.jdbc] (agroal-21) traceId=7A5C3AB2, anoEnabled=true.
2026-11-25 18:09:37,368 FINEST [ora.jdbc] (agroal-21) 74 bytes written to the Socket.
2026-11-25 18:09:37,369 FINEST [ora.jdbc] (agroal-21) 294 bytes written to the Socket.
2026-11-25 18:09:42,350 INFO [ora.jdbc] (agroal-21) Connection establishment interrupted externally, exiting.
2026-11-25 18:09:42,351 INFO [ora.jdbc] (agroal-21) throwing: java.sql.SQLRecoverableException: ORA-17002: I/O error: Socket read interrupted, Authentication lapse 0 ms.
 
só reforçando, rodei um rotina aqui agora do spx e se conectou com o banco normalmente, então não é o banco  
 
Ontem 19:05 Reunião encerrada: 4h 17min 12s 

 
Alguma resposta?
 
Tentei aqui e continua com erro
 
Continua com o mesmo problema
 
bom dia pessoal. precisamos do ambiente funcionando hoje.
 
se puderem nos ajudar
 
09:01 Reunião encerrada: 4s 

 
Daniel Correa Paula.

2026-11-26T11:49:49.4283603Z ##[section]Starting: Verificando Status do Deployment
2026-11-26T11:49:49.4286756Z ==============================================================================
2026-11-26T11:49:49.4286834Z Task         : Bash
2026-11-26T11:49:49.4286876Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-11-26T11:49:49.4286949Z Version      : 3.227.0
2026-11-26T11:49:49.4286992Z Author       : Microsoft Corporation
2026-11-26T11:49:49.4287041Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-11-26T11:49:49.4287121Z ==============================================================================
2026-11-26T11:49:50.5517340Z Generating script.
2026-11-26T11:49:50.5554595Z ========================== Starting Command Output ===========================
2026-11-26T11:49:50.5558247Z [command]/bin/bash /opt/ads-agent/_work/_temp/20fcd7f0-a70e-44e5-bf06-3ef12e23a000.sh
2026-11-26T11:49:50.7862426Z Waiting for rollout to finish: 1 old replicas are pending termination...
2026-11-26T11:54:50.7869450Z E1126 08:54:50.786096   61987 streamwatcher.go:109] Unable to decode an event from the watch stream: net/http: request canceled (Client.Timeout exceeded while reading body)
2026-11-26T11:54:50.7870042Z error: watch closed before Until timeout
2026-11-26T11:54:50.7916111Z A aplicação não foi iniciada com sucesso!
2026-11-26T11:54:50.7917808Z Os logs da aplicação estão disponíveis na próxima task: Logs da Aplicação
2026-11-26T11:54:50.7940796Z ##[error]Bash exited with code '1'.
2026-11-26T11:54:50.7969192Z ##[section]Finishing: Verificando Status do Deployment




2026-11-26T11:54:50.7992017Z ##[section]Starting: Logs da Aplicação
2026-11-26T11:54:50.7995187Z ==============================================================================
2026-11-26T11:54:50.7995324Z Task         : Bash
2026-11-26T11:54:50.7995366Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-11-26T11:54:50.7995439Z Version      : 3.227.0
2026-11-26T11:54:50.7995481Z Author       : Microsoft Corporation
2026-11-26T11:54:50.7995530Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-11-26T11:54:50.7995610Z ==============================================================================
2026-11-26T11:54:51.6663004Z Generating script.
2026-11-26T11:54:51.6673833Z ========================== Starting Command Output ===========================
2026-11-26T11:54:51.6680329Z [command]/bin/bash /opt/ads-agent/_work/_temp/de6f944b-ddf4-49aa-b3f5-5e2c925e0801.sh
2026-11-26T11:54:51.6728336Z + shopt -s expand_aliases
2026-11-26T11:54:51.6728494Z + [[ -n ocp_nprd ]]
2026-11-26T11:54:51.6728660Z + [[ ocp_nprd =~ ocp ]]
2026-11-26T11:54:51.6729816Z + app=sispx-pix-gestao-des
2026-11-26T11:54:51.6729981Z + arquivo=/usr/local/bin/oc-v4.13
2026-11-26T11:54:51.6731174Z + '[' -e /usr/local/bin/oc-v4.13 ']'
2026-11-26T11:54:51.6731942Z + alias oc=/usr/local/bin/oc-v4.13
2026-11-26T11:54:51.6732160Z + /usr/local/bin/oc-v4.13 version
2026-11-26T11:54:51.7784294Z Client Version: 4.13.0-202307282024.p0.ge251b5e.assembly.stream-e251b5e
2026-11-26T11:54:51.7784508Z Kustomize Version: v4.5.7
2026-11-26T11:54:51.7784625Z Server Version: 4.15.59
2026-11-26T11:54:51.7785576Z Kubernetes Version: v1.28.15+d227d65
2026-11-26T11:54:51.7819786Z ++ /usr/local/bin/oc-v4.13 get pod -l name=sispx-pix-gestao-des -n sispx-des -o 'jsonpath={range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp
2026-11-26T11:54:51.7820698Z ++ tac
2026-11-26T11:54:51.7821215Z ++ grep -v '^$'
2026-11-26T11:54:51.7821356Z ++ head -n1
2026-11-26T11:54:51.9069221Z + last_pod=sispx-pix-gestao-des-410-dtnfj
2026-11-26T11:54:51.9069502Z + echo 'Logs do POD: sispx-pix-gestao-des-410-dtnfj'
2026-11-26T11:54:51.9070050Z + /usr/local/bin/oc-v4.13 logs sispx-pix-gestao-des-410-dtnfj -c sispx-pix-gestao-des -n sispx-des
2026-11-26T11:54:51.9070263Z Logs do POD: sispx-pix-gestao-des-410-dtnfj
2026-11-26T11:54:52.0579039Z Error from server (BadRequest): container "sispx-pix-gestao-des" in pod "sispx-pix-gestao-des-410-dtnfj" is waiting to start: PodInitializing
2026-11-26T11:54:52.0638674Z ##[error]Bash exited with code '1'.
2026-11-26T11:54:52.0674880Z ##[section]Finishing: Logs da Aplicação





 
