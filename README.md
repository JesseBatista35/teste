Esse erro é clássico de client intelligence / topology-aware routing do Hot Rod, e não é bug de aplicação — é configuração de rede/multi-homed no lado do servidor RHDG (Infinispan).

O que está acontecendo:

O RHDG está publicado com endereços "multi-homed" (MultiHomedServerAddress), ou seja, o servidor tem mais de um endereço advertised e escolhe qual devolver ao cliente baseado na sub-rede de origem da conexão. No seu caso:

O servidor conhece apenas o range 25.130.4.24/23 (mais loopback 127.0.0.1/8) como redes válidas para mapear endereço de retorno.
Seu cliente está conectando a partir de 25.129.4.33, que não cai em nenhuma dessas sub-redes configuradas.
Resultado: o servidor autentica normal, devolve a versão do Infinispan, mas ao montar a topologia do cluster (ISPN004005) ele não consegue decidir qual endereço devolver pro seu cliente → IllegalArgumentException: No interface address matching.

Ou seja: o pod da sua aplicação está numa sub-rede (namespace/projeto TQS) que não está cadastrada no mapeamento de redes (networks) do conector externo do RHDG.

Isso não se resolve na sua aplicação/pipeline. É configuração do lado do cluster RHDG (CR do DataGrid / router externo, seção de networks que mapeia CIDR → endereço advertised). Precisa ser ajustado por quem administra o cluster Data Grid (normalmente time de Nuvem/plataforma, não o time de aplicação).

Alternativa rápida (paliativa) enquanto não resolve infra: forçar client-intelligence para BASIC no client, o que evita o cliente tentar resolver topologia via múltiplos endereços (mas perde balanceamento/failover):

properties
quarkus.infinispan-client.client-intelligence=BASIC

Isso costuma contornar o erro em ambiente DES enquanto aguarda o fix definitivo.

Sugestão de nota para escalar ao time de infra/DataGrid:

Prezados,

Identificamos falha de acesso ao cache no cluster RHDG do ambiente DES (rhdg.sispi-datagrid-des.svc, porta 11222). A aplicação autentica com sucesso, porém falha ao processar a topologia retornada pelo servidor, com o erro:

ISPN004005: Error received from the server: java.lang.IllegalArgumentException: No interface address matching '/25.129.4.33' in MultiHomedServerAddress{ port=11222, addresses=[ /25.130.4.24/23, /127.0.0.1/8 ] }

O endereço de origem do pod da aplicação (25.129.4.33) não está contemplado nas redes configuradas no conector multi-homed do RHDG, que atualmente reconhece apenas 25.130.4.0/23. Solicitamos a inclusão da sub-rede do namespace TQS correspondente no mapeamento de "networks" do conector externo do Data Grid, de forma que o servidor consiga devolver o endereço correto de topologia para clientes conectando a partir dessa faixa.

Atenciosamente.
