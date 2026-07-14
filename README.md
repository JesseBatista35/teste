Por favor, verificar e ajustar

Estamos enfrentando um problema com a imagem atualmente utilizada na pipeline dos módulos JBOSS. Ela não contém o JAR do novo provider HSM da NetDefence, que precisará substituir o provider atual, cuja licença expira em agosto. Embora a implementação da integração com o novo provider já tenha sido realizada no código utilizando a API JCA/JCE, ela não funciona na imagem atual devido à ausência dessa dependência.

Documentação:

https://en.docs.dinamonetworks.io/hsm/integration/jca/instalation/#

Skip to content
DINAMO is now DINAMO Security Company !
then
DINAMO Docs
Installation



Search
 
HSM
Pocket
Downloads
HSM
Equipment
Description
HSM operation
Software
Partition
Return Codes
API
Integration
MS Crypto API
JCA/JCE
Algorithms
Implementation
Installation
Configuration
PKCS#11
OpenSSL engine
KMIP
Guides
Troubleshooting
Contents
Project Import
Prerequisites
Manual installation
HSM
Integration
JCA/JCE
Installation
Project Import
Reference the official Java Maven package from HSM DINAMO in your project.

Prerequisites
Java 8 or higher.
Manual installation
This form of installation is most commonly used for third-party applications where you don't have access to the source code.

Download the jar file for the HSM Java package, click on Versions and then Browse. In the list download the file which is usually named as follows dinamo-hsm-M .N.P.jar where M.N.P is the version.

Copy the file to JDK.


Java 8
Java 9 or higher
Copiar o arquivo dinamo-hsm-M.N.P.jar para a pasta <JAVA_HOME>\jre\lib\ext .

E.g.: C:\Program Files\Java\jdk1.8.0_211\jre\lib\ext


Include the JCA class DINAMO in the JVM's list of encryption providers. This can be done in various ways, for example:


Java 8
Java 9 or higher
Via application-specific parameters.

E.g.: jarsigner ... -providerClass br.com.trueaccess.provider.netdfence.ND.

Inclusão no arquivo de configuração <JAVA_HOME>\jre\lib\security\java.security a referência para a CSP Java do HSM security.provider.X=br.com.trueaccess.provider.netdfence.ND onde X deve ser substituído pela posição da CSP na lista de ordenamento de CSPs.

Example:


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

 Back to top
Previous
Implementation
Next
Configuration
Copyright © 2016–2024 DINAMO
Made with Material for MkDocs



o modulo é o simp-caontainer-dict

boa tarde tudo bem
 
Boa tarde
 
recebi uma w.o para ajuste no HSM
 
td joia
 
Jesse Mouta Pereira Batista
recebi uma w.o para ajuste no HSM
ah sim
 
porem lá na informa qual o modulo
 
só fala do sispi
 
Jesse Mouta Pereira Batista
porem lá na informa qual o modulo
é o SIMPI-container-dict
 
 
Suporte ao ambiente de aplicação nas esteiras DevOps
Qual o nome do Sistema?*:
Qual o ambiente*:
 
 
 
Jesse Mouta Pereira Batista
Suporte ao ambiente de aplicação nas esteiras DevOps   Qual o nome do Sistema?*:   Qual o ambiente*:
SISPI
DES
 
aqui ele colocou SISPI
 
Lucas Nogueira de Carvalho
é o SIMPI-container-dict
o modulo é esse
 
Jesse Mouta Pereira Batista
📷
Então basicamente a gente precisa coloca um jar no jdk da aplicação para que fique disponível para a JVM
 
seguindo a documentação aqui:
 
Installation - DINAMO Docs
Installation - DINAMO Docs
Technical documentation for DINAMO Hardware Security Modules and other products
 
isso, voce consegue colocar uma nota informando que o modulo é o SIMP-container-dict, pois não vou conseguir atuar sem essa informação na w.o
 
Jesse Mouta Pereira Batista
isso, voce consegue colocar uma nota informando que o modulo é o SIMP-container-dict, pois não vou conseguir atuar sem essa informação na w.o
vou colocar
 
obrigado
 
ja vou verificar aqui
 
