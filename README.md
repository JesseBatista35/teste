Nota de investigação – Comunicação SIGAQ (AKS DES) → SIECM/on-premises DES

Demanda original: viabilizar/investigar comunicação entre o SIGAQ (AKS DES, apps.nprd.caixa) e o ambiente on-premises DES, reportada com sintoma de conexão sendo aberta e cortada logo em seguida.

Investigação de rede (concluída):

Identificado bloqueio de acesso próprio ao cluster AKS DES via kubectl, tanto por VPN corporativa quanto por Cloud Shell, por falha de resolução da zona DNS privada (fora da VNet correta). Acesso obtido via VM jumper integrada à VNet (equipe Nuvem/COE, Silas Pereira da Costa Neto).
Testes realizados de dentro de um pod do SIGAQ contra o destino sigda-api-quarkus-des.apps.nprd.caixa (10.116.180.64:443): resolução DNS correta, conexão TCP e handshake TLS concluídos com sucesso.
Captura de pacotes realizada pela equipe de Redes Extranet e Nuvem (Jonathan) em CNPRDFW001-1, com duas conexões amostradas: ambas mostram handshake TCP/TLS limpo, seguido de aproximadamente 10 segundos sem tráfego de aplicação (nenhuma requisição HTTP enviada pelo teste), e encerramento gracioso via FIN/ACK partindo do servidor de destino (não há RST nem indício de bloqueio no meio do caminho).
Conclusão: não há bloqueio de rede/firewall entre o AKS DES e o ambiente on-premises DES para esse destino/porta. A frente de rede está descartada como causa.

Pendência – investigação em andamento (lado da aplicação):

Como a rede está confirmada como funcional, a investigação segue para o lado da aplicação SIGAQ, buscando entender por que a chamada real (não o teste manual) não completa a requisição dentro do tempo esperado. Ponto de atenção identificado durante os testes: erro de validação de certificado (verify return code 21, unable to verify the first certificate) na cadeia AC Icptestes Sub/Raiz — a ser confirmado se afeta o cliente HTTP real da aplicação (truststore Java/Quarkus), padrão já observado anteriormente em outras integrações (SIALI, SIFUG).
