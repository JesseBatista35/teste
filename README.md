Oi, Jesse! Bom dia
 
Aqui é Pablo, dev do Sipgc. Me ajudasse com a configuração do vault e do proxy do projeto há um tempo
 
estamos com um problema para consumir um serviço em ambiente remoto e acredito que possa ser alguma configuração de firewall.. você consegue me ajudar com essa questão?
 
Pablo Messias Rodrigues dos Santos, bom dia 
 
me manda o modulo
 
posso dar uma olhada
 
pode ir call rapidinho?
 
só um momento, finalizar uma sala aqui ja te chamo ai
 
pronto, perfeito
 
n vou tomar mt seu tempo, prometo kkk
 

só pra adiantar o assunto
 
Assunto: Indisponibilidade/timeout na consulta ao SIGOC a partir do ambiente DES do SIPGC
Olá, pessoal.
Estamos investigando falhas na consulta de colaboradores realizada pelo SIPGC através do endpoint de prestadores do SIGOC.
Cenário observado
A aplicação SIPGC consulta o endpoint abaixo para obtenção dos dados do colaborador:
 
GET https://des.sigoc.caixa/sigoc-web/rest/prestadores
    ?matricula=<matricula>
    &pagina=1
 
Exemplo:
 
https://des.sigoc.caixa/sigoc-web/rest/prestadores?matricula=F556565&amp;pagina=1
 
Comportamento local
Quando executamos a API localmente, utilizando a mesma URL do ambiente DES do SIGOC, a consulta é concluída com sucesso e os dados do colaborador são retornados normalmente.
 
uri.AbsoluteUri = "https://des.sigoc.caixa/sigoc-web/rest/prestadores?matricula=F556565&pagina=1"
StatusCode: OK
 
 	Name	Value	Type
 	Content	"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><prestadores><prestador><matricula>F556565</matricula><nome>PABLO MESSIAS RODRIGUES DOS SANTOS</nome><nomeSocial></nomeSocial><dataNascimento>03/01/2000</dataNascimento><genero>Masculino</genero><rg>003558985</rg><orgaoExpedidor>SESPDS/RN</orgaoExpedidor><pisNis>166.25738.57-4</pisNis><telefoneCaixa></telefoneCaixa><telefoneCelular></telefoneCelular><email></email><cep>70092900</cep><rua>ST
 BANCÁRIO SUL QUADRA 04</rua><numero>34</numero><complemento>BLOCO A</complemento><cidade>BRASILIA</cidade><estado>DF</estado><pais>BR</pais><salarioBaseVigente></salarioBaseVigente><inicioVigenciaSalario></inicioVigenciaSalario><dataCadastroMatricula>04/11/2025</dataCadastroMatricula><numeroOficio></numeroOficio><dataEmissaoOficio
 xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"
 xsi:nil=\"true\"/><ativo>Sim</ativo><especialidade1 xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"
 xsi:nil=\"true\"/><especialidade2 xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance..."	string
 
 
Portanto, até o momento descartamos:
matrícula inexistente;
endpoint incorreto;
erro na montagem da URL;
erro de desserialização da resposta.
Comportamento no ambiente DES
Quando a mesma consulta é executada a partir do POD do SIPGC em DES ou TQS, a chamada não recebe resposta do SIGOC dentro do tempo configurado.
Logs coletados:
 
SIGOC REQUEST
Matricula: F556565
Uri: https://des.sigoc.caixa/sigoc-web/rest/prestadores?matricula=F556565&amp;pagina=1
 
 
SIGOC RESPONSE
Matricula: F579079
ElapsedMs: 29993
StatusCode: 0
ResponseStatus: Aborted
ContentType: null
ErrorMessage: A task was canceled.
 
 
System.Threading.Tasks.TaskCanceledException: A task was canceled.
 
Teste realizado
Inicialmente o timeout da integração estava configurado para aproximadamente 10 segundos.
Os logs mostravam:
 
Elapsed ≈ 10000 ms
StatusCode = 0
 
Aumentamos o timeout para 30 segundos apenas para validação.
Após nova implantação os logs passaram a registrar:
 
Elapsed ≈ 30000 ms
StatusCode = 0
ResponseStatus = Aborted
ErrorMessage = A task was canceled.
 
Ou seja, o comportamento acompanhou exatamente o novo timeout configurado.
Suspeita atual
Não estamos observando um retorno HTTP 404 originado pelo SIGOC.
O que estamos observando é:
 
StatusCode = 0
ResponseStatus = Aborted
TaskCanceledException
 
após aproximadamente o tempo configurado de timeout.
Nossa principal suspeita neste momento é que a requisição iniciada a partir do ambiente DES/TQS do SIPGC não esteja conseguindo concluir a comunicação com o SIGOC, seja por:
latência excessiva;
problema de conectividade entre ambientes;
timeout interno do serviço;
indisponibilidade/intermitência da aplicação;
bloqueio em alguma camada intermediária.
Solicitação
Poderiam verificar pelo lado do SIGOC se existem registros de recebimento/processamento das requisições abaixo no mesmo horário?
Exemplo de chamada:
 
GET /sigoc-web/rest/prestadores?matricula=F556565&pagina=1
 
Horário aproximado:
 
03/11/2026 20:02 UTC
 
 
Também gostaríamos de confirmar se há algum comportamento conhecido de timeout ou restrição para consumo a partir do ambiente DES/TQS do SIPGC.
Obrigado.
 
basicamente, o SIPGC em DES/TQS não consegue consumir o SIGOC. É como se um pod não visse o outro
 
rodando o sipgc localmente, dá certo. consumindo o endpoint do sigoc diretamente na minha maquina, tbm dá certo.
 
o problema é em ambiente remoto. Dá timeout, não chega nem resposta http
 
top com esse diagnostico ja consigo ir vendo
 
tenho os logs mais detalhados aqui tbm, se quiser
 
ainda nao acabou o ADDR
 
Jesse Mouta Pereira Batista
ainda nao acabou o ADDR
tranquilo
 
assim que finalizar te aviso e agente entra em call
 
ok
 
opa, jesse 
 
nada ainda?
 
