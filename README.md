WAR=/opt/jboss-eap/standalone/deployments/simkt.war

# Localizar o CSV dentro do war
unzip -l $WAR | grep -i csv

# Ver o conteúdo (ajuste o caminho se o comando acima mostrar outro)
unzip -p $WAR WEB-INF/classes/mpas.csv | cat -A | tail -20

# Linhas novas do relatório
unzip -p $WAR WEB-INF/classes/mpas.csv | grep -n -i relatorio

# Linhas com quantidade de colunas diferente (troque ';' pelo separador real)
unzip -p $WAR WEB-INF/classes/mpas.csv | awk -F';' '{print NF}' | sort | uniq -c
