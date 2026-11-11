Aplicando esse passo a passo ao SIEMP:

Passo	Situação	Evidência
1. Gerar certificado (TE079)	✅ Feito	REQ000146999232, CN=siemp.des.caixa, AC Icptestes Sub
2. Criar o VIP	✅ Feito	WO0000082252343, VIP 10.116.180.9 no CADDEAPRLB003-1
3. Importar o certificado no balanceador (CEPRO)	✅ Feito	WO0000082245892, importado no LB003-1 e associado ao vserver 443
4. Balancear para o servidor Linux (Terraform, porta 80)	✅ Feito	Pool apontando para 10.116.202.54:80 (caddeapllx2864); validado com curl
5. DNS resolver para o VIP	⏳ Pendente	Abrir a REQ: siemp.des.caixa → 10.116.180.9
Regra da fábrica para a 443	⏳ Fábrica	A fábrica pede a regra rede DEV/VPN → 10.116.180.9:443
