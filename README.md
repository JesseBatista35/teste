
[root@caddeapllx955 p585600]#
[root@caddeapllx955 p585600]#
[root@caddeapllx955 p585600]#
[root@caddeapllx955 p585600]# grep -i "GJ4D\|Dep.sito\|Favorita" /logs/jboss/jboss-eap/standalone/sigsj-intranet/sirot.log | tail -5
grep: /logs/jboss/jboss-eap/standalone/sigsj-intranet/sirot.log: arquivo binário coincide com o padrão
2026-11-27 10:05:08,619 INFO  [br.gov.caixa.sirot.ejb.SIROTConImpl] (default task-5) [ID=1795784708618 20952] Mensagem enviada ao mainframe (sem signature): 0205A20000008000000200000000100000000411521027100508049777042GJ4DC897834 000052320001540106010305060809040104
2026-11-27 10:05:30,576 INFO  [br.gov.caixa.sirot.ejb.SIROTConImpl] (default task-1) [ID=1795784730575 40336] Mensagem enviada ao mainframe (sem signature): 0205A20000008000000200000000100000000411521027100530049777042GJ4DC897834 000052320001540106010305060809040104
2026-11-27 10:11:10,108 INFO  [br.gov.caixa.sirot.ejb.SIROTConImpl] (default task-6) [ID=1795785070106 46682] Mensagem enviada ao mainframe (sem signature): 0205A20000008000000200000000100000000411521027101110049777042GJ4DC897834 000052320001540106010305060809040104
[root@caddeapllx955 p585600]#
[root@caddeapllx955 p585600]#
[root@caddeapllx955 p585600]# grep -i "Dep.sito" /logs/jboss/jboss-eap/standalone/sigsj-intranet/sirot.log | tail -1 | hexdump -C | head
grep: /logs/jboss/jboss-eap/standalone/sigsj-intranet/sirot.log: arquivo binário coincide com o padrão
[root@caddeapllx955 p585600]#
[root@caddeapllx955 p585600]#
[root@caddeapllx955 p585600]#
