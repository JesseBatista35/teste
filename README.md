
-sh-4.2$ cat /opt/jbcs-httpd24-2.4/httpd/conf.d/mod_cluster.conf 2>/dev/null ||
> find /opt/jbcs-httpd24-2.4/httpd/conf.d/ -name "cluster" -o -name "modcluster" -o -name "mod_cluster" 2>/dev/null &&
> echo "==TODOS CONF.D==" &&
> ls /opt/jbcs-httpd24-2.4/httpd/conf.d/
==TODOS CONF.D==
manual.conf          mod_cluster.conf.disabled  mod_rt.conf.sample        proxy_ajp.conf  ssl.conf.disabled               userdir.conf  workers.properties.sample
mod_bmx.conf.sample  mod_jk.conf.sample         mod_security.conf.sample  README          uriworkermap.properties.sample  welcome.conf
-sh-4.2$
