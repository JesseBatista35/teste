
-sh-4.2$
-sh-4.2$ oc rsh sibec-arquivos-des-209-r7dn8 sh -c 'nohup sh -c "cd /sibec && tar cf - . | (cd /sibec3 && tar xf - --no-same-owner); echo FIM rc=\$?" > /tmp/copia_sibec.log 2>&1 &'
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc rsh sibec-arquivos-des-209-r7dn8 sh -c 'cat /tmp/copia_sibec.log; du -sh /sibec /sibec3'
cat: /tmp/copia_sibec.log: No such file or directory



