<img width="1878" height="906" alt="image" src="https://github.com/user-attachments/assets/41a67aaf-efe9-46e9-bce7-0747772e4351" />


Reunião em [ADDR] SIGSJ - Pendências JBOSS-20261125_161855-Transcrição da Reunião 

25 de novembro de 2026, 07:18PM 

 
Thiago Jeferson de Sousa Silva começou a transcrição 

 
Jesse Mouta Pereira Batista   0:03 
variável, ou seja, todas essas variáveis aqui, elas vão ter que estar em todas as lives, tanto de 10 como de TQS, como de HMP e de produção. Beleza, isso aí a gente já tá ajustando, o Vitor já me passou de HMP, a gente vai fazer aí agora a questão é o seguinte sobre a release, aí a Gisele sugeriu. 

 
Marcio Aparecido Sitoni   0:09 
Fiona. 
Operacional. 

 
Jesse Mouta Pereira Batista   0:19 
De vocês fazerem essa troca também na library, em vez de toda vez entrar aqui no rap de Configuração e trocar a versão, a gente faria uma library aqui. Deixa eu, eu acabei fechando, deixa eu abrir aqui outra. 

 
Marcio Aparecido Sitoni   0:24 
Don't like playing now. 

 
Jesse Mouta Pereira Batista   0:34 
PJ. 

 
Marcio Aparecido Sitoni   0:35 
No. 
Thank you. 

 
Jesse Mouta Pereira Batista   0:37 
A Sandra Sandra. 
Como eu intranet Internet é aqui ó. 

 
Marcio Aparecido Sitoni   0:42 
Okay. 
I'll go, I need some option. 

 
Jesse Mouta Pereira Batista   0:47 
Toda vez que precisar trocar, aí vocês teriam que entrar aqui, aí teria uma variável dessa SIGS SJ release 1.13.0. Aí vocês viriam aqui e trocava e aí eu chamei vocês em sala para ajudar a decidir o seguinte. 

 
Marcio Aparecido Sitoni   0:59 
Mhm. 

 
Jesse Mouta Pereira Batista   1:02 
Eh. 
Vocês acham interessante colocar uma versão para cada ou a gente cria uma library só com todos os stages para aplicar, já que vocês usam a mesma versão em todos? Aí a gente criaria uma library aqui, por exemplo, Siga SJ. 

 
Marcio Aparecido Sitoni   1:06 
So. 
Happy deal. 
No. 
Sandra Fernando Central. 

 
Jesse Mouta Pereira Batista   1:20 
É intranet release, aí dentro dessa library teria a variável siga SJ release com a versão aqui dentro, e aí em todos os escopos, praticamente como está aqui, 10 TQS, HMP e Produção, ou preferem que a gente crie a variável aqui dentro mesmo. 

 
Marcio Aparecido Sitoni   1:24 
I. 

 
Jesse Mouta Pereira Batista   1:38 
E aí toda vez que vocês rodar 10, uma não é essa versão, quero aqui, não quero uma versão diferente de TQS para a gente testar aqui. Aí vocês vieriam aqui e trocaria a versão. Aí essa tomada de decisões aí com vocês. 

 
Marcio Aparecido Sitoni   1:50 
Eu acho que tem que ser. Eu acho que tem que ser separado. Como você falou aí, TQS, você cria uma variável em 10. 

 
Vitor Mendes Guedes   1:55 
Isso mesmo. 

 
Jesse Mouta Pereira Batista   1:55 
Mhm. 
Mm-hmm. 

 
Thiago Jeferson de Sousa Silva   2:01 
Joseph. 

 
Vitor Mendes Guedes   2:01 
Eu acho que tem que separado também, tá? Acho que a gente tem que preencher na Liba ali mesmo, né? 

 
Thiago Jeferson de Sousa Silva   2:03 
Não, não daria, não daria. Jesus, desculpa, pessoal, daria para colocar no pipeline by Valderci Jose. 

 
Jesse Mouta Pereira Batista   2:07 
Pode falar. 
Dá também, tu fala aqui? 

 
Thiago Jeferson de Sousa Silva   2:13 
Até mais é aí marca essa caixinha azul. 

 
Jesse Mouta Pereira Batista   2:15 
Dá, dá, dá também. 
botar como é a gente pode fazer aqui ó que eu já estou falando é o seguinte colocar aqui é por exemplo SIG 

 
Thiago Jeferson de Sousa Silva   2:18 
Querem? 
Martins. 

 
Jesse Mouta Pereira Batista   2:27 
Siga SJ. Agora tem que ver se ele lê lá, Jefferson, mas é uma boa. O que ele está falando é isso aqui. Vamos lá. Siga SJ. 

 
Thiago Jeferson de Sousa Silva   2:30 
Okay. 

 
Marcio Aparecido Sitoni   2:30 
Okay. 

 
Jesse Mouta Pereira Batista   2:38 
Aí, por exemplo, aqui já está em todos os escopos, aí aqui a gente ia vir aqui e deixar o valor em branco e marcar esse cara aqui. Aí só mostrar pra vocês aqui como é que ficaria. Aí toda vez antes de rodar, que fica até mais fácil, tá vendo aqui? Vocês vem aqui e coloca a versão. 

 
Marcio Aparecido Sitoni   2:41 
Operacional. 
At DJ. 
Tell me, don't say kick them. 

 
Jesse Mouta Pereira Batista   2:57 
Entendeu? 

 
Vitor Mendes Guedes   2:57 
É, beleza, aí eu poderia executar, por exemplo, eu executo em 10, eu coloco uma versão, eu quero uma outra versão em TQS, eu consigo mudar. 

 
Jesse Mouta Pereira Batista   2:59 
Eu só preciso 
Isso aí, na hora de executar aqui, na hora de escolher aqui, aí você escolhe a versão aqui, entendeu? Isso é independente do da pipeline, da versão que tá rodando aqui na pipeline. É isso aqui, a gente tá falando da versão do projeto, entendeu? Porque, por exemplo, não, eu subi uma versão nova aqui, a versão 14. 

 
Vitor Mendes Guedes   3:11 
Ah, entendi. 

 
Marcio Aparecido Sitoni   3:14 
No. 
I love it. 
Sandra. 

 
Vitor Mendes Guedes   3:20 
That. 

 
Marcio Aparecido Sitoni   3:24 
No. 

 
Jesse Mouta Pereira Batista   3:24 
É ponto zero, né? Eu subi a versão nova aqui é a versão 14, aí eu quero, mas eu quero que ela rode só em. 
Em 10, aí você vem aqui, bota aqui, não vou botar aqui só e vou escolher só o stage de 10 aqui e vou rodar só ele, entendeu? 

 
Marcio Aparecido Sitoni   3:38 
No, it's pergunted. 

 
Jesse Mouta Pereira Batista   3:44 
Aí fica, vai ficar bem parecido aqui, gente, com o mobile, o mobile, ele funciona assim hoje, né? O mobile, ele, ele tem essa versão aí, seleciona qual a versão que você quer mandar pro firebase, qual a versão que você quer mandar pro. 

 
Vitor Mendes Guedes   3:45 
No, I think Jesus got the 

 
Marcio Aparecido Sitoni   3:51 
No. 
No. 

 
Jesse Mouta Pereira Batista   3:59 
Coisa, só que assim, eu só preciso saber depois que a gente sair da sala aqui, se ele consegue enxergar esse cara aqui dentro, entendeu? Se ele conseguir, porque a é automaticamente, atualmente a esteira, ela lê as properties. 

 
Marcio Aparecido Sitoni   4:04 
Central Central Central Central Central Central Central Central Central Central Central Central Central Central Central Cent 
You too, Jesus. 

 
Jesse Mouta Pereira Batista   4:15 
Dentro do da execução das libraries, beleza, isso está funcionando. A gente já validou aqui e conseguiu passar. Agora, o que a gente precisa saber é se realmente a gente consegue colocar aqui como. 
Como setable né na release e é interessante que fica, fica tudo certinho, né? 

 
Marcio Aparecido Sitoni   4:34 
É, eu tinha que fazer isso é obrigatório, tá? Porque se não precisou. 

 
Vitor Mendes Guedes   4:34 
My. 

 
Jesse Mouta Pereira Batista   4:37 
Isso aí fico, fico, tá automaticamente quando marcar aqui, não, ele não vai ficar obrigatório. 
anão ser. 
É, deixa eu ver. 

 
Thiago Jeferson de Sousa Silva   4:49 
Se desmarcar, ele fica obrigatório. 

 
Marcio Aparecido Sitoni   4:51 
Okay. 

 
Jesse Mouta Pereira Batista   4:52 
Se desmarcar aqui. 

 
Thiago Jeferson de Sousa Silva   4:53 
Alright, if it is. 

 
Jesse Mouta Pereira Batista   4:54 
Não, ele vai para release, mas aí, mas aí, por exemplo, ele não, ele vai salvar sem valor. 

 
Thiago Jeferson de Sousa Silva   4:57 
Exactly. 

 
Jesse Mouta Pereira Batista   5:02 
Só tirar essa dúvida aqui. Ó, ele não vem pra cá, a gente tem que marcar pra ele poder vir pra cá, entendeu? 
Tem que deixar ele aqui marcado. E aí que aconte é aí vai. Deixa eu falar isso pra vocês. Isso é interessante, Márcio? Porque é o seguinte. 

 
Marcio Aparecido Sitoni   5:15 
Operacional. 
Couldn't go to this one? 

 
Jesse Mouta Pereira Batista   5:19 
Se ele não subir sem nenhuma versão, ela quebra, entendeu? E meio que vai ficar obrigatório. Agora é se ele se ele subir sem nada, entendeu? Mas eu acho que ele tem que ficar marcado Jesus para ele poder aparecer. anão ser que a gente possa criar aqui uma. 

 
Marcio Aparecido Sitoni   5:20 
Contratos. 
Central dealking. 
Thank you. 

 
Jesse Mouta Pereira Batista   5:36 
Coloca algum caminho como Truer lá dentro da library e aí a gente deixa ele desmarcado, aí ele fica obrigatório. 

 
Marcio Aparecido Sitoni   5:37 
Operacional Sandra Hai Sandra. 
Jesus. 

 
Jesse Mouta Pereira Batista   5:43 
Entendeu? Vamos pensar aqui numa forma. Eu vou, eu vou excluir aqui e a gente pode pensar numa forma. Mas bem, pessoal, é isso. E aí, sobre o HMP? 

 
Marcio Aparecido Sitoni   5:46 
Jesus. 

 
Jesse Mouta Pereira Batista   5:55 
Que eu queria ver, eu até anotei aqui, deixa eu só pegar aqui rapidinho, cadê, cadê? 
É porque ele não roda no. 
O Vitor falou que que vocês não usam o B2B lá, né? 

 
Marcio Aparecido Sitoni   6:18 
Okay. 

 
Vitor Mendes Guedes   6:21 
É, na verdade, é o próprio sistema B2B que não tem RMP, tá? Não é que a gente não tem, é assim, pode colocar a variável que está em desenvolvimento, tá? Caso haja necessidade, pode colocar, é, vou colocar. 

 
Jesse Mouta Pereira Batista   6:25 
Ah, ele não tem. Entendi. 

 
Marcio Aparecido Sitoni   6:27 
Okay. 
Jesus. 

 
Jesse Mouta Pereira Batista   6:33 
Isso foi o que era exatamente isso, né? E é as 2 dúvidas, né? Como ele, como ele não tem o B2B properties, né? Então ele não, ele não passa, não roda em HMP. E aí, como é que a esteira, ela vai entregar esses, como a esteira, ela entrega esses 3 arquivos para o ambiente? 
Aí o que você prefere pro HMP? É, a gente não entrega o B2B property sem HMP ou entrega mesmo sem uso, porque se a gente entregar mesmo sem o valor, vai vir com token vazio. 

 
Marcio Aparecido Sitoni   6:54 
Okay. 
Okay. 
Okay. 

 
Vitor Mendes Guedes   7:00 
Nine. 
É, acho que é melhor que legal mesmo, sem uso, tá? Sem uso, porque aí depois, uma hora o B2B end lega MP, eu acredito que não vai acontecer, mas pode ser que ele entra e a gente precisa fazer nada, né? E aí o valor pode ser o meu valor de desenvolvimento, tá? Acho que. 

 
Jesse Mouta Pereira Batista   7:08 
Sem uso. 
Beleza. 

 
Marcio Aparecido Sitoni   7:12 
Central Central Central Central Central Central Central Central Central Central Central Central. 

 
Jesse Mouta Pereira Batista   7:17 
Uh-huh. 

 
Vitor Mendes Guedes   7:22 
Nossa aplicação pode mandar eu e a MPE, mas já está dando um erro hoje mesmo, né? Porque não tem a MPE, então pode colocar o R e desenvolvimento, tá? 

 
Marcio Aparecido Sitoni   7:26 
Operacional. 

 
Jesse Mouta Pereira Batista   7:29 
Isso. 
Tá, beleza, então a gente vai colocar agora só outra coisa sobre o config.properties, lá do HMP que você mandou, ele não tem a linha do SIGSJ ambiente. Por exemplo, em 10 lá ela tem SIGSJ.ambiente, recebe 10. 

 
Marcio Aparecido Sitoni   7:32 
Central. 
Okay, that's possible. 
I. 

 
Jesse Mouta Pereira Batista   7:48 
E em HMP é pra ter esse ambiente, por exemplo, HMP também, ou a aplicação em HMP? Ela não usa essa propriedade. 

 
Marcio Aparecido Sitoni   7:55 
Okay. 
No, no. 

 
Vitor Mendes Guedes   7:59 
Eu acho que pode colocar, tá? Acho que a aplicação ela tenta ler, acho que dá erro, mas ela continua, né? Ela não ignora, né? Eu acho que pode colocar sim, tá? Acho que deveria ter colocado o siga SJ, ambiente e HMP, tá? 

 
Jesse Mouta Pereira Batista   8:08 
Isso, isso. 

 
Marcio Aparecido Sitoni   8:10 
I think that it's done. 

 
Jesse Mouta Pereira Batista   8:11 
Ah. 

 
Marcio Aparecido Sitoni   8:13 
Jesus. 

 
Jesse Mouta Pereira Batista   8:15 
Isso beleza, igual está aqui, a variável está aqui, aí ela chama esse cara aqui. 

 
Vitor Mendes Guedes   8:15 
Aplicação. 
Yeah. 

 
Jesse Mouta Pereira Batista   8:23 
Ela chama esse cara aqui, aí a gente vai, eu vou colocar então a variável aqui e vou botar ele pra entregar a MPE aí sobre o B2B, eu vou colocar algo aqui pra ele entregar lá, mas não vai funcionar, só pra ela não ficar um valor vazio, beleza? 

 
Marcio Aparecido Sitoni   8:27 
I see. 
Central. 

 
Vitor Mendes Guedes   8:35 
Tell, pode colocar não definido, nem alguma coisa assim. Acho que até melhor não definido, não definido aí, mas é bom a gente estar. 

 
Jesse Mouta Pereira Batista   8:39 
Tá. 

 
Marcio Aparecido Sitoni   8:40 
O. 
Yes. 

 
Vitor Mendes Guedes   8:47 
Com uma forma de preencher, porque às vezes eu a MPE, apesar de achar que isso não acontecer, mas ele entra e a gente não precisa adaptar nada, já ficar, já ficar criado lá. 

 
Marcio Aparecido Sitoni   8:51 
Okay. 

 
Jesse Mouta Pereira Batista   8:54 
Mhm. 
Beleza, fechado. Então eu vou ajustar aqui com o Gerson aqui. Vamos estudar aqui um pouco Gerson pra gente ver qual a melhor forma sobre a questão da versão. E aí logo a gente passa pra vocês lá na sala lá. E aí eu já vou preencher aqui o de gmp. Aí quando você mandar os outros aí a gente já faz também. 

 
Vitor Mendes Guedes   8:58 
Central. 

 
Marcio Aparecido Sitoni   9:11 
Sandra. 

 
Jesse Mouta Pereira Batista   9:12 
Beleza. 

 
Vitor Mendes Guedes   9:13 
No, videos are it. 

 
Thiago Jeferson de Sousa Silva   9:13 
A gente vai ver também direitinho, pessoal, se realmente essa variável tem como surtir efeito no pipeline de variables. 

 
Vitor Mendes Guedes   9:18 
Central. 

 
Jesse Mouta Pereira Batista   9:22 
Is. 
Mm. 

 
Vitor Mendes Guedes   9:25 
Não, okay, não, beleza. 

 
Jesse Mouta Pereira Batista   9:27 
Lisa. 

 
Marcio Aparecido Sitoni   9:27 
It's good value full spot. 

 
Gisele Cristina Dias   9:29 
Jose. 

 
Jesse Mouta Pereira Batista   9:31 
Então, fechou. Oi. 

 
Marcio Aparecido Sitoni   9:31 
Processamento. 

 
Gisele Cristina Dias   9:32 
É, deu um erro aqui, eu tentei executar a release, aproveitando aí. 

 
Marcio Aparecido Sitoni   9:33 
Same. 
Jesus. 

 
Jesse Mouta Pereira Batista   9:37 
Ah, sim. 

 
Marcio Aparecido Sitoni   9:38 
Contratos. 

 
Gisele Cristina Dias   9:38 
Aí você poderia dar uma olhadinha? 

 
Marcio Aparecido Sitoni   9:41 
Cordy PJ Sandra Martins Sandra Sandra Sandra Sandra. 

 
Jesse Mouta Pereira Batista   9:42 
Oh, vejo sim, ele deu falha aqui, tá? Eu vou dar uma olhadinha aqui, eu já te passo aqui do intranet, né? É, tá, beleza, eu já verifico aqui, já te passo lá, tá? 

 
Gisele Cristina Dias   9:44 
Operacional. 

 
Marcio Aparecido Sitoni   9:46 
Salles. 

 
Gisele Cristina Dias   9:49 
Tranet isso. 

 
Marcio Aparecido Sitoni   9:50 
He's a 

 
Gisele Cristina Dias   9:54 
Tá bom, obrigada. 

 
Jesse Mouta Pereira Batista   9:55 
Valeu! Então é isso pessoal, qualquer coisa pode chamar a gente aqui. 

 
Marcio Aparecido Sitoni   9:56 
I don't know. 

 
Jesse Mouta Pereira Batista   10:02 
Valeu, obrigado, obrigado Márcio, valeu Jefferson, valeu Gisele. 

 
Vitor Mendes Guedes   10:06 
Boa tarde, bom trabalho a todos. Tchau tchau. 

 
Gisele Cristina Dias   10:06 
Obrigada, gente. 

 
Jesse Mouta Pereira Batista   10:08 
atrás 

 
Marcio Aparecido Sitoni   10:08 
Okay. 

 
Thiago Jeferson de Sousa Silva parou a transcrição 
