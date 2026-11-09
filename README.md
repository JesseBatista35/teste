br.gov.caixa:framework:2.0.1:jar

Mas atenção a um detalhe que pode fazer o config não funcionar mesmo estando certo. A esteira provavelmente baixa o arquivo com o nome padrão do Maven, framework-2.0.1.jar. O JBoss usa o nome do arquivo como nome do módulo, então ele vira deployment.framework-2.0.1.jar, e o manifest do SIEMP procura deployment.framework.jar. O erro continuaria.

Por isso, depois de rodar a esteira com essa linha, confira no 2864 qual nome o arquivo recebeu:

ls -l /opt/jboss-eap/standalone/deployments/ | grep -i framework
framework.jar: a esteira renomeia, e está resolvido.
framework-2.0.1.jar: precisa de um ajuste a mais no config. Dá para resolver no jboss/jboss-custom.cli ou no jboss/configuration/custom.sh, renomeando/implantando como framework.jar. Me avise que te passo o trecho.

O artefato também precisa existir no Nexus que a esteira consulta (binario.caixa). Se a esteira falhar ao baixar br.gov.caixa:framework:2.0.1, será preciso publicá-lo lá.

Me mande o resultado do teste manual. Se o siemp-ear.ear subir com o framework.jar à mão, sabemos que o resto (datasources etc.) está ok e o único ponto do config é esse nome.
