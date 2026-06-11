echo "## Instalando binário esbuild para linux-x64..."
cd $(Build.SourcesDirectory)
node node_modules/esbuild/install.js || npm rebuild esbuild || npm install @esbuild/linux-x64 --no-save
echo "## esbuild fix concluído"


tem isso aqui de scrip faz tempo ja 

antes de todos so scripts

