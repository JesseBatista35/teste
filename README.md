Solicitamos verificação e resolução impossibilidade de realização de deploy na instância SIGEC Portabilidade DES, Java Online.

[JENKINS] Archiving disabled
[JENKINS] Archiving disabled
[JENKINS] Archiving disabled
[JENKINS] Archiving disabled
[JENKINS] Archiving disabled
[JENKINS] Archiving disabled
[JENKINS] Archiving disabled
[JENKINS] Archiving disabled
[INFO] ------------------------------------------------------------------------
[INFO] Reactor Summary:
[INFO] 
[INFO] SIGEC-PORTABILIDADE 4.50.2-online .................. SUCCESS [  0.316 s]
[INFO] GEC XML module ..................................... SUCCESS [  6.125 s]
[INFO] GEC Azure module ................................... SUCCESS [  4.375 s]
[INFO] GEC EJB module ..................................... SUCCESS [ 20.545 s]
[INFO] GEC Web module ..................................... SUCCESS [  3.200 s]
[INFO] SIGEC PORTABILIDADE ................................ SUCCESS [  7.782 s]
[INFO] GEC EAR module 4.50.2-online ....................... SUCCESS [  4.729 s]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 50.626 s
[INFO] Finished at: 2026-09-09T17:03:56-03:00
[INFO] ------------------------------------------------------------------------
Aguardando Jenkins terminar de coletar dados
[SIGEC-PORTABILIDADE2] $ /bin/sh -xe /tmp/jenkins2870916037962917688.sh
channel stopped
+ /opt/integracao_continua/work/jenkins_script_steps/step_deploy_git.sh
Local atual: /opt/integracao_continua/jenkins_home/workspace/SIGEC-PORTABILIDADE2
********
********
Extensão do Projeto: ear
./gec-ear/target/gec.ear
file name.....xxx 
DIR ./gec-ear/target
yyyyyy ./gec-ear/target/maven-archiver/pom.properties
basename: falta operando
Try 'basename --help' for more information.
Verificando arquivo  ./gec-ear/target/maven-archiver/pom.properties
versão do arquivo  4.50.2online
Implantando sistema: ./gec-ear/target/gec.ear no servidor: 10.116.89.0:9999 com o nome: SIGEC-PORTABILIDADE2 e runtime-name:  gec-4.50.2online-b1318.ear
Warning! There were errors trying to load extensions. For more details, please, execute 'extension-commands --errors'
Publicando arquivo ./gec-ear/target/gec.ear
/opt/jboss/jboss-eap/bin/jboss-cli.sh --user=******** --password=******** --connect --controller=10.116.89.0:9999 --command=deploy --server-groups=sigec-portabilidade2 --name=SIGEC-PORTABILIDADE2 --runtime-name=gec-4.50.2online-b1318.ear ./gec-ear/target/gec.ear
Warning! There were errors trying to load extensions. For more details, please, execute 'extension-commands --errors'
{"WFLYDC0074: Operation failed or was rolled back on all servers. Server failures:" => {"server-group" => {"sigec-portabilidade2" => {"host" => {"sbrdeapllx104_credito" => {"sigec-portabilidade2_node1_lx104" => {"WFLYCTL0062: A operação de composição falhou e foi revertida. Segue abaixo as etapas que falharam:" => {"Operação step-1" => {"WFLYCTL0062: A operação de composição falhou e foi revertida. Segue abaixo as etapas que falharam:" => {"Operação step-2" => {"WFLYCTL0080: Falha de serviços" => {"jboss.deployment.subunit.\"gec-4.50.2online-b1318.ear\".\"gec-ejb.jar\".component.ProcessadorACTC802Bean.START" => "Failed to start service
    Caused by: java.lang.OutOfMemoryError: unable to create new native thread","jboss.deployment.subunit.\"gec-4.50.2online-b1318.ear\".\"gec-ejb.jar\".component.DadosCTCBean.START" => "Failed to start service
    Caused by: java.lang.OutOfMemoryError: unable to create new native thread","jboss.deployment.subunit.\"gec-4.50.2online-b1318.ear\".\"gec-ejb.jar\".component.TransferenciaEletronicaBean.START" => "Failed to start service
    Caused by: java.lang.OutOfMemoryError: unable to create new native thread","jboss.deployment.subunit.\"gec-4.50.2online-b1318.ear\".\"gec-ejb.jar\".component.ManterRegistroArquivoConsignadoBean.START" => "Failed to start service


    
