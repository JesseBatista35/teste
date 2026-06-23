nao teve mudança esta assim desde 24/10/2025

#tudo que não for padrão VEC é snapshot
if [ $(valida.vec) = true ]; then
NEXUS_URL=$(NEXUS_URL_RELEASE)
else
NEXUS_URL=$(NEXUS_URL_SNAPSHOT)
fi


p_repository=`echo ${NEXUS_URL##*/}`
echo "##vso[task.setvariable variable=project.repository;]$p_repository"


Recupera versão projeto (groupId:artifactId:type:version)

cd $(Build.SourcesDirectory)

find . -name maven-wrapper.jar -delete

echo "Entrando no diretório: $(Build.SourcesDirectory)"
echo "Arquivos encontrados: `ls -la`"

if [ -z "$TARGET_PATH" ]; then 
	TARGET_PATH="." 
fi

sera se ano foi mudança no repositorio que ta causando isso?


