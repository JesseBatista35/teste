
<img width="1618" height="886" alt="image" src="https://github.com/user-attachments/assets/8a2a5fc1-a8bc-4c2a-bdf6-1eb544a247cc" />

é um taskgrop

Recupera versão projeto (groupId:artifactId:type:version)


cd $(Build.SourcesDirectory)

find . -name maven-wrapper.jar -delete

echo "Entrando no diretório: $(Build.SourcesDirectory)"
echo "Arquivos encontrados: `ls -la`"

if [ -z "$TARGET_PATH" ]; then 
	TARGET_PATH="target" 
fi

for extension in ear war jar
do
   file=`find $TARGET_PATH -name "*.${extension}"`
   if [ -n "${file}" ]
   then
			PROJECT_FILE="${file}"
			p_extension="${extension}"
			break
   fi
done

echo "Encontrado o arquivo: $file\n"

export PROJECT_DIR=`dirname ${PROJECT_FILE}`
export PROJECT_POM_PROPERTIES_FILE=`find ${PROJECT_DIR} -name pom.properties`

echo "Diretório do projeto: $PROJECT_DIR"
echo "Conteúdo do diretório: `ls -la $PROJECT_DIR`"
echo "Arquivo POM: $PROJECT_POM_PROPERTIES_FILE"

#if [ -z $PROJECT_POM_PROPERTIES_FILE ]
#then
#      echo "Arquivo pom.properties não encontrado, favor verificar a versão da TAG <maven-ear-plugin-version> no pom.properties, algumas versões #possuem BUG e não gera o arquivo."
#      exit 1
#fi


p_version=`egrep version ${PROJECT_POM_PROPERTIES_FILE} | awk -F = {'print $2'}`		 
p_group=`egrep groupId ${PROJECT_POM_PROPERTIES_FILE} | awk -F = {'print $2'}`
p_artifact=`egrep artifactId ${PROJECT_POM_PROPERTIES_FILE} | awk -F = {'print $2'}`
p_projectKey=`echo $p_artifact | tr -cd '[:alnum:]'` 

echo "${p_group}:${p_artifact}:${p_extension}:${p_version}"

echo "##vso[task.setvariable variable=project.group;]$p_group"

echo "##vso[task.setvariable variable=project.name;]$p_artifact"

echo "##vso[task.setvariable variable=project.version;]$p_version"

echo "##vso[task.setvariable variable=project.extension;]$p_extension"

echo "##vso[task.setvariable variable=project.key;]$p_projectKey"

echo "##vso[task.setvariable variable=project.file;]${PROJECT_FILE}"

if [[ ! -z ${PROJECT_RELEASE} ]] && ([ ${PROJECT_RELEASE} == false ] || [ ${PROJECT_RELEASE} == true ]) ; then

echo "##vso[task.setvariable variable=project.release;]${PROJECT_RELEASE}"

else

echo "##vso[task.setvariable variable=project.release;]true"

if [[ ${p_version} == *"$(NEXUS_URL_SNAPSHOT_ALIAS)"* ]]; then
  echo "##vso[task.setvariable variable=project.release;]false"
fi

fi

echo "##vso[task.setvariable variable=POM_PATH;]$(POM_PATH)"

