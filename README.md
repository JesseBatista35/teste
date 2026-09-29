Análise de impacto – Migração do label ubuntu-latest para Ubuntu 26.04 (GitHub Actions)

Conforme comunicado do GitHub, o label ubuntu-latest passará da imagem Ubuntu 24.04 para a 26.04. O rollout será gradual, de 19/10/2026 a 19/11/2026. A análise foi feita nas orgs caixagithub e caixadepartamental. O documento completo segue em anexo.

Resultado:

caixadepartamental: sem impacto. Nenhum workflow utiliza ubuntu-latest.
caixagithub: impacto concentrado em 7 workflows centrais (DevSecOps-Solutions e DevSecOps-Actions) que ainda usam runner hospedado pelo GitHub. Todos os repositórios que os chamam herdam o impacto. A esteira padrão (generic-pipelines.yaml e generic-pipelines-departamental.yaml) roda em runner próprio (ARC/self-hosted) e não é afetada.

Workflows centrais impactados:

gsc-integration-generic-pipeline.yaml: job VALIDATION, portão de deploy de 20+ repositórios (criticidade alta)
java-libs-pipelines.yaml: build e publicação de libs Java (criticidade alta)
generic-s3-pipelines.yaml: deploy de front para S3 (criticidade alta)
akv.yml: leitura de segredos do Key Vault (criticidade alta)
buildGradle.yml / mobile/android/buildGradle.yml: build Gradle/Android (criticidade média a alta)
codeql-pipelines.yaml: CodeQL das linguagens que não são Java (criticidade média)
dockerfile-validation-pipelines.yaml: validação de Dockerfile (criticidade média)

Principais riscos da nova imagem:

Java default passa de 17 para 25, o que afeta jobs sem setup-java
Java 8 removido da imagem
Helm 3 → 4
Docker 28 → 29
Python do sistema 3.12 → 3.14

Também foram identificados repositórios de aplicação com ubuntu-latest próprio que precisam de ajuste pontual, detalhados no documento. Os principais são jobs de CodeQL/Java sem setup-java e os templates do DevHub e do cookiecutter de automação.

Ações recomendadas:

Até 10/10: testar os workflows centrais com ubuntu-26.04 nos repositórios New-Flow-Test.
Até 16/10: fixar o label explícito nos centrais, via Fusionx: ubuntu-26.04 no que for validado e ubuntu-24.04 (suportado por mais 2 anos) no restante.
Até 16/10: ajustar os templates (DevHub skeleton e cookiecutter) e comunicar os donos dos repositórios de aplicação listados.
De 19/10 a 19/11: monitorar as falhas durante o rollout. Em caso de quebra, reverter o job afetado para ubuntu-24.04.

Pendências: contagem exata de consumidores de alguns workflows centrais e confirmação do uso de setup-python/setup-java nos jobs VALIDATION e Build_Deploy_Package.
