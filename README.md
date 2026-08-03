Estou enfrentando falha de acesso ao cache DataGrid no ambiente DES.

A aplicação conecta ao endpoint configurado, autentica com sucesso e recebe a versão do Infinispan, porém falha ao processar a topologia retornada pelo cluster.

Configuração utilizada:
quarkus.infinispan-client.hosts=rhdg.sispi-datagrid-des.svc
quarkus.infinispan-client.username=developer

A aplicação sobe e retorna:
ISPN004021: Infinispan version: Infinispan 'I'm Still Standing' 15.0.8.Final

Ao tentar acessar o cache:
ISPN004005: Error received from the server:
java.lang.IllegalArgumentException:
No interface address matching '/25.129.4.33'
in MultiHomedServerAddress{
    port=11222,
    addresses=[
        /25.130.4.24/23,
        /127.0.0.1/8
    ]
}

Observe que o cliente consegue conectar ao serviço rhdg.sispi-datagrid-des.svc (porta HotRod 11222), mas falha após receber os endereços retornados pelo servidor.
