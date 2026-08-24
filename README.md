Prezados,

Por gentileza, solicitamos apoio para solucionar o problema de compilação da aplicação legado via GID. O log do erro pode ser encontrado abaixo:

Aguardando Jenkins terminar de coletar dados
[SINAD] $ /bin/sh -xe /tmp/jenkins4065851206074160558.sh
channel stopped
+ /opt/integracao_continua/work/jenkins_script_steps/step_deploy_git.sh
Local atual: /opt/integracao_continua/jenkins_home/workspace/SINAD
********
********
Extensão do Projeto: ear
./ear/target/sinad.ear
file name.....xxx 
DIR ./ear/target
yyyyyy ./ear/target/maven-archiver/pom.properties
basename: falta operando
Try 'basename --help' for more information.
Verificando arquivo  ./ear/target/maven-archiver/pom.properties
versão do arquivo  1.39.1.1
Implantando sistema: ./ear/target/sinad.ear no servidor: 10.116.89.0:9999 com o nome: SINAD e runtime-name:  sinad-1.39.1.1-b293.ear
Warning! There were errors trying to load extensions. For more details, please, execute 'extension-commands --errors'
Undeploy failed: {"host-failure-descriptions" => {"sbrdeapllx104_credito" => "WFLYDC0080: Timed out after 305000 ms awaiting host prepared response(s) -- remote host sbrdeapllx104_credito has been notified to cancel operation"}}
Publicando arquivo ./ear/target/sinad.ear
/opt/jboss/jboss-eap/bin/jboss-cli.sh --user=******** --password=******** --connect --controller=10.116.89.0:9999 --command=deploy --server-groups=sinad --name=SINAD --runtime-name=sinad-1.39.1.1-b293.ear ./ear/target/sinad.ear
Warning! There were errors trying to load extensions. For more details, please, execute 'extension-commands --errors'
'SINAD' already exists in the deployment repository (use --force to replace the existing content in the repository).
Build step 'Executar shell' marked build as failure
Finished: FAILURE

Atenciosamente,
SUDEA07
