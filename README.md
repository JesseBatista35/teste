Pessoal, o Jeferson fechou a causa raiz do internet. Não era firewall — a conexão com o SIROT está ok. O que quebra é a incompatibilidade das libs legadas do EAP 6 (sirotcon-ejb-lib-2.3.0.2-farm.jar e CeflogEAP-2.5.0.0.jar) rodando no JBoss EAP 7.4:

CeflogEAP → LogFactory.getLog() volta null (classloader + módulo org.apache.log4j não declarado) → NPE na linha 191 do SIROTTrans.
sirotcon-ejb-lib → lookup JNDI espera javax.naming.Context, mas no 7.4 vem org.jboss.as.naming.NamingContext → con fica null.

A correção fica no código de vocês (assim a próxima release já sobe compatível, sem mexer em lib de terceiros no Nexus) — 2 arquivos:

jboss-deployment-structure.xml no EAR (src/main/application/META-INF/) — desativa isolamento entre subdeployments e exporta org.apache.log4j.
SirotStartupListener.java no WAR — listener de startup que inicializa o SIROTTrans.log e injeta o SIROTConBean via java:app.

(Tenho os dois arquivos prontos aqui do diagnóstico do Jeferson, já te mando.)

Importante: o Jeferson validou aplicando o patch direto no EAR que está na VM (backup em /root/bkp_sigsj/). Com isso, o login e a transação GJXC (042085) passaram a trafegar normal. Só que qualquer release nova da esteira sobrescreve esse patch — então, por favor, não disparem deploy do internet até esses 2 arquivos estarem commitados no fonte.

Ponto funcional pra vocês olharem depois (massa de dados): na 2ª chamada da GJXC (convênios do usuário de teste 0000003154995100598 – 8ª REGIÃO PARÁ E AMAPÁ) o mainframe devolveu o registro truncado na pos=103 (faltando os 14 bytes do CO-DCMTO-COL X(14)). Vale checar se o XML de mapeamento da GJXC precisa de ajuste ou se é cadastro incompleto desse convênio na base de DES. O StringIndexOutOfBounds: 1978 na GJ4D (Favoritas) é da mesma natureza.
