Na 473, deixe este log aberto antes do Jeferson clicar em Deploy:

sudo tail -f /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | grep -E "WFLYSRV0010|WFLYSRV0027|WFLYSRV0021|WFLYUT0021|ERROR|Caused by|Duplicate generator|ORA-|WELD-00|sirur|SIRUR"

O que observar:

Aparece no log	O que significa
WFLYSRV0027 ... sifec-sirur-3.55.51.01.ear	Começou a subir
WFLYUT0021 ... /sirur...	Contexto web registrado
WFLYSRV0010: "SIRUR" foi implantado	Subiu. O ajuste do Michael funcionou ✅
Duplicate generator name gen	O ajuste do persistence.xml não pegou nas duas unidades (fec.pu e fec.rur.pu)
ORA-01017	Problema de credencial do banco. Não deve aparecer, porque já corrigimos
WELD-001408 / outro Caused by	Erro novo. Me manda o trecho
WFLYSRV0021	Deploy revertido. Me manda as linhas antes dele

Lembre o Jeferson dos dois passos: primeiro o Replace no Content Repository e depois o Deploy no server-group sifec-intranet. O SIRUR não está atribuído ao grupo, então sem o segundo passo ele não sobe.

Assim que aparecer o resultado, me manda.
