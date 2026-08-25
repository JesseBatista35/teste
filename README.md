Olá, tudo bem?

Estou analisando o chamado sobre a esteira do siopi-backend-jornada-pj e identifiquei que o ambiente TQS nunca foi habilitado no workflow do repositório (arquivo call-generic-pipelines.yaml), o que faz com que o values-tqs.yaml nunca receba a atualização de imagem pela pipeline.

Antes de prosseguir com o ajuste, preciso confirmar com você: o deploy em TQS desse sistema já funcionou anteriormente, ou essa seria a primeira vez que o TQS é ativado para esse componente?

Isso vai ajudar a definir se o ajuste é apenas incluir TQS no workflow ou se também será necessário registrar a Application/AppProject no ArgoCD para esse ambiente, já que o chamado aberto não mencionou TQS.
