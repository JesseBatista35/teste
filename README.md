Refizemos a captura simultânea nos 4 nós do Router do OKD4, agora filtrando corretamente pelo pool SNAT do Citrix ADC (10.116.4.144/28), conforme identificado pelo Jonathan. Localizamos a conexão exata do teste (10.116.4.151:54735 → 10.116.208.26:443, 18:30:13 UTC) usando o SNI em claro do ClientHello (a Route é edge, então o TLS é decriptado no Router).

Sequência completa da conexão, extraída do pcap:

18:30:13.517 → SYN / SYN-ACK / ClientHello / ServerHello+cert / Finished — TLS completo em ~27ms
--- 10s de silêncio total ---
18:30:23.545 → o SERVIDOR (backend real do SIGDA) fecha a conexão com FIN, por timeout de inatividade
18:30:23.606 → cliente confirma o FIN
--- mais 5s de silêncio ---
18:30:28.554 → o CLIENTE finalmente tenta enviar ~1700 bytes (a requisição HTTP) — tarde demais, servidor já fechou → RST

Conclusão: não é rede, DNS, firewall, VIP, SNAT nem Router. O TLS handshake completa perfeitamente em milissegundos. O problema é que o client HTTP (.NET) do SIGAQ demora ~15 segundos entre concluir o TLS e efetivamente escrever a requisição HTTP na conexão — nesse intervalo, o backend do SIGDA (com timeout de inatividade menor) já fechou o socket, e quando o client finalmente envia os dados, recebe RST.

Hipótese mais provável para esse atraso: o certificado do SIGDA tem um campo AIA (Authority Information Access) apontando para http://icptestes.caixa/certs/acicptestessub.cer. Se o SslStream/HttpClient do .NET estiver com verificação de revogação de certificado habilitada (CheckCertificateRevocationList = true), ele tenta validar a CRL/AIA nesse endpoint — que pode não ser alcançável a partir da AKS (rede/DNS interno Caixa) — e fica tentando até estourar timeout, atrasando o envio da requisição real.

Ação recomendada para o time de desenvolvimento do SIGAQ: verificar a configuração do HttpClientHandler/SocketsHttpHandler usado na chamada ao SIGDA — especificamente a flag de checagem de revogação de certificado — e desabilitá-la (ou garantir rota de rede da AKS até o endpoint de CRL/AIA interno da Caixa).
