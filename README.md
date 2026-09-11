
[p585600@crjtqapllx036 ~]$
[p585600@crjtqapllx036 ~]$
[p585600@crjtqapllx036 ~]$ sed -i 's/10.116.88.148/10.116.26.227/g' /opt/open/sso/7.3.0/standalone/configuration/standalone.xml
sed: couldn't open temporary file /opt/open/sso/7.3.0/standalone/configuration/sedetsGDo: Permission denied
[p585600@crjtqapllx036 ~]$ sudo su
[root@crjtqapllx036 p585600]# sed -i 's/10.116.88.148/10.116.26.227/g' /opt/open/sso/7.3.0/standalone/configuration/standalone.xml
[root@crjtqapllx036 p585600]#
[root@crjtqapllx036 p585600]# grep -A1 "inet-address" /opt/open/sso/7.3.0/standalone/configuration/standalone.xml
            <inet-address value="${jboss.bind.address.management:10.116.26.227}"/>
        </interface>
--
            <inet-address value="${jboss.bind.address:10.116.26.227}"/>
        </interface>
--
            <inet-address value="${jboss.bind.address.private:10.116.26.227}"/>
        </interface>
[root@crjtqapllx036 p585600]#
[root@crjtqapllx036 p585600]#
[root@crjtqapllx036 p585600]#

