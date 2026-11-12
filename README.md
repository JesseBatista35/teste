Olá, pessoal! Solicito apoio para diagnóstico da publicação e da configuração do frontend SIBEC3 em DES, conforme orientação do Jesse, com referência à REQ000147011905, concluída no escopo de Identidade.

Repositório: SIEPR-curso-bec3-frontend. Em 11/11/2026, a PR 169604 foi integrada à develop (commit 03b7f284a8688c82f0c6fe4ba8206430faa36a54). Na consulta de 11/11 às 17h31, a build mais recente encontrada na pipeline 7012 era a 874372, de 10/11, commit 3619eac, anterior à PR.

Na mesma consulta, o frontend em DES ainda exibia "Acesso local de demonstração"; /assets/config/sso-config.json respondeu HTTP 200 com HTML em vez de JSON. No bundle carregado, a configuração da API de dados familiares permanecia como __API_DADOS_FAMILIA_PATH__. Esses achados não confirmam, por si só, a causa nem a indisponibilidade da API.

Solicito verificar qual build, imagem/tag, release/namespace e configuração estão efetivamente em DES, bem como a disponibilização das variáveis SSO_BASE_PATH, REALM, SSO_CLIENT_ID e API_DADOS_FAMILIA_PATH ao frontend. Peço orientação para eventual publicação e validação do SSO e da API. Por favor, alinhar previamente qualquer alteração ou publicação. Não é necessário compartilhar valores sensíveis.

Obrigado!



Continuidade REQ000146946889: confirmar cli-web-epr/internet para SIBEC3 DES e orientar/regularizar retorno https://siepr-curso-bec3-frontend-des.apps.nprd.caixa. Atendimento anterior informou retorno ausente. Detalhes e validacoes no manual anexo.



Histórico de Informações de Trabalho da Ordem de Trabalho
ID da Ordem de Trabalho	 WO0000082258113
Criado em	 11/11/2026 15:56:34
Criado por	 P988842
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Ao demandante.

Demanda atendida conforme escopo do catálogo de Segurança.
Solicitamos que as demandas atividades sejam direcionadas às equipes pertinentes mediante abertura de REQs observando o catálogo de cada equipe.
Assim, procedemos a finalização desta demanda, uma vez que as ações pertinentes à CEPRO foram atendidas.



At.te,

Ivanildo Maia
Responsável Operacional
HITSS / CEPRO
ID da Ordem de Trabalho	 WO0000082258113
Criado em	 11/11/2026 15:43:07
Criado por	 F733303
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Olá, pessoal! Muito obrigado pelo retorno e pelo cadastro do endereço de retorno do SIBEC3.

Após o ajuste, um teste sem credenciais já abriu a tela de CPF do Login CAIXA. O login completo ainda não foi realizado. Ao mesmo tempo, o frontend em DES continua mostrando o acesso local de demonstração, e a rota /assets/config/sso-config.json retorna HTML em vez de JSON.

A PR 169604 foi integrada à develop em 11/11 às 14h04, no commit 03b7f284. Na consulta às 14h57, a build mais recente encontrada, 874372, era anterior ao merge.

Poderiam, por gentileza, nos orientar ou encaminhar à equipe responsável pela publicação e configuração do frontend em DES? Precisamos confirmar a versão/imagem publicada e a disponibilidade das variáveis SSO_BASE_PATH, REALM e SSO_CLIENT_ID. O bundle observado também contém o marcador __API_DADOS_FAMILIA_PATH__ sem substituição.

Com a versão e a configuração confirmadas, poderemos validar o SSO e a consulta à API com acesso autorizado. Se não for possível continuar por esta REQ, agradeço a orientação sobre o procedimento ou serviço adequado antes de abrirmos outro protocolo.

Muito obrigado pelo apoio!
ID da Ordem de Trabalho	 WO0000082258113
Criado em	 11/11/2026 09:55:12
Criado por	 P565574
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Prezado,


