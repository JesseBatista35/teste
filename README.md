# 1) Perfis que existem dentro do jar: mostra se o nome é "tqs" ou "tgs"
JAR=$(ls -t /opt/batch/deploy/*.jar 2>/dev/null | head -1); echo "JAR: $JAR"
unzip -l "$JAR" | grep -E "application.*\.ya?ml"

# 2) O que cada perfil define para Data Grid / profile
for f in $(unzip -l "$JAR" | grep -oE "BOOT-INF/classes/application[^ ]*\.ya?ml"); do
  echo "===== $f"
  unzip -p "$JAR" "$f" | grep -inE "profile|datagrid|infinispan|11222|host"
done

# 3) Onde a esteira gravou as variáveis no servidor
sudo grep -rIl -E "BATCH_PROFILE|SIIFX_DATAGRID" /opt/batch /producao /etc/profile.d 2>/dev/null

# 4) A VM de TQS alcança o Data Grid atual?
timeout 5 bash -c '</dev/tcp/caddeapllx2221.agil.nprd.caixa.gov.br/11222' && echo "DATAGRID OK" || echo "DATAGRID FALHOU"
