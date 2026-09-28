

Last failed login: Mon Sep 28 12:38:34 -03 2026 from 10.211.14.73 on ssh:notty
There were 2 failed login attempts since the last successful login.
Last login: Mon Sep 28 10:57:51 2026 from 10.211.14.73
[p585600@cadsvitrlx100 ~]$ ssh 10.116.201.173
The authenticity of host '10.116.201.173 (10.116.201.173)' can't be established.
ED25519 key fingerprint is SHA256:nUeIvBFrSC3NFPoCobdHkzyxYxUxjc77QZklc6lFtc0.
This host key is known by the following other names/addresses:
    ~/.ssh/known_hosts:59: 10.116.201.113
Are you sure you want to continue connecting (yes/no/[fingerprint])? yes
Warning: Permanently added '10.116.201.173' (ED25519) to the list of known hosts.
p585600@10.116.201.173's password:
[p585600@caddeapllx2695 ~]$
[p585600@caddeapllx2695 ~]$
[p585600@caddeapllx2695 ~]$
[p585600@caddeapllx2695 ~]$ ps -ef | grep -E "p_ctmag|p_ctmat|p_ctmar" | grep -v grep
root     1143116       1  0 set26 ?        00:00:03 /opt/ctmage/ctm/exe/p_ctmag
root     1143182       1  0 set26 ?        00:00:04 /opt/ctmage/ctm/exe/p_ctmat
root     1143256 1143182  0 set26 ?        00:00:00 /opt/ctmage/ctm/exe/p_ctmatw -ATW_NAME ATW000
[p585600@caddeapllx2695 ~]$
[p585600@caddeapllx2695 ~]$
[p585600@caddeapllx2695 ~]$
[p585600@caddeapllx2695 ~]$ ss -lntp | grep -E "7016|7036"
LISTEN 0      128        127.0.0.1:7036       0.0.0.0:*
[p585600@caddeapllx2695 ~]$
[p585600@caddeapllx2695 ~]$
[p585600@caddeapllx2695 ~]$
[p585600@caddeapllx2695 ~]$ /opt/ctmag/ctm/scripts/start-ag -u ctmagelx -p ALL
-sh: /opt/ctmag/ctm/scripts/start-ag: Arquivo ou diretório inexistente
[p585600@caddeapllx2695 ~]$
[p585600@caddeapllx2695 ~]$
[p585600@caddeapllx2695 ~]$ hostname -I
getent hosts caddeapllx2695.agil.nprd.caixa.gov.br
nslookup caddeapllx2695.agil.nprd.caixa.gov.br
getent hosts crjdeaprlx038 crjdeaprlx039
10.116.201.173 192.168.242.175
fe80::250:56ff:fe82:dc7a caddeapllx2695.agil.nprd.caixa.gov.br
fe80::250:56ff:fe82:312d caddeapllx2695.agil.nprd.caixa.gov.br
Server:         10.116.193.77
Address:        10.116.193.77#53

Name:   caddeapllx2695.agil.nprd.caixa.gov.br
Address: 10.116.201.173

[p585600@caddeapllx2695 ~]$
[p585600@caddeapllx2695 ~]$
[p585600@caddeapllx2695 ~]$ timeout 5 bash -c "</dev/tcp/crjdeaprlx038/7015" && echo OK || echo FALHA
timeout 5 bash -c "</dev/tcp/crjdeaprlx039/7015" && echo OK || echo FALHA
bash: linha 1: crjdeaprlx038: Nome ou serviço desconhecido
bash: linha 1: /dev/tcp/crjdeaprlx038/7015: Argumento inválido
FALHA
bash: linha 1: crjdeaprlx039: Nome ou serviço desconhecido
bash: linha 1: /dev/tcp/crjdeaprlx039/7015: Argumento inválido
FALHA
[p585600@caddeapllx2695 ~]$
[p585600@caddeapllx2695 ~]$
[p585600@caddeapllx2695 ~]$
[p585600@caddeapllx2695 ~]$ firewall-cmd --list-ports ; systemctl is-active firewalld
FirewallD is not running
inactive
[p585600@caddeapllx2695 ~]$
[p585600@caddeapllx2695 ~]$
[p585600@caddeapllx2695 ~]$ ag_ping
ag_diag_comm
-sh: ag_ping: comando não encontrado
-sh: ag_diag_comm: comando não encontrado
[p585600@caddeapllx2695 ~]$
[p585600@caddeapllx2695 ~]$
[p585600@caddeapllx2695 ~]$
[p585600@caddeapllx2695 ~]$ cat /producao/env_config.sh
#!/usr/bin/env bash
################ Configuração de variáveis de ambiente ################
while IFS='=' read -r var value; do
  export "$var=$value"
done < <(
 jq -r '.[] | "\(.Description)=\(.Password)"' <<< "$(echo "$VARIAVEL_DO_SISTEMA" | base64 -d | jq -r)"
)

################ Verifica se as variáveis esperadas foram registradas ################
VARS_ESPERADAS=("DB_PASS" "NSGD_KEY" "TOKEN_KEY" "SIIFX_DATAGRID_PASS")
NAO_REGISTRADAS=()

for VAR in "${VARS_ESPERADAS[@]}"; do
  if [ -n "${!VAR}" ]; then
    echo "Variável registrada: ${VAR}"
  else
    NAO_REGISTRADAS+=("${VAR}")
  fi
done

if [ ${#NAO_REGISTRADAS[@]} -gt 0 ]; then
  echo "Variáveis não registradas: ${NAO_REGISTRADAS[*]}"
  exit 1
fi
[p585600@caddeapllx2695 ~]$
[p585600@caddeapllx2695 ~]$
[p585600@caddeapllx2695 ~]$ ls -laR /producao/configuration
/producao/configuration:
total 4
drwxr-xr-x  3 ctmagelx controlm  34 set 26 11:28 .
drwxr-xr-x. 5 ctmagelx controlm 115 set 26 11:28 ..
-rwxr-xr-x  1 ctmagelx controlm  61 set 26 11:28 custom.sh
drwxr-xr-x  2 ctmagelx controlm  25 jun 25 16:16 des

/producao/configuration/des:
total 4
drwxr-xr-x 2 ctmagelx controlm   25 jun 25 16:16 .
drwxr-xr-x 3 ctmagelx controlm   34 set 26 11:28 ..
-rwxr-xr-x 1 ctmagelx controlm 2848 jun 25 16:16 tnsnames.sh
[p585600@caddeapllx2695 ~]$
