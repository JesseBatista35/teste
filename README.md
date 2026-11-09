Jesse Mouta Pereira Batista Thiago Jeferson de Sousa Silva
está dando ME 504 nas requisições e time out quando pesquisamos contratos, 
Conferi em localhost e tá funcionando normal por la, será que é algo na infra? 
 
 
 
Jesse Mouta, estou fazendo o teste do contexto web, até agora não encontrei erro algum.
 
Para o contexto do REST API, não estou conseguindo processar nenhuma das requisições. Dando erro interno 500.
 
Requisição de exemplo:
 
 
GET https://migracaosifec.des.caixa/sicdt-orig-api-rest/sicdt/v2/contrato/liberacao/consultar/99178267365/3194
User-Agent: vscode-restclient
Content-Type: application/json
Accept: application/json
Authorization: Bearer eyJhbGciOiJSU[...]
Apikey: <api key do CDT>
 
 
Response obtida:
 
HTTP/1.1 500 Internal Server Error
Date: Fri, 06 Nov 2026 15:00:03 GMT
Server: Apache/2.4.57 (Red Hat)
Content-Type: text/html;charset=UTF-8
Content-Length: 80
Connection: close
<html><head><title>Error</title></head><body>Internal Server Error</body></html>
 
 
Inocencio Teixeira de Oliveira
Jesse Mouta, estou fazendo o teste do contexto web, até agora não encontrei erro algum.   Para o contexto do REST API, não estou conseguindo processar nenhuma das requisições. Dando erro interno 500.…
Inocencio Teixeira de Oliveira Obrigado pelo teste, Que bom que o contexto web está ok. Vou pegar no log do servidor o erro da requisição das 12:00:03 (15:00:03 GMT) da API REST e te retorno com a causa.
 
Vinicius Ferreira Veras
Jesse Mouta Pereira Batista Thiago Jeferson de Sousa Silva está dando ME 504 nas requisições e time out quando pesquisamos contratos, Conferi em localhost e tá funcionando normal por la, será que é a…
Dependência externa demorando ou falhando

HTTP 504 Gateway Timeout ocorre quando um gateway/proxy não recebe do servidor upstream a resposta dentro do prazo. Entre as causas estão lentidão do backend, sobrecarga, falha de comunicação e timeout de proxy/load balancer/firewall.
 
Jesse Mouta, consegue passar o log desse erro.
 
Jesse Mouta Pereira Batista
Inocencio Teixeira de Oliveira Obrigado pelo teste, Que bom que o contexto web está ok. Vou pegar no log do servidor o erro da requisição das 12:00:03 (15:00:03 GMT) da API REST e te retorno com a c…
Muito obrigado. Ao dispor.
 
sexta-feira 12:18 Reunião encerrada 59min 16s 

 
Vinicius Ferreira Veras
Jesse Mouta Pereira Batista Thiago Jeferson de Sousa Silva está dando ME 504 nas requisições e time out quando pesquisamos contratos, Conferi em localhost e tá funcionando normal por la, será que é a…
Vinicius Ferreira Veras, vamos verificar.
 
Vinicius Ferreira Veras
Jesse Mouta Pereira Batista Thiago Jeferson de Sousa Silva está dando ME 504 nas requisições e time out quando pesquisamos contratos, Conferi em localhost e tá funcionando normal por la, será que é a…
Fiz uns ajustes de apontamento aqui, com o mesmo CNPJ que informou, parou de apresentar o erro. 
 
 
Thiago Jeferson de Sousa Silva
Fiz uns ajustes de apontamento aqui, com o mesmo CNPJ que informou, parou de apresentar o erro.   📷

Maravilha, muito obrigado
 
 
Criação ambiente SIPEN (PRODUÇÃO)
	 
WO0000082203406	Criação de servidores do SIPEN - Aguardando atendimento
WO0000082163841	Emissão do certificado para o ambiente de transmissão: migracaosipen.caixa
Precisamos de apoio na priorização desses WOs, pois eles são necessários para iniciarmos a criação do novo ambiente do SIPEN em produção. Na sequência, iniciaremos também a preparação do SIFEC..
 
Elisabeth da Silva Ovidio Pires da Rocha Ana Paula Pazitto da Costa
 
