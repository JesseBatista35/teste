O JBoss subiu com java.library.path=/apl/sigsj/lib, e o EAR e o driver estão .deployed, sem nenhum .failed.

Agora falta o teste de login:

Acessa https://sigsj-internet.des.caixa/sigsj_internet/login.xhtml e tenta logar.
Logo depois, na 2854:
bash
grep -n "SenhasSIIBC\|UnsatisfiedLink\|Autenticacao" /opt/jboss-eap/standalone/log/server.log | tail -20
grep -n "ERROR" /opt/jboss-eap/standalone/log/server.log | grep "$(date +%Y-%m-%d) 11:" | tail -20

Como ler o resultado:

Sem UnsatisfiedLinkError: a lib resolveu.
Login funcionou: o internet está ok.
Veio outro erro (SIROT, SIPER, CONNECTOR-FARM ou senha inválida): é o próximo passo da cadeia e não tem a ver com a lib. Me manda o trecho.

Enquanto isso, já pode puxar a lib na 955 (intranet):

bash
scp p585600@10.116.88.96:/tmp/libSenhasSIIBC.so /tmp/
md5sum /tmp/libSenhasSIIBC.so
Como o Claude está se saindo nesta sessão?
