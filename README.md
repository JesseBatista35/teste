   grep -n '2026-11-03 13:27:1[34]' /logs/jboss/jboss-eap/standalone/sigsj-boleto/server.log | grep -v '^\S*\s*\S*\s*ERROR \[stderr\].*\sat ' | head -30
   ls -la /log_jboss/config-log4j/
