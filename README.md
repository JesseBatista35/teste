Handoff – Agente Control-M caddeapllx2695 (10.116.201.173)

Problema: o agente parou de se comunicar com o servidor Control-M depois de um deploy via esteira (Ansible, usuário sansbp01) em 26/set, 11:26.

O que o deploy fez (confirmado no journalctl):

Deploy do batch siifx-caixinhas-batch e cópia de env_config.sh, executa-job.sh e custom.sh para /producao.
blockinfile no /etc/hosts com o 038/039 comentados.
Sobrescreveu o /opt/ctmage/ctm/data/CONFIG.dat com a configuração do servidor antigo (crjdeaprlx038, portas 7015/7016).
Reiniciou o controlm_agent.service.

O que já foi feito:

Descomentado 038/039 no /etc/hosts. Tem backup em /etc/hosts.bkp.*, e na prática isso não era necessário.
CTMSHOST trocado para sspdeaprlx0028 (10.116.84.154, já está no /etc/hosts).
Agente reiniciado. O ping do sistema funciona, mas o "Agent ping to Control-M/Server" ainda falha, porque as portas estão erradas.

Referência que funciona (caddeapllx2463):

Server e Authorized: sspdeaprlx0028
Agent-to-Server 18007 / Server-to-Agent 18008
Logical Agent Name com nome curto (caddeapllx2463)

Próximos passos (o Robson está configurando):

Como ctmagelx, testar a porta: timeout 3 bash -c "</dev/tcp/10.116.84.154/18007" && echo OK
ctmagcfg:
opção 2 (TCP): portas 18007/18008
opção 4: Authorized = sspdeaprlx0028
opção 7: Logical Agent Name = caddeapllx2695, se estiver cadastrado assim no servidor
s para salvar
Como root, reiniciar pelos scripts (atenção: se só rodar shut-ag, o systemd não sobe mais, porque o status fica STOPPED):
/opt/ctmage/ctm/scripts/shut-ag -u ctmagelx -p ALL e depois /opt/ctmage/ctm/scripts/start-ag -u ctmagelx -p ALL
Validar: ss -lntp | grep 18008 e su - ctmagelx -c "ag_diag_comm". O esperado é os dois pings com Succeeded. Não dê Ctrl+C no diag, ele leva até 2 minutos.
No servidor, deixar o agente como Available e rodar um job de teste.

Pendência crítica: corrigir o playbook da esteira para gravar o CONFIG.dat com sspdeaprlx0028 e as portas 18007/18008. Se isso não for feito, o próximo deploy derruba o agente de novo.
