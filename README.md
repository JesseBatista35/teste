Campo	Valor
Informe a solicitação	Inclusão (ou Alteração, conforme o teste acima)
Endpoint de internet?	Não
Ambiente	On premise
Tipo de registro	Host (A)
Nome DNS	siemp.des.caixa
Endereço IP	o IP do VIP, o que termina em 9, que o Paulo pediu para colocar no chat. Copie de lá. Não é o IP da VM.
Unidade/Coordenação Demandante	CESTI

Descrição/Observação:

Inclusão de registro DNS do tipo Host (A) para a aplicação SIEMP (ambiente DES), no contexto da ADDR “Migração JBoss 7.4 - SIFEC, SICCR, SIEMP, SIPEN”.

O nome siemp.des.caixa deve resolver para o IP do VIP já criado para a aplicação. O certificado já está instalado no VIP, e o VIP responde na porta 443 e encaminha para o servidor da aplicação (caddeapllx2864 – 10.116.202.54). Testes de conexão no VIP via 443 foram realizados com sucesso.

Solicitante: Jessé Batista (P585600) – CESTI / Esteiras DevOps NPRD.

Se tiver o número da REQ do VIP ou do certificado, inclua na descrição. Isso ajuda o time de DNS a validar mais rápido.

Antes de enviar, confira se o IP do VIP está no campo. Depois de aprovado, o teste é nslookup siemp.des.caixa devolvendo o IP do VIP e a URL abrindo no navegador.
