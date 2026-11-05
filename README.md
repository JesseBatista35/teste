Reunião em Migração JBoss 7.4 - SIFEC, SICCR, SIEMP, SIPEN-20261105_103036-Transcrição da Reunião
5 de novembro de 2026, 01:30PM
1h 46m 42s

Jesse Mouta Pereira Batista começou a transcrição

Pablo Leite Costa   0:03
Os perfis do usuário já estão
Já subiram já para migração.

Jesse Mouta Pereira Batista   0:10
Ainda não.

Pablo Leite Costa   0:11
Ah, então é isso, cara. Então é isso.

Jesse Mouta Pereira Batista   0:14
Entendi, ele precisa encontrar então esses esses e eles tem qual em qual módulo você sabe dizer?

Pablo Leite Costa   0:17
Place season, place season.

Jesse Mouta Pereira Batista   0:22
É porque a até agora eu subi só o que tá lá na planilha que a gente colocou ontem.
Na verdade, na verdade só tem esse FEC e o e o PJ.
Porque os outros tiveram algum problemas lá no código e o pessoal tá.
Está ajustando lá o pacote para poder enviar para a gente, para a gente poder subir.

Pablo Leite Costa   0:44
é porque o que que acontece essa aplicação aqui a gente valida Qual que é o perfil do usuário para poder ter os acessos entendeu inclusive isso tá até cara até os menus os menus a gente controla o p

Jesse Mouta Pereira Batista   0:48
Mm.
Entendi.

Pablo Leite Costa   1:02
E o mas deixa eu só dar uma olhada aqui aí eu vou ver direito onde que está aqui

Jesse Mouta Pereira Batista   1:04
Yeah.
beleza vê é vê lá na aba rede pode é pode pode é ver lá na rede recarrega aí para a gente para a gente ver o perfil do vê aí perfil acesso usuário ver se ele tá trazendo aí

Pablo Leite Costa   1:10
No.
Evo.
Santos Santos T.

Jesse Mouta Pereira Batista   1:24
Tá.
I perfil acesso usuário.

Pablo Leite Costa   1:29
Teve um acesso do home.
Eu.

Jesse Mouta Pereira Batista   1:37
Ele está dando 200 aí em todos, não é?

Pablo Leite Costa   1:40
Tá, mas ele tá retornando

Jesse Mouta Pereira Batista   1:45
Nada, né? Tá retornando só um, né?

Pablo Leite Costa   1:47
É, está retornando.
E quando a gente fala?
Refect you.

Jesse Mouta Pereira Batista   1:58
É por por que que eu pedi para você dar uma olhada nesse cara aí porque lá lá no no
Lá no perfil, lá quando a gente carrega lá, ele deu, ele deu um erro, tipo, por exemplo, esse cara, esse cara tá beleza, mas esse esse perfil, ele vem do token, ele vem do clay cluck, ou ele vem do banco ou um serviço, ele vem de serviço, né?

Pablo Leite Costa   2:25
Vem do banco, ele vem no banco, vem do banco.

Jesse Mouta Pereira Batista   2:27
Ele vem do banco, não, cara, então o que acontece? Tem um log aqui que apareceu quando a gente quando.

Pablo Leite Costa   2:33
Tá vendo?
And we have points to the here.

Jesse Mouta Pereira Batista   2:37
Entendi.

Pablo Leite Costa   2:38
Okay.

Jesse Mouta Pereira Batista   2:39
Entendi.
tipo de comunicação ele traz esse

Pablo Leite Costa   2:41
Entre a autorização.

Jesse Mouta Pereira Batista   2:46
Uh-huh.

Pablo Leite Costa   2:46
Aí através disso aqui a gente pega as rules dele para poder ter os acessos, entendeu? Que são as rules de autenticação.

Jesse Mouta Pereira Batista   2:53
Te
É não, então tem um suspeito aqui, cara, porque acontece quando a gente rodou, quando o Thiago já subiu lá, ele deu um erro lá no banco, na SQL, ele deu um erro lá, 4223, que ele fala, né, ocorreram as sessões de segurança para carregar o drive DB2 JCC no 4.16.53.

Pablo Leite Costa   3:16
Pick the ones.

Jesse Mouta Pereira Batista   3:16
Então esse cara é DB 2JCC.

Pablo Leite Costa   3:19
Mm.

Jesse Mouta Pereira Batista   3:23
Ele deu um erro.

Pablo Leite Costa   3:23
Me passa esse log aí, deixa eu dar uma olhada nele, esse erro.

Jesse Mouta Pereira Batista   3:26
Deixa eu aqui, oh, deixa eu mostrar ele aqui na.
No 473 aqui.

Pablo Leite Costa   3:31
Teve que mexer em DD2 para o pessoal fazer essa migração.

Jesse Mouta Pereira Batista   3:35
Acredito que não. Acredito. Eu Acredito que o pessoal não mexeram. É, a gente estava até conversando com o Thiago. O que acontece? Como o Murilo estava tocando aqui, ele saiu de férias, né? E aí é meio que a gente caiu.
Vou usar até o termo desculpa de paraquedas é a gente caiu de paraquedas. Deixa eu pegar a tela aqui e te mostrar o erro aqui rapidinho.

Pablo Leite Costa   3:52
Te falar comigo?

Jesse Mouta Pereira Batista   4:01
E aí a gente não sabe como é que está essa.
Essa implantação, mas está aqui, o erro que ele deu foi esse aqui, ele deu esse erro 4233.
Ele dá um SQL exception, aí ele fala, né? Originaram. Aí ocorreram a exceção de segurança ao carregar o drive.

Pablo Leite Costa   4:25
E qual que é? Qual que é o sistema? Ele aparece aí?

Jesse Mouta Pereira Batista   4:31
Não.

Pablo Leite Costa   4:32
Polly.
ele deve trazer o sistema aí

Jesse Mouta Pereira Batista   4:34
Oh, Miss L.
É.
Ele fala aqui do workflow cloud PJ web, né?

Pablo Leite Costa   4:43
Mine work for.

Jesse Mouta Pereira Batista   4:44
Aqui, ó, SISCR PJ.

Pablo Leite Costa   4:46
CCR PJ.
Foi implantado no time, é AR, ele traz cara, qual que é o sistema? Ele traz, deixa eu ver.
E nós tiramos o DB2 do CCR, tá? CCR a gente não tem mais DB2, mas existe. Existem outros sistemas que a gente consome que utiliza DB2.
E eles são, deixa eu ver aqui quais são eles.
Some utilize on the bed, though is the should be key.
Take qualquer coisa. Oh, what have core?
eu não estou muito enganado

Jesse Mouta Pereira Batista   5:51
Deixa eu ver se eu consigo descobrir a linha, porque eu acho que dá para a gente descobrir de onde vem o aviso, né?
Deixa eu ver.

Pablo Leite Costa   5:58
Me passa essa, me passa essa string do erro aqui, qual é comando no meu privado ou manda aqui que eu vou ver.

Jesse Mouta Pereira Batista   6:03
Yeah.
Vou mandar aqui.
Mandaki na salapse.

Pablo Leite Costa   6:11
Mhm.

Jesse Mouta Pereira Batista   6:18
Hi, Monday.
E.
Deixa eu ver aqui, será se eu consigo pegar o número da linha antes dos 2 pontos aqui?
Deixa eu dar uma olhada aqui, a gente consegue vasculhar um pouco melhor.
Tudo se de menos n.
Why, correct?
I know, né?
Do I honey missing?
Okay.

Pablo Leite Costa   7:30
Place of sick of a billing before.

Jesse Mouta Pereira Batista   7:42
I actually try.
Mouta feita esse comando.
Bernardo, high Bernardo, 1028.
Deixa eu ver aqui.
Down.

Pablo Leite Costa   8:38
O os os BB2 estão sentados aí, você sabe?

Jesse Mouta Pereira Batista   8:42
Okay.

Pablo Leite Costa   8:44
Mm.

Jesse Mouta Pereira Batista   8:44
Jesse Fact Internet.
JDb, CDB, close delay, esses aqui também, nossa, tem bastante.
Santos Live
bora ver aqui
Deixa eu ver se eu consigo pegar
Oh.
Tem esse aqui no intranet, ó DB2, tá vendo, ó? JDBC, DB2, Cifec DS.

Pablo Leite Costa   9:19
Isso, ó, esse cara aí é doce reque.

Jesse Mouta Pereira Batista   9:20
Tem esse cara aí.
Ser

Pablo Leite Costa   9:26
Realmente a gente utiliza alguns DB2 do CESTI, faz sentido isso.

Jesse Mouta Pereira Batista   9:29
Doce fake uhum deixa eu só dar uma olhada aqui pode pode falar pode falar que eu só estava verificando o negócio aqui

Pablo Leite Costa   9:32
And.
Hey, are you?
Aí a gente precisa ver se esse cara.
Tá configurado aí, né?

Jesse Mouta Pereira Batista   9:46
Danger.

Pablo Leite Costa   9:46
O drive dele.

Jesse Mouta Pereira Batista   9:49
Mm-hmm.
Uh.

Pablo Leite Costa   10:05
Ele é, ele é do ark heavy cor, ele é do ark service.

Jesse Mouta Pereira Batista   10:12
Entendi.

Pablo Leite Costa   10:13
Entendeu? Se eu não estou muito enganado, ele é para esses caras do cifec.

Jesse Mouta Pereira Batista   10:14
Ele.
Yeah.
Pode ser que o erro esteja vindo desse desse cara, então porque?

Pablo Leite Costa   10:35
Okay.
Mas o que eu estou fazendo? Eu vou fazer uma. Eu estou fazendo uma varredura aqui.
Thank you.

Jesse Mouta Pereira Batista   10:48
Então, mas então vamos lá, é só pra gente concluir aqui, eu acabei de verificar, quero que eu precisava verificar.

Pablo Leite Costa   10:56
Uh.

Jesse Mouta Pereira Batista   10:56
A C.
Esse aviso do DB2 aqui, ele não é do PJ, ele é uma configuração lá do clickluck. Porque, por exemplo, na configuração aqui do clickluck aqui que eu tava olhando, ele aparece uma diferença, né? Então esse aviso do DB2 ele é do Cifec, ele não tá afetando o PJ.

