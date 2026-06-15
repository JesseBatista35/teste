=== TESTE NFS WO0000080696536 ===
Servidor: caddeapllx1979.agil.nprd.caixa.gov.br
IP: 192.168.242.150

ssh caddeapllx1979.agil.nprd.caixa.gov.br
sudo su -
mount | grep simpg-tqs
ping -c 5 192.168.224.1
mount -a
df -h | grep simpg-tqs
ls -la /simpg-tqs/
touch /simpg-tqs/teste_$(date +%s).txt





✅ PERFEITO! Vou preparar TUDO pronto pra você!

📋 CHEAT SHEET - TESTE DO NFS
SERVIDOR E CREDENCIAIS:
Servidor: caddeapllx1979.agil.nprd.caixa.gov.br
IP: 192.168.242.150 (VLAN 3697)
NFS: nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIMPG
Ponto de Montagem: /simpg-tqs

🚀 SEQUÊNCIA DE TESTES (COPIE E COLE EXATAMENTE)
PASSO 1 - Conectar ao servidor:
bashssh caddeapllx1979.agil.nprd.caixa.gov.br

PASSO 2 - Virar ROOT:
bashsudo su -
(ou su - se pedir senha)

PASSO 3 - Verificar se JÁ está montado:
bashmount | grep simpg-tqs
Se retornar algo = JÁ ESTÁ MONTADO ✅

Se retornar vazio = NÃO ESTÁ MONTADO (Prosseguir)

PASSO 4 - Testar conectividade:
bashping -c 5 192.168.224.1
Esperado: 0% packet loss ✅

PASSO 5 - Tentar montar:
bashmount -a
Esperado: Nenhuma mensagem de erro ✅

PASSO 6 - Verificar se montou:
bashdf -h | grep simpg-tqs
Esperado: Mostrar a linha com /simpg-tqs ✅

PASSO 7 - Testar acesso de leitura:
bashls -la /simpg-tqs/
Esperado: Listar arquivos ✅

PASSO 8 - Testar acesso de escrita (OPCIONAL):
bashtouch /simpg-tqs/teste_$(date +%s).txt
ls -la /simpg-tqs/ | tail -1
Esperado: Arquivo criado ✅

✅ RESULTADO ESPERADO (TUDO OK):
[root@caddeapllx1979 ~]# mount | grep simpg-tqs
nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIMPG on /simpg-tqs type nfs4

[root@caddeapllx1979 ~]# df -h | grep simpg-tqs
nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIMPG  X.XT  X.XT  X.XT  XX% /simpg-tqs

[root@caddeapllx1979 ~]# ls -la /simpg-tqs/
total XX
drwxr-xr-x   X root root  XXXX jun 12 15:52 .
dr-xr-xr-x. 20 root root  4096 jun 12 15:52 ..
-rw-r--r--   1 root root     0 jun 12 13:45 teste_1718185500.txt

🚨 SE DER ERRO:
ErroO que fazermount.nfs: access denied by serverArmazenagem NÃO executou os comandos ainda. Pede pra eles fazerem!mount.nfs: Connection timed outProblema de conectividade. Verifica se ping está OK.Permission denied (mount -a)Você não é root. Execute sudo su -ls: cannot access /simpg-tqs/: Permission deniedIP não tem permissão. Pede pra armazenagem adicionar --add-read-write-clients
