Resumo da demanda — Build SIAGT-batimento travando
Problema: O build do SIAGT-batimento ficava horas travado no step "Recupera Versão no POM", sem concluir e sem erro.
Causa raiz: O pom.xml estava configurado com o Quarkus 3.36.0, versão lançada poucos dias antes e ainda não espelhada no Nexus interno (Nexus Caixa). Como o artefato não estava disponível no repositório, o Maven ficava indefinidamente tentando resolver a dependência, causando o travamento.
Correções aplicadas no pom.xml:

Versão do Quarkus alterada de 3.36.0 para 3.27.2 (LTS, já disponível no Nexus e em uso por outros módulos do SIAGT).
<packaging> ajustado de quarkus para jar (o tipo quarkus não é reconhecido nessa versão).
Dependência de teste corrigida de quarkus-junit para quarkus-junit5.
Adicionado o bloco <executions> (goals build, generate-code, generate-code-tests) no quarkus-maven-plugin, necessário para gerar o pacote executável target/quarkus-app/, exigido pelo step "Copiando Artefatos para StagingDirectory".

Resultado: Build concluído com sucesso, 100% dos testes passando, tempo de execução ~1min.
Recomendação: Não utilizar versões do Quarkus recém-lançadas que ainda não estejam espelhadas no Nexus interno. Manter alinhamento com a versão LTS adotada pelos demais módulos (atualmente 3.27.2); ao precisar atualizar, solicitar previamente o espelhamento da versão à equipe responsável pelo Nexus.
