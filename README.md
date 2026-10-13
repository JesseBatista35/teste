
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ cd /tmp && mkdir -p simkt-cls && cd simkt-cls
-sh-4.2$
-sh-4.2$
-sh-4.2$ unzip -o -q $WAR 'WEB-INF/classes/br/gov/caixa/pedes/sistemas/simkt/integration/sso/repository/PrivilegeRepository.class' \
>                  'WEB-INF/classes/br/gov/caixa/pedes/sistemas/simkt/integration/sso/domain/csv/PrivilegeCsv.class'
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ which javap || ls /usr/lib/jvm/*/bin/javap
/usr/bin/which: no javap in (/usr/local/bin:/usr/bin:/usr/local/sbin:/usr/sbin)
ls: não é possível acessar /usr/lib/jvm/*/bin/javap: Arquivo ou diretório não encontrado
-sh-4.2$
-sh-4.2$
-sh-4.2$ javap -c -l -p WEB-INF/classes/br/gov/caixa/pedes/sistemas/simkt/integration/sso/repository/PrivilegeRepository.class \
>   | grep -n -B30 "line 47" | head -60
-sh: javap: comando não encontrado
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
