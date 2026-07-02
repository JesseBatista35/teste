cd ~/verificacao_sicmu
unzip -p SICMU-ear.ear SICMU-web.war > SICMU-web.war
unzip -l SICMU-web.war | grep -i "vendor.js"


unzip -l SICMU-web.war | grep -i "operacaoHabitacional"

