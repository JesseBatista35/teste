gitops/apps/siarx-backend-autoridade-registro/des
/config.yaml


app:
  name: siarx-backend-autoridade-registro-hmp
project:
  name: hmp
labels:
  appName: siarx-backend-autoridade-registro
  environment: hmp
source:
  repo: "https://github.com/caixagithub/siarx-backend-autoridade-registro-infranprd"
  path: hmp
sourcevar:
  repo: "https://github.com/caixagithub/siarx-globalnprd"
  path: hmp
  values: global.yaml  
cluster:
  destination:  
    name: aks-siarx-nprd
    namespace: siarx-backend-autoridade-registro


siarx-backend-autoridade-registro/.github/workflows
/call-generic-pipelines.yaml




    # ============================================================================= #
#             CAIXA DEVSECOPS - TEMPLATE DE WORKFLOW CI/CD v1.0                 #
# ============================================================================= #
# Este workflow é um modelo padrão para todos os desenvolvedores da Caixa.      #
# Ele automatiza processos de integração contínua (CI) e entrega contínua (CD), #
# promovendo segurança, padronização e eficiência no ciclo de desenvolvimento.  #
# Todas as alterações devem ser realizadas por meio do Fusionx                  #
# ============================================================================= #
# ============================================================================= #
# Nome do workflow para facilitar a identificação nas execuções                 #
# ============================================================================= #
name: CI/CD Workflow Generic
# ============================================================================= #
# Nome dinâmico da execução, útil para rastreamento e auditoria                 #
# ============================================================================= #
run-name: ${{ github.repository }}_${{ github.ref_name }}_${{ github.run_id }}.${{ github.run_number }}
# ========================================================================================================================== #
# Eventos que disparam o workflow                                                                                            #
# ========================================================================================================================== #
# workflow_dispatch -> Permite execução manual via interface do GitHub                                                       #
# push              -> Executa automaticamente em push, de acordo com os filtros                                             #
# branches          -> Filtro de execução. O workflow, no evento push, será executado apenas nas branches main e develop     #
# paths-ignore      -> Filtro de execução. O workflow, no evento push, não será executado quando existir alteração           #
#                   -> nos caminhos .github/** e no arquivo catalog-info.yaml                                                #
#                                                                                                                            #
# Documentação de referência                                                                                                 #
# https://docs.github.com/en/actions/how-tos/write-workflows/choose-when-workflows-run/trigger-a-workflow                    #
# ========================================================================================================================== #
on:
  workflow_dispatch:
  push:
    branches:
      - main
      - develop
    paths-ignore:
      - '.github/**'
      - 'catalog-info.yaml'
# ============================================================================================================================ #
# Permissões necessárias para o workflow interagir com o repositório de automação de CI/CD e serviços                          #
# ============================================================================================================================ #
# contents: write        -> Permite escrever nos arquivos do repositório                                                       #
# security-events: write -> Permite registrar eventos de segurança                                                             #
# packages: read         -> Permite ler pacotes (ex: npm, docker)                                                              #
# actions: read          -> Permite ler ações do GitHub                                                                        #
# issues: write          -> Permite criar/editar issues                                                                        #
# pull-requests: write   -> Permite criar/editar pull requests                                                                 #
# pull-requests: write   -> Permite gerar token oidc do github                                                                 #
#                                                                                                                              #
# Documentação de referência                                                                                                   #
# https://docs.github.com/en/actions/tutorials/authenticate-with-github_token#modifying-the-permissions-for-the-github_token   #
# ============================================================================================================================ #
permissions:
  contents: write
  security-events: write
  packages: read
  actions: read
  issues: write
  pull-requests: write
  id-token: write
# ====================================================================================================================================================== #
# Definição dos jobs que serão executados                                                                                                                #
# ====================================================================================================================================================== #
# name: CI_DES                                                                        -> Nome do job, aparece na interface do GitHub Actions             #
# uses: caixagithub/DevSecOps-Solutions/.github/workflows/generic-pipelines.yaml@main -> Template reutilizado                                            #
# secrets: inherit                                                                    -> Herda os segredos definidos no repositório principal            #
# DEPLOY_ENVIRONMENTS: '["DES"]'                                                      -> Define o ambiente de implantação como Desenvolvimento (DES).    #
#                                                                                     -> PossÍveis ambientes: DES, TST, TQS, SANDBOX, HMP, PTL E PRD     #
# IMPORT_APIM: false                                                                  -> Desativa importação automática de APIs no Azure API Management. #
#                                                                                     -> Possíveis valores: true ou false                                #
#                                                                                                                                                        #
# Documentação de referência                                                                                                                             #
# https://docs.github.com/en/actions/how-tos/write-workflows/choose-what-workflows-do/use-jobs                                                           #
# https://docs.github.com/en/actions/how-tos/reuse-automations/reuse-workflows                                                                           #
# ====================================================================================================================================================== #
jobs:
  Generic-Solution:
    name: CI_DES
    uses: caixagithub/DevSecOps-Solutions/.github/workflows/generic-pipelines.yaml@main
    secrets: inherit
    with:
      DEPLOY_ENVIRONMENTS: '["DES"]'
      IMPORT_APIM: false

