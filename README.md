1. Na 471: nome dos datasources (corrigi o awk; no domain.xml o elemento é <datasource, sem hífen)
for n in 969 1000 1031 1047 1060 1094; do awk -v n=$n 'NR<=n && /<(xa-)?datasource / {d=$0} NR==n {print n": "d; exit}' /opt/jboss/jboss-eap/dc/configuration/domain.xml; done
2. No 6.4 (10.116.88.20): para onde esses bancos apontam lá
sudo grep -n -iE '10\.116\.92\.132:4407|10\.192\.230\.120|FBNEM1|FBNDEM' /opt/jboss/jboss-eap/dc/configuration/domain.xml | grep -i 'connection-url'
3. Na 472: o outro HC do sifec-intranet tem o mesmo bloqueio?
for d in 10.116.92.132:4407 10.192.230.120:4101; do h=${d%:*}; p=${d#*:}; if timeout 5 bash -c "</dev/tcp/$h/$p" 2>/dev/null; then echo "OK      $d"; else echo "FALHOU  $d"; fi; done

Com isso fechamos o caminho:

Se o 6.4 usa outro host/porta para esses bancos: a gente corrige a connection-url no 7.4, sem precisar de firewall.
Se o 6.4 usa o mesmo destino: pedimos regra de firewall de 10.116.97.79 (473) e 10.116.97.78 (472) para os destinos que falharam. Eu monto o texto da solicitação.
