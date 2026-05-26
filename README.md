Diego, boa tarde!

Seguem as informações sobre o que foi identificado:

O frontend do SIGPF-internet roda em container nginx no OKD e o arquivo sigpf-nginx.conf usa o placeholder __SIGPF_URL_API__ que é substituído pela variável da library do Azure DevOps em tempo de deploy. Essa variável aponta para https://sigpf-internet.esteiras.des.caixa/sigpf_internet/ que é justamente o Apache ModCluster dos servidores caddeapllx135 e caddeapllx136.

O problema não está no frontend — o nginx está configurado corretamente e o placeholder foi substituído com sucesso. O problema está na camada do Apache, onde o balancer://sigpf-internet não possui nenhum BalancerMember cadastrado, fazendo o Apache retornar 403 Forbidden antes de chegar ao JBoss.

Confirmamos que o JBoss (caddeapllx832) está funcionando normalmente — testamos direto na porta 8080 e retornou 302 redirecionando para o login da Caixa corretamente.

Sobre o motivo de ter parado: acreditamos que em algum momento o BalancerMember foi removido do arquivo de configuração do Apache, possivelmente durante uma manutenção ou atualização anterior. O ModCluster está desabilitado desde 2022, então os workers precisam ser definidos estaticamente no conf — e atualmente não estão.

Já temos os IPs dos backends fornecidos pelo Jesse:
- DES: caddeapllx832.agil.nprd.caixa.gov.br
- TQS: caddeapllx575.agil.nprd.caixa.gov.br
- HMP: caddeapllx1104.agil.nprd.caixa.gov.br e caddeapllx1161.agil.nprd.caixa.gov.br

Vou aplicar a configuração do BalancerMember nos arquivos do Apache agora. Qualquer dúvida fico à disposição! 🙂
