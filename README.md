Deploy do SIGEC Portabilidade falhando por OutOfMemoryError: unable to create new native thread no host sbrdeapllx104_credito.

Diagnóstico:

Causa do OOM: ulimit -u do usuário jboss em 4096 → corrigido pra 16384.
Ao religar, achamos o jar jboss-logmanager-1.5.4 corrompido na instalação base (mesma corrupção replicada no /upload compartilhado e em outro host — problema antigo, nunca detectado).
Causa raiz: o patch jboss-eap-7.1.6.CP nunca foi registrado de verdade nos overlays do JBoss (só tinha um patch vestígio de EAP 6.4.7). Aplicamos o overlay correto (cópia íntegra achada no próprio host, em modules_bkp).
Depois disso, apareceu novo erro: ModuleNotFoundException: sun.jdk — ainda investigando se é pré-existente ou overlay incompleto.

Dúvida: alguém sabe confirmar se esse host realmente deveria estar rodando no patch jboss-eap-7.1.6.CP? Achei estranho — a instalação só tinha overlays de EAP 6.4.x registrados (6.4.2 até 6.4.24), mais um resquício vestigial de 6.4.7, nada de 7.1.6 antes da gente aplicar agora. Parece que essa pasta pode ter sido montada em cima de um histórico de versões antigas, não uma instalação 7.1.6 limpa. Alguém tem a versão/patch de referência esperada pra esse host, pra eu confirmar se estamos no caminho certo?
