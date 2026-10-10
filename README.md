rezados,

Realizamos análise completa do bloqueio de acesso reportado pelos desenvolvedores do SISPM. Segue diagnóstico com evidências.

Contexto
O SISPM é implantado via GitHub/GitOps no cluster eks-cdc-nprd (conta AWS 225632394003 – accdepecapnprd, região sa-east-1), cujo endpoint da API Kubernetes é privado, na VPC vpc-spoke-nprd (10.249.79.0/24). Para exibir os recursos do cluster no console AWS, o navegador do usuário precisa acessar diretamente esse endpoint privado.

Validações realizadas (estação p585600, IP 10.211.14.6)

DNS: OK. 7E48322A0761B3CA4EC5B83EC023BD28.gr7.sa-east-1.eks.amazonaws.com resolve para 10.249.79.56 e 10.249.79.82.
Firewall / rota: OK. Test-NetConnection na porta 443 para os dois IPs retornou TcpTestSucceeded: True. A regra da CRQ000001513603 está funcional.
Acesso HTTPS direto (sem proxy): OK. curl --noproxy ao endpoint retornou HTTP 401 (resposta esperada sem credencial; confirma que o serviço é alcançável).
Console AWS (navegador): FALHA. EKS → Recursos → Pods retorna “Failed to fetch”.

Causas identificadas

Proxy do navegador: a estação utiliza o PAC http://siprx.caixa:4713/files/siprx-pacv4.pac (proxy prd-internet365.caixa:80), cuja lista de exceções contempla apenas *.caixa, *.caixa.gov.br e 10.*. O hostname do endpoint privado do EKS é encaminhado ao proxy de internet, que não alcança o endpoint privado.
Ação (equipe responsável pelo PAC/Proxy): incluir no PAC a exceção (DIRECT) para o hostname 7E48322A0761B3CA4EC5B83EC023BD28.gr7.sa-east-1.eks.amazonaws.com. Não recomendamos exceção genérica *.eks.amazonaws.com, para não impactar clusters com endpoint público.
Permissão no cluster: as entradas de acesso (Access Entries) do eks-cdc-nprd contemplam apenas o permission set PermissionSetSupportWrite, a pipeline Terraform (AFT), os nós e a role SSM. Não há entrada para o permission set utilizado pelos desenvolvedores.
Ação (COE / CESTI35 – responsáveis pelo cluster conforme tags): criar Access Entry para o permission set dos desenvolvedores do SISPM, com política adequada (ex: AmazonEKSViewPolicy, restrita aos namespaces do SISPM se aplicável).

Conclusão
A regra de firewall da CRQ000001513603 está funcionando corretamente. As pendências estão fora do escopo da Esteira DevOps DES/TQS NPRD: exceção no PAC/proxy e Access Entry no cluster EKS.

Att,
Esteira DevOps DES TQS NPRD
