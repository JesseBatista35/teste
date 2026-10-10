Evandro, terminei a análise da WO0000081889976 (SISPM). Segue o passo a passo do que fiz e o que encontrei:

*1. Descobrir onde o SISPM roda*
No GitHub (caixagithub) os repos sispm-backend-* têm os pares -infranprd/-infraprd. No values/config do sispm-backend-informe-segregacao-infranprd vi que o deploy vai para o cluster EKS *eks-cdc-nprd* via ArgoCD.

*2. Achar a conta AWS*
A mensagem do Felipe que a Shirlei encaminhou cita a VPC 10.249.79.0/24 da conta 225632394003. No portal de acesso da AWS esse ID é a conta *accdepecapnprd*.

*3. Conferir no console AWS (região São Paulo)*
• VPC: vpc-spoke-nprd, faixa 10.249.79.0/24 (o destino da CRQ)
• EKS: eks-cdc-nprd está nessa conta, com endpoint da API *privado*
• Ao abrir os Pods no console, dá "Failed to fetch". Consegui reproduzir o mesmo problema dos devs
• Pelas tags, o cluster é do *COE*, time de incidente *CESTI35*, owner Joe Santana Ferreira

*4. Testar a rede da minha estação (VPN)*
• DNS: o endpoint do cluster resolve para 10.249.79.56 e .82 ✅
• Porta 443: Test-NetConnection conectou nos dois IPs ✅
• curl direto, sem proxy: o cluster respondeu 401 (normal, sem credencial) ✅
Ou seja, a regra de firewall da CRQ000001513603 está funcionando.

*5. Achar o que bloqueia de verdade*
• *Proxy do navegador:* o navegador usa o PAC siprx-pacv4.pac, que manda o endereço do EKS (*.eks.amazonaws.com) para o proxy de internet. Como o endpoint é privado, o proxy não alcança e o console mostra "Failed to fetch". Pelo CMD funciona porque não passa pelo proxy.
• *Permissão no cluster:* nas Access Entries do EKS só tem o perfil PermissionSetSupportWrite e roles técnicas. Não tem nenhuma entrada para o perfil dos devs, então mesmo resolvendo o proxy eles vão tomar "Unauthorized".

*Conclusão*
O firewall está OK. Faltam duas ações, nenhuma de Esteiras:
1. *Equipe de Proxy/PAC:* exceção DIRECT para o hostname do cluster (7E48322A0761B3CA4EC5B83EC023BD28.gr7.sa-east-1.eks.amazonaws.com). Melhor não liberar *.eks.amazonaws.com inteiro para não quebrar clusters com endpoint público.
2. *COE / CESTI35:* criar Access Entry no eks-cdc-nprd para o permission set dos devs do SISPM.

Só falta perguntar aos devs qual permission set eles usam (aparece no topo do console AWS). Já deixei a nota da WO pronta com as evidências, te mando pra você registrar e reatribuir.
