Em continuação a REQ000145446658 que foi finalizada devido a pendencia:

Favor realizar a criação de uma nova instancia de jboss nos servidores 10.192.222.70 e 10.192.222.72 com a versão 7.4. Seguindo o mesmo molde das outras instancias já criadas (7.0 e 6.4) nesse mesmo servidor, onde a .70 contem um DC/HC e a .72 contem um HC. Configurar com o mesmo java da versão 7.0 (jdk1.8.0_66). Essas configurações devem ser feitas para os domínios des, tqs, pre e rel.

Em resumo:
Servidor .70: JBOSS 7.4 -> JDK 1.8.0_66 -> DC+HC (des,tqs,pre e rel)
Servidor .72: JBOSS 7.4 -> JDK 1.8.0_66 -> HC (des,tqs,pre e rel)



Seguem as respostas: 

A solicitação original não especifica qual domínio/sub-ambiente (des, tqs, pre, rel ou cod) a nova instância 7.4 deve seguir.
Resposta: Deve ser criado para des, tqs, pre e rel

Solicito confirmação de qual(is) domínio(s) devem ser contemplados na instalação, tanto no servidor .70 quanto no .72.
Resposta: Deve ser criado para des, tqs, pre e rel

Solicito confirmação sobre o padrão de referência: a topologia "DC na .70 + HC na .72" identificada corresponde ao padrão da versão 6.4 (domínios tqs, pre e rel). A versão 7.0, por sua vez, está hospedada integralmente no servidor .70, sem HC correspondente localizado na .72.
Resposta: A versão 7.0 tem DC na .70 / HC na .70 e na .72, conferi aqui. Mas respondendo, deve ser criado conforme o padrão atual, DC na .70 / HC na .70 e na .72

Peço orientação sobre qual desses padrões deve ser seguido para a nova instância 7.4. Caso os domínios des e/ou cod sejam de interesse para a nova instância na .72, solicito confirmação se há Host Controller já configurado para esses domínios nesse servidor, ou se a criação seria greenfield.
Resposta: Deve ser criado para des, tqs, pre e rel, para a 7.4 não tem nada configurado ainda
