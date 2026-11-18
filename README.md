Chamada com Fabio e 1 outra pessoa-20261118_112020-Transcrição da Reunião
18 de novembro de 2026, 02:20PM
26m 42s

Thiago Jeferson de Sousa Silva começou a transcrição

Fabio Pereira Siqueira   0:03
erro de módulo. Então eu ia começar a verificar quais foram as alterações que vocês fizeram na frente de vocês para gerar aquele erro, que até então não estava com erro no meio, na compilação.

Jesse Mouta Pereira Batista   0:15
Mm-hmm. Mm-hmm.

Fabio Pereira Siqueira   0:17
É, e aí eu era isso que eu queria ver com vocês, assim, vocês é.
O que vocês estão fazendo está sendo necessário para estar mexendo nos módulos que até então era só na parte de Boss, não é?

Jesse Mouta Pereira Batista   0:30
Tá, deixa eu, deixa eu só explicar aqui a questão do online do batch que eu te falei. O que acontece aqui na release aqui ele tinha um, deixa ele carregar aqui.

Fabio Pereira Siqueira   0:35
Stop.
Não, se você quiser usar minha release até pra explicar porque o código já tá lá.
Desculpa minha frente.

Jesse Mouta Pereira Batista   0:48
Tá, não, beleza, mas a questão, a questão é que assim é do online. Eu fiz a brand csti porque tinha vários erros no código e aí foram aju. Eu fiz os ajustes pra poder passar.
na cobertura não tinha cobertura de teste certo

Fabio Pereira Siqueira   1:06
Ah, então esse era o ponto, esse era o ponto. A cobertura de teste a gente não ia fazer agora. Inclusive o Jander ia fazer uma solicitação aí para a gente ter um espaço aí para que a gente pudesse desenvolver os testes unitários.

Jesse Mouta Pereira Batista   1:09
Ease.
Mm.

Fabio Pereira Siqueira   1:22
Se você não desligar o teste realmente não vai passar não.

Jesse Mouta Pereira Batista   1:23
Entendi é.
Então aí como como a esteira está configurada para ter teste, aí a gente foi resolver os testes para poder o build subir lá na frente da esteira está resolvido tanto do.

Fabio Pereira Siqueira   1:29
Isso.
E Maria, bicho, tu tá enrolado se for fazer isso.

Jesse Mouta Pereira Batista   1:37
é cara não mas já foi já foi feito já corrigi cara já corrigi lá na CSTI cara o negócio tá lento aqui meu Deus deixa eu deixa eu pegar outro aqui

Fabio Pereira Siqueira   1:41
Uh-huh. Uh-huh.
Okay.

Thiago Jeferson de Sousa Silva   1:45
Tropical navegador.

Jesse Mouta Pereira Batista   1:47
É, acho que pegou outro navegador aqui. O que eu tava te explicando.

Fabio Pereira Siqueira   1:49
É que eu ia sugerir desligar o teste por enquanto, porque o nosso foco era subir de voz, né?

Jesse Mouta Pereira Batista   1:54
Uh-huh.

Thiago Jeferson de Sousa Silva   1:55
Os J-boys já estão em pé. É isso que a gente está tentando saber. Então, os J-boys estão em pé. O que a gente está tentando resolver é a questão que, assim, falta algumas dependências no pacote, a gente está tentando ver onde diversas referências.

Fabio Pereira Siqueira   1:55
É sugerido jogar o teste.
John.

Jesse Mouta Pereira Batista   2:01
É, os de Oliveira, os 2 estão em pé.

Fabio Pereira Siqueira   2:01
Mhm.
Então, esse era o ponto, porque localmente.

Thiago Jeferson de Sousa Silva   2:12
Sim, tanto, tanto J-Boys, tanto J-Boys, tanto Stand Alone, tanto de pé.

Fabio Pereira Siqueira   2:18
Tá, vamos lá. Localmente eu não estou tendo problema nessa compilação, tá? Então o que eu entendo que subindo para DevOps, a gente teria que resolver essas questões. E aí por que eu falo isso? Por exemplo, tinha uma dependência que a gente usava que era o Serv Framework, aí eu vi lá que vocês renumeraram para Framework.

Thiago Jeferson de Sousa Silva   2:19
O.

Fabio Pereira Siqueira   2:37
Essa dependência no next que a gente tem aqui, que a gente tá usando, a gente não acha esse cara.
Enfim, eu vi que vocês fizeram e confirmou. Eu quero saber a aplicação quando ela for rodar.
É, eu vi também que vocês, quando vocês subiram online, online tinha, como eu tava focando no batch, o online lá no dedo no de boss structure, ele não referenciava no webmodule, ele não referenciava os jazz comuns.
Então vocês foram lá e referenciaram, que era o seu framework. Beleza, não, isso beleza, isso está certo. Mas perceba que vocês referenciaram o JAR, não era nem esse cara no Nexus, era o JAR que já tinha lá, que vocês referenciaram também no módulo do JBoss. Aí o que que eu ia, o que que eu

Jesse Mouta Pereira Batista   3:08
Foi. Sim, sim.
Mm-hmm.

Fabio Pereira Siqueira   3:23
O que eu ia pedir até para a gente, eu não sei como é que vocês organizaram. Pelo que eu entendi, vocês organizaram, cada um pega um profile. Eu ia sugerir a gente focar num ambiente, depois a gente iria para o outro. Aí eu posso até explicar a estrutura dos módulos.
E aí outro ponto é o seguinte, vocês falaram que o JBoss estava ok, né? Ontem eu dei uma revisada nos parâmetros do JBoss, eu tentei que ver se eu subir, mas eu tinha subido os parâmetros da configuração do JBoss. As senhas ainda estão abertas, eu ia deixar o voucher para depois.

Jesse Mouta Pereira Batista   3:39
Mhm.

Fabio Pereira Siqueira   3:57
E o meu objetivo era fazer o deploy da aplicação e chegar no meu ponto de entrave, que era o que? Já era a aplicação rodando, dando um pau na dependência do Kicklock, na dependência do Silva, que era o problema que eu esbarrei.

Jesse Mouta Pereira Batista   3:58
Thank you.
Yeah.
Entendi, tá, deixa aí, deixa eu só voltar aqui o raciocínio rapidinho. A gente continua aí nessa questão. O que eu estava falando da release era exatamente isso. A gente tinha o portabilidade bet e o portabilidade. O bet, ele estava pegando aqui. Alguém clonou um é a release antes.

