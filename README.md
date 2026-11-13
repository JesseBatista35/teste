Reconfigurada a build do SIIFX-caixinhas-batch para os 3 subprojetos (batch-platform, mod-caixinhas e batch-launcher), construídos em sequência por três etapas Java-Build.

Causa da falha nas builds geradas por tag: a etapa da esteira que identifica o pacote ("Recupera versão projeto") procurava arquivos .jar em todo o repositório. Assim, as etapas do mod-caixinhas e do batch-launcher identificavam o core-starter já publicado pela primeira etapa, e a verificação no binario.caixa acusava pacote existente.

Correção: incluída a variável TARGET_PATH antes de cada Java-Build (batch-platform/core-starter, mod-caixinhas e batch-launcher), de modo que cada etapa identifique e publique somente o seu próprio artefato. Nenhum task group compartilhado foi alterado.

Validação: build da tag 0.0.182.1 concluída com sucesso, com publicação no repositório releases do Nexus de core-starter, mod-caixinhas e siifx-caixinhas-batch (fat jar) na versão 0.0.182.1.

Também foi ajustada, nos stages DES, TQS e TGE, a etapa




Pessoal, a build do SIIFX-caixinhas-batch com os 3 subprojetos está corrigida. A tag 0.0.182.1 gerou e publicou os 3 artefatos no Nexus (core-starter, mod-caixinhas e siifx-caixinhas-batch). Já podem gerar tag normalmente.

Ao subir em TQS, encontramos pendências de ambiente. Como TQS antes usava a VM de DES e agora tem VM própria (caddeapllx2876), ela está "zerada". Próximos passos:

Time SIIFX:
1. Abrir nova REQ para ajuste do ambiente TQS do SIIFX-caixinhas-batch.
2. Revisar o grupo de variáveis SIIFX-CAIXINHAS-BATCH-TQS:
   - BATCH_PROFILE de TQS (pelo README seria "tgs"?), BATCH_HOME e BATCH_LOG_DIR, que hoje não existem no grupo TQS
   - TOKEN_HOST, NSGD_DESFAZ_* e SIIFX_DATAGRID_* ainda apontam para DES. Confirmar se é intencional.
   - NFS: TQS deve usar os mesmos diretórios de DES (CEPTIBR/SIIFX-BATCH e B2B/SIIFX) ou ter diretório próprio?
   - Confirmar se o keystore dskeystore_tqs_siifx.jceks existe.
3. Confirmar se os stages TGS/TGE também devem ter grupo de variáveis próprio.

Esteira/Infra (eu encaminho):
4. Interface e IP de backup da caddeapllx2876. Sem isso a VM não alcança o Isilon (NFS).
5. Regra de firewall da caddeapllx2876 para o servidor Control-M de TQS.
6. Liberação do IP de backup da 2876 no export do Isilon, conforme o diretório definido no item 2.
7. Depois dos valores confirmados, vincular o grupo TQS à release (escopo EC TQS) e tirar o TQS do escopo do grupo DES.

Assim que esses itens estiverem ok, rodamos a release de TQS novamente a partir da tag 0.0.182.1.
