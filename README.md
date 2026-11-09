
 
 
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
 
