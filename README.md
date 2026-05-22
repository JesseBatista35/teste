Encontramos a solução! 🎯
O ModCluster está desabilitado mas é exatamente ele que registra os workers do JBoss dinamicamente no Apache. Sem ele, o balancer://sigpf-internet fica vazio e o Apache retorna 403.
O CCA funciona porque provavelmente foi configurado quando o ModCluster ainda estava ativo e os workers ficaram em memória/cache.

Solução — Habilitar o ModCluster:
bashsudo cp /opt/jbcs-httpd24-2.4/httpd/conf.d/mod_cluster.conf.disabled /opt/jbcs-httpd24-2.4/httpd/conf.d/mod_cluster.conf && \
sudo /opt/jbcs-httpd24-2.4/httpd/sbin/apachectl configtest
Se o configtest retornar Syntax OK, execute:
bashsudo /opt/jbcs-httpd24-2.4/httpd/sbin/apachectl graceful
⚠️ Atenção — antes de executar, confirme com o time se há algum motivo pelo qual o ModCluster foi desabilitado intencionalmente, pois isso pode impactar outras aplicações no mesmo Apache.Você disse: me ajuda com uma menssagem pra eu enviar para o time via teams antes te reativar eleme ajuda com uma menssagem pra eu enviar para o time via teams antes te reativar ele15:36Claude respondeu: Claro!Claro!Pessoal, boa tarde! 👋

Durante a investigação do problema no SIGPF-internet (DES), identificamos que o módulo ModCluster está desabilitado no Apache dos servidores caddeapllx135 e caddeapllx136.

O ModCluster é responsável por registrar dinamicamente os workers do JBoss no Apache. Sem ele ativo, o balancer://sigpf-internet fica sem membros registrados, fazendo o Apache retornar 403 Forbidden para todas as requisições do SIGPF-internet.

⚠️ Antes de reativar, preciso confirmar com o time:

1. O ModCluster foi desabilitado intencionalmente? Se sim, qual o motivo?
2. Existe algum impacto esperado em outras aplicações rodando nesse Apache ao reativá-lo?
3. Há janela de manutenção necessária para essa ação?

Aguardo retorno para prosseguir com a correção. Qualquer dúvida estou à disposição! 🙂Mensagem pronta! Manda para o time e aguarda o retorno antes de executar qualquer coisa. Assim você se protege caso o ModCluster tenha sido desabilitado por algum motivo específico que a gente ainda não conhece.
