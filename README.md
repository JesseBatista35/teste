SIGSJ – Migração esteira JBOSS | Status 25–26/11

1. Configuração tokenizada (Replace Tokens + variáveis) — VALIDADO
As properties (config.properties, release.properties, b2b.properties) passaram a ser tokenizadas no repo; a esteira substitui pelos valores das variáveis de cada ambiente na release. Testado e validado em DES — tokens substituídos corretamente pelos valores reais, sem edição manual.

2. Versão (sigsj.release) — AJUSTE DE HOJE
A versão passou a ser controlada por variável de pipeline marcada como "Settable at release time". Assim, na hora de criar a release, dá pra informar/trocar a versão (inclusive rodar versões diferentes por ambiente). Validado — confirmado que a esteira enxerga a variável e substitui o token certinho (dúvida que o Jeferson tinha levantado).

3. Ambientes
DES e HMP já com as variáveis preenchidas na Library. TQS recebido do Vitor, em preenchimento. PRD pendente.
⚠️ Obs: o b2b.properties de DES e TQS está com chaves diferentes (não só valores). Como a esteira entrega o mesmo arquivo pra todos os stages e o Replace Tokens só troca valor, preciso de um b2b.properties canônico — Vitor, me confirma quais chaves a aplicação realmente usa hoje pra eu padronizar.

4. Internet – login (diagnóstico do Jeferson)
A causa raiz não era firewall (a conexão com o SIROT 10.116.89.101:8111 está ok). É incompatibilidade das libs legadas do EAP 6 (sirotcon-ejb-lib-2.3.0.2-farm.jar e CeflogEAP-2.5.0.0.jar) rodando no JBoss EAP 7.4:

CeflogEAP → LogFactory retorna null (classloader + módulo org.apache.log4j não declarado) → NPE na linha 191 do SIROTTrans.
sirotcon-ejb-lib → lookup JNDI espera javax.naming.Context, mas no 7.4 vem org.jboss.as.naming.NamingContext → con null.

Correção é no código (pra próxima release já subir compatível). Duas abordagens na mesa — precisamos padronizar uma pros 3 módulos:

Gisele: empacotar o EJB dentro do EAR + usar as libs CEFLOG/CEFLIB na versão do EAP 7 (como ela fez no intranet; Marcio replicaria no internet).
Jeferson: manter os jars e adicionar 2 arquivos de contorno (jboss-deployment-structure.xml + SirotStartupListener).

⚠️ Não rodar release do internet até o fix estar commitado — o Jeferson validou aplicando patch manual no EAR da VM (backup em /root/bkp_sigsj/); uma release nova sobrescreve.

5. Erro ceflib.xml (log) — inofensivo
FileNotFoundException /log_ias/config-log4j/ceflib/ceflib.xml é default da lib ceflib. Confirmado no legado: mesmo jar, mesmo erro, o arquivo nunca existiu lá — é só ruído de log, não derruba nada. Dá pra limpar entregando um ceflib.xml mínimo pela esteira (opcional).

6. Erro StringIndexOutOfBounds: 1978 na GJ4D (Favoritas)
Encoding descartado: confirmei que legado e VM estão idênticos, -Dfile.encoding=ISO-8859-1 nos três módulos. Como a GJ4D quebra só no EAP 7.4 e funciona no legado com o mesmo encoding, o index 1978 indica resposta mais curta chegando ao parser — bate com a truncagem que o Jeferson viu na GJXC (pos=103). É a mesma raiz das libs / leitura da resposta no EAP 7 + análise de massa/book no lado dev, não config da VM.
