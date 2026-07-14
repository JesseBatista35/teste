#!/bin/bash
# Corrige o formato da variável Enviroment removendo os "-e" (sintaxe docker, incompatível com oc set env)
RAW="$(Enviroment)"
FIXED=$(echo "$RAW" | sed 's/-e //g')

echo "Valor original: $RAW"
echo "Valor corrigido: $FIXED"

echo "##vso[task.setvariable variable=Enviroment;]$FIXED"
