Andamento:

Análise concluída. O erro reportado ocorre na etapa de upload do scan para o Fortify SSC (Software Security Center), não no build da aplicação, que executa normalmente.

Erro: "ErrorResponse: Failed to access application version: sieco-android-1.4.8. Access denied. Unauthorized."

Causa identificada: no merge da branch features/STRY00028102_Incluir_Grupo_de_Pagadores_merge (downgrade Gradle 8.13.2 para 8.1.1 e compileSdk 36 para 35), o parâmetro de versão do step de Fortify também foi alterado de 1.0.0 para 1.4.8. A application version 1.0.0 sempre teve upload autorizado no Fortify SSC; a 1.4.8 não está criada/autorizada, causando o Access denied.

Pendência:

Aguardando retorno do solicitante (Felipe Arakaki) para confirmar se a alteração de versão para 1.4.8 foi intencional:

Se sim: será necessário abrir chamado para o time de AppSec/Fortify criar a application version 1.4.8 com as permissões correspondentes.
Se não: reverter o parâmetro -version no step de Fortify de volta para 1.0.0 deve restabelecer o upload.

Contato via Teams realizado em 27/08; aguardando disponibilidade do solicitante para retorno.
