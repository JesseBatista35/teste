oc rsh sibec-arquivos-des-210-hkjgk sh -c 'awk "NR==FNR{a[\$0];next} !(\$0 in a)" /tmp/dest.txt /tmp/orig.txt > /tmp/faltando.txt; wc -l < /tmp/faltando.txt; head -30 /tmp/faltando.txt; du -sh /sibec /sibec3'

  oc rsh sibec-arquivos-des-210-hkjgk sh -c 'cp -p "/sibec/<caminho>" "/sibec3/<caminho>"'

  oc rsh sibec-arquivos-des-210-hkjgk sh -c 'find /sibec -type f ! -readable'
