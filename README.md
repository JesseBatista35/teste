export SPRING_DATASOURCE_PASSWORD="$(cat /usr/src/app/secrets_files/SICFD_DES/SCFDRD01_ORACLE)"
sh /deployments/run-java.sh
