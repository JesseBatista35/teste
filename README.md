cd ~/verificacao_sicmu
unzip -p SICMU-web.war paginas/operacaoHabitacional/*.xhtml 2>/dev/null | grep -i "vendor.js"


unzip -l SICMU-web.war | grep -iE "template|layout|master"


