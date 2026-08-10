Documento de Repasse Técnico - Ambiente Legado (SIGEC e Aplicações Relacionadas) 
Data da Reunião: 07/08/2026 
Instrutor: Murilo Silva Andrade Souza 
Participantes: Jesse Mouta Pereira Batista e Patricia Vourakis Barbosa Braga 
Objetivo: Repasse operacional das atividades de sustentação dos sistemas legados durante a ausência 
temporária de Murilo. 
1. Contexto Geral 
O foco principal da explicação foi o ambiente legado do SIGEC, uma aplicação baseada em JBoss antigo, que 
apresenta recorrentes problemas de estabilidade, principalmente relacionados a: 
 Consumo de memória. 
 Metaspace. 
 Garbage Collector (GC). 
 Reinicializações frequentes de instâncias. 
 Necessidade constante de monitoramento e manutenção operacional. 
Segundo Murilo, trata-se de um ambiente extremamente sensível, que sofre alterações frequentes por parte das 
equipes de desenvolvimento e que exige cautela em qualquer intervenção. 
2. Características do Ambiente SIGEC 
Principais observações 
 Aplicação legada executando em JBoss. 
 Possui histórico de falhas recorrentes. 
 Equipe usuária costuma escalar rapidamente problemas. 
 Atualmente os atendimentos estão sendo formalizados através de REC (requisição/chamado), 
melhorando o controle das demandas. 
Problemas comuns 
Memória / Metaspace 
O ambiente frequentemente apresenta problemas relacionados à Metaspace. 
Possíveis ações: 
 Ajuste de parâmetros de memória. 
 Verificação do comportamento da JVM. 
 Avaliação dos parâmetros de inicialização. 
Garbage Collector 
Murilo levantou a hipótese de que alguns alertas podem estar relacionados ao monitoramento do Garbage 
Collector do próprio JBoss. 
Possível ação: 
 Revisar a configuração desse monitoramento. 
 Avaliar se sua desativação elimina alertas falsos. 
3. Estrutura dos Logs 
Acesso aos logs 
Após elevar privilégios para root: 
sudo su - 
Buscar histórico: 
Ctrl + R 
Pesquisar: 
tail 
ou 
log 
Log principal 
O log mais importante é o do: 
Batch
Este é o componente que: 
 Quebra com maior frequência. 
 É mais solicitado pelos usuários. 
 Normalmente exige reciclagem/restart. 
4. Estrutura de Arquivos Compartilhados 
Diretório principal 
/upload 
Dentro dele encontram-se: 
 Certificados 
 Arquivos de configuração 
 Integrações 
 Configurações Azure 
Arquivo importante 
AzureSB.properties 
Responsável pela integração com: 
 Azure Service Bus 
 Filas MQ 
 Métricas visualizadas pelo portal Azure 
Funções: 
 Conexão com filas. 
 Coleta de métricas. 
 Exposição de dados para monitoramento. 
5. Certificados 
Os certificados das aplicações ficam armazenados na estrutura: 
/upload/sigec 
Mostrar mais linhas 
Caso seja necessário: 
 Atualizar certificado. 
 Renovar certificados expirados. 
 Validar arquivos. 
A manutenção ocorre nesse diretório. 
6. Compartilhamento via NFS 
Foi demonstrado que: 
/upload 
não é local. 
Ele está montado por NFS: 
10.116.95.13 
Consequência: 
Alterações nesse compartilhamento podem impactar diversos sistemas simultaneamente. 
7. Domain Controller JBoss 
Host de Administração 
IP informado: 
10.116.89.0 
Este servidor funciona como: 
Domain Controller 
Responsável por: 
 Profiles 
 Datasources 
 Configurações de servidores 
 Deploys 
 Gerenciamento das instâncias 
8. Operação via JBoss CLI 
Conexão 
Entrar no CLI do JBoss: 
connect 
Mostrar mais linhas 
Listar hosts 
Utilização de TAB para autocompletar e visualizar opções. 
Host principal do SIJEC 
Servidor: 
104 
Mostrar mais linhas 
Servidores importantes 
Batch 
sigec-portabilidade-batch 
Online 
sigec-portabilidade-2 
9. Reinício de Instâncias 
Dentro do CLI: 
Comandos principais: 
stop 
kill 
start 
restart 
resume 
suspend
Procedimento recomendado 
Murilo recomenda: 
1. stop 
2. kill 
3. start 
Motivo: 
Às vezes o stop não finaliza completamente o processo. 
O uso do kill garante: 
 Encerramento definitivo do PID. 
 Inicialização limpa. 