<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <groupId>br.caixa.gov.siarx</groupId>
    <artifactId>backend-autoridade-registro</artifactId>
    <version>1.0.0</version>

    <properties>
        <compiler-plugin.version>3.14.0</compiler-plugin.version>
        <maven.compiler.release>25</maven.compiler.release>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
        <project.reporting.outputEncoding>UTF-8</project.reporting.outputEncoding>
        <quarkus.platform.artifact-id>quarkus-bom</quarkus.platform.artifact-id>
        <quarkus.platform.group-id>io.quarkus.platform</quarkus.platform.group-id>
        <quarkus.platform.version>3.33.0</quarkus.platform.version>
        <skipITs>true</skipITs>
        <surefire-plugin.version>3.5.2</surefire-plugin.version>
    </properties>

    <dependencyManagement>
        <dependencies>
            <dependency>
                <groupId>${quarkus.platform.group-id}</groupId>
                <artifactId>${quarkus.platform.artifact-id}</artifactId>
                <version>${quarkus.platform.version}</version>
                <type>pom</type>
                <scope>import</scope>
            </dependency>
        </dependencies>
    </dependencyManagement>

    <dependencies>
        <dependency>
            <groupId>io.quarkus</groupId>
            <artifactId>quarkus-rest</artifactId>
        </dependency>
        <dependency>
            <groupId>io.quarkus</groupId>
            <artifactId>quarkus-rest-jackson</artifactId>
        </dependency>
        <dependency>
            <groupId>io.quarkus</groupId>
            <artifactId>quarkus-hibernate-orm-panache</artifactId>
        </dependency>
        <dependency>
            <groupId>io.quarkus</groupId>
            <artifactId>quarkus-arc</artifactId>
        </dependency>
        <dependency>
            <groupId>io.quarkus</groupId>
            <artifactId>quarkus-hibernate-orm</artifactId>
        </dependency>
        <dependency>
            <groupId>io.quarkus</groupId>
            <artifactId>quarkus-jdbc-h2</artifactId>
        </dependency>
        <dependency>
            <groupId>io.quarkus</groupId>
            <artifactId>quarkus-junit5</artifactId>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>io.rest-assured</groupId>
            <artifactId>rest-assured</artifactId>
            <scope>test</scope>
        </dependency>
    </dependencies>

    <build>
        <plugins>
            <plugin>
                <groupId>${quarkus.platform.group-id}</groupId>
                <artifactId>quarkus-maven-plugin</artifactId>
                <version>${quarkus.platform.version}</version>
                <extensions>true</extensions>
                <executions>
                    <execution>
                        <goals>
                            <goal>build</goal>
                            <goal>generate-code</goal>
                            <goal>generate-code-tests</goal>
                            <goal>native-image-agent</goal>
                        </goals>
                    </execution>
                </executions>
            </plugin>
            <plugin>
                <artifactId>maven-compiler-plugin</artifactId>
                <version>${compiler-plugin.version}</version>
                <configuration>
                    <parameters>true</parameters>
                </configuration>
            </plugin>
            <plugin>
                <artifactId>maven-surefire-plugin</artifactId>
                <version>${surefire-plugin.version}</version>
                <configuration>
                    <systemPropertyVariables>
                        <java.util.logging.manager>org.jboss.logmanager.LogManager</java.util.logging.manager>
                        <maven.home>${maven.home}</maven.home>
                    </systemPropertyVariables>
                </configuration>
            </plugin>
            <plugin>
                <artifactId>maven-failsafe-plugin</artifactId>
                <version>${surefire-plugin.version}</version>
                <executions>
                    <execution>
                        <goals>
                            <goal>integration-test</goal>
                            <goal>verify</goal>
                        </goals>
                    </execution>
                </executions>
                <configuration>
                    <systemPropertyVariables>
                        <native.image.path>${project.build.directory}/${project.build.finalName}-runner</native.image.path>
                        <java.util.logging.manager>org.jboss.logmanager.LogManager</java.util.logging.manager>
                        <maven.home>${maven.home}</maven.home>
                    </systemPropertyVariables>
                </configuration>
            </plugin>
        </plugins>
    </build>

    <profiles>
        <profile>
            <id>native</id>
            <activation>
                <property>
                    <name>native</name>
                </property>
            </activation>
            <properties>
                <skipITs>false</skipITs>
                <quarkus.native.enabled>true</quarkus.native.enabled>
            </properties>
        </profile>
    </profiles>
</project>
      
