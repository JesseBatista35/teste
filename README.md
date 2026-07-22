# Verifica se sobrou processo agj travado de tentativa anterior
ps -ef | grep -i agj

# Verifica processos do ctmagelx em geral
ps -ef | grep ctmagelx

# Verifica se tem lock/pid file órfão
find /opt/ctmage -iname "*.pid" -o -iname "*lock*" 2>/dev/null | xargs ls -la

# Espaço em disco (Java travando por disco cheio é clássico)
df -h /opt/ctmage

# Testa start manual direto como ctmagelx pra comparar
su - ctmagelx -c "/opt/ctmage/ctm/scripts/rc.agent_user start" 
