Prezada Luciana,

Em atendimento à solicitação de Emerson Luiz Inglez Cardoso, referente à desmobilização e desativação do sistema SIRPL (item 25234924), informo que as ações foram concluídas nos ambientes DES e TQS, conforme detalhado abaixo.

TQS - camada de proxy (srjtqaprlx015, 10.116.20.76): instância Apache https-sirpl.tqs.intra.corerj.caixa8604 parada, desabilitada do início automático via chkconfig e diretório da instância renomeado para backup (https-sirpl.tqs.intra.corerj.caixa8604.desmobilizado_20260616).

TQS - camada de aplicação (srjtqapllx0018, 10.116.24.142): identificado serviço sirpl.service (systemd), executando o backend Node.js do SIRPL sob usuário root. Serviço parado, desabilitado e diretório da aplicação renomeado para backup (/opt/open/nodejs/sirpl.desmobilizado_20260616).

DES - camada de proxy (srjdeaprlx049, 10.116.85.230): instância Apache https-sirpl.des.intra.corerj.caixa8601 parada, desabilitada do início automático via chkconfig e diretório da instância renomeado para backup (https-sirpl.des.intra.corerj.caixa8601.desmobilizado_20260616).

DES - camada de aplicação (srjdeapllx0051, 10.116.88.212): identificado serviço sirpl.service (systemd), executando o backend Node.js do SIRPL sob usuário spnoddr1. Serviço parado, desabilitado e diretório da aplicação renomeado para backup (/opt/open/nodejs/sirpl.desmobilizado_20260616).

Em todos os quatro hosts foi confirmada, após a parada, a ausência de processos remanescentes e o encerramento do listening nas portas correspondentes (8601 e 8604).

Observação: nos hosts de aplicação (llx) de ambos os ambientes foi identificada uma unidade systemd órfã denominada sirpldb.service, sem unit file correspondente, mantendo apenas symlink de habilitação residual. O registro foi removido no host DES; no TQS a referência já não aparece após reload do daemon. Não havia processo ativo associado, sem impacto na desmobilização.

Pendências que ficam fora do escopo deste time e precisam ser tratadas separadamente:

Decommission dos bancos de dados SQL Server 2016 associados ao SIRPL (DES 10.116.92.87 e TQS 10.116.28.45), a cargo da equipe de DBA.
Avaliação e eventual remoção de regras de firewall específicas do SIRPL, caso existentes, a cargo da CETEL/Redes.

Os diretórios das aplicações e das instâncias Apache foram mantidos como backup (sufixo desmobilizado_20260616) e não foram excluídos definitivamente, permitindo restauração caso necessário.
