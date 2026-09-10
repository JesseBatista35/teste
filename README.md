Em análise ao chamado sobre a esteira DevOps do SICCP-back, identificamos a causa da falha de leitura das variáveis DB_USER e PASS_BD.

Diagnóstico:
O pod siccp-back-des roda no OKD e depende de um ConfigMap/Secret vinculado via envFrom para receber variáveis de ambiente como DB_USER e PASS_BD. Essa fonte de variáveis é gerada a partir de um repositório do tipo config, seguindo o padrão já adotado nos demais sistemas do projeto SICCP (SICCP-frontend-config, SICCP-intra-config, SICCP-intra-batch-config). Verificamos que não existe um repositório SICCP-back-config, e por isso o pod não possui nenhuma fonte de ConfigMap/Secret associada, o que explica as variáveis chegando nulas na aplicação.

Pendência (responsabilidade do time de desenvolvimento):
Criar o repositório SICCP-back-config, replicando a estrutura de pastas utilizada nos repositórios de config já existentes (etc, httpd, jboss), incluindo as definições necessárias para expor DB_USER e PASS_BD como variáveis de ambiente do container.

Após a criação do repositório, retornar para que a esteira DevOps faça a vinculação via envFrom no deploy do SICCP-back-des.