10. Acesso ao Domain XML 
Diretório: 
/jboss/eap/dc/configuration 
Arquivo principal: 
domain.xml
Abrir arquivo 
vim domain.xml
11. Comandos Úteis no VIM 
Mostrar linha atual 
:set number 
Ir para início 
gg 
ou 
:1 
Ir para final 
Shift + G 
Buscar texto 
/profile 
ou 
/sigec 
Entrar em edição 
i 
Salvar 
:wq 
Sair 
:q! 
12. Datasources 
Dentro do profile SIGEC encontram-se: 
 URLs de conexão. 
 Configurações DB2. 
 Pools de conexão. 
Durante a apresentação foi identificado que o ambiente utiliza predominantemente: 
DB2 
13. Cuidado Crítico com o Domain Controller 
Este foi o principal alerta da reunião. 
Problema 
Enquanto um administrador edita o: 
domain.xml 
desenvolvedores podem estar executando: 
deploys 
ao mesmo tempo. 
Consequência 
Pode ocorrer conflito de: 
 Hashes. 
 Deployments. 
 Sincronização do Domain Controller. 
Resultado: 
 Aplicações podem não subir. 
 Deploys podem falhar. 
 Diversos sistemas podem ficar indisponíveis. 
Boa prática 
Sempre avisar previamente: 
 Cledson 
 Cláudio 
antes de alterações relevantes. 
14. Pessoas de Referência 
Cledson 
Principal referência para: 
 Domain Controller 
 Ambientes legados 
 Problemas de deploy 
Cláudio 
Apoio em: 
 Aplicações legadas 
 Diagnóstico operacional 
 Domain XML 
15. Arquitetura Simplificada da CAIXA 
Fluxo apresentado por Murilo: 
Internet 
↓ 
Balanceador (VIP/Citrix) 
↓ 
Apache (Apresentação) 
↓ 
JBoss (Aplicação) 
↓ 
Banco DB2 
16. Camadas 
Balanceamento 
Chamado internamente de: 
VIP 
Na prática: 
Balanceador Citrix 
Equipe não possui acesso administrativo. 
Apresentação 
Servidores Apache. 
Equipe possui acesso. 
Funções: 
 Virtual Hosts 
 Redirects 
 Proxy 
 Publicação dos sites 
Aplicação 
Servidores JBoss. 
Equipe possui acesso. 
Funções: 
 Deploy 
 Datasource 
 Logs 
 Configuração 
17. Apache 
Locais comuns 
/etc/httpd 
ou 
/opt
Sites habilitados 
Diretório: 
sites-enabled 
Neste local é possível verificar: 
 Virtual Hosts. 
 Sites publicados. 
 Aplicações atendidas. 
18. Apache Reload 
Comando mais seguro: 
reload 
Motivo: 
Recarrega apenas alterações realizadas. 
Evitar 
stop 
porque pode: 
 Derrubar dezenas de aplicações simultaneamente. 
19. Utilização de NSLOOKUP 
Método utilizado para descobrir o fluxo da aplicação: 
nslookup <url> 
Permite identificar: 
1. VIP. 
2. Apache responsável. 
3. Caminho da aplicação. 
20. Consoles JBoss 
Porta utilizada: 
9443 
Exemplo: 
https://servidor:9443 
Permite: 
 Visualizar deploys. 
 Controlar servidores. 
 Ver profiles. 
 Gerenciar grupos. 
 Fazer deploy manual. 
Resumo Executivo 
Murilo realizou um repasse focado na sustentação dos sistemas legados, especialmente o SIGEC. 
Os principais pontos abordados foram: 
 Estrutura do ambiente legado. 
 Operação do JBoss Domain Controller. 
 Localização de logs e certificados. 
 Gerenciamento de instâncias Batch e Online. 
 Alteração de profiles e datasources. 
 Cuidados com deploys simultâneos. 
 Funcionamento da cadeia VIP → Apache → JBoss. 
 Utilização de consoles JBoss e arquivos de configuração. 
 Contatos de apoio (Cledson , Cláudio e Jorge). 
O principal cuidado destacado foi evitar alterações no Domain Controller sem alinhamento prévio, pois 
qualquer inconsistência pode impactar múltiplas aplicações legadas simultaneamente. 






