
[root@crjtqapllx036 opt]# cp /opt/open/sso/7.3.0/standalone/configuration/set_config.properties /opt/open/sso/7.3.0/standalone/configuration/set_config.properties.bkp_$(date +%Y%m%d%H%M)
[root@crjtqapllx036 opt]#
[root@crjtqapllx036 opt]#
[root@crjtqapllx036 opt]# diff /caminho/do/anexo/standalone.xml /opt/open/sso/7.3.0/standalone/configuration/standalone.xml
diff: /caminho/do/anexo/standalone.xml: No such file or directory
[root@crjtqapllx036 opt]#
[root@crjtqapllx036 opt]#
[root@crjtqapllx036 opt]# sed -i 's/10.116.88.148/10.116.26.227/g' /opt/open/sso/7.3.0/standalone/configuration/standalone.xml
[root@crjtqapllx036 opt]#
[root@crjtqapllx036 opt]#
[root@crjtqapllx036 opt]# grep -A1 "inet-address" /opt/open/sso/7.3.0/standalone/configuration/standalone.xml
            <inet-address value="${jboss.bind.address.management:10.116.26.227}"/>
        </interface>
--
            <inet-address value="${jboss.bind.address:10.116.26.227}"/>
        </interface>
--
            <inet-address value="${jboss.bind.address.private:10.116.26.227}"/>
        </interface>
[root@crjtqapllx036 opt]#
