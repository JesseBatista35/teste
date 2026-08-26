Consolidando as atualizações de hoje:

Sobre a dependência do jconnector no servidor

Não recadastramos nada agora - a correção que fizemos direto na VM (adicionar a dependência do jconnector no module.xml do sisgr) já estava aplicada desde os testes anteriores e continua lá, intacta.
O que mudou hoje foi o pacote da aplicação: identificamos uma linha extra no jboss-deployment-structure.xml do SICMU (br.gov.caixa.psc.connector, sem "j") que havia sido adicionada por engano, referenciando um módulo que não existe no servidor. Isso estava quebrando o deploy inteiro. Removemos essa linha, e com o deploy subindo limpo, a correção do module.xml (já presente no servidor desde antes) finalmente pôde funcionar sem ser bloqueada pela falha de deploy.

Sobre a REQ original (timeout/tela em branco no menu - erro ISPN000299)

Identificamos que a causa não estava na esteira nem na configuração do Terraform, como chegamos a suspeitar inicialmente. A causa raiz era a tag <distributable/> presente no web.xml da aplicação, que ativava replicação de sessão (Infinispan) mesmo rodando em uma única VM, sem necessidade de cluster - isso gerava a contenção de lock que travava o acesso a qualquer funcionalidade do menu.
Já removemos essa tag também, no mesmo pacote publicado hoje. Esse problema deve estar resolvido em conjunto com o do jconnector/sisgr.

Sobre o novo travamento reportado (Marcelo)

Analisamos o log enviado. O erro agora é outro, e confirma que o SISGR/JConnector já está funcionando corretamente:

SEVERE [br.gov.caixa.util.jcicsconnect.JCicsConnect] Erro no login (JDIRSGRD em S1): [Erro CICS: 0][Resp: 0070][Resp2: 0002] Login não autorizado: Senha fornecida inválida.

O JConnector está conectando e tentando autenticar no CICS normalmente. O problema agora é que a senha configurada para o usuário JDIRSGRD no ambiente S1 está sendo recusada pelo CICS como inválida.

Isso não é mais escopo de infraestrutura/deploy - é uma credencial (usuário/senha) configurada no sicmu_jconnector.properties que precisa ser validada com o time responsável (segurança/mainframe). Vocês têm como confirmar se essa credencial está correta e ativa para o ambiente DES?

Ficamos à disposição.
