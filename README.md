1. Levantar o destino

Confirme o hostname e o IP do servidor Control-M do BR DES - Negocial, ou seja, o nome que vai substituir o crjdeaprlx038. Pegue de um agente que já esteja funcionando nesse datacenter, ou com o time do Control-M.

2. Repositório SIMIL-precificacao-rotinas-batch-config

No etc/hosts-des, troque a linha do crjdeaprlx038 pela do servidor novo (IP, FQDN e nome curto). Faça o commit na branch que a release consome.

Para não depender da esteira na hora de validar, aplique a mesma linha no /etc/hosts do caddeapllx2501. Assim a próxima release não sobrescreve com o valor antigo.

3. No caddeapllx2501 (usuário do agente)

cd ~/ctm/data
cp CONFIG.dat CONFIG.dat.bkp_$(date +%Y%m%d)
grep -E "CTMSHOST|CTMPERMHOSTS|AGTOCTMS|CTMSTOAG" CONFIG.dat

Ajuste CTMSHOST e CTMPERMHOSTS para o servidor novo. Pode editar direto ou usar o ctmagcfg. Mantenha as portas, salvo se o Negocial usar outras.

Teste a rede antes de reiniciar:

getent hosts <servidor_novo>
nc -zv <servidor_novo> <AGTOCTMS>

Reinicie e diagnostique:

shut-ag -u <usuario> -p ALL
start-ag -u <usuario> -p ALL
ag_diag_comm
ag_ping

4. Lado servidor

Verifique se o agente caddeapllx2501 está cadastrado no BR DES - Negocial e responde ao ping do servidor (CCM/Configuration, ou ctmping no servidor). Se não estiver cadastrado, o time do Control-M precisa incluir.

Se o nc ou o ag_diag_comm falharem, provavelmente é firewall entre o 2501 e o servidor Negocial. Nesse caso, você mesmo registra a regra vinculada a essa REQ.

5. Fechar

Valide com o Iury rodando um job de teste. Depois disso eu monto a nota de encerramento.

Se quiser, cole aqui a saída do grep no CONFIG.dat e do ag_diag_comm que eu confiro antes de você reiniciar.