Pablo Leite Costa   11:17
Mhm.

Jesse Mouta Pereira Batista   11:18
Ele vem do facweb, que ele carrega os grupos de usuário.

Pablo Leite Costa   11:20
Ease, Ease, it's name, this name.

Jesse Mouta Pereira Batista   11:23
Entendeu? Exatamente. Aí ele carrega a classe lá, o faq ponto faqw é underscore empregado do DB2, do data source lá do JDBC barra DB2 se faqd5 que foi esse cara aqui que a gente veio aqui.

Pablo Leite Costa   11:30
D Side.
Isso mesmo, Mano, você matou a charada. É isso aí. Aí como é do usuário, ele não está conseguindo retornar o.

Jesse Mouta Pereira Batista   11:38
Ele está carregando.
É.

Pablo Leite Costa   11:47
O as profiles logo is.

Jesse Mouta Pereira Batista   11:49
As profiles, exatamente, exatamente. Deixa eu ver aqui se tem o aut server, URL, se ele funciona na subsystem, porque se ele tiver um real aqui do intranet definido.
A gente precisa comparar as credenciais.
Deixa eu ver aqui.
So.
É.
É porque pelo que a parte mostra que lá naquela camada que retorna vazia, o faqweb, ele chama esse cara aqui, faqweb empresas app login workflow crédito PJ. E aí ele passa antes de abrir o PJ, ou seja, essa chamada, ela retorna os 63 bytes que a gente viu aqui.
Good, good.
O profile ele chama esse cara aqui beleza
Yeah.
deixa eu deixa eu pensar aqui
O que a gente pode?
Vasculhar aqui pra gente ver.
Deixa eu ver se eu consigo pegar um profile dele aqui do out
Deixa eu abrir aqui.
Santos Live
Tá, você leu 476 beleza, vamos lá
Cifec intranet /sub system bora ver o que clug desse cara
Pereira G.
Over here.
Yeah.
Beleza, bora ver esses outros profile aqui, se ele traz alguma coisa para a gente.
Credencial Secret, clay clock, fake web WAR.
Também trouxe um mesmo. Beleza, deixa eu olhar aqui.
Qual que ele pega aqui?
Contrato analysis, Contrato.
Connection pull size indefinido.
Cars, and they record them.
É cara, essa configuração aqui do click aqui do PJ, ela está correta.
Pablo, a gente consegue ativar algum nível de debug aí? Existe algum log de aplicação com algum nível de debug pra gente ativar pra gente ver o fluxo dessas chamadas?

Pablo Leite Costa   16:34
I can see you.
deixa eu

Jesse Mouta Pereira Batista   16:42
Acho que se você me mostrar, me mandar a categoria dele.
Por exemplo, tipo BR gov.caixa W PJ, né? Eu acho que dá pra gente ligar o debug aqui só Pra Ela, sem a gente precisar reiniciar nada, entendeu?
OK, a gente liga esse esse debug aqui.
E aí você faz o teste, a gente tenta ver.
Tá.
Mission really again.

Pablo Leite Costa   17:17
Para aqui.

Jesse Mouta Pereira Batista   17:22
É, você tinha me falado, mas desculpa, vou te perguntar de novo, o que que o perfil lá do acesso usuário ele retorna quando não identifica o perfil?

Pablo Leite Costa   17:31
retorna um aqui tá retornando na verdade é nulo né ele retorna nulo

Jesse Mouta Pereira Batista   17:37
No.

Pablo Leite Costa   17:38
Okay.

Jesse Mouta Pereira Batista   17:39
So.
Tá, beleza, beleza, O PJ ele recebe esse usuário que vem lá do Cifec, certo?

Pablo Leite Costa   17:48
Ele recebe isso, exatamente, faz o login e recebe esse usuário que vai de

Jesse Mouta Pereira Batista   17:48
Ou não?

Pablo Leite Costa   17:56
Aí o que que a gente faz? O usuário está logado, está logado, está logado. A gente acessa o menu do SiFec, acessou o menu do SiFec, vai abrir a aplicação, ele verifica a profile daquele usuário.
Qual que é o perfil, quais são as rules?
E aí ele vai liberando o acesso à aplicação.

Jesse Mouta Pereira Batista   18:15
Entendi.

Pablo Leite Costa   18:22
Eu posso até subir, deixa eu subir essa aplicação aqui em.
In 10 de olhos.

Jesse Mouta Pereira Batista   18:30
Tá.

Pablo Leite Costa   18:32
Yeah, your movie see.
Jesse, Sandy, Mass de Ricky.

Jesse Mouta Pereira Batista   18:40
Deixa eu ver se eu consigo ativar esse modo debug aqui dentro. E aí você faz o teste, você recarrega a página e faz o teste lá. Deixa eu ver se aqui dentro da parte a gente consegue colocar esse nível aqui dentro.

Pablo Leite Costa   18:48
Mm.

Jesse Mouta Pereira Batista   18:54
Over the book, your print, tantantam, beleza.
É, eu acho que ele aceitou, não retornou nenhum erro, roda lá, roda lá de novo o teste lá pra ver se ele vai carregar alguma. Opa, pera aí, não deu falha.

Pablo Leite Costa   19:08
Fine.

Jesse Mouta Pereira Batista   19:09
Ainda falha aqui, eu disse fé que ele não aceita não pode subir a aplicação aí pra gente ver.
Knowledge back to result.

Pablo Leite Costa   19:21
Fazer um negócio para eu poder subir vai ser um rolê, porque eu tenho que gerar os dados de morte.

Jesse Mouta Pereira Batista   19:23
So.
Ish.
Ah, não, então.

Pablo Leite Costa   19:29
Entendeu?

Jesse Mouta Pereira Batista   19:30
É, cara, acho que não vale a gente por aí, não.

Pablo Leite Costa   19:32
Aí o mok, você já viu, não é? Mok pode mascarar muita coisa. Na verdade, o local a gente cria até as profiles dele, entendeu?

Jesse Mouta Pereira Batista   19:34
É, no.
Or.

Pablo Leite Costa   19:43
Então ele não vai chamar é direto.

Jesse Mouta Pereira Batista   19:43
É, mas.

Pablo Leite Costa   19:48
Não vai chamar direto o ponto que a gente precisa.
que eu moco a classe lá do usuário provider que é justamente essa classe

Jesse Mouta Pereira Batista   19:58
Mano, mas calma aí, eu acho, eu acho que eu achei o perfil, o problema aqui, porque assim a gente tem a hipótese confirmada que o perfil acesso usuário ele retorna nulo porque o PJ ele não está conseguindo identificar o usuário ou.
as holes que vem do SSO, certo?

Pablo Leite Costa   20:16
Mm.

Jesse Mouta Pereira Batista   20:17
O que acontece é, cara, eu acho, eu acho que quando o PJ, ele pediu o security domain aqui, aquele jazzifec.
Eu copiei o full hassifec do intranet 2 com os módulos do remote lá ontem, então pode ser que esses módulos validam o usuário contra os arquivos locais do JBoss.
Aí pode ser que ele que não, não contra o token do click cluck que a gente tava pensando. Então pode ser que esse resultado do click cluck, ele autentica. E aí por isso ele vem aos 200. Mas na hora que o PJ pergunta quem é o usuário e quais as rodas ele tem, o security domain, ele não traz nada de token. E aí o perfil volta null.

Pablo Leite Costa   20:45
Same.
Uh-huh.

Jesse Mouta Pereira Batista   20:59
Então pode ser isso. Deixa eu confirmar aqui se é isso mesmo, se ele aparecer aqui para gente.
É, cara, pode ser esse cara aí que a gente criou ontem pro PJ.
bora ver aqui
deixa eu ver se eu consigo pegar outra profile dele aqui para ver como é que tá bora ver aqui
Fmail.
Thank you.
Internet you boss will be.
Assisting Marvel Security deal.
Take click.

Thiago Jeferson de Sousa Silva   21:55
Pablo, bom dia, tem como tu testar novamente, por favor?

Pablo Leite Costa   22:02
Okay.

Thiago Jeferson de Sousa Silva   22:04
Capture it's appropriate.

Pablo Leite Costa   22:08
Are you a key, she resource would be?
É, está dando, não está conseguindo conectar lá, migração cifec.dez.caixa/factware.
Tell P.

Jesse Mouta Pereira Batista   22:58
Pois é, mas acho que o servidor ele não terminou de subir, cara.
É.
Ele tem que estar como unha aqui pra pra mim poder aplicar.
Deixa eu ver aqui.
Deixa eu dar uma olhada aqui dentro do Apache dele como é que ele está.
barra Opa tô digitando lá do outro lado barra
Who's she?
Pereira ver o HC.
No.
Saver.
a alcifec né
Internet, o node dele é um.
LX 403 Tal Reaging
AG.
Tribute, brow back in name.
Yes.
Sarah.
ver o state dele state
Tá, ele tá com falha.
Não, um atributo não, pera aí, um atributo não reconhecido. Eu vi ali só o falho.
Faltou um R bem aqui.
Cara, ele está rodando.

Pablo Leite Costa   24:37
A.

Jesse Mouta Pereira Batista   24:38
Está está rodando, está. Então que deixa eu explicar para vocês aqui, vê se vê se faz sentido aí, Jefferson, Oh.
Pode ver aqui o domínio do Clayclock, ele usa esse Clayclock login module, certo? Ele está usando esse cara aqui, esse cara aqui, beleza? Enquanto o nosso Jazz lá do Sifec que a gente criou ontem.
Ele está com remote e Home Direct, porque isso deixa o Eu Acredito em uma suposição, tá, gente? Eu Acredito que isso deixa o PJ sem usuário e sem as hullers porque ele está puxando desse cara aqui. Então o que eu vou fazer? Eu vou ajustar ele aqui.
Agora, e aí a gente faz o teste, tá?
They show.
Pangakia PJ.
A gente roda esse teste, tu não conseguiu pegar captura aí né Jeferson?

Thiago Jeferson de Sousa Silva   25:36
No.

Jesse Mouta Pereira Batista   25:37
Okay.

Pablo Leite Costa   25:38
É para mim aqui tá bom, viu?

