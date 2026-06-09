#!/bin/bash
set -x

echo "OCP_TOKEN: ${OCP_TOKEN:0:20}..."
echo "OCP_SERVER: $OCP_SERVER"
echo "OCP_USER: $OCP_USER"

if [ -z "$OCP_TOKEN" ]; then
    echo "❌ OCP_TOKEN VAZIO!"
    exit 1
fi

echo "✓ OK! Todas as variáveis chegaram"
