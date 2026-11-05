Veja a sequência com as URLs (no 473; o comando agrupa as linhas repetidas):

LOG=/opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log
sudo grep -E "^15:17:" $LOG | grep "org.keycloak" | grep -v "Policy enforcement" | sed -E 's/^[0-9:,]+ //' | uniq -c | tail -80

Interessa o que vem logo depois das linhas invoke https://.../workflow-credito-pj-web/api/perfil-acesso-usuario:

Aparece checking whether to refresh depois do PJ: o PJ tem token na sessão, e o problema está no código ao ler as roles.
checking whether to refresh só depois de URLs do /fec-web/: confirma que só o fec-web está autenticado e o PJ não.

E desligue o TRACE (se ainda não fez), porque ele gera muita linha:

/profile=full-ha-sifec-intranet/subsystem=logging/periodic-rotating-file-handler=FILE:write-attribute(name=level,value=INFO)
/profile=full-ha-sifec-intranet/subsystem=logging/logger=org.keycloak:write-attribute(name=level,value=INFO)
