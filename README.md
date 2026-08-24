Pessoal, bom dia.

Atualização sobre o erro de timeout/tela em branco no menu do SICMU (erro ISPN000299 - contenção de lock no cache de sessões).

Confirmamos que o mesmo comportamento ocorre tanto em DES quanto em TQS. Isso reforça que a causa não está ligada a uma particularidade de infraestrutura de um ambiente específico, e sim a um comportamento da própria aplicação.

Analisando o código da tela (identificarOperacaoHabit.xhtml), identificamos que o botão de ação (btnPesquisar) não possui nenhuma proteção contra duplo clique ou reenvio da requisição:

<h:commandLink id="btnPesquisar" onclick="showModal('ajaxStatus')"
action="#{identificarOperacaoHabitacionalBean.validarContrato()}" .../>

Nossa hipótese é que, em situações de resposta mais lenta (ex: dependência de comunicação com CICS via JConnector), o usuário pode clicar novamente no botão antes da primeira requisição finalizar, gerando duas requisições quase simultâneas para a mesma sessão. Isso levaria à disputa pelo mesmo lock de sessão no Infinispan (SessionCreationMetaDataKey), resultando no erro observado.

Essa é uma hipótese, ainda não confirmada com certeza absoluta, mas é o achado mais consistente com as evidências que levantamos até aqui.

Solicitamos que o time de desenvolvimento avalie:

Se é possível implementar proteção contra duplo clique/reenvio nesse botão (e possivelmente em outros pontos similares da aplicação com o mesmo padrão).
Se há algum outro ponto no fluxo da tela que possa estar disparando requisições concorrentes para a mesma sessão.

Ficamos à disposição para qualquer informação adicional que possa ajudar na análise.
