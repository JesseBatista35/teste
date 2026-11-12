Roteiro da call: DNS do SIEMP

(Jeferson, Rodrigo, Paulo, Denilson)

1. Abertura (30 s)

“Chamei vocês para alinhar o acesso do SIEMP no 7.4. A aplicação está no ar, mas o endereço está intermitente: às vezes abre, às vezes dá 404. O Jeferson achou a causa e quero decidir com vocês a correção.”

2. O que está acontecendo (1 min)

O nome siemp.des.caixa está apontando para dois IPs no DNS ao mesmo tempo:
10.116.180.9: o VIP novo da esteira 7.4. Abre o SIEMP 14.37.0.6 normalmente.
10.116.80.1: um VIP antigo. Retorna 404, com certificado de outro sistema (siecm.des.caixa).
Cada vez que alguém acessa, o DNS entrega um dos dois. Daí o “funciona/não funciona”.

3. Por que ficou assim (30 s)

“Pedimos a inclusão do registro novo, e a CETEL incluiu sem remover o antigo, que já existia. O correto seria uma alteração. Agora é ajustar.”

Vale assumir isso com tranquilidade. Mostra controle da situação.

4. A evidência (mostre ao vivo, se der)

curl -k -s -o NUL -w "antigo /siemp       %{http_code}\n" --resolve siemp.des.caixa:443:10.116.80.1 https://siemp.des.caixa/siemp/
curl -k -s -o NUL -w "antigo /siemp_java  %{http_code}\n" --resolve siemp.des.caixa:443:10.116.80.1 https://siemp.des.caixa/siemp_java/
curl -k -s -o NUL -w "novo   /siemp       %{http_code}\n" --resolve siemp.des.caixa:443:10.116.180.9 https://siemp.des.caixa/siemp/

“O IP antigo dá 404 em /siemp e em /siemp_java. Ou seja, hoje ninguém acessa o SIEMP por esse nome através dele.”

5. A pergunta-chave para o Denilson e o Paulo

“Vocês ainda usam o SIEMP do legado em DES? Se usam, por qual endereço?”

Se usam por outro endereço (outro nome ou IP): remover o antigo do siemp.des.caixa não afeta nada.
Se dependem desse nome: o teste mostra que já não funciona por ele hoje, então nada piora.

6. Proposta (o que você recomenda)

“Proposta: abrir REQ para remover o 10.116.80.1 do siemp.des.caixa, deixando só o VIP do 7.4. Com isso, o acesso fica estável e o Denilson consegue validar sem intermitência.”

7. Decisão e próximos passos (feche assim)

Quem	O quê
Rodrigo/Paulo	Dar o ok para remover o IP antigo
Jessé	Abrir a REQ de DNS hoje, com a evidência dos testes
Denilson	Validar o SIEMP em https://siemp.des.caixa/siemp/ (o contexto é /siemp, não /siemp_java). Até a REQ ser atendida, se der 404, tentar de novo.
Jessé	Avisar quando o DNS estiver corrigido (nslookup retornando só 10.116.180.9)

8. Crédito

“Valeu, Jeferson, por ter identificado os dois IPs. Isso economizou muito tempo.”
