Causa identificada no repositório siemp-java-web-config:
 
O arquivo standalone-full-ha.xml foi publicado incompleto. Ele possui o subsistema do mod_cluster:
 
<subsystem xmlns="urn:jboss:domain:modcluster:5.0">
    ...
</subsystem>
 
 
mas não possui todos os elementos obrigatórios para esse subsistema funcionar no JBoss EAP 7.4.
 
O que deve ser feito no repositório:
 
Comparar o arquivo standalone-full-ha.xml com o standalone-ha.xml e replicar a configuração completa do mod_cluster, garantindo a existência dos itens abaixo:
 
Inclusão da extensão:
<extension module="org.jboss.as.modcluster"/>
 
 
na seção <extensions>.
 
Inclusão do socket binding:
<socket-binding name="modcluster"
    multicast-address="${jboss.modcluster.multicast.address:224.0.1.105}"
    multicast-port="23364"/>
 
 
na seção <socket-binding-group>.
 
Validar que o bloco do subsistema mod_cluster permaneça presente:
<subsystem xmlns="urn:jboss:domain:modcluster:5.0">
<proxy name="default" advertise-socket="modcluster" listener="ajp">
<dynamic-load-provider>
<load-metric type="cpu"/>
</dynamic-load-provider>
</proxy>
</subsystem>
 
 
Efeito observado em ambiente:
 
A ausência da extensão e do socket binding impede a inicialização correta do JBoss EAP 7.4, gerando erros de bootstrap do servidor relacionados ao subsistema modcluster, exigindo correção manual do standalone-full-ha.xml após o deploy.
 
Solicitação: ajustar o arquivo standalone-full-ha.xml no repositório para que ele fique consistente com a configuração de mod_cluster já existente no standalone-ha.xml, evitando intervenções manuais em futuras implantações.



melhora essa analise pra mmim
