Solicitamos apoio e análise do erro em ambiente de TQS do SIECM-QUARKUS. Solicito uma sala para análise e orientação da equipe para solucionar, pois após a orientação da REQ000146671991 o erro ainda persiste. Segue anexo telas do erro em ambiente TQS.


<img width="1535" height="817" alt="imagem+(79)" src="https://github.com/user-attachments/assets/72c3eb12-c60e-4d6b-93e3-0c9486cf1b58" />


<img width="1507" height="668" alt="imagem+(80)" src="https://github.com/user-attachments/assets/2b315ba6-8000-4064-b876-e42db4dcdbde" />



REQ000146671991


Solicitamos apoio e análise do erro em ambiente de TQS do SIECM-QUARKUS. 

Segue o link com o erro:
https://devops.caixa/projetos/Caixa/_build/results?buildId=850819&view=logs&j=275f1d19-1bd8-5591-b06b-07d489ea915a&t=e73d691f-7b26-5ce3-d518-700413f3ba2c



À CAIXA, 


Foi identificada uma vulnerabilidade crítica do tipo Privacy Violation apontada pelo Fortify no arquivo:

src/main/java/br/gov/caixa/siecm/infra/ier/connector/AbstractJarmGateway.java

Causa:
O código realizava a propagação de mensagens de exceção utilizando e.getMessage(), permitindo a exposição de detalhes internos da infraestrutura ECM/JARM/FileNet. O Fortify classificou essa prática como potencial vazamento de informações sensíveis.

Ação executada:
Foram realizadas alterações no tratamento de exceções da classe AbstractJarmGateway.java, removendo a propagação direta das mensagens retornadas pelas exceções e adotando mensagens genéricas para a aplicação, mantendo os detalhes apenas nos logs internos para fins de diagnóstico.

Branch utilizada para análise e validação da correção:
cesti_teste

Resultado:
Após as alterações implementadas, o achado Critical do tipo Privacy Violation deixou de ser identificado pelo Fortify, atendendo aos critérios de segurança exigidos pela esteira de CI/CD.


Thiago Silva
Analista
CTIS / CESTI Esteira DEVOPS DES TQS NPRD



correçoes aplicada na branch cesti


Skip to main content
Azure DevOps
projetos
/
Caixa
/
Repos
/
Commits
/

SIECM-middleware
Search


Caixa

Overview

Boards

Repos
Files
Commits
Pushes
Branches
Tags
Pull requests

Pipelines

Test Plans

Artifacts
Project settings
Updated AbstractJarmGateway.java
Browse Files

41466348

Thiago Jeferson de Sousa Silva
committed
15 de out.
cesti_teste
succeeded
Files
Details
Parent 1 → This commit

Filter
1 changed file

Inline



SIECM-middleware


AbstractJarmGateway.java
-56+162
/src/main/java/br/gov/caixa/siecm/infra/ier/connector/AbstractJarmGateway.java
View
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * Base de conexão para JARM/CE.
 * - Cria RMUserContext (JARM) e CE UserContext (FileNet) para operações.
 * - Oferece withReadUserContext(...) para ler com um usuário somente-leitura opcional
 *   (quando o usuário técnico não está na ACL do objeto, p.ex. após trocar permissões).
 */
