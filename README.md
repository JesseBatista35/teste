Atualização ADDR SIGSJ – 13/11

✅ Aplicações em DES

SIGSJ-intranet, SIGSJ-internet e SIGSJ-boleto implantados e no ar em DES.
SIGSJ-internet: com o SIROT embutido no build (e as bibliotecas ceflog/ceflib incluídas pela fábrica), a release voltou a subir normalmente. Do lado da esteira, removemos o SIROT externo do servidor e ajustamos o config para o SIROT embutido.

✅ Log4j em DES
Com os XMLs do legado enviados pela Gisele, configuramos o log4j nos três sistemas, e as aplicações estão gravando normalmente:

Intranet: /log_jboss/sigsj_intranet/sigsj_intranet.log
Internet: /log_jboss/sigsj_internet/sigsj_internet.log
Boleto: /log_jboss/sigsj_internet/<nome-do-servidor>.log (padrão do legado)
Obs.: a esteira executa o custom.sh apenas se ele já existir na VM, sem copiá-lo do repositório de config. Por isso, a configuração foi aplicada diretamente nas VMs. Ela permanece entre as releases e só se perde se a VM for recriada. Já acionamos o time da esteira sobre a forma definitiva de entrega.

🌐 URLs customizadas – DES
VIPs criados pela Rede, apontando para as VMs na porta 80:

sigsj-intranet.des.caixa → VIP 10.116.180.8
sigsj-internet.des.caixa → VIP 10.116.181.214
sigsj-boleto.des.caixa → VIP 10.116.181.215

As REQs anteriores de certificado foram encerradas por falta do IP do VIP. Foram abertas novas solicitações, já com VIP, balanceador e nome sugerido:

Intranet: REQ000147048801 / WO0000082298919
Internet: REQ000147047987 / WO0000082299045
Boleto: REQ000147048948 / WO0000082298966

DNS aberto em paralelo, conforme alinhado com o Emanuel:

sigsj-intranet.des.caixa → REQ000147049343 / WO0000082299800
sigsj-internet.des.caixa → REQ000147049349 / WO0000082299807
sigsj-boleto.des.caixa → REQ000147048895 / WO0000082299364

📌 Próximos passos

DES:

Acompanhar a instalação dos certificados nos VIPs e a criação do DNS.
Concluídas essas etapas, ajustar as variáveis de URL nas releases e validar o acesso pelas novas URLs.

TQS (ainda não iniciado):

Confirmar os nomes das URLs de TQS.
Abrir as REQs de VIP primeiro, para obter o IP de cada VIP.
Com o IP dos VIPs, abrir as REQs de certificado e de DNS.
Aplicar a configuração do log4j nas VMs de TQS.

Qualquer dúvida, fico à disposição!
