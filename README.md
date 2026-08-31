Executar publicação dos pacotes abaixo localizados em \\CD0000NT050.corecaixa\ATUALIZACAO\SICTD\SICTD_V3.13.49.133.51 no EAP 6.4 de DESENVOLVIMENTO. Parar a instância e realizar manutenção completa nos arquivos de cache do host.

Prezados,
Solicitamos a publicação dos pacotes abaixo localizados em \\CD0000NT050.corecaixa\ATUALIZACAO\SICTD\SICTD_V3.13.49.133.51 no EAP 6.4 de DESENVOLVIMENTO. Parar a instância e realizar manutenção completa nos arquivos de cache do host.

● Deploy apenas nas instâncias abaixo:

SICTD-SERVER
https://sictd.desenvolvimento.caixa/contexpress-server/
sictd-server-intranet_3.13.49.133.51.ear

SICTD-DIGITALIZAR-INTRANET
https://sictd-digitalizar.des.caixa/sictd-digitalizar/
sictd-digitalizar-intranet_3.13.49.133.51.ear

● Efetuar o download dos novos pacotes de instalação (sictd-server-intranet_3.13.49.133.51.ear e sictd-digitalizar-intranet_3.13.49.133.51.ear).
\\CD0000NT050.corecaixa\ATUALIZACAO\SICTD\SICTD_V3.13.49.133.51
● Parar todas as instâncias do SICTD
● Efetuar cópia dos pacotes (.ear) atualmente instalados no JBoss para backup.
● Parar o HC (Host Controller do JBoss EAP).
● Limpar os arquivos temporários do JBoss (este passo é MUITO IMPORTANTE para que os arquivos do antigo deploy sejam apagados) localizados em: /opt/jboss/jboss-eap-digitalizar/hc/tmp
● Manter o JBoss parado
● Reiniciar a aplicação após o deploy.


SICTD apdctd	6.4	VERDADEIRO	http://apdctd-sictd.des.caixa/	LX0004	10.116.88.23		
SICTD INTRANET	6.4	VERDADEIRO	http://sictd.desenvolvimento.extracaixa/	LX0004	10.116.88.23		LX0004
SICTD INTRANET	7.1	VERDADEIRO	http://sictd-intranet.des.caixa/	LX099	10.116.94.206		
SICTD jklnctd	6.4	VERDADEIRO	https://jklnctd-sictd-digitalizar.des.caixa	LX0004	10.116.88.23		
SICTD-DIGITALIZAR-INTRANET	6.4	VERDADEIRO	http://sictd-digitalizar.des.caixa/sictd-digitalizar/	LX0004	10.116.88.23		LX0004
SICTD-INTERNET	6.4	VERDADEIRO	http://sictd-internet.desenvolvimento.extracaixa/	LX0004	10.116.88.23		LX0004
<img width="2089" height="121" alt="image" src="https://github.com/user-attachments/assets/2bd823f8-6938-4733-afc6-b23e6b513660" />
