Felipe, tudo bem?

Vi que você fez o merge da features/STRY00028102_Incluir_Grupo_de_Pagadores_merge no pipeline SIECO-Android-ORIGINAL (downgrade do gradle 8.13.2 para 8.1.1 e compileSdk 36 para 35), que também alterou a versão usada no step de Fortify de 1.0.0 para 1.4.8.

Desde essa mudança (dia 24/08 em diante), o upload do scan pro Fortify está falhando com:
"ErrorResponse: Failed to access application version: sieco-android-1.4.8. Access denied. Unauthorized."

O build em si passa normal, só o upload final pro SSC que quebra - parece que a application version 1.4.8 não existe ou não tem permissão configurada no Fortify (diferente da 1.0.0, que sempre funcionou).

Você sabe se essa troca pra 1.4.8 foi intencional? Se sim, precisamos abrir chamado pro time do Fortify criar essa application version com a permissão correta. Se não, dá pra reverter o -version pra 1.0.0 que deve voltar a funcionar.
