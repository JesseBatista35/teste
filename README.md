Prezados,

Identificamos falha de autenticação bloqueando builds em ambiente DES, com causa raiz já isolada até o secret organizacional específico. Solicito verificação e correção da credencial.

Repositório afetado: siaci-api-integracao-padrao-java
Execução: run 31044766822, job BUILD (CI_DES)
Link: https://github.com/caixagithub/siaci-api-integracao-padrao-java/actions/runs/31044766822/job/92437744197

Descrição do erro:
O build falha na etapa de compilação Maven (mvnw clean package -DskipTests, dentro do Dockerfile) ao resolver dependências publicadas no GitHub Packages do repositório siaci-lib-integracao-core-java. O Maven retorna 401 Unauthorized ao acessar https://maven.pkg.github.com/caixagithub/siaci-lib-integracao-core-java para os artefatos:

com.unisys.br.jrac:jrac:pom:17.0
br.gov.caixa.siaci:lib-integracao-core-java-comunicacao:pom:0.0.1
br.gov.caixa.siaci:lib-integracao-core-java-resolver:pom:0.0.1
br.gov.caixa.siaci:lib-integracao-core-java-autorizacao:pom:0.0.1

Causa raiz identificada (rastreamento completo da esteira):

Confirmado que o repositório siaci-lib-integracao-core-java é privado, os pacotes estão publicados e ativos (versão 0.0.1, há 2 dias) - problema não está na publicação.
Rastreada a cadeia de workflows reutilizáveis: siaci-api-integracao-padrao-java (secrets: inherit) → DevSecOps-Solutions/generic-pipelines.yaml (secrets: inherit) → DevSecOps-Workflow-Jobs/default-container-build-job.yaml.
Neste último arquivo, no step "Docker Container Build" (uses: caixagithub/DevSecOps-Actions/.github/chaintools/dockercontainer/build@main), a credencial usada para autenticação Maven/GitHub Packages é passada explicitamente como:
github_token_org: ${{ secrets.TOKEN_GITHUB_ORG }}
O secret organizacional TOKEN_GITHUB_ORG foi atualizado há aproximadamente 1 mês, o que coincide com o início das falhas de build.

Solicitação:
Favor verificar se o token armazenado em TOKEN_GITHUB_ORG (secret de organização) está válido, não expirado, e possui permissão de leitura (read:packages) sobre o repositório siaci-lib-integracao-core-java. Caso tenha sido rotacionado recentemente, favor confirmar se o novo valor foi gerado com o escopo/permissão correta antes de substituir o secret.

Este bloqueio está impedindo builds em DES do sistema SIACI e depende de correção na credencial organizacional, fora do escopo de configuração deste time de esteira.

Fico à disposição para mais informações ou testes adicionais.

Atenciosamente,
Jessé Batista
Analista de Esteiras - CTIS/CESTI
