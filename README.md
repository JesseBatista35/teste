
timeout 5 bash -c 'cat < /dev/null > /dev/tcp/nfsctcnprd.ctc.caixa/2049' && echo "PORTA ABERTA" || echo "PORTA FECHADA OU SEM RESPOSTA"


bash -c 'exec 3<>/dev/tcp/nfsctcnprd.ctc.caixa/2049 && echo CONECTOU || echo FALHOU'


timeout 5 bash -c 'cat < /dev/null > /dev/tcp/nfsctcnprd.ctc.caixa/111' && echo "PORTA 111 ABERTA" || echo "PORTA 111 FECHADA OU SEM RESPOSTA"

timeout 5 bash -c 'cat < /dev/null > /dev/tcp/nfsctcnprd.ctc.caixa/111' && echo "PORTA 111 ABERTA" || echo "PORTA 111 FECHADA OU SEM RESPOSTA"
