Especificação da tarefa

A demanda visa adicionar ao InfraFácil, uma funcionalidade que permita os usuários realizarem testes de regra de Firewall. O menu dessa funcionalidade ficará no Restrito > Regras de Firewall > Teste para Regra de FW.

Ao clicar na funcionalidade, deverá abrir uma tela com o card de dicas e o seguinte campo:

Opções de teste: esse campo deve permitir a seleção do tipo de teste que será executado. Esse do tipo dropdown que exiba as opções de testes, para essa primeira entrega, as opções devem se resumir a Container, VM (Em breve) e Mainframe (Em breve). Porém as opções VM (Em breve) e Mainframe (Em breve) devem ser exibidas de forma inabilitada.

Após o usuário escolher o tipo de teste, deverá ser apresentado a tela com os cards “Informações do ambiente” e “Dados para teste”.

No card “Informações do ambiente” deverá conter os seguintes campos:
Cluster
Projeto
IP de saída

 
No card “Dados para teste” deverá conter os seguintes campos:
Protocolo de teste
IP de destino ou domain
Porta
Botão “+” *Definir com o desenvolvedor o máximo de IPs que o usuário pode utilizar para testes: 6 ou 8.
IPs e portas adicionadas

Quando o usuário preencher todos os campos, o botão “TESTAR” deve ser habilitado para o usuário utilizar.

O botão “TESTAR” irá executar o serviço de testes de regra de Firewall
Após o usuário clicar no botão, deverá ser apresentado em tela um modal com a frase “Teste finalizado! Por favor, acesse a página de histórico para verificar os detalhes.”, indicando ao usuário que a solicitação foi atendida.
Nesse modal a palavra “Histórico” será um hiperlink clicável para que o usuário seja encaminhado para a tela de histórico com todas as solicitações de regra de Firewall.
A tela de histórico apresentará todos os registros de testes de Firewall que foram solicitados. Nesta tela as seguintes colunas serão apresentadas:

Projeto
IP de origem
IP destino
Porta
Status
Ações

Após acessar a tela de histórico o usuário poderá clicar no botão “VER MAIS” analisar o resultado e todas as informações relacionadas ao teste em questão.


Fluxo

O card “Informações de Ambiente” deverá se comportar da seguinte forma dependendo se o usuário entrou com sistema ou sem sistema:

Login com sistema:
Por padrão, será autopreenchido os seguintes campos: “Cluster”, “Projeto” e “IP de saída”
Login sem sistema:
Por padrão o usuário deverá fornecer as informações dos seguintes campos: “Cluster” e “Projeto”, de forma que com as informações desses dois campos, o campo “IP de saída” será autopreenchido.
Os campos “Cluster” e “Projeto” serão autopreenchidos quando o campo “IP de saída” for preenchido pelo usuário.

Comportamento dos campos

Tela 1

A primeira tela será composta da seguinte forma:

Opções de teste
Campo do tipo dropdown com as seguintes opções: Container, VM (Em breve) e Mainframe (Em breve)

A tela após a seleção do tipo de teste apresentará os seguintes campos:

No card “Informações do ambiente” deverá conter os seguintes campos:
Cluster (Campo do tipo dropdown que deve listar todos os Clusters considerados para a funcionalidade)
Projeto (Campo do tipo texto livre, com autopreenchimento, que deve permitir o usuário informar o nome do projeto)
IP de saída (Campo do tipo alfanumérico deve permitir o usuário informar o IP de saída)
Este campo de IP de saída terá um validador, para ver se o usuário colocou um IP correto em relação ao range de IPs dos Clusters disponíveis. Caso o usuário coloque um IP incorreto, deverá aparecer uma frase de warning: *stakeholder irá mandar o range de IPs
AUX 1 3791.JPG
No card “Dados para teste” deverá conter os seguintes campos:
Protocolo de teste (Campo do tipo dropdown que deve listar todos os protocolos de teste “TCP”, “UDP” e “ICMP". Porém, os protocolos “UDP” e “ICMP" deverão aparecer inabilitados)
IP de destino ou domain (Campo do tipo texto livre que deve permitir o usuário informar o “IP de destino” ou “domain”)
Porta (Campo do tipo alfanumérico deve permitir o usuário informar a Porta de saída)
Botão “+” (Botão, quando acionado, deve permitir a inclusão de mais “IPs” e “Portas”)

Modal Tela 1

Ao finalizar o passo da tela anterior, será aberto um modal da seguinte forma:

