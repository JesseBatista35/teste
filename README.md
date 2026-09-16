oc debug dc/sicfd-monitoramento-des -n sicfd-des -c sicfd-monitoramento-des

ls -la /usr/src/app/secrets_files/SICFD_DES/
cat /usr/src/app/secrets_files/SICFD_DES/SCFDRD01_ORACLE
export SPRING_DATASOURCE_PASSWORD="$(cat /usr/src/app/secrets_files/SICFD_DES/SCFDRD01_ORACLE)"
sh /deployments/run-java.sh
