Correção no jboss/jboss-deployments: o arquivo deve ficar exatamente assim, com as duas linhas:

group_id:artifact_id:version:extension
br.gov.caixa:framework:2.0.1:jar

Faça o commit e crie uma nova release. Ela precisa ser nova para pegar o commit atualizado.

Na próxima release, confira no log da task “Deploy Config no JBOSS”, logo depois de “Lendo artefatos do arquivo CSV”:

Aparecer “Copiando artefatos para o(s) servidor(es) Jboss” com changed e o framework: baixou e copiou.
Erro de download (404): o br.gov.caixa:framework:2.0.1 não está no Nexus da esteira.

Depois, no 2864:

ls -l /opt/jboss-eap/standalone/deployments/ | grep -i framework
framework.jar: resolvido, e o siemp-ear.ear deve subir.
