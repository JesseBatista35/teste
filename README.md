Nota para deixar a demanda pendente:

Chamado: siopi-backend-jornada-pj — falha de deploy em TQS (aks-hab-des)

Situação: Pendente de retorno do demandante.

Análise realizada:
Identificadas duas causas relacionadas à falha de deploy em TQS:

Ambiente TQS nunca configurado no workflow do repositório (values-tqs.yaml com imagem em placeholder, não substituída pela pipeline).
Erro "permission denied" ao consultar Application no ArgoCD, provavelmente por ausência de registro de Application/AppProject para TQS neste cluster.

Confirmado com o demandante que o ambiente TQS nunca funcionou anteriormente para este componente — trata-se de primeira ativação.

Questionamento enviado ao demandante:
O deploy em TQS desse sistema já funcionou anteriormente, ou essa seria a primeira vez que o TQS é ativado para esse componente? Essa confirmação é necessária para definir se o ajuste é apenas incluir TQS no workflow ou se também será necessário registrar a Application/AppProject no ArgoCD para esse ambiente, já que o chamado aberto não mencionou TQS.

Pendência:
Aguardando retorno do demandante quanto a esse esclarecimento para prosseguir com o encaminhamento aos times responsáveis (desenvolvimento e administração ArgoCD).