Jesse Mouta Pereira Batista   25:42
And.

Pablo Leite Costa   25:43
Subiu na liberação this.

Jesse Mouta Pereira Batista   25:45
Ele tá dando.
Tá dando um erro aqui, cara.
bora ver aqui
Eles tinham que subir escada de novo.
Agora estranho, porque que ele estava rodando, né?

Pablo Leite Costa   26:02
Tava rodando normal.

Jesse Mouta Pereira Batista   26:03
A gente não fez nada. Será se foi o modo debug lá que derrubou ele? Ah, cara, eu acho que foi.
Pode ser.

Pablo Leite Costa   26:12
É o mesmo é AR lá em.
Lá no ambiente cifac antigo, tá? Ele tá trazendo. Então acho que você tem razão, Londé, porque eu sei disso aí mesmo.

Jesse Mouta Pereira Batista   26:22
Mhm.
É.

Pablo Leite Costa   26:31
Devolt Pablo.

Jesse Mouta Pereira Batista   26:32
Isso, bora ver esse cara aqui.

Thiago Jeferson de Sousa Silva   26:51
migracao cifec.10caixa/fecweb.

Jesse Mouta Pereira Batista   26:57
Isso.

Thiago Jeferson de Sousa Silva   26:59
Está abrindo, eu só não tenho senha processada.

Pablo Leite Costa   27:02
É, digite aí, C8, espera aí.

Jesse Mouta Pereira Batista   27:03
Yeah.

Pablo Leite Costa   27:07
Pass up, so pass up.

Jesse Mouta Pereira Batista   27:07
Era bom, era bom a gente ter um de teste, se você tiver, conseguir passar para a gente, que aí fica mais fácil, porque tem algumas aplicação que elas, acho que elas estão no DAP, a gente consegue acessar com o nosso usuário. Eu vou, eu vou derrubar o cifec aqui rapidinho, tá gente? Só para aplicar aqui a.

Pablo Leite Costa   27:12
Okay.

Thiago Jeferson de Sousa Silva   27:15
Tell me.
Okay.

Jesse Mouta Pereira Batista   27:27
A configuração.

Thiago Jeferson de Sousa Silva   27:30
The pastel say.

Pablo Leite Costa   27:32
Propassionally key.

Jesse Mouta Pereira Batista   27:34
É por enquanto, pode ir, pode rodar aí.

Pablo Leite Costa   27:37
É, esse aqui é o usuário de texto, tá, pessoal? Pode ficar à vontade. É, eu passei aqui no grupo.

Jesse Mouta Pereira Batista   27:39
Beleza.

Thiago Jeferson de Sousa Silva   27:40
Okay.

Jesse Mouta Pereira Batista   27:41
Beleza.
Ah, beleza, valeu.
Já testa aí o Jefferson que eu vou derrubar ele aqui, tá? Aí você me avisa.

Thiago Jeferson de Sousa Silva   27:50
Just I want.

Jesse Mouta Pereira Batista   27:51
Town.

Thiago Jeferson de Sousa Silva   28:12
Compartilhe aqui, entrou.

Jesse Mouta Pereira Batista   28:14
Entrou?

Thiago Jeferson de Sousa Silva   28:17
Sorry about that.

Jesse Mouta Pereira Batista   28:18
Tá, pode pegar hein.

Thiago Jeferson de Sousa Silva   28:21
Okay.

Pablo Leite Costa   28:23
Pess
Menu Serviços lá em cima.
É crédito comercial.
É Pessoa Jurídica, penúltimo.
Consulta clientes.
Premier.
Here it is, no proofs.

Jesse Mouta Pereira Batista   28:47
da f12 e recarrega só para a gente ver se causou
Yeah.
Não encontrou. É isso mesmo. Clica lá na rede lá rapidinho.
H is.
Live
Tá usando com navegador Firefox, né?
É, é isso mesmo, as imigração, as FEC.
Com os trocar de Serviços, então.
404 tá beleza deixa deixa eu deixa eu reset ela aqui gente a gente aplica essa essa correção e aí a gente testa novamente vamos lá

Thiago Jeferson de Sousa Silva   29:25
Beleza.

Jesse Mouta Pereira Batista   29:34
Sever Group C FEC
já já tô fazendo eu tô fazendo só o reload dela tá ele vai ficar fora em alguns minutinhos deixa eu compartilhar a tela aqui todo todos nós acompanhamos

Pablo Leite Costa   29:42
Mhm.

Jesse Mouta Pereira Batista   29:49
Não sei do seu celular, David.
Break Lake Sandy.
Victor.
Beleza, subiu.
Agora bora dar uma olhada aqui
No.
Most.
Ah não, já tem esse comando aqui
No histórico.
Mais rápido do que digitar, beleza?
Tá, bora ver aqui.
Contrato de 3.
Beleza.
deixa eu entrar aqui no 476 gente rapidinho
Só para confirmar como é que ele passou dessa sessão aqui.
Ó, beleza.
PJ tá ele trouxe esse cara aqui para gente
Tá, aqui ele rodou os dois comandos.
Sucesso, sucesso, fez o relude.
e o 473 Ele trouxe pra gente Pablo pode pode testar aí o Jefferson quiser tá já tá com ele aberto aí quiser pegar a tela aí

Pablo Leite Costa   31:52
Aberty, Char.

Thiago Jeferson de Sousa Silva   31:53
Oh.

Jesse Mouta Pereira Batista   32:00
Pode pegar a tela aí.
Is.

Pablo Leite Costa   32:09
Ele cria um menuzinho, o laranja, mas pode ir

Jesse Mouta Pereira Batista   32:13
I.

Pablo Leite Costa   32:15
Não trouxe.

Jesse Mouta Pereira Batista   32:16
Nenhum registro.

Pablo Leite Costa   32:18
Yes.

Jesse Mouta Pereira Batista   32:19
A.

Pablo Leite Costa   32:22
So will see.
e o engraçado quando você clica lá no início ele não volta para nome também tá então

Jesse Mouta Pereira Batista   32:45
Pois é.

Thiago Jeferson de Sousa Silva   32:51
Right.

Jesse Mouta Pereira Batista   32:52
Take care, PJ.

Thiago Jeferson de Sousa Silva   32:55
Tinha que aparecer a lista dos clientes aqui, né?

Jesse Mouta Pereira Batista   32:58
Sim.

Thiago Jeferson de Sousa Silva   33:00
Nisso a gente inserir um CNPJ para ver se dá outro tipo de erro.

Jesse Mouta Pereira Batista   33:07
Não pode, pode tentar.

Pablo Leite Costa   33:09
É o eu já fiz isso também e ele não traz não.

Jesse Mouta Pereira Batista   33:14
And that's not.

Pablo Leite Costa   33:15
Some.
Perry, perry, perry, perry.
Real me bossing.
Okay.
aqui é porque esses aí que são favoritos tá que tem razão
Okay, this evacuate is back.
Como mudou tudo, até o servidor está apontando para outro, não é?

Jesse Mouta Pereira Batista   33:48
Mhm.

Pablo Leite Costa   33:52
Two.
Okay.
Okay.
Okay.

Jesse Mouta Pereira Batista   34:30
Hoje eu não encontro nada.

Thiago Jeferson de Sousa Silva   34:36
O.

Pablo Leite Costa   34:39
É, realmente ele está trazendo zero, está?
PJ, a resolução social te pegar em nome da.
Okay.
Souzaam.
So everything.
Formately.
Homes.

Thiago Jeferson de Sousa Silva   35:15
O.

Pablo Leite Costa   35:20
Okay.
Cont

Jesse Mouta Pereira Batista   36:02
a troca lá do seguro de domain não resolveu ela ainda tá voltando 200 vazio
Eu acho que esse problema aí Pablo do 404 acho que é só uma imagem aí que tá faltando né no facweb.
Eu acho que ele não tem relação com o problema.

Pablo Leite Costa   36:22
Mhm.
Não, não tem não. Você tá falando do load, né? 404.

Jesse Mouta Pereira Batista   36:27
Isso, loading, loading.gif, né?

Pablo Leite Costa   36:35
Santos.

Jesse Mouta Pereira Batista   36:44
O problema é porque ele responde de 4 a 6 milissegundos, é rápido demais pra constar no banco ou serviço. O código ele já tá devolvendo no logo no começo.
Deixa eu ver se eu consigo pegar
Deixa eu ver, eu acho que agora a gente consegue ligar o debug, pera aí.
Vamos ver aqui.

Pablo Leite Costa   37:24
Deixa eu fazer um só ver um negócio aqui

Jesse Mouta Pereira Batista   37:28
Tá, beleza.

Pablo Leite Costa   37:35
Okay.

Jesse Mouta Pereira Batista   38:15
Eu consegui ligar o debug aqui. Deixa eu ver aqui. Peça de novo aí, por favor.
Pablo, o Jefferson, recarrega a página lá, faz o login lá de novo e tesca aí a gente acompanha. Ó, beleza.

Pablo Leite Costa   38:28
Right.

Jesse Mouta Pereira Batista   38:29
Tá batendo aqui já.

Pablo Leite Costa   38:33
Promo.

Jesse Mouta Pereira Batista   38:33
Que a gente consegue ver exatamente a requisição aqui.

Pablo Leite Costa   38:37
Pronto, back cheat.

Jesse Mouta Pereira Batista   38:39
Mateo star.
Deixa eu ver aqui, ó, 404.
pera aí deixa eu ver aqui deixa eu mostrar para vocês que aí fica mais fácil
Some minute you.
Meu pai tem que tem requisição a tem requisição aqui a até dizer chega.

Pablo Leite Costa   39:06
Yes.

Jesse Mouta Pereira Batista   39:07
Deus aqui ah tá pera aí não tô tentando achar que deu erro aqui

Pablo Leite Costa   39:35
Como eu subi pro pro?
Do antigo, cara, funcionou, sabe?

Jesse Mouta Pereira Batista   39:42
No antigo funcionou?

Pablo Leite Costa   39:43
É, eu subi lá no Game Vocês e funcionou.

Jesse Mouta Pereira Batista   39:47
Mm.
É, pode ser que tenha, deixa eu mostrar aqui para vocês.
And so.
Aqui tem quase umas 30000 linhas, mas acho que dá para a gente.
Então beleza, retornou 200
Wait, can't
304.
Verdadeiro 200.

