Me mande estes 3 arquivos (ou os trechos):

gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/TransferenciaEletronicaLegacyCallNCR.java (a interface).
gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/TransferenciaEletronicaLegacyCallNCRBean.java (a implementação).
gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java, ou pelo menos as linhas 165 a 180 e 283 a 297.

Para achar rápido no Azure Repos (Search, na branch Cesti-test-001), busque FilaNCR. Em 1 minuto dá para ver se existe algo parecido no Bean (por exemplo listarMensagensFilaNCR ou publicarMensagemFilaNCR) que foi renomeado.

Os 3 desfechos possíveis, e o que eu faria em cada um:

Situação	Correção na Cesti-test-001
O Bean tem os métodos (nome igual ou parecido), mas a interface não	Declarar os métodos na interface, ou ajustar o nome da chamada no ProcessadorDevRest
Os métodos foram renomeados no Bean	Trocar as 2 chamadas no ProcessadorDevRest pelos nomes novos
Os métodos não existem mais	O ProcessadorDevRest é endpoint de dev. Comentar essas 2 rotas, ou tirar a classe do build online. É a opção mais rápida, mas é decisão do time porque remove funcionalidade de dev

Um dado ajuda: o log do gec-ejb mostra unreachable catch clause no TransferenciaEletronicaLegacyCallNCRBean (linhas 99 e 222). Isso sugere que o Bean foi mexido na migração (provavelmente a parte do Service Bus). Por isso o mais provável é que os métodos tenham sido renomeados, e não apagados.

Como levar para aprovação do time

Faça o ajuste só na Cesti-test-001.
Rode -Ponline e confirme o GEC EAR gerado.
Abra um Pull Request da Cesti-test-001 para a rtc/STRY00052082_migracao_java_17 listando as mudanças: UserProfileRest (getNumeroIP(request)), este ajuste do online e os poms (framework, javax.servlet-api).
Marque o Fabio e o time como revisores. Assim a decisão de remover ou renomear fica registrada com o autor certo.

Me mande os arquivos que eu devolvo a correção pronta.
