
-sh-4.2$  echo "==CONTEUDO EAP71==" && \
> ls -la /opt/jbcs-httpd24-2.4/httpd/sites-enabled/eap_71_esteiraagil/ | grep -i sigpf &&
> echo "==TODOS ARQUIVOS==" &&
> ls /opt/jbcs-httpd24-2.4/httpd/sites-enabled/eap_71_esteiraagil/ ysession=JSESSIONID|jsessionid nofailover=
==CONTEUDO EAP71==
lrwxrwxrwx 1 apache apache    83 Mai  5  2021 httpd-eap71-des-sigpf-cca-internet.conf -> /opt/jbcs-httpd24-2.4/httpd/sites-available/httpd-eap71-des-sigpf-cca-internet.conf
lrwxrwxrwx 1 root   root      87 Mai 22 12:09 httpd-eap71-des-SIGPF-internet-backend.conf -> /opt/jbcs-httpd24-2.4/httpd/sites-available/httpd-eap71-des-SIGPF-internet-backend.conf
lrwxrwxrwx 1 apache apache    79 Ago  6  2020 httpd-eap71-des-sigpf-internet.conf -> /opt/jbcs-httpd24-2.4/httpd/sites-available/httpd-eap71-des-sigpf-internet.conf
lrwxrwxrwx 1 apache apache    79 Jul 23  2020 httpd-eap71-des-sigpf-intranet.conf -> /opt/jbcs-httpd24-2.4/httpd/sites-available/httpd-eap71-des-sigpf-intranet.conf
lrwxrwxrwx 1 apache apache    79 Jul 21  2020 httpd-eap71-des-SIGPF-intranet.conf -> /opt/jbcs-httpd24-2.4/httpd/sites-available/httpd-eap71-des-SIGPF-intranet.conf
==TODOS ARQUIVOS==
-sh: jsessionid: comando não encontrado
ls: não é possível acessar ysession=JSESSIONID: Arquivo ou diretório não encontrado
-sh-4.2$
