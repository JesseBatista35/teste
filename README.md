
Last login: Tue Nov 17 10:03:31 2026 from 10.211.12.57
[p585600@cadsvitrlx100 ~]$ ssh 10.116.94.187
The authenticity of host '10.116.94.187 (10.116.94.187)' can't be established.
RSA key fingerprint is SHA256:kW3+up6ZqR6TzRpM6HJqeaxubKmfk9tEF23IalktbPs.
This host key is known by the following other names/addresses:
    ~/.ssh/known_hosts:7: 10.116.94.203
    ~/.ssh/known_hosts:15: 10.116.88.25
    ~/.ssh/known_hosts:81: 10.116.88.30
    ~/.ssh/known_hosts:112: 10.116.88.24
    ~/.ssh/known_hosts:114: 10.116.88.20
    ~/.ssh/known_hosts:153: 10.116.89.252
    ~/.ssh/known_hosts:156: 10.116.84.136
    ~/.ssh/known_hosts:157: 10.116.84.137
    (2 additional names omitted)
Are you sure you want to continue connecting (yes/no/[fingerprint])? yes
Warning: Permanently added '10.116.94.187' (RSA) to the list of known hosts.
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
p585600@10.116.94.187's password:
Creating home directory for p585600.
-sh-4.1$
-sh-4.1$
-sh-4.1$
-sh-4.1$ curl -k -s -m 10 -o /dev/null -w "%{http_code}\n" https://logindes.caixa.gov.br/auth/realms/internet/protocol/openid-connect/certs; curl -k -s -m 10 -v https://logindes.caixa.gov.br/auth/realms/internet/protocol/openid-connect/certs 2>&1 | grep -iE 'SSL|error|connect' | head -5
200
* About to connect() to logindes.caixa.gov.br port 443 (#0)
*   Trying 10.116.81.75... connected
* Connected to logindes.caixa.gov.br (10.116.81.75) port 443 (#0)
* warning: ignoring value of ssl.verifyhost
* skipping SSL peer certificate verification
-sh-4.1$
-sh-4.1$
-sh-4.1$
-sh-4.1$
