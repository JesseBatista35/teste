tem que reiniciar a VM. Com SWAP cheio como estava não tem jeito. Antes de reiniciar, executa a limpeza do data e tmp no HC. O undeploy no Jenkins não estava sendo feito pq ele ao realizar o deploy, tenta retirar do server-group um sigfi-fgc.ear, mas o que estava publicado era um sigfi_fgc.ear, como está agora por exemplo.
 
Tivemos que deixar pq o workspace deles no RTC está apontando para uma job no Jenkins de nome SIGFI_FGC. Então, configuramos a job para além do nome, fizesse um deploy no EAP com SIGFI_FGC. Mas isso só foi possível com o undeploy manual do que tinha antes.
 
E tem que atentar pra quando subir a VM, depois de recuperar o SWAP da maquina, tem que setar novamente o mount do NFS para o /upload/des do jeito que está la hj, pq senão o EAP não vai localizar o chaveiro da equipe que está nesse NFS abaixo.
 
 
mount -t nfs 10.116.95.13:/export/jboss_modules64 /opt/jboss/jboss-eap/modules



 
