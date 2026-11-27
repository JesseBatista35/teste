sudo su -
# acha a resposta da GJ4D no log do sirot e olha os bytes de um nome acentuado
grep -i "GJ4D\|Dep.sito\|Favorita" /logs/jboss/jboss-eap/standalone/sigsj-intranet/sirot.log | tail -5
# pega um trecho acentuado e vê o hex
grep -i "Dep.sito" /logs/jboss/jboss-eap/standalone/sigsj-intranet/sirot.log | tail -1 | hexdump -C | head
