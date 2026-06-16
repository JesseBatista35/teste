Bom dia Magnus, tudo bem?

Após investigação mais aprofundada, conseguimos evidências concretas que mostram que o problema está no VIP `10.116.180.22` na porta 443.

Segue abaixo os testes realizados:

**1. HTTP (porta 80) via VIP → funciona:**
```
curl -v http://10.116.180.22/sicmu
→ HTTP/1.1 302 Found: Moved Temporarily
→ Location: https://10.116.180.22/sicmu
```
O VIP recebe na 80 e redireciona para HTTPS corretamente.

**2. HTTPS (porta 443) via VIP → conexão fechada sem resposta:**
```
curl -v http://10.116.180.22:443/sicmu
→ Recv failure: Conexão fechada pela outra ponta
```
O VIP não tem backend configurado para a porta 443 — a conexão é encerrada imediatamente.

**3. HTTP direto na porta 443 do servidor `10.116.200.228` → funciona:**
```
curl -v http://127.0.0.1:443/sicmu
→ HTTP/1.1 302 Found
→ Location: http://127.0.0.1:443/sicmu/
```
O Apache do servidor está respondendo corretamente na porta 443.

**Conclusão:** O servidor está OK. O VIP `10.116.180.22` precisa ter um backend/pool configurado para encaminhar o tráfego HTTPS (porta 443) para o servidor `10.116.200.228:443`.

Poderia verificar essa configuração no balanceador? Agradeço!
