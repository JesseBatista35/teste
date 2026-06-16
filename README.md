# Para JBoss (se tiver rodando)
systemctl stop jboss-eap 2>/dev/null || true

# Remove arquivo .failed
rm -f /opt/jboss-eap/standalone/deployments/postgresql.jar.failed

# Remove postgresql.jar também pra deixar limpo
rm -f /opt/jboss-eap/standalone/deployments/postgresql.jar

# Limpa pasta deployments de coisas problemáticas
rm -f /opt/jboss-eap/standalone/deployments/*.failed

# Inicia JBoss
systemctl start jboss-eap

# Aguarda iniciar
sleep 30

# Verifica status
systemctl status jboss-eap

# Vê os logs
echo "=== ÚLTIMOS 50 LINHAS DO LOG ==="
tail -50 /opt/jboss-eap/standalone/log/server.log
