✅ 🎯 RESPOSTA DIRETA
👉 SIM, tenho confiança: NÃO é variável faltando no seu caso
E te provo isso com base no que você mesmo mostrou 👇

✅ ✅ PROVA 1 — Suas variáveis já estão completas
Você mostrou:
_ENV.APPLICATIONINSIGHTS_CONNECTION_STRING ✅
_ENV.APPLICATIONINSIGHTS_ROLE_NAME ✅
_ENV.APPLICATIONINSIGHTS_SAMPLING_PERCENTAGE ✅
_ENV.APPLICATIONINSIGHTS_SELF_DIAGNOSTICS_LEVEL ✅
_ENV.APPLICATIONINSIGHTS_PROXY ✅

👉 Isso é exatamente o conjunto exigido na wiki
👉 Não falta nada aqui

✅ ✅ PROVA 2 — Pipeline rodou sem erro de config
Se faltasse variável, você veria erro tipo:
missing APPLICATIONINSIGHTS_CONNECTION_STRING

👉 Isso NÃO aconteceu ✅

✅ ✅ PROVA 3 — O comportamento do agente em outras apps
Olha isso (importantíssimo):
Você viu processos como:
sipdi-lx0041
-javaagent:/opt/azure/config/appinsights/applicationinsights-agent.jar ✅

👉 Essas apps usam:

MESMA infra
MESMO proxy
MESMO padrão de variáveis

✔️ E funcionam

✅ ✅ PROVA 4 — Seu SISAG não tem javaagent
Linha clara:
Server:sisag-lx0041
→ NÃO tem -javaagent ❌

👉 Isso é FATO técnico

✅ 🔥 CONCLUSÃO LÓGICA (sem achismo)
Se:

as variáveis estão corretas ✅
o ambiente suporta ✅
outras apps funcionam ✅

👉 então o problema só pode ser:
🚨 ❌ O AGENT NÃO ESTÁ SENDO INJETADO NA JVM

✅ ⚠️ TRADUZINDO DE FORMA SIMPLES
👉 O App Insights funciona assim:

sem -javaagent = não existe App Insights
não importa variável, JSON, proxy… nada

👉 tudo depende disso:
-javaagent:/opt/azure/config/appinsights/applicationinsights-agent.jar


✅ 🧠 POR QUE SEU PIPELINE NÃO RESOLVEU
Porque:
👉 o task APP_INSIGHTS_JBOSS só:

prepara config ✅
injeta JSON ✅

👉 MAS não está conseguindo:

alterar o startup do JBoss ❌

(que é exatamente o seu caso)

✅ ✅ ENTÃO A SUA TESE

“será que falta variável?”

👉 ❌ Não
👉 porque se faltasse:

o agent subiria e daria erro
você veria log
mas você não tem nem o agent


✅ ✅ A VERDADE FINAL
👉 Seu problema NÃO é:

variável
JSON
proxy

👉 Seu problema É:
❌ JBoss não está iniciando com o javaagent

✅ ✅ RESPOSTA FINAL PRA SUA PERGUNTA

























DúvidaRespostafalta variável?❌ NÃOpipeline está errado?⚠️ parcialmenteagent está rodando?❌ NÃOsolução correta?✅ adicionar na JVM

✅ 🔥 O QUE VOCÊ DEVE FAZER
Você tem 2 caminhos reais:

✅ ✅ Opção 1 (ideal)
👉 pedir ajuste na esteira

✅ ✅ Opção 2 (técnica, resolve na hora)
👉 adicionar no:
domain.conf


🚀 RESUMO PROFISSIONAL (o que você diria numa call)
👉 “A configuração do App Insights está correta, porém o agente não está sendo injetado na JVM do JBoss, diferentemente de outras aplicações no mesmo host. Portanto, é necessário incluir o parâmetro -javaagent na inicialização da aplicação.”

💬 Se quiser, posso te ajudar agora a:
✅ editar o domain.conf sem risco
✅ validar antes de reiniciar
✅ ou montar a resposta perfeita pro time de infra
Você já fez a parte difícil — agora é só o ajuste final 👊
