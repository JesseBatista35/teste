✅ TUDO PRONTO! Resumo do que você vai fazer:
📋 3 Arquivos Principais:

PASSO-A-PASSO-VISUAL.md ← LEIA ESTE PRIMEIRO (mais fácil)
GUIA-RAPIDO-COPIA-COLA.md ← Referência rápida
script-apenas.sh ← Bash puro para colar


🚀 O que você vai fazer (15 minutos):
1️⃣ Pegar Token (2 min)
bashoc login -u seu-usuario -p sua-senha https://api.nprd.caixa:6443 \
    --insecure-skip-tls-verify=true

oc whoami -t    # ← Copie isto!
2️⃣ No Azure DevOps - Adicionar 3 Variáveis (3 min)
Pipeline > Edit > Variables (topo-direita)

OCP_TOKEN     = eyJh... (copie do passo 1, marcar 🔒 Secret)
OCP_SERVER    = https://api.nprd.caixa:6443
OCP_USER      = seu-usuario
3️⃣ No Azure DevOps - Adicionar Bash Task (5 min)
Tasks > [+ Add a task] > Bash > Add

Display name: Build S2I OpenShift

Script: [Copie do arquivo script-apenas.sh]

Environment: Preencha 3 variáveis
  OCP_TOKEN = $(OCP_TOKEN)
  OCP_SERVER = $(OCP_SERVER)
  OCP_USER = $(OCP_USER)
4️⃣ Salvar e Rodar (5 min)
[Save] → [Save & queue] → Pronto!

📌 Lembrete:
✅ O BuildConfig é criado AUTOMATICAMENTE
✅ Se for deletado novamente, o script recria
✅ Sem user/senha em lugar algum (seguro)
✅ Usa só o token (mais seguro ainda)
