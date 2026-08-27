Prezados,

Estamos com falha recorrente no upload de scan do Fortify no pipeline SIECO-Android-ORIGINAL (DES). O build/análise ocorre normalmente, mas o upload final para o Controller/SSC falha com:

"ErrorResponse: Failed to access application version: sieco-android-<versão>. Access denied. Unauthorized."

Evidências que isolam a causa:
- Hoje (27/08), o mesmo erro ocorreu tanto para a versão 1.0.0 (14:47) quanto para a 1.4.8 (15:43) - a 1.0.0 sempre teve upload autorizado até então.
- Os steps do pipeline "Criando Application no Fortify" e "Criando Version no Fortify" (que usam token de API) completam com sucesso - o problema ocorre especificamente no step "Iniciando Análise no Fortify", que usa o scancentral com o parâmetro -uptoken para o upload.
- Como o erro agora ocorre para qualquer application version usada, a causa parece estar no token de upload (FORTIFY_UPTOKEN) ou nas permissões associadas a ele no SSC, e não em uma versão específica.

Poderiam verificar:
1. Se o FORTIFY_UPTOKEN usado pelo pipeline expirou, foi revogado ou teve permissões alteradas recentemente no SSC.
2. Se houve alguma mudança de política/configuração de acesso no Controller que possa ter afetado uploads de scan em geral.

Fico à disposição para mais detalhes ou logs adicionais.
