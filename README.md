oc rsh sibec-arquivos-des-210-hkjgk sh -c 'find /sibec -type f ! -readable | wc -l; find /sibec -type f ! -readable | head -20'

oc rsh sibec-arquivos-des-210-hkjgk sh -c 'cd /sibec && tar cf - . 2>/tmp/erros.txt | (cd /sibec3 && tar xf - --no-same-owner); echo FIM rc=$?; wc -l < /tmp/erros.txt'

oc rsh sibec-arquivos-des-210-hkjgk sh -c 'du -sh /sibec /sibec3; find /sibec -type f | wc -l; find /sibec3 -type f | wc -l'

