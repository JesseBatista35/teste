Que bom, Rodrigo! 😊

Estamos andando bem. Do lado do ambiente não há impedimento no momento: os pontos em aberto dependem de novos pacotes do desenvolvimento.

✅ No ar e validados no ambiente de migração (JBoss 7.4 – migracaosifec):

SIFEC (fec-web 2.160.3.0)
SICCR-PJ: funcionando (perfil e lista de clientes ok)
SICDT (3.24.3.001): web e API REST validados pelo Inocêncio. O 500 da API era o truststore do servidor, já corrigido.
Consulta de contratos com 504/timeout: resolvida pelo Vinicius com ajuste de apontamento.
SIEMP, SIPEN, SIFEC-CCR, SICCR-BDCAIXA, SICCR-HUB-FRONTEND e SIFEC-MINUTAS-FRONT: implantados

✅ Esteira: primeiro deploy do SIEMP pela esteira (devops.caixa) concluído hoje sem erros.

⏳ Aguardando pacote do desenvolvimento:

SIFEC-RURAL: ambiente ajustado (truststore). Falta um build com Jackson/RESTEasy como provided, porque o pacote atual é o do 6.4. O Jefferson Vieira Alves está apoiando na análise.
SIFEC-EMP e SIEMP-EMPRESAS: aguardando build com a correção de CDI (WELD-001408).
SICCR-PJ: correção definitiva no código do BufferedResponseWrapper (hoje funciona com ajuste no servidor).

Próximos passos: quando os times tiverem os novos pacotes, ou quiserem subir os próximos módulos, podemos marcar na sala para fazer o deploy juntos e acompanhar o log na hora. É só avisar o módulo e o link do Nexus. 👍
