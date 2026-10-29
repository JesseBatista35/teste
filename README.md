Reunião em [ADDR] SIGSJ - Pendências JBOSS-20261029_152953-Transcrição da Reunião 

29 de outubro de 2026, 06:29PM 

19m 48s 

 
Thiago Jeferson de Sousa Silva começou a transcrição 

 
Marcio Aparecido Sitoni   0:25 
Okay. Darden. 

 
Vitor Mendes Guedes   0:26 
Opa, boa tarde, Marcos, tudo bem, beleza? 

 
Jesse Mouta Pereira Batista   0:27 
Boa tarde. 
It is. 

 
Evandro Alves de Souza   0:29 
Boa tarde. 

 
Vitor Mendes Guedes   0:31 
Boa tarde Boa tarde Evandro Gisele Boa tarde tudo bem tudo bem 

 
Evandro Alves de Souza   0:33 
Tudo bem? 

 
Jesse Mouta Pereira Batista   0:35 
Boa tarde. 

 
Evandro Alves de Souza   0:42 
Está todo mundo aqui já? 

 
Thiago Jeferson de Sousa Silva   0:44 
Yeah. 

 
Vitor Mendes Guedes   0:45 
É sim, do nosso lado tá todo mundo aqui. 

 
Evandro Alves de Souza   0:47 
Ah, beleza. Então, gente, deixa eu compartilhar aqui para a gente já atacar esse problema aí para definir uma URL aqui de vocês. 
É o SIG SJ Intranet, né? 

 
Jesse Mouta Pereira Batista   1:05 
Is. 

 
Thiago Jeferson de Sousa Silva   1:06 
Okay. 

 
Vitor Mendes Guedes   1:10 
É, tem 2, tem Internet e Internet, não, mas não podemos falar da Internet primeiro. 

 
Evandro Alves de Souza   1:15 
Tá bom, vamos fazer a intranet primeiro, aí funcionando a gente replica para a internet. 

 
Vitor Mendes Guedes   1:22 
Então, beleza. 

 
Evandro Alves de Souza   1:23 
O que foi passado é que você está chamando a URL e não está direcionando lá para a VM. Ele está tentando acessar um endereço lá do openshift aqui do DevOps do. 
E não está conseguindo. Isso porque a gente precisa criar uma URL customizada. Aí queria falar com vocês. 
Para ver qual qual o nome vai ser, né? Porque hoje. 
Hoje ele está usando essa daqui, SIG SJ intranet ponto esteiras ponto 10 ponto caixa. 
É, será que a gente não poderia usar essa URL SIGSJ intranet.10 ponto caixa? 

 
Vitor Mendes Guedes   2:05 
Back. 

 
Evandro Alves de Souza   2:15 
O. 

 
Vitor Mendes Guedes   2:15 
Sim, pode sim. Pode say about. 

 
Evandro Alves de Souza   2:17 
Vamos fazer um teste nela aqui. 
ficaria sem essa esteiras aqui ó 
Só que aí ela não tem, ela não está definida aqui no DNS, então a gente pode usar ela. Só que aí vocês vão ter que pedir o certificado. 

 
Vitor Mendes Guedes   2:24 
Okay. 

 
Evandro Alves de Souza   2:41 
via te acho que é 109 deixa eu ver qual que é o te aqui que eu não lembro 
Não sei se quando perde certificado até 103 ou até 109, não lembro. 

 
Vitor Mendes Guedes   2:50 
Yes. 

 
Evandro Alves de Souza   2:56 
Deixa eu ver se eu tenho aqui anotado. 

 
Vitor Mendes Guedes   3:04 
Então tem que pedir uma URL customizada pros ambientes de desenvolvimento, então. 

 
Evandro Alves de Souza   3:09 
É para a gente fazer o apontamento depois que você pedir a URL, eles vão gerar o certificado para essa URL. A gente vai pedir um VIP exclusivo e aí vai pedir para 

 
Vitor Mendes Guedes   3:17 
Mhm. 

 
Evandro Alves de Souza   3:24 
Esse certificado ser instalado no VIP e depois a gente vai fazer o apontamento dessa URL no DNS, apontando para a VM. 

 
Vitor Mendes Guedes   3:34 
Entendi, tem que ver aqui como é que eu faço para pedir isso daí. Vocês tem algum algum alguma regra antiga que o pessoal atendeu? 

 
Evandro Alves de Souza   3:39 
É, deixa eu ver. 
Okay. 
É porque normalmente é a comunidade que pede, tá aí eu não vou ter uma aqui para de exemplo. Mas calma aí que se eu não achar aqui, eu acho que o Thiaguinho já fez isso daqui. Eu vou colocar ele na sala só para ele. 

 
Vitor Mendes Guedes   3:50 
Tá, não tá certo. 
Okay. 

 
Evandro Alves de Souza   4:03 
mostrar para a gente mas deixa eu ver aqui 
Okay. 
109 ou 103, eu não lembro. 
No work. 
E. 
I said to 
deixa eu colocar ele aqui na sala rapidão deixa eu ver se ele pode entrar 

 
Vitor Mendes Guedes   4:26 
No beatiza. 

 
Evandro Alves de Souza   4:57 
I'm sure I share you. 
Serv 
Aqui, gerar o certificado com a segurança, aí a gente cria o vip. 
Tá solicita aqui isso é a gente faz mesmo. Eu consigo fazer aqui com o pessoal da minha equipe. Aí a gente pede para balancear, alterar o no balanceador. 
E depois define no DNS. 
Para resolver para o para o. 
para o VIP para apontar para para VM 
Deixa eu ver aqui. 
Eu tenho um modelo de criação do VIP, tá vendo? No certificado eu acabei não anotando. 
Acho que o Tiago não entrou aqui, né? Acho que ele tá ocupado, deixa eu ver aqui. 
This is just to me aqui. 
Operacional. 
No. 
Perguntar para ele aqui, ele não entrou, mas não entrou não. Deixa eu mandar mensagem para ele. 
Vocês nunca pediram né certificado para nenhuma URL de projeto de vocês? 

 
Jesse Mouta Pereira Batista   7:17 
Não. 
Não sei se já pediu Jeff. 

 
Evandro Alves de Souza   7:24 
O. 
não é a comunidade viu é a comunidade é 

 
Jesse Mouta Pereira Batista   7:31 
a comunidade ah foi mal 

 
Evandro Alves de Souza   7:39 
Ah é é 079 cara, viajei. 
Jose, I should clock aqui, there. 
079 tá? 
Deixa eu procurar ela aqui só um minutinho. 
Aqui mesmo. 
Achei. Vamos lá. Você quer compartilhar a tela? Quem vai solicitar? 

 
Vitor Mendes Guedes   8:14 
Posso compartilhar, posso compartilhar. 

 
Evandro Alves de Souza   8:15 
Tá. 

 
Vitor Mendes Guedes   8:18 
Certo. 

 
Evandro Alves de Souza   8:20 
Isso. 

 
Vitor Mendes Guedes   8:20 
I don't service to the caixa. 

 
Evandro Alves de Souza   8:22 
Isso. 
Aí você pode ir isso aí mesmo, fica essa solicitação. 

 
Vitor Mendes Guedes   8:31 
Oxe, está meio lento aqui. 
And. 
aqui de tecnologia, informação. 

 
Evandro Alves de Souza   8:40 
É ali, ó, na já procura ali em cima, na lupinha, pode colocar até 079 lá direto aí. 

 
Vitor Mendes Guedes   8:41 
So. 
That. 
Central aparece aqui embaixo. 

 
Evandro Alves de Souza   8:51 
Isso, ele vai aparecer ali, cadê? 
Obter, instalar certificado digital não resistente, solicitar certificado digital, acho que é aquele ali, é esse aí. 

 
Vitor Mendes Guedes   9:01 
Acho que dá mais a seguir o que que é isso aqui. 

 
Evandro Alves de Souza   9:03 
É. 
Isso aí mesmo. 

 
Vitor Mendes Guedes   9:07 
Ah, tá, entendi. Yeah. 

 
Evandro Alves de Souza   9:09 
Tá? Aí vocês vão ter que preencher, eu vou postar aqui o nome que a gente definiu aqui, tá? 

 
Vitor Mendes Guedes   9:15 
Central. 

 
Evandro Alves de Souza   9:17 
Para você solicitar o certificado para esse nome aqui? 

 
Vitor Mendes Guedes   9:22 
Okay. 

 
Evandro Alves de Souza   9:22 
Cadê a Salles CJ? 
Central Central. 
Okay, LTG. 
Certificado é 079. 
Hello! 
Oh, way early. 
Hey. 

 
Vitor Mendes Guedes   9:48 
Ah tá, então isso aqui seria a URL customizada, eu tenho que colocar aqui. 

 
Evandro Alves de Souza   9:53 
Isso. 

 
Vitor Mendes Guedes   9:55 
Aí é sem a data depende nada, só isso, né? 

 
Evandro Alves de Souza   9:55 
Hello! 

 
Vitor Mendes Guedes   10:03 
Uh-huh, sex. 

 
Evandro Alves de Souza   10:03 
É sim. 
Se você quiser colocar, eles vão ignorar, eu acho. Mas o que aqui é só URL? Preencha os Campos abaixo, tal beleza. Aí esses daí de cima não preenche isso aí, só informação. 

 
Vitor Mendes Guedes   10:06 
Yeah. 
Mhm. 
Okay. 
Não é isso, só informação isso. 

 
Evandro Alves de Souza   10:20 
Tá ficado baixo, tá? 

 
Vitor Mendes Guedes   10:23 
Agora, autoridade certificadora isso aqui que. 

 
Evandro Alves de Souza   10:27 
É AC interna. 

 
Vitor Mendes Guedes   10:29 
A Central, tá? Beleza, ambiente 10, né? 

 
Evandro Alves de Souza   10:30 
Yeah. 
Isso. 

 
Vitor Mendes Guedes   10:34 
Central sistema de laboratório de laboratório de laboratório de laboratório. 

 
Evandro Alves de Souza   10:39 
Isso. 

 
Vitor Mendes Guedes   10:43 
Informe o local de instauração. 

 
Evandro Alves de Souza   10:47 
É, ele é back end, é calma aí, é no certifique. Essa URL vai ser no balanceador. 

 
Vitor Mendes Guedes   10:58 
A abalançador, né? E isso aqui informa o seu CSR, que de Serviços ficar, será emitido pela caixa. Acho que é assim, né? Não sei. 

 
Evandro Alves de Souza   10:59 
É. 
Sim, é, não é a caixa que está emitindo. É que antes tinha outras, tinha veris, tinha um Monte aí, mas a caixa começou a emitir também. 

 
Vitor Mendes Guedes   11:10 
Tá. 
Ah tá, informa outro local de instalação, colocar não né que eu acho que isso aqui tá. 

 
Evandro Alves de Souza   11:23 
É qualquer coisa, depois que gerar o certificado, a gente vai ter que abrir a requisição para a rede para instalar lá no VIP. Então não vai ser por essa daí não. Aí vai ser, mas só para segurança, para gerar o certificado mesmo. 

 
Vitor Mendes Guedes   11:37 
Ah, tá, então aqui eu vou colocar umas. 

 
Evandro Alves de Souza   11:40 
I collect on. 

 
Vitor Mendes Guedes   11:41 
I wasn't about that. 
Martins de pois. 

 
Evandro Alves de Souza   11:49 
da 

 
Vitor Mendes Guedes   11:50 
Nota. 
Instalar na caixinha. 

 
Evandro Alves de Souza   11:55 
Informar, informar se o certificado será instalado na caixa, sim. 

 
Vitor Mendes Guedes   12:00 
Aqui está pequeno de laboratório. 

 
Evandro Alves de Souza   12:05 
Kaishamen. 

 
Vitor Mendes Guedes   12:06 
Contratos Mendes. 

 
Evandro Alves de Souza   12:07 
Yeah. 

 
Vitor Mendes Guedes   12:08 
So it sounds like a cash ****. 
He sake. 

 
Evandro Alves de Souza   12:14 
Testes Feak Organizacional. 

 
Vitor Mendes Guedes   12:18 
Yes, deixa eu ver se aparece aqui. 
A. 

 
Evandro Alves de Souza   12:25 
Aparece. 

 
Vitor Mendes Guedes   12:26 
Aparecido pelo Suporte, Qualidade de Souza? 
No. 

 
Evandro Alves de Souza   12:37 
Mhm. 
Acho que é isso aí. 

 
Vitor Mendes Guedes   12:40 
So isso, né? Certificar in planet e dance. 

 
Evandro Alves de Souza   12:43 
É isso aí. 

 
Vitor Mendes Guedes   12:44 
A Central de Central de Central de Central de Central de Central de Central de Central de Central de Central de Central de Central de Central de Central de Central de Central de Central de Central de Central de CI 
Ohh, don't react only from this. 

 
Evandro Alves de Souza   13:03 
Ele vai gerar uma rec, aí você cola aqui isso para a gente ir acompanhando, porque a segurança deve aprovar e gerar o certificado. Aí eles atendendo essa rec, a gente já pede. 

 
Vitor Mendes Guedes   13:04 
Machado. 
Yeah. 
Ah, no, beleza. 

 
Evandro Alves de Souza   13:18 
Já pede para gerar o VIP, instalação de um VIP específico e manda o certificado para ser instalado lá no VIP. Depois a gente muda no DNS para fazer o balanceamento direto para o servidor. 

 
Vitor Mendes Guedes   13:30 
No. 
Não, beleza. A gente já posso pedir para criar da internet ou você acha que eu vou aguardar? 

 
Evandro Alves de Souza   13:45 
Ah, vai ser o mesmo nome, não vai? Só trocando a internet ali, não é? Pode pedir, porque já vai adiantando para vocês aí. 

 
Vitor Mendes Guedes   13:47 
É, eu sou a Internet, isso até pode colocar aqui, deixa eu colocar aqui. 
Internet. 
I think so, but it serves toughly, I see. 

 
Evandro Alves de Souza   14:01 
porque esses servidores vai ser tudo né conforme a gente já tinha visto lá atrás né eles vão fazer front e back junto né então é isso mesmo 

 
Vitor Mendes Guedes   14:11 
He's a mess. 
Você ligar a internet 10 ponto caixa. 
É isso mesmo, acho que não mudou nada. 
Operacional quiz. Operacional put. 

 
Evandro Alves de Souza   14:26 
Or internet discussion, it is. 

 
Vitor Mendes Guedes   14:33 
Agora está pedindo um Monte de coisa. 
What a. 

 
Evandro Alves de Souza   14:36 
A data. 
Pode até prorrogar mais um pouco essa daí, sei lá. 

 
Vitor Mendes Guedes   14:42 
Central Plat King. 
Congress 
That's since you're done. 
I wish you want. 
I thought that would be to serve saying that. 

 
Evandro Alves de Souza   15:20 
É no legado, vocês acessavam a URL como a aplicação por qual URL? 

 
Vitor Mendes Guedes   15:28 
Then, deixa eu ver the bullet service, né? 
Deixa eu ver aqui, está falando aplicação do legado, é o legal, a gente acessa a via via MP, não é? 

 
Evandro Alves de Souza   15:32 
Mm. 
Yeah. 
Ah, era IP que vocês colocavam lá, mas isso em desenvolvimento, né? E em produção? Produção tinha que ter URL, né? Qual que era? Não? 

 
Vitor Mendes Guedes   15:40 
Yeah. 
He is rooming to you so. 
Não, em produção tem que ter esse desenvolvimento, né? Em Produção a gente tem siga-se J. Pereira deixa eu ver aqui. 
Central. 
A mente aqui. 
Aqui em Produção fica assim, siga-se J.caixa vai direto, a gente tem duas. Isso aí quando é. 

 
Evandro Alves de Souza   16:11 
Ah tá direto tá ponto caixa é intranet tá 
Aí você muda o contexto ali. 

 
Vitor Mendes Guedes   16:19 
É isso, isso é internet, né? Agora a internet. 

 
Evandro Alves de Souza   16:24 
Acho que é o contexto do jeito que estava lá. 

 
Vitor Mendes Guedes   16:27 
É, só que ele tem um outro nome, público, né? 
Depósitos judicial aqui. 
Depósitos judicial ponto caixa, seguindo a internet principal. 

 
Evandro Alves de Souza   16:39 
Hmm, tá, tá, entendi. 

 
Vitor Mendes Guedes   16:41 
É que essa aqui é da tá na internet, né? 

 
Evandro Alves de Souza   16:44 
Então no internet é deposito Judicial caixa govbr, tá? 

 
Vitor Mendes Guedes   16:49 
colocar aqui no chat só pra gente 
More. 
Sister. 

 
Evandro Alves de Souza   17:06 
A Gisele já colocou boleto também ali, o boleto também vai precisar. 

 
Vitor Mendes Guedes   17:09 
É, tem um boleto, você vai precisar, só que um boleto. 
In 10. 
A gente não acessa o RL de Beto, né? A gente 

 
Evandro Alves de Souza   17:20 
Ele, vocês vão chamar, vocês vão chamar o módulo. 

 
Vitor Mendes Guedes   17:22 
É tem uma aplicação. 
É, a gente tem uma outra aplicação que chama módulo. 
Bora, pois agora para saber qual que é. 

 
Evandro Alves de Souza   17:31 
Não, tudo bem. 

 
Vitor Mendes Guedes   17:37 
Como é que a gente chama esse modo? Você lembra Gisele, como é que faz? 
pessoal tem em casa aqui 

 
Gisele Cristina Dias   17:48 
Vitor service, eu não sei quem chamam. 

 
Vitor Mendes Guedes   17:51 
É o é o broker que chama a gente. Depois a gente vai ter que pensar nisso, né? Mas deixa eu ver se eu tenho alguma conversa que o pessoal tá. 

 
Gisele Cristina Dias   17:59 
Eu sei que eu tive que migrar também, eu vou ver tu service, mas eu não sei quem chama. 

 
Vitor Mendes Guedes   18:06 
Over a key. 
Agora que a gente precisa dessa forma, não acha, é. 
Rush. 
É, eu vou procurar aqui o Evandro, tá? Como é que faz? E aí a gente eu aí eu abro a REC, né? 

 
Evandro Alves de Souza   18:32 
Não, tranquilo. 
Se precisar de URL, que se for interno, chamada de um módulo para o outro, uma aplicação para o outro, acho que não vai precisar não. 

 
Vitor Mendes Guedes   18:44 
Certo, não, beleza. Então acho que vamos pesquisar aqui, né? É como é que a gente chama, né? E aí, mas eu vou até já pedir também, não é para não, eu vou dar, vou dar um tempinho, mas eu vou dar uma olhada, vou dar pesquisada, né? Análise, mas já foi aberto então as Sex aqui do. 

 
Evandro Alves de Souza   18:48 
Stop. 

 
Vitor Mendes Guedes   19:01 
Do internet, da internet, né? E aí a gente coloquei aqui, né? Aí dá para acompanhar, né? 

 
Evandro Alves de Souza   19:03 
So. 
Sim, vamos acompanhando e aí a gente vai postando na sala aqui que que foi atendido. E aí quando eu pedi o VIP, eu posto a reg do VIP aqui. O pessoal aí atendendo, tá bom? Então acho que isso aí, pessoal. 

 
Vitor Mendes Guedes   19:09 
Video. 
Não, beleza. 
Não, beleza, beleza, Evandro, te agradeço aí. 
Beleza. 

 
Evandro Alves de Souza   19:25 
Jessé, eu vou montar uma sala com você, o Rainan, Rainan, não é? Raini, Raini, isso da nossa equipe lá, beleza? Valeu. Valeu, pessoal. 

 
Jesse Mouta Pereira Batista   19:26 
Oy, Evandro. 
I knew. 
Beleza, beleza. 
Valeu, valeu, valeu. 

 
Vitor Mendes Guedes   19:37 
Beleza pessoal agradeço Gisele, Marcio, Gisele, Thiago, obrigado, viu? Tchau, tchau. 

 
Thiago Jeferson de Sousa Silva   19:40 
Central Central. 

 
Jesse Mouta Pereira Batista   19:41 
Valeu, obrigado, Marcio. Até mais. Valeu. 

 
Evandro Alves de Souza   19:41 
Obrigado, pessoal. Até mais. Valeu, tchau. 

 
Thiago Jeferson de Sousa Silva   19:42 
Operacional. 

 
Thiago Jeferson de Sousa Silva parou a transcrição 
