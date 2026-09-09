Aqui estão as propriedades do certificado expirado (Certificate[1] — o certificado da entidade, não da CA):

Campo	Valor
CN	Eco Caixa
OU	CBC H104
O	IF 104
ST	SC
C	BR
E-mail	if@eco.com
Número de série	84
Emissor (Issuer)	CN=Dataprev ECO, O=Dataprev, C=BR
Validade	25/08/2025 até 25/08/2026 (expirado)
Algoritmo de assinatura	SHA1withRSA
Chave	RSA 2048 bits
Extended Key Usage	clientAuth, serverAuth
SHA256 fingerprint	51:73:C7:2C:C9:99:DB:AE:6F:D2:47:49:32:38:46:3A:48:36:DC:2A:10:B9:78:FE:02:D3:E5:C7:B3:3C:09:D2

O Certificate[2] na cadeia é a própria CA emissora (autoassinado, CN=Dataprev ECO), válido até 2028 — não é o expirado, só faz parte da cadeia.

Um detalhe útil pra quem for solicitar a renovação junto ao Dataprev: o CN=Eco Caixa / O=IF 104 / serial 84 é o identificador que eles vão precisar pra localizar e reemitir esse certificado específico do lado deles.
