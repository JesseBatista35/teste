À equipe COE – Nuvem / CESTI35

Prezados,

Encaminhamos a WO0000081889976 para tratamento, pois o bloqueio reportado pelos desenvolvedores do SISPM está relacionado ao cluster eks-cdc-nprd (conta AWS 225632394003 – accdepecapnprd, sa-east-1), sob responsabilidade da equipe COE conforme tags do recurso (EquipeInfra: COE / IncidentResolutionTeam: CESTI35 / Owner: Joe Santana Ferreira).

Contexto
O endpoint da API do eks-cdc-nprd é privado (VPC vpc-spoke-nprd – 10.249.79.0/24). Para exibir os recursos do cluster no console AWS, o navegador do usuário precisa acessar esse endpoint diretamente.

Validações realizadas pela Esteira DevOps (estação via VPN, IP 10.211.14.6)

DNS: OK. 7E48322A0761B3CA4EC5B83EC023BD28.gr7.sa-east-1.eks.amazonaws.com resolve para 10.249.79.56 e 10.249.79.82.
Firewall / rota: OK. TCP 443 para os dois IPs com sucesso (Test-NetConnection). A regra da CRQ000001513603 está funcional.
HTTPS direto, sem proxy: OK. O endpoint respondeu HTTP 401 (esperado, sem credencial).
Console AWS (EKS → Recursos → Pods): FALHA, com “Failed to fetch”.

Ajustes necessários

Access Entry no cluster (COE)
As Access Entries do eks-cdc-nprd contemplam apenas PermissionSetSupportWrite, aft-global-TerraformPipeline-Role, eks-cdc-nprd-node-role, vpc-spoke-nprd-EC2-SSM-Role e a service role do EKS. Não há entrada para o permission set dos desenvolvedores do SISPM.
Solicitamos: criar Access Entry para o permission set dos desenvolvedores, com política adequada (ex: AmazonEKSViewPolicy, restrita aos namespaces do SISPM se aplicável).
Exceção no proxy/PAC (COE articular com a equipe responsável pelo PAC)
As estações usam o PAC http://siprx.caixa:4713/files/siprx-pacv4.pac (proxy prd-internet365.caixa:80), cuja lista de exceções contempla apenas *.caixa, *.caixa.gov.br e 10.*. Por isso o hostname do endpoint privado do EKS é enviado ao proxy de internet, que não o alcança.
Solicitamos: incluir exceção DIRECT para o hostname 7E48322A0761B3CA4EC5B83EC023BD28.gr7.sa-east-1.eks.amazonaws.com. Não recomendamos *.eks.amazonaws.com genérico, para não impactar clusters com endpoint público. Se outros clusters privados do COE tiverem o mesmo cenário, vale avaliar um padrão de exceção para todos.

Pendência com o solicitante: informar qual permission set os desenvolvedores utilizam no portal AWS (exibido no topo do console).

A Esteira DevOps DES/TQS NPRD permanece à disposição para apoio.

Att,
Esteira DevOps DES TQS NPRD