Fabio Pereira Siqueira   4:18
Uh-huh.
Isso.

Jesse Mouta Pereira Batista   4:31
De um projeto que não tinha nada a ver com o syjack, entendeu? Então tal que as sim, então tal que as tasks aqui, cara, era uma, era umas tasks diferente, não tinha recupera download, queria VM terra forma, ele tava todo desconfigurado, cara.

Thiago Jeferson de Sousa Silva   4:33
Best.

Fabio Pereira Siqueira   4:35
A sell? No.

Jesse Mouta Pereira Batista   4:47
Tava tudo aí, o que eu fiz? Eu Apaguei ela e reconfigurei o batch e falei, olha, Jesse, a partir daí a gente vai rodar aqui, vamos subir o Jesse Boys e vamos fazer as correções que precisa ser feito. Então tá o que aqui tá sendo usado?

Thiago Jeferson de Sousa Silva   4:56
Yes.

Fabio Pereira Siqueira   4:57
Thank you.
Ah, então.
Into.

Jesse Mouta Pereira Batista   5:03
A sua bridge, entendeu?

Fabio Pereira Siqueira   5:05
Isso, então não tem nada a ver. É porque quando você estava mexendo em dependência de módulo, achei que fosse módulos da aplicação. Você está falando fora do da esteira. Seria a configuração da esteira.

Jesse Mouta Pereira Batista   5:26
Subiu o stand alone e aí só que dentro disso, Fabio, tem várias correções que a gente fez.
É várias correções que a que a gente fez, só que aqui tá sendo tudo rodado na CESTI. Por quê? Por causa da cobertura lá o online, ele precisou da cobertura e eu fiz todos esses ajustes. O que a gente pode fazer, tá? Porque o que eu.

Fabio Pereira Siqueira   5:43
Yes, yes, okay.
Not you.
É, eu vi, eu vi as mudanças que você fez porque eu acabei de fazer a comparação entre a minha brente e a sua. Em tese, é em tese, por exemplo, tem uma configuração lá que você fez no CDI que a gente não faria. Eu pulei essa, eu não vou fazer o uso dela, que é aquela de.

Jesse Mouta Pereira Batista   5:51
Mm.
Ah, não, show, beleza.
Mm-hmm.
Certo.
Star.

Fabio Pereira Siqueira   6:05
anotação, você vai ler a configuração que você colocou, você está lendo tudo, aquilo é ruim para nós, então eu deixei como anotated mesmo, entendeu?

Jesse Mouta Pereira Batista   6:07
Isso.
Mm-hmm.
Entendi, entendi o que o que a gente pode fazer a partir de então? Eu posso pegar, gerar um relatório dos 2 aqui. O gesto gera um e eu gero o outro. E aí a gente passa lá na sala e aí a partir de então você pode ir.

Fabio Pereira Siqueira   6:18
Right.

Jesse Mouta Pereira Batista   6:27
Continuar a aplicar, entendeu? Porque, por exemplo, hoje o portabilidade batch, ele tá quebrando porque tá faltando ajustes lá no código, entendeu? Então, quando a gente chega no jboys aqui, ele começa a dar vários erros, inclusive agora eu tava.
Tentando ver esse sub deployment aqui do do isolet, entendeu? Então é.
Eu do exatamente do deploy do jack lá, eu IA fazer essas correções aí que a gente faz agora, então, já que é, eu não sei como é que vai ficar a questão de cobertura aí, porque assim a gente sempre rodou aqui, Fábio, com a cobertura, entendeu? A ideia é rodar com a cobertura e ele passar.

Fabio Pereira Siqueira   6:51
So.
Mm-hmm.

Jesse Mouta Pereira Batista   7:07
Entendeu? É, fiz algum aham.

Fabio Pereira Siqueira   7:07
Não, eu te entendo. Eu te entendo. É porque quando a gente começou nesse projeto, houve uma negociação do Jander fazer uma solicitação e a gente tem um time para adaptação disso. Nós iríamos migrar a aplicação primeiro, depois a gente começaria a ajustar os testes unitados.

Jesse Mouta Pereira Batista   7:15
Uh-huh.
Sim.

Fabio Pereira Siqueira   7:22
Thi

Jesse Mouta Pereira Batista   7:22
Tá, então a gente pode fazer assim, a princípio,

Fabio Pereira Siqueira   7:23
Entendeu? Porque se você der uma olhada, se você der uma olhada, a cobertura de teste unitário é baixíssima nesse projeto.

Jesse Mouta Pereira Batista   7:29
baixíssimo é baixíssimo é porque ela só pega código novo né

Thiago Jeferson de Sousa Silva   7:32
Yes.

Fabio Pereira Siqueira   7:33
Is.

Jesse Mouta Pereira Batista   7:34
Eu só pego a code de novo. Então, Fabio, vamos fazer assim, eu vou criar um relatório aqui da parte do online e da parte do batch. A gente cria o relatório, manda lá na sala e você dá continuidade, entendeu? É aí só uma das questões que a gente estava.

Fabio Pereira Siqueira   7:47
Eu não acho. Eu não acho que precisa do relatório não, porque essa questão do relatório basicamente é só fazer um compé. Aí eu vejo que aquilo que é benéfico para aplicação e aquilo que não é.

Jesse Mouta Pereira Batista   7:54
Fazer o com isso, exatamente, aplica isso, exato. E aí deixa eu te fazer uma pergunta, você tá tendo acessar os logs de voz? Não, né?

Fabio Pereira Siqueira   7:58
Yes.
Não, na verdade, eu até queria ver, ver a você, você falou, você acabou de mostrar aí o SSH, né?

Jesse Mouta Pereira Batista   8:04
Mm.
Yes, yes.

Fabio Pereira Siqueira   8:11
É, eu acho que eu não tenho acesso não, tá?

Jesse Mouta Pereira Batista   8:13
Não tem. É que o que acontece é como a implementação aí tá caminhando, o que a gente pode fazer? Eu preciso gerar esse relatório só pra poder deixar o Flávio Galhardo ciente, a Patrícia, o pessoal da nossa equipe, que eu e o Gerson, que a gente fez até aqui.
E aí, a partir do dia, então a gente coloca que você vai revisar o que foi feito no online na site presente 3D. Jefferson, tu chegou a fazer alguma coisa na na teste, na bridge teste aí do batch?

