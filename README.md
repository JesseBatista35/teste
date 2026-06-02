Fazer a execução do comando:
Prezados.
Para verificação das configurações de configuração "limits" implantados no ambiente e atualmente em uso pela aplicação SASSDI, peço que realizem a execução do comando:
{ echo; echo "### Validacao Limit (Servidor $(hostname)) ###"; echo; echo "\$ date"; date; echo; echo "### limits.conf ###"; echo; echo "\$ grep -vE '^\s*#|^\s*\$' /etc/security/limits.conf"; grep -vE '^\s*#|^\s*$' /etc/security/limits.conf; echo; echo "### limits.d ###"; echo; echo "\$ cat /etc/security/limits.d/*.conf"; cat /etc/security/limits.d/*.conf 2>/dev/null; echo; echo "### limites efetivos (5 primeiros java do sassdi) ###"; echo; echo "\$ pgrep -u sassdi java | head -5"; for p in $(pgrep -u sassdi java | head -5); do echo; echo "--- PID $p ---"; echo "\$ grep -E 'Max open files|Max processes|Max stack' /proc/$p/limits"; grep -E 'Max open files|Max processes|Max stack' /proc/$p/limits; done; echo; } 2>&1 | tee /tmp/coleta_$(hostname)_$(date +%d%m%Y).txt
Nos servidores:
cbrpcapllx101  - 10.120.71.12
cbrpcapllx100 - 10.120.71.11
cbrpcapllx216  - 10.120.72.56
cbrpcapllx218  - 10.120.72.58
Após execução, o comando criar um arquivo coleta_nome_maquina_data.txt na pasta /tmp/ de cada máquina. Favor nos enviar os 4 arquivos para análise.
me ajuda a fazer isso eu tenho acesso ao moba. ja estou logado no primeiro servidor



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









Opção 1: Salvar no seu HOME (Recomendado)
Execute este comando modificado:
bash{ echo; echo "### Validacao Limit (Servidor $(hostname)) ###"; echo; echo "\$ date"; date; echo; echo "### limits.conf ###"; echo; echo "\$ grep -vE '^\s*#|^\s*\$' /etc/security/limits.conf"; grep -vE '^\s*#|^\s*$' /etc/security/limits.conf; echo; echo "### limits.d ###"; echo; echo "\$ cat /etc/security/limits.d/*.conf"; cat /etc/security/limits.d/*.conf 2>/dev/null; echo; echo "### limites efetivos (5 primeiros java do sassdi) ###"; echo; echo "\$ pgrep -u sassdi java | head -5"; for p in $(pgrep -u sassdi java | head -5); do echo; echo "--- PID $p ---"; echo "\$ grep -E 'Max open files|Max processes|Max stack' /proc/$p/limits"; grep -E 'Max open files|Max processes|Max stack' /proc/$p/limits; done; echo; } 2>&1 | tee ~/coleta_$(hostname)_$(date +%d%m%Y).txt
A única mudança é: ~/coleta_ em vez de /tmp/coleta_








============================================




{ echo; echo "### Validacao Limit (Servidor $(hostname)) ###"; echo; echo "\$ date"; date; echo; echo "### limits.conf ###"; echo; echo "\$ grep -vE '^\s*#|^\s*\$' /etc/security/limits.conf"; grep -vE '^\s*#|^\s*$' /etc/security/limits.conf; echo; echo "### limits.d ###"; echo; echo "\$ cat /etc/security/limits.d/*.conf"; cat /etc/security/limits.d/*.conf 2>/dev/null; echo; echo "### limites efetivos (5 primeiros java do sassdi) ###"; echo; echo "\$ pgrep -u sassdi java | head -5"; for p in $(pgrep -u sassdi java | head -5); do echo; echo "--- PID $p ---"; echo "\$ grep -E 'Max open files|Max processes|Max stack' /proc/$p/limits"; grep -E 'Max open files|Max processes|Max stack' /proc/$p/limits; done; echo; } 2>&1 | tee ~/coleta_$(hostname)_$(date +%d%m%Y).txt
