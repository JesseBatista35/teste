Exportando as variáveis do arquivo Trust Store

if [ -z "$DOWNLOADSECUREFILE_SECUREFILEPATH" ]; then
download_path=`echo $DOWNLOADSECUREFILE1_SECUREFILEPATH`
else
download_path=`echo $DOWNLOADSECUREFILE_SECUREFILEPATH`
fi
env
JKS_FILE=`basename $download_path`
JKS_FILE_PATH=`echo $download_path`
echo $download_path
echo "##vso[task.setvariable variable=JKS_FILE]$JKS_FILE"
echo "##vso[task.setvariable variable=JKS_FILE_PATH]$JKS_FILE_PATH"
echo "##vso[task.setvariable variable=caCertificate.secureFilePath]$JKS_FILE_PATH"



==========

Exportando Variáveis de Ambiente "_ENV."

#!/bin/bash

IFS=$'\n'
var_split="-e"

for OUTPUT in `printenv | sort`
do
if [[ "$OUTPUT" =~ ^_ENV_.*  ]]; then

    Enviroment="${Enviroment} $var_split ${OUTPUT#"_ENV_"}"
    echo ${OUTPUT#"_ENV_"}
fi
done

echo "##vso[task.setvariable variable=Enviroment;]$Enviroment"



