
[root@caddeapllx2540 /]#
[root@caddeapllx2540 /]#
[root@caddeapllx2540 /]# F=/opt/jboss-eap/standalone/configuration/standalone-full-ha.xml
[root@caddeapllx2540 /]#
[root@caddeapllx2540 /]#
[root@caddeapllx2540 /]#
[root@caddeapllx2540 /]# grep -A2 'SCMUTR01' $F | grep '<password>' | head -1 \
>   | sed -E 's#.*<password>(.*)</password>.*#\1#' \
>   | awk '{print "tamanho="length($0)}; /\$/{print "tem $"}; /&/{print "tem &"}; /#\{|__/{print "placeholder nao substituido"}; /^ | $/{print "espaco nas pontas"}'
tamanho=7
[root@caddeapllx2540 /]#
[root@caddeapllx2540 /]#
[root@caddeapllx2540 /]#
[root@caddeapllx2540 /]#
[root@caddeapllx2540 /]#
