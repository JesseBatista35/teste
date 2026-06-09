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




=============================



#!/bin/bash
set -x
set -e
set -o pipefail

echo "===== BUILD S2I NO OPENSHIFT ====="

# Variáveis (vem do Pipeline Variables)
OCP_TOKEN="${OCP_TOKEN}"
OCP_SERVER="${OCP_SERVER}"
OCP_USER="${OCP_USER}"
APP_NAME="sifof-api-aplicacao"
NAMESPACE="build-images-ads"
BUILD_DIR="/opt/ads-agent/_work/61/a"

echo "Server: $OCP_SERVER"
echo "User: $OCP_USER"
echo "App: $APP_NAME"
echo ""

# PASSO 1: Login com Token
echo ">>> PASSO 1: Fazendo login..."
oc login --token="$OCP_TOKEN" --server="$OCP_SERVER" \
    --insecure-skip-tls-verify=true || {
    echo "❌ FALHA no login!"
    exit 1
}

echo "✓ Autenticado como: $(oc whoami)"
echo ""

# PASSO 2: Validar namespace
echo ">>> PASSO 2: Validando namespace..."
oc project "$NAMESPACE" || {
    echo "❌ Namespace não encontrado!"
    exit 1
}
echo "✓ Namespace ok"
echo ""

# PASSO 3: Recriar BuildConfig se deletado
echo ">>> PASSO 3: Verificando BuildConfig..."

if oc get buildconfig "$APP_NAME" -n "$NAMESPACE" &>/dev/null; then
    echo "✓ BuildConfig '$APP_NAME' existe"
else
    echo "⚠️  BuildConfig não encontrado. Criando..."
    
    cat << 'YAML' | oc create -f - -n "$NAMESPACE"
apiVersion: build.openshift.io/v1
kind: BuildConfig
metadata:
  name: sifof-api-aplicacao
  namespace: build-images-ads
spec:
  source:
    type: Binary
    binary: {}
  strategy:
    type: Source
    sourceStrategy:
      from:
        kind: ImageStreamTag
        name: openjdk-21
        namespace: openshift
      incremental: true
  output:
    to:
      kind: ImageStreamTag
      name: sifof-api-aplicacao:latest
  runPolicy: Serial
YAML
    
    echo "✓ BuildConfig criado"
fi
echo ""

# PASSO 4: Fazer build
echo ">>> PASSO 4: Iniciando build S2I..."
echo "Aguarde... (isso pode levar alguns minutos)"
echo ""

oc start-build "$APP_NAME" \
    --from-dir="$BUILD_DIR" \
    --follow \
    --wait=true \
    -n "$NAMESPACE" \
    -v=5 || {
    echo ""
    echo "❌ Build falhou!"
    echo ""
    echo "Verificar logs:"
    echo "  oc logs -f bc/$APP_NAME -n $NAMESPACE"
    exit 1
}

echo ""
echo "===== ✓ BUILD CONCLUÍDO COM SUCESSO ====="
echo ""
oc get imagestream "$APP_NAME" -n "$NAMESPACE" -o wide || true
