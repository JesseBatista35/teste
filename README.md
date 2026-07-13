Prezado(a),

Em relação à orientação de ajuste de connection-url pós-migração do banco, encontrei um cenário específico no SIOUV (JBoss 6.4, ambiente DES) que preciso alinhar antes de aplicar o procedimento padrão.

Contexto técnico:

- Confirmei que o erro apresentado é exatamente o esperado pela migração: "Listener refused the connection" ao tentar abrir conexão via datasource java:/jdbc/OracleSiouvDS.
- O SIOUV roda em modo DOMAIN (não standalone), no host lx0002 (grupo de servidor "siouv"), que é um host-controller SLAVE. O domain controller MASTER está em outro endereço (10.116.88.20).
- Busquei a definição do datasource OracleSiouvDS em todos os locais possíveis no host slave: domain.xml (todos os profiles só têm o ExampleDS padrão, nenhum datasource Oracle), arquivos *-ds.xml separados, e dentro do próprio deployment do WAR. Não encontrei a connection-url em nenhum arquivo de configuração acessível localmente.
- Isso indica que o datasource está definido apenas no domain controller master, ou é gerenciado via management CLI sem persistir em XML visível no slave.
- Tentei conectar ao management CLI (jboss-cli) tanto na porta 9990 quanto 9999, no slave e tentando apontar direto pro master (10.116.88.20:9990) — todas as tentativas falharam (connection refused / timeout), então não tenho visibilidade nem acesso para editar o datasource a partir dessa sessão.

Ou seja: o ajuste da connection-url do OracleSiouvDS não pode ser feito por mim nesse host — precisa ser feito por quem tem acesso de management ao domain controller master, ou o datasource é provisionado via pipeline (Variable Group / Secure File no Azure DevOps), e nesse caso o ajuste seria lá, não direto no servidor.

Você tem visibilidade de como esse datasource específico do SIOUV é provisionado (master ou pipeline)? Isso ajudaria a direcionar corretamente o ajuste e evitar demora adicional, já que o chamado foi reaberto pelo demandante com urgência.
