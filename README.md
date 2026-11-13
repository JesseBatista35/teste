<img width="1762" height="921" alt="image" src="https://github.com/user-attachments/assets/73b76e77-9e21-45c5-bb15-e455eedab551" />


Skip to main content
Azure DevOps
projetos
/
Caixa
/
Repos
/
Files
/

SIIFX-caixinhas-batch
Search


Caixa

Overview

Boards

Repos
Files
Commits
Pushes
Branches
Tags
Pull requests

Pipelines

Test Plans

Artifacts
Project settings
SIIFX-caixinhas-batch

.mvn
wrapper
batch-launcher
src
.env_exemplo
pom.xml
batch-platform
core-starter
src
pom.xml
io-starter
src
pom.xml
platform-bom
pom.xml
pom.xml
mod-caixinhas
src
main
test
pom.xml
.gitattributes
.gitignore
img.png
README.md

STRY00014675

/
Type to find a file or folder...
Files
Set up build

Clone

Contents
History

.mvn
25 de jun.
5015686c
Atualizar versão do mvn c160696
batch-launcher
5 de nov.
f06d8538
STRY00011064 - Desenvolvimento da funcionadalide de Encerramento de caixinhas c158543
batch-platform
Yesterday
144e953f
Feat (Criacao e ajustes ) batch e 402 - teste f725477
mod-caixinhas
Yesterday
144e953f
Feat (Criacao e ajustes ) batch e 402 - teste f725477
.gitattributes
25 de jun.
73f509ba
Criar projeto batch para teste esteira DevOps c160696
.gitignore
5 de nov.
f06d8538
STRY00011064 - Desenvolvimento da funcionadalide de Encerramento de caixinhas c158543
img.png
4 de set.
0442aa19
STRY00095836 - SIIFX - Caixinha - Arquitetura de código inicial [BATCH] c158543
README.md
17 de set.
610ac2cd
SONAR - Cobertura de testes c158543
Introduction
Aplicação SIIFX-caixinhas-batch executada pelo BMC Control-M com contrato via exit code do processo — determinístico, nunca 1.

Topologia
Três reactors Maven independentes:

batch-platform/ — plataforma (platform-bom, core-starter, io-starter)
mod-caixinhas/ — módulo funcional (domínio de caixinhas de investimento)
batch-launcher/ — launcher (main + YAMLs por perfil + empacotamento)
O launcher não conhece nenhum módulo funcional: a descoberta de jobs é 100% por auto-configuração no classpath (META-INF/spring/org.springframework.boot.autoconfigure.AutoConfiguration.imports).

Build and Test
Cada reactor é construído e instalado na ordem de dependência:

cd batch-platform && mvn -q install -DskipTests
cd ../mod-caixinhas && mvn -q install -DskipTests
cd ../batch-launcher && mvn -q package -DskipTests
O artefato final é batch-launcher/target/siifx-caixinhas-batch.jar (fat jar, com mod-caixinhas empacotado como dependência).

Contrato de exit code com o Control-M
Código	Situação
0	COMPLETED, zero itens rejeitados
4	COMPLETED com itens rejeitados dentro do limite configurado
8	FAILED por regra de negócio (conferência divergente, saldo negativo, etc.)
12	FAILED técnico (banco, I/O, rede, exceção não classificada)
16	Parâmetro inválido, job inexistente ou variável de ambiente ausente
20	Job já em execução, instância já COMPLETED para o odate, ou conflito de negócio equivalente
Variáveis de ambiente
Variável	Obrigatória	Descrição
__ORA_DRIVE__	hmp/tgs/prd	String do Driver JDBC Oracle
DB_URL	hmp/tgs/prd	URL JDBC Oracle
DB_USER	hmp/tgs/prd	usuário de conexão (SIFXDS01,SIFXTS01,SIFXHS01)
DB_PASS	hmp/tgs/prd	senha (via Vault/variável de ambiente do agente, nunca em YAML)
BATCH_HOME	sim (wrapper)	raiz da instalação (lib/, locks/)
BATCH_PROFILE	sim (wrapper)	des, hmp, tgs ou prd
BATCH_LOG_DIR	sim (wrapper)	diretório de log por execução
PUSHGATEWAY_URL	não	endpoint do Prometheus Pushgateway
DB_POOL_MAX, SKIP_LIMITE_ABSOLUTO, GRAU_PARTICIONAMENTO, ...	não	overrides pontuais, ver application*.yml
Em des, DB_URL/DB_USER/DB_PASS têm default local; em hmp/tgs/prd a ausência de qualquer uma delas falha a subida com exit code 16 (VariaveisObrigatoriasEnvironmentPostProcessor), antes mesmo da tentativa de conexão ao banco.

Executando um job
export BATCH_HOME=/opt/batch-caixinhas
export BATCH_PROFILE=prd
export BATCH_LOG_DIR=/var/log/batch-caixinhas
scripts/executa-job.sh 201-transicao-saldo-caixinha 20260825
Jobs do mod-caixinhas
Job	Faixa	Tipo
101-abertura-novo-movimento	100	tasklets
201-transicao-saldo-caixinha	200	chunk particionado (referência do módulo)
202-registro-ativos-renda-fixa	200	chunk
203-atualiza-saldos-movimento	200	chunk
401-relatorio-fechamento-diario	400	tasklet
501-reprocessa-rejeitados	500	tasklet eventual
502-expurgo-metadados-batch	500	tasklet eventual
Schema
O SchemaContratoValidator confere, antes de qualquer step, que os objetos declarados em META-INF/schema-contrato/*.yml (agregados de todos os módulos no classpath) existem no owner IFX, com colunas críticas e grants compatíveis. Modo FALHA em hmp/tgs/prd, WARN em des.

Expanded

Collapsed



Gilberto Olimpio dos Santos
11:44
Aí, o Jesse, o Jorge até achou um projeto, cara, que ele, segundo o que ele falou, acho que era semi semelhante, cara. E eu acho que era um projeto chamado é sinaf, cara, alguma coisa do sinaf que eu acho que ele fez.
Jesse Mouta Pereira Batista
11:44
Sim.
Gilberto Olimpio dos Santos
11:45
Que é tipo assim, ele fez. Ele pegou um sinapse lá e aí eu não sei qual que é que ele fez uma coisa parecida, sabe? É com vários subprojetinhos dentro. Assim, eu não vou lembrar exatamente qual que era.
Jesse Mouta Pereira Batista
11:45
Vê se ele mandou aí que a gente consegue usar de exemplo. Eu lembro de um projeto desse mesmo. Eu só não me recordo agora do nome, mas tem um projeto que ele está igualmente. Isso aí ele tem.
Gilberto Olimpio dos Santos
11:45
Of which you?
Ele mostrou um lugar, eu não lembro é a tela que ele mostra, ele pega um que ele vê a configuração das é.
Can I have?
No.
Yes.
Jesse Mouta Pereira Batista
11:46
deixa eu dar uma olhada nessa room aqui que tá falhando
E a gente consegue
Jesus wash a King.
Gilberto Olimpio dos Santos
11:46
É, talvez eu não consiga visualizar porque deve ser de outra comunidade.
Jesse Mouta Pereira Batista
11:46
Aham é pode ser e o Jorge Miles é do torno B e ele só entra as três Mas vamos deixa eu dar uma olhada aqui e ver aqui
Gilberto Olimpio dos Santos
11:46
No.
Jesse Mouta Pereira Batista
11:46
Deixa eu só ver como é que tá a edição dela aqui rapidinho tá pessoal
Gilberto Olimpio dos Santos
11:46
Central Central Central Central Central Central Central Central Cent
