Prezados,

Identificamos falha recorrente de acesso ao cache no cluster RHDG do ambiente DES (rhdg.sispi-datagrid-des.svc, porta 11222), afetando a aplicação sispi-dict-balde-chaves-des. A aplicação autentica com sucesso e recebe a versão do Infinispan, porém falha ao processar a topologia retornada pelo servidor, com o erro:

ISPN004005: Error received from the server: java.lang.IllegalArgumentException: No interface address matching '/<IP_DO_POD>' in MultiHomedServerAddress{port=11222, addresses=[/25.130.4.24/23, /127.0.0.1/8]}

O erro foi observado repetidamente em diferentes execuções do pod, com IPs de origem distintos (25.129.4.33 e 25.130.14.33), ambos fora do range 25.130.4.0/23 atualmente reconhecido pelo conector multi-homed do RHDG. Isso indica que a sub-rede real de alocação de IPs do namespace do ambiente DES não está contemplada no mapeamento de "networks" do conector externo do Data Grid, causando falha persistente independente do IP específico do pod.

Solicitamos a revisão e atualização do mapeamento de redes (networks) do RHDG no ambiente DES, incluindo a(s) sub-rede(s) correta(s) do namespace da aplicação, de forma que o servidor consiga devolver o endereço de topologia adequado para qualquer IP de origem dentro dessa faixa.

Atenciosamente.
]



Não, isso não é time de desenvolvimento — é escalonamento pra time de Nuvem/Infra, mesma linha do Jesse da Silva Lucas.

O motivo: o problema está na configuração do cluster RHDG (Red Hat Data Grid) em si — mais especificamente no mapeamento de redes (networks) do CR do Data Grid que define quais sub-redes/CIDR o servidor reconhece pra devolver endereço de topologia (multi-homed). Isso é infraestrutura de plataforma/cluster, não código da aplicação.

Time de desenvolvimento entraria só se:

a aplicação estivesse configurada errado (client-intelligence, hosts, cache-name) — não é o caso, a config do Quarkus está correta;
fosse erro de lógica de negócio no tratamento da exceção — também não é o caso, o app já trata o erro (Prosseguindo sem verificacao de ataque de leitura), só que isso indica que a feature de cache está sempre falhando silenciosamente, o que é sintoma, não causa.

Quem resolve de fato:

Quem administra/provisiona o RHDG (geralmente time de Nuvem Pública/Plataforma, que mantém o CR do DataGrid, Infinispan CRD, networks section);
Possivelmente também Rede/Cetel se o problema for de fato a sub-rede do namespace TQS/OKD não estar cadastrada no lado do cluster (overlap entre range do SDN e range aceito pelo RHDG).
