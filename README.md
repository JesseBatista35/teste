Reunião em Migração JBoss 7.4 - SIFEC, SICCR, SIEMP, SIPEN-20261116_143307-Transcrição da Reunião
16 de novembro de 2026, 05:33PM
15m 54s

Jesse Mouta Pereira Batista começou a transcrição

Gustavo Duarte Lepesteur da Costa   0:03
Que assim, já tinha pedido as máquinas, etc. Mas aí faltava configurar, configurar profile, levar tudo do gboss. Era esse o cenário quando eu saí de férias. Aí eu queria entender o que

Jesse Mouta Pereira Batista   0:16
É, deixa eu te passar aqui um Panorama rápido aqui de que de como de como estamos e de o que o que vai vim pela frente. É hoje o ambiente do do intranet do cifec no 74, ele já tá com a maior parte das aplicações no ar. A gente tem ali o cifec, o PJ, o.

Gustavo Duarte Lepesteur da Costa   0:25
Mm-hmm.

Jesse Mouta Pereira Batista   0:36
O CTD, o parâmetros, é, a gente já tem também o front do hub, o MCM, aí tem o BD Caixa, tem o CCR, o FBN e o Minutas, né? Algumas dessas já foram validadas pelos devs, né? E o restante está em validação, né? E aí, o que que está em validação hoje aí?

Gustavo Duarte Lepesteur da Costa   0:46
Mhm.

Jesse Mouta Pereira Batista   0:55
É os erros que a gente encontra aqui, algum é a maioria deles, é configuração de ambiente, a gente corrige, e aí o que vem a ser código, a gente passa na sala aqui, o isso, o Paulo Henrique aponta a fábrica e eles vão lá e fazem.

Gustavo Duarte Lepesteur da Costa   1:06
Para a fábrica, tá?

Jesse Mouta Pereira Batista   1:11
Os ajustes, inclusive, acho que agora o Micael acabou de mandar uma nova versão aqui do isso do CIP pra gente poder é implementar é logo após aqui a reunião, a gente já vai subir ela, tá? É o CIP. Ele também está publicado pela esteira nova.

Gustavo Duarte Lepesteur da Costa   1:15
Dociro a LV.
Hardware.

Jesse Mouta Pereira Batista   1:26
E ele já abre lá pelo CIP 10. A gente teve uma intermitência lá porque o DNS ele ficou com o IP antigo junto com o IP novo na hora da solicitação lá. Porém o Paulo Henrique, ele já até abriu uma solicitação lá e pediu o pessoal pra da Cetel lá 08 pra retirar o.

Gustavo Duarte Lepesteur da Costa   1:36
Mm.

Jesse Mouta Pereira Batista   1:43
O IP antigo e ele já foi tirado, a gente vê que já consegue entrar na aplicação, não tem mais essa intermitência, é.

Gustavo Duarte Lepesteur da Costa   1:49
Mas então a gente aqui, vocês mesmo, eu digo vocês, a gente está tocando a parte de Infra do MPE na esteira. É porque até então a informação que eu tinha que era um trabalho apartado que o pessoal estava fazendo por fora. Então a Infra foi.

Jesse Mouta Pereira Batista   1:57
Is na esteira.
É a gente a gente acabou pegando aqui isso pode pode falar desculpa Ah tá é

Gustavo Duarte Lepesteur da Costa   2:06
Da, da, abilit.
Não era só para saber isso, se é porque eu queria entender, até porque é hoje o galera de produção me chamou para ir para, porque eles estavam dando uma olhada na library de 10 para já começar a dar uma replicada lá em produção e eles ficaram com dúvidas de algumas coisas que tinham lá, por exemplo, tinha apontamento do sidebase, tinha apontamento.

Jesse Mouta Pereira Batista   2:18
Mm-hmm.

Gustavo Duarte Lepesteur da Costa   2:26
De fila MQ em que tese o MPE não usa, né? O MPE vai no vai, vai nesses caras de Fabri. E aí a gente acabou inferindo que provavelmente isso foi copiado é do as configurações. Essas configurações deve ter sido meio que inspiradas ali copiadas do J Boss.

