### Validacao Limit (Servidor cbrpcapllx218.intra.caixa.gov.br) ###

$ date
Tue Jun  2 17:02:14 -03 2026

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

--- PID 3805 ---
$ grep -E 'Max open files|Max processes|Max stack' /proc/3805/limits
Max stack size            20971520             20971520             bytes
Max processes             100000               100000               processes
Max open files            350000               350000               files

--- PID 5758 ---
$ grep -E 'Max open files|Max processes|Max stack' /proc/5758/limits
Max stack size            20971520             20971520             bytes
Max processes             100000               100000               processes
Max open files            350000               350000               files

--- PID 6199 ---
$ grep -E 'Max open files|Max processes|Max stack' /proc/6199/limits
Max stack size            20971520             20971520             bytes
Max processes             100000               100000               processes
Max open files            350000               350000               files

--- PID 6744 ---
$ grep -E 'Max open files|Max processes|Max stack' /proc/6744/limits
Max stack size            20971520             20971520             bytes
Max processes             100000               100000               processes
Max open files            350000               350000               files

--- PID 7480 ---
$ grep -E 'Max open files|Max processes|Max stack' /proc/7480/limits
Max stack size            20971520             20971520             bytes
Max processes             100000               100000               processes
Max open files            350000               350000               files
