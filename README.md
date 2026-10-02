Analisada a demanda. A library SICCV-batch-tqs aponta para o export NFS /ifs/CADSVISISD4/SERVIDORES/CEPTISP/SICCV, que pertence ao ambiente de DES. Verificado no storage que não existe export NFS de TQS para o SICCV. Verificado também que o servidor de TQS (caddeapllx2821 – 10.116.202.23) não possui interface na rede de backup/storage, por onde é feito o acesso ao NFS.

A criação de novo compartilhamento NFS é atribuição da equipe de Armazenamento e não é atendida por esta fila. Deve ser solicitada pelo próprio demandante via InfraFácil, em Serviços ➝ Armazenamento ➝ Armazenamento NAS, opção "Nova solicitação de armazenamento (Sistema)", módulo SICCV, ambiente TQS. Orientações de preenchimento na Wiki: [LINK DA WIKI]

Atenção: não utilizar a opção "Inclusão de IP" no compartilhamento existente, pois isso daria ao TQS acesso ao NFS de DES.

Após o atendimento da requisição de Armazenamento, favor abrir nova demanda para a equipe de Esteiras DES/TQS informando o path do novo export, para atualização da variável NFS_ENDPOINT_ISILON na library SICCV-batch-tqs e montagem no servidor.
