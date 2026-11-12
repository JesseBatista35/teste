1. Testar o que o antigo atende de fato

Na sua estação, forçando cada IP (o --resolve ignora o DNS):

curl -k -s -o NUL -w "antigo /siemp       %{http_code}\n" --resolve siemp.des.caixa:443:10.116.80.1 https://siemp.des.caixa/siemp/
curl -k -s -o NUL -w "antigo /siemp_java  %{http_code}\n" --resolve siemp.des.caixa:443:10.116.80.1 https://siemp.des.caixa/siemp_java/
curl -k -s -o NUL -w "novo   /siemp       %{http_code}\n" --resolve siemp.des.caixa:443:10.116.180.9 https://siemp.des.caixa/siemp/
O antigo dá 404 nos dois caminhos: ninguém consegue usar o legado por esse nome hoje. Dá para remover o antigo com segurança, mostrando esse teste ao Rodrigo.
O antigo dá 200 em algum caminho (por exemplo /siemp_java, que foi o caminho que o Denilson testou): o legado está em uso. Siga para o passo 2.
2. Se o legado estiver em uso: levar a decisão ao Rodrigo

Rodrigo, o siemp.des.caixa ficou com dois IPs no DNS: o do legado (10.116.80.1) e o da nova esteira 7.4 (10.116.180.9). Com isso, o acesso fica intermitente nos dois ambientes. O nome só pode apontar para um IP, então precisamos decidir:

Opção A – Virar para o 7.4 agora: remover o IP do legado. O siemp.des.caixa passa a abrir só o 7.4, e quem ainda usa o legado em DES deixa de acessar por esse nome.

Opção B – Manter o legado até a virada: remover o IP novo. O legado volta ao normal, e o 7.4 fica acessível temporariamente pelo IP do VIP (10.116.180.9) até a data da virada, quando trocamos o DNS.

Qual opção seguimos? Assim que definir, abro a REQ de DNS.

Na opção B, o teste do 7.4 sem DNS fica mais trabalhoso: o certificado não bate com o IP e o SSO pode reclamar. Se os testes do time SIEMP precisarem continuar, a opção A é a mais prática, ou então pedir um nome próprio para o 7.4, o que exige certificado novo.

Me manda o resultado dos três curl que eu te ajudo a fechar o argumento.
