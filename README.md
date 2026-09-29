ls -la /SIGOT/.teste_wo
\rm -f /SIGOT/.teste_wo
su - jboss   -s /bin/bash -c 'touch /SIGOT/.teste_jboss   && rm -f /SIGOT/.teste_jboss   && echo app_ok'
su - f599802 -s /bin/bash -c 'touch /SIGOT/.teste_f599802 && rm -f /SIGOT/.teste_f599802 && echo app_ok'


ls -ln /SIGOT | head
id jboss; id f599802
nfs4_getfacl /SIGOT 2>/dev/null || echo "nfs4-acl-tools não instalado"
