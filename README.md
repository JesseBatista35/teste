REQ000146959849 (DES)

Atendimento referente à indisponibilidade de comunicação do SIPGC (Api de Informações, ambiente DES) com o serviço SIGOC.

Diagnóstico: de dentro do pod sipgc-api-informacoes-des, o des.sigoc.caixa resolve (10.116.26.110), mas a conexão TCP na porta 443 não é estabelecida (sem conexão). A causa é bloqueio de rede (firewall), e não da aplicação.

Ação realizada: identificado o bloqueio e passados ao time do SIPGC os dados para a regra de comunicação (origem sipgc-api-informacoes-des, destino des.sigoc.caixa 10.116.26.110, TCP 443). A regra foi solicitada pelo time do SIPGC (pedido 98711 / regra 1033850) e está em tratamento pela CETEL.

Pendência: validar a conectividade após a aplicação da regra. Caso a conexão persista bloqueada, reabrir ou abrir nova solicitação informando o resultado do teste.

Atendimento encerrado do lado de esteiras.

REQ000146959859 (TQS)

Atendimento referente à indisponibilidade de comunicação do SIPGC (Api de Informações, ambiente TQS) com o serviço SIGOC.

Diagnóstico: o pod de TQS estava configurado para consumir des.sigoc.caixa (appsettings, Sigoc:BaseUrl), e a porta 443 desse destino não abre a partir de TQS. O host correto de TQS identificado é hom.sigoc.caixa (10.123.20.225). De dentro do pod de TQS, o DNS resolve, mas a porta 443 também não abre (sem conexão).

Ação realizada: levantados os dados para a regra de comunicação (origem sipgc-api-informacoes-tqs, destino hom.sigoc.caixa 10.123.20.225, TCP 443) e repassados ao time do SIPGC, que solicitará a regra, como foi feito em DES.

Pendências: (1) aplicação da regra de firewall; (2) troca do Sigoc__BaseUrl na library de TQS para https://hom.sigoc.caixa/sigoc-web/rest, após a regra; (3) validação da conectividade. Caso persista o bloqueio, abrir nova solicitação informando o resultado do teste.

Atendimento encerrado do lado de esteiras.