Pablo Leite Costa   40:39
O CM tá pegando os componentes do front, né?

Jesse Mouta Pereira Batista   40:43
É porque eu tô vendo isso, acho que as camadas do PJ não aparece aqui, cara.
Eu acho que o facweb ele gera um token e aí o JSON, esse 44244.
Clima.

Pablo Leite Costa   41:00
And.
É o sec web.
O PEC web, ele precisa do ele precisa de um JSON.

Jesse Mouta Pereira Batista   41:10
Será se o pode falar, pode.

Pablo Leite Costa   41:18
Ele precisa de um carro chamado dashboard de Jeson.

Jesse Mouta Pereira Batista   41:22
Uhum o o o o Angula será se o Angula está enviando esse token na nas chamadas da API? Tá, né?

Pablo Leite Costa   41:23
E alguma dica?
Done.

Jesse Mouta Pereira Batista   41:33
Deixa eu ver aqui.
Beleza cara deu certo que eu achei estranho porque ele não aparece nada lá cara nenhuma chamada lá do PJ
Baraovi Sandyapuras.

Pablo Leite Costa   42:00
Pois é, mas é muito estranho que.
Muito estranho que no 6 ele tá chamando o cara, é.

Jesse Mouta Pereira Batista   42:07
Tá funcionando, né? Tá chamando, né?

Pablo Leite Costa   42:10
Ele não está dando esses erros aqui.
Ele não está dando esses erros aqui, usuário, ele está trazendo usuário objeto.

Jesse Mouta Pereira Batista   42:21
Do que normalmente para a gente.
Uh-huh.

Pablo Leite Costa   42:29
Nardash Burns.
Deixa eu ver isso aqui é um hidraça, deixa eu ver
T

Jesse Mouta Pereira Batista   42:50
Santos.
So.

Pablo Leite Costa   43:03
You should speak so long on to leave.
Mm.
So I'm strong.
So I mean.
No.
Okay.
Está muito estranho, sabe?

Jesse Mouta Pereira Batista   43:24
A stran.

Pablo Leite Costa   43:25
Está muito estranho, vamos lá.

Jesse Mouta Pereira Batista   43:27
Eu pensei em uma, pode falar, eu pensei na possibilidade aqui já já vou pedir pra você fazer o teste, mas pode falar.

Pablo Leite Costa   43:33
Vamos lá, olha só, o usuário, o usuário dentro do antigo.

Jesse Mouta Pereira Batista   43:34
Mm.

Pablo Leite Costa   43:42
Ele traz os objetos do usuário, ou seja, ele trouxe a lista. Está vendo esse usuário é essa lista dos objetos.

Jesse Mouta Pereira Batista   43:48
Beleza.
Sim.

Pablo Leite Costa   43:52
Quando a gente vai lá para migração?
Ele traz somente um objeto que, em tese, é vazio.
O.
Show Vice Presidência Hutiang.
Está estranho.
Mais do you?
Tá faltando alguma coisa, eu acho que é do lado do Cifete, tá vendo?

Jesse Mouta Pereira Batista   44:20
A.
Sim.

Pablo Leite Costa   44:27
Mais detalhes, power backload.
Dangerous, this age.
She says, "Cience from
Pedi até para o colega meu refazer o build desse cara aqui.

Jesse Mouta Pereira Batista   44:50
Uh-huh.

Pablo Leite Costa   44:50
Mas é muito estranho, ele traz ele e ele executa os loads.
Consulta clientes, aquele trouxe dentro da migração.
Execute a mesma coisa, consulta cliente.
E aí depois ele traz as rotas, visão cliente, route, etc. Trouxe as rotas.
Yikio.
Ele dá um no point no http config res.
Show bakey.
Trouxe, trouxe, ele trouxe nulo.
Baby, OK, aí ele traz as rule, está vendo?

Jesse Mouta Pereira Batista   45:58
Mhm.

Pablo Leite Costa   45:59
Tá vendo a autenticação, aquele já não traz.

Jesse Mouta Pereira Batista   46:02
E não traz.

Pablo Leite Costa   46:04
Yeah.

Jesse Mouta Pereira Batista   46:04
Entendi, esse é do 64, não do 74, esse aí é 74, não é?

Pablo Leite Costa   46:05
Ele não trouxe o deles.
É, esse é o 64, migração, esse aqui é o 64, aí ele traz, tá vendo?

Jesse Mouta Pereira Batista   46:15
Uh-huh.
Time.
deixa eu ver aqui
Eu pensei numa hipótese que, mas não sei se é viável.
Esse é o esse é o vê lá o do 64 lá, por favor, desculpa o 74 é 74.

Pablo Leite Costa   46:33
Esse é o 6/4.
Eight-clock.
Thank you.

Jesse Mouta Pereira Batista   46:43
Beleza.
deixa eu
Santos Santos.
Que que pode?

Luiz Carlos dos Santos Neto   46:58
Good.

Jesse Mouta Pereira Batista   47:00
Bom dia, tudo bem?

Pablo Leite Costa   47:01
Forum year.

Luiz Carlos dos Santos Neto   47:03
Pablo talvez quem possa ajudar aqui cara tava dando uma olhada aqui é o procote que assim eu parece que o consignado funcionou aqui né
aí assim tem que ver o dele se tá funcionando essas rotas e como é que tá como é que ele fez você pode chamar ele aí que aí talvez ele ele tenha passado por esse problema entendeu

Pablo Leite Costa   47:32
Let me chover com ele aqui.
Mais cara, é, sei, sei, sei.
É porque aqui a gente é um monolítico, sabe? O projeto é dentro do.

Luiz Carlos dos Santos Neto   47:47
Mhm.
Santos.

Pablo Leite Costa   47:53
Mas o back-end e o front-end é tudo dentro do mesmo projeto, do mesmo container, faz um, mas eu vou chamar ele aqui, talvez ele.

Luiz Carlos dos Santos Neto   47:57
Jesse.
No.

Pablo Leite Costa   48:04
Pode.
Fala procote.
Hello.

Edson Prokot   48:36
Olá, Pablo, Tiago Luis, bom dia Jesse Jesse é Jesse ou Jesse?

Pablo Leite Costa   48:37
Okay.

Thiago Jeferson de Sousa Silva   48:39
Onde?

Luiz Carlos dos Santos Neto   48:40
Oh yeah.

Jesse Mouta Pereira Batista   48:40
Bom dia.
Jesse.

Pablo Leite Costa   48:43
O que é esse nome bíblico?

Edson Prokot   48:43
Jesse é beleza.

Jesse Mouta Pereira Batista   48:44
é aqui não tem um afeto aí é

Edson Prokot   48:46
É, o que faltou, a erro do cartório era normal, né?

Pablo Leite Costa   48:48
Yeah.

Jesse Mouta Pereira Batista   48:49
É o do teams aí, não, mas no meu nome tem um assento, porque o que no teams não dá pra colocar.

Pablo Leite Costa   48:51
Yeah.

Edson Prokot   48:55
Thank you, thank you.

Pablo Leite Costa   48:56
Okay.
Procote, a gente está com um probleminha aqui, cara, que é o seguinte, tá? Não sei se você venceu isso ou se o PJ é diferente aí do consignado.

Edson Prokot   49:12
Mm-hmm.

Pablo Leite Costa   49:13
O que acontece é, eu não estou conseguindo trazer as informações aqui na tela inicial.
Do workflow PJ, tá? Ele traz uma lista, a gente faz consulta pelo que está aparecendo aqui, é na hora de fazer identificação do usuário para ele poder trazer as rules, sabe?

Edson Prokot   49:27
Mm-hmm.
Mhm.

Pablo Leite Costa   49:39
Bom, o mesmo pacote lá no 64 ele traz, tá vendo? Ele bate lá dentro do.
ele faz a comunicação né http vamos falar do usuário provider tá ele traz aqui todos os perfis de acesso tá vendo faz a comunicação no perfil de acesso assina e aí ele pega traz as rules tá referente ao usuário autorização

Edson Prokot   50:05
Mm-hmm.

Pablo Leite Costa   50:11
A ação e etc. Aqui ele não tá fazendo isso, tá? Ele bate lá no usuário, tá? Ele tá tendo retorno 200, só que ele não tá trazendo aqui.

Edson Prokot   50:13
Mhm.

Pablo Leite Costa   50:26
É, parece que ele não tá autenticando esse usuário, tá? É porque ele tá trazendo um.
Um objeto vazio não está conseguindo carregar aqui as próprias dele. Cara, não sei se esse problema está dentro da aplicação factor. Você chegou a passar por isso?

Edson Prokot   50:38
Mhm.
Não. Assim tem que ver se não está, se tem que ver se não está, não foi habilitado. O contexto aí do workflow PJ lá no j Boss está incluso certinho lá o caminho dos 2 war aí no workflow PJ é web API.

Pablo Leite Costa   51:06
É, na verdade, os 2 são juntos, tá? Ele é, ele é.

Edson Prokot   51:07
Yeah.

Pablo Leite Costa   51:13
Ele é compactado, ele é zipado todo o contexto lá do front e é carregado lá naquele naquela pasta lá web app.

Edson Prokot   51:25
Está é que aí no workflow ele não tem um é camada API, não é API que é API, é só front, não tem, não consome API do workflow, é só as telas, não é?
Eu não sei, eu nunca estou aí no projeto.

Jesse Mouta Pereira Batista   51:37
Interessante, então, pessoal, mas.

Pablo Leite Costa   51:39
É, na verdade, ele tem as APIs. Atá, você está falando igual do consignado, que é a API a parte. Não é tudo dentro lá. Você tem a API dentro do projeto lá, mas é monolítico, Mano.

Edson Prokot   51:47
Isso.
Tá, entendi.

Pablo Leite Costa   51:57
Yeah.

Edson Prokot   51:57
É, vamos vendo que pode ser problema de autenticação. A primeira coisa que olharia é lá no J Boss. Se o contexto aí do ponto Or do workflow PJ foi incluso lá no é, deixa eu ver qual que é as tags que tem aqui. Deixa eu abrir o meu.

