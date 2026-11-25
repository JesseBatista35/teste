Gisele, sobre aquele erro que apareceu no log do intranet:

log4j:ERROR Could not parse file [/log_ias/config-log4j/ceflib/ceflib.xml]
java.io.FileNotFoundException: /log_ias/config-log4j/ceflib/ceflib.xml

Investiguei e achei a causa: é a biblioteca ceflib (a lib comum da Caixa, usada pelo SIROT) que procura o arquivo de configuração de log dela nesse caminho fixo. No jar, a property que aponta esse log (LOG4J_CONFIG_FILE) está comentada, então ela cai no caminho default /log_ias/config-log4j/ceflib/ceflib.xml — que não existe na VM.

O importante: fui no legado (sspdeapllx0039) e confirmei que lá é o mesmo jar, com a mesma property comentada, e o /log_ias também não existe. Ou seja, o legado gerava exatamente esse mesmo erro — só que ninguém via no log. É um erro cosmético, não derruba a aplicação nem o login (o SIROT GJ01/GJ02 continua funcionando).

Pra fechar 100%, você consegue tentar logar no intranet com um usuário de teste? Eu não tenho usuário/senha. Se o login entrar normal, confirma que é só ruído de log e a gente já limpa isso na próxima release (vou entregar um ceflib.xml mínimo pela esteira pra parar de aparecer o erro)
