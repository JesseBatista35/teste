Jesse Mouta Pereira Batista, Evandro Alves de Souza, Flavio de Almeida Gagliardi, Patricia Vourakis Barbosa Braga
 
2. Variáveis do SIGSJ04 em TQS – Vitor Mendes Guedes, conforme combinado, na segunda você cadastra no grupo SIGSJ-INTRANET-TQS as variáveis SIGSJ04_CONNECTION_STRING, SIGSJ04_USER e SIGSJ04_PASSWORD (marcada como secreta) com os dados da base de TQS passados pela @Gisele. Com o ajuste do item 1 feito, rodamos a release novamente.
 
Eu fiz a adequações das variáveis do SIGSJ INTERNET conforme abaixo em TQS com os dados que possuímos na conexão que temos no nosso ambiente TQS no servidor JBOSS.
 
Com relação a senha, não há um campo de informação de senha na conexão com o banco de dados em TQS e sim uma tag de 
<security-domain></security-domain>. Coloquei esta informação no campo SIGSJ04_PASSWORD mais não sei se é o mais indicado ou se deve existir uma variável SECURITY DOMAIN na library do SIGSJ INTERNET para realizar a conexão.
 
 
também  fiquei com dúvida com relação a variável JVM_PROXY_HOST que está como proxydes.caixa, não deveria ser proxytqs.caixa..?
 
 
Já com relação ao SIGSJ INTRANET confirmamos que o mesmo não utiliza o banco de dados oracle (somente o sigsj internet). É que em desenvolvimento no ambiente legado só há um único servidor para o SIGSJ INTRANET e SIGSJ INTERNET e a configuração do acesso ao oracle fica no servidor JBOSS 5.0 (não fica dentro do deploy da aplicação). Dentro do código fonte do SIGSJ INTRANET não há nenhum acesso ou referencia a conexão com o banco de dados oracle.
 
Para o boleto, Vitor Mendes Guedes, pode confirmar se ele precisa de URL ou se é chamado apenas internamente?
 
Vamos precisar de uma URL para o sigsj-boleto pois a mesma também é chamada externamente. 
 


 <img width="800" height="412" alt="image" src="https://github.com/user-attachments/assets/d2da5368-2860-4488-ba73-4494bb2c042e" />


o marcio disse isso

vamos ver
Jesse, já corrigi e subi a aplicação SIGSJ-internet
 
