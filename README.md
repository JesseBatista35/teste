Encaminhamento – Time de Nuvem (CAIXAAZURE)
Prezados,
Encaminhamos a presente demanda para análise do time de Nuvem, por se tratar de falha relacionada à infraestrutura/conectividade do ambiente CAIXAAZURE.
Sistema: SIGAM
Pipeline: sigam-gestao (buildId 202414)
Ambiente: Aplicação nas Esteiras DevOps
Resumo da falha:
A build do artefato falha na etapa Docker build, durante o download da imagem base mcr.microsoft.com/openjdk/jdk:21-mariner. O download trava repetidamente em 33.55MB/197.77MB por cerca de 380s e a conexão é então encerrada pelo destino:
ERROR: failed to build: failed to solve: failed to copy: read tcp 10.245.252.143:51398->150.171.70.10:443: read: connection reset by peer
Análise preliminar:
A falha não está relacionada ao código da aplicação, e sim à conectividade/egress do agente da esteira (10.245.252.143) com o Microsoft Container Registry (MCR / 150.171.70.10:443). O padrão de travamento e o connection reset by peer sugerem interrupção da conexão a nível de proxy/firewall/egress do ambiente CAIXAAZURE.
Solicitação ao time de Nuvem:
Verificar a estabilidade e as regras de egress/proxy do ambiente CAIXAAZURE para acesso ao mcr.microsoft.com (e IPs de CDN associados), bem como a disponibilidade de mirror/registro interno das imagens base, de forma a eliminar a dependência de acesso externo direto.
Contato: Teams Aaron – f540797
Status: Em análise – encaminhado ao time de Nuvem.
