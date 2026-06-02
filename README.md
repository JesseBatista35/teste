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









-sh-4.2$ { echo; echo "### Validacao Limit (Servidor $(hostname)) ###"; echo; echo "\$ date"; date; echo; echo "### limits.conf ###"; echo; echo "\$ grep -vE '^\s*#|^\s*\$' /etc/security/limits.conf"; grep -vE '^\s*#|^\s*$' /etc/security/limits.conf; echo; echo "### limits.d ###"; echo; echo "\$ cat /etc/security/limits.d/*.conf"; cat /etc/security/limits.d/*.conf 2>/dev/null; echo; echo "### limites efetivos (5 primeiros java do sassdi) ###"; echo; echo "\$ pgrep -u sassdi java | head -5"; for p in $(pgrep -u sassdi java | head -5); do echo; echo "--- PID $p ---"; echo "\$ grep -E 'Max open files|Max processes|Max stack' /proc/$p/limits"; grep -E 'Max open files|Max processes|Max stack' /proc/$p/limits; done; echo; } 2>&1 | tee /tmp/coleta_$(hostname)_$(date +%d%m%Y).txt
tee: /tmp/coleta_cbrpcapllx101.intra.caixa.gov.br_02062026.txt: Permission denied

### Validacao Limit (Servidor cbrpcapllx101.intra.caixa.gov.br) ###

$ date
Tue Jun  2 16:42:04 -03 2026

### limits.conf ###

$ grep -vE '^\s*#|^\s*$' /etc/security/limits.conf
sassdi          hard    nofile          350000
sassdi          soft    nofile          350000
sassdi          hard    nproc           100000
sassdi          soft    nproc           100000
sassdi          hard    stack           20480
sassdi          soft    stack           20480
sdisrv          hard    nofile          350000
sdisrv          soft    nofile          350000
sdisrv          hard    nproc           100000
sdisrv          soft    nproc           100000
sdisrv          hard    stack           20480
sdisrv          soft    stack           20480

### limits.d ###

$ cat /etc/security/limits.d/*.conf
# Default limit for number of user's processes to prevent
# accidental fork bombs.
# See rhbz #432903 for reasoning.

*          soft    nproc     100000
root       soft    nproc     unlimited

### limites efetivos (5 primeiros java do sassdi) ###

$ pgrep -u sassdi java | head -5

--- PID 62785 ---
$ grep -E 'Max open files|Max processes|Max stack' /proc/62785/limits
Max stack size            20971520             20971520             bytes
Max processes             100000               100000               processes
Max open files            350000               350000               files

--- PID 101032 ---
$ grep -E 'Max open files|Max processes|Max stack' /proc/101032/limits
Max stack size            20971520             20971520             bytes
Max processes             100000               100000               processes
Max open files            350000               350000               files

--- PID 119845 ---
$ grep -E 'Max open files|Max processes|Max stack' /proc/119845/limits
Max stack size            20971520             20971520             bytes
Max processes             100000               100000               processes
Max open files            350000               350000               files

--- PID 119930 ---
$ grep -E 'Max open files|Max processes|Max stack' /proc/119930/limits
Max stack size            20971520             20971520             bytes
Max processes             100000               100000               processes
Max open files            350000               350000               files

--- PID 120314 ---
$ grep -E 'Max open files|Max processes|Max stack' /proc/120314/limits
Max stack size            20971520             20971520             bytes
Max processes             100000               100000               processes
Max open files            350000               350000               files

-sh-4.2$

