<img width="1816" height="899" alt="image" src="https://github.com/user-attachments/assets/a7038056-beb1-4186-b974-db9ec36ef811" />


cd $(Build.SourcesDirectory)

p_group=$(project.group) || true
p_name=$(project.name)
p_version=$(project.version)
p_extension=$(project.extension)

p_group=`[ -z "$p_group" ] && echo ""br.gov.caixa.$p_name"" || echo "$p_group"`

echo $(valida.vec)
if [ $(valida.vec) = true ];then
p_version=$BUILD_SOURCEBRANCHNAME
NEXUS_URL=$(NEXUS_URL_RELEASE)
else
p_version=${p_version^^}
p_version=${p_version/-SNAPSHOT/}-SNAPSHOT
NEXUS_URL=$(NEXUS_URL_SNAPSHOT)
fi

echo -----------------------------------------
echo Dados do pacote: -DgroupId="${p_group}" -DartifactId="${p_name}" -Dversion="${p_version}" -Dpackaging="${p_extension}" Dfile="$(project.file)"  -Durl=${NEXUS_URL}

echo mvn deploy:deploy-file -DgroupId="${p_group}" -DartifactId="${p_name}" -Dversion="${p_version}" -Dpackaging="${p_extension}" -Dfile="$(project.file)" -DrepositoryId=$(NEXUS_REPOSITORY_ID) -DgeneratePom=true -Durl=${NEXUS_URL}

/opt/apache-maven/apache-maven-3.8.5/bin/mvn deploy:deploy-file -Dversion.app=$(Build.BuildNumber) -Dnexus_interno_user=$(nexus_interno_user) -Dnexus_interno_pass=$(nexus_interno_pass) -DgroupId="${p_group}" -DartifactId="${p_name}" -Dversion="${p_version}" -Dpackaging="${p_extension}" -Dfile="$(project.file)" -DrepositoryId=$(NEXUS_REPOSITORY_ID) -DgeneratePom=true -Durl=${NEXUS_URL} -Drevision="${p_version}"

echo "##vso[task.setvariable variable=project.uploaded;]true"


ele ta aqui