Jesse Mouta Pereira Batista   51:57
You.

Edson Prokot   52:13
Standalone aqui, porque eu precisei fazer isso para o.

Jesse Mouta Pereira Batista   52:14
Yeah.

Edson Prokot   52:18
Para o servidor que eu configurei para rodar o local aqui do 74, eu precisei fazer isso para o módulo tributário lá, sabe que não tinha.
Deixa eu abrir aqui

Jesse Mouta Pereira Batista   52:27
O que eu pensei aqui que a gente pode eliminar aqui é pra ver se o token ele não tá sendo recusado, porque lá o Pablo tava mostrando lá no perfil do 6.4, o perfil acesso usuário, ele devolve as roles do token, que aí eu vi lá, que ele tem o 126 e o 155 lá.
É o número lá, beleza, no 74, ele está devolvendo no antes mesmo da chamada. Ele faz a chamada e já devolve no na verdade, então elas não estão sendo autenticadas pelo keyclock.

Edson Prokot   52:53
Mhm.

Jesse Mouta Pereira Batista   53:02
É, e aí é, eu queria perguntar, Pablo, os readers do dos perfil de acesso do usuário, ele usa o autor, aquele autorization by R usa, não é?

Edson Prokot   53:02
Mhm.

Pablo Leite Costa   53:11
Seeing.
See noising.

Jesse Mouta Pereira Batista   53:15
Beleza, tá? Então é, pode continuar aí o procote, pode olhar, mas eu acabei de ligar o debug aqui pra ver se o token está sendo recusado. Se você conseguir fazer a chamada aí de novo, só pra gente, porque aí a gente já elimina essa.

Pablo Leite Costa   53:28
A.
Claro, então.

Jesse Mouta Pereira Batista   53:32
Essa questão, tá?

Pablo Leite Costa   53:34
chamar aqui de novo aqui

Edson Prokot   53:37
Aqui, vou mandar aqui no chat, esse aqui é o exemplo pro, só pra conferir, né? Vamos por partes, né? Isso aqui é o que eu precisei incluir no JBoss pro módulo tributário.

Jesse Mouta Pereira Batista   53:43
Isso é por uma por vez.

Edson Prokot   53:53
Aí só dá um confere para ver se o contexto do aí do War aí do PJ está no servidor, tem esse security deployment para ele lá.

Pablo Leite Costa   54:07
É, faz sentido, viu?

Luiz Carlos dos Santos Neto   54:11
É, provavelmente não deve ter não, porque a gente foi colocando devagar, então assim é sob demanda.

Edson Prokot   54:15
Da medida sob demanda.

Pablo Leite Costa   54:19
É, não faz sentido.

Edson Prokot   54:21
Aí já dá para dar um confere para ver se inclusive esse do módulo tributário também não está lá, porque ainda acho que não chegaram na parte do módulo tributário. Eu disponibilizei o EAR aí aqui no grupo esses dias, mas eu acho que não foi feito o deployment dele ainda.
Mas aí vai ter que dar um confere para ver se isso é se esse security deployment e consta lá, se não vai ter que incluir também.
No caso aqui são 2, porque é web e API, tem que incluir esses 2. No caso do workflow PJ é um só daí.
So why?

Pablo Leite Costa   54:53
Okay.
pegar aqui o do

Jesse Mouta Pereira Batista   55:50
Então ele precisa procote do Security Deployment, ele precisa dessas três informações aqui né o nome do A, o Hume do SSO, que é o login desse caixa, o client do SIFEC no clay cluck.

Edson Prokot   56:00
Yes.
Uh-huh.
Is.

Jesse Mouta Pereira Batista   56:07
E a senha, né, desse cliente?

Edson Prokot   56:09
Exatamente. É que é tudo meio repetitivo, tudo meio padrão, mas todo o or que a gente publica tem que ter esse cara, porque é esse mecanismo que habilita o QCloak, é a ponte entre aplicação e servidor. É esse mecanismo que vai dizer assim que aquela aplicação está segura pelo QCloak, entendeu?

Jesse Mouta Pereira Batista   56:13
Sim.

Edson Prokot   56:28
Se não habilitar isso, é como se a aplicação não usasse keyclock, aí começa a dar erro, como se não tivesse keyclock na aplicação, sabe? Tudo que foi contexto seguro, nada funciona.

Pablo Leite Costa   56:38
É o meu aqui, eu utilizo, é o subdeployment name, que é o EAR que ele gera.

Edson Prokot   56:48
Aí é diferente, não sei como que é.

Pablo Leite Costa   56:51
É, aqui é o J. Boss, deploitment instructor, o seu é security, não é?

Edson Prokot   56:54
mas isso é na aplicação né mas está falando aplicação aqui a gente tá falando servidor

Jesse Mouta Pereira Batista   56:56
Is.

Edson Prokot   57:00
This configuração can.

Pablo Leite Costa   57:00
No, no.
Here, the play customs there.
Takikasam.

Jesse Mouta Pereira Batista   57:10
Charlie O.K.

Pablo Leite Costa   57:11
Mas ele pega esse nome do EAR gerado, não é esse war dele, não é?

Edson Prokot   57:17
Ele vai pegar o or que está dentro do EAR, que é um pacote dentro do outro. Tem que ver o nome que ele gerou.or aí da web. Qual que é o contexto que ele gera o or que está dentro do EAR, que gera aí no workflow.

Pablo Leite Costa   57:21
Queens.
Fish present.

Edson Prokot   57:37
Isso aí é igual do 63, dá para pegar de lá também, dá para fazer um confere no antigo lá.
É para ter certo lá.

Pablo Leite Costa   57:44
Qual que está lá, porque já pega certo?

Edson Prokot   57:47
É isso aí é o co.

Luiz Carlos dos Santos Neto   57:48
I precised.

Pablo Leite Costa   58:15
É o meu. Eu não precisei de fazer isso. Procote subiu, sabe? Muito estranho. Você jogou esses valores no local?

Luiz Carlos dos Santos Neto   58:19
Yeah.

Jesse Mouta Pereira Batista   58:21
Mm.

Pablo Leite Costa   58:24
Sage and Boss Lock Carl.

Edson Prokot   58:24
Ou se ou de bola 74 que você está usando, você configura do zero ou será que você está usando aquele que eu configurei e compartilharam contigo?

Pablo Leite Costa   58:34
O 7.4

Edson Prokot   58:35
Yeah.

Pablo Leite Costa   58:36
Não, eu peguei o que estava aqui no chat.

Edson Prokot   58:40
É que teve um que eu coloquei no outro chat. Não sei se eles disponibilizaram outro aqui. Não sei como que foi compartilhado. Isso é que o que eu estou usando é um que eu configurei, sabe? Eu joguei num chat aqui. Acho que foram compartilhando, sabe? Talvez eu quase.

Pablo Leite Costa   58:52
Ah, então deve ter sido isso, né?

Edson Prokot   58:54
Tenho quase certeza que você está usando o que eu configurei que eu não fiquei sabendo de nenhum outro que configurou isso, cara.

Pablo Leite Costa   58:56
Yeah.
Eu não duvido não.

Edson Prokot   59:02
Mas provavelmente eu inclui lá já, sabe? Porque eu copiei do 63, copiei e colei, sabe? No 63, acho que já tinha. Deixa eu dar um confere aqui no standalone meu aqui para ver se está aqui.

Pablo Leite Costa   59:08
Uh-huh.

Jesse Mouta Pereira Batista   59:12
É procote, mas é isso mesmo. O que acontece? O cadastro do PJ no click cluck, ele tá igual a esse modelo mesmo que você falou. Ele tem o Wim internet, o client clear webfac, ele tem o mesmo secret, o SSL external, o CCR, que também é outro contexto, ele funciona como esse mesmo tipo de cadastro aqui.

Edson Prokot   59:25
Mhm.

Jesse Mouta Pereira Batista   59:30
Então pode ser que a diferença possa estar como o front do PJ manda esse login para API.

Edson Prokot   59:37
Sim, é, ele já é um problema novo, né?

Jesse Mouta Pereira Batista   59:39
É.

Edson Prokot   59:41
Inclusive, eu não tenho o contexto do PJ aqui no meu, no meu J-Boss.

Jesse Mouta Pereira Batista   59:42
What up?
No, no, no, no.

Edson Prokot   59:47
É no meu, eu não tenho ele.
Deveria precisar, deveria ser necessário, sem ele não faz sentido.

Jesse Mouta Pereira Batista   59:53
T.
Bora ver aqui.

Edson Prokot   1:00:02
É aí já vamos para um problema que provavelmente é algo na aplicação.
Aí configuração de servidor que precisa é isso aí, agora a gente já vai para. É um problema novo mesmo.

Jesse Mouta Pereira Batista   1:00:15
Yeah.
Verificar.
Thank you.

Luiz Carlos dos Santos Neto   1:02:32
Olhando aqui no.
O profile do 6 do 6 4 ele tem, vou mostrar a tela aqui.

Jesse Mouta Pereira Batista   1:02:43
No.

Luiz Carlos dos Santos Neto   1:02:45
Mm-hmm.
baixei o profile do 64 e ele tem isso daqui ou talvez seja isso o pacote
Será que ele tem aí esse daqui ou?
Serre parâmetro.

Edson Prokot   1:03:00
É, esse é o do parâmetros, velho, tem que ter um desse, só que pro flow PJ, né?

Luiz Carlos dos Santos Neto   1:03:06
R PJ.

Edson Prokot   1:03:06
É esse CR PJ, eu acho. Eu acho que esse é o contexto dele, né? Se SR traço PJ PJ, se eu não me engano.

Luiz Carlos dos Santos Neto   1:03:27
But

Edson Prokot   1:03:30
Esse é rpj4 estranho

Luiz Carlos dos Santos Neto   1:03:33
Mm-hmm.

Pablo Leite Costa   1:03:36
He said he's work for crash PJ.
Mas a Itaú é a R, né?

Edson Prokot   1:03:43
Aí é o deployment, né?

Luiz Carlos dos Santos Neto   1:03:44
Okay, there is that deployment.

Pablo Leite Costa   1:03:45
Isso, pega, pega o workflow, procura por workflow.
Walk flow.
Is.
Call Scarry.

