Estamos andando bem. Do lado do ambiente não há impedimento no momento: os pontos em aberto agora dependem de novos pacotes do desenvolvimento. Segue o resumo:

✅ No ar no ambiente de migração (JBoss 7.4 – migracaosifec):

SIFEC (fec-web 2.160.3.0)
SICCR-PJ: funcionando (perfil e lista de clientes ok)
SICDT (3.24.3.001): web ok; a API REST estava com 500 por truststore, já corrigido, aguardando a validação do Inocêncio
SIEMP, SIPEN, SIFEC-CCR, SICCR-BDCAIXA, SICCR-HUB-FRONTEND e SIFEC-MINUTAS-FRONT: implantados

✅ Esteira: primeiro deploy do SIEMP pela esteira (devops.caixa) concluído hoje sem erros.

⏳ Aguardando pacote do desenvolvimento:

SIFEC-RURAL: o ambiente já foi ajustado (truststore). Falta um build com Jackson/RESTEasy como provided, porque o pacote atual é o do 6.4 e conflita com o EAP 7.4.
SIFEC-EMP e SIEMP-EMPRESAS: aguardando build com a correção de CDI (WELD-001408).
SICCR-PJ: correção definitiva no código do BufferedResponseWrapper (hoje funciona com ajuste no servidor).

Próximos passos: assim que os times tiverem os novos pacotes, ou quiserem subir os próximos módulos, podemos marcar na sala para fazer o deploy juntos e acompanhar o log na hora. É só nos avisar qual módulo e o link do Nexus. 👍



 
