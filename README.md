# jobs em execução no agente
ps -ef | grep -E "ctmagelx|executa-job" | grep -v grep

# logs do agente em tempo real (Ctrl+C para sair — aqui pode)
ls -lrt /opt/ctmage/ctm/proclog/ | tail -5
tail -f /opt/ctmage/ctm/proclog/$(ls -t /opt/ctmage/ctm/proclog/ | head -1)
