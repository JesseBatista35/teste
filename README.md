-sh-4.2$ cd /tmp/checkver_$$
-sh-4.2$ pws
-sh: pws: comando não encontrado
-sh-4.2$ pwd
/tmp/checkver_6365
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ ls -la
total 4
drwxr-xr-x   2 p585600 usucef    6 Jul  2 19:37 .
drwxrwxrwt. 15 root    root   4096 Jul  2 19:37 ..
-sh-4.2$
-sh-4.2$
-sh-4.2$ pastedThe user prompt is empty, so I cannot determine the primary language. However, based on the thinking block being in English, here is my summary:

Verified deployment version and strategized redeployment approachThe user prompt is empty, so I cannot determine the primary language. However, based on the thinking block being in English, here is my summary:

Verified deployment version and strategized redeployment approachJá temos a resposta, nem precisa ir mais fundo no manifest — os próprios nomes dos arquivos dentro do .ear já entregam a versão:
sisme-web-2.93.3.0.war
sisme-api-2.93.3.0.jar
sisme-ejb-2.93.3.0.jar
Confirmado: a versão rodando agora no DES é 2.93.3.0 — que bate exatamente com o deploy que você acabou de fazer (SISME-364, 19:26). Isso reforça a teoria: não tem nenhum problema de DNS/VIP/Nginx nem de entrega de arquivo. O JBoss está deployando corretamente o que chega — o que varia é qual release foi disparada por último.
Se quiser fechar o teste com prova cabal pro Max, o próximo passo é: redeploya a SISME-363 (2.93.2.0) por cima dessa, roda o mesmo unzip e confirma que os nomes voltam pra -2.93.2.0. Se isso acontecer, está 100% provado que é comportamento normal de deploy sobrescrevendo, não bug.
Antes de fazer isso, só um lembrete rápido: como você mencionou que o Max está usando o ambiente pra sprint corrente, vale um aviso rápido antes de sobrescrever de novo, pra não gerar confusão com o time dele achando que caiu de novo.
Quer que eu prepare a limpeza dos arquivos temporários (/tmp/checkver_*) e o texto de retorno explicando o achado pra Box Plataforma de Moradia?beleza to rodan oa 2.0 prepara pra mim os comando pra verifcar novamentePreparou comandos para verificação de versão novamentePreparou comandos para verificação de versão novamenteBeleza, roda esses comandos direto (não precisa recriar a pasta, só limpar e refazer):
bashcd /tmp/checkver_$$
rm -rf ear_extracted
unzip -o /opt/jboss-eap/standalone/deployments/sisme-ear.ear -d ear_extracted | grep -E "\.war|\.jar" | grep -iE "sisme-web|sisme-api|sisme-ejb"
Isso já filtra e mostra só os arquivos que interessam (nomes com a versão embutida), sem precisar extrair o WAR de novo.
Se quiser conferir também a data de modificação do .ear na pasta de deployments, pra bater com o horário do redeploy:
bashls -la /opt/jboss-eap/standalone/deployments/sisme-ear.ear*
Roda os dois e me manda o resultado.-sh-4.2$ cd /tmp/checkver_$$ -sh-4.2$ rm -rf ear_extracted -sh-4.2$ -sh-4.2$ -sh-4.2$ unzip -o /opt/jboss-eap/standalone/deployments/sisme-ear.ear -d ear_extracted | grep -E ".war|.jar" | grep -iE "sisme-web|sisme-api|sisme-ejb" inflating: ear_extracted/sisme-web-2.93.2.0.war inflating: ear_extracted/lib/sisme-api-2.93.2.0.jar inflating: ear_extracted/sisme-ejb-2.93.2.0.jar -sh-4.2$ -sh-4.2$ -sh-4.2$ -sh-4.2$ ls -la /opt/jboss-eap/standalone/deployments/sisme-ear.ear* -rwxrw-rw- 1 jboss jboss 83159033 Jul 2 19:46 /opt/jboss-eap/standalone/deployments/sisme-ear.ear -rw-r--r-- 1 jboss jboss 13 Jul 2 19:46 /opt/jboss-eap/standalone/deployments/sisme-ear.ear.deployed -sh-4.2$Confirmado 100%. Prova cabal:

Redeploy da SISME-363 às 19:46 → .ear sobrescrito → conteúdo agora é sisme-web-2.93.2.0.war, sisme-api-2.93.2.0.jar, sisme-ejb-2.93.2.0.jar

Ou seja, reproduzido do zero: sempre que uma release mais antiga (2.93.2.0) é deployada por cima, o JBoss assume exatamente essa versão — sem qualquer participação de DNS, VIP, Nginx ou rede. É comportamento esperado de deploy sequencial num único node.
Causa raiz: não é falha técnica de ambiente, é ordem de execução das releases. A SISME-363 (2.93.2.0, branch antiga) foi disparada depois da SISME-362 (2.93.3.0), sobrescrevendo o artefato correto.
Quer que eu monte agora a mensagem de retorno pra Box Plataforma de Moradia e pro Max, já com essa evidência técnica (nomes dos artefatos + timestamps), deixando claro que:

o ambiente/infra não teve problema;
a causa foi releases disparadas fora de ordem/branch errada;
a recomendação é sempre confirmar qual release está "ativa" antes de testar, e não redeployar branches antigas por cima de builds mais novos sem necessidade.
sim me manda a menssagem para fechar a w.oViewed memory editsViewed memory editsPrezados,
Realizamos a análise técnica do ambiente sisme-vm (DES) referente à divergência de versão relatada.
Verificação realizada diretamente no servidor JBoss (/opt/jboss-eap/standalone/deployments/), inspecionando o conteúdo do artefato sisme-ear.ear efetivamente deployado.
Constatou-se que o ambiente processa corretamente cada deploy recebido, sem qualquer falha de infraestrutura, DNS, VIP ou proxy Nginx.
A divergência de versão ocorreu porque a release SISME-363 (branch branch-from-2.93.2.0, versão 2.93.2.0-SNAPSHOT) foi executada após a release SISME-362 (versão 2.93.3.0), sobrescrevendo no ambiente DES o artefato mais recente pelo artefato de uma branch anterior.
Para confirmação, foi realizado teste controlado: após deploy da versão 2.93.3.0, o artefato no servidor apresentou os módulos sisme-web-2.93.3.0.war, sisme-api-2.93.3.0.jar e sisme-ejb-2.93.3.0.jar. Em seguida, redeploy da release SISME-363 (2.93.2.0) foi executado, e o artefato no servidor passou a apresentar sisme-web-2.93.2.0.war, sisme-api-2.93.2.0.jar e sisme-ejb-2.93.2.0.jar, replicando exatamente o comportamento relatado.
Conclusão: não há problema de ambiente, rede ou infraestrutura. A causa foi a execução de releases em ordem não esperada, com uma branch anterior sendo deployada por cima de uma versão mais recente.
Recomendação: antes de validar uma entrega em DES, confirmar qual release está ativa no momento (aba Releases do pipeline SISME no Azure DevOps) e evitar redeploy de branches antigas sobre versões já validadas, para não gerar inconsistência de versão durante a sprint.
Encaminhamos como concluída, sem ação pendente por parte da equipe de esteiras DevOps.
Atenciosamente,
Equipe DEVOPS DES TQS NPRD