Thiago Jeferson de Sousa Silva   8:44
Já algumas coisas aqui já.

Jesse Mouta Pereira Batista   8:46
Tá, beleza. Aí a gente vê o que ele fez, você revisa lá também, entendeu? A questão acho que do módulo aí que você tava falando. E aí, a partir de então, é.

Fabio Pereira Siqueira   8:53
É, eu acabei de ver um deploy aqui do Jet. Pode falar, pode falar.

Jesse Mouta Pereira Batista   8:55
Isso a parte a partir de então assim, a gente vê assim, você pode dar continuidade e aí quando você for subir o Jesse boy, você pode marcar a gente lá na sala, dá uma olhada, pega o log aí pra mim, vamos ver o que agora que falhou, porque assim, o que a gente está fazendo aqui, Fábio, desde a semana passada a gente sobe.
Ah, deu um erro aqui e tal, vamos ver o que é, não é esse arquivo, vamos lá, vamos corrigir. Aí a gente corrige, só faz o build de novo, só você vai ver lá que eu rodei várias builds lá no online lá, entendeu? Com esse é com essa questão hoje O a sua brand lá ela tá sem cobertura. Se vocês conseguirem do pessoal lá da parte do sonar tirar essa.

Fabio Pereira Siqueira   9:21
Eu vi, eu vi, eu vi.

Jesse Mouta Pereira Batista   9:30
Cobertura, beleza, aí você pode fazer a parte dela, senão você pode fazer um curry quest da CSTI e corrigir aí, aplicar, fazer análise aí e ver só o que realmente vocês vão precisar.

Fabio Pereira Siqueira   9:34
O.
não tranquilo tranquilo qualquer coisa eu desligo o teste unitário do local do do meio e aí lá do sonar eu eu peço para o João de entrar em ação

Jesse Mouta Pereira Batista   9:44
Beleza.
Sim.
Yes, believe Kelly.
Entendi.

Fabio Pereira Siqueira   10:04
Essa conversa aqui para explicar o que era aplicação, como estava a organização.

Jesse Mouta Pereira Batista   10:05
É, não teve. É porque, na verdade, a gente conversou lá na sala. Aí, vamos subir. É porque geralmente, como é o padrão aqui que a gente pega esses ADDR, a gente já começa ali subindo j-boys. É os erros que vai dando. Como é contexto de ADDR, a gente não fica lá na comunidade, abre hack pra isso, abre hack pra isso, porque ADDR não precisa.
Né? Então, no caso, a gente vai lá e atua, faz a configuração lá do J-boys, inclusive, inclusive eu troquei lá o algumas coisas lá do J-boys também, tirei a a as senhas lá que estava exposta e tudo com é aí.

Fabio Pereira Siqueira   10:26
Thank you.
Ah, então você já fez o uso do Vault lá naquele Config.

Jesse Mouta Pereira Batista   10:40
Isso, lá no config lá já, entendeu? Então, então é não, beleza, pode aplicar ou pode fazer o rollback lá também, não tem problema, tá salvo lá o arquivo, entendeu? Mas aí em relação a isso, é tranquilo. Então pode ser assim, Jefferson, a gente faz um relatório aqui do que a gente já fez.

Fabio Pereira Siqueira   10:42
Back home.
I'll deixar it for depois.
No, it's all back to me.
Mhm.

Jesse Mouta Pereira Batista   10:58
E aí a gente deixa alinhado assim, aí você pode continuar tocando e aí qualquer problema que você tiver, ah não, dá uma olhada no log aí. A gente entra, pega o log, te manda, compara junto, vamos ver aqui o que a gente pode fazer. É.

Thiago Jeferson de Sousa Silva   11:09
What's in?

Fabio Pereira Siqueira   11:09
É isso, é isso que eu ia perguntar, é isso que eu perguntei. Então, para solicitar o para ter o log, eu tenho que solicitar para vocês, né? É.

Jesse Mouta Pereira Batista   11:15
É porque por enquanto você não tem acesso ainda. Aí a gente pega o server log aqui e baixa. A gente pode até olhar o erro também, te dar uma instrução, ajudar, entendeu? Alguma coisa.

Fabio Pereira Siqueira   11:22
Mas eu posso ter acesso ou eu não devo ter acesso?

Jesse Mouta Pereira Batista   11:25
Não, o pessoal da eu acho que eu não sei é como é que funciona aí. Eu já conversei com o pessoal, no caso da fábrica, aí eu acho que ninguém tem acesso não, cara.
Entendeu? Acho que o pessoal lá da fábrica aí não tem, não tem acesso ao basting aqui, entendeu? No caso que eu falo, mas é isso pra pra poder pegar o log, mas depois que estiver tudo redondinho aí, que acho que é o próximo passo, que aí já é uma questão que a gente não mexe.

Fabio Pereira Siqueira   11:40
Está, deixa eu perguntar, vocês não estão conseguindo?
Best.

Jesse Mouta Pereira Batista   11:55
É a questão lá do garfrana, Jefferson, para poder.

Thiago Jeferson de Sousa Silva   11:57
That's a

Jesse Mouta Pereira Batista   12:01
O tem um outro aqui também, cara, a gente nem mexe, por isso que eu é, tem os logs esteiras, tem o gafana.

Thiago Jeferson de Sousa Silva   12:03
Love the status now.

Fabio Pereira Siqueira   12:06
Então então vai ter vai ter vai ter grafana e o e o prometheus aí no no 10

Jesse Mouta Pereira Batista   12:10
Oh, grilog air.

Thiago Jeferson de Sousa Silva   12:11
Gravando, Eu Acredito que não tenha, mas Eu Acredito que tenha o logo estereas ágeis, que é do.

Jesse Mouta Pereira Batista   12:13
Ou greylog.
logs que é do Greylog, né?

Thiago Jeferson de Sousa Silva   12:18
Yes, Bernardo.

Jesse Mouta Pereira Batista   12:19
É esse cara aqui, a gente quem faz essa configuração geralmente é o si aqui da nossa equipe. A gente não mexe ou o cloud ou outro pessoal. Aí a gente nunca fez essa configuração aqui pra ele poder pegar os logs aqui e jogar aqui pra vocês terem acesso.

Fabio Pereira Siqueira   12:20
Okay.

Jesse Mouta Pereira Batista   12:36
Entendeu? Que aqui nesse caso aqui vocês conseguem ter o acesso ao log aqui dentro.

