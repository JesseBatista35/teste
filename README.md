Prezados,

Durante a tentativa de deploy do sitcs_internet.ear no servidor 10.116.89.101 (target dsv05), identificamos que o Domain Administration Server (das01) do SJSAS8 estava parado, impedindo a conexão do asadmin na porta 14848 e causando a falha de deploy com o erro de target inválido.

Realizamos o start do domain das01 com sucesso via:
sudo -u sjsas8 /opt/SUNWas8/bin/asadmin start-domain --user ASadmin --passwordfile /opt/SUNWas8/config/passwordfile.conf das01

O domain está ativo e o target dsv05 confirmado como válido na configuração. Solicitamos que a equipe responsável realize novamente o deploy do sitcs_internet.ear no target dsv05, visto que o ambiente já está disponível para a operação.

Ficamos à disposição para qualquer suporte adicional relacionado à infraestrutura da esteira.

Jessé Batista / CTIS/CESTI — Esteira DevOps DES TQS NPRD
