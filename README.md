Pular para conteúdo
DINAMO Networks agora é DINAMO Cyber Security Company !
logo
Docs DINAMO
Instalação



Buscar
 
HSM
Pocket
Downloads
HSM
Equipamento
Descrição
Operação do HSM
Software
Partição
Códigos de Retorno
API
Integração
MS Crypto API
JCA/JCE
Algoritmos
Implementação
Instalação
Configuração
PKCS#11
Engine OpenSSL
KMIP
Guias
Resolução de Problemas
Índice
Importação no Projeto
Pré-requisitos
Instalação Manual
HSM
Integração
JCA/JCE
Instalação
Importação no Projeto
Referenciar o pacote oficial Java Maven do HSM DINAMO no seu projeto.

Pré-requisitos
Java 8 ou superior.
Instalação Manual
Esta forma de instalação é mais utilizada para aplicações de terceiros onde não se tem acesso ao código fonte.

Baixar o arquivo jar do pacote Java do HSM, clicar em Versions e depois Browse. Na listagem baixar o arquivo que normalmente é nomeado da seguinte forma dinamo-hsm-M.N.P.jar onde M.N.P é a versão.

Copiar o arquivo para JDK.


Java 8
Java 9 ou superior
Copiar o arquivo dinamo-hsm-M.N.P.jar para a pasta <JAVA_HOME>\jre\lib\ext .

Ex.: C:\Program Files\Java\jdk1.8.0_211\jre\lib\ext


Incluir a classe da JCA DINAMO na lista de provedores de criptografia da JVM. Isto pode ser feito de várias formas, por exemplo:


Java 8
Java 9 ou superior
Via parâmetros específicos da aplicação.

Ex.: jarsigner ... -providerClass br.com.trueaccess.provider.netdfence.ND.

Inclusão no arquivo de configuração <JAVA_HOME>\jre\lib\security\java.security a referência para a CSP Java do HSM security.provider.X=br.com.trueaccess.provider.netdfence.ND onde X deve ser substituído pela posição da CSP na lista de ordenamento de CSPs.

Exemplo:


.
.
.
#
# List of providers and their preference orders (see above):
#
security.provider.1=sun.security.provider.Sun
security.provider.2=com.sun.net.ssl.internal.ssl.Provider
security.provider.3=com.sun.rsajca.Provider
security.provider.4=com.sun.crypto.provider.SunJCE
security.provider.5=sun.security.jgss.SunProvider
security.provider.6=br.com.trueaccess.provider.netdfence.ND
.
.
.

 Voltar para o topo
Anterior
Implementação
Próximo
Configuração
Copyright © 2016 - 2024 DINAMO
Made with Material for MkDocs

