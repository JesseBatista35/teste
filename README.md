Segue o checklist de comandos pra guardar, pra usar em qualquer servidor JBoss quando surgir suspeita de "versão errada aparecendo":

Localizar o artefato deployado e confirmar timestamp

ls -la /opt/jboss-eap/standalone/deployments/

Extrair o conteúdo do .ear pra pasta temporária

cd /tmp
mkdir checkver_$$ && cd checkver_$$
unzip -o /opt/jboss-eap/standalone/deployments/NOME-DO-EAR.ear -d ear_extracted

Filtrar direto os módulos com versão no nome (war/jar principais)

unzip -l ear_extracted/../NOME-DO-EAR.ear 2>/dev/null
find ear_extracted -maxdepth 2 -iname ".war" -o -iname ".jar" | grep -iE "NOME-DA-APP"
ou, se já rodou o unzip no passo 2, direto:
ls ear_extracted | grep -iE ".war|.jar"

Alternativa combinando extração e filtro em um comando só (mais rápido)

rm -rf ear_extracted
unzip -o /opt/jboss-eap/standalone/deployments/NOME-DO-EAR.ear -d ear_extracted | grep -E ".war|.jar" | grep -iE "NOME-DA-APP"

Se não tiver unzip disponível, checar alternativas

which unzip
which jar
which python3

Limpeza depois de confirmar

cd /tmp
rm -rf checkver_$$
Ponto-chave do diagnóstico: comparar o timestamp do arquivo .ear (passo 1) com o horário de execução da release no Azure DevOps, e comparar o sufixo de versão nos nomes dos módulos (passo 3/4) com a versão que a release deveria ter publicado. Se bater os dois, o problema não é infra — é ordem/branch de release.
