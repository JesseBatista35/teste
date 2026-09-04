cd $(Build.SourcesDirectory)

p_group=$(project.group) || true
p_name=$(project.name)
p_version=$(project.version)
p_extension=$(project.extension)

p_group=`[ -z "$p_group" ] && echo ""br.gov.caixa.$p_name"" || echo "$p_group"`

echo VEC $(valida.vec)
if [ $(valida.vec) = true ];then
p_version=$BUILD_SOURCEBRANCHNAME
NEXUS_URL=$(NEXUS_URL_RELEASE)
else
p_version=${p_version^^}
p_version=${p_version/-SNAPSHOT/}-SNAPSHOT
#definido por GECPA em Nov/2025 que todo artefato não release candidate deve conter sufixo -SNAPSHOT
echo "##vso[build.updatebuildnumber]"$p_version""
NEXUS_URL=$(NEXUS_URL_SNAPSHOT)
fi

echo "##[section]=== Info do pacote ==="
echo "##[section]groupid= $p_group"
echo "##[section]artifact= $p_name"
echo "##[section]version= $p_version"
echo "========================================================="

LIB="$(library)"
# quando for uma pipeline do tipo lib o pom original do projeto precisa subir junto
if [ "${LIB:-}" = "true" ] || [ "${LIB:-}" = "TRUE" ]; then

echo -Dversion.app=$(Build.BuildNumber) -Dnexus_interno_user=$(nexus_interno_user) -Dnexus_interno_pass=$(nexus_interno_pass) -DgroupId="${p_group}" -DartifactId="${p_name}" -Dversion="${p_version}" -Dpackaging="${p_extension}" -Dfile="$(project.file)" -DpomFile="$(Build.SourcesDirectory)/$(POM_PATH)" -DrepositoryId=$(NEXUS_REPOSITORY_ID) -DgeneratePom=false -Durl=${NEXUS_URL} -Drevision="${p_version}"

/opt/apache-maven/apache-maven-3.8.5/bin/mvn deploy:deploy-file -Dversion.app=$(Build.BuildNumber) -Dnexus_interno_user=$(nexus_interno_user) -Dnexus_interno_pass=$(nexus_interno_pass) -DgroupId="${p_group}" -DartifactId="${p_name}" -Dversion="${p_version}" -Dpackaging="${p_extension}" -Dfile="$(project.file)" -DpomFile="$(Build.SourcesDirectory)/$(POM_PATH)" -DrepositoryId=$(NEXUS_REPOSITORY_ID) -DgeneratePom=false -Durl=${NEXUS_URL} -Drevision="${p_version}"

else

echo -Dversion.app=$(Build.BuildNumber) -DgroupId="${p_group}" -DartifactId="${p_name}" -Dversion="${p_version}" -Dpackaging="${p_extension}" -Dfile="$(project.file)" -DrepositoryId=$(NEXUS_REPOSITORY_ID) -DgeneratePom=true -Durl=${NEXUS_URL}

/opt/apache-maven/apache-maven-3.8.5/bin/mvn deploy:deploy-file -Dversion.app=$(Build.BuildNumber) -Dnexus_interno_user=$(nexus_interno_user) -Dnexus_interno_pass=$(nexus_interno_pass) -DgroupId="${p_group}" -DartifactId="${p_name}" -Dversion="${p_version}" -Dpackaging="${p_extension}" -Dfile="$(project.file)" -DrepositoryId=$(NEXUS_REPOSITORY_ID) -DgeneratePom=true -Durl=${NEXUS_URL} -Drevision="${p_version}"

fi

echo "##vso[task.setvariable variable=project.uploaded;]true"
