-sh-4.2$ echo "==MOD_JK CONF==" &&
> cat /opt/jbcs-httpd24-2.4/httpd/conf.d/mod_jk.conf.sample &&
> echo "==WORKERS==" &&
> cat /opt/jbcs-httpd24-2.4/httpd/conf.d/workers.properties.sample &&
> echo "==ARQUIVOS ATIVOS JK==" &&
> find /opt/jbcs-httpd24-2.4/httpd/ -name "workers.properties" -o -name "uriworkermap.properties" 2>/dev/null &&
> echo "==MODULOS CARREGADOS==" &&
> /opt/jbcs-httpd24-2.4/httpd/sbin/apachectl -M 2>/dev/null | grep -i "jk|cluster|proxy"
==MOD_JK CONF==
# Load mod_jk module
# Specify the filename of the mod_jk lib
LoadModule jk_module modules/mod_jk.so

# Where to find workers.properties
JkWorkersFile conf.d/workers.properties

# Where to put jk logs
JkLogFile logs/mod_jk.log

# Set the jk log level [debug/error/info]
JkLogLevel info

# Select the log format
JkLogStampFormat  "[%a %b %d %H:%M:%S %Y]"

# JkOptions indicates to send SSK KEY SIZE
JkOptions +ForwardKeySize +ForwardURICompat -ForwardDirectories

# JkRequestLogFormat
JkRequestLogFormat "%w %V %T"

# Mount your applications
# JkMount /application/* loadbalancer

# You can use external file for mount points.
# It will be checked for updates each 60 seconds.
# The format of the file is: /url=worker
# /examples/*=loadbalancer
JkMountFile conf.d/uriworkermap.properties

# Add shared memory.
# This directive is present with 1.2.10 and
# later versions of mod_jk, and is needed for
# for load balancing to work properly
JkShmFile logs/jk.shm ==WORKERS==
# An entry that lists all the workers defined
worker.list=worker1,worker2

# Entries that define the host and port associated with these workers
worker.worker1.host=IP_TO_SET_1
worker.worker1.port=AJP_PORT_1
worker.worker1.type=ajp13

worker.worker2.host=IP_TO_SET_2
worker.worker2.port=AJP_PORT_2
worker.worker2.type=ajp13==ARQUIVOS ATIVOS JK==
-sh-4.2$
