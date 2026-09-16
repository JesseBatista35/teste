
-sh-4.2$
-sh-4.2$
-sh-4.2$ find / -maxdepth 4 -iname "*entrypoint*" -o -iname "*start*.sh" 2>/dev/null
^C
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ cat /usr/src/app/entrypoint.sh 2>/dev/null
-sh-4.2$ ls -la /usr/src/app/
ls: não é possível acessar /usr/src/app/: Arquivo ou diretório não encontrado
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ pwd
/home/p585600
-sh-4.2$ hostname
cadsvaprlx067.intra.caixa.gov.br
-sh-4.2$ ls -la
total 1078020
drwx------   12 p585600 usucef      4096 Set 11 15:34 .
drwxr-xr-x. 143 root    root        4096 Set 11 15:16 ..
-rw-r--r--    1 p585600 usucef         0 Jun 15 15:25 Accept:
-rw-r--r--    1 p585600 usucef      2778 Jul 28 09:31 agendamento-sisou-script.sh
-rw-r--r--    1 p585600 usucef      3032 Ago  4 10:35 agendamento-sisou-script-v4.sh
-rw-r--r--    1 p585600 usucef     21598 Fev 23  2026 auditoria-dc.yaml
-rw-r--r--    1 p585600 usucef      1916 Fev  6  2026 backup-rota-siric-adm-frontend-des.yaml
drwxr-xr-x    2 p585600 usucef       112 Jul 28 09:30 backups-sisou
-rw-------    1 p585600 usucef     53240 Set 16 16:52 .bash_history
-rw-------    1 p585600 usucef        18 Fev  4  2026 .bash_logout
-rw-------    1 p585600 usucef       193 Fev  4  2026 .bash_profile
-rw-------    1 p585600 usucef       231 Fev  4  2026 .bashrc
-rw-r--r--    1 p585600 usucef     39055 Set  8 11:23 caixa-truststore-acteste-nprd.jks
-rw-r--r--    1 p585600 usucef     46702 Jul 10 15:58 cm-jboss-tqs.yaml
-rw-r--r--    1 p585600 usucef     34266 Fev  9  2026 configmap-modified.yaml
-rw-r--r--    1 p585600 usucef     33603 Fev  9  2026 configmap-original.yaml
-rw-r--r--    1 p585600 usucef         0 Jun 15 15:25 Content-Length:
-rw-r--r--    1 p585600 usucef         0 Jun 15 15:25 Content-Type:
-rwxr-xr-x    1 p585600 usucef      1828 Fev  9  2026 corrigir-configmap.sh
-rw-r--r--    1 p585600 usucef         0 Jun 15 15:51 -d
-rw-r--r--    1 p585600 usucef     26157 Fev 23  2026 dc-contratacao-backend-des.before.yaml
-rw-r--r--    1 p585600 usucef     10508 Mai 13 21:08 dc-frontend.yaml
-rw-r--r--    1 p585600 usucef       533 Set 11 15:27 debug-tcpdump-007.yaml
-rw-r--r--    1 p585600 usucef       533 Set 11 15:27 debug-tcpdump-008.yaml
-rw-r--r--    1 p585600 usucef       533 Set 11 15:27 debug-tcpdump-009.yaml
-rw-r--r--    1 p585600 usucef       533 Set 11 15:27 debug-tcpdump-010.yaml
-rw-r--r--    1 p585600 usucef       856 Ago  4 10:44 debug-token.sh
-rw-r--r--    1 p585600 usucef       901 Fev 20  2026 env-108.txt
-rw-r--r--    1 p585600 usucef       980 Fev 20  2026 env-109.txt
-rw-r--r--    1 p585600 usucef         0 Fev 27  2026 GET
-rw-r--r--    1 p585600 usucef         0 Jun 15 15:51 -H
-rw-r--r--    1 p585600 usucef         0 Jun 15 15:25 Host:
drwxr-xr-x    2 p585600 usucef       116 Mar 27 17:34 jesse
-rw-r--r--    1 p585600 usucef     52076 Set  8 11:24 jks-b64.txt
-rw-r--r--    1 p585600 usucef      2228 Ago  4 10:44 job-debug-token.json
-rw-r--r--    1 p585600 usucef      4588 Ago  4 10:38 job-teste-v4.json
-rw-------    1 p585600 usucef       172 Fev  4  2026 .kshrc
drwxr-xr-x    4 p585600 usucef        51 Fev  4  2026 .kube
-rw-r--r--    1 p585600 usucef      6530 Ago  4 10:29 login-des-caixa-chain.pem
drwxr-xr-x    2 p585600 usucef         6 Mar 13  2026 main
-rwxr-xr-x    1 p585600 usucef      1647 Fev  9  2026 modificar-configmap.sh
drwxr-xr-x    2 p585600 usucef         6 Jul 17 15:17 modulos-jboss-as
drwx------    4 p585600 usucef        39 Fev  4  2026 .mozilla
drwxr-xr-x    2 p585600 usucef        40 Mar 10  2026 .oracle_jre_usage
-rw-r--r--    1 p585600 usucef       472 Ago  4 10:35 patch-add-ca-volume.json
-rw-r--r--    1 p585600 usucef      1047 Jul 23 20:48 patch-agendamento-sisou.json
-rw-r--r--    1 p585600 usucef      3212 Jul 28 09:33 patch-agendamento-sisou-v3.json
-rw-r--r--    1 p585600 usucef      3370 Ago  4 10:36 patch-agendamento-sisou-v4.json
-rw-r--r--    1 p585600 usucef         0 Fev 25  2026 permissionProvider
drwxr-----    3 p585600 usucef        19 Fev  9  2026 .pki
-rw-r--r--    1 p585600 usucef         0 Ago 11 09:14 pode
-rw-r--r--    1 p585600 usucef         0 Jun 15 15:25 POST
-rw-r--r--    1 p585600 usucef     41823 Fev 20  2026 rc-108.yaml
-rw-r--r--    1 p585600 usucef     43329 Fev 20  2026 rc-109.yaml
-rw-r--r--    1 p585600 usucef         0 Fev 25  2026 restConfig
-rw-r--r--    1 p585600 usucef        24 Set 10 11:46 sigda-test-007.pcap
-rw-r--r--    1 p585600 usucef        24 Set 10 11:47 sigda-test-008.pcap
-rw-r--r--    1 p585600 usucef        24 Set 10 11:45 sigda-test-009.pcap
-rw-r--r--    1 p585600 usucef        24 Set 10 11:48 sigda-test-010.pcap
-rw-r--r--    1 p585600 usucef 117353387 Set 10 12:00 sigda-test2-007.pcap
-rw-r--r--    1 p585600 usucef 105193045 Set 10 12:01 sigda-test2-008.pcap
-rw-r--r--    1 p585600 usucef 120997767 Set 10 12:00 sigda-test2-009.pcap
-rw-r--r--    1 p585600 usucef  93676924 Set 10 12:01 sigda-test2-010.pcap
-rw-r--r--    1 p585600 usucef 163840000 Set 11 15:34 sigda-test3-007.pcap
-rw-r--r--    1 p585600 usucef 163587262 Set 11 15:33 sigda-test3-008.pcap
-rw-r--r--    1 p585600 usucef 171540868 Set 11 15:33 sigda-test3-009.pcap
-rw-r--r--    1 p585600 usucef 167034759 Set 11 15:33 sigda-test3-010.pcap
-rw-r--r--    1 p585600 usucef     11971 Set  9 20:57 sihdg-jboss8-des-dc.yaml
-rw-r--r--    1 p585600 usucef         0 Jun 12 10:01 {"spec":{"hard":{"limits.cpu":"10"}}}
drwx------    2 p585600 usucef        25 Mar  9  2026 .ssh
-rw-r--r--    1 p585600 usucef     31016 Fev  9  2026 standalone-okd-original.xml
-rw-r--r--    1 p585600 usucef     30153 Jul 17 15:09 standalone-okd.xml
-rw-r--r--    1 p585600 usucef         0 Jun 15 15:25 User-Agent:
drwxr-xr-x    2 p585600 usucef         6 Jul 17 15:17 verificacao
-rw-------    1 p585600 usucef      4701 Set 10 16:07 .viminfo
-sh-4.2$ oc get dc sicfd-monitoramento-des -n sicfd-des -o jsonpath='{.spec.template.spec.containers[*].name}{"\n"}'
sicfd-monitoramento-des
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc debug dc/sicfd-monitoramento-des -n sicfd-des -c sicfd-monitoramento-des
Debugging with pod/sicfd-monitoramento-des-debug, original command: <image entrypoint>
Waiting for pod to start ...

