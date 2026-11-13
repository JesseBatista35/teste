

===== MONTAGENS ATUAIS =====
sunrpc on /var/lib/nfs/rpc_pipefs type rpc_pipefs (rw,relatime)
[p585600@caddeapllx2876 ~]$
[p585600@caddeapllx2876 ~]$ JAR=$(ls -t /opt/batch/deploy/*.jar 2>/dev/null | head -1); echo "JAR: $JAR"
JAR: /opt/batch/deploy/siifx-caixinhas-batch.jar
[p585600@caddeapllx2876 ~]$
[p585600@caddeapllx2876 ~]$
[p585600@caddeapllx2876 ~]$ unzip -l "$JAR" | grep -E "application.*\.ya?ml"
      859  11-13-2026 12:11   BOOT-INF/classes/application-des.yml
      428  11-13-2026 12:11   BOOT-INF/classes/application-hmp.yml
      429  11-13-2026 12:11   BOOT-INF/classes/application-tgs.yml
     3360  11-13-2026 12:11   BOOT-INF/classes/application.yml
[p585600@caddeapllx2876 ~]$
[p585600@caddeapllx2876 ~]$
[p585600@caddeapllx2876 ~]$ for f in $(unzip -l "$JAR" | grep -oE "BOOT-INF/classes/application[^ ]*\.ya?ml"); do
  echo "===== $f"
  unzip -p "$JAR" "$f" | grep -inE "profile|datagrid|infinispan|11222|host"
done
===== BOOT-INF/classes/application-des.yml
===== BOOT-INF/classes/application-hmp.yml
===== BOOT-INF/classes/application-tgs.yml
===== BOOT-INF/classes/application.yml
79:        base-url: ${HOST_API_MNG:}
101:      ambiente: ${BATCH_PROFILE:des}
108:          address: ${PUSHGATEWAY_URL:localhost:9091}
114:            host: ${HOSTNAME:NA}
[p585600@caddeapllx2876 ~]$
[p585600@caddeapllx2876 ~]$
[p585600@caddeapllx2876 ~]$
[p585600@caddeapllx2876 ~]$ sudo grep -rIl -E "BATCH_PROFILE|SIIFX_DATAGRID" /opt/batch /producao /etc/profile.d 2>/dev/null

Presumimos que você recebeu as instruções de sempre do administrador
de sistema local. Basicamente, resume-se a estas três coisas:

    #1) Respeite a privacidade dos outros.
    #2) Pense antes de digitar.
    #3) Com grandes poderes vêm grandes responsabilidades.

[sudo] senha para p585600:
Sinto muito, tente novamente.
[sudo] senha para p585600:
Sinto muito, tente novamente.
[sudo] senha para p585600:
[p585600@caddeapllx2876 ~]$ timeout 5 bash -c '</dev/tcp/caddeapllx2221.agil.nprd.caixa.gov.br/11222' && echo "DATAGRID OK" || echo "DATAGRID FALHOU"
DATAGRID OK
[p585600@caddeapllx2876 ~]$