Jesse Mouta Pereira Batista   2:28
Uh-huh.
Sim.

Gustavo Duarte Lepesteur da Costa   2:45
Só que aí o esse Jose, especificamente, é um domínio compartilhado, né? Então, é provável que eles tenham trazido essas configurações do Feq e jogado lá na library do AMP lá. Então, precisava depois fazer uma limpa lá exato do que não usa.

Jesse Mouta Pereira Batista   2:45
Bing.
Duarte.
Um ajuste, né? Sim.

Gustavo Duarte Lepesteur da Costa   3:00
Porque não tem, por exemplo, sidebase, não tem fila MQ, etc.

Jesse Mouta Pereira Batista   3:02
Uh-huh.
Tá, não, beleza, tá aí na parte do ambiente, juntamente aqui com o Jefferson, a gente já, tipo assim, a gente vai ajustando tudo que vai aparecendo, né? Tipo, a gente já fez ajustes no True Software, SSO, cofre de senhas, né? É, tinha alguma algumas voltas cadastradas lá na 472.
a gente trouxe pra pra 471 pra poder fazer as aplicações, as propriedades das aplicações e alguns bancos eles estavam com credencial e endereços diferentes lá no 64. Então pelo lado aqui da DevOps, não temos mais pendência hoje.

Gustavo Duarte Lepesteur da Costa   3:35
Hum.

Jesse Mouta Pereira Batista   3:39
Travando nenhum deploy tudo isso, Gustavo, eram coisas que estavam travando o deploy, então aí a gente tentava subir um deploy e travava, a gente corrigia e aí via logo o seguinte, tinha aplicação que subia, mas outras aplicações não dava o erro. Foi o que eu te expliquei. A gente reporta na sala, passa aqui pra fábrica poder fazer a correção.

Gustavo Duarte Lepesteur da Costa   3:56
Mm-hmm.

Jesse Mouta Pereira Batista   3:59
Aí, o que a gente está dependendo da fábrica hoje? Hoje está parado o LCR, o Ciro, o Micael acabou de corrigir, então ele pode até tirar ele da lista aqui, logo a gente sobe o próximo deploy, vê se não vai dar nenhum erro. Se ele subir, a gente.
Já passa o feedback lá na sala também é no chat, mas é e o LCR ainda tá caindo algum por alguns ajustes ainda do CDI, do JPA. É, a gente já passou esse diagnóstico detalhado lá pro pessoal da fábrica.
Então eles estão vendo essa questão aí, é o Hub API, ele precisa ajustar algumas queries lá, né? Tipo o rural, o EMP e o empresas. É, eles estão com o time do CIP, então eles estão ajustando isso aí pra gente poder subir, né? E aí agora?

Gustavo Duarte Lepesteur da Costa   4:46
Eu vi que uma delas não é compatível com o Ubernate da versão do 74, não é isso?

Jesse Mouta Pereira Batista   4:50
Isso a maioria, a gente pegou uns 3, não foi Jefferson? Assim que não tinha compatibilidade com o Hyvernate lá da versão do 74. Aí a gente foi lá, apontou os ajustes e logo o pessoal da fábrica conseguiu desenrolar lá e saiu do outro lado. E aí é, tem um ponto em aberto, que é que é o do CCR.

Thiago Jeferson de Sousa Silva   4:56
Exact.

Gustavo Duarte Lepesteur da Costa   4:58
Mhm.

Jesse Mouta Pereira Batista   5:09
Que é o que eu tô investigando agora, porque ele tá é uma chamada lá pra eu conseguir nada, ela tá dando 401 no 74 e no 64 ela funciona, né? O que eu já verifiquei aqui, inclusive, foi até a última mensagem que eu acabei de enviar aí e até marquei o procote lá, é que o que eu verifiquei até agora, porque a configuração ele tá.

