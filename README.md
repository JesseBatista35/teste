Abra o ProcessadorDevRestTest.java dentro de java/br/gov/caixa/sigec/rest/dev/.
Clique em “...” e depois em Rename.
Troque o caminho inteiro por gec-web/src/test/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRestTest.java e faça o Commit. O Rename com caminho completo move o arquivo.
Repita com o ExportaArquivoUtilTest.java, novo caminho gec-web/src/test/java/br/gov/caixa/sigec/util/ExportaArquivoUtilTest.java.
A pasta java da raiz deve sumir sozinha quando ficar vazia. Se não sumir, apague.

Sobre o sonar-project.properties: pode apagar, ele não é necessário. A esteira já procura qualquer *jacoco.xml e qualquer pasta surefire-reports e passa ao Sonar pelo SONAR_PROPERTIES. O parâmetro -Dproject.settings=NONE faz o scanner ignorar esse arquivo. Isso também corrige o que eu disse antes: o caminho do relatório não era o problema.

Depois de mover os testes, rode o -Ponline. No log do gec-web deve aparecer Tests run: 4, Failures: 0, Errors: 0, depois a geração do jacoco.xml. Se algum teste falhar, me mande o trecho do erro.
