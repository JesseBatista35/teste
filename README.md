# Limpa só cache, mantém o lock file
rm -rf .angular/cache
rm -rf node_modules/.cache
rm -rf node_modules
npm install