Gustavo Duarte Lepesteur da Costa   5:17
Mhm.

Jesse Mouta Pereira Batista   5:28
Igualzinha, ela tá igual, né? E aí o que eu tô vendo agora? Eu tô olhando a infraestrutura em volta, né? Então logo mais a gente deve ter um retorno sobre isso aí e a gente deve passar aí um feedback melhor aí pra pra saber o que que tá acontecendo.

Gustavo Duarte Lepesteur da Costa   5:40
Hum, mas 401 isso aí não é a gente indo lá no CSO com.
Porque, it's a token, a patentium, a da.

Jesse Mouta Pereira Batista   5:49
Token i isso eu pedi desculpa só eu pedi pro pro procote ele me passar qual o token que ele tava usando é o mesmo token

Gustavo Duarte Lepesteur da Costa   5:59
So.

Jesse Mouta Pereira Batista   5:59
Que ele usa lá do do do do CIP, mas é assim algo pra gente se investigar.

Gustavo Duarte Lepesteur da Costa   6:02
Será que não é a talvez chamar a galera de social porque às vezes é pela origem que está vindo e está tomando o que pode ser?

Jesse Mouta Pereira Batista   6:06
Pode ser exato, sim, pode ser isso. Então a assim, a ordem que a gente já havia Combinado com o Paulo, com o Rodrigo, é que primeiro a gente IA resolver o LCR, depois o CIP, e aí depois que a gente conseguir fechar o CCR também.

Gustavo Duarte Lepesteur da Costa   6:09
A.

Jesse Mouta Pereira Batista   6:23
E assim que as builds e os novos pacotes chegarem, a gente pode subir. E aí depois disso a gente segue com o restante da planilha, o Paulo e o Rodrigo tinham passado pra gente, pra gente finalizar a parte do intra. E em seguida, depois que a gente finalizar a parte do intra, a gente subir com os outros ambientes, que é o internet, o

Gustavo Duarte Lepesteur da Costa   6:37
Yeah.

Jesse Mouta Pereira Batista   6:43
TSSO e o API, né? Então, basicamente é isso, né? Do nosso lado, o ambiente tá tá em andamento aqui.

Gustavo Duarte Lepesteur da Costa   6:46
No.
É, mas a gente vem sendo um ambiente, eu acho que os outros vai ser só mais uma questão de replicação, trocar apontamento vai ser mais fácil de superar. Vocês adotaram basicamente realmente a estratégia que eu estava usando com o Murilo, a gente estava exatamente nessa mesma linha de atuação, de subir, pegar os erros, a gente tratar a Infra e o que não era Infra passar

Jesse Mouta Pereira Batista   6:52
Isso.
Exato.
Mhm.

Gustavo Duarte Lepesteur da Costa   7:08
Fábricas atuarem e o que era possível que atuava junto aqui em sala. Aí é só para dar ritmo. O Jessé, eu tava fazendo o quê? Eu tava entrando em sala com o Murilo passando o dia aqui com ele, cara. É especificamente nas segundas, quartas e sextas.

Jesse Mouta Pereira Batista   7:17
Sim.

Gustavo Duarte Lepesteur da Costa   7:25
Eu tô fazendo um curso que eu entro 15 horas, saio só 18 Então nos outros dias eu tô entrando umas 10:30 mais ou menos e aí tô tocando o dia inteiro e nesses dias do curso de 10:30 às 15 E aí cara, a gente vai fazendo junto porque aí se precisar de dúvida mais rápido eu chamo as pessoas, eu chamo a galera da fábrica, eu vou acionando, enfim.

Jesse Mouta Pereira Batista   7:29
Uh-huh.
Beleza.

Gustavo Duarte Lepesteur da Costa   7:43
É, a gente consegue talvez dar uma celeridade da gente fazer isso junto. Hoje não vai dar, porque daqui a pouco eu estou entrando no curso, é e amanhã a gente pode fazer isso. Se você estiver disponível aí para fazer isso, tá? É, tem um outro ponto que é esse. Eu vou ter que ainda discutir aqui.

