A decisão está tomada e faz sentido para esta etapa: manter o modelo do 6.4, com o framework fornecido pelo ambiente. Era a opção 2, a mesma da primeira análise. A branch cetis com o pom alterado não deve ser usada: não faça merge, e se quiser pode apagá-la.

Agora o ajuste é só no siemp-java-web-config, no arquivo jboss/jboss-deployments, que serve exatamente para “deployments adicionais que não estão nas imagens das VMs”.

1. Abra o jboss/jboss-deployments no repositório e me mande o conteúdo. O formato segue a WIKI da esteira: em geral é uma lista com a URL do Nexus e o nome do arquivo de destino. Com ele, te digo a linha exata para incluir o framework com o nome framework.jar.

2. Para validar já (sem esperar a esteira), coloque o jar à mão no 2864. O jar está no /tmp do 471. Se o scp direto não passar, vá pelo bastion 100:

scp p585600@10.116.97.59:/tmp/framework-2.0.1-des.jar /tmp/
scp /tmp/framework-2.0.1-des.jar p585600@10.116.202.54:/tmp/

No 2864:

sudo cp /tmp/framework-2.0.1-des.jar /opt/jboss-eap/standalone/deployments/framework.jar
sudo chown jboss:jboss /opt/jboss-eap/standalone/deployments/framework.jar
sudo rm -f /opt/jboss-eap/standalone/deployments/siemp-ear.ear.failed
sudo touch /opt/jboss-eap/standalone/deployments/siemp-ear.ear.dodeploy
sudo tail -f /logs/jboss/jboss-eap/standalone/siemp-java-web/server.log | grep -E "WFLYSRV0010|WFLYCTL0013|ERROR|framework"

O esperado é WFLYSRV0010 ... "framework.jar" e depois WFLYSRV0010 ... "siemp-ear.ear".

Resposta para a sala:

De acordo, Sosthenes. Mantemos o modelo atual: o pom do SIEMP fica como está e o framework.jar (br.gov.caixa:framework:2.0.1) será disponibilizado pelo ambiente, como deployment adicional no siemp-java-web-config (arquivo jboss/jboss-deployments), com o nome framework.jar para resolver o deployment.framework.jar do manifest. A correção do mod_cluster no standalone-full-ha.xml já está no config e funcionou. Vou validar o framework no servidor da esteira e em seguida ajustamos o config.




/jboss/ jboss-deployments

group_id:artifact_id:version:extension


voou colcoar na mao nao se funciana ja vamos fazer aqui



