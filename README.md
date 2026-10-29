oc rsh sibec-arquivos-des-209-r7dn8 sh -c 'cd /sibec && tar cf - . | (cd /sibec3 && tar xf - --no-same-owner); echo FIM rc=$?'

  oc rsh sibec-arquivos-des-209-r7dn8 sh -c 'cp -rp /sibec/. /sibec3/; echo FIM rc=$?'

    oc rsh sibec-arquivos-des-209-r7dn8 sh -c 'du -sh /sibec /sibec3; find /sibec -type f | wc -l; find /sibec3 -type f | wc -l'
