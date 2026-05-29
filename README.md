Nota Técnica – Análise em andamento
A falha na build do artefato na esteira DevOps do SIGAM (pipeline sigam-gestao, buildId 202414) ocorreu durante a etapa Docker build, no momento de download da imagem base mcr.microsoft.com/openjdk/jdk:21-mariner.
O log indica interrupção da conexão durante o download da camada da imagem:
ERROR: failed to build: failed to solve: failed to copy: read tcp 10.245.252.143:51398->150.171.70.10:443: read: connection reset by peer
Observa-se que o download travou repetidamente em 33.55MB/197.77MB e, em seguida, a conexão foi encerrada pelo peer (connection reset by peer) com o endpoint do Microsoft Container Registry (MCR / 150.171.70.10:443).
Trata-se, a princípio, de uma falha de conectividade/rede no acesso ao repositório de imagens externo, e não de erro no código da aplicação. A análise da causa-raiz está em andamento (verificação de estabilidade de rede, proxy/egress e disponibilidade do MCR no momento da execução).
Status: Pendente – em análise.