Edson Prokot   1:04:03
É isso aí. Esse não tem no meu 74 não, viu? No meu não tem esse aí.

Pablo Leite Costa   1:04:16
esse cara tá lá Jesse configurado

Luiz Carlos dos Santos Neto   1:04:17
Pedastic emiss, then.

Jesse Mouta Pereira Batista   1:04:20
Não entendi.

Pablo Leite Costa   1:04:21
Esse cara está configurado no 74.

Jesse Mouta Pereira Batista   1:04:25
Sim.

Luiz Carlos dos Santos Neto   1:04:28
Anything?

Jesse Mouta Pereira Batista   1:04:33
Deixa eu confirmar aqui rapidinho
Esse aqui né, Luis Carlos mandou né?

Luiz Carlos dos Santos Neto   1:04:54
Is that?

Jesse Mouta Pereira Batista   1:04:55
Tá, deixa eu dar uma olhada aqui só um minutinho.
PJ, gente, só um minutinho.
Bom, vamos lá pessoal, no PJ do 74 tem exatamente a mesma coisa, né? Que que eu vi aqui, ele tem os atributos, o Helmet, o intranet, tá? O resourcer, clearwebfac, tá igual, tá?
O secret é o mesmo, o 36 a tal. Não vou falar o restante, beleza? O SSL recovery é o western, não é o mesmo. O Bernardo está false, está igual. O token store está é um definit.
Beleza, mesma coisa e o auto server URL também tem o mesmo, ele herda do do Realme, então tá igual no PJ 74 está com o mesmo cadastro, né? O Realme Internet, a mesma secret, as mesmas coisas, então no 64.
Tá, pera aí, mas a API do PJ, ele recebe só o Jesse é um ID, né? Sem token.

Pablo Leite Costa   1:08:40
Ele pega autenticação do hacker, né?

Jesse Mouta Pereira Batista   1:08:43
Cifec, entendi.

Pablo Leite Costa   1:08:45
Pereira, não tem que ficar só um discreto.

Jesse Mouta Pereira Batista   1:08:48
Deixa eu dar uma olhada aqui, então só para mim conferir aqui no.
No 471.
É, será se lá no standalone XML ou no doming XML é existe um SSO dentro do virtual server?

Pablo Leite Costa   1:09:10
Sure waiting.

Jesse Mouta Pereira Batista   1:09:17
Dá uma olhada aí pra gente, deixa eu ver comentar o profile dele aqui.

Pablo Leite Costa   1:09:24
Sim, pega o SSO.
Ele pega do Clissé facweb.

Jesse Mouta Pereira Batista   1:09:36
Está, você consegue mandar aqui na sala só para mim dar uma olhada?

Pablo Leite Costa   1:09:40
See you.

Jesse Mouta Pereira Batista   1:10:18
Beleza.
Valeu.

Pablo Leite Costa   1:10:22
For me.

Jesse Mouta Pereira Batista   1:10:23
Agora, ok, deixa eu dar uma olhada aqui, só fazer uma comparação rapidinho.
É, ele tem o que o http em volta.
Essas aqui são credenciais de um cliente de um client de serviço, não é Pablo?

Pablo Leite Costa   1:11:24
É, e é o que é utilizado aqui dentro. A gente chama essas credenciais ali.

Jesse Mouta Pereira Batista   1:11:30
Mhm.
Ele tem a do.
Ele tem o SSO em Intranet Service Resource Name e o SSO Internet Service Secret.
A resource name e o service secret.

Pablo Leite Costa   1:12:01
So, this is Luis get to mandar you, he searched an agent.

Jesse Mouta Pereira Batista   1:12:03
Essas 2, não é? E aham, isso está, deixa eu confirmar aqui.
Mm.
Deixa eu ver, deixa eu ver se eu consigo confirmar aqui rapidinho.
Eu acho que eu acho que eles estão faltando essas propriedades aqui, cara, essas 2.
Deixa eu, deixa eu só consultar aqui, se realmente estiver faltando, aí a gente cria elas aqui, faz teste.

Pablo Leite Costa   1:12:42
Mhm.

Jesse Mouta Pereira Batista   1:12:46
Gonna be aqui rapidinho.

Pablo Leite Costa   1:12:51
O procote eu tinha criado aqui, eu que tinha esquecido.

Jesse Mouta Pereira Batista   1:12:52
Santos.

Edson Prokot   1:12:55
Você criou, tá? Eu olhei aqui, não tinha, falei, ué, rapaz, que eu sou bem assim, eu sou.

Pablo Leite Costa   1:12:57
Eu tinha criado, eu até eu até abri aqui para conferir.

Edson Prokot   1:13:03
Entendi. Sou bem sincera de dizer desses longos anos, essa indústria vital, cara, eu nunca precisei rodar o projeto do PJ e olha que eu estou desde 2018. Eu conheço, já me pediram ajuda, já vi.
Mas eu nunca precisei fazer uma vírgula de código no projeto do PJ.

Pablo Leite Costa   1:13:24
Ei, passou por tudo, não é, propósito?

Edson Prokot   1:13:26
Por tudo. PJ já ajudei já algumas coisas. Os projetos são parecidos, mas se precisar fazer alguma demanda atuado nele desde 2018, nunca precisei.

Pablo Leite Costa   1:13:39
Eu, graças a Deus, estagnei aqui.

Edson Prokot   1:13:42
A F2A.

Jesse Mouta Pereira Batista   1:13:42
É pessoal, as propriedades aqui do CCR, elas existem no servergroup e as do cifec PJ, elas não está aqui. Eu vou criar elas no mesmo lugar aqui, da mesma forma como está no servergroup, está?

Pablo Leite Costa   1:13:57
Done.

Jesse Mouta Pereira Batista   1:13:58
E a gente roda, eu vou fazer o vou precisar fazer o restart, a gente valida aqui e faz o teste novamente.
Só um minutinho.

Pablo Leite Costa   1:14:14
Por desencargo de consciência, eu pedi para um colega meu geral build do front, tá? Para ver se tem alguma coisa.

Jesse Mouta Pereira Batista   1:14:20
Ah, sim, show.

Pablo Leite Costa   1:14:21
E aí eu vou te passar um novo EAR com tudo com tudo de errado

Jesse Mouta Pereira Batista   1:14:26
Beleza.

Edson Prokot   1:14:28
Para testar aqui, o que eu aconselho? Dá para fazer o seguinte, pega no console do browser as chamadas que geraram erro, copia ela e chama direto no browser, sabe? Porque a regra é o seguinte, uma chamada que é um recurso protegido.

Jesse Mouta Pereira Batista   1:14:37
Mm-hmm.

Edson Prokot   1:14:44
Ela tem que redirecionar para a página de autenticação. Um recurso, uma chamada, por exemplo, lá a página do swagger, algo assim, que é público, você tem que bater ele e abrir e não redireciona para a autenticação. Inclusive, se abrir uma guia anônima sem autenticação, eu normalmente faço esse teste, sabe?

Jesse Mouta Pereira Batista   1:14:57
Uh-huh.

Edson Prokot   1:15:01
Acho que fica mais fácil para testar. Você copia lá a URL lá, sei lá o JavaScript, qual o contexto lá que gerou o erro? Fica mais fácil. Aí dá para fazer um teste, abre no 74 e abre outra aba, outra.

Jesse Mouta Pereira Batista   1:15:01
Century.
Beleza.
Mhm.

Edson Prokot   1:15:16
Outro browser no 63 e ver os comportamentos do 64, ver o comportamento dos 2, como que é para fazer uma comparação?

Jesse Mouta Pereira Batista   1:15:21
Mhm.
Uh-huh.

Pablo Leite Costa   1:15:31
Oliveira.

Jesse Mouta Pereira Batista   1:15:33
Wait, I
Eu estou, estou reiniciando aqui, está pessoal? Vamos esperar uns 2 minutinhos.
logo em seguida a gente já vê se ele tá rodando já
Thanks.

Pablo Leite Costa   1:16:33
rapaz aqui tá ventando e inventando com força mesmo

Jesse Mouta Pereira Batista   1:16:38
Mm.

Pablo Leite Costa   1:16:39
Sit that doing.

Jesse Mouta Pereira Batista   1:16:44
É de Brasília?

Pablo Leite Costa   1:16:46
Não, cara, eu sou de Minas.
Mas eu mudei para Bahia.
Estou morando na Bahia agora.

Jesse Mouta Pereira Batista   1:16:56
Mhm.

Pablo Leite Costa   1:17:03
por ano em Prado na Bahia
5 minutinhos da praia.
A pain.

Jesse Mouta Pereira Batista   1:17:34
Should I done a look aqui?

Pablo Leite Costa   1:17:51
Santos Junior.

Jesse Mouta Pereira Batista   1:17:53
Subiu, eu testei aqui. Testei novamente. Estou rodando. Espera aí, só rapidinho, só colocar a captura.

Pablo Leite Costa   1:18:00
Claro.
O dece é quadro.

Jesse Mouta Pereira Batista   1:18:40
Deixa eu pera aí que eu vou ter que fazer um ajuste aqui de novo
Vou ter que fazer um novo reset aqui, está pessoal? Eu coloquei o valor errado aqui.
Ainda bem que eu olhei antes, beleza, aa

Edson Prokot   1:18:56
Hello.

Jesse Mouta Pereira Batista   1:19:06
beleza deixa eu conferir agora se ele trouxe
Show, beleza, eu tinha o secret lá eu tinha colocado.
Faltou um pedaço dele aqui dar um novo restante tá

Pablo Leite Costa   1:19:22
Vou desligar aqui um novo R, está? Vamos testar com esse.

Jesse Mouta Pereira Batista   1:19:25
Ah.
Beleza, a gente está se conhece, depois a gente sobe esse novo.

Pablo Leite Costa   1:19:30
Mhm.

Thiago Jeferson de Sousa Silva   1:19:31
Java Bashan's your repeats.

Jesse Mouta Pereira Batista   1:19:31
Estou restartando aqui. Isso já baixa aí, Jefferson, por favor.
deixa ele no ponto aí para a gente testar ele
Beleza, Pablo, teste aí, por gentileza.

