Boa tarde, pessoal! Segue atualização do SIGSJ no ambiente de TQS:

✅ SIGSJ-boleto – implantado e validado em TQS (contexto /boletoService no ar)
✅ SIGSJ-internet – implantado em TQS (contexto /sigsj_internet no ar)
✅ SIGSJ-intranet – implantado em TQS (contexto /sigsj_intranet respondendo), mas com o datasource pendente (detalhe abaixo)

Ajustes para a fábrica:

1. SIGSJ-intranet-config – datasource SIGSJ04
No standalone-full-ha.xml da branch usada na release, o datasource SIGSJ04 está:
• com <driver>oracle</driver> apontando para o módulo com.oracle, que não existe no JBoss da esteira. Por isso o datasource não sobe ("faltam [jboss.jdbc-driver.oracle]").
• com a connection-url e as credenciais fixas no arquivo, apontando para a base de DES. Assim, o TQS conectaria na base de DES.
Sugestão: deixar o bloco igual ao do SIGSJ-internet, com <driver>ojdbc8.jar</driver> e os tokens __SIGSJ04_CONNECTION_STRING__, __SIGSJ04_USER__ e __SIGSJ04_PASSWORD__, remover o <driver name="oracle" module="com.oracle">, e subir via PR para a master. Podem também confirmar se a release de DES está usando essa mesma branch?

2. Variáveis do SIGSJ04 em TQS – @Vitor, conforme combinado, na segunda você cadastra no grupo SIGSJ-INTRANET-TQS as variáveis SIGSJ04_CONNECTION_STRING, SIGSJ04_USER e SIGSJ04_PASSWORD (marcada como secreta) com os dados da base de TQS passados pela @Gisele. Com o ajuste do item 1 feito, rodamos a release novamente.

3. Log4j externo (boleto, intranet e internet) – as aplicações procuram o arquivo de configuração em /log_jboss/config-log4j/, que não existe nas VMs novas. Não impede o funcionamento, mas os logs da aplicação não são gerados. Sugestão: incluir o arquivo nos repositórios de config via custom.sh.

4. SIGSJ-internet – SIROT – quando o SIROT for embutido no build (como já feito no boleto e no intranet), nos avisem para removermos o jar externo e o alias JNDI.

5. _ENV.URL_STATICS – hoje está com o valor www.teste.com no intranet. Podem confirmar o valor correto?

Próximo passo da esteira – URLs:
Vamos seguir com a solicitação das URLs customizadas (certificado, VIP, balanceamento para as VMs e DNS), no mesmo fluxo orientado pelo @Evandro, para DES e TQS do intranet e do internet. Para o boleto, @Vitor, pode confirmar se ele precisa de URL ou se é chamado apenas internamente?

Qualquer dúvida, fico à disposição!