URL	DOMAIN	HOSTNAME	VESÃO JBOSS
dc001.nprd.console.caixa	10.116.95.3	cspdeapllx001	JBoss7.1
dc002.console.des.caixa	10.116.95.197	cspdeapllx052	JBoss7.3
dc003.console.des.caixa	10.116.88.97	sspdeapllx0040	JBoss7.0
dc004.console.des.caixa	10.116.88.73	sspdeapllx0016	JBoss6.4
dc005.console.des.caixa	10.116.88.114	sspdeapllx0042	JBoss6.4
dc006.console.des.caixa	10.116.97.21	cspdeapllx074	JBoss7.4
dc007.console.des.caixa	10.116.94.224	sspdeapllx191	JBoss7.0
dc008.console.des.caixa.keystore	10.116.24.124	cadtqapllx032	JBoss7.4
jboss.sinbcpj.des.caixa	10.116.88.120	sspdeapllx0051	JBoss6.4
eap64-nprd.des.caixa	10.116.88.20	sbrdeapllx0001	JBoss6.4
eap70-nprd.des.caixa	10.116.89.0	sbrdeapllx069	JBoss7.1
jbloteriasdc.caixa (DES/TQS)	10.116.89.238	sbrdeapllx059	JBoss7.0




URL	DOMAIN	HOSTNAME	VESÃO JBOSS
dc001.nprd.console.caixa	10.116.95.3	cspdeapllx001	JBoss7.1
dc002.console.des.caixa	10.116.95.197	cspdeapllx052	JBoss7.3
dc003.console.des.caixa	10.116.88.97	sspdeapllx0040	JBoss7.0
dc004.console.des.caixa	10.116.88.73	sspdeapllx0016	JBoss6.4
dc005.console.des.caixa	10.116.88.114	sspdeapllx0042	JBoss6.4
dc006.console.des.caixa	10.116.97.21	cspdeapllx074	JBoss7.4
dc007.console.des.caixa	10.116.94.224	sspdeapllx191	JBoss7.0
dc008.console.des.caixa.keystore	10.116.24.124	cadtqapllx032	JBoss7.4
jboss.sinbcpj.des.caixa	10.116.88.120	sspdeapllx0051	JBoss6.4
eap64-nprd.des.caixa	10.116.88.20	sbrdeapllx0001	JBoss6.4
eap70-nprd.des.caixa	10.116.89.0	sbrdeapllx069	JBoss7.1
jbloteriasdc.caixa (DES/TQS)	10.116.89.238	sbrdeapllx059	JBoss7.0




SIFEC LEGADO
DES: 
SIFEC1 - SBRDEAPLLX0009-10.116.88.28
SIFEC2 ao SIFEC5 - SBRDEAPLLX067-10.116.94.187
TQS:
SIFEC 1 a 4 de TQS - sbrtqapllx0009-10.116.24.101

 
	Servidores Compartilhados Web Esteiras  DES e TQS
#######################################################
DES
10.116.223.231 caddeapllx135
10.116.223.232 caddeapllx136
 
TQS
10.116.223.233 caddeapllx137
10.116.223.234 caddeapllx138
 
VIP 10.116.80.21
APACHES mais antigo de Legados
sbrdeaprlx0001 - 10.116.84.136:6666
sbrdeaprlx0002 - 10.116.84.137:6666
 
APACHES TQS BSB
10.116.18.72
10.116.18.73
 
APACHES QUE PODEM SER UTILIZADOS PARA CONFIGURAR O SITE siecmhealthcheck.des.caixa
10.116.98.52 - SBRDEAPRLX052
10.116.98.53 - SBRDEAPRLX053
 
 
https://logintqs.caixa.gov.br	tqs	inter	srjtqaprlx037	10.116.18.236	srjtqapllx0009	10.116.24.133	jb73
 
 
 
https://login.tqs.caixa	tqs	intra	srjtqaprlx037	10.116.18.235	srjtqapllx0008	10.116.24.132	jb73
 
 
REQ000145164854
 
 
siset	https://login.tqs.caixa	tqs	intra	srjtqaprlx037	10.116.18.235	srjtqapllx0008	10.116.24.132	jb73
siset	https://logintqs.caixa.gov.br	tqs	inter	srjtqaprlx037	10.116.18.236	srjtqapllx0009	10.116.24.133	jb73
 
 
 
siset	https://login.des.caixa	des	intra	srjtqaprlx015	10.116.84.243	srjdeapllx074	10.116.89.236	jb73
siset	https://logindes.caixa.gov.br	des	inter	crjdeaprlx062	10.116.84.244	srjdeapllx075	10.116.89.237	jb73
 
 
https://sisns-frontend-tqs.apps.nprd.caixa/#/home
 
