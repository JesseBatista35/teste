Bom dia pessoal!

Analisei o tutorial de CICS WebService enviado pela Claudia e cruzei com as evidências. Segue o que observei:

1. O D01POSOL recebe o HTTP cru. Pela monitoração da Karen, o working storage do D01POSOL contém POST /sid01/lancamentoV4 HTTP/1.1, Content-Type: text/xml; charset=UTF-8 e Host: cicsweb.tqs.caixa. Num web service SOAP provider, o pipeline (DFHPIDSH) converte o XML para a COMMAREA antes de chamar o programa. Os campos numéricos chegam corrompidos e o programa abenda com ASRA.

2. Suspeita: o URIMAP manual desvia o pipeline. O URIMAP D01UMTQS (Path /sid01/lancamentoV4, Https) foi definido manualmente, pois o web service não estava instalado em TQS. Pelo item 6 do tutorial, o URIMAP correto é gerado pelo DFHLS2WS na instalação do WEBSERVICE. No CEMT I WEBS(*) PROG(D01*) do CICQAWB1, o lancamentoV4 (Pip D01SPIPE, Pro D01POSOL) aparece sem Uri($...) associado, diferente dos demais serviços. Se o URIMAP manual tem o mesmo path e aponta direto para o programa, ele assume a requisição no lugar do URIMAP gerado, e o pipeline não é executado.

3. Peço a verificação de:

CEMT I URIMAP(D01UMTQS): conferir USAGE, PIPELINE, WEBSERVICE, PROGRAM e TRANSACTION;
CEMT I WEBS(lancamentoV4): confirmar o URIMAP associado e o STATE (Inservice);
Se o URIMAP manual estiver sem PIPELINE/WEBSERVICE, removê-lo (ou desabilitá-lo) e executar CEMT PERFORM PIPE(D01SPIPE) SCAN em cada região, para o URIMAP gerado assumir o path;
Definição da N1W1: DFHPIDSH como primeiro programa nos AORs, routable/dynamic no TOR, e D01POSOL instalado somente nos AORs. O ASRA foi registrado no CICQTWB3, que é TOR.

Como o problema não está no payload nem na aplicação, fico com o log do pod aberto e valido o retorno quando o Pedro ou o Rodrigo dispararem o novo teste.
