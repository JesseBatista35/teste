Isso não é o erro da aplicação, é só que esse arquivo não é onde a aplicação grava seus logs de runtime. Ele só registra a inicialização do processo (que rodou há muito tempo, já que o JBoss está de pé há mais de 2 anos sem reiniciar).

O log real da aplicação (com as exceptions do dia) fica em outro lugar, configurado via um handler customizado no logging.properties:

handler.FILE.fileName=/infra_app/logs/sisgr/server-srjdeapllx130_acessoseguro_intra_5500.log

Foi só quando fomos nesse arquivo que achamos as exceptions de hoje (10:26, 12:31, etc.) com o erro do SISET.

Achado 2 (o erro de verdade): certificado

Já dentro do arquivo certo, achamos a exception real: falha de handshake TLS por causa da cadeia de certificado nova do Sectigo não estar no cacerts.


A aplicação SISGR (rodando em JBoss no srjdeapllx130, dois servers: acessoseguro_intra_5500 e webservice_intra_5502) precisa, no fluxo de autorização de usuário externo (matrizacesso), consultar um serviço externo chamado SISET pra verificar permissões (roles) do usuário. Essa consulta é feita via HTTPS pra https://logindes.caixa.gov.br.

Toda vez que a aplicação tentava essa chamada, a conexão HTTPS era aberta e fechada em 6 milissegundos, sem trafegar dado nenhum, e a aplicação lançava a exception:

SEVERE [ApplicationException] Não foi possível executar a ação devido a falha de comunicação com o SISET.

Isso é o comportamento clássico de um handshake TLS que falha por certificado não confiável — não é timeout de rede, não é DNS, não é firewall. A prova disso: com curl -k (que ignora validação de certificado) e openssl s_client, a conexão funcionava perfeitamente. Só a aplicação Java falhava.

Causa raiz

O certificado de logindes.caixa.gov.br tinha sido renovado em 16/06/2026 sob uma cadeia Sectigo nova (Sectigo Public Server Authentication CA DV R36, assinada por Sectigo Public Server Authentication Root R46).

O truststore da aplicação (/infra_app/config/certificados/cacerts, apontado pela JVM via -Djavax.net.ssl.trustStore) só tinha a cadeia Sectigo antiga (RSA Domain Validation Secure Server CA). Como a cadeia nova não estava lá, a JVM rejeitava o certificado do SISET e derrubava a conexão na hora — daí o erro reportado pelo usuário.

Isso não era um problema isolado dessa WO: o Roger Costa Machado já tinha avisado no Teams em 25/06 que era um problema generalizado, decorrente da renovação do certificado, e que quem tivesse truststore customizado precisava adicionar a cadeia nova manualmente.

A correção

Peguei os dois arquivos de certificado da cadeia nova (que você já tinha, do aviso do Roger)
Copiei pro servidor srjdeapllx130 via scp
Fiz backup do cacerts atual
Importei os dois certificados no cacerts com keytool -importcert (um alias pra intermediária DV R36, outro pra raiz R46)
Confirmei que entraram certinho no keystore
Reiniciei os dois servers JBoss via jboss-cli (comando restart no server-config de cada um), porque a JVM só lê o truststore na inicialização
Confirmei que os processos voltaram no ar com PID novo
