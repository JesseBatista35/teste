oc rsh sibec-arquivos-des-210-hkjgk sh -c 'cd /sibec && tar cf - . 2>/tmp/erros.txt | (cd /sibec3 && tar xvf - --no-same-owner --skip-old-files) | while read f; do n=$((n+1)); [ $((n%500)) -eq 0 ] && echo "$n arquivos..."; done; echo FIM; wc -l < /tmp/erros.txt'


oc rsh sibec-arquivos-des-210-hkjgk sh -c 'cd /sibec && find . -type f -readable -printf "%s %p\n" | sort -k2 > /tmp/orig.txt; cd /sibec3 && find . -type f -printf "%s %p\n" | sort -k2 > /tmp/dest.txt; diff /tmp/orig.txt /tmp/dest.txt | grep "^<" | head -30; diff /tmp/orig.txt /tmp/dest.txt | grep -c "^<"'


