#!/bin/bash

# Define as variáveis de ambiente que a Task Group precisa
export jboss.deploy.dir=target
export project.file=./ear/target/sigpd-ear.ear
export project.extension=ear
export project.release=false

echo "##vso[task.setvariable variable=jboss.deploy.dir]target"
echo "##vso[task.setvariable variable=project.file]./ear/target/sigpd-ear.ear"
echo "##vso[task.setvariable variable=project.extension]ear"
echo "##vso[task.setvariable variable=project.release]false"

echo "✅ Variáveis definidas:"
echo "  jboss.deploy.dir = $jboss.deploy.dir"
echo "  project.file = $project.file"
echo "  project.extension = $project.extension"
echo "  project.release = $project.release"
