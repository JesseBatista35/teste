Felipe, tudo bem?

Analisei o erro que você reportou no Fortify do SIECO-Android-ORIGINAL. O build passa normal, o problema é só no upload final pro SSC:
"ErrorResponse: Failed to access application version: sieco-android-1.4.8. Access denied. Unauthorized."

Rastreei e encontrei a causa: no seu merge da features/STRY00028102_Incluir_Grupo_de_Pagadores_merge (downgrade do gradle 8.13.2 para 8.1.1 e compileSdk 36 para 35), o step de Fortify também mudou a versão de 1.0.0 para 1.4.8. A versão 1.0.0 sempre funcionou no upload, mas a 1.4.8 não está autorizada/criada no Fortify SSC - por isso o Access denied.

Você sabe se essa troca pra 1.4.8 foi intencional? Se sim, preciso abrir chamado pro time do Fortify criar essa application version com a permissão correta. Se não, dá pra reverter o -version pra 1.0.0 que deve resolver na hora.
