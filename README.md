Passo a passo

Passo 1. Descobrir o nome do XML do internet (no internet DES):

bash
ssh p585600@10.116.202.45
grep -o '/log_jboss/config-log4j/[^] ]*' /logs/jboss/jboss-eap/standalone/sigsj-internet/server.log | sort -u

Vai sair algo como /log_jboss/config-log4j/NOME.xml. Anote o NOME.xml e substitua XXX_INTERNET_XML_XXX por ele, nas duas linhas do custom.sh do internet.

Passo 2. Descobrir onde a esteira lê o custom.sh. No Azure DevOps, abra o repo esteira-jboss-vm-v2, procure custom.sh na busca e veja em qual pasta do repo de config ele é esperado. Se não achar, pergunte ao Andrei: “em que pasta do repo de config a esteira procura o custom.sh?”

Passo 3. Commitar. Coloque o custom.sh do intranet no SIGSJ-intranet-config e o do internet no SIGSJ-internet-config, na pasta encontrada no passo 2.

Passo 4. Rodar a release. Comece pelo intranet DES, que hoje está estável.

Passo 5. Validar no intranet DES:

bash
ssh p585600@10.116.194.179
ls -la /log_jboss/config-log4j/ /log_jboss/sigsj_intranet/
grep 'Could not parse file' /logs/jboss/jboss-eap/standalone/sigsj-intranet/server.log | tail -2

O esperado:

o sigsj_intranet.xml dentro de config-log4j/;
o sigsj_intranet.log dentro de sigsj_intranet/;
nenhum Could not parse file com horário depois da release.

Se o intranet DES ficar certo, repita o mesmo para o internet e depois para o TQS.

Ainda pendente com a Gisele: o XML do boleto (sigsj_ws_boleto.xml) e a confirmação de qual dos dois XMLs do internet é o certo.
