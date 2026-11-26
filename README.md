Jesse Mouta Pereira Batista, bom dia, tudo bem !! Segue os arquivos de Properties do ambiente TQS para a configuração das variáveis na library da esteira:
 
( os arquivos estão com o nome "_tqs" para evitar que o teams considere estes arquivos como já disponibilizados, o nome correto deles no servidor é b2b.properties, config.properties e release.properties).

b2b_tqs.properties


# Parametros especificos para o consumo do B2B no canal Intranet #
intranet.url.upload = https://b2bapl.des.corerj.caixa/GSJ_ENT_UPLOAD
intranet.url.lista = https://b2bapl.des.corerj.caixa/GSJ_ENT_LISTA
intranet.url.deletar = https://b2bapl.des.corerj.caixa/GSJ_ENT_DELETE
intranet.url.processar = https://b2bapl.des.corerj.caixa/GSJ_ENT_PROCESSA
#intranet.url.upload = https://10.116.80.27/GSJ_ENT_UPLOAD
#intranet.url.lista = https://10.116.80.27/GSJ_ENT_LISTA
#intranet.url.deletar = https://10.116.80.27/GSJ_ENT_DELETE
#intranet.url.processar = https://10.116.80.27/GSJ_ENT_PROCESSA

#Parametros de conexão com p B2B para a funcionalidade Carregamento Lote
intranet.clote.url.upload = https://b2bapl.des.corerj.caixa/GSJ_LOTE_UPLOAD
#intranet.clote.url.lista = https://b2bapl.des.corerj.caixa/GSJ_ENT_LISTA
#intranet.clote.url.upload = https://10.116.80.27/GSJ_LOTE_UPLOAD
intranet.clote.url.lista = https://b2bapl.des.corerj.caixa/GSJ_LOTE_LISTA
#intranet.clote.url.deletar =
intranet.clote.url.download = https://b2bapl.des.corerj.caixa/GSJ_LOTE_DOWNLOAD

#Parametros de conexão com p B2B para a funcionalidade Carregamento Lote, para o canal Internet
internet.clote.url.upload = https://b2bapl.des.corerj.caixa/GSJ_LOTE_UPLOAD
internet.clote.url.lista = https://b2bapl.des.corerj.caixa/GSJ_LOTE_LISTA
#intranet.clote.url.upload = https://10.116.80.27/GSJ_LOTE_UPLOAD
#intranet.clote.url.lista = https://10.116.80.27/GSJ_ENT_LISTA
#intranet.clote.url.deletar =
internet.clote.url.download = https://b2bapl.des.corerj.caixa/GSJ_LOTE_DOWNLOAD

# Parametros especificos para o consumo do B2B no canal Internet Carregamento Dj Lote #
internet.lote.url.upload =
#internet.lote.url.lista = https://b2bapl.des.corerj.caixa/GSJ_ENT_LISTA
internet.lote.url.lista = https://10.116.80.27/GSJ_ENT_LISTA
internet.lote.url.deletar =
internet.lote.url.processar =
internet.lote.url.download =

timeout.b2b = 30


config_tqs.properties

sigsj.release = 1.13.0
sigsj.convivencia.url = https://sigsj-convivencia-tqs.apps.nprd.caixa/convivencia/v1
#sigsj.convivencia.url = https://sigsj-convivencia-des.apps.nprd.caixa/convivencia/v1
sigsj.ambiente = TQS
simtr.url = https://simtr-api-intranet-tqs.apps.nprd.caixa/


release_tqs.properties


sigsj.release = 1.13.0
