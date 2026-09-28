Bom dia pessoal!

Analisei o tutorial de CICS WebService enviado pela Claudia e cruzei com as evidências do ambiente.

O que vimos:

Pela monitoração da Karen, o working storage do D01POSOL recebe o texto cru da requisição HTTP (POST /sid01/lancamentoV4 HTTP/1.1, Content-Type: text/xml, Host: cicsweb.tqs.caixa), e não os campos convertidos do SOAP. Por isso os campos numéricos chegam corrompidos e o programa abenda com ASRA.
O WSDL do lancamentoV4 abre em TQS pela porta 32587 (cicsweb.tqs.caixa:32587/sid01/lancamentoV4?wsdl), que é a porta padrão do web service segundo o tutorial, e é a mesma usada em DES.
Na pipeline de TQS, a variável CICSWEB_ROOT_ENDPOINT_HTTPS estava com a porta 2587, diferente de DES (32587).
O CICQTWB3 tem as duas portas em LISTEN (2587 e 32587). A 2587 pode ser um listener diferente, onde o URIMAP manual D01UMTQS (criado por vocês, pois o web service não estava instalado em TQS) entrega a requisição direto ao D01POSOL, sem passar pelo pipeline (DFHPIDSH).
No CEMT I WEBS(*) PROG(D01*) do CICQAWB1, o lancamentoV4 (Pip D01SPIPE, Pro D01POSOL) aparece sem Uri($...) associado, diferente dos demais serviços.

O que faço agora:

Alterei a variável CICSWEB_ROOT_ENDPOINT_HTTPS do pod de TQS de 2587 para 32587, alinhando com DES e com a porta em que o WSDL abre.
Vou deixar o log do pod aberto para acompanhar o próximo teste.

Peço:

Pedro/Rodrigo, avisem aqui e disparem uma nova chamada de débito, para eu validar o resultado no log.
Se o erro persistir, peço ao time de Mainframe a verificação de: CEMT I URIMAP(D01UMTQS) (USAGE, PIPELINE, WEBSERVICE, PROGRAM, TRANSACTION); CEMT I WEBS(lancamentoV4) (URIMAP associado e STATE); a definição da N1W1 (DFHPIDSH como primeiro programa nos AORs, routable/dynamic no TOR); e se o D01POSOL está instalado somente nos AORs, já que o ASRA foi registrado no CICQTWB3, que é TOR.


oc set env dc/sid01-lancamentos-financeiros-okd4-tqs CICSWEB_ROOT_ENDPOINT_HTTPS=https://cicsweb.tqs.caixa:32587 -n sid01-tqs

oc get pods -n sid01-tqs