Terá o botão “TESTAR” que irá executar o serviço de testes de regra de Firewall
Ao clicar no botão será apresentado um modal com a frase “Teste finalizado! Por favor, acesse a página de histórico para verificar os detalhes.” Indicando ao usuário que a solicitação foi atendida.
Nesse modal a palavra “Histórico” será um hiperlink clicável que irá direcionar o usuário para a tela de histórico com todas as solicitações de regra de Firewall.

Tela 2

A segunda tela será composta da seguinte forma:

O Menu de Histórico terá as colunas da seguinte forma:
                      
Projeto 
IP de origem
IP destino
Porta
Status
Ações
 

Os filtros das colunas funcionarão da seguinte maneira:

Projeto (Campo de texto livre, através do preenchimento deste campo, o sistema deverá filtrar e listar o histórico de testes que correspondam ao texto preenchido)
IP de origem (Campo do tipo alfanumérico, através do preenchimento deste campo, o sistema deverá filtrar e listar o histórico de testes que correspondam ao texto preenchido)
IP destino (Campo do tipo alfanumérico, através do preenchimento deste campo, o sistema deverá filtrar e listar o histórico de testes que correspondam ao texto preenchido)
Porta (Campo do tipo alfanumérico, através do preenchimento deste campo, o sistema deverá filtrar e listar o histórico de testes que correspondam à porta preenchida)
Status (Campo de texto do tipo texto livre, através do preenchimento das opções de Status: “Sucesso” ou “Erro". O sistema deverá filtrar e listar o histórico de testes que correspondam a opção preenchida)
 

A linhas de histórico de testes, devem ser exibidas, de acordo com a combinação de filtros, preenchida. Os seguintes campos devem ser listados na pré-visualização dos testes:

Projeto (Campo de texto que deve exibir o projeto preenchido pelo usuário para o teste em questão.)
IP de Origem (Campo de texto alfanumérico que deve exibir o IP de origem (1.1.1.1), preenchido pelo usuário para o teste em questão.)
IP de destino (Campo de texto alfanumérico que deve exibir o IP de destino (1.1.1.1), preenchido pelo usuário para o teste em questão.)
Porta (Campo de texto alfanumérico que deve exibir a porta preenchida pelo usuário para o teste em questão.)
Status (Campo de texto que deve exibir o status retornado a partir da execução do teste em questão: “Sucesso” ou “Erro".)
Data do teste (Campo de texto que deve exibir a data (DD/MM/AAAA) da execução do teste em questão.)
Ações (Campo de texto que deve exibir o botão “VER MAIS”)
Ver Mais Botão, que quando acionado deve direcionar ao modal com a visão de todas as informações relacionadas ao teste em questão.

Observação: Cada IP e Porta adicionada deve gerar um registro de teste na tela de Histórico. Não deverá ser agrupado mais de um IP e Porta por teste, por exemplo: o usuário colocou 4 IPs e 4 Portas, então gerará 4 registros de testes.

Modal Tela 2

Ao acessar a funcionalidade do botão “VER MAIS”, será aberto um modal contendo as seguintes informações que foram preenchidas pelo usuário e o resulta do teste:

Data de criação (Apresentar o dado preenchido pelo usuário)
Solicitante (Apresentar a matrícula do usuário solicitante)
Opções de teste (Apresentar o dado preenchido pelo usuário)
Cluster (Apresentar o dado selecionado pelo usuário)
Projeto (Apresentar o dado preenchido pelo usuário)
IP saída (Apresentar o dado preenchido pelo usuário)
Protocolo de teste (Apresentar o dado selecionado pelo usuário)
IP de destino ou domain (Apresentar o dado preenchido pelo usuário)
Porta (Apresentar o dado preenchido pelo usuário)
Resultado do teste (Apresentar os dados/log do teste de forma completa)

Observação: Em nenhum campo desta funcionalidade será permitido o input de caracteres especiais (;, %, $, &, |, \ e etc), sendo assim, as strings passadas pelo usuário deverão ser validadas.



39 packages are looking for funding
  run `npm fund` for details
npm notice
npm notice New major version of npm available! 10.9.3 -> 11.6.2
npm notice Changelog: https://github.com/npm/cli/releases/tag/v11.6.2
npm notice To update run: npm install -g npm@11.6.2
npm notice



CREATE TABLE public.tb_comunidades (
	id serial4 NOT NULL,
	nome varchar(200) NULL,
	codigo varchar(200) NULL,
	status varchar(200) NULL,
	CONSTRAINT tb_comunidades_pkey PRIMARY KEY (id)
);


INSERT INTO public.tb_comunidades
(id, nome, codigo, status)
VALUES(nextval('tb_comunidades_id_seq'::regclass), 'Box - Box Cidadania Digital', 'SAST_FORTIFY_COMUNIDADE_CIDADANIA_DIGITAL', 'ativo');


