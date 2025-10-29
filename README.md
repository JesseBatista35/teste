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
