Pessoal, boa tarde! 👋

Identificamos a causa raiz do problema no SIGPF-internet e estamos na reta final da correção.

🔍 *O problema*

O Apache dos servidores de apresentação (caddeapllx135 e caddeapllx136) está configurado para rotear as requisições do SIGPF-internet para um balanceador de carga interno, porém esse balanceador não tem nenhum servidor de aplicação (JBoss) cadastrado. Por isso o Apache retorna 403 Forbidden para todas as requisições.

✅ *O que já confirmamos*
- O servidor JBoss 10.116.194.61 porta 8080 está funcionando normalmente
- O frontend (OKD/nginx) está configurado corretamente
- A correção é simples: adicionar os IPs dos servidores JBoss na configuração do Apache

📌 *O que precisamos*

Para finalizar a correção nos ambientes DES, TQS e HMP, precisamos que o time responsável pelo SIGPF-internet nos informe:

1. Quais são todos os servidores JBoss (IPs e portas) do SIGPF-internet em cada ambiente?
   - DES: já identificamos 10.116.194.61:8080 — há outros nós?
   - TQS: quais são os IPs?
   - HMP: quais são os IPs?

Assim que recebermos essa informação aplicamos a correção imediatamente nos três ambientes. 🙂
