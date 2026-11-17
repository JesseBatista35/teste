/host=<host>/server-config=<server>/jvm=*:read-resource
/profile=<profile>/subsystem=datasources/data-source=<ds>:read-resource
/host=<host>/server=<server>/subsystem=datasources/data-source=<ds>/statistics=pool:read-resource(include-runtime=true)
/profile=<profile>/subsystem=transactions:read-attribute(name=default-timeout)
