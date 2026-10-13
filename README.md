JAVA=/usr/lib/jvm/java-11-openjdk-11.0.8.10-1.el7.x86_64/bin/java

# O módulo do javap (jdk.jdeps) está presente?
$JAVA --list-modules | grep -E "jdk.jdeps|jdk.compiler"

# Se jdk.jdeps aparecer:
cd /tmp/simkt-cls
$JAVA --module jdk.jdeps/com.sun.tools.javap.Main -c -l -p \
  WEB-INF/classes/br/gov/caixa/pedes/sistemas/simkt/integration/sso/repository/PrivilegeRepository.class \
  > /tmp/simkt-cls/privrepo.txt

# Trecho do método que falha + tabela de linhas
grep -n "findByUriAndHttpMethod" /tmp/simkt-cls/privrepo.txt
sed -n '/findByUriAndHttpMethod/,/LocalVariableTable/p' /tmp/simkt-cls/privrepo.txt | head -120