Jesse Mouta Pereira Batista   7:47
So.
Uh-huh.
Tá.
Sim, podemos fazer sim.

Gustavo Duarte Lepesteur da Costa   8:00
Que é o seguinte, não, a segurança não está mais fazendo o vault, né? Eles, o vault, se vocês fizeram, vocês tiveram que botar provavelmente no modo de compatibilidade, né? Porque nesse de Boss 74, é pra ser o Elitron, né? Então assim, pra produção vai ter que migrar pro Elitron.

Jesse Mouta Pereira Batista   8:11
Isso.
Mm-hmm.

Gustavo Duarte Lepesteur da Costa   8:17
É, e aí eu vou ter que ver isso com a galera lá. Como é que vai ser isso? Porque a gente vai ter que fazer isso aqui e testar no nosso ambiente aqui. É porque hoje parece que a segurança não vai botar mais essas coisas em volte. Assim, óbvio que talvez, dependendo da criticidade aqui e dos prazos, a galera tente negociar.

Jesse Mouta Pereira Batista   8:24
Beleza.
Mhm.

Gustavo Duarte Lepesteur da Costa   8:35
Mas é provável que se negociar de qualquer forma, vai ter que assinar algum termo e para migrar, então vai ter que ser feito essa migração de toda forma. Só para vocês saberem que a gente vai ter que mudar, só para confirmar se vocês realmente fizeram isso, né? Tiveram que botar aquele mal de compatibilidade do Valdete antigo e tal.

Jesse Mouta Pereira Batista   8:46
Tranquilo.
Isso do volte antigo foi que ele estava lá na 472, né? Aí eu fui, peguei ele, coloquei no modo compatibilidade para poder funcionar aqui. Foi exatamente isso que a gente fez.

Gustavo Duarte Lepesteur da Costa   9:03
Beleza, então vou tratar essa discussão também amanhã, quando eu chegar, para a gente ver como a gente toca isso.

Jesse Mouta Pereira Batista   9:04
Anderson.
Tá tranquilo, beleza.

Gustavo Duarte Lepesteur da Costa   9:11
Show galera, então beleza. Tem alguma coisa que vocês precisam de alguma de algum suporte meu assim, tipo, pô, ver agiliza isso com alguma fábrica ou com a galera do a galera de segurança, alguma coisa do tipo, se precisar.

Jesse Mouta Pereira Batista   9:13
Tá, eu vou, vou.
Não, por enquanto tá tranquilo. Era só a questão mesmo lá do IP lá duplicado. Ele tava pegando o VIP antigo lá e é, mas aí o Paul Henrique já abriu o hack, já chamou o pessoal lá e eles já atenderam lá, já resolveu.

Gustavo Duarte Lepesteur da Costa   9:36
Ele ficou com a FQDN diferente do que tava o do CIP e do Jardim Boss 74. A gente tava usando migração CIP e aí ficou qual lá? O da esteira?

Jesse Mouta Pereira Batista   9:37
No.
Sim, sim.
Eu acho que ele ficou só ciente, né? Você lembra, Jefferson? Deixa eu dar uma olhada aqui.

Gustavo Duarte Lepesteur da Costa   9:50
Mas só sempre não era o original não do é porque assim a gente criou um ambiente paralelo para não desativar o que está funcional lá no 64, não é?

Thiago Jeferson de Sousa Silva   9:50
deixa pegar aqui

Gustavo Duarte Lepesteur da Costa   10:01
Eu imaginei que esse aí seria talvez o.

Jesse Mouta Pereira Batista   10:02
Okay.
Deixa eu dar uma olhada aqui na planilha aqui, se tem algum na.
anotação aqui
Hardware.
Sim.
Uh-huh.

Gustavo Duarte Lepesteur da Costa   10:30
mantém tudo jeito que estava lá.

Jesse Mouta Pereira Batista   10:33
Sim, entendi, sem muitas alterações, a gente só bastava.

