#!/bin/bash
set -e

echo "======================================"
echo "Preparando Vault do SIMPG"
echo "======================================"

# Artifact vem do Azure DevOps
# Procura o keystore
KEYSTORE=$(find . -name "vaultcaixa.keystore" -type f 2>/dev/null | head -1)

if [ -n "$KEYSTORE" ]; then
  echo "Encontrado: $KEYSTORE"
  mkdir -p /opt/jboss/standalone/configuration/vault-des
  cp "$KEYSTORE" /opt/jboss/standalone/configuration/vault-des/vaultcaixa.keystore
  echo "✓ Vault copiado"
else
  echo "⚠ Keystore não encontrado - continuando"
fi

echo "======================================"
