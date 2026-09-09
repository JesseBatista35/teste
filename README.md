# 1. Corrigir ulimit do usuário jboss (root causa)
echo -e 'jboss soft nproc 16384\njboss hard nproc 16384' > /etc/security/limits.d/30-jboss-nproc.conf

# 2. Garantir que não há processo órfão
ps -ef | grep -i "java -D" | awk '{print $2}' | xargs -r kill -9

# 3. Limpar data/tmp/servers do HC (procedimento padrão do manual)
cd /opt/jboss/jboss-eap/hc/ && rm -rf data tmp
cd /opt/jboss/jboss-eap/hc/servers && rm -rf s*
cd /opt/jboss/jboss-eap/hc/log/servers/ && rm -rf s*

# 4. Subir o Host Controller
systemctl start jboss-eap7_hc

# 5. Validar (espera uns 60-90s antes de rodar)
sleep 90
ps -ef | grep jboss
systemctl status jboss-eap7_hc
