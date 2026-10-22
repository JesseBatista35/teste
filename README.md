# 1. Qualquer jar dentro do ear (inclui lib/ e dentro dos .war)
cd /tmp/gec
find . -name "*.jar" -o -name "*.war" | while read j; do unzip -l "$j" 2>/dev/null | grep -qiE "applicationinsights|microsoft/applicationinsights" && echo "$j"; done
ls lib 2>/dev/null | grep -iE "insight|azure|opentelemetry|monitor"
for w in *.war; do unzip -l $w | grep -iE "WEB-INF/lib/.*(insight|azure-monitor|opentelemetry)"; done

# 2. Deployment framework-2.0.1.jar (hash bee2a460...)
unzip -l /opt/jboss/jboss-eap/hc/data/content/be/e2a4602a1e9785994c5ddf82c3153f64c70fc7/content | grep -iE "insight|telemetry"

# 3. Variáveis de ambiente do processo
tr '\0' '\n' < /proc/72951/environ | grep -iE "insight|APPLICATIONINSIGHTS|OTEL"

# 4. Limpeza
cd / && rm -rf /tmp/gec

DC
grep -nE "global-modules|insight" /opt/jboss/jboss-eap/dc/configuration/domain.xml
