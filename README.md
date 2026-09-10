
[p585600@crjtqapllx036 opt]$ grep -A1 "inet-address" /opt/open/sso/7.3.0/standalone/configuration/standalone.xml
            <inet-address value="${jboss.bind.address.management:10.116.88.148}"/>
        </interface>
--
            <inet-address value="${jboss.bind.address:10.116.88.148}"/>
        </interface>
--
            <inet-address value="${jboss.bind.address.private:10.116.88.148}"/>
        </interface>
[p585600@crjtqapllx036 opt]$
[p585600@crjtqapllx036 opt]$
[p585600@crjtqapllx036 opt]$ cp /opt/open/sso/7.3.0/standalone/configuration/standalone.xml /opt/open/sso/7.3.0/standalone/configuration/standalone.xml.bkp_$(date +%Y%m%d%H%M)
cp: cannot create regular file ‘/opt/open/sso/7.3.0/standalone/configuration/standalone.xml.bkp_202609100952’: Permission denied
[p585600@crjtqapllx036 opt]$ sudo su
[root@crjtqapllx036 opt]# cp /opt/open/sso/7.3.0/standalone/configuration/standalone.xml /opt/open/sso/7.3.0/standalone/configuration/standalone.xml.bkp_$(date +%Y%m%d%H%M)
[root@crjtqapllx036 opt]#
[root@crjtqapllx036 opt]#
[root@crjtqapllx036 opt]# cp /opt/open/sso/7.3.0/standalone/configuration/set_config.properties /opt/open/sso/7.3.0/standalone/configuration/set_config.properties.bkp_$(date +%Y%m%d%H%M)
[root@crjtqapllx036 opt]#
[root@crjtqapllx036 opt]#
[root@crjtqapllx036 opt]#
