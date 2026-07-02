cd ~/verificacao_sicmu
mkdir -p extraido
cd extraido
unzip -q ../SICMU-web.war



grep -r "vendor.js" . 2>/dev/null

grep -r "modernizr" . 2>/dev/null

grep -r "plugins.js" . 2>/dev/null
