for v in CACERTIFICATE_SECUREFILEPATH DOWNLOADSECUREFILE_SECUREFILEPATH DOWNLOADSECUREFILE1_SECUREFILEPATH; do
  if [ -n "${!v}" ] && [ -f "${!v}" ]; then download_path="${!v}"; break; fi
done

if [ -z "$download_path" ]; then
  echo "##vso[task.logissue type=error]Secure file não encontrado. Verifique a task Download secure file."
  env | grep -i securefilepath
  exit 1
fi

JKS_FILE=$(basename "$download_path")
echo "Secure file encontrado: $download_path"
echo "##vso[task.setvariable variable=JKS_FILE]$JKS_FILE"
echo "##vso[task.setvariable variable=caCertificate.secureFilePath]$download_path"
