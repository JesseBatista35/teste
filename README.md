Aviso Firebase App Distribution — falha em upload (HTTP 500)

Pessoal, identificamos falha recorrente na etapa "Android - Firebase Distribution App" (upload pro Firebase), afetando múltiplas aplicações: SIMSC-Android-Nativo e SIAME-Android-Nativo, em TQS e HMP.

Erro apresentado: Error: failed to upload distribution. HTTP Error: 500, Unknown Error

Investigação já concluída — causa raiz identificada no ambiente do agente (Node.js e firebase-tools desatualizados no pool Mobilidade-Linux-Proxy). Rede, token e integridade do APK foram descartados como causa.

Demanda já foi encaminhada para o time de infraestrutura de agentes com o diagnóstico completo, solicitando atualização do Node/firebase-tools no pool.

Qualquer novo caso de falha nessa mesma etapa, é esse mesmo problema — não precisa abrir chamado novo, só sinalizar aqui.

Atualizo assim que tiver retorno da infra.