Informo que o que foi solicitado foi acatado, peço desculpas mas não podemos ajudar nos demais pontos levantados, não somos responsáveis pelas demais configurações da aplicação e que as configurações de SSO estão em conformidade como verificado.


Atenciosamente,  

P565574 – Plataforma Intermediária  

HITSS/CEPRO20 - Gestão de Identidade e acesso  
ID da Ordem de Trabalho	 WO0000082258113
Criado em	 11/11/2026 09:22:46
Criado por	 F733303
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Olá, Jonatas! Obrigado pelo atendimento. O endereço de retorno foi aceito e já conseguimos abrir a tela de CPF do Login CAIXA.

Porém, na verificação de hoje, o SIBEC3 em DES ainda apresentava a tela “Acesso local de demonstração”, sem iniciar o login corporativo. Também observamos que o arquivo de configuração do login retornou uma página, em vez das informações esperadas.

Poderiam, por gentileza, orientar ou encaminhar à equipe responsável a conferência da versão publicada e da configuração do SSO em DES? Precisamos disponibilizar a versão aprovada com o login corporativo para concluir os testes.

Se essa etapa depender de outra equipe, agradecemos a indicação do responsável, mantendo, se possível, o acompanhamento nesta mesma solicitação. Obrigado pelo apoio!
ID da Ordem de Trabalho	 WO0000082258113
Criado em	 11/11/2026 09:06:31
Criado por	 F733303
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Obrigado, Jonatas! O endereço de retorno já funciona: a tela de CPF do Login CAIXA abriu. Para o login do SIBEC3 em DES ficar completo, pedimos conferir no mesmo cadastro (cli-web-epr, Internet DES):
1) se o site https://siepr-curso-bec3-frontend-des.apps.nprd.caixa tem permissão de origem (Web Origin);
2) se o usuário volta ao SIBEC3 ao clicar em Sair (retorno após logout);
3) se o perfil PARTICIPANTE está disponível para os usuários de teste.
Obrigado!
ID da Ordem de Trabalho	 WO0000082258113
Criado em	 11/11/2026 08:36:21
Criado por	 P565574
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Prezado,


Foi adicionada a URL de redirecionamento https://siepr-curso-bec3-frontend-des.apps.nprd.caixa no ClientID cli-web-epr no ambiente Internet DES.


Atenciosamente,  

P565574 – Plataforma Intermediária  

HITSS/CEPRO20 - Gestão de Identidade e acesso  
ID da Ordem de Trabalho	 WO0000082258113
Criado em	 11/11/2026 08:30:14
Criado por	 F733303
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Atualizando o acompanhamento: a build 874372 da develop foi concluída com sucesso, passou no Quality Gate e gerou imagem. Isso não confirma publicação em DES. Na validação atual, DES ainda apresenta “Acesso local de demonstração”. Ao iniciar a autenticação com o client cli-web-epr no realm internet, o provedor recusou a origem efetiva https://siepr-curso-bec3-frontend-des.apps.nprd.caixa com “Parâmetro inválido: redirect_uri”. A história registra um endereço diferente, sem “3”; a tela de autenticação abriu para esse endereço, mas o login completo não foi validado. Solicitamos confirmar o cadastro do client e autorizar a Redirect URI e a origem web correspondentes ao endereço efetivamente usado em DES. Pedimos também confirmar se o papel PARTICIPANTE está presente no token.
ID da Ordem de Trabalho	 WO0000082258113
Criado em	 10/11/2026 15:40:18
Criado por	 F733303
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 SIBEC3 - REGISTRO DOS AJUSTES DO ACESSO COM CONTA CORPORATIVA
Documento de apoio para anexar a Historia de Login STRY00104485
Tarefa relacionada: STSK00109852
Data de referencia: 10/11/2026, consulta realizada a partir das 15h34

1. RESUMO PARA ACOMPANHAMENTO

