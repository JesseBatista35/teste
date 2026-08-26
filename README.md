Bom dia, pessoal. Segue o resumo consolidado de toda a investigação e correções realizadas até o momento no ambiente DES do SICMU.

1. Erro NoClassDefFoundError / JConnectorException (validação de acesso via SISGR)

Causa raiz: o módulo br.gov.caixa.sisgr, instalado no servidor, não declarava dependência do módulo br.gov.caixa.psc.jconnector no seu module.xml:

/opt/jboss-eap/modules/system/layers/base/br/gov/caixa/sisgr/main/module.xml

Faltava a linha:
<module name="br.gov.caixa.psc.jconnector"/>

Correção: adicionamos essa dependência diretamente no module.xml do servidor.

Respondendo à pergunta do Marcelo sobre se recadastramos isso novamente agora: não. Essa correção já havia sido aplicada por nós manualmente há alguns dias, direto na VM, e continuou lá intacta - não mexemos nela de novo hoje. O que resolveu o problema hoje foi o item 2 abaixo (a correção do deploy que estava falhando), que permitiu que essa correção já existente no module.xml finalmente entrasse em vigor sem ser bloqueada.

Importante reforçar: essa correção no module.xml é manual (direto na VM) e não está persistida em nenhum repositório/pipeline até o momento - se a VM passar por um destroy/recriação via Terraform, essa alteração se perde e o erro volta a ocorrer. Recomendamos que essa correção seja levada para a origem do módulo SISGR por quem o mantém, para não depender de reaplicação manual.

2. Deploy falhando após tentativa de correção (ModuleNotFoundException)

Durante o processo, identificamos que uma linha havia sido adicionada por engano no jboss-deployment-structure.xml do SICMU:

<module name="br.gov.caixa.psc.connector" />

Esse módulo (sem "j") não existe no servidor - o nome correto é br.gov.caixa.psc.jconnector, que já estava corretamente declarado nas linhas acima. Essa linha extra fazia o JBoss tentar carregar um módulo inexistente, derrubando o deploy inteiro do EAR (SICMU-ejb.jar e SICMU-web.war ficavam com status FAILED) - e por isso a correção do item 1 não estava conseguindo entrar em vigor até agora.

Correção: removemos essa linha extra na branch de teste CESTI-test001. Com isso, o deploy voltou a subir normalmente.

3. Erro de timeout/tela em branco no menu do SICMU (ISPN000299 - contenção de lock de sessão)

Essa era a causa da REQ original. Confirmamos que o mesmo erro ocorria tanto em DES quanto em TQS, descartando configuração específica de ambiente.

Causa raiz: a tag <distributable/> no web.xml da aplicação, que ativa replicação de sessão via Infinispan - mecanismo próprio para múltiplos nós em cluster. Como confirmamos (via Terraform) que existe apenas uma VM rodando o SICMU em DES, essa réplica não tinha função alguma, e gerava contenção de lock sempre que múltiplas requisições da mesma sessão chegavam simultaneamente (comportamento normal do navegador).

Correção: removemos a tag <distributable/> do web.xml, também na branch CESTI-test001.

4. Novo erro identificado após as correções acima (login CICS)

Com as correções acima aplicadas, o Marcelo conseguiu avançar além das barreiras anteriores e reportou um novo erro na tentativa de acesso ao CICS:

SEVERE [br.gov.caixa.util.jcicsconnect.JCicsConnect] Erro no login (JDIRSGRD em S1): [Erro CICS: 0][Resp: 0070][Resp2: 0002] Login não autorizado: Senha fornecida inválida.

Isso confirma que o JConnector já está funcionando corretamente. O problema agora é a credencial (usuário JDIRSGRD, ambiente S1) sendo recusada pelo CICS como inválida - não é mais escopo de infraestrutura/deploy, e sim uma credencial configurada no sicmu_jconnector.properties que precisa ser validada com o time responsável (segurança/mainframe).
