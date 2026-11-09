1. No 2864, procure o jar no servidor todo:

sudo find /opt/jboss-eap /tmp /home -iname "*framework*.jar" 2>/dev/null
Achou (em outro diretório ou com outro nome): a esteira baixou, mas não colocou em deployments/ com o nome certo.
Não achou nada: a esteira nem baixou.

2. No log da release (Azure DevOps), abra a task do JBoss e procure o trecho “Copiando deployments adicionais”. Me mande o que aparece logo abaixo. Na execução de sexta ela aparecia vazia (só o título do PLAY), sinal de que não havia nada para processar. O log vai dizer se:

leu o jboss-deployments e tentou baixar br.gov.caixa:framework:2.0.1 (e se deu 404 no Nexus);
ou pulou a etapa (skipping).

3. Confira o commit no repo:

O arquivo está exatamente em jboss/jboss-deployments, sem espaço no nome e sem extensão (.txt).
O commit foi feito na branch que a release usa (provavelmente master), e a release foi disparada depois do commit.

Com o trecho do log (passo 2) dá para saber qual dos casos é. Enquanto isso, se quiser deixar o SIEMP no ar para os testes, o caminho manual continua valendo: levar o framework-2.0.1-des.jar do 471 ao 2864 (pelo bastion) e copiar como framework.jar em deployments/.
