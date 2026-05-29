À CAIXA,
Prezados,
Informamos a conclusão do atendimento referente à REQ000095661629.
Foram realizados os ajustes nas pipelines de Release no Azure DevOps para exportar a variável SD_KEY_BIOMETRIA e disponibilizá-la no build.gradle da aplicação Android SIAPT.
Ajustes realizados — SIAPT-Android-Nativo (Azure DevOps - Release):

Adicionado o parâmetro -PSD_KEY_BIOMETRIA=$(SD_KEY_BIOMETRIA) na variável BuildGradle com escopo de Release, aplicando-se aos estágios (TQS/PLT/PRD), conforme padrão adotado no atendimento da REQ000143846061.
A variável SD_KEY_BIOMETRIA já estava disponível no Variable Group vinculado à pipeline (criação atendida na REQ000144028419).
Importante: o valor não foi redeclarado no formato SD_KEY_BIOMETRIA: $(SD_KEY_BIOMETRIA), pois essa forma gerava o erro de referência cíclica (Unable to expand variable 'SD_KEY_BIOMETRIA'. A cyclical reference was detected). A injeção via parâmetro -P no BuildGradle resolveu a questão.

Validação:

Pipeline SIAPT-Android-Nativo 4.12.0 | ID 478684 | Code 238 — estágio TQS - Firebase executado com sucesso (Succeeded) em 29/05/2026, às 17:03 (Pool: Mobilidade-Linux-Proxy / Agent: AgentMobile-Proxy-3).
Ambientes DES e TQS validados, sem indisponibilidade durante a execução.

Demanda concluída.
Atenciosamente,
[seu nome]
Analista - CTIS / CESTI Esteira DEVOPS DES TQS NPRD