Inocencio Teixeira de Oliveira
Jesse Mouta, estou fazendo o teste do contexto web, até agora não encontrei erro algum.   Para o contexto do REST API, não estou conseguindo processar nenhuma das requisições. Dando erro interno 500.…
Inocencio Teixeira de Oliveira, achei e corrigi o 500 da API REST do SICDT. 
 
Onde estava o erro: a sicdt-orig-api-rest é bearer-only. Para validar o token, o adapter do Keycloak precisa buscar a configuração do realm em https://login.des.caixa. 
 
O truststore do servidor estava apontando para um caminho de Windows (C:/Desenvolvimento/JDK/.../cacerts), herdado de configuração de dev. 
 
Sem a cadeia de certificados da Caixa, a conexão falhava com PKIX path building failed, e o adapter quebrava com NullPointerException, gerando o 500.
 
O que foi corrigido:
 
Criado o truststore /opt/jboss/truststore/sifec-cacerts.jks (cacerts do Java + AC Icptestes Raiz e AC Icptestes Sub da Caixa)
javax.net.ssl.trustStore do server-group sifec-intranet apontando para esse arquivo

Restart do sifec-intranet
 
Teste para você fazer:
 
Gere um token novo (o anterior pode ter expirado) e repita a mesma requisição:
GET https://migracaosifec.des.caixa/sicdt-orig-api-rest/sicdt/v2/contrato/liberacao/consultar/99178267365/3194
com os headers Authorization: Bearer <token> e Apikey.

O esperado é 200 com o JSON da consulta. Se vier 401, me avise: aí ajustamos o client do secure-deployment para cli-ser-cdt, como na sua configuração.

Teste também as outras chamadas da API que você usa no fluxo.
 
Se der qualquer erro, me manda o horário que eu pego o log.
 
Jesse Mouta Pereira Batista
Inocencio Teixeira de Oliveira, achei e corrigi o 500 da API REST do SICDT.   Onde estava o erro: a sicdt-orig-api-rest é bearer-only. Para validar o token, o adapter do Keycloak precisa buscar a co…
Obrigado, Jesse. Irei testar e reportar pra ti.
 
Paulo Henrique Barros Santos  e Rodrigo Abreu Costa Boa tarde, sobre o SIFEC-RURAL 2.115.0.1:


O bloqueio de ambiente foi resolvido (o truststore do servidor estava com caminho de Windows; criamos um com a cadeia AC Icptestes da Caixa). 
 
Subimos a rural-2.115.0.1-b2446.ear, mas a implantação é revertida por empacotamento:


WELD-001318: Cannot resolve an ambiguous dependency ... JacksonJaxbJsonProvider / RESTEASY003940: Unable to instantiate MessageBodyReader
 


Esse build é do 6.4 e traz o jackson-jaxrs-json-provider dentro do pacote, que o EAP 7.4 já fornece. Com duas cópias, o CDI não sabe qual usar.


Ajuste necessário no pom: deixar resteasy-* e jackson-* (core, annotations, databind, jaxrs-json-provider) como provided, igual ao que o Inocêncio fez no SICDT, e gerar um build da 2.115.0.1 para o 7.4.

Paulo Henrique Barros Santos , quem é o dev responsável pelo RURAL para mandarmos isso?
 
