Oi! Não precisa gerar um XML por ambiente nem informar a versão manualmente.

O standalone.xml da branch jboss-8.0 é o mesmo para todos os ambientes. Os valores específicos (banco, SSO, paths) são substituídos na release pelas variáveis do grupo de cada stage. Por isso o grupo SIHDG-JBOSS8-PRD precisa estar completo.

O artifact _SIHDG-jboss8-config é congelado no momento em que a release é criada. Ao promover para PRD a mesma release validada em HMP (ex.: SIHDG-jboss8-3.24.0.1), o PRD usa exatamente o mesmo commit do XML. Alterações novas no XML só entram em uma nova release, passando de novo por DES/TQS/HMP.

Se quiserem controle explícito, dá para criar uma tag no SIHDG-jboss8-config sobre o commit validado e apontar o artifact para ela.
