O que foi realizado:

Diretório criado manualmente no servidor (caddeapllx2193.agil.nprd.caixa.gov.br), com:
Dono: jboss:jboss (em vez do padrão nobody:nobody que vem de montagem NFS genérica)
Permissão: 770
Entrada adicionada no /etc/fstab para persistir o mount no boot:
   nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIEXC/SWIFT /SWIFT nfs defaults,_netdev 0 0
Validação: mount -a executado com sucesso, montagem confirmada.

Por que isso resolve o "nobody" → "jboss":

Quando um NFS é montado sem configuração explícita de ownership, ele geralmente herda o uid/gid que vem do lado do servidor NFS (ou cai em nobody por squash/mapeamento padrão). Pra aplicação JBoss conseguir ler/escrever no diretório montado, é necessário:

Garantir que o diretório no host (ponto de montagem) já pertença a jboss:jboss antes ou depois do mount, dependendo de como o export está configurado do lado do storage (se usa squash_root, mapeamento de UID, etc.)
Aplicar chown jboss:jboss /caminho e chmod 770 /caminho no ponto de montagem
Isso garante que só o usuário/grupo jboss (dono do processo da aplicação) tenha leitura, escrita e execução — sem acesso de outros usuários (770 = rwx para dono, rwx para grupo, nada para outros)

Resumo prático pra ele replicar em outros lugares:

bash
mkdir -p /caminho/do/mount
chown jboss:jboss /caminho/do/mount
chmod 770 /caminho/do/mount
# adicionar entrada no /etc/fstab apontando pro export
mount -a

Isso é regra geral de higiene: toda vez que um novo mount NFS é criado pra ser consumido pela aplicação JBoss, o ajuste de ownership/permissão deve ser feito manualmente no host, porque a esteira automatizada (que você viu com a gente nos dias anteriores) não cuida disso — ela só trata do mount em si via variáveis, não do ownership/permissão do diretório.