Foram integradas duas entregas de correcao na versao compartilhada do sistema,
chamada develop. Elas ajustam a escolha do acesso corporativo nos ambientes
de teste, o recebimento das configuracoes de cada ambiente e um apontamento
da verificacao automatica de qualidade.

A nova verificacao automatica, numero 874372, ainda estava em andamento na
consulta feita para este documento. A publicacao da nova versao em DES ainda
nao foi acionada por este trabalho.

Portanto, o acesso com conta corporativa ainda NAO pode ser considerado
concluido. Precisamos confirmar o resultado da verificacao, alinhar a
publicacao e testar a entrada e a saida no ambiente corporativo.

2. O QUE ESTAVA ACONTECENDO

O endereco de desenvolvimento DES apresentou uma tela de acesso local de
demonstracao, em vez de encaminhar o usuario ao acesso corporativo.

Foi encontrada uma configuracao no sistema que selecionava a demonstracao
para DES e TQS. Tambem havia uma diferenca entre o nome de uma configuracao
esperada pelo sistema e o nome fornecido pelo processo de publicacao.

Esses pontos foram corrigidos no codigo. Isso nao comprova, por si so, que
a nova versao ja esteja disponivel nos enderecos utilizados pelos usuarios.

3. O QUE FOI AJUSTADO NO SISTEMA

- As versoes destinadas a DES, TQS e producao passam a utilizar o acesso
 corporativo, sem selecionar demonstracao pelo nome do endereco.
- A demonstracao local foi preservada para desenvolvimento, separada dos
 ambientes que devem utilizar a conta corporativa.
- Antes de abrir o sistema, a aplicacao carrega as configuracoes de acesso
 do respectivo ambiente. Os enderecos e a identificacao do aplicativo nao
 ficam fixos no codigo entregue.
- Configuracoes ausentes, incompletas ou ainda nao preenchidas geram erro
 explicito. O sistema nao deve trocar silenciosamente para demonstracao.
- O acesso corporativo e solicitado na inicializacao do sistema.
- O retorno da entrada e da saida utiliza o endereco principal do proprio
 frontend, sem copiar rotas internas de outro aplicativo.
- O mecanismo existente de renovacao da sessao foi preservado. Se a
 renovacao falhar, uma nova entrada e solicitada; falhas sao registradas.
- Foram retirados redirecionamentos de erro que poderiam esconder a causa
 do problema de inicializacao ou de saida.
- A inicializacao nao utiliza a verificacao periodica por quadro oculto
 do provedor de acesso, mantendo a opcao ja adotada no fluxo analisado.
- A preparacao das configuracoes de APIs e da versao foi ampliada para
 abranger os arquivos JavaScript divididos durante a compilacao.
- Foi corrigido o retorno de uma funcao de inicializacao apontado pela
 ferramenta de qualidade, sem retirar a espera pela inicializacao nem
 esconder seus erros.
- As regras de permissao de negocio existentes foram preservadas.
 Nao foram concedidos novos perfis aos usuarios por estas alteracoes.

4. COMO O SISTEMA RECEBE OS DADOS DE CADA AMBIENTE

A Library e o cadastro de configuracoes usado pela equipe de publicacao.
Foi conferido o grupo de DES chamado SIEPR-CURSO-BEC3-FRONTEND-DES.

O processo de publicacao retira o prefixo _ENV. e entrega os valores ao
ambiente onde o sistema executa. O script de inicializacao usa esses valores
para preparar um pequeno arquivo de configuracao antes de disponibilizar
a aplicacao.

Nome na Library             Nome recebido pelo sistema    Finalidade
_ENV.SSO_BASE_PATH          SSO_BASE_PATH                  Endereco do login
_ENV.REALM                  REALM                          Area de autenticacao
_ENV.SSO_CLIENT_ID          SSO_CLIENT_ID                  Identificacao do aplicativo

