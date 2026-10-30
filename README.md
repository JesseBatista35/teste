if [ -z "$DOWNLOADSECUREFILE_SECUREFILEPATH" ]; then
  download_path="$DOWNLOADSECUREFILE1_SECUREFILEPATH"
else
  download_path="$DOWNLOADSECUREFILE_SECUREFILEPATH"
fi

if [ -z "$download_path" ] || [ ! -f "$download_path" ]; then
  echo "##vso[task.logissue type=error]Secure file não encontrado. Verifique a task Download Secure File deste stage (reference name padrão DownloadSecureFile/DownloadSecureFile1, task habilitada e arquivo autorizado)."
  echo "Variáveis SECUREFILEPATH disponíveis:"
  env | grep -i securefilepath
  exit 1
fi

JKS_FILE=$(basename "$download_path")
JKS_FILE_PATH="$download_path"
echo "Secure file encontrado: $JKS_FILE_PATH"

echo "##vso[task.setvariable variable=JKS_FILE]$JKS_FILE"
echo "##vso[task.setvariable variable=JKS_FILE_PATH]$JKS_FILE_PATH"
echo "##vso[task.setvariable variable=caCertificate.secureFilePath]$JKS_FILE_PATH"
