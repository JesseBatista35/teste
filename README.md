cd /tmp && mkdir -p simkt-cls && cd simkt-cls
unzip -o -q $WAR 'WEB-INF/classes/br/gov/caixa/pedes/sistemas/simkt/integration/sso/repository/PrivilegeRepository.class' \
                 'WEB-INF/classes/br/gov/caixa/pedes/sistemas/simkt/integration/sso/domain/csv/PrivilegeCsv.class'

which javap || ls /usr/lib/jvm/*/bin/javap
# usar o javap encontrado:
javap -c -l -p WEB-INF/classes/br/gov/caixa/pedes/sistemas/simkt/integration/sso/repository/PrivilegeRepository.class \
  | grep -n -B30 "line 47" | head -60
