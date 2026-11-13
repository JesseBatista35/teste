1. Intranet: reabrir o pedido de instalação do certificado

O certificado já foi gerado e só falta instalar.

Tente reabrir a REQ000146906949. Se o sistema não deixar, abra uma REQ nova do mesmo tipo.
Texto:

Reabertura da REQ000146906949 / WO0000082187699, encerrada por ausência do IP do VIP. O certificado (PKCS#12) já foi disponibilizado pela CEPRO na WO0000082187699.
• FQDN: sigsj-intranet.des.caixa (ainda sem DNS)
• IP do VIP: 10.116.180.8
• Balanceador: CADDEAPRLB003-1 — Vserver SSL: LB_VS_10.116.180.8_SSL_443
• VIP criado na WO0000082200842, que aguarda o certificado.
Favor seguir com a instalação no VIP.

2. Internet: ver a REQ000146906957 e pedir a instalação
Abra o histórico da WO dela.
Se o certificado foi gerado e a demanda fechou por falta do VIP, que é o mais provável: reabra ou abra uma nova com o mesmo texto do passo 1, trocando:
FQDN: sigsj-internet.des.caixa
IP do VIP: 10.116.181.214, vserver LB_VS_10.116.181.214_SSL_443
VIP criado na WO0000082201229
Se ainda estiver aberta: inclua uma nota informando o IP do VIP.
3. Boleto: abrir a REQ de certificado (TE079)

O certificado do boleto nunca foi gerado.

Certificado digital para sigsj-boleto.des.caixa (DES) – instalação em VIP
• FQDN: sigsj-boleto.des.caixa (ainda sem DNS)
• IP do VIP: 10.116.181.215
• Balanceador: CADDEAPRLB003-1 — Vserver SSL: LB_VS_10.116.181.215_SSL_443
• VIP criado na WO0000082200691, sem certificado. Nome sugerido: CT2026_SIGSJ-BOLETO.DES.CAIXA_WO82200691.
Favor gerar o certificado e seguir com a instalação no VIP.

4. Avisar na sala

Faça isso logo depois de abrir as REQs:

Pessoal, verifiquei as demandas de certificado:
• Intranet: o certificado já tinha sido gerado, mas a instalação parou porque o FQDN ainda não tem DNS e o IP do VIP não foi informado. Reabri/abri a REQ <número> informando o VIP 10.116.180.8.
• Internet: REQ <número> com o VIP 10.116.181.214.
• Boleto: o certificado não havia sido solicitado; abri a REQ <número> com o VIP 10.116.181.215.
Após a instalação dos certificados, sigo com as REQs de DNS.

5. Quando os certificados estiverem instalados
Abrir as REQs de DNS:
sigsj-intranet.des.caixa → 10.116.180.8
sigsj-internet.des.caixa → 10.116.181.214
sigsj-boleto.des.caixa → 10.116.181.215
Ajustar as variáveis de URL (URL_CUSTOMIZADA, URL_ALIAS, URL_REDIRECT, URL_REWRITE) nas três releases e rodar o DES.
Testar com nslookup <url>, que deve retornar o IP do VIP, e abrindo https://<url>/<contexto>/ no navegador.
6. Depois: TQS

Mesmo fluxo para as três aplicações em TQS: certificado com o VIP, criação do VIP, DNS e esteira. Também falta aplicar o log4j nas VMs de TQS (2863, 2865 e 2862).

Quando abrir as REQs, me passa os números que eu completo a mensagem da sala.






Histórico de Informações de Trabalho da Ordem de Trabalho
ID da Ordem de Trabalho	 WO0000082187699
Criado em	 04/11/2026 14:24:50
Criado por	 C065144
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Prezado Vitor

1    Informamos que, devido à ausência de informações sobre o VIP a ser instalado, esta demanda será concluída. Assim que a informação estiver disponível, a demanda poderá ser reaberta para que possamos redirecionar à equipe competente para a instalação do Certificado Digital.

2    Permanecemos à disposição para quaisquer esclarecimentos adicionais.

Atenciosamente,
CEPRO - CN PROTECOES EM SEGURANCA DIGITAL
ID da Ordem de Trabalho	 WO0000082187699
Criado em	 04/11/2026 08:45:38
Criado por	 P935210
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 À CEPRO,
Solicito a gentileza de informar o VIP a ser instalado.

Atenciosamente,
Clara Dias.
TELEDATA/CETEL/REDE DATA CENTER
ID da Ordem de Trabalho	 WO0000082187699
Criado em	 04/11/2026 08:38:15
Criado por	 P705068
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 À

Prezados,

O fqdn não possui resolução de nome, por favor informar o vip a ser instalado.

Att,
Weverton de Oliveira Silva
Analista de infraestrutura - Redes
TELEDATA/CETEL/REDES
ID da Ordem de Trabalho	 WO0000082187699
Criado em	 03/11/2026 16:15:00
Criado por	 P502678
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Para instalação no VIP.
ID da Ordem de Trabalho	 WO0000082187699
Criado em	 03/11/2026 16:14:40
Criado por	 P502678
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Prezados(as),

1 – Disponibilizaremos o arquivo PKCS#12 através de compartilhamento de arquivo no OneDrive.

2 - Para solicitar o arquivo PKCS#12 e a inserção da senha do certificado no momento da instalação no ambiente o técnico deverá ingressar em um dos canais na equipe criada no Teams para essa finalidade. As orientações de como acessar a equipe e o link para os canais estão disponíveis através do link https://caixa.sharepoint.com/:w:/r/teams/O365GRP-CESET-Inserodesenhas/Documentos%20Compartilhados/General/Instru%C3%A7%C3%B5es%20da%20Equipe.docx?d=w427f7e74198a45bb91f6335e8595bde2&csf=1&web=1&e=0iQbhI

03 – Caso seja necessário extrair do arquivo PKCS#12 os arquivos .crt e .key, executar os comandos abaixo:

openssl pkcs12 -in INFILE.p12 -out OUTFILE.key -nodes -nocerts
openssl pkcs12 -in INFILE.p12 -out OUTFILE.crt -nokeys

Obs.: será solicitada a senha do arquivo PKCS#12.

Duvidas: https://www.ssl.com/pt/como/chave-privada-de-certificados-de-exporta%C3%A7%C3%A3o-do-arquivo-pkcs12-com-openssl/

4 - Informamos que a cadeia de certificados NPRD (ACInternaIcptestes) está disponível em http://icptestes.caixa/ .

 
Atenciosamente,
CAIXA/CEPRO/CN de Segurança Cibernética
ID da Ordem de Trabalho	 WO0000082187699
Criado em	 03/11/2026 16:12:49
Criado por	 Remedy Application Service
Origem de Comunicação	 E-mail
Exibir Acesso	 Interno
Notas	 Este ticket foi criado a partir do sistema de solicitação de serviço.
Impresso por P585600 em Sexta-feira, 13/11/2026 10:40:38
