# ver se teve update recente de pacotes/agente por volta de 14:xx hoje
ls -lat /opt/ferramentas/agent-tfs/agent-mobile-linux-proxy-novo/ | head -20

# procurar o binário do firebase mais a fundo, incluindo locais ocultos e do usuário do agente
sudo find / -iname "*firebase*" -not -path "*/.git/*" 2>/dev/null | grep -v "\.git"

# ver se roda via npx (instala on-the-fly a cada job, sem deixar binário fixo)
grep -r "firebase" /opt/ferramentas/agent-tfs/agent-mobile-linux-proxy-novo/work_ads/*/s/*.sh 2>/dev/null | head -5
find /opt/ferramentas/agent-tfs -maxdepth 3 -iname "*.yml" -o -iname "azure-pipelines*" 2>/dev/null

# checar logs do sistema por volta de 14:38 de hoje (mudança no agente)
sudo journalctl --since "today 14:00" --until "today 15:00" 2>/dev/null | grep -i -E "npm|firebase|update|install" | head -30
