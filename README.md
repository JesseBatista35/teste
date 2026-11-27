F=/opt/jboss-eap/standalone/configuration/standalone-full-ha.xml
grep -A2 'SCMUTR01' $F | grep '<password>' | head -1 \
  | sed -E 's#.*<password>(.*)</password>.*#\1#' \
  | awk '{print "tamanho="length($0)}; /\$/{print "tem $"}; /&/{print "tem &"}; /#\{|__/{print "placeholder nao substituido"}; /^ | $/{print "espaco nas pontas"}'


  