Fabio Pereira Siqueira   12:40
mas aí para chegar nessa etapa aí eu tenho que estar com o

Jesse Mouta Pereira Batista   12:41
Entender.
Isso tem que estar com o Jorge Redondo, a aplicação funcionando. Eu acredito que vai ter questão aí também de URL customizada pra poder acessar aí OA, entendeu?

Thiago Jeferson de Sousa Silva   12:44
Saying.

Fabio Pereira Siqueira   12:52
Pronto, você chegou o DNS que você fala, você chegou no outro ponto aí que eu queria. Você falou que o de boss já está subindo, você tem ele. Qual é o endereço? O qual é o URL que ele está respondendo? Qual é o IP, já que ele não tem nome ainda.

Jesse Mouta Pereira Batista   12:55
Yes, then yes.
Deixa eu pegar ela aqui.

Fabio Pereira Siqueira   13:09
Se puder me compartilhar do batch, se bem que do batch não vai ter mais módulo web, vai ter só o batch mesmo.

Jesse Mouta Pereira Batista   13:18
Deixa eu ver se a gente já consegue pegar aqui rapidinho.

Fabio Pereira Siqueira   13:21
Se você quiser me mostrar lá na lá no DevOps, eu já procurei aqui em DevOps, não achei não.

Thiago Jeferson de Sousa Silva   13:21
Yes.

Jesse Mouta Pereira Batista   13:27
É no DevOps aqui.
Bora ver o online aqui, deixa eu ver se tem alguma coisa.
eu acho que ainda não tem ainda não não tem não tem a parte do URL customizada nem nada bora ver aqui é porque como ele não tá finalizando o deploy nesse resumo do deploy aqui resumo da release ele passa para a gente a URL mas como ele tá crachando aqui no no
no no check de Entrevistas exatamente por causa desses erros né ele dá retrieve retrieve vai vai tentando até subir a gente não consegue pegar mas eu acredito a máquina é essa daqui deixa eu ver aqui é porque não tem URL para abrir ainda entendeu porque o Jack web o Jack API

Fabio Pereira Siqueira   14:12
Okay.

Jesse Mouta Pereira Batista   14:13
Eles estão falhando no iniciar lá do eletron, entendeu? Então o JBoss, ele tá de pé, mas as duas aplicações web não. Então não tem URL. Qualquer URL que a gente tenha hoje, ela vai dar 404 por causa disso, entendeu? Então a gente precisa é.

Fabio Pereira Siqueira   14:26
Tá, mas aí então, mas eu vou pegar nesse log então, né? Nesse.

Jesse Mouta Pereira Batista   14:29
Isso nesse log, nesse, nesse finalzinho aqui, resumo da release, ele vai te passar aí, Fabio, se você, não, a gente quer uma URL customizada, tal. Aí a gente tem que fazer o processo lá de criar o vip. É depois de criar o vip, está lá o certificado pra https.
E aí sim, a gente consegue aplicar aqui. Foi só um ajuste na esteira, um ajuste rápido e a gente já consegue ter acesso aí depois que o Jesse de perto, tiver tudo redondinho, a gente consegue ter acesso a isso aí, beleza? Esse passo aí, esse processo aí, a gente consegue auxiliar vocês aí a abrir.

Fabio Pereira Siqueira   14:54
Done.
Agora, Jesse, me explica uma coisa.

Jesse Mouta Pereira Batista   15:03
É que aí no caso você pode chamar o coordenador aí para poder é solicitar as hacks lá, a gente acompanha e auxilia ele na criação disso aí, pode falar.

Fabio Pereira Siqueira   15:07
Tá.
Só para confirmação. Na verdade, eu só vou poder solicitar esse nome, porque a gente faz uso do nome SYJEC hoje no legado. Então, como vai ter um redirecionamento, eu só vou poder usar o nome quando estiver pronto.

Jesse Mouta Pereira Batista   15:25
Quando tiver pronto, entendeu? Quando? Só quando tiver pronto, entendeu?

Fabio Pereira Siqueira   15:27
Okay.
porque aí a gente é quando a gente vai jogar o legado fora mesmo

Jesse Mouta Pereira Batista   15:30
só quando tiver tudo ok
Isso, que é quando vocês foram jogar o legado fora, entendeu? A princípio, os outros ADDR, Jefferson, pode me confirmar? Por exemplo, a gente tem o SIEMP aqui, que ele era um legado e veio pra cá pra esteira. Cara, o pessoal já pediu.

Fabio Pereira Siqueira   15:51
Mas é porque eu conheço o código do CES o código deles é simples.

Jesse Mouta Pereira Batista   15:51
PJ.
É aqui, ó, a gente já pediu, entendeu? A gente já tem um URL aqui dele já, ó, um URL customizado já funcionando, entendeu?

Thiago Jeferson de Sousa Silva   16:03
O pessoal, o pessoal antes de já botou essa variável então para pegar a URL, aí depois eles foram ver se queriam a customizada ou se manteria.

Jesse Mouta Pereira Batista   16:09
Is.
Customizado, é.

Thiago Jeferson de Sousa Silva   16:15
Yes.

Jesse Mouta Pereira Batista   16:16
O Denilson está até tá até subindo aqui em DNS aqui, deu é, vai dar erro de vec. Ele tem que criar uma vec exclusiva aqui para poder subir em TQS. Tem essa questão também, tá? Se vocês for rodar em TQS aí, aí tem que criar uma tag específica para poder subir em TQS.

Fabio Pereira Siqueira   16:16
No, it is.
Right.
Mas essa tag é com vocês também.

Jesse Mouta Pereira Batista   16:34
Não, essa tag ser aqui dentro pra gente funciona assim, por exemplo, se jack portabilidade, dentro da Brand CSTI tem as tags, aí, tá vendo? Se não tem nenhuma tag, aí eu posso criar uma tag baseada nela, aí eu vou lá, minha tag e iniciar, 1.0.0.0.

Thiago Jeferson de Sousa Silva   16:35
No.

Fabio Pereira Siqueira   16:45
Mm.

Jesse Mouta Pereira Batista   16:50
Minha tag inicial, eu vou aqui e coloco, por exemplo, o CESTI. Isso, é a release, é uma tag baseada dentro da release, entendeu? Aí criou ela aqui e acabou. É isso que o cara lá do CM tem que fazer, entendeu? É aqui.

