1. Olha dentro do jar onde está esse caminho e se ele lê de alguma property:

bash
cd /tmp && rm -rf cefl && mkdir cefl && cd cefl
unzip -o /tmp/sirotjar/ceflib2.0.5.jar >/dev/null 2>&1
grep -rin "log_ias\|config-log4j\|ceflib.xml\|log4j" . 2>/dev/null | head -40

2. Vê se o legado seta alguma property pra ceflib/log4j no startup:

bash
grep -rin "log_ias\|config-log4j\|ceflib" /opt/jboss/jboss-5.1.0.GA/bin 2>/dev/null
grep -rin "log_ias\|config-log4j\|ceflib" /opt/jboss/jboss-5.1.0.GA/server/sigsj_intranet/conf 2>/dev/null

3. Procura um ceflib.xml/log4j de verdade no deploy legado do intranet:

bash
find /opt/jboss/jboss-5.1.0.GA/server/sigsj_intranet -iname "*log4j*" -o -iname "ceflib*.xml" 2>/dev/null
ls -la /opt/jboss/jboss-5.1.0.GA/server/sigsj_intranet/conf 2>/dev/null

Me cola os resultados. Com isso a gente sabe se:

É inofensivo (o legado também não tinha o arquivo) → cria um ceflib.xml mínimo só pra calar o erro, e entrega via esteira.
Tem property (ex: -Dceflib.log4j=...) → a gente seta a mesma property no standalone.conf da VM.

E me confirma o principal: o login do intranet está entrando normal ou travou? Se está entrando, esse erro é só log — não é urgência.
