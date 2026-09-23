Olá,

Analisando a falha do deploy em DES do sisph-api-painel-ddd, identificamos que o config.yaml do GitOps aponta para o cluster aks-sisph-nprd. Esse cluster não existe na subscription, por isso a aplicação não foi criada no ArgoCD e nenhum pod aparece no FusionX.

Para seguirmos com a correção, precisamos que confirmem:

Em qual AKS a aplicação deve ser implantada em DES (e, se já souberem, em TQS e HMP)? Vimos que o sisph-api-auditoria usa o aks-hab-des. O painel-ddd deve seguir o mesmo cluster?
Qual Key Vault deve ser usado (kv-hab-des ou kv-sisph-hab-des)? A aplicação vai precisar de certificado/HTTPS ou de secrets nesse primeiro momento?
Qual host/DNS deve ser exposto no Istio para DES? O values.yaml atual está com o domínio de HMP (apl.hmp-nprd.private.azure).

Com essas informações, ajustamos o config.yaml e o repositório sisph-api-painel-ddd-infranprd e reexecutamos a esteira.