Fabio Pereira Siqueira   16:54
A Renato separa Renato.
Mhm, mhm.

Jesse Mouta Pereira Batista   17:06
Aqui dentro, aqui a gente consegue criar tag. Eu não sei se no Git, você usa o Git aí pra subir ou não. Qual qual coisa? É o GitLab. Então aí você acha que você pode usar, criar tag aí também, entendeu?

Fabio Pereira Siqueira   17:12
Four was on which lado?
É, a gente só não faz uso mais, mas a gente usa aqui, mas não faz uso dessa tag.

Jesse Mouta Pereira Batista   17:23
É, beleza, é isso. Então, você já que portabilidade está aí. Fiz vários ajustes aqui no para cobertura de teste. Aí se você quiser manter, entendeu? Vou, eu vou, vou, vou passar o relatório lá na sala e aí você pode continuar tocando. Aí você fala, pessoal, estou com.

Fabio Pereira Siqueira   17:27
No.

Jesse Mouta Pereira Batista   17:40
Eu não sei qual que você vai pegar o bet agora ou você vai pegar online?

Fabio Pereira Siqueira   17:44
Eu vou pegar o bad que eu tava focando nele e aí dele eu passo online.

Jesse Mouta Pereira Batista   17:46
Tá.
Isso, beleza, então vamos fazer o seguinte, a gente.

Thiago Jeferson de Sousa Silva   17:48
Só o que a gente manda lá o relatório e.

Jesse Mouta Pereira Batista   17:52
Pode falar, Jefferson.

Thiago Jeferson de Sousa Silva   17:53
E o e o que falta também, não é? A gente pode mandar até com log também junto para você.

Jesse Mouta Pereira Batista   17:57
Isso aí, quando você subir alguma coisa, ó, galera, eu tô precisando de log aí, você pode marcar a gente na sala. Aí, Fabio, só peço um pouquinho de paciência aí, porque a gente tá em outros ADDR também, entendeu? Do SIEMP, do SIFEC, do GSJ.

Fabio Pereira Siqueira   17:59
For sure.
Uh-huh. Uh-huh.

Thiago Jeferson de Sousa Silva   18:11
Okay.

Jesse Mouta Pereira Batista   18:13
Entendeu? Do Siqueira que a gente está em outro ADDR e aí, por exemplo, você pode marcar a gente lá. Se a gente demorar um pouquinho, você pode ligar e tal. Se a gente não estiver apresentando tela, a gente atende. Aí você fala, não, me passa o log aí, vamos ver o que está acontecendo lá, porque quebrou e aí a gente vai fazendo os ajustes. Tá aí só uma questão, eu não sei.
Eu não sei o porquê que aconteceu, eu até fiquei assim, aí eu até chamei o Galhard, já falei, Galhard, vamos chamar o Fabio aqui para a gente ver, porque bem no comecinho aqui, não sei se você lembra aquela vez lá que a gente estava rodando na sala, é no portabilidade aqui.
A gente que era o bet antes, que agora é online, tá? É, a gente lembra que a gente tinha criado umas variáveis aqui e tal. Aí eu acho que você acabou excluindo elas, que são variáveis do.

Thiago Jeferson de Sousa Silva   18:46
O.

Fabio Pereira Siqueira   18:49
Uh-huh.

Thiago Jeferson de Sousa Silva   18:56
Sh.
Foi dentro down.

Fabio Pereira Siqueira   18:58
Não, não.

Thiago Jeferson de Sousa Silva   19:00
Foi dentro da própria aplicação aí, suja.

Jesse Mouta Pereira Batista   19:02
Okay, this is aqui.

Fabio Pereira Siqueira   19:04
não eu vi eu vi que tem um erro nessa daí eu não exclui elas o que eu fiz foi excluir aquele limite lá dentro da deixa eu ver aqui ó deixa eu lembrar o da live ali eu entendi

Jesse Mouta Pereira Batista   19:13
A libre aqui.
Aqui da libre, então, mas essas aqui subiram também, né Jeferson?

Thiago Jeferson de Sousa Silva   19:21
Subiram elas precisam dizer

Fabio Pereira Siqueira   19:22
Não, essas aí, essas aí.

Jesse Mouta Pereira Batista   19:22
S.
É, essas aqui sumiram. Enfim, não é só. É só uma questão assim, porque, por exemplo, se não tiver elas aqui, o jboys quebra nem sobe. Ele quebra lá no plate roads, é.

Fabio Pereira Siqueira   19:31
Não, eu lembro que você falou isso. Eu lembro que você falou isso. Tanto é que você eu fiz a pergunta, mas eu que tenho que criar, sendo que eu não tenho essa informação assim, eu não sei o que parametrizar aí.

Jesse Mouta Pereira Batista   19:39
Yes.

Thiago Jeferson de Sousa Silva   19:40
Então aí foi nessa que o Jesse falou que essas daí obrigatórias a gente colocaria.

Jesse Mouta Pereira Batista   19:46
Is.

Fabio Pereira Siqueira   19:48
Você pode ver que as outras eu criei aí.

Jesse Mouta Pereira Batista   19:48
É a gente.
É porque que eu fiz aqui, cara, eu tenho um, eu tenho um toque e eu vou te explicar o que é o meu toque. Eu não gosto desses negócios com erro, entendeu? Aí eu venho aqui e limpo tudo. Aí o Jesse não, Jesse, tu tirou o negócio. Aí eu acabei excluindo a brand que mostrava que.

Fabio Pereira Siqueira   20:01
Then.

Jesse Mouta Pereira Batista   20:06
Que tinha dado a release que mostrava que tinha dado erro, mas enfim, é só esse ajuste mesmo, só é só essa questão que a gente ia passar, entendeu? Mas vamos fazer o seguinte, é, você vai, você vai pro pro pro bet agora, né?

Fabio Pereira Siqueira   20:15
Mhm.

Thiago Jeferson de Sousa Silva   20:20
Yeah.

Fabio Pereira Siqueira   20:20
É, eu vou focar no bet e aí depois eu passo para online.

Jesse Mouta Pereira Batista   20:21
Isso você foca no batch aí vamos vamos manter assim você é você vai fazendo os ajustes subir o Thiago já está até rodando um aqui agora é
Você voltou a dele mesmo? Passou aqui, Jefferson?

Thiago Jeferson de Sousa Silva   20:37
No, pass or.