Jesse Mouta Pereira Batista
Paulo Henrique Barros Santos  e Rodrigo Abreu Costa Boa tarde, sobre o SIFEC-RURAL 2.115.0.1:  O bloqueio de ambiente foi resolvido (o truststore do servidor estava com caminho de Windows; criamos um…
Jefferson Vieira Alves pode dar uma força nessa analise?
 
Inocencio Teixeira de Oliveira
Obrigado, Jesse. Irei testar e reportar pra ti.
Funcionou, obrigado. 
 
Continuarei com a etapa final da migração das outras dependências. 
Por enquanto, sem bugs encontrados no contexto web e api.
 
Boa tarde Todos, alguém pode me ajudar com primeiro deploy no devops.caixa do SIEMP?
 
Boa tarde Patricia Vourakis Barbosa Braga, consegue um técnico pra apoiar a comunidade com o deploy do SIEMP?
 
sexta-feira 14:56 Patricia Vourakis Barbosa Braga iniciou uma reunião.

 
Importante!
Flavio de Almeida Gagliardi
Boa tarde Patricia Vourakis Barbosa Braga, consegue um técnico pra apoiar a comunidade com o deploy do SIEMP?
Flavio de Almeida Gagliardi pc , estamos em sala com o Sosthenes.
 
eap74-openjdk17-apache24-rhel93-v013
 
2026-11-06T18:10:31.6700432Z         "Servidores: \\\"caddeapllx2864.agil.nprd.caixa.gov.br\\\"", 
2026-11-06T18:10:31.6700557Z         "IPs: \\\"10.116.202.54\\\"", 
2026-11-06T18:10:31.6700671Z         "Gateways: \\\"10.116.192.1\\\"", 
2026-11-06T18:10:31.6700767Z         "IPs Backup: \\\"\\\"", 
2026-11-06T18:10:31.6700956Z         "Servidores (OBJ): \\\"caddeapllx2864.agil.nprd.caixa.gov.br\\\":{\\\"ip_address\\\":\\\"10.116.202.54\\\",\\\"ip_gateway\\\":\\\"10.116.192.1\\\",\\\"ip_backup\\\":\\\"\\\"}"
2026-11-06T18:10:31.6701106Z     ]
2026-11-06T18:10:31.6701193Z }
 
 
https://devops.caixa/projetos/Caixa/_apps/hub/ms.vss-distributed-task.hub-library?itemType=VariableGroups&view=VariableGroupView&variableGroupId=20013
 
JVM_HEAP_MIN
JVM_HEAP_MAX
JVM_METASPACE_MIN
JVM_METASPACE_MAX
PASSWORD_TRUSTSTORE
URL_APM_SERVER
 
 
 
Sosthenes Estrela Soares
Boa tarde Todos, alguém pode me ajudar com primeiro deploy no devops.caixa do SIEMP?
Assunto: Correções necessárias no projeto SIEMP para compatibilidade com JBoss EAP 7.4
1. Correção do standalone-full-ha.xml gerado pelo repositório siemp-java-web-config
Resumo
O arquivo standalone-full-ha.xml publicado pelo repositório siemp-java-web-config contém a configuração do subsistema mod_cluster, porém não possui todos os elementos obrigatórios para que o subsistema funcione corretamente no JBoss EAP 7.4.
Como consequência, após o deploy realizado pela esteira, o servidor não inicializa corretamente e é necessário alterar manualmente o arquivo no ambiente para que a aplicação suba.
Causa Identificada
Para utilização do subsistema:
 
<subsystem xmlns="urn:jboss:domain:modcluster:5.0">
 
são obrigatórios os seguintes componentes:
Elemento	Localização	Situação Atual
org.jboss.as.modcluster	<extensions>	Ausente
socket-binding modcluster	<socket-binding-group>	Ausente
modcluster:5.0	<profile>	Presente
Atualmente apenas o subsistema está configurado, resultando em inconsistência na inicialização do JBoss.
Ajuste Necessário
1. Adicionar a extensão
Em <extensions> incluir:
 
<extension module="org.jboss.as.modcluster"/>
 
2. Adicionar o socket binding
Em <socket-binding-group> incluir:
 
<socket-binding
    name="modcluster"
    multicast-address="${jboss.modcluster.multicast.address:224.0.1.105}"
    multicast-port="23364"/>
 
3. Manter o subsistema existente
 
<subsystem xmlns="urn:jboss:domain:modcluster:5.0">
    <proxy name="default"
           advertise-socket="modcluster"
           listener="ajp">
        <dynamic-load-provider>
            <load-metric type="cpu"/>
        </dynamic-load-provider>
    </proxy>
</subsystem>
 
Validação Adicional
Como o mod_cluster utiliza:
 
listener="ajp"
 
é necessário validar também:
Undertow
 
<ajp-listener name="ajp" socket-binding="ajp"/>
 
Socket Binding Group
 
<socket-binding
    name="ajp"
    port="${jboss.ajp.port:8009}"/>
 
