
[p585600@caddeapllx2501 ~]$
^C
[p585600@caddeapllx2501 ~]$
[p585600@caddeapllx2501 ~]$
[p585600@caddeapllx2501 ~]$
[p585600@caddeapllx2501 ~]$ cat /producao/script_simil_rotinas.sh
#!/bin/bash

source "/producao/export_variables.sh"
#./export_variables.sh

echo 'Inicializando processamento batch do SIMIL-rotinas'

HOME_APP=/opt/batch/deploy/
#HOME_APP=/c/Foton/projetos/SIMIL-rotinas/target/
cd ${HOME_APP}

echo "Entrando no diretório" ${HOME_APP}

# Verifica se o arquivo .jar existe
JAR_FILE="simil-precificacao-rotinas-batch.jar"
if [[ ! -f "$JAR_FILE" ]]; then
  echo "Arquivo $JAR_FILE nao encontrado!"
  exit -1
fi

# Comando para executar o arquivo JAR
java --version
# Variável JOB_NAME é definida no Control-M e passada como parâmetro para o script
java -jar "$JAR_FILE" -Xms 512m -Xmx 1024m --spring.batch.job.name="$JOB_NAME"
#/c/Foton/programas/jdk-21.0.2/bin/java -jar "$JAR_FILE" -Xms 512m -Xmx 1024m --spring.batch.job.name=evolucaoObraJob,siapfJob --spring.profiles.active=dev

# Verifica se o comando foi executado com sucesso
if [ $? -ne 0 ]; then
  echo "========================================================================"
  echo "Falha na execucao do batch." >&2
  echo "========================================================================"

  exit 1
else
  echo "========================================================================"

  echo "Execucao do batch concluida com sucesso."
  echo "========================================================================"

fi

[p585600@caddeapllx2501 ~]$
[p585600@caddeapllx2501 ~]$
[p585600@caddeapllx2501 ~]$ cat /producao/script_simil.sh
#!/bin/bash
#source "/producao/export_variables.sh"

echo 'Inicializando batch da precificação'

HOME_APP=/opt/batch/deploy/
#HOME_APP=C:\ambiente\workspace\SIMIL-batch\target\
cd ${HOME_APP}

# Verifica se o arquivo .jar existe
#JAR_FILE="simil.batch.jar"
JAR_FILE-"simil-precificacao-rotinas-batch.jar"
if [[ ! -f "$JAR_FILE" ]]; then
  echo "Arquivo $JAR_FILE nao encontrado!"
  exit -1
fi

# Comando para executar o arquivo JAR
java -jar "$JAR_FILE" -Xms 512m -Xmx 1024m

# Verifica se o comando foi executado com sucesso
if [ $? -ne 0 ]; then
  echo "Falha na execucao do batch." >&2
  exit 1
else
  echo "Execucao do batch concluida com sucesso."
fi[p585600@caddeapllx2501 ~]$
[p585600@caddeapllx2501 ~]$
[p585600@caddeapllx2501 ~]$