Jesse Mouta Pereira Batista   20:39
Passou do do quality gate, né? Ah, não, ó, os do mave. Ah, tava quebrando o era por causa dos módulos, né? Sim, enfim.

Thiago Jeferson de Sousa Silva   20:41
Passou, não do meio, vem, tava quebrando no meio, vem, eu resolvi aqui algumas coisas.
That almost was.

Jesse Mouta Pereira Batista   20:49
Beleza, subiu aqui na CESTI bet test, tá? Se quiser dar uma olhada, a gente vai pegar e vai te mandar o relatório. Se quiser ver o que passou, e aí eu te mando já o log também, porque aqui tu acha que vai quebrar, Jefferson? Não, acho que sobe agora.

Thiago Jeferson de Sousa Silva   21:04
Tomara que não.

Jesse Mouta Pereira Batista   21:05
A gente espera, né? A gente espera que não. Então

Fabio Pereira Siqueira   21:08
Olha, eu vou mandar, eu vi que online vocês mandaram aqui, como eu falei que ia focar no batch, eu pego o do batch aqui e aí eu vou rodar ele, porque eu sei que está compilando, tá?

Jesse Mouta Pereira Batista   21:10
Oh.
Mm.
Isso, é só uma pergunta, Fabio, eles eles vão continuar rodando os 2 na no mesmo repo, né?

Fabio Pereira Siqueira   21:25
Na mesma isso, no mesmo repositório, aí o Maven, isso aí o ponto que ele faz a separação dos módulos, tá?

Jesse Mouta Pereira Batista   21:27
No mesmo repositório.
Isso, a gente manteve o p online lá e o bet tá sem o p online, entendeu? O bet pega o bet e o e o portabilidade era interessante a gente ter trocado o nome desse cara, tipo botar online lá, entendeu? Mas aí agora.

Fabio Pereira Siqueira   21:37
Mhm.
Ué, tá na hora. Pode fazer, ué. Por mim, pode fazer.

Jesse Mouta Pereira Batista   21:48
Pois é, kick, kick to ask for Jeff.

Fabio Pereira Siqueira   21:52
Okay.

Thiago Jeferson de Sousa Silva   21:52
Vai trocar alguma coisa lá no?

Fabio Pereira Siqueira   21:54
Yep.

Jesse Mouta Pereira Batista   21:56
Got it.

Thiago Jeferson de Sousa Silva   21:56
on

Jesse Mouta Pereira Batista   21:57
Lá no é que o problema sabe o que que é? É porque ele vai rodar uma, ele vai gerar uma nova VM.
Entendeu? Ele vai gerar uma nova VM.

Fabio Pereira Siqueira   22:06
Assim, mas para nós, para nós, não tem nenhum problema. Tanto é que vocês fizeram essa pergunta no dia e acho que verificaram que podia, não é? Alguém sinalizou que podia fazer isso.

Jesse Mouta Pereira Batista   22:09
EP.
É, é por, é. O galhard falou que podia fazer. É porque assim é a mesma questão do toque que eu vou explicar de novo. Tipo, fica assim, a portabilidade, beleza, mas qual online? Cadê a a? É só um nomezinho, entendeu?

Fabio Pereira Siqueira   22:29
Rapaz, senta a bota, muda aí.

Jesse Mouta Pereira Batista   22:31
Vai trocar Jefferson, vai trocar só OAVM, ele vai criar um AVM nova.
O que a gente pode fazer, cara?

Thiago Jeferson de Sousa Silva   22:40
Mas aí se a gente vai ter que configurar o device todinho não

Jesse Mouta Pereira Batista   22:40
Kara Pereira.
Não, então o que que que eu pensei? Que que eu pensei aqui agora?

Fabio Pereira Siqueira   22:44
Não.
Não, porque é só mudar, não é só por você puxar, não vai continuar puxando a massa lá o repo de configuração.

Jesse Mouta Pereira Batista   22:51
Então é porque ele pega daqui ó.

Thiago Jeferson de Sousa Silva   22:52
Modar, modar na própria infra fácil, né? Nome, né?

Jesse Mouta Pereira Batista   22:55
É, deixa eu te deixa eu te mostrar aqui é porque essa variável aqui, oh.
Cadê a pipeline? Pipeline tem nenhum release aqui essa variável aqui.
Esse step, na verdade, meu Deus, negócio está mais lento do que tudo. Cadê? Vamos pegar um release aqui.
Aer
Alok PA infra fácil o que ele faz? Ele é um API que ele vai lá no infra fácil e ele verifica se existe.
Se o rap existir aqui dentro aqui, oh, em relatórios, cadê, cadê, cadê?
Suporte servidores, registrar servidor, vamos lá, SIJEC.
Portabilidade, vamos pegar ele aqui, tá vendo que o portabilidade tá os dois aqui, bonitinho nas suas máquinas, 2871. Vamos conferir aqui se essa 2871.
Tá vendo, ó? 2871. A partir do momento que a gente colocar a sigla aqui online.
que eu vou ter que mudar esse cara bem aqui
Okay.
Eu vou ter que mudar esse cara bem aqui.
Esse não, esse sistema nome. Na hora que eu botar aqui online e mudar a pipeline lá para online também, o que vai acontecer? Ele vai criar uma nova VM, mas aí para ele não criar uma nova VM, o que a gente faz?
eu vou vir aqui vou renomear esse cara
Para ele chegar aqui e achar o online e pegar a mesma VM, porque a gente não precisa reconfigurar o Jabus de novo, entendeu?
Vou fazer isso.
Bora fazer agora?
Fixes acho.

Thiago Jeferson de Sousa Silva   24:41
E a confusão agora antes do almoço, não?

Fabio Pereira Siqueira   24:41
Hi, cara, por mim.

Jesse Mouta Pereira Batista   24:43
É, não, não, beleza, depois do almoço, combinado 2 horas. Eu te chamo aí, Fabio, a gente faz, tá? Eu vou.

Thiago Jeferson de Sousa Silva   24:44
Sure.

Fabio Pereira Siqueira   24:50
Tá, beleza não. Deixa eu perguntar uma coisa sobre o horário. Eu já vi que vocês não ficam até às seis, né? Vocês vão ter que orar.

Jesse Mouta Pereira Batista   24:53
Oh.
Não até 5, é 5, 5 e meia, 5 e 20 ali no máximo.

