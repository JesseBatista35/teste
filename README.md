npm ls inputmask || true
echo "--- exports do inputmask ---"
cat node_modules/inputmask/package.json | grep -A 10 '"exports"' || true
echo "--- arquivos em dist/ ---"
ls node_modules/inputmask/dist/ || true
