Pessoal, boa tarde! 👋

Continuando a investigação do problema no SIGPF-internet (DES/TQS/HMP), identificamos a causa raiz e já sabemos como corrigir.

🔍 *Causa raiz identificada*

O Apache ModCluster está desabilitado nos servidores de apresentação (caddeapllx135 e caddeapllx136). Sem ele, o balancer do Apache não recebe os workers do JBoss dinamicamente, fazendo todas as requisições ao SIGPF-internet retornarem 403 Forbidden.

A correção será adicionar o BalancerMember diretamente no arquivo de configuração do Apache, apontando para os servidores JBoss do SIGPF-internet — mesmo padrão já utilizado por outras aplicações nesse Apache como o SISOU.

✅ *O que já foi verificado*
- nginx OKD (frontend) configurado e funcionando corretamente
- JBoss (backend) respondendo normalmente na porta 8080
- Arquivo de configuração do Apache correto, apenas sem o BalancerMember

📌 *O que precisamos*

Para concluir a correção, precisamos que o time de backend nos informe:

1. Quantos nós JBoss existem para o SIGPF-internet no ambiente DES?
2. Quais os IPs e portas AJP/HTTP de cada nó?
3. As mesmas informações para TQS e HMP, pois o mesmo problema ocorre nesses ambientes

Assim que tivermos os IPs aplicamos a correção nos três ambientes. Qualquer dúvida estou à disposição! 🙂
