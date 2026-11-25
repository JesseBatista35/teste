Jesse Mouta Pereira Batista
Todos, bom dia! Atualização do SIGSJ (configuração dos properties pela esteira):   Conforme orientação do Rafael Augusto: seguimos  o padrão Replace Tokens + Library ou seja apartir de agora os arqui…
Oi Jesse Mouta Pereira Batista , bom dia. É a mesma versão.
 
Jesse Mouta Pereira Batista
Todos, bom dia! Atualização do SIGSJ (configuração dos properties pela esteira):   Conforme orientação do Rafael Augusto: seguimos  o padrão Replace Tokens + Library ou seja apartir de agora os arqui…
Jesse Mouta Pereira Batista, bom dia, tudo bem estou verificando as informações do ambiente TQS para a atualização das libraries.
 
Com relação ao ambiente HMP e PRD, foram abertas as REQs abaixo para obter as informações:
 
HMP - REQ000147178082
PRD - REQ000147178124
 
Estou acompanhando o atendimento destas REQs a assim que forem finalizadas eu informo aqui os dados.
 
Obrigado !!
 
Gisele Cristina Dias
Oi Jesse Mouta Pereira Batista , bom dia. É a mesma versão.
falo aqui do arquivo sigsj.release que é a mesma versão em cada ambiente.
 
Vitor Mendes Guedes
Jesse Mouta Pereira Batista, bom dia, tudo bem estou verificando as informações do ambiente TQS para a atualização das libraries.   Com relação ao ambiente HMP e PRD, foram abertas as REQs abaixo pa…
Marcela Gomes da Silva pc.
 
Jesse Mouta Pereira Batista, olá, boa tarde !! Segue abaixo os arquivos dos Properties do SIGSJ em HMP (atendimento da REQ000147178082). Em HMP não existe o arquivo b2b.properties porque o SIB2B não executa em HMP.
release.properties
config.properties
 
*retificando...segue novamente o arquivo de config.properties de hmp ( tive que renomea-lo para config_hmp.properties porque o teams associou com o arquivo de config.properties de des, mais em HMP o nome é config.properties, mesmo nome em todos o ambientes)
config_hmp.properties


release.properties

 sigsj.release = 1.13.0



sigsj.release = 1.13.0
#sigsj.convivencia.url = http://sigsj-convivencia-des-esteiras.nprd2.caixa/convivencia/v1
sigsj.convivencia.url = https://sigsj-convivencia-des.apps.nprd.caixa/convivencia/v1
sigsj.ambiente = DES
simtr.url = http://simtr-api-intranet-des.apps.nprd.caixa/

config_hmp.properties


sigsj.release = 1.13.0

sigsj.convivencia.url = https://sigsj-convivencia-hmp.apps.nprd.caixa/convivencia/v1
simtr.url = https://simtr-api-intranet-hmp.apps.nprd.caixa/

