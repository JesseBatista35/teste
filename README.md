Esse 404 pode ser normal: muitos módulos web não têm página na raiz do contexto, só nas rotas internas. Também pode ser o Apache/VIP que não está encaminhando esse contexto. Os comandos abaixo, na sua estação, separam as duas coisas:

curl -k -s -i https://migracaosifec.des.caixa/ccr-parametros-web/ | more

Olhe o cabeçalho Server: e o corpo da resposta:

Se o 404 vem do JBoss (corpo curto Not Found, sem cabeçalho de Apache), o contexto está no ar e só falta a página certa.
Se vem do Apache (página HTML “Not Found... Apache”), o contexto não está sendo encaminhado para o JBoss. Aí a correção é do nosso lado.

Teste também a página inicial explícita:

curl -k -s -o /dev/null -w "%{http_code}\n" https://migracaosifec.des.caixa/ccr-parametros-web/index.html
curl -k -s -o /dev/null -w "%{http_code}\n" https://migracaosifec.des.caixa/ccr-parametros-web/index.jsf

O teste mais seguro é pedir ao João Pedro a URL que ele usa para abrir o parametros-web no 6.4. Aí é só trocar o host por migracaosifec.des.caixa.

Hash do pacote

O sha1 do 6.4 (3.2.0.1-b1073) é 17eb02c18df167b8c50d388445f7a02cd4dd2c9e. Falta o do 7.4. Na 471:

sudo grep -A2 'deployment name="SICCR-PARAMETROS"' $(sudo find /opt/jboss -name domain.xml -path '*configuration*' | head -1)
Sha1 igual: o pacote do 7.4 é o mesmo 3.2.0.1-b1073.
Diferente: é outro build, e precisamos confirmar com o João Pedro e com a planilha qual deve ficar.
Como o Claude está se saindo nesta sessão?




C:\Users\p585600>curl -k -s -i https://migracaosifec.des.caixa/ccr-parametros-web/ | more
HTTP/1.1 404 Not Found
Date: Wed, 11 Nov 2026 15:05:58 GMT
Server: Apache/2.4.57 (Red Hat)
Content-Length: 0
Content-Type: text/html; charset=UTF-8



C:\Users\p585600>curl -k -s -o /dev/null -w "%{http_code}\n" https://migracaosifec.des.caixa/ccr-parametros-web/index.html
404

C:\Users\p585600>
C:\Users\p585600>
C:\Users\p585600>
C:\Users\p585600>curl -k -s -o /dev/null -w "%{http_code}\n" https://migracaosifec.des.caixa/ccr-parametros-web/index.jsf
404

C:\Users\p585600>
C:\Users\p585600>
C:\Users\p585600>




#1) Respect the privacy of others.
    #2) Think before you type.
    #3) With great power comes great responsibility.

[sudo] password for p585600:
[p585600@cbrdeapllx471 ~]$ sudo grep -A2 'deployment name="SICCR-PARAMETROS"' $(sudo find /opt/jboss -name domain.xml -path '*configuration*' | head -1)
[p585600@cbrdeapllx471 ~]$
[p585600@cbrdeapllx471 ~]$
[p585600@cbrdeapllx471 ~]$ sudo grep -A2 'deployment name="SICCR-PARAMETROS"' $(sudo find /opt/jboss -name domain.xml -path '*configuration*' | head -1)
[p585600@cbrdeapllx471 ~]$
[p585600@cbrdeapllx471 ~]$
[p585600@cbrdeapllx471 ~]$




