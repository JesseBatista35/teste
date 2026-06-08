me ajuda a atender essa demanda:

	Contratações e Logística
Formas de contato*:	Teams
Descrição da necessidade*:	Prezados, solicito apoio de rede para encontrar o redirecionamento para a API do SIGCT em TQS - https://tqssigct.df.caixa/sigct_backend/rest/

A API responde no contexto sigct_backend/rest/, mas não está no arquivo NGINX

Precisamos de uma solução para aplicar em produção em seguida


À
TELEDATA/CETEL/REDES,

 - Informo que o tqssigct.df.caixa é resolvido pelo IP 10.116.83.19, que se trata de um servidor real, portanto não há atuação ou gerência da equipe de Redes - Datacenter.


Att,
Magnus dos Santos Silva
Analista de Datacenter - Redes
TELEDATA/CETEL/REDES

À CTIS / CESTI Esteira DEVOPS DES TQS NPRD, 

Demanda não é de pertinência a equipe de redes.

Atenciosamente,
Susane de Oliveira
Preposta de Redes Datacenter


Last login: Mon Jun  8 11:15:03 2026 from 10.211.12.55
[p585600@cadsvitrlx100 ~]$ ssh 10.116.83.19
The authenticity of host '10.116.83.19 (10.116.83.19)' can't be established.
RSA key fingerprint is SHA256:pklhd9PSmkC1DIlyGBJBBscYjZwsrxfkoFC4v6zoldk.
This key is not known by any other names
Are you sure you want to continue connecting (yes/no/[fingerprint])? yes
Warning: Permanently added '10.116.83.19' (RSA) to the list of known hosts.
***********************************************************************
(1) - Este e um computador privado de propriedade da Caixa Economica
Federal. Usuarios autorizados e nao autorizados nao possuem direitos de
divulgar as informacoes contidas aqui.
(2) - Ao fazer uso do sistema, o usuario esta ciente que pode estar
sendo monitorado, interceptado e auditado pelo departamento competente
da Caixa Economica Federal.
(3) - O uso nao autorizado ou improprio deste sistema pode resultar em
um processo disciplinar administrativo e/ou punicao atraves de acoes
civis ou criminais. Ao continuar o uso deste sistema, indica que voce
esta ciente e concordando com os termos e condicoes acima descritos.

Pressione <Control+D> IMEDIATAMENTE se voce nao concorda com as
condicoes deste aviso
***********************************************************************
p585600@10.116.83.19's password:
Creating home directory for p585600.
-sh-4.1$ hostname -I
10.116.83.19
-sh-4.1$ hostname
sctdeapllx0018.df.caixa
-sh-4.1$


