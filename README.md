Eu que agradeço.
 
É isso mesmo. só o ajuste da propriedade da URL Base para se adequar ao domain do servidor.
 
Sobre o empacotamento, ele tá sendo feito dessa forma como você mesmo perguntou. Todos ficam na raiz do EAR:
 
lib
META-INF
sicdt-orig-api-ejb-client-3.24.3.001.jar
sicdt-orig-api-ejb.jar
sicdt-orig-api-rest.war
sifec-cdt-ejb.jar
sifec-cdt-web.war
 
Ambos os contextos:


<img width="996" height="525" alt="image" src="https://github.com/user-attachments/assets/8e0448fa-55c1-40f5-9995-68424cb09720" />


Sobre a versão do EJB testei tanto com/sem versão e ambas funcionaram, acabei, por ora, utilizando da forma como empacotávamos o EAR nas versões anteriores.
 
Esse é o estado atual, a snapshot da minha configuração para o SICDT. 
 
Aproveitando o ensejo, ainda gostaria de atualizar durante esse processo de migração algumas outras libs, como a do Hibernate e talvez do Java EE, para aproveitar um servidor de aplicações mais atualizado, por enquanto, estou migrando passo a passo para testar a app como um todo.
