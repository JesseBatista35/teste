REGISTRO DE ATENDIMENTO — SIGEC PORTABILIDADE (DES)

Sistema afetado: SIGEC Portabilidade (server-groups sigec-portabilidade-batch, sigec-portabilidade2, sipon)
Servidor: sbrdeapllx104_credito (10.116.94.211), Domain Controller A (10.116.89.0), ambiente DES

Sintoma: deploy falhando no Jenkins com OutOfMemoryError (unable to create new native thread) em múltiplos EJBs. Host Controller do sbrdeapllx104 estava parado desde 08/09 às 12h48.

Diagnóstico: causa inicial identificada foi ulimit -u baixo (4096) do usuário jboss no host, sem override específico. Ao tentar religar o Host Controller, surgiram falhas sucessivas de boot (jars com assinatura ZIP inválida, módulo sun.jdk ausente) na leitura dos módulos do JBoss, que ficam em NFS (10.116.95.13:/export/jboss_modules64). Causa raiz real: cache/estado NFS stale no lado do cliente desse host, não corrupção real no storage.

Ações realizadas:
Corrigido o ulimit do usuário jboss (novo arquivo /etc/security/limits.d/30-jboss-nproc.conf, nproc 16384). Aplicado reset padrão do Host Controller (limpeza de data/tmp/servers). Durante a investigação das falhas de boot, foram copiados de forma aditiva (nada foi removido) o overlay layer-base-jboss-eap-7.1.6.CP e o módulo sun/jdk do backup local modules_bkp para a instalação ativa, como tentativa de contornar os jars aparentemente corrompidos. O Jorge Milis, acionado como apoio, resolveu de fato com um reboot completo da máquina — depois disso o Host Controller subiu normal e a aplicação foi confirmada no ar.

Contatos: Cledson e Cláudio indisponíveis (férias/ausência). Jorge Milis acionado como apoio por volta das 19h50, resolveu com o reboot.

Resultado: resolvido.

Observação para próximo atendimento: em falhas de boot do Host Controller com erro de leitura de módulo/ZipException, vale tentar reboot completo do host antes de investigar corrupção de arquivo — nesse caso foi cache NFS, não dado corrompido no export. As cópias feitas durante a investigação (overlay 7.1.6.CP e sun/jdk) ficaram gravadas no export NFS compartilhado; não causam problema mas não eram necessárias, vale revisão futura se alguém notar algo estranho em outro host que monta o mesmo jboss_modules64.