Thiago Jeferson de Sousa Silva   24:57
5:30 no máximo.

Fabio Pereira Siqueira   25:01
Mas o horário de vocês é, vocês não falam com a caixa?

Jesse Mouta Pereira Batista   25:05
A gente não, a gente é prestador, a gente é p, né? Aí a gente é de 8:30 às 5, 5:30 é porque geralmente, Fabio, te explicar aqui, a gente não tira o horário do almoço, entendeu? Então a gente já toca direto aqui, é geralmente a gente já toca direto, então tira ali tipo só uns.

Fabio Pereira Siqueira   25:09
I thank you.
Entendi.

Jesse Mouta Pereira Batista   25:25
10, 20 minutinhos. Ou você é fábrica e você deve, você sabe, come na frente do computador, entendeu? E vai embora, entendeu? Aí geralmente a gente fica ali até umas 5, 5 e 20.

Fabio Pereira Siqueira   25:32
Captain Captain.
Beleza.
Why don't.

Jesse Mouta Pereira Batista   25:40
Beleza.

Fabio Pereira Siqueira   25:41
Então vocês, vocês, vocês decidiram, a gente concorda aqui de renomear. Como eu vou focar no batch, eu vou esperar vocês renomear online. É o tempo que eu trabalho no batch, não é?

Jesse Mouta Pereira Batista   25:46
Isso.
Beleza, beleza. Aí a gente vai, depois do almoço, a gente manda os relatórios lá, só pro Paul Galiard ficar ciente do que a gente tomou aqui, do que a gente fez. E aí a gente faz essa troca aí. A gente aproveita pra ver se ele vai pegar o mesmo servidor, pegando o mesmo servidor lá, acabou, vai estar tudo certo e já fica o nomezinho certinho, arrumadinho, tudo.
tudo ajeitado.

Fabio Pereira Siqueira   26:13
Beleza.

Jesse Mouta Pereira Batista   26:14
Beleza, beleza, então é isso aí, fechou. Qualquer coisa pode marcar a gente lá na sala do CESTI Pode chamar que a gente, perdão do do CESTI, que a gente vai vai compartilhando lá os logs lá, vai acompanhando, vai resolvendo.

Fabio Pereira Siqueira   26:31
Tá beleza, então, fechado. Gente, brigadão, viu?

Jesse Mouta Pereira Batista   26:31
Beleza? Valeu Fabio, obrigado. Valeu, até mais.

Thiago Jeferson de Sousa Silva   26:35
Paulino Paulino.

Fabio Pereira Siqueira   26:36
Hello, Dennis.

Thiago Jeferson de Sousa Silva parou a transcrição



gec-ejb/src/main/resources/META-INF/beans.xml
 
    bean-discovery-mode="annotated">
 
Como Resolver (Definitivo no código e Teste Agora)
 
1. No código-fonte (para a sua nova release)
Além de manter bean-discovery-mode="all" no gec-ejb/src/main/resources/META-INF/beans.xml, remova a tag <resources><resource-root path="gec-ejb.jar" /></resources> do arquivo gec-ear/src/main/application/META-INF/jboss-deployment-structure.xml (pois como <ear-subdeployments-isolated>false</ear-subdeployments-isolated> já está definido, o gec-batch.jar e o gec-api.war já enxergam o gec-ejb.jar naturalmente sem precisar duplicá-lo como resource-root).
 
 
Aqui está o Manual Técnico Completo de Correção no Repositório (gec-ear) para o profile batch no JBoss EAP 7.4.
 
Este documento consolida todas as correções estruturais, de código-fonte e de empacotamento descobertas durante o diagnóstico e validadas no servidor caddeapllx2884 para que a aplicação suba sem erros (gec-ear.ear.deployed).
 
 
Manual de Adequação do Repositório gec-ear (Profile Batch — JBoss EAP 7.4)
 
1. Visão Geral dos Problemas Encontrados
Durante a subida do pacote gec-ear.ear no JBoss EAP 7.4, foram identificados quatro problemas estruturais no empacotamento e no código do profile batch:
 
Falha de Descoberta de Beans CDI (WELD-001408): O gec-ejb.jar estava configurado com bean-discovery-mode="annotated", fazendo com que o Weld ignorasse as classes DAO (como DAOArquivoInterfaceCaixaFebraban, DAOParametroCaixa, etc.) que não possuem anotações explícitas de escopo CDI.
Duplo Carregamento de ClassLoader (IllegalArgumentException: Can not set ... to ...Proxy$): O jboss-deployment-structure.xml declarava o gec-ejb.jar como <resource-root> no nível <deployment> do EAR, carregando as classes do EJB duas vezes em ClassLoaders distintos (pai e submódulo).
Duplicidade de 293 Classes entre gec-ejb.jar e gec-batch.jar: O build Maven do profile batch estava empacotando as mesmas classes de batch (MDBs, Timers e classes base) dentro dos dois módulos simultaneamente, gerando conflito de inicialização EJB.
Método Abstrato Não Implementado (AbstractMethodError: getNomeFluxo()): Duas classes EJB filhas de AbstractGerenciadorTimers / AbstractGerenciadorTimersSemBMT não implementavam o novo método abstrato getNomeFluxo().
 
 
2. Alterações Obrigatórias no Código-Fonte e Descritores
 
Passo 1: Ajustar o escaneamento CDI no beans.xml do módulo gec-ejb
Arquivo: gec-ejb/src/main/resources/META-INF/beans.xml
 
O que alterar: Mudar o atributo bean-discovery-mode de "annotated" para "all".
Motivo: Permite que o container CDI (Weld) descubra e injete automaticamente todas as classes DAO e de integração do módulo gec-ejb.jar sem exigir anotações de escopo em cada classe legada.
 
Como o arquivo deve ficar:
 
xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://jcp.org"xmlns:xsi="http://w3.org"xsi:schemaLocation="http://jcp.org http://jcp.org/beans_1_1.xsd"version="1.1"bean-discovery-mode="all">
    <interceptors>
        <class>br.gov.caixa.arqrefcore.cobol.conversor.grafo.GraphInterceptor</class>
        <class>br.gov.caixa.arqrefcore.validacao.ValidationInterceptor</class>
        <class>br.gov.caixa.arqrefcore.log.LoggerIntercepter</class>
    </interceptors>
