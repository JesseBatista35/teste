No DC 6.4: em qual host roda o sifec-intranet5
CLI="sudo /opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=10.116.88.20:9999"; for h in $($CLI --command="ls /host"); do $CLI --command="/host=$h:read-children-resources(child-type=server-config)" | grep -B3 '"group" => "sifec-intranet5"' | grep -oE '"[a-z0-9_-]+" => \{' | sed "s/^/$h: /"; done

A saída deve ser algo como hc_sbrdeaplxxxx: "sifec-intranet5_node1..." => {, ou seja, o host e o servidor.

Com isso, no host que aparecer, vamos:

Ver o server.log do servidor do intranet5 no horário do teste do Edson (procurando ccr-api, AdapterTokenVerifier, kid).
Rodar o mesmo curl --noproxy das chaves a partir dele.

Sobre as propriedades SSO_* que você colou: são configurações das aplicações (clients como cli-web-fec, cli-ser-ccr, cli-ser-cdt), usadas pelo código para pedir tokens. Não interferem na validação feita pelo Keycloak no ccr-api, que é onde o 401 acontece (AdapterTokenVerifier). Ainda assim, vale comparar depois se a 473 tem todas as que o sifec-intranet do 6.4 tem.

Esses valores são secrets de client. Mesmo em DES, evite colar na sala.
