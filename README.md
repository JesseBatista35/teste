Durante a etapa "Configurando Stack de Monitoração" da esteira esteira-jboss-vm, a consulta à base PostgreSQL falha na autenticação.

Origem: cadsvaprlx072 (10.122.155.67), agente Azure DevOps
Destino: 10.244.74.86:5432 / database monitordb001 / usuário monitdbadm

Validações realizadas:

Conectividade OK (nc/telnet na porta 5432).
Teste direto do agente com a senha configurada na esteira (conexão com SSL): FATAL: password authentication failed for user "monitdbadm".

A conexão com SSL é aceita pelo pg_hba.conf e rejeitada na senha. A mensagem "no pg_hba.conf entry ... no encryption" do log é apenas o fallback do cliente sem SSL, e não é a causa.

Solicitação: verificar se a senha do usuário monitdbadm foi alterada ou expirou (VALID UNTIL) e informar a credencial vigente, para atualização na esteira.