Foi corrigida a expectativa anterior de CLIENT_ID para SSO_CLIENT_ID.
O arquivo preparado para o navegador contem os campos ssoUrl, ambiente e
clientId. No codigo versionado, existem somente marcadores a preencher.
Nao foram incluidos senhas ou segredos de cliente nesse arquivo.

Na captura da Library apresentada durante o alinhamento, foram observadas
as referencias abaixo:
- Endereco do login: https://logindes.caixa.gov.br/auth
- Area de autenticacao: internet
- Identificacao do aplicativo: cli-web-epr

Esses valores sao referencias da configuracao exibida. A confirmacao de
que o cadastro e os retornos sao adequados ao SIBEC3 permanece no atendimento
da equipe responsavel. Nao representam prova de funcionamento do acesso.

A Library tambem possui configuracoes de APIs. Foram observados enderecos
com finalidades diferentes; nao alteramos esses valores por suposicao.
Nao alteramos a Library nem as definicoes corporativas da publicacao.

5. ALINHAMENTO COM O PADRAO DE PUBLICACAO

Foi conferida a orientacao de aproveitar as configuracoes de cada ambiente.
A release, que e o processo de publicacao, possui uma etapa de substituicao
de marcadores nos arquivos de um pacote separado de configuracao.

Essa etapa inclui arquivos JSON e arquivos de script com extensao. Nao foi
comprovado que ela preencha o arquivo de acesso servido pela imagem do
frontend. Por isso, foi mantida a preparacao desse arquivo na inicializacao,
agora usando os nomes efetivamente entregues pela publicacao.

Nao foi removida uma etapa necessaria apenas pela existencia de outra
substituicao. Uma eventual simplificacao exige confirmar todo esse caminho.

6. ENDERECO E CADASTRO DO RETORNO

Endereco DES utilizado:
https://siepr-curso-bec3-frontend-des.apps.nprd.caixa/login

Endereco principal usado pela correcao para retorno da entrada e da saida:
https://siepr-curso-bec3-frontend-des.apps.nprd.caixa

A equipe de Identidade deve confirmar esse retorno no cadastro corporativo,
incluindo a forma exata do endereco e eventual barra final.
Tambem deve confirmar as origens permitidas e os perfis de acesso necessarios.
Nao foi solicitada liberacao ampla de enderecos.

O fluxo do SIEPR serviu como referencia, mas seus dados e perfis nao foram
copiados automaticamente como configuracao oficial do SIBEC3.

7. ENTREGAS INTEGRADAS

PR 169409:
Correcao da escolha de acesso em DES/TQS, carregamento das configuracoes
antes da abertura do sistema e ajustes de entrada, retorno e saida.
Integracao na develop confirmada.
https://devops.caixa/projetos/Caixa/_git/SIEPR-curso-bec3-frontend/pullrequest/169409

PR 169563:
Alinhamento do nome SSO_CLIENT_ID e correcao do apontamento de qualidade
na inicializacao do login. Integrada na develop em 10/11/2026, as 15h25.
https://devops.caixa/projetos/Caixa/_git/SIEPR-curso-bec3-frontend/pullrequest/169563

Nenhuma dessas integracoes, isoladamente, confirma publicacao em DES.

8. VERIFICACOES REALIZADAS E SEUS LIMITES

Primeira entrega:
- 56 testes locais relacionados ao acesso aprovados.
- Compilacao de producao aprovada.
- Seis cenarios locais sobre a aplicacao compilada verificaram o inicio
 do encaminhamento ao login e a recusa de configuracoes invalidas.

Execucao corporativa anterior, numero 874297:
- Compilacao e 6.592 testes, em 284 grupos, aprovados.
- Cobertura das alteracoes de 90,1%, acima do minimo de 80%.
- Bloqueio na verificacao de qualidade por uma funcao que retornava sempre
 o mesmo valor. A correcao desse ponto foi integrada pela PR 169563.