</beans>
Use o código com cuidado.
 
 
Passo 2: Remover <resource-root path="gec-ejb.jar" /> do jboss-deployment-structure.xml
Arquivo: gec-ear/src/main/application/META-INF/jboss-deployment-structure.xml (ou a variante utilizada pelo profile batch)
 
O que alterar: Remover completamente o bloco <resources><resource-root path="gec-ejb.jar" /></resources> de dentro da tag <deployment>.
Motivo: Como <ear-subdeployments-isolated>false</ear-subdeployments-isolated> já está definido, todos os submódulos (gec-batch.jar e gec-api.war) já enxergam o gec-ejb.jar naturalmente. Mantê-lo como <resource-root> duplica o ClassLoader e quebra as injeções @EJB / @Inject com IllegalArgumentException: Can not set ... to ...Proxy$.
 
Como o arquivo deve ficar:
 
xml
<jboss-deployment-structure>
    <!-- Make sub deployments isolated by default, so they cannot see each others
         classes without a Class-Path entry -->    <ear-subdeployments-isolated>false</ear-subdeployments-isolated>
    <deployment>
        <exclusions>
            <module name="cef" />
        </exclusions>
        <dependencies>
            <module name="deployment.framework_sisgd.jar" />
            <module name="deployment.framework.jar" />
        </dependencies>
    </deployment>
    <!-- Profile BATCH: gec-web não é empacotado no EAR -->    <sub-deployment name="gec-api.war">
        <exclusions>
            <module name="cef" />
        </exclusions>
        <dependencies>
            <module name="deployment.framework.jar" />
            <module name="deployment.framework_sisgd.jar" />
        </dependencies>
    </sub-deployment>
</jboss-deployment-structure>
Use o código com cuidado.
 
 
Passo 3: Implementar o método getNomeFluxo() nas classes de Timer
Motivo: A superclasse AbstractGerenciadorTimers / AbstractGerenciadorTimersSemBMT exige a implementação de public String getNomeFluxo(), mas duas classes filhas estavam sem o método, causando java.lang.AbstractMethodError na subida do EJB.
 
Adicione a implementação do método nas duas classes abaixo (em gec-ejb ou gec-batch, conforme a localização no projeto):
 
Classe: br.gov.caixa.sigec.negocio.AcatamentoAutomaticoIndependenteContaSalarioBean

java
@Overridepublic String getNomeFluxo() {
    return "AcatamentoAutomaticoIndependenteContaSalario";
}
Use o código com cuidado.
 
Classe: br.gov.caixa.sigec.negocio.TEDSolicitacaoExternaBean

java
@Overridepublic String getNomeFluxo() {
    return "TEDSolicitacaoExterna";
}
Use o código com cuidado.
 
 
(Ajuste a String de retorno caso haja uma constante ou padrão específico de log utilizado nos demais beans).
 
 
Passo 4: Eliminar a duplicidade de classes entre gec-ejb.jar e gec-batch.jar no Maven
Arquivos: gec-ejb/pom.xml, gec-batch/pom.xml e gec-ear/pom.xml
 
O que verificar e ajustar: No empacotamento do profile batch, foram encontradas 293 classes duplicadas presentes simultaneamente dentro de gec-ejb.jar e gec-batch.jar (incluindo GerenciadorTimersBean, EnvioTedListenerBean, PagamentoTedListenerBean, AbstractGerenciadorTimers, InicializadorBancoDadosBean, etc.).
Como corrigir:
Garantir que o módulo gec-batch dependa de gec-ejb com <scope>provided</scope> no gec-batch/pom.xml, para que o Maven compile contra gec-ejb, mas não copie as classes compiladas do gec-ejb para dentro do gec-batch.jar.
Garantir que no profile batch do gec-ejb/pom.xml não haja configuração de maven-jar-plugin ou build-helper incluindo pacotes exclusivos do gec-batch.
Cada classe .class deve existir em apenas um JAR dentro do gec-ear.ear.
 
 
3. Validação Local Antes de Subir na Esteira
Antes de fazer o commit/merge para a esteira de deploy, execute a compilação limpa e valide o .ear gerado localmente:
 
 
1. Compilar todo o projeto do zero
bash
mvn clean package -Pbatch
Use o código com cuidado.
 
(O uso obrigatório do clean garante que não sobrem arquivos .class antigos de builds anteriores).
 
 
2. Conferir o beans.xml dentro do gec-ejb.jar gerado
Verifique se bean-discovery-mode="all" está presente no artefato final (target/gec-ear.ear).
 
 
3. Conferir o jboss-deployment-structure.xml dentro do gec-ear.ear gerado
Verifique se não existe nenhuma tag <resource-root path="gec-ejb.jar" />.
 
 
4. Conferir se não há classes duplicadas entre gec-ejb.jar e gec-batch.jar
Você pode rodar este comando rápido (Linux/Git Bash/WSL) sobre o .ear gerado na pasta target/ para garantir que a interseção de classes seja zero:
 
bash
python3 -c '
import zipfile, io
with zipfile.ZipFile("gec-ear/target/gec-ear.ear") as z:
    ejb = {f for f in zipfile.ZipFile(io.BytesIO(z.read("gec-ejb.jar"))).namelist() if f.endswith(".class")}
    batch = {f for f in zipfile.ZipFile(io.BytesIO(z.read("gec-batch.jar"))).namelist() if f.endswith(".class")}
    dup = ejb & batch
    print("Classes duplicadas:", len(dup))
    if dup:
        print("\n".join(sorted(dup)[:10]))
'
Use o código com cuidado.
 
Resultado esperado: Classes duplicadas: 0.
 
 
4. Resumo das Configurações Já Aplicadas no Servidor (caddeapllx2884)
Para registro da equipe de infraestrutura e desenvolvimento, o servidor JBoss EAP 7.4 já está configurado e pronto com:
 
Datasources DB2: java:/jdbc/DB2SiempDS, java:/jdbc/DB2SigecDS e java:/jdbc/DB2SifecDS.
Mensageria (remoteJMS): Todas as filas e connection factories (queueRecebimentoTed, queueEnvioTed, queueRspPagamentoTed, queueVerificacaoTed, etc.) e o adaptador wmq.jmsra.rar implantado.
Subsistema Weld: Configurado com require-bean-descriptor=false.
Segurança (Elytron / Undertow): Conflito ELY01148 resolvido (subsistema legado keycloak removido e domínio other vinculado ao ApplicationDomain).
 
 
 
 
 
 
