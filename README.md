Análise técnica realizada referente à falha de publicação no Google Play Store, ocorrida na pipeline SIMSC-Android-Nativo, task Google Play - Release, etapa Upload de App - Faixa Internal Test.

Causa raiz identificada: o Google Play Developer API passou a exigir explicitamente que o parâmetro changesNotSentForReview seja informado como true no momento do commit da edição, quando a submissão automática para revisão não pode ser realizada. O erro retornado pela API foi: Changes cannot be sent for review automatically. Please set the query parameter changesNotSentForReview to true.

Constatou-se que a task em uso encontrava-se na versão 3.x da extensão Google Play (Azure DevOps Marketplace), versão essa que não disponibiliza o parâmetro changesNotSentForReview para o fluxo de upload de APK, uma vez que esse campo foi introduzido apenas a partir da versão 4.x da extensão, após a unificação das tasks de release de APK e de Bundle em uma única task com seleção de ação.

Ação corretiva aplicada: atualização da versão da task de 3.x para 4.x na etapa Upload de App - Faixa Internal Test, com seleção da ação Upload single apk, reconfiguração dos campos de aplicação, caminho do apk, trilha (track) e autenticação, e habilitação do parâmetro Send changes to review (changesNotSentForReview) como true nas Advanced Options, garantindo assim que o upload seja concluído e salvo no Google Play Console mesmo quando a submissão automática para revisão não é permitida pela loja. A revisão, nesses casos, passa a ser iniciada manualmente pela equipe responsável diretamente na interface do Google Play Console.

Após a atualização, nova execução da pipeline foi validada com sucesso, sem reincidência do erro reportado.

Encerramento: chamado concluído com ajuste definitivo aplicado na configuração da pipeline, sem necessidade de intervenção em código-fonte da aplicação ou em infraestrutura.
