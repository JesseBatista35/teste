1. Veja os valores sem os secrets (no 6.4; pode me mandar essa saída):

grep -viE 'SECRET|API_KEY|PASSWORD|SENHA' /tmp/props_pj.cli

Me mande e eu te digo se alguma precisa de ajuste antes de aplicar. Se preferir não esperar, pode aplicar já. Os passos são os mesmos de antes:

2. Aplicar: cat /tmp/props_pj.cli, copie as 21 linhas e cole no jboss-cli do 471. Todas devem voltar "outcome" => "success".

3. Apagar o arquivo no 6.4:

rm -f /tmp/props_pj.cli

4. Reiniciar e testar (CLI do 471):

/server-group=sifec-intranet:restart-servers(blocking=true)
/host=hc_cbrdeapllx473/server=sifec-intranet_node1_lx473:read-attribute(name=server-state)

Com o estado running: logout, login, abrir o PJ e consultar o CNPJ, olhando no F12 o perfil-acesso-usuario e o cliente/cnpj.

Se alguma property ficar com valor errado (por exemplo, o IP do 6.4), dá para corrigir depois com :write-attribute(name=value,value=...) e outro restart. Esse é o motivo de olhar antes.
