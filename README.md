{ echo; echo "### Validacao Limit (Servidor $(hostname)) ###"; echo; echo "\$ date"; date; echo; echo "### limits.conf ###"; echo; echo "\$ grep -vE '^\s*#|^\s*\$' /etc/security/limits.conf"; grep -vE '^\s*#|^\s*$' /etc/security/limits.conf; echo; echo "### limits.d ###"; echo; echo "\$ cat /etc/security/limits.d/*.conf"; cat /etc/security/limits.d/*.conf 2>/dev/null; echo; echo "### limites efetivos (5 primeiros java do sassdi) ###"; echo; echo "\$ pgrep -u sassdi java | head -5"; for p in $(pgrep -u sassdi java | head -5); do echo; echo "--- PID $p ---"; echo "\$ grep -E 'Max open files|Max processes|Max stack' /proc/$p/limits"; grep -E 'Max open files|Max processes|Max stack' /proc/$p/limits; done; echo; } 2>&1 | tee /tmp/coleta_$(hostname)_$(date +%d%m%Y).txt








# Criar diretório para centralizar os arquivos
mkdir -p ~/coleta_limites

# Coletar de cada servidor
for servidor in cbrpcapllx101 cbrpcapllx100 cbrpcapllx216 cbrpcapllx218; do
  echo "Copiando de $servidor..."
  scp sassdi@$servidor:/tmp/coleta_${servidor}_*.txt ~/coleta_limites/
done

# Ver os arquivos coletados
ls -lah ~/coleta_limites/
