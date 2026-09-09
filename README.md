# 1. Confirmar que a cópia realmente está lá
ls -la /opt/jboss/jboss-eap/modules/system/layers/base/sun/jdk/main/

# 2. Matar TUDO (incluindo o process-controller pai, que está preso desde 19:22)
systemctl stop jboss-eap7_hc
sleep 5
ps -ef | grep jboss
# se ainda sobrar algo, mata na força:
ps -ef | grep -i "jboss-modules\|process-controller\|domain.sh" | grep -v grep | awk '{print $2}' | xargs -r kill -9

# 3. Confirmar que limpou tudo
ps -ef | grep jboss

# 4. Subir de novo, do zero
systemctl reset-failed jboss-eap7_hc
systemctl start jboss-eap7_hc
sleep 60
ps -ef | grep jboss

# 5. Ver log FRESCO (últimas linhas, não a cauda antiga)
tail -30 /logs/jboss-eap/console-stdout.log
