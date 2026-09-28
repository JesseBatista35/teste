Pedro, obrigado pelo teste. Consegui acompanhar no log do pod: o erro 500 do CICS Web Interface chegou às 11:04:57 e às 11:05:50.

Testei a chamada pelas duas portas (2587 e 32587) e o retorno é o mesmo 500, então a porta não é a causa. O pod está estável, com o limite de memória ajustado, e a requisição chega ao CICS.

Pela monitoração da Karen, o D01POSOL recebe o texto cru da requisição HTTP (POST /sid01/lancamentoV4 HTTP/1.1, Content-Type: text/xml, Host: cicsweb.tqs.caixa), e não os campos convertidos do SOAP. Isso indica que o programa é chamado sem passar pelo pipeline do web service (DFHPIDSH).

Peço ao time de Mainframe a verificação de:

CEMT I URIMAP(D01UMTQS): USAGE, PIPELINE, WEBSERVICE, PROGRAM e TRANSACTION;
CEMT I WEBS(lancamentoV4): URIMAP associado e STATE. No CICQAWB1 ele aparece sem Uri($...), diferente dos demais serviços do D01SPIPE;
Definição da N1W1: DFHPIDSH como primeiro programa nos AORs, routable/dynamic no TOR;
Se o D01POSOL está instalado somente nos AORs. O ASRA foi registrado no CICQTWB3, que é TOR.

Se possível, confirmem também se houve novo dump às 11:05 no CICQTWB3.



antes de amdar


o evertorn heleno disse isso

Rodrigo Portela das Chagas
📷
Essa última execução não chegou aqui no CICS.
 
I WEBS(*) PROG(D01POSOL)                                                      

  STATUS:  RESULTS - OVERTYPE TO MODIFY                                         

  Webs(lancamento                      ) Pip(D01SPIPE)                         

     Ins Ccs(00000) Uri($803020 ) Pro(D01POSOL) Com Xopsup Xopdir              

  Webs(lancamentoV4                    ) Pip(D01SPIPE)                         

     Ins Ccs(00000)               Pro(D01POSOL) Com Xopsup Xopdir              


                                                     SYSID=AWQ1 APPLID=CICQAWB1

 



 
