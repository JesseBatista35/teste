olha, eu dei uma olhada aqui por cima e não encontrei nenhuma registro de DNS private zone ou Pvt com o aks-sipdd-des
 
então eu acho que o problema de resolução de nome é quanto isso
 
não é a minha equipe que administra o DNS, mais como trabalhos meio que dependentes disso, já conhecemos algumas questões e no caso do DNS, existe uma condição onde todo o registro que é feito na AZURe com apontamento no DNS da infra-services já é repassado ao DNS da infra on-premises
 
sua VPN não precisa se comunicar direto com o serivdor de DNS da aZURE para resolver os nomes de lá, já existe uma integração entre o DNS Azure com o DNS on-premises que atende as VPNs
 
com relação a conexão em sí, o FW por padrão não fica sniffando os fluxos, eu preciso configurar isso previamente para capturar
 
eu vou deixar uma captura montada
 
você consegue simular essa conexão? ai podemos fazer em conjunto 


 <img width="1111" height="163" alt="image" src="https://github.com/user-attachments/assets/1e48d12a-62df-44d0-ba35-c75ef291ef0d" />


<img width="800" height="310" alt="image" src="https://github.com/user-attachments/assets/d1fd6de5-3fdc-43c4-9437-0b2b58582ea1" />

