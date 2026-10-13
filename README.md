# 1. Testar os dois datasources
/opt/jboss-eap/bin/jboss-cli.sh -c --command="/subsystem=datasources/data-source=simkt-ds:test-connection-in-pool"
/opt/jboss-eap/bin/jboss-cli.sh -c --command="/subsystem=datasources/data-source=siico-mkt-ds:test-connection-in-pool"

# 2. Para onde cada um aponta (URL/usuário)
/opt/jboss-eap/bin/jboss-cli.sh -c --command="/subsystem=datasources/data-source=simkt-ds:read-attribute(name=connection-url)"
/opt/jboss-eap/bin/jboss-cli.sh -c --command="/subsystem=datasources/data-source=siico-mkt-ds:read-attribute(name=connection-url)"

# 3. Boot de 08/out: erros e avisos, sem as linhas de token
zgrep -iE "ERROR|WARN|privilege|siico|WFLYJCA|WFLYSRV0010|WFLYSRV0025|Started|Exception" \
  /logs/jboss/jboss-eap/standalone/simkt-backend-vm/server.log.2026-10-08.gz \
  | grep -v KeycloakSecurityContext | grep -v "^\s*at " | head -80

# 4. Primeira ocorrência do NPE: desde quando quebrou?
for f in /logs/jboss/jboss-eap/standalone/simkt-backend-vm/server.log.2026-10-0*.gz; do
  echo "== $f: $(zgrep -c 'PrivilegeRepository.findByUriAndHttpMethod' $f)"
done