Observação Importante
O arquivo standalone-ha.xml deve ser utilizado apenas como referência para os trechos relacionados ao mod_cluster.
Não substituir integralmente o standalone-full-ha.xml.
O perfil full-ha possui subsistemas adicionais que não existem no perfil ha, tais como:
ActiveMQ / Messaging
IIOP
demais componentes específicos do perfil full-ha
A substituição completa do arquivo causará perda dessas configurações.
Critérios de Validação
Após a correção:
Gerar nova release contendo o ajuste.
Executar novo deploy pela esteira.
Validar no server.log a conclusão do boot sem erros.
Confirmar a presença da mensagem:
 
WFLYSRV0025: JBoss EAP ... started
 
Confirmar que não há mais necessidade de qualquer alteração manual no standalone-full-ha.xml após novas implantações.
2. Correção do pom.xml do módulo siemp-ear
Resumo
Foi identificada uma configuração incorreta no empacotamento do módulo siemp-ear, que gera uma dependência inválida no MANIFEST.MF do EAR.
Causa Identificada
O build está gerando a seguinte entrada no manifesto:
 
Dependencies: deployment.framework.jar
 
Essa configuração é gerada a partir do arquivo:
 
siemp-ear/pom.xml
 
Impacto
Durante o deploy, o JBoss tenta resolver o módulo:
 
deployment.framework.jar
 
Entretanto o artefato framework.jar não é encontrado:
nem dentro do EAR;
nem como deployment independente;
nem como módulo disponível para o servidor.
Com isso o deploy falha apresentando erro semelhante a:
 
jboss.module.spec.service."deployment.framework.jar".main
 
e o EAR não é implantado completamente.
Ação Necessária
Revisar o arquivo:
 
siemp-ear/pom.xml
 
e remover a configuração abaixo, caso ela não seja mais necessária:
 
<manifestEntries>
    <Dependencies>
        deployment.framework.jar
    </Dependencies>
</manifestEntries>
 
Alternativa
Caso a dependência seja realmente obrigatória para a aplicação:
incluir o artefato framework.jar no empacotamento do EAR; ou
disponibilizá-lo como módulo/deployment acessível ao JBoss.
Dessa forma a referência declarada no MANIFEST.MF poderá ser resolvida corretamente durante o deploy.
Resultado Esperado
Após a correção do pom.xml:
o MANIFEST.MF não deverá conter referências inválidas;
o deploy do siemp-ear.ear deverá concluir sem erro de resolução de módulos;
não deverá ocorrer a falha:
 
jboss.module.spec.service."deployment.framework.jar".main
 
 
 
Helber Fernandes Rodrigues Sosthenes Estrela Soares Denilson Socrates de Sousa
Patricia Vourakis Barbosa Braga Flavio de Almeida Gagliardi PC 
 
Boa tarde,
Informo que estarei em período de férias no período de 09/11 a 20/11. Durante minha ausência, o colaborador Rafael Alves Lima ficará responsável pelo atendimento e acompanhamento das demandas sob minha responsabilidade.
 
Atenciosamente,
Marcos Aurélio da Silva Cavaco
 
sexta-feira 18:05 Reunião encerrada 3h 8min 24s Migração JBoss 7.4 - SIFEC, SICCR, SIEMP, SIPENsexta-feira, 6 de novembro de 2026 14:56 - 18:05Exibir recapitulação4ConteúdoTranscriçãoSISTEMAS JBOSS CEDESBR 1.xlsxADDR FEC,CCR,EMP,PEN -  Migração JBoss 7.4 - 2210.pdf+1

 
Thiago Jeferson de Sousa Silva
Assunto: Correções necessárias no projeto SIEMP para compatibilidade com JBoss EAP 7.4  1. Correção do standalone-full-ha.xml gerado pelo repositório siemp-java-web-config Resumo O arquivo stan…
Bom dia, O framework já está declarado como dependência Maven do módulo siemp-web, porém com escopo provided, indicando que seu fornecimento é responsabilidade do ambiente de execução. Além disso, o siemp-ear gera explicitamente a entrada Dependencies: deployment.framework.jar no MANIFEST.MF, reforçando que a arquitetura original da aplicação pressupõe a disponibilização do framework.jar pelo servidor. E assim funcionava no servidor anterior, pois esta parte não houve alterações. Assim, antes de alterar o empacotamento da aplicação, entendemos ser necessário alinhar qual será a estratégia oficial para o framework no EAP 7.4: distribuição pelo ambiente (deployment/módulo) ou empacotamento no EAR.
 
