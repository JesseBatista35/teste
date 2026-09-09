REGISTRO DE ATENDIMENTO — AMBIENTE LEGADO
Data/Hora do acionamento: 09/09/2026, ~17:10 (falha de deploy reportada no Jenkins)
Aberto por: Jessé Batista (CTIS/CESTI)

SISTEMA AFETADO: SIGEC Portabilidade (server-groups sigec-portabilidade-batch, sigec-portabilidade2, sipon)
AMBIENTE: DES
DOMAIN CONTROLLER: A - 10.116.89.0
SERVIDOR(ES)/HOST-SLAVE ENVOLVIDO(S): sbrdeapllx104_credito (IP 10.116.94.211)
INSTÂNCIA: Host Controller (jboss-eap7_hc)

SINTOMA RELATADO:
Deploy do SIGEC Portabilidade falhando no Jenkins com java.lang.OutOfMemoryError:
unable to create new native thread em múltiplos EJBs do gec-ejb.jar. Host Controller
do sbrdeapllx104_credito estava parado desde 08/09 12:48.

DIAGNÓSTICO:
[x] Instância parada/travada
[ ] Metaspace/memória
[ ] Garbage Collector
[ ] Certificado
[ ] Falha de deploy — conteúdo travado no repositório
[ ] InterruptedException / estado inconsistente
[ ] Falha de autenticação no DC
[ ] Ownership/permissão de diretório
[ ] Falha de banco de dados
[x] Outro: ulimit -u baixo (4096) do usuário jboss no host + leituras de módulos JBoss
via NFS (/opt/jboss/jboss-eap/modules, export 10.116.95.13:/export/jboss_modules64)
retornando dados aparentemente corrompidos (jars com assinatura ZIP inválida, módulo
sun.jdk ausente) durante o boot do Host Controller — causa raiz final: cache/estado
NFS do lado do cliente nesse host. Resolvido definitivamente com reboot completo da
máquina pelo Jorge Milis.

AÇÕES REALIZADAS:
1. Corrigido ulimit -u do usuário jboss (era 4096, sem override específico; criado
   /etc/security/limits.d/30-jboss-nproc.conf com nproc 16384)
2. Aplicado reset padrão do Host Controller (limpeza de data/tmp/servers)
3. Durante investigação de falhas de boot subsequentes, copiados de forma aditiva
   (sem remoção de nada) o overlay layer-base-jboss-eap-7.1.6.CP e o módulo sun/jdk
   a partir de /opt/jboss/jboss-eap/modules_bkp para a instalação ativa, como
   tentativa de contornar jars aparentemente corrompidos lidos via NFS
4. Jorge Milis (chamado como apoio) executou reboot completo do host sbrdeapllx104
5. Após o reboot, Host Controller subiu normalmente e aplicação confirmada no ar

CONTATOS ACIONADOS:
[ ] Cledson avisado — indisponível (férias)
[ ] Cláudio avisado — não acionado
[x] Jorge Milis acionado como apoio — Hora: ~19:50, resolveu com reboot da máquina

RESULTADO:
[x] Resolvido

OBSERVAÇÕES / RECOMENDAÇÃO PARA PRÓXIMO ATENDIMENTO:
A causa raiz mais provável foi cache/handle NFS stale no cliente (sbrdeapllx104) para
o mount /opt/jboss/jboss-eap/modules, causando leitura de jars com assinatura inválida
e módulo sun.jdk "ausente" mesmo estando íntegros no export. O reboot completo da
máquina resolveu sem necessidade de nenhuma das correções manuais aplicadas durante
a investigação (overlay 7.1.6.CP e módulo sun/jdk copiados para dentro do export
NFS jboss_modules64 — cópias aditivas, não removem nada, mas ficam registradas no
compartilhamento e podem valer revisão futura já que não eram estritamente necessárias).
Recomenda-se, em falhas futuras de boot de Host Controller com erros de leitura de
módulo/ZipException, tentar reboot completo do host antes de investigar
corrupção de arquivo, dado que pode ser sintoma de cache NFS e não dado real
corrompido no storage.

Responsável: Jessé Batista, CTIS/CESTI — Esteira DevOps DES TQS NPRD
