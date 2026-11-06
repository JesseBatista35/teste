Assunto: SIEMP-java-web — standalone-full-ha.xml com configuração incompleta do mod_cluster (repositório siemp-java-web-config)

Resumo
O standalone-full-ha.xml publicado no repositório siemp-java-web-config declara o subsistema modcluster, mas não tem a extensão nem o socket binding de que esse subsistema depende. Com isso, o JBoss EAP 7.4 não inicializa corretamente após o deploy pela esteira, e é preciso corrigir o arquivo manualmente no servidor a cada implantação.

Evidência
Erro no boot do JBoss após o deploy:

[colar aqui o trecho do server.log com o erro de bootstrap]

Causa
Para o subsistema urn:jboss:domain:modcluster:5.0 funcionar, três elementos precisam estar presentes juntos no arquivo. No standalone-full-ha.xml atual só existe o terceiro:

Elemento	Seção	Situação no arquivo
Extensão org.jboss.as.modcluster	<extensions>	Ausente
Socket binding modcluster	<socket-binding-group>	Ausente
Subsistema modcluster:5.0	<profile>	Presente

Sem a extensão, o JBoss não consegue interpretar o bloco do subsistema e o parse da configuração falha. Sem o socket binding, o advertise-socket="modcluster" referencia um recurso que não existe.

Correção solicitada no repositório

Em <extensions>, incluir:
xml
<extension module="org.jboss.as.modcluster"/>
Em <socket-binding-group>, incluir:
xml
<socket-binding name="modcluster" multicast-address="${jboss.modcluster.multicast.address:224.0.1.105}" multicast-port="23364"/>
Manter o subsistema como está:
xml
<subsystem xmlns="urn:jboss:domain:modcluster:5.0">
    <proxy name="default" advertise-socket="modcluster" listener="ajp">
        <dynamic-load-provider>
            <load-metric type="cpu"/>
        </dynamic-load-provider>
    </proxy>
</subsystem>
Como o proxy usa listener="ajp", confirmar também:
no subsistema undertow, a existência de <ajp-listener name="ajp" socket-binding="ajp"/>;
no <socket-binding-group>, a existência de <socket-binding name="ajp" port="${jboss.ajp.port:8009}"/>.

Observação importante
O standalone-ha.xml deve ser usado apenas como referência para os trechos do mod_cluster. Não substitua o arquivo inteiro: o perfil full-ha tem subsistemas que o ha não tem (messaging/ActiveMQ, IIOP etc.), e copiar o arquivo todo removeria essas configurações.

Validação após o ajuste

Gerar nova release a partir do commit corrigido.
Confirmar no server.log que o boot termina sem erro (WFLYSRV0025 ... started).
Confirmar que não é mais necessário alterar o standalone-full-ha.xml manualmente no servidor.
