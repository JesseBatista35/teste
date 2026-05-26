Diego, boa tarde!

Segue a análise completa com todas as evidências levantadas durante a investigação do problema no SIGPF-internet (DES/TQS/HMP).

🔍 CAUSA RAIZ IDENTIFICADA

Um deploy do pipeline SIGPF-internet-backend executado no dia 13/05/2026 às 17:04 pelo usuário c158533 sobrescreveu o arquivo de configuração do Apache nos servidores de apresentação, removendo o bloco <Proxy> com os BalancerMember. Sem esse bloco, o balancer://sigpf-internet ficou sem nenhum servidor backend cadastrado, fazendo o Apache retornar 403 Forbidden para todas as requisições.

📊 EVIDÊNCIAS

1. Timestamp de modificação do arquivo no servidor:
Arquivo: /opt/jbcs-httpd24-2.4/httpd/sites-available/httpd-eap71-des-sigpf-internet.conf
Modify: 2026-05-13 17:06:03
Change: 2026-05-13 17:06:03

2. Deploy executado no Azure DevOps:
Pipeline: SIGPF-internet-backend
Data/hora: 13/05/2026 às 17:04
Usuário: c158533
Stage: DES
Status: Sucesso

3. Correlação temporal:
Deploy executado às 17:04 → arquivo modificado às 17:06 → diferença de apenas 2 minutos, confirmando que foi o pipeline que sobrescreveu o arquivo.

4. Teste direto no JBoss (backend):
curl http://10.116.194.61:8080/sigpf_internet/ → HTTP 302 (funcionando normalmente)

5. Teste via Apache (apresentação):
curl https://sigpf-internet.esteiras.des.caixa/sigpf_internet/ → HTTP 403 Forbidden
Erro nos logs: AH01630: client denied by server configuration: /opt/jbcs-httpd24-2.4/httpd/htdocs/httpd_eap_71_esteiraagil/sigpf_internet

6. Verificação do balancer:
curl http://localhost/balancer-manager → retornou vazio, sem nenhum BalancerMember registrado para o balancer://sigpf-internet.

7. Frontend (OKD/nginx) verificado e funcionando:
ConfigMap nginx-conf-d-sigpf-internet-frontend confirmado com proxy_pass https://sigpf-internet.esteiras.des.caixa/sigpf_internet/ (HTTPS correto).
O frontend roteia corretamente para o Apache, que é onde o problema ocorre.

🛠️ CORREÇÃO NECESSÁRIA

Adicionar o bloco <Proxy> com os BalancerMember no arquivo de configuração do Apache em caddeapllx135 e caddeapllx136, conforme os servidores JBoss informados pelo Jesse:

DES → caddeapllx832.agil.nprd.caixa.gov.br:8080
TQS → caddeapllx575.agil.nprd.caixa.gov.br:8080
HMP → caddeapllx1104.agil.nprd.caixa.gov.br:8080 e caddeapllx1161.agil.nprd.caixa.gov.br:8080

O bloco a ser adicionado no conf de cada ambiente:

<Proxy balancer://sigpf-internet>
    BalancerMember http://<IP_JBOSS>:8080 retry=180 connectiontimeout=1000ms ping=500ms
    ProxySet stickysession=JSESSIONID|jsessionid
</Proxy>

Além disso, recomendamos revisar o pipeline SIGPF-internet-backend para que futuros deploys não sobrescrevam a configuração do Apache sem preservar os BalancerMember.

Qualquer dúvida estou à disposição! 🙂
