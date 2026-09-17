Carlos Augusto, o certificado eco.dataprev.des.caixa.gov.br.p12 que você disponibilizou já está instalado no servidor, mas identificamos um problema antes de reiniciar o server: ele aparece no keystore com alias "dinamo hsm" e o keytool não consegue ler as informações normais de certificado (owner, issuer, serial, validade) — indício de que a chave privada não está embutida no arquivo .p12, e sim referenciada externamente via HSM da Dinamo.

Conferimos no servidor srjtqapllx0021 e não existe nenhum provider PKCS#11/Dinamo configurado nessa JVM, nem nenhum driver ou arquivo relacionado ao HSM instalado no host. Como é um HSM, sabemos que não é possível simplesmente converter esse .p12 para um formato com a chave embutida — a chave não sai de dentro do HSM por design.

Diante disso, temos duas dúvidas antes de prosseguir com o reinício do server SIFUG:

1) Existe algum passo a passo de configuração do provider PKCS#11 do Dinamo pra esse tipo de ambiente (JBoss EAP 7.0.0 legado, Java 8)? Se sim, poderia nos encaminhar, ou nos colocar em contato com quem já configurou isso em outro ambiente?

2) Como alternativa, seria possível gerar/disponibilizar um certificado nesse mesmo domínio (ECO.DATAPREV.DES.CAIXA.GOV.BR) em um formato .p12 tradicional, com a chave privada embutida, sem depender do HSM? O app legado SIFUG não foi desenhado pra esse modelo de integração.

Ficamos no aguardo pra definir o caminho antes de reiniciar o server, já que sem essa configuração o mais provável é trocarmos o erro atual por uma falha ao carregar a chave privada.






Configuração - AC Interna v5 (Descontinuada)
Ir para navegaçãoIr para pesquisar

Índice
1	Objetivo
2	Crypto Token
3	Rotina de LCR
4	Referências
Objetivo
Configurações mínimas necessárias à operação do EJBCA 7.4.3 como AC Interna v5

Crypto Token
Na seção CA Functions, menu Crypto Tokens, adicione um novo Crypto Token do tipo PKCS #11, conforme imagem a seguir

> Insira a senha de acesso ao HSM no campo Authentication Code

Ejbca crypto token.png

Rotina de LCR
Entre na seção administrativa do EJBCA

Na seção System Configuration, menu System Configuration, acesse a aba External Scripts, ative a opção Enable External Script Access

> O passo anterior é necessário para habilitar o General Purpose Custom Publisher nos Publishers

Na seção CA Functions, menu Publishers, adicione o LCR Publisher do tipo General Purpose Custom Publisher

Edite o LCR Publisher criado no passo anterior e referencie o script de publicação de LCR /usr/local/scripts/lcr_publisher.sh no campo Full pathname of CRL publishing script

Configure os demais campos do formulário conforme a necessidade e salve

Após esses passos o EJBCA está configurado para salvar as LCRs no momento da geração, entretanto, a aplicação não gera LCRs automaticamente. Para isso é preciso configurar um Service

Na seção System Functions, menu Services adicione o LCR Publisher Service

Edite o Service criado e, na opção Select Worker, selecione CRL Updater e em CAs to check selecione as CAs que serão verificadas quanto a necessidade de atualização de LCR.

Por fim, selecione o período de verificação em Periodical Interval Settings, ative o Service em Active e salve o formulário

Referências
EJBCA - Publicando com aplicações externas

Menu de navegação
P585600DiscussãoPreferênciasPáginas vigiadasContribuiçõesSair
PáginaDiscussão
LerEditarEditar código-fonteVer históricoVigiar
Mais
Pesquisa
Pesquisar em WikiPRDCetad
Página principal
Mudanças recentes
Página aleatória
Ajuda do MediaWiki
Processos
Atendimento às Comunidades
Equipe
Pessoas
Redes
Instalações
Multiplataforma
Contratos
Plataforma Alta
Infraestrutura de Banco de Dados
Armazenamento
Nuvem Pública e Capacidade
Aplicação Multiplataformas (Esteiras)
Operação Contínua
Gerência de Centralizadora
Informações
Manual de Usuário
Ferramentas
Páginas afluentes
Mudanças relacionadas
Enviar arquivo
Páginas especiais
Versão para impressão
Ligação permanente
Informações da página
Esta página foi modificada pela última vez em 15 de março de 2023, às 17h53min.
Política de privacidadeSobre WikiPRDCetadTermo de responsabilidade
Powered by MediaWiki
