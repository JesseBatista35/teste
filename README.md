#!/bin/bash

# Exporta como variável de ambiente ANTES da Task Group rodar
export jboss_deploy_dir=target
export project_file=./ear/target/sigpd-ear.ear

# Define para as próximas tasks
echo "##vso[task.setvariable variable=jboss_deploy_dir]target"
echo "##vso[task.setvariable variable=project_file]./ear/target/sigpd-ear.ear"

echo "✅ Variáveis exportadas:"
echo "  jboss_deploy_dir = $jboss_deploy_dir"
echo "  project_file = $project_file"