Edson Prokot   1:20:40
They start to happen, you know, happens.

Jesse Mouta Pereira Batista   1:20:42
Yeah.

Pablo Leite Costa   1:20:42
One minute.

Edson Prokot   1:20:43
Antigo rapaz, era meia hora.

Pablo Leite Costa   1:20:44
Vidya Kya Mata.

Jesse Mouta Pereira Batista   1:20:46
Oh.
Faz o login de novo, só pra gente poder acompanhar.
Dá um trabalho para você ir.

Pablo Leite Costa   1:20:55
Hey.

Jesse Mouta Pereira Batista   1:20:59
Sandy Live Entrevistas Ring.

Pablo Leite Costa   1:21:19
For now.
O cliente dashboard.
Tornou 200, não trouxe a lista.

Jesse Mouta Pereira Batista   1:21:38
Nenhum registro.

Edson Prokot   1:21:44
Santos.

Jesse Mouta Pereira Batista   1:21:46
É.

Pablo Leite Costa   1:21:47
Isso aí sim, aí.

Luiz Carlos dos Santos Neto   1:21:47
O erro, o erro continua sendo o mesmo.

Pablo Leite Costa   1:21:51
Aí o que que acontece se eu consultar aqui?
Aqui no CNPJ fazer a consulta.
Ele me trouxe esse cara.
Base got a kill.

Edson Prokot   1:22:16
Será que não é problema Oracle?
Dá 200 princípio autenticação, autorização, tudo OK, mas não traz resultado, não é?

Pablo Leite Costa   1:22:32
Aqui está trazendo para os gente.

Edson Prokot   1:22:32
Você precisa fazer o você precisa fazer o upgrade da versão do Hibernate aí no precisou 53, não é?

Jesse Mouta Pereira Batista   1:22:38
Preciso, sim.

Edson Prokot   1:22:40
Dah, beleza.

Jesse Mouta Pereira Batista   1:22:42
Foi uma das primeiras coisas lá que a gente fez, que ele estava rejeitando o pacote.

Pablo Leite Costa   1:22:59
That's why I assume you.

Edson Prokot   1:23:02
É, tem que ver logo, isso daqui tem algum rastro que é assim.

Jesse Mouta Pereira Batista   1:23:05
É, o problema é que o log, o log também ele não.
Deixa eu ver aqui se eu consigo ativar um de data aqui pra gente

Pablo Leite Costa   1:24:06
Para sabe que ele não está trazendo?
Pegue esse novo a R AG e sobe here.

Jesse Mouta Pereira Batista   1:24:46
Pode ser. Sobe, sobe ele aí, Tiago. Deixa eu. Deixa eu te perguntar uma coisa aqui, pô, que eu pensei aqui, não sei se pode fazer sentido. O PJ.
Ele leu o SSO Intranet Service de source name e o SSO Intranet Service Secret. Ele lê esse cara consistem get properties ou consist get envy.

Pablo Leite Costa   1:25:11
Aren't the system gauge property?

Jesse Mouta Pereira Batista   1:25:14
Yeah.
Tá, beleza, mas lá no 64, você sabe se ele fica no standalone.conf ou no script de start como export?

Pablo Leite Costa   1:25:28
No, era lá no stage alone, né? Ele leave pela property dela lá.

Jesse Mouta Pereira Batista   1:25:30
O instante alone, tá?
Town.

Edson Prokot   1:25:40
Pessoal vai ter que sair para almoçar, acho que o que eu podia ajudar por hora era isso. É que eu falei, workflow eu não é assim, servidor parece a princípio, depois da inclusão das properties, não dá erro ali no front, né? Aí tem que ver se o log deixa algum raspo, ele tá retornando 200, não tá encontrando.

Pablo Leite Costa   1:25:44
É, valeu o pacote.

Jesse Mouta Pereira Batista   1:25:45
Valeu, Carol.
Okay.

Edson Prokot   1:26:00
O.

Jesse Mouta Pereira Batista   1:26:01
Yeah.

Edson Prokot   1:26:01
É, não tá encontrando resultados, né? Aí tem que ver a jornada aí do workflow para tentar descobrir.

Jesse Mouta Pereira Batista   1:26:08
Sing.
Beleza, Valeu! Dá uma olhada aqui, valeu, até mais.

Edson Prokot   1:26:12
Beleza, follow pessoal, to mice.

Pablo Leite Costa   1:26:13
Valeu, valeu.

Luiz Carlos dos Santos Neto   1:26:14
Santos.

Jesse Mouta Pereira Batista   1:26:16
Deixa eu olhar aqui o log aqui e ver se ele.

Thiago Jeferson de Sousa Silva   1:26:18
Vocês vão querer que eu faça o deploy desse novo pacote?

Jesse Mouta Pereira Batista   1:26:21
Pode fazer, pode fazer Pablo.

Pablo Leite Costa   1:26:25
Pode, pode fazer esse último aí.

Thiago Jeferson de Sousa Silva   1:26:27
So, I'll have it aqui.

Pablo Leite Costa   1:26:33
Arm
É se ele não tivesse recuperando o usuário.
Ele darem um acesso negado em alguma coisa assim.

Jesse Mouta Pereira Batista   1:26:50
É porque eu perguntei isso porque só pra tirar certeza do jeito que a gente criou aqui, tá certo. O menos dele no standalone.conf do 6.4, ele equivale ao system properties lá do server group no 74.
Agora a gente tem que descobrir se essas props, se elas chegam mesmo é mesmo a um processo 64, ou se ela tem mais props no Stand Alone que a gente não trouxe para cá.

Pablo Leite Costa   1:27:14
Por não ter trago essa, eu vou até pegar todas aqui que a gente trabalha.

Jesse Mouta Pereira Batista   1:27:19
O problema é que o log aqui ele não mostra nenhum erro cara
E o 473.
Passubina in a Gers.
Of pacote.

Thiago Jeferson de Sousa Silva   1:28:25
O TNP e o data, primeiro plano passos isso.

Jesse Mouta Pereira Batista   1:28:33
Believe.

Pablo Leite Costa   1:28:38
Okay.
Você inclui esse daqui também?
Please, can you add it back?

Jesse Mouta Pereira Batista   1:29:16
Clima webfack sim tá vamos lá porque eu tava tava pensando aqui o que acontece as duas próprias do SSO elas estão aplicadas e o server foi reiniciado e a API ela continua voltando 200 vazia sem erro no log no log não tem nada

Pablo Leite Costa   1:29:17
Somebody.

Jesse Mouta Pereira Batista   1:29:33
Na subida do PJ, ele apareceu lá aquele, ele apareceu um erro lá do erro não, desculpa, tem um weld na verdade do type, né BR Caixa, arch ref, business.
Consulta contratos ponto service cara, é o EAR. Ele referencia interfaces do arquiref, certo? Consulta contratos.

Pablo Leite Costa   1:29:59
So.
Same.

Jesse Mouta Pereira Batista   1:30:01
certo elas não estão elas não estão no class path do 74. Agora a pergunta lá no 64, de onde vem esse jar? Ele vem de um módulo de jboys modules barra alguma coisa ou de um jar tipo por exemplo uma lab
Barra XT ou um global né tipo ou dentro de um EAR né aqui ref service por exemplo né se ele for módulo você consegue me passar o nome desse desse módulo se ele tá no módulo XML

Pablo Leite Costa   1:30:22
O.

Jesse Mouta Pereira Batista   1:30:35
Que aí a gente cria aqui, ou se for outro deploy de um outro pacote, eu acho que o problema pode ser isso.

Pablo Leite Costa   1:30:40
Okay.

Jesse Mouta Pereira Batista   1:30:42
módulo módulo ponto XML, esse arch ref service.
De onde que ele vem no 64? É uma dependência, né?

Pablo Leite Costa   1:30:49
Ele é uma dependência, tá vendo?
Mm.
I can have poor, I can have sex, correct?

Jesse Mouta Pereira Batista   1:30:59
isso me manda ele aqui para mim dar uma olhada

Thiago Jeferson de Sousa Silva   1:31:04
Okay.

Jesse Mouta Pereira Batista   1:31:06
Beleza.

Pablo Leite Costa   1:31:10
Qual que é a versão que está aqui?
É a 3.26.1, você quer o jar dela?

Jesse Mouta Pereira Batista   1:31:24
Pode say.
Se quiser mandar só o que o conteúdo também fica fica mais fácil.

Pablo Leite Costa   1:31:26
E a imagem.
pegar ela aqui

Jesse Mouta Pereira Batista   1:31:33
No.

Pablo Leite Costa   1:31:34
Ela está lindo de bog bang caixa.
Okay.
Okay.
Becky.
Componente.
Integrações.
Give me a movie.

Jesse Mouta Pereira Batista   1:32:09
Oh.

Pablo Leite Costa   1:32:21
Santos.
Okay.
pegar aquele direitinho vou pegar do po
Muito valio.
Santos Bernardo.
Eight.
Mine episode, wait.
Or you.
Forum Santos.
Ele é um se perto, não, eles tem que pegar dentro do homem.
For that to be it.
Okay.
Have the guiding feeling from music from here.
Okay.
Santos.
Yeah.
Again, think.
Santos.
Okay.

Jesse Mouta Pereira Batista   1:33:56
Okay.

Pablo Leite Costa   1:33:57
Seven.
Sandy.
Sorry.
Okay.
Santos Jibet Mouta.
Então, 6.
So.
Okay.
Okay.
Really?

Thiago Jeferson de Sousa Silva   1:34:59
Subiu, olha só.

Pablo Leite Costa   1:35:01
LD.

Jesse Mouta Pereira Batista   1:35:01
Okay.

Pablo Leite Costa   1:35:03
Você quer work have service, né?

Jesse Mouta Pereira Batista   1:35:06
Isso.

Pablo Leite Costa   1:35:10
Okay.
Pardon.
Selo de pontos banana projetos
So.
Banks.
Sure.
Renato.
Be home, have to have sex?

Jesse Mouta Pereira Batista   1:35:51
Bill news.

Pablo Leite Costa   1:36:08
Tell me the dance.
It's all.
Dana Mouta.

Jesse Mouta Pereira Batista   1:36:18
Beleza.
Que.
Oh.
We just just subiu, you have some test star.

