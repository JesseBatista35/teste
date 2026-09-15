À Nuvem,

Falha de build via GitHub Actions há quase duas semanas: timeout ao conectar no Nexus Caixa (binario.caixa, 10.122.155.40:443) durante resolução de dependências Maven/Quarkus. WO0000081656136.
Ref: https://github.com/caixagithub/sisfm-backend-painelconta/actions/runs/34846602950/job/104011298622

Redes/CETEL já verificou o trecho entre 10.122.147.55 e 10.219.194.164, não encontrou problema e classificou como fora do escopo de Redes-Datacenter.

O runner assume role em conta AWS PAAS (login ECR sa-east-1) antes do build, então a origem da conexão está do lado de Nuvem. Solicito verificação de conectividade/egress dessa conta AWS PAAS até o binario.caixa (rota, VPN, proxy, security group/NACL), incluindo se houve alteração recente.

Não é caso isolado: mesmo erro confirmado também em sisfm-bff-navbar (run 33888199751), indicando causa de infraestrutura compartilhada.

Att,
Jessé Batista
CTIS/CESTI Esteira DEVOPS DES TQS NPRD
