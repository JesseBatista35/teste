Análise — Build SIRTA (sirta-job) travando no step "Recupera Versão no POM"
Sintoma: O build entra em loop/trava indefinidamente no step "Recupera Versão no POM", sem concluir e sem retornar erro.
Causa raiz (não é ajuste de esteira/infra): O pom.xml da aplicação está configurado com o Quarkus 3.36.0, versão lançada recentemente que ainda não está espelhada no Nexus interno (Nexus Caixa). Como o artefato não existe no repositório, o Maven fica tentando resolvê-lo indefinidamente, travando o build. A correção é no código (pom.xml) da aplicação, portanto deve ser feita pelo time de desenvolvimento. Mesmo diagnóstico e solução da demanda do SIAGT-batimento.
Ajustes que o time de desenvolvimento deve aplicar no pom.xml do sirta-job:
1. Versão do Quarkus — trocar para uma versão já disponível no Nexus (LTS em uso pelos demais módulos):
xml<!-- de -->
<quarkus.platform.version>3.36.0</quarkus.platform.version>
<!-- para -->
<quarkus.platform.version>3.27.2</quarkus.platform.version>
2. Packaging — o tipo quarkus não é reconhecido; usar jar:
xml<!-- de -->
<packaging>quarkus</packaging>
<!-- para -->
<packaging>jar</packaging>
3. Dependência de teste — corrigir o nome do artefato:
xml<!-- de -->
<artifactId>quarkus-junit</artifactId>
<!-- para -->
<artifactId>quarkus-junit5</artifactId>
4. Plugin do Quarkus — adicionar o bloco <executions> (necessário para gerar o pacote executável target/quarkus-app/, exigido pelo step "Copiando Artefatos para StagingDirectory"):
xml<plugin>
    <groupId>${quarkus.platform.group-id}</groupId>
    <artifactId>quarkus-maven-plugin</artifactId>
    <version>${quarkus.platform.version}</version>
    <extensions>true</extensions>
    <executions>
        <execution>
            <goals>
                <goal>build</goal>
                <goal>generate-code</goal>
                <goal>generate-code-tests</goal>
            </goals>
        </execution>
    </executions>
</plugin>
Recomendação: Não utilizar versões do Quarkus recém-lançadas que ainda não estejam espelhadas no Nexus interno. Manter alinhamento com a versão LTS adotada pelos demais módulos. Caso seja necessário usar uma versão mais nova, solicitar previamente o espelhamento à equipe responsável pelo Nexus.
