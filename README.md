No caso ambos os alias estão preenchidos, não são NULL.  Porém não utilizamos alias no Java, apenas fazemos o load do certificado, esse load aparentemente não teve erro. Para isso poderíamos observar se tem erro no load durante o restart do JBOSS em TQS, pois o certificado é confiruado uma única vez depois fica em memória no Java.
 
o erro no initialize contexto pode ser observado melhor no debug do ssl no ambiente do JBOSS. 
Jesse Mouta Pereira Batista a estrutura do certificado é a mesma ? só mudou a validade para a nova, é isso ?
 
derrepente seria uma boa manter o mesmo alias do anterior, poderia deletar o antigo e adicionar o novo, também pode comparar o novo com o antigo e verificar se faltou alguma informação que esteja como NULL.
 
 
Jesse Mouta Pereira Batista como o ambiente é de teste, vc poderia me passar os certificados que eu adiciono no meu ambiente para testar aqui no meu JBOSS local
 
Marco Antonio Paranhos Silva
📷
aqui fazemos o load do certificado em memória durante a subida do projeto no load do JBOSS ao estartar a aplicação ele sobe a API em tempo de start 
 
No java não se faz leitura de dados do certificado, aqui apenas carrega o certificado na JVM , tudo é feito pelo processo de comunicação do JBOSS com a JRE do Java.
 
No JBOSS em TQS pode adicionar a linha de investigação do erro detalhado: 
 
-Djavax.net.debug=ssl
 
no domain.sh do JBOSS onde tem o start
 
Qq coisa seria bom vermos se a Elaine de PRD pode ajudar pq em PRD foi feita a atualização do certificado recentemente..
 
Sim, mas pelo que vc comentou em TQS e totalmente diferente do de PRD, até a URL muda. 
De qualquer forma a Elaine precisa ver no debug o que está acontecendo, para melhor análise temos que ter o rastreio do java pelo JBOSS. 
 
Precisaria restartar TQS com o comando  -Djavax.net.debug=ssl
 
Para saber o que gerou o erro
 
Sim, Marco Antonio Paranhos Silva
Eu digo na sequencia da análise, se não conseguirmos detectar o problema..
 
sim claro
 
Marco Antonio Paranhos Silva
No JBOSS em TQS pode adicionar a linha de investigação do erro detalhado:   -Djavax.net.debug=ssl
Jesse Mouta Pereira Batista, qdo puder, favor verificar..
 
Jesse Mouta Pereira Batista, bom dia.
Conseguiu verificar, por favor?



 <img width="800" height="489" alt="image" src="https://github.com/user-attachments/assets/243be3c3-14e7-4dd9-a2a7-0f0d2dbe92bf" />
