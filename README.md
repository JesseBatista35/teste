sed -i 's#vers=<X>#vers=4.0#' /etc/fstab
grep SIGOT /etc/fstab
mount /SIGOT && df -hT /SIGOT


ps -eo user,cmd | grep -Ei 'java|jboss|siafr' | grep -v grep


su - USUARIO -c 'touch /SIGOT/.teste_wo && rm -f /SIGOT/.teste_wo && echo app_ok'