Gustavo Duarte Lepesteur da Costa   10:37
E aí a gente só para os apontamentos do que estava no 6474 e pronto, está com o ambiente todo mundo apontando para o 74.

Jesse Mouta Pereira Batista   10:45
deixa eu dar uma olhada aqui rapidinho nessa questão que tudo não sei como que ele ficou

Thiago Jeferson de Sousa Silva   10:54
Aquele link que o Santos mandaram, que a gente olhou, que a gente pediu para excluir.

Jesse Mouta Pereira Batista   11:01
Sim.

Thiago Jeferson de Sousa Silva   11:03
Siempe.10 ponto cacho barra siempe.

Jesse Mouta Pereira Batista   11:06
Ele é, ele ficou então com esse contexto, né? Siemp.10 ponto caixa barra siemp.

Thiago Jeferson de Sousa Silva   11:11
I see.

Jesse Mouta Pereira Batista   11:35
É simp.10 ponto caixa, aí o outro é migração sifec.10 ponto caixa, e aí o login da Costa. Cada FQDN aqui, Gustavo, ele aponta para o IP, que é normalmente o VIP, que encaminha esses servidores.
Então foi o que a gente viu do lado do siemp, o FQDN siemp ponto 10 ponto caixa. Ele estava apontando para 2 IPs, e aí por isso que ele ficou intermitente. Então ele está com esse cara, simp ponto 10 ponto caixa.
Então é o FQDN de Produção, né? Sifec ponto do sifec intranet sifec.caixa sifec.prd.caixa do internet sifec.caixa.gov é e é isso do lado do CIP é.

Gustavo Duarte Lepesteur da Costa   12:22
Não, tranquilo, isso aí eu conheço tudo. Eu era da Produção, eu era da Produção do Crédito, tocava os Feq lá. Aí eu tô fazendo esse trabalho justamente por isso, porque eu conhecia todo esse ambiente de Infra, de Boss, etc. E aí acaba que eu vim pro time de 10 aqui e a galera me pediu pra apoiar com esse trabalho aqui. Então todo esse ambiente aqui.

Jesse Mouta Pereira Batista   12:27
Ah, então você já tá por dentro.
Mhm.

Gustavo Duarte Lepesteur da Costa   12:41
Que fui eu que criei junto com o Murilo e tal, eu que pedi esses vips todos, aí é só essa parte do AMP mesmo que eu tinha pedido, só que para o que estava no G Boss e a parte que fizeram na esteira eu acabei não participando, por isso que eu queria entender o que estava apontando para ela, porque se está apontando o CIP já, então.

Jesse Mouta Pereira Batista   12:46
Entendi.
Awesome.

Gustavo Duarte Lepesteur da Costa   12:59
O antigo não está mais usando, então já.

Jesse Mouta Pereira Batista   12:59
I do.
A gente pediu a URL customizada lá, criou o VIP, criou o certificado e andou. Ele já tá, já tá usando esse cara. Agora, você me fiquei com a dúvida aqui agora. Então, na hora da gente levar essa migração, na hora que for levar essa migração lá pra produção, cada um desses endereços ele vai.

Gustavo Duarte Lepesteur da Costa   13:18
Mm.

Jesse Mouta Pereira Batista   13:20
Ter que passar, apontar pra um ambiente novo no Jard

Gustavo Duarte Lepesteur da Costa   13:24
Não, então, qual que é a estratégia? Eles vão criar um ambiente paralelo do do Gisele Boss 74 lá, com a mesmo padrão de nome. Migração Cifec. Só que aí vai ser em vez de.10 você perder. Então, depois que tiver tudo pronto, migrado, testado, aí vai pegar os DNS atuais, tipo Cifec.caixa.

Jesse Mouta Pereira Batista   13:29
Uh-huh.
Entendi. Okay.

