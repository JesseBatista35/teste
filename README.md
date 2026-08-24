Diagnóstico:
Verificado que apenas a instância CSD1 do JBoss estava ativa no ambiente DES do SIAOI. As instâncias CSD2 e CSD6 estavam paradas.

Causa raiz:
Os scripts de inicialização de CSD2 e CSD6 (/etc/rc.d/init.d/jboss-eap6-CSD2.sh e jboss-eap6-CSD6.sh) estavam quebrados por múltiplos motivos:

O arquivo /etc/jboss-as/jboss-as.conf define JBOSS_HOME=/home/siaoi/jboss-eap-6.4, caminho de uma instalação JBoss diferente da usada por CSD2/CSD6, que na verdade residem em /home/jboss-eap-6.4
O arquivo standaloneCSD2.sh dentro de bin/ (referenciado pelo script de init) é, na verdade, uma cópia do próprio script de controle, não o launcher real do JBoss, e estava sem permissão de execução
O unit systemd gerado automaticamente (SysV shim) está com Loaded: bad e falha ao tentar redirecionar a chamada, retornando "Unit not found"

Ação realizada:
Os processos JBoss de CSD2 e CSD6 foram iniciados manualmente via standalone.sh, replicando os parâmetros usados pelo CSD1 (node name, base-dir e binding 0.0.0.0), com os port-offsets corretos identificados em cada standaloneCSDx.xml (CSD2=250, CSD6=550). Ambas as instâncias subiram corretamente, com o siaoi.ear deployado com sucesso.

Validação:
Os três links de login (CSD1, CSD2, CSD6) retornaram HTTP 200 OK.

Pendência para equipe de infraestrutura:
Os scripts de init de CSD2 e CSD6 precisam de correção definitiva (ajuste do JBOSS_HOME, permissão de execução do launcher, e regeneração/correção da unit systemd), para que voltem a subir automaticamente em caso de reboot do servidor ou de nova parada. Enquanto isso não for corrigido, os processos atuais dependem do start manual realizado nesta sessão.
