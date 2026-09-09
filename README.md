Diagnóstico técnico

O SIALI (siali-des, OKD4, JBoss EAP 7.4.11.GA) apresentava SSLHandshakeException: PKIX path building failed – unable to find valid certification path to requested target ao consumir https://api.des.caixa:8443/plataforma-unificada/trilha/v1/registros.

Investigação identificou duas causas concorrentes:

Infraestrutura (corrigida): o truststore customizado configurado via JVM (-Djavax.net.ssl.trustStore=/opt/jboss/standalone/configuration/caixa-truststore-acteste-nprd.jks) precisou ser recarregado (restart do pod) para que a cadeia de certificados vigente da CA interna (AC Icptestes Raiz / AC Icptestes Sub) fosse efetivamente aplicada pela JVM. Fingerprints da cadeia servida pelo endpoint (openssl s_client -showcerts) foram comparados e confirmados idênticos aos presentes no truststore (keytool -list), validando que o arquivo em si já estava correto.
Aplicação (pendente – requer ajuste de código): o cacerts padrão do JDK (/usr/lib/jvm/java-11-openjdk-.../lib/security/cacerts), usado como fallback quando um client HTTP não herda explicitamente a property -Djavax.net.ssl.trustStore, não contém a cadeia da CA interna Caixa. Isso indica que o client HTTP usado na chamada a api.des.caixa:8443 (dentro de TrilhaServiceImpl / pacote br.gov.caixa.siali.model.service) está instanciando seu próprio SSLContext/TrustManager — comportamento comum em bibliotecas como Apache HttpClient ou RESTEasy Client quando configuradas sem builder específico — e por isso ignora o truststore customizado da JVM, caindo no cacerts padrão (sem a CA interna).

Recomendação para o time de desenvolvimento

Ajustar o client HTTP responsável pela chamada ao endpoint api.des.caixa:8443 em TrilhaServiceImpl (ou classe equivalente que realiza a chamada REST) para:

usar o SSLContext default da JVM (que respeita -Djavax.net.ssl.trustStore), evitando a criação de um SSLContext/TrustManager próprio sem configuração explícita de truststore; ou
caso o client precise de configuração própria, apontar explicitamente para o mesmo caminho do truststore customizado (/opt/jboss/standalone/configuration/caixa-truststore-acteste-nprd.jks) na construção do HttpClient/SSLContext.
