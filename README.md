#!/bin/bash

# Remove o diretório com nome literal ${jboss.deploy.dir}
rm -rf "ear/${jboss.deploy.dir}"

# Ou se preferir ser mais agressivo:
find ear/ -type d -name '*${*' -exec rm -rf {} \; 2>/dev/null

# Limpa e lista
ls -lhtr ear/

echo "✅ Limpeza concluída!"