Pablo Leite Costa   1:36:33
deixa eu ver.

Jesse Mouta Pereira Batista   1:36:33
Estou sem autorização aqui para baixar.

Pablo Leite Costa   1:36:36
Oxe.
Okay.

Jesse Mouta Pereira Batista   1:36:40
Ah não, baixou, baixou, tá vindo, valeu.

Pablo Leite Costa   1:36:41
So.

Jesse Mouta Pereira Batista   1:36:43
No.

Pablo Leite Costa   1:36:45
Okay.
Minha.
Deu uma quebrada louca.

Jesse Mouta Pereira Batista   1:36:53
Cara, ele subiu aqui com um Monte de erro, não é? Acabei de a ele.
404 404.

Pablo Leite Costa   1:37:02
He said.

Jesse Mouta Pereira Batista   1:37:04
é esse aí que o Jeff subiu agora

Pablo Leite Costa   1:37:07
Oh, cool.
Being you for me to be child.
Para poder ir certinho.
Okay.
Okay.
Cara só fez o build.

Jesse Mouta Pereira Batista   1:38:03
Ah, ele só fez, só fez o beat.

Pablo Leite Costa   1:38:11
Thank you.
A feel being the phone in 5 minutes.
It fez o deploy com sucesso.
Can you spare?

Jesse Mouta Pereira Batista   1:38:35
Ixi, parece que ele perdeu os arquivos estáticos aqui. Oh, todos os CSS e os GS estão dando no such file exception.
A pasta do facweb sumiu, viu?
Aí ela vai abrir sem estilo, sem script, nada aí.
E reimplanta ele de novo, Jefferson.
Ah não, tem que replantar o Sifec nesse caso, não o CCR.
Deixa eu, segura aí, deixa eu tentar corrigir ele aqui para ver.
rapidinho deixa eu ver se eu consigo só reimplantar ele aqui acho que já resolve esse problema
Rapido.
Vou entrar aqui no 471. Opa.
Fazer o re deploy aqui, tá gente?

Pablo Leite Costa   1:39:53
Jesse, desculpa, cara, eu tive que atender uma ligação urgente aqui, é?

Jesse Mouta Pereira Batista   1:39:54
Okay.

Pablo Leite Costa   1:39:58
Say identificou muchili.

Jesse Mouta Pereira Batista   1:40:00
É, não é. Ele parece que o PJ novo, ele subiu, é, mas ele apareceu esse novo problema aqui. O facweb parece que ele perdeu os arquivos estáticos, todos os arquivos CSS e o JS, eles estão dando.
No site file exception é, parece que a pasta, a pasta do do fake web ela sumiu, provavelmente durante a troca do PJ aqui. Eu vou só fazer o redeploy aqui do cifac, acho que resolve, tá? Já tô até fazendo.

Pablo Leite Costa   1:40:29
Tá.
Santos.
Eu não preciso de mexer no commit dele não, não é?

Jesse Mouta Pereira Batista   1:40:36
Não, não, não, não.
Eu acho que só fazendo redeploy do Sifec aqui já resolve.
Não sei, fecha, vem, carrega aí de novo, por gentileza.

Pablo Leite Costa   1:40:56
O.

Jesse Mouta Pereira Batista   1:40:56
Ah, pronto, foi.
É só uma incompatibilidade aqui mesmo.
Vamos esperar o que dessa consulta aí agora? Um retorno?

Pablo Leite Costa   1:41:13
Tá, eu já tô com fome.

Jesse Mouta Pereira Batista   1:41:14
Meu Deus, cara, eu também.

Pablo Leite Costa   1:41:17
Senão a gente para agora e volta.

Jesse Mouta Pereira Batista   1:41:18
É, não pare, a gente retorna as 2, nenhum registro.

Pablo Leite Costa   1:41:21
Beleza, não tem problema, né? Aí a gente

Jesse Mouta Pereira Batista   1:41:25
É.

Pablo Leite Costa   1:41:32
Also.

Jesse Mouta Pereira Batista   1:41:32
Como é que o Pablo? Desculpa aí, como é que é o nome desse desse app que vocês usem para poder registrar os as cópias?

Pablo Leite Costa   1:41:42
Do componente.

Jesse Mouta Pereira Batista   1:41:42
É o próprio do Windows? É.
É esse aí agora que você copiou o CNPJ é do próprio Windows, ele ou.

Pablo Leite Costa   1:41:45
Mhm.
Ah, tá, é do Windows, o histórico, né?

Jesse Mouta Pereira Batista   1:41:52
isso emojis ah sim emojis demais ah sim beleza beleza eu achei que vocês usavam algum outro aplicativo

Pablo Leite Costa   1:41:53
Histórico de Pontor C é.
Não.
Cara, o banco você está apontando para qual banco?
O mesmo.

Jesse Mouta Pereira Batista   1:42:07
Boa pergunta, deixa eu olhar aqui.

Pablo Leite Costa   1:42:12
Por que faz a migração de dados para banco, essas coisas?

Jesse Mouta Pereira Batista   1:42:18
Pá, sim, aqui deu zero, tá?
Tá esse arquivo eles esse service revice no 6.4 ele no 6.4 ele é implantado como deploy separado no mesmo server ou ele fica no mesmo módulo?
Barra ali barra do jboys pergunto porque se for deploy separado, o PJ precisa enxergar o deployment dele na dependência lá deployment de arquivos as service.

Pablo Leite Costa   1:42:56
Tá, vamos lá. Esse Arch Rev Service é um componente, tá? Ele que é do cifec.

Jesse Mouta Pereira Batista   1:43:01
Não componente.

Pablo Leite Costa   1:43:04
Ele entra dentro do próprio, do próprio EAR, ele é uma dependência do pacote.
Então, assim, a aplicação utiliza as funcionalidades dele dentro do próprio pacote AR.
Tá, então assim, é um projeto externo, é um projeto externo, tá, que ele é baixado como a dependência dentro do pacote.

Jesse Mouta Pereira Batista   1:43:23
Entendi.
No.
Beleza.

Pablo Leite Costa   1:43:42
Agora, pois é, eu até pensei que poderia ser.

Jesse Mouta Pereira Batista   1:43:42
Okay.
Mike Carol.

Pablo Leite Costa   1:43:49
Or there he is face.

Jesse Mouta Pereira Batista   1:43:52
Então ele é uma dependência do Maven que vai dentro do EAR e do PJ, não algo para criarmos no jboys aqui.

Pablo Leite Costa   1:43:56
Be selected in.
Dashboard.
Hello.
Page, trust me a noose.

Jesse Mouta Pereira Batista   1:44:12
Tá, eu vou, eu vou abrir esse cara aqui.
Ó, eu entendi que esse archive service ele vai dentro do no log da subida, só que no log da subida lá ele aparece um de 00119 e aí ele fala o sifbn J B service e o siban.
É JB service arquivos service, não, ele não consegue carregar essa consulta contratos aqui.
Essa interface, cara, não acho que não é isso.
deixa eu pensar aqui em hora o vento.

Luiz Carlos dos Santos Neto   1:44:49
É só porque está assim o projeto do Siban, mas isso aí não dá, daria erro não.

Jesse Mouta Pereira Batista   1:44:54
É exatamente, é porque esse weld, ele é só um aviso e ele fala de contratos, então pode ser que nem tenha relação com o perfil de acesso do usuário, por isso que, enfim.

Pablo Leite Costa   1:44:58
Yeah.

Luiz Carlos dos Santos Neto   1:44:59
Uh-huh.
É porque são vários sistemas aí, o aí o siban pode não subir também e ele não daria erro não, só daria esse aviso mesmo.

Jesse Mouta Pereira Batista   1:45:14
Uhum, tá, não, pessoal, então é isso. Acho que a gente pode almoçar agora que a fome já bateu, né, Pablo? E.

Pablo Leite Costa   1:45:20
É, vamos almoçar, aí eu volto aqui, a gente faz uma análise melhor.

Jesse Mouta Pereira Batista   1:45:22
É.
Eu vou, é, beleza, eu vou abrir esse já aqui que você me mandou, vou ver o que tem dentro dele aqui, eu vou fazer comparação, tá? Quando retornar, e aí a gente retoma aqui na sala aqui. O bom é que agora a gente, como a gente tem um usuário de teste aqui, dá para a gente ir.

Pablo Leite Costa   1:45:35
Time.

Jesse Mouta Pereira Batista   1:45:39
E fazendo uns testes aí, vocês podem ir tocando outras coisas e a gente chama aqui na sala aqui quando a gente vê alguma novidade, vocês podem chamar também, está?

Pablo Leite Costa   1:45:46
É alguma coisa minuciosa nessa configuração. Por quê? Porque se não sei se está funcionando em algum detalhe.

Thiago Jeferson de Sousa Silva   1:45:47
Pablo, só vou pedir uma coisa para você, Pablo.

Jesse Mouta Pereira Batista   1:45:49
É, cara.
Sim, algum detalhezinho. O Jesse falou alguma coisa, não deu pra ouvir Jesse tá um pouco baixo.

Thiago Jeferson de Sousa Silva   1:45:59
Pablo é só pode se você podia colocar esse CNPJ também para a gente já fazer o teste também caso a gente vai fazendo esses testes aqui né?

Jesse Mouta Pereira Batista   1:46:05
Ah, sim.
Boa.
Miss.
Cola ele na sala aí?
a gente poder

Pablo Leite Costa   1:46:18
Vou pegar um outro aqui também que a gente usa muito.

Jesse Mouta Pereira Batista   1:46:21
Beleza.

Pablo Leite Costa   1:46:23
I have a call currently.

Jesse Mouta Pereira Batista   1:46:25
Show.

Pablo Leite Costa   1:46:27
Beleza pessoal, qualquer coisa tamo aí tá?

Jesse Mouta Pereira Batista   1:46:28
Beleza, brigado viu Pablo? Valeu, valeu, até as doze.

Thiago Jeferson de Sousa Silva   1:46:30
Test dust.

Luiz Carlos dos Santos Neto   1:46:31
Call Lazy to us.

Pablo Leite Costa   1:46:32
Valeu.

Jesse Mouta Pereira Batista parou a transcrição
