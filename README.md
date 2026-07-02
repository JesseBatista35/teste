-sh-4.2$ curl -ik "https://servicossociais.des.corerj.caixa/ServicoEnc"
curl: (7) Failed connect to servicossociais.des.corerj.caixa:443; Tempo esgotado para conexão
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ find / -path "/sicmu/paginas/operacaoHabitacional/scripts" 2>/dev/null
-sh-4.2$ curl -ik --max-time 10 "https://servicossociais.des.corerj.caixa/ServicoEnc"
curl: (28) Connection timed out after 10001 milliseconds
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ find / -path "/sicmu/paginas/operacaoHabitacional/scripts" 2>/dev/null
-sh-4.2$
