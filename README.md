Skip to main content
Azure DevOps
projetos
/
Caixa
/
Overview
/
Wiki
/
Comunidade Fomento, Depósitos Judiciais e FIES
/
3. Arquitetura de Software
/
3.11. Solicitação mTLS
Search


Caixa

Overview
Summary
Dashboards
Wiki

Boards

Repos

Pipelines

Test Plans

Artifacts
Project settings

Caixa.wiki

mTLS


New page
3.11. Solicitação mTLS

Follow
1

Edit

c086948
30 de jul.
Configuração de mTLS com Entes Externos
Objetivo
Este documento descreve o processo para obtenção e instalação de certificados digitais necessários para estabelecimento de comunicação segura utilizando mTLS (Mutual TLS) entre a CAIXA e entes externos, como Banco do Brasil, Serpro, Dataprev, parceiros governamentais ou outras instituições.

O que é mTLS?
O mTLS (Mutual Transport Layer Security) é um mecanismo de segurança que realiza autenticação mútua entre os participantes de uma conexão.

Diferentemente do TLS tradicional, em que apenas o cliente valida a identidade do servidor, no mTLS:

A CAIXA valida a identidade do parceiro externo.
O parceiro externo valida a identidade da CAIXA.
Ambos apresentam certificados digitais durante o processo de conexão.
A comunicação é criptografada e autenticada em ambas as direções.
Esse modelo é amplamente utilizado em integrações entre instituições financeiras, órgãos governamentais e APIs corporativas que exigem elevado nível de segurança.

Visão Geral do Processo
Para que uma integração mTLS funcione corretamente, são necessários três elementos:

Certificado digital da CAIXA.
Certificado (ou cadeia de certificados) da instituição parceira.
Configuração de confiança mútua entre as partes.
Importante: Não basta apenas gerar o certificado da CAIXA. É necessário também instalar o certificado no ambiente que realizará a comunicação e obter a cadeia de certificados do parceiro externo.

Etapa 1 - Solicitar Certificado Digital A1
Quando um parceiro externo solicitar um certificado da CAIXA para configuração de mTLS, deve ser aberta uma demanda de emissão de certificado.

Serviço
Solicitar Certificado Digital - CSR - TE079

Caminho
https://servicos.caixa/

Tecnologia da Informação e Comunicação
 └─ Segurança Tecnológica
     └─ Infraestrutura (HW / SW)
         └─ Solicitar Certificado Digital - CSR - TE079
Informações que devem constar na solicitação
Informar explicitamente que:

O certificado deve ser do tipo A1.
O certificado será utilizado para comunicação via mTLS.
O certificado deve ser emitido por uma Autoridade Certificadora (AC) pública válida para Internet.
O certificado deve seguir o padrão X.509.
Exemplo de texto para a solicitação
Solicito emissão de Certificado Digital do tipo A1 para utilização em comunicação segura via mTLS com ente externo. O certificado deve ser emitido por Autoridade Certificadora pública válida para Internet e seguir o padrão X.509.

Etapa 2 - Instalar o Certificado no Ambiente
Após a emissão do certificado, deve ser solicitada sua instalação no ambiente responsável pela integração.

Serviço
Instalar Certificado Digital Existente - TE079

Caminho
https://servicos.caixa/

Tecnologia da Informação e Comunicação
 └─ Segurança Tecnológica
     └─ Infraestrutura (HW / SW)
         └─ Instalar Certificado Digital Existente - TE079
Observações
A instalação deve ocorrer no ambiente que realizará a chamada para o parceiro externo, como por exemplo:

API Gateway
Proxy
Servidor de Aplicação
Backend da solução
Serviço de integração
Sem essa instalação o certificado não será utilizado durante o handshake TLS e o mTLS não funcionará.

Etapa 3 - Obter os Certificados do Parceiro Externo
O mTLS exige confiança mútua.

Além de fornecer o certificado da CAIXA ao parceiro externo, também é necessário solicitar ao parceiro:

Certificado público utilizado na autenticação mTLS.
Certificados intermediários (quando existirem).
Cadeia completa de certificação.
Certificado da AC Raiz (quando aplicável).
Esses certificados deverão ser configurados no ambiente da CAIXA para que a conexão seja considerada confiável.

Fluxo de Confiança
+-------------------+                    +-------------------+
|       CAIXA       |                    | Parceiro Externo  |
+-------------------+                    +-------------------+
         |                                         |
         | Envia Certificado CAIXA                 |
         +---------------------------------------->
         |                                         |
         | Recebe Certificado/Cadeia do Parceiro   |
         <-----------------------------------------+
         |                                         |
         | Configuração de confiança mútua         |
         |                                         |
         +-------------- mTLS ---------------------+
Exemplo Prático - Banco do Brasil
Durante uma integração com o Banco do Brasil, foi solicitado à CAIXA um Certificado Digital A1 para configuração de mTLS.

Neste cenário foi necessário:

Solicitar a emissão do certificado A1 via serviço CSR - TE079.
Encaminhar o certificado ao Banco do Brasil.
Solicitar a instalação do certificado emitido via Instalar Certificado Digital Existente - TE079.
Receber a cadeia de certificados utilizada pelo Banco do Brasil.
Configurar a confiança da cadeia de certificados do BB no ambiente da CAIXA.
Executar testes de conectividade mTLS.
Checklist
Certificado CAIXA
 Certificado A1 solicitado.
 Certificado emitido por AC pública válida para Internet.
 Certificado segue padrão X.509.
 Certificado disponibilizado ao parceiro externo.
Instalação
 Solicitação de instalação aberta.
 Certificado instalado no ambiente da aplicação.
 Ambiente reiniciado (quando necessário).
Certificados do Parceiro
 Certificado público recebido.
 Cadeia de certificados recebida.
 Certificados intermediários recebidos.
 Cadeia configurada no ambiente CAIXA.
Validação
 Teste de handshake TLS realizado.
 Teste de autenticação mútua realizado.
 Teste funcional da integração realizado.
 Evidências arquivadas no projeto.
Observações Importantes
A emissão do certificado da CAIXA não é suficiente para habilitar o mTLS.
O parceiro externo deve confiar explicitamente no certificado da CAIXA.
A CAIXA deve confiar explicitamente na cadeia de certificados utilizada pelo parceiro externo.
Qualquer renovação ou troca de certificado deverá ser coordenada entre as partes para evitar indisponibilidade da integração.
Recomenda-se validar previamente datas de expiração dos certificados para evitar interrupção dos serviços.
5 visits in last 30 days
c086948
commented 10 de ago.

https://mtls-apicaixa.caixa.gov.br/sandbox/
https://mtls-apicaixa.caixa.gov.br

672 pipelines found

Select a release pipeline to view its releases

9 pipelines found

Select a release pipeline to view its releases

6 pipelines found

Select a release pipeline to view its releases

6 pipelines found

2 pipelines found

Showing filters 1 through 2

Collapsed

Expanded

Collapsed

Expanded

Collapsed

Showing filters 1 through 1

712 results found

542 results found

5 results found

2 results found

2 results found

