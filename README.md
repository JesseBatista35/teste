ASSUNTO: Informações Necessárias - Configuração NGINX para API SIGCT

Prezados,

Conforme demanda de Contratações e Logística, foi confirmado que a rota 
/sigct_backend/rest/ não está configurada no arquivo NGINX do servidor 
TQS (sctdeapllx0018.df.caixa - 10.116.83.19).

DIAGNÓSTICO REALIZADO:
✓ NGINX está ativo e funcionando
✓ Configuração NGINX é válida
✗ Rota sigct_backend NÃO existe no NGINX

PARA PROCEDERMOS COM A SOLUÇÃO, SOLICITAMOS AS SEGUINTES INFORMAÇÕES:

1. IP ou HOSTNAME do servidor BACKEND que hospeda a API SIGCT
   Exemplo: 10.116.x.x ou sigct-backend.df.caixa
   
2. PORTA em que o serviço está rodando
   Exemplo: 8080, 9090, 80, 443

3. PROTOCOLO de comunicação
   [ ] HTTP
   [ ] HTTPS
   [ ] Outro: ___________

4. Existe alguma AUTENTICAÇÃO ou TOKEN necessário?
   [ ] Não
   [ ] Sim - Qual tipo? ___________

5. PATH completo da API (confirmar)
   [ ] /sigct_backend/rest/
   [ ] Outro: ___________

Assim que recebermos essas informações, procederemos com:
- Configuração do proxy_pass no NGINX
- Testes em ambiente de teste
- Implantação em produção via Esteiras

Atenciosamente,
[Seu Nome]
