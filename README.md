Boa, entendi o que rolou. Na real, a resposta do storage tá certa em parte, mas confusa — o storage entrega só o export raiz (/fs_siorf), quem decide onde isso aparece dentro do container é o mountPath configurado no DC (lado da Esteiras, não do storage).

O que aconteceu: no DC do siorf-backend-des, o volumeMount foi configurado apontando direto pra /siorf/Convenio/Resultado (é isso que aparece no df -h: o export /fs_siorf foi "colado" exatamente nesse path dentro do container). Ou seja, o storage não criou pasta nenhuma — ele só exportou o /fs_siorf; fomos nós (Esteiras) que configuramos o mountPath apontando pra esse subcaminho específico, em vez de montar na raiz.

Pra fazer como vocês combinaram (montar só /siorf e a aplicação gerenciar as subpastas), não precisa abrir nova REQ nem mexer no storage — é só eu ajustar o mountPath no DC de /siorf/Convenio/Resultado pra /siorf. Aí a pasta Convenio/Resultado (e as outras que vierem: Convenio/Processar, Empenho/Resultado etc) passam a ser geridas dentro do container, pela aplicação.

Sobre a permissão: a pasta hoje está com 777 (drwxrwxrwx), então qualquer usuário — incluindo o usuário de aplicação — tem permissão total de leitura/escrita/criação ali dentro. Então sim, o usuário de aplicação consegue criar subpastas, desde que a raiz /siorf mantenha essa mesma permissão quando eu fizer o ajuste do mountPath.

Posso ajustar o mountPath do DES agora pra validar? Se der certo, aplicamos o mesmo padrão quando o storage finalizar a REQ do TQS.
