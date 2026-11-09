1. Ver o que o pod está usando de fato

bash
oc exec sismn-gecci-tqs-28-glhxs -c sismn-gecci-tqs -n sismn-tqs -- env | grep -iE 'datasource|jdbc'

2. Se aparecer algo, descobrir de onde vem

bash
oc get dc sismn-gecci-tqs -n sismn-tqs -o yaml | grep -iE -A4 'envFrom|secretRef|configMapRef'

Depois liste as secrets e configmaps do namespace:

bash
oc get secret,cm -n sismn-tqs | grep -i gecci

3. Se o env do pod também vier vazio

A URL está fixa no application.properties dentro da imagem. Nesse caso:

bash
oc exec sismn-gecci-tqs-28-glhxs -c sismn-gecci-tqs -n sismn-tqs -- sh -c 'grep -ri "datasource" /deployments/config/ /deployments/*.properties 2>/dev/null'

Se não encontrar, a configuração está empacotada no jar e precisa ser lida no repositório do dev (src/main/resources/application.properties, perfil %tqs se houver).

Me mande o resultado do passo 1. Ele mostra qual host, usuário e ServiceName de TQS o pod está tentando usar e que está gerando o JZ00L.
