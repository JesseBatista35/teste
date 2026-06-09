#!/bin/bash
set -o errexit

# Login
oc login -u "$OCP_USER" -p "$OCP_PASSWORD" https://api.nprd.caixa:6443

# Configurar
export APP_NAME="sifof-api-aplicacao"
export NAMESPACE="build-images-ads"
export IMAGESTREAM="rhel9/openjdk-21"
export BUILD_DIR="./app"

# Executar
chmod +x build-s2i.sh
./build-s2i.sh
