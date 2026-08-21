Segue nota formal para deixar registrada no WO, documentando o levantamento técnico já realizado e as pendências antes de prosseguir com a instalação.

Prezados,

Em atendimento à solicitação de criação de nova instância JBoss EAP 7.4 nos servidores 10.192.222.70 e 10.192.222.72 (sistema SIPCS, ambiente DES), realizei levantamento técnico prévio nos servidores e identifiquei pontos que precisam de esclarecimento antes de prosseguir com a instalação.

Levantamento realizado:

Confirmado o JDK 1.8.0_66 utilizado pela instância 7.0, localizado em /usr/jdk/instances/jdk1.8.0_66/bin/java. No servidor .70 esse mesmo JDK também é referenciado via symlink em /usr/jdk/jdk1.8.0_66, usado pelas instâncias 6.4.
Mapeada a topologia atual dos servidores via inspeção de processos:
No servidor 10.192.222.70, as instâncias 6.4 e 7.0 estão organizadas por sub-ambiente, cada uma com seu próprio par Domain Controller (DC) e Host Controller (HC): dc_tqs/hc_tqs, dc_pre/hc_pre, dc_des/hc_des, dc_rel/hc_rel, dc_cod/hc_cod.
No servidor 10.192.222.72, foram identificados apenas Host Controllers da versão 6.4, referentes aos sub-ambientes hc_pre, hc_tqs e hc_rel. Não foi localizado nenhum processo da versão 7.0 em execução neste servidor, apesar da descrição do host mencionar "Jboss EAP 6.4.2.GA 7.0.0.GA".

Pendências para prosseguir:

A solicitação original não especifica qual sub-ambiente (des, tqs, pre, rel ou cod) a nova instância 7.4 deve seguir. Solicito confirmação de qual(is) sub-ambiente(s) devem ser contemplados na instalação, tanto no servidor .70 quanto no .72.
Como não há instância 7.0 em execução no servidor .72, não existe um HC 7.0 para servir de modelo de replicação nesse servidor, conforme mencionado na solicitação original. Solicito confirmação se a intenção é criar a instância 7.4 do zero nesse servidor (sem espelhar uma 7.0 existente), ou se há necessidade de revisão do escopo do pedido.

Aguardo retorno com essas informações para dar continuidade à instalação.

Atenciosamente,
Jessé Batista
Matrícula P585600
Contato: Teams ou (61) 98617-8888
