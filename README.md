O que falar na reunião do SIEMP

1. Abertura

“Temos dois pontos no SIEMP: um de acesso, que é ambiente e fica com a gente, e um erro dentro do sistema, que é do pacote e fica com o time SIEMP. A aplicação está publicada no 7.4, versão 14.37.0.6.”

2. Ponto 1: acesso intermitente (DNS) → DevOps

O siemp.des.caixa está com dois IPs no DNS:
10.116.180.9: VIP novo da esteira. Abre o SIEMP normalmente (200).
10.116.80.1: VIP antigo. Dá 404 em /siemp e em /siemp_java, com certificado de outro sistema (siecm).
Por isso o acesso funciona para uns e não para outros, ou alterna.
Causa: a REQ incluiu o IP novo sem remover o antigo.
Pergunta para o Paulo e o Denilson:

“Alguém ainda usa o SIEMP legado em DES por esse nome? Pelo teste, ele já não funciona por esse endereço.”

Proposta:

“Abrir REQ para remover o 10.116.80.1. O nome fica só no 7.4. Preciso do ok de vocês.”

Crédito ao Thiago Jeferson, que identificou os dois IPs.

3. Ponto 2: erro dentro do sistema → time SIEMP (pacote)

No log aparece NoSuchFieldError: value (73 vezes), no /layout/banner_topo.jsp. Esse banner está no template de todas as telas.
Causa: o banner usa <c:out> pelo TLD antigo /WEB-INF/tags/c.tld (JSTL 1.1, que vem no standard-1.1.2.jar dentro do WAR). O JBoss 7.4 já fornece a JSTL 1.2, e a mistura das duas versões quebra.
Ajuste no pacote:
Trocar nas JSPs uri="/WEB-INF/tags/c.tld" por uri="http://java.sun.com/jsp/jstl/core". O mesmo vale para fmt/fn, se houver.
Marcar como provided no pom: jstl-1.1.2, standard-1.1.2, servlet-api-2.5, jsp-api-2.2 e jboss-j2ee-4.2.2.GA.
Gerar uma nova versão e rodar a esteira.
O log já foi enviado ao Denilson.

4. Fechamento (quem faz o quê)

Quem	O quê
Paulo/Denilson	Ok para remover o IP antigo do DNS
Jessé	Abrir a REQ de DNS hoje e avisar quando o nslookup mostrar só 10.116.180.9
Time SIEMP (Denilson)	Ajustar o JSTL no pacote e gerar nova versão
Jessé	Acompanhar o deploy da nova versão e analisar o log