Gustavo Duarte Lepesteur da Costa   13:42
E apontar para o ambiente novo, em vez de apontar para o velho. É só fazer um redirecionamento de apontamento aí na rede. É a mesma ideia que a gente quer fazer aqui. Então quando a gente terminar tudo aqui e tiver tudo pronto, a esteira de 10 vai precisar usar esse ambiente. Hoje eles chamam-se FEC.

Jesse Mouta Pereira Batista   13:45
Bruno.
Beleza.

Gustavo Duarte Lepesteur da Costa   14:01
Um ponto ponto 10 ponto caixa, esse FAC 2.10 ponto caixa. Aí eles vão chamar esses mesmos endereço, mas eles vão começar a cair no 74 e parar de cair no 64. Essa é a ideia.

Jesse Mouta Pereira Batista   14:09
Uh-huh, entendi.
Não, entendi. Beleza, tranquilo, tá? Então, o Gagliardi, boa tarde, galera, tudo bem?

Flavio de Almeida Gagliardi   14:20
Opa, beleza, eu tô só aqui quietinho escutando aí a galera deliberar. Fala aí, Jose.

Jesse Mouta Pereira Batista   14:22
Beleza, pois é, é, beleza, não, acho que é, acho que é isso, né? Então, tá tranquilo, tem algum?

Gustavo Duarte Lepesteur da Costa   14:24
Mhm.

Flavio de Almeida Gagliardi   14:32
Não, cara, eu assim, eu estou com ciático atacado aqui, eu acho que eu vou dar um pulo no médico agora, tá? E demais aí, depois eu vou avisar a Patricia aqui todo mundo, porque vai ter uma apresentação lá dos plugins que o Leandro desenvolveu lá.

Jesse Mouta Pereira Batista   14:45
Ah, beleza.

Flavio de Almeida Gagliardi   14:49
Para a estrela do GitHub, que vai ser agora às 15:00, tá?

Jesse Mouta Pereira Batista   14:54
Ah, beleza.

Flavio de Almeida Gagliardi   14:54
Aí assim, o ideal aí é o maior número de participantes possível. Eu vou avisar lá a galera e qualquer coisa vocês podem me mandar mensagem ou tá no celular se for alguma coisa muito crítica.

Jesse Mouta Pereira Batista   14:58
You pass points.
Tranquilo, beleza.

Flavio de Almeida Gagliardi   15:07
This is pessoal. Valeu. Danielle. Tchau.

Gustavo Duarte Lepesteur da Costa   15:07
Beleza, melhoras.

Jesse Mouta Pereira Batista   15:08
Okay.
Melhoras aí, valeu, até mais beleza. Então Gustavo, a gente tá à disposição aí precisar chamar a gente, pode, pode acionar, tá? É, você falou que fazia com o Murilo em tela ali, né? Então a gente pode, pode tentar fazer, fazer também, mas é tranquilo, tá? A gente pode.

Gustavo Duarte Lepesteur da Costa   15:11
Valeu.
Tá bom, já tá.
Tá bom, amanhã a gente, amanhã entrando a gente começa a tocar aí o que você puder ir tocando aí desses deploits que você já tava fazendo, pode continuar e amanhã a gente continua de onde você terminou hoje.

Jesse Mouta Pereira Batista   15:27
tocar aí da mesma forma. Isso.
Stop.
Beleza, então.

Thiago Jeferson de Sousa Silva   15:37
Acabei de tentar o do Ciro aqui Gustavo deu erro, a gente vai analisar aqui e a gente escreve no chat o que aconteceu.

Gustavo Duarte Lepesteur da Costa   15:43
Fechou galera, obrigado viu.

Jesse Mouta Pereira Batista   15:45
Beleza, valeu Gustavo, valeu Rodrigo, valeu Jefferson, valeu!

Gustavo Duarte Lepesteur da Costa   15:46
Valeu pessoal, falou.

Rodrigo Abreu Costa   15:49
Wellington Hardware Saudis Pereira.

Gustavo Duarte Lepesteur da Costa   15:51
Other pessoal.

Jesse Mouta Pereira Batista   15:52
No.

Jesse Mouta Pereira Batista parou a transcrição
