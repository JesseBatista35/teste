📌 Status – Migração JBoss 7.4 (SIFEC, SICCR, SIEMP, SIPEN) – 09/11

Boa tarde, pessoal! Para todos acompanharem pelo mesmo canal, segue a posição atual.

✅ Concluído (ambiente de migração – migracaosifec, DES)

SIFEC (2.160.3.0): no ar
SICCR-PJ: no ar e funcionando (perfil e lista de clientes ok)
SICDT (3.24.3.001): web e API REST validados pelo Inocêncio
SIEMP, SIPEN, SIFEC-CCR, SICCR-BDCAIXA, SICCR-HUB-FRONTEND e SIFEC-MINUTAS-FRONT: implantados
Ajustes de ambiente realizados: truststore com a cadeia da Caixa, SSO, properties do SICCR/SICDT, datasource do SICDT e ajuste no Undertow para o PJ

✅ Esteira (devops.caixa)

SIEMP: primeiro deploy concluído hoje sem erros

⏳ Pendências que dependem de novo pacote do desenvolvimento

Módulo	O que falta	Responsável
SIFEC-RURAL	Build com Jackson/RESTEasy como provided (pacote atual é do 6.4)	Dev do RURAL
SIFEC-EMP	Build com correção de CDI (WELD-001408)	Dev do EMP
SIEMP-EMPRESAS	Build com correção de CDI (WELD-001408)	Dev do SIEMP
SICCR-PJ	Correção definitiva no BufferedResponseWrapper (hoje funciona com ajuste no servidor)	Pablo

Do lado do ambiente não há impedimento. Assim que os pacotes forem gerados, é só enviar o link do Nexus aqui no grupo que fazemos o deploy e acompanhamos o log na hora.

Para avançarmos:

@Paulo, consegue indicar os desenvolvedores responsáveis pelo RURAL, EMP e EMPRESAS? Assim direcionamos os ajustes diretamente a eles.
Se houver outros módulos já prontos para subir, podem nos informar a ordem de prioridade.

Seguimos à disposição! 👍
