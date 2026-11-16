Reconfigurada a build do SIIFX-caixinhas-batch para trabalhar com os 3 subprojetos (batch-platform, mod-caixinhas e batch-launcher), construídos em sequência por três etapas Java-Build.

Causa da falha nas builds geradas por tag: a etapa da esteira que identifica o pacote ("Recupera versão projeto") procurava arquivos .jar em todo o repositório. Com isso, as etapas do mod-caixinhas e do batch-launcher identificavam o core-starter já publicado pela primeira etapa, e a verificação no binario.caixa acusava pacote já existente.

Correção: incluída a variável TARGET_PATH antes de cada Java-Build (batch-platform/core-starter, mod-caixinhas e batch-launcher), de forma que cada etapa identifique e publique somente o seu próprio artefato. Nenhum task group compartilhado foi alterado.

Validação: build da tag 0.0.182.1 concluída com sucesso, com publicação no repositório releases do Nexus de core-starter, mod-caixinhas e siifx-caixinhas-batch (fat jar) na versão 0.0.182.1.

Também foi ajustada, nos stages DES, TQS e TGE, a etapa "Correção Artefato Final SIIFX-CAIXINHAS-BATCH" da release, para baixar o artefato correspondente à build vinculada (repositório releases para tag e snapshots para branch).

Observação: a implantação em TQS depende da inclusão da interface/IP de backup no novo servidor caddeapllx2876 e da liberação desse IP nos compartilhamentos NFS do Isilon. Isso não faz parte desta solicitação e foi orientado ao time responsável para abertura de demanda própria.
