
[root@caddeapllx2540 sicmu-intranet-update]#
[root@caddeapllx2540 sicmu-intranet-update]#
[root@caddeapllx2540 sicmu-intranet-update]#
[root@caddeapllx2540 sicmu-intranet-update]#
[root@caddeapllx2540 sicmu-intranet-update]#
[root@caddeapllx2540 sicmu-intranet-update]#
[root@caddeapllx2540 sicmu-intranet-update]# ps -ef | grep -o 'jboss.server.base.dir=[^ ]*\|jboss.home.dir=[^ ]*' | sort -u
jboss.home.dir=[^
jboss.home.dir=/opt/jboss-eap
jboss.server.base.dir=[^
jboss.server.base.dir=/opt/jboss-eap/standalone
[root@caddeapllx2540 sicmu-intranet-update]#
[root@caddeapllx2540 sicmu-intranet-update]#
[root@caddeapllx2540 sicmu-intranet-update]# grep -n -A12 -E 'jndi-name="java:/(db2cmu|db2cdm)"' <BASE_DIR>/configuration/standalone*.xml \
>   | sed -E 's#(<password>)[^<]*#\1*****#'
bash: BASE_DIR: Arquivo ou diretório não encontrado
[root@caddeapllx2540 sicmu-intranet-update]#
[root@caddeapllx2540 sicmu-intranet-update]#
[root@caddeapllx2540 sicmu-intranet-update]#
[root@caddeapllx2540 sicmu-intranet-update]#
[root@caddeapllx2540 sicmu-intranet-update]#  <JBOSS_HOME>/bin/jboss-cli.sh -c --command="/subsystem=datasources/data-source=<NOME_DO_DS>:test-connection-in-pool"
bash: JBOSS_HOME: Arquivo ou diretório não encontrado
[root@caddeapllx2540 sicmu-intranet-update]# c
