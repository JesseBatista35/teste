bom dia, o que ficamos ser ver foi o motivo do erro do certificado. 
assim que conseguir restart o JBOSS com o debug do SSL só avisar por favor que disparo o teste aqui. 
Lá onde fica o domain.sh tem que add o comando do java 
 
java -Djavax.net.debug=ssl:all -jar JBOSS...
 
Favor verificar também no Properties do SIFUG se manteve as informações do repositório do certificado, se manteve o mesmo path e as devidas senhas.
 
no ambiente de TQS tem o arquivo sifug_sifgd.properties que está mapeado no XML do JBOSS, onde vc vê o path desse arquivo
 
aqui é o exemplo de como está no Properties no ambiente do desenvolvedor, em TQS é outro path



 <img width="800" height="174" alt="image" src="https://github.com/user-attachments/assets/20551fdf-c236-4fa4-b394-bbda8c2df788" />

 
