Atualização sobre o erro de deploy no ambiente TQS (Conditional is marked as unsafe, na task maven_artifact do stack_modules_custom_block.yml):

Identificamos que a causa era o agente de execução utilizado pelo Release. Ele estava configurado para rodar em um agente do pool OKD, que aparentemente tem uma versão de Ansible/Python diferente da usada no pool Release-Linux (mesmo utilizado normalmente em DES) - o que fazia o Ansible marcar a condição como "unsafe" e recusar avaliá-la.

Trocamos o agente do Release para o pool Release-Linux, e o deploy (Release-126) subiu com sucesso no ambiente TQS.

Não era um problema de código da role, nem dos dados de configuração do SICMU - ambos estavam corretos. Considerando resolvido este ponto.