public abstract class AbstractJarmGateway {
    private static final Logger LOG = Logger.getLogger(AbstractJarmGateway.class.getName());
    protected static final String ENV_SERVER_P8 = "SERVER_P8";
    protected static final String ENV_USUARIO   = "CLI-SER-ECM_USUARIO";
    protected static final String ENV_PASSWORD  = "CLI_SER_ECM_PASSWORD";
    protected static final String ENV_USUARIO = "CLI-SER-ECM_USUARIO";
    protected static final String ENV_PASSWORD = "CLI_SER_ECM_PASSWORD";
    // Leitura opcional (se não definido, usa o subject técnico para ler)
    protected static final String ENV_READ_USER = "CLI_SER_ECM_READ_USUARIO";
    protected static final String ENV_READ_PASS = "CLI_SER_ECM_READ_PASSWORD";
    protected AbstractJarmGateway() {
        this.ceServerUrl = System.getenv(ENV_SERVER_P8);
        this.user        = System.getenv(ENV_USUARIO);
        this.password    = System.getenv(ENV_PASSWORD);
        this.user = System.getenv(ENV_USUARIO);
        this.password = System.getenv(ENV_PASSWORD);
    }
    protected AbstractJarmGateway(String ceServerUrl, String user, String password) {
    }
    protected DomainConnection createConnection() {
        return RMFactory.DomainConnection.createInstance(DomainType.P8_CE, ceServerUrl, null);
        return RMFactory.DomainConnection.createInstance(
                DomainType.P8_CE,
                ceServerUrl,
                null);
    }
    protected boolean establishUserContext(DomainConnection conn) {
        try {
            String stanza = resolveStanza();
            Subject subject = RMUserContext.createSubject(conn, user, password, stanza);
            Subject subject =
                    RMUserContext.createSubject(
                            conn,
                            user,
                            password,
                            stanza);
            RMUserContext.get().setSubject(subject);
            return true;
        } catch (Exception e) {
            LOG.warning("Falha ao estabelecer RMUserContext: " + e.getMessage());
            // Evita exposição de informações sensíveis
            LOG.log(
                    Level.WARNING,
                    "Falha ao estabelecer contexto de autenticação RMUserContext.",
                    e);
            return false;
        }
    }
    }
    protected String resolveStanza() {
        return (jaasStanza != null && !jaasStanza.isBlank()) ? jaasStanza : RMUserContext.P8_STANZA_WSI;
        return (jaasStanza != null && !jaasStanza.isBlank())
                ? jaasStanza
                : RMUserContext.P8_STANZA_WSI;
    }
    protected boolean isBlank(String s) { return s == null || s.trim().isEmpty(); }
    protected boolean isBlank(String s) {
        return s == null || s.trim().isEmpty();
    }
    protected void ensureEnvPresent(String envName, String value) {
        if (isBlank(value)) {
            throw new IllegalStateException("Variável de ambiente obrigatória não definida: " + envName);
            throw new IllegalStateException(
                    "Variável de ambiente obrigatória não definida: "
                            + envName);
        }
    }
    @FunctionalInterface
    protected interface JarmOperation<T> { T execute(RMDomain domain) throws JarmOperationException; }
    protected interface JarmOperation<T> {
        T execute(RMDomain domain) throws JarmOperationException;
    }
    /**
     * Abre contexto JARM + CE (usuário técnico) e executa a operação.
     */
    protected <T> T executeWithConnection(JarmOperation<T> operation) throws JarmOperationException {
    protected <T> T executeWithConnection(
            JarmOperation<T> operation)
            throws JarmOperationException {
        validateEnvVariables();
        boolean rmSubjectEstablished = false;
        Subject ceSubject = null;
        try {
            DomainConnection conn = createConnection();
            rmSubjectEstablished = establishUserContext(conn); // RMUserContext (JARM)
            // CE UserContext (FileNet) — usa as MESMAS credenciais/URL do Abstract
            Connection ceConn = Factory.Connection.getConnection(this.ceServerUrl);
            ceSubject = UserContext.createSubject(ceConn, this.user, this.password, resolveStanza());
            rmSubjectEstablished =
                    establishUserContext(conn);
            Connection ceConn =
                    Factory.Connection.getConnection(
                            this.ceServerUrl);
            ceSubject =
                    UserContext.createSubject(
                            ceConn,
                            this.user,
                            this.password,
                            resolveStanza());
            UserContext.get().pushSubject(ceSubject);
            RMDomain domain = fetchDomain(conn);
            return operation.execute(domain);
        } catch (JarmOperationException e) {
            throw e;
        } catch (Exception e) {
            String rawMessage = e.getMessage() != null ? e.getMessage() : "Erro desconhecido";
            String message = "Erro ao executar operação: \"" + rawMessage + "\"";
            throw new JarmOperationException(message, e);
            // Log interno completo
            LOG.log(
                    Level.SEVERE,
                    "Erro durante execução de operação no ECM/JARM.",
                    e);
            // Mensagem sanitizada para camada superior
            throw new JarmOperationException(
                    "Falha ao executar operação no ECM/JARM.",
                    e);
        } finally {
            if (ceSubject != null) {
                try { UserContext.get().popSubject(); } catch (Exception ex) { LOG.log(Level.FINE, "Failed to pop CE subject", ex); }
                try {
                    UserContext.get().popSubject();
                } catch (Exception ex) {
                    LOG.log(
                            Level.FINE,
                            "Falha ao remover CE UserContext.",
                            ex);
                }
            }
            if (rmSubjectEstablished) {
                clearUserContext();
            }
        }
    }
    /**
     * Empilha (temporariamente) um subject de leitura para operações que hidratam ACL/objeto
     * quando o usuário técnico não está na ACL. Se variáveis de leitura não existirem, apenas
     * executa com o subject atual (usuário técnico).
     */
    public <T> T withReadUserContext(Supplier<T> work) {
        String readUser = System.getenv(ENV_READ_USER);
        String readPass = System.getenv(ENV_READ_PASS);
        if (readUser == null || readUser.isBlank() || readPass == null) {
        if (readUser == null
                || readUser.isBlank()
                || readPass == null) {
            return work.get();
        }
        Subject ceReadSubject;
        javax.security.auth.Subject previousRmSubject = null;
        Subject previousRmSubject = null;
        try {
            // CE (FileNet) subject
            Connection ceConn = Factory.Connection.getConnection(this.ceServerUrl);
            ceReadSubject = UserContext.createSubject(ceConn, readUser, readPass, resolveStanza());
            Connection ceConn =
                    Factory.Connection.getConnection(
                            this.ceServerUrl);
            ceReadSubject =
                    UserContext.createSubject(
                            ceConn,
                            readUser,
                            readPass,
                            resolveStanza());
            UserContext.get().pushSubject(ceReadSubject);
            // RM (JARM) subject — cria e substitui temporariamente
            previousRmSubject = installRmReadSubject(readUser, readPass);
            previousRmSubject =
                    installRmReadSubject(
                            readUser,
                            readPass);
            return work.get();
        } catch (Exception e) {
            // fallback: mantém o subject atual — log para não suprimir a exceção (Sonar S1141)
            LOG.log(Level.FINE, "withReadUserContext: fallback while creating read subjects, continuing with current subject", e);
            LOG.log(
                    Level.FINE,
                    "Falha ao criar contexto de leitura. Utilizando contexto corrente.",
                    e);
            return work.get();
        } finally {
            // restaura RM subject
            try {
                if (previousRmSubject != null) {
                    RMUserContext.get().setSubject(previousRmSubject);
                    RMUserContext.get()
                            .setSubject(previousRmSubject);
                }
            } catch (Exception ex) {
                LOG.log(
                        Level.FINE,
                        "Falha ao restaurar RMUserContext anterior.",
                        ex);
            }
            try {
                UserContext.get().popSubject();
            } catch (Exception ex) {
                LOG.log(Level.FINE, "Failed to restore previous RM subject", ex);
                LOG.log(
                        Level.FINE,
                        "Falha ao remover CE UserContext de leitura.",
                        ex);
            }
            // pop CE subject
            try { UserContext.get().popSubject(); } catch (Exception ex) { LOG.log(Level.FINE, "Failed to pop CE read subject", ex); }
        }
    }
    // Extracted helper to keep withReadUserContext linear and avoid nested try blocks
    private javax.security.auth.Subject installRmReadSubject(String readUser, String readPass) {
    private Subject installRmReadSubject(
            String readUser,
            String readPass) {
        try {
            DomainConnection rmConn = RMFactory.DomainConnection.createInstance(DomainType.P8_CE, this.ceServerUrl, null);
            javax.security.auth.Subject rmRead = RMUserContext.createSubject(rmConn, readUser, readPass, resolveStanza());
            javax.security.auth.Subject previous = RMUserContext.get().getSubject();
            DomainConnection rmConn =
                    RMFactory.DomainConnection.createInstance(
                            DomainType.P8_CE,
                            this.ceServerUrl,
                            null);
            Subject rmRead =
                    RMUserContext.createSubject(
                            rmConn,
                            readUser,
                            readPass,
                            resolveStanza());
            Subject previous =
                    RMUserContext.get().getSubject();
            RMUserContext.get().setSubject(rmRead);
            return previous;
        } catch (RuntimeException rmEx) {
            // if we can't create an RM read subject, continue with CE read only; log the throwable (preserve stack)
            LOG.log(Level.WARNING, "Não foi possível criar RM read subject", rmEx);
            LOG.log(
                    Level.WARNING,
                    "Não foi possível criar RM read subject.",
                    rmEx);
            return null;
        }
    }
Expanded

Finished loading items

Showing 141 items.

Searching...

Collapsed

Row 2. Clickable




alteraçao deles foi feita em qual tag


Skip to main content
Azure DevOps
projetos
/
Caixa
/
Repos
/
Commits
/

SIECM-middleware
Search


Caixa

Overview

Boards

Repos
Files
Commits
Pushes
Branches
Tags
Pull requests

Pipelines

Test Plans

Artifacts
Project settings
commit projeto base
Browse Files

9465265e

Lincoln Caetano Dias(F602349)
committed
22 de set. de 2025
develop
(
!107363
)
Files
Details
Parent 1 → This commit

Filter
54 changed files

Inline



SIECM-middleware


.gitignore
+2
/.mvn/wrapper/.gitignore
View
maven-wrapper.jar

maven-wrapper.properties
+20
/.mvn/wrapper/maven-wrapper.properties
View
# Licensed to the Apache Software Foundation (ASF) under one
# or more contributor license agreements.  See the NOTICE file
# distributed with this work for additional information
# regarding copyright ownership.  The ASF licenses this file
# to you under the Apache License, Version 2.0 (the
# "License"); you may not use this file except in compliance
# with the License.  You may obtain a copy of the License at
#
#   http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing,
# software distributed under the License is distributed on an
# "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
# KIND, either express or implied.  See the License for the
# specific language governing permissions and limitations
# under the License.
wrapperVersion=3.3.2
distributionType=source
distributionUrl=https://repo.maven.apache.org/maven2/org/apache/maven/apache-maven/3.9.9/apache-maven-3.9.9-bin.zip
wrapperUrl=https://repo.maven.apache.org/maven2/org/apache/maven/wrapper/maven-wrapper/3.3.2/maven-wrapper-3.3.2.jar

MavenWrapperDownloader.java
+94
/.mvn/wrapper/MavenWrapperDownloader.java
View
/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
import java.io.IOException;
import java.io.InputStream;
import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.net.URI;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.concurrent.ThreadLocalRandom;
public final class MavenWrapperDownloader {
    private static final String WRAPPER_VERSION = "3.3.2";
    private static final boolean VERBOSE = Boolean.parseBoolean(System.getenv("MVNW_VERBOSE"));
    public static void main(String[] args) {
        log("Apache Maven Wrapper Downloader " + WRAPPER_VERSION);
        if (args.length != 2) {
            System.err.println(" - ERROR wrapperUrl or wrapperJarPath parameter missing");
            System.exit(1);
        }
        try {
            log(" - Downloader started");
            final URL wrapperUrl = URI.create(args[0]).toURL();
            final String jarPath = args[1].replace("..", ""); // Sanitize path
            final Path wrapperJarPath = Paths.get(jarPath).toAbsolutePath().normalize();
            downloadFileFromURL(wrapperUrl, wrapperJarPath);
            log("Done");
        } catch (IOException e) {
            System.err.println("- Error downloading: " + e.getMessage());
            if (VERBOSE) {
                e.printStackTrace();
            }
            System.exit(1);
        }
    }
    private static void downloadFileFromURL(URL wrapperUrl, Path wrapperJarPath)
            throws IOException {
        log(" - Downloading to: " + wrapperJarPath);
        if (System.getenv("MVNW_USERNAME") != null && System.getenv("MVNW_PASSWORD") != null) {
            final String username = System.getenv("MVNW_USERNAME");
            final char[] password = System.getenv("MVNW_PASSWORD").toCharArray();
            Authenticator.setDefault(new Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(username, password);
                }
            });
        }
        Path temp = wrapperJarPath
                .getParent()
                .resolve(wrapperJarPath.getFileName() + "."
                        + Long.toUnsignedString(ThreadLocalRandom.current().nextLong()) + ".tmp");
        try (InputStream inStream = wrapperUrl.openStream()) {
            Files.copy(inStream, temp, StandardCopyOption.REPLACE_EXISTING);
            Files.move(temp, wrapperJarPath, StandardCopyOption.REPLACE_EXISTING);
        } finally {
            Files.deleteIfExists(temp);
        }
        log(" - Downloader complete");
    }
    private static void log(String msg) {
        if (VERBOSE) {
            System.out.println(msg);
        }
    }
}

s1.md
+9
/docs/section1/s1.md
View
# Sub Seção 1.1
Este é um conteúdo de exemplo para esta seção...
## Título de Nível 2
Lorem ipsum...
### Título de Nível 3

s2.md
+9
/docs/section1/s2.md
View
# Sub Seção 1.2
Este é um conteúdo de exemplo para esta seção...
## Título de Nível 2
Lorem ipsum...
### Título de Nível 3

s3.md
/docs/section1/s3.md
View

index.md
/docs/index.md
View

Dockerfile.jvm
/src/main/docker/Dockerfile.jvm
View

Dockerfile.legacy-jar
/src/main/docker/Dockerfile.legacy-jar
View

Dockerfile.native
/src/main/docker/Dockerfile.native
View

Dockerfile.native-micro
/src/main/docker/Dockerfile.native-micro
View

ConsultaDocumentoResponseDTO.java
/src/main/java/br/gov/caixa/siecm/adapters/in/dto/ConsultaDocumentoResponseDTO.java
View

DocumentoResponseDTO.java
/src/main/java/br/gov/caixa/siecm/adapters/in/dto/DocumentoResponseDTO.java
View

ErrorResponseDTO.java
/src/main/java/br/gov/caixa/siecm/adapters/in/dto/ErrorResponseDTO.java
View

GravaDocumentoDTO.java
/src/main/java/br/gov/caixa/siecm/adapters/in/dto/GravaDocumentoDTO.java
View

MetadadoDTO.java
/src/main/java/br/gov/caixa/siecm/adapters/in/dto/MetadadoDTO.java
View

Constantes.java
/src/main/java/br/gov/caixa/siecm/adapters/in/mapper/Constantes.java
View

DocumentoMapper.java
/src/main/java/br/gov/caixa/siecm/adapters/in/mapper/DocumentoMapper.java
View

GlobalExceptionHandler.java
/src/main/java/br/gov/caixa/siecm/adapters/in/rest/handler/GlobalExceptionHandler.java
View

DocumentoController.java
/src/main/java/br/gov/caixa/siecm/adapters/in/rest/DocumentoController.java
View

RecuperaDocumentoController.java
/src/main/java/br/gov/caixa/siecm/adapters/in/rest/RecuperaDocumentoController.java
View

AuditoriaEntity.java
/src/main/java/br/gov/caixa/siecm/adapters/out/entity/AuditoriaEntity.java
View

FileNetConnector.java
/src/main/java/br/gov/caixa/siecm/adapters/out/filenet/connerctor/FileNetConnector.java
View

JaasFileNetConnector.java
/src/main/java/br/gov/caixa/siecm/adapters/out/filenet/connerctor/JaasFileNetConnector.java
View

OidcFileNetConnector.java
/src/main/java/br/gov/caixa/siecm/adapters/out/filenet/connerctor/OidcFileNetConnector.java
View
Finished loading items

Showing 141 items.

Searching...

Collapsed

Row 2. Clickable

Showing 141 items.

Finished loading items

Expanded

Collapsed

Expanded

Loading items

Showing 1 items.

Showing 35 items.

Finished loading items

Collapsed

Row 2. Clickable





na  tag 



Skip to main content
Azure DevOps
projetos
/
Caixa
/
Repos
/
Commits
/

SIECM-middleware
Search


Caixa

Overview

Boards

Repos
Files
Commits
Pushes
Branches
Tags
Pull requests

Pipelines

Test Plans

Artifacts
Project settings
Refatoração: melhorar logging e uso de constantes no AbstractJarmGateway
Browse Files

ce9dac65

Lincoln Caetano Dias(F602349)
committed
Yesterday
failed
Files
Details
Parent 1 → This commit

Filter
1 changed file

Inline



SIECM-middleware


AbstractJarmGateway.java
-4+4
/src/main/java/br/gov/caixa/siecm/infra/ier/connector/AbstractJarmGateway.java
View
 */
public abstract class AbstractJarmGateway {
    private static final Logger LOG = Logger.getLogger(AbstractJarmGateway.class.getName());
    private static final String GENERIC_OPERATION_ERROR = "Erro ao executar operação no ECM";
    protected static final String ENV_SERVER_P8 = "SERVER_P8";
    protected static final String ENV_USUARIO   = "CLI-SER-ECM_USUARIO";
            RMUserContext.get().setSubject(subject);
            return true;
        } catch (Exception e) {
            LOG.warning("Falha ao estabelecer RMUserContext: " + e.getMessage());
            LOG.log(Level.WARNING, "Falha ao estabelecer RMUserContext", e);
            return false;
        }
    }
        } catch (JarmOperationException e) {
            throw e;
        } catch (Exception e) {
            String rawMessage = e.getMessage() != null ? e.getMessage() : "Erro desconhecido";
            String message = "Erro ao executar operação: \"" + rawMessage + "\"";
            throw new JarmOperationException(message, e);
            LOG.log(Level.SEVERE, "Falha ao executar operação JARM/CE", e);
            throw new JarmOperationException(GENERIC_OPERATION_ERROR, e);
        } finally {
            if (ceSubject != null) {
                try { UserContext.get().popSubject(); } catch (Exception ex) { LOG.log(Level.FINE, "Failed to pop CE subject", ex); }
Row 2. Clickable




<img width="1641" height="896" alt="image" src="https://github.com/user-attachments/assets/8cc4c7de-37b2-428a-bc89-84e8b8257279" />



eles nao aplicaram o que foi solicitado e estao querendo sala. me ajdua  afechar a demanda informado o que eles precisam fazer nao sendo necesarioa abertura de sala apra isso
