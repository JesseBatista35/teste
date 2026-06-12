✅ VAMOS VERIFICAR NO SERVIDOR caddeapllx1979:
1️⃣ Conecte no servidor:
bashssh caddeapllx1979.agil.nprd.caixa.gov.br

2️⃣ PRIMEIRO - Verifique se o NFS está montado:
bashmount | grep simpg-tqs
ou
bashdf -h | grep simpg-tqs
Se aparecer algo como:
nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIMPG on /simpg-tqs type nfs4
✅ Está montado!

3️⃣ SEGUNDO - Teste a conectividade:
bashls -la /simpg-tqs/
Se listar arquivos = ✅ Funcionando!

4️⃣ TERCEIRO - Se NÃO estiver montado, tente montar:
bashmount -a
Depois verifique se montou com:
bashmount | grep simpg-tqs

📤 Manda aqui os resultados desses comandos que eu te falo se está OK ou se falta ajuste!
Qual resultado você está vendo?
