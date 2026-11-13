Correção na pipeline (sem mexer no task group)

Setar o TARGET_PATH antes de cada Java-Build. Variável setada com setvariable vira variável de ambiente nas tasks seguintes, inclusive dentro do task group.

Bash “Adiando análise até o último reactor” (antes do Java-Build 1). Acrescente:
bash
   echo "##vso[task.setvariable variable=TARGET_PATH]batch-platform/core-starter"
Nova Bash entre o Java-Build 1 e o 2, com o nome “Define TARGET_PATH mod-caixinhas”:
bash
   echo "##vso[task.setvariable variable=TARGET_PATH]mod-caixinhas"
Bash “Habilitando análise (reactor final)” (antes do Java-Build 3). Acrescente:
bash
   echo "##vso[task.setvariable variable=TARGET_PATH]batch-launcher"

No batch-platform, apontei para core-starter porque o reactor tem dois jars (core-starter e io-starter) e o script só trata um arquivo. O io-starter não precisa ir ao Nexus: ele fica no .m2 local da run e entra no fat jar do launcher.

Ajuste do lado do dev (obrigatório para tag)

O mod-caixinhas e o core-starter estão com 1.0-SNAPSHOT fixo no pom. O script lê a versão do pom.properties, então, com tag, a esteira tentaria subir 1.0-SNAPSHOT no repositório releases, e o Nexus recusa. O dev precisa:

usar ${version.app} como versão nos poms dos 3 reactors;
fazer o batch-launcher referenciar mod-caixinhas e os starters com essa mesma versão;
corrigir o erro de compilação do CaixinhasAutoConfiguration.java (linha 73).
Para validar
Rode numa branch e confira, nos 3 Java-Build, que o “Recupera versão projeto” mostra o artefato do reactor certo.
Depois rode com uma tag nova no padrão VEC (ex.: 0.0.1.24) e confirme no Nexus releases os 3 artefatos distintos na versão da tag.
Me diga o artifactId do batch-launcher. Se não for siifx-caixinhas-batch, ajusto o script da release, e já incluo a busca no repositório releases para builds de tag.
Como o Claude está se saindo nesta sessão?