- Essa execucao terminou com falha e nao criou a nova imagem.
- Houve tambem falha de limpeza ao tentar sair do cluster sem sessao;
 ela nao foi a causa original do bloqueio de qualidade.

Verificacoes locais da segunda entrega:
- 36 testes focados aprovados, em quatro grupos.
- Compilacao de producao e verificacao de tipos aprovadas.
- Sintaxe do script e cinco cenarios de configuracao aprovados, incluindo
 dados obrigatorios ausentes e tratamento correto de caracteres especiais.

Nova execucao corporativa, numero 874372:
- Utiliza a develop com a segunda correcao integrada.
- Iniciada em 10/11/2026, as 15h29min58s.
- Na consulta deste documento: em andamento na etapa Build Application.
- Verificacao de qualidade e criacao da imagem ainda pendentes.
https://devops.caixa/projetos/Caixa/_build/results?buildId=874372

Os testes locais nao utilizaram o acesso corporativo real. Nao comprovam
permissoes, funcionamento completo dos servicos nem entrada e saida em DES.
A validacao visual da ultima versao no navegador da IDE nao foi concluida.

9. CHAMADOS E COMUNICACAO

REQ000147011905:
Aberta em 10/11/2026, as 14h41min49s, no servico SISET - Alteracao de ClientID,
com documento de apoio anexado e conferido. Ultimo estado consultado:
Iniciado. Solicita confirmar os dados e orientar/regularizar o retorno DES.
cli-web-epr e internet foram informados como referencias do pedido anterior,
com solicitacao expressa de confirmacao de adequacao ao SIBEC3.

REQ000146946889:
Atendimento anterior, consultado como fechado automaticamente. Na resposta
de 04/11, a equipe informou que o endereco DES nao constava dos retornos
autorizados e que os perfis citados no atendimento estavam associados.
Essa resposta nao comprova que o retorno tenha sido ajustado depois.

A Historia de Login recebeu anotacao de acompanhamento em 10/11, as 14h49.
Rafael foi informado as 15h29 sobre a nova entrega e a verificacao em curso,
para alinhar a publicacao e evitar trabalho em paralelo.
Essas comunicacoes nao equivalem a confirmacao de publicacao.

10. O QUE AINDA FALTA PARA CONCLUIR

1) Confirmar o resultado final da execucao 874372, inclusive qualidade e imagem.
2) Acompanhar a REQ000147011905 e confirmar cadastro, retorno e perfis.
3) Combinar e realizar a publicacao em DES pelo processo autorizado.
4) Conferir que DES recebeu a nova versao e as configuracoes esperadas.
5) Testar entrada com usuario autorizado e retorno ao SIBEC3.
6) Conferir permissoes, funcionalidades, continuidade da sessao e saida.
7) Registrar evidencias sem senhas ou dados de sessao.
8) Atualizar a HU e a tarefa com os resultados antes de considerar concluido.

11. CUIDADOS DA ENTREGA

Python, simuladores, novos dados ficticios e ferramentas de teste locais
nao fizeram parte das PRs. Senhas, tokens e cookies nao constam deste documento.
Nao foram alterados cadastros ou permissoes corporativas neste trabalho.

Este e um registro de acompanhamento do projeto, nao um manual oficial do
SISET nem uma confirmacao de que o acesso corporativo ja esteja liberado.
Os estados registrados correspondem as consultas indicadas e podem mudar.
ID da Ordem de Trabalho	 WO0000082258113
Criado em	 10/11/2026 14:41:53
Criado por	 F733303
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Anexo do Registro de Solicitação.
ID da Ordem de Trabalho	 WO0000082258113
Criado em	 10/11/2026 14:41:51
Criado por	 Remedy Application Service
Origem de Comunicação	 E-mail
Exibir Acesso	 Interno
Notas	 Este ticket foi criado a partir do sistema de solicitação de serviço.
Impresso por P585600 em Quinta-feira, 12/11/2026 09:31:26
