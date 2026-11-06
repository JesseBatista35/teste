1. Confirmar no 2863:

bash
grep -n -B2 -A2 '<driver' /opt/jboss-eap/standalone/configuration/standalone-full-ha.xml

Se aparecer <driver>oracle</driver> e/ou <driver name="oracle" module="com.oracle">, está confirmado.

2. Comparar com o DES (955), onde o SIGSJ04 funciona:

bash
grep -n -B2 -A2 '<driver' /opt/jboss-eap/standalone/configuration/standalone-full-ha.xml

Ali deve estar <driver>ojdbc8.jar</driver>.

3. Ver qual branch de config a release do TQS usou. Na release SIGSJ-intranet-48, abra Artifacts e veja a branch do SIGSJ-intranet-config. Provavelmente é a branch da Gisele, a que voltamos temporariamente.

Correção no repo de config, na branch que a release usa, no bloco do SIGSJ04:

xml
<driver>ojdbc8.jar</driver>

Remova também a declaração <driver name="oracle" module="com.oracle">...</driver> dentro de <drivers>, se ela existir. Isso vale para DES e TQS, porque o arquivo é o mesmo.

Para segunda:

Corrigir o driver no repo, se o passo 1 confirmar.
O Vitor cadastra SIGSJ04_CONNECTION_STRING, SIGSJ04_USER e SIGSJ04_PASSWORD no grupo SIGSJ-INTRANET-TQS. Hoje o grupo tem 10 variáveis e nenhuma do SIGSJ04.
Rodar a release do TQS de novo.
Validar com grep -iE 'SIGSJ04|ORA-[0-9]', que precisa voltar sem faltam e sem ORA-.

Me manda a saída dos greps do 2863 e do 955 que eu confirmo se é isso mesmo.
