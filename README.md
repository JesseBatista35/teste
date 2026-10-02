O pipeline do SIAPO-movimentacao-micro foi regularizado. Para validar, criamos a branch de teste 0.0.0.1-Teste-Cesti com os ajustes abaixo, e o build #20261002.1033-1.0.0-SNAPSHOT foi executado com sucesso.

Ajustes realizados:

pom.xml: o quarkus-maven-plugin estava sem o bloco <executions> com o goal build. Por isso o Maven não gerava o pacote executável (target/quarkus-app/quarkus-run.jar) e a etapa "Copiando Artefatos para StagingDirectory" falhava. Incluímos os goals build, generate-code e generate-code-tests, conforme o padrão de projetos Quarkus.
ProcessamentoSisfinService.java: depois do ajuste no pom, o build do Quarkus passou a validar a injeção de dependências e acusou que a classe não tinha anotação de escopo. Incluímos @ApplicationScoped. Sem essa anotação, a aplicação também falharia ao subir.

Próximos passos (time de desenvolvimento):

Validar as alterações da branch 0.0.0.1-Teste-Cesti e aplicá-las na branch de vocês.
Gerar uma nova TAG a partir do commit com as correções, por exemplo 0.0.0.2, e executar o pipeline por ela. O build da branch de teste foi publicado como SNAPSHOT e serve apenas para DES. A TAG no padrão VEC é necessária para implantação em TQS/HMP/PRD.
Recomendamos verificar se outras classes injetadas via @Inject também estão sem anotação de escopo, para evitar o mesmo erro.

Após a aplicação e o novo build pela TAG, a branch 0.0.0.1-Teste-Cesti pode ser removida.
