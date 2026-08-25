Pessoal,

Analisando o chamado, identifiquei o seguinte:

- O erro 400 "API Key não encontrada" (print do navegador) é esperado: ao acessar a URL direto no navegador, sem os headers de autenticação, o API Gateway barra a requisição antes de repassar ao backend. Isso não é o mesmo problema do 500.

- O erro 500 (print do Postman) é o retorno real do backend por trás do Gateway ("requisição formatada corretamente, mas um problema ocorreu no servidor"). O Gateway (api.des.caixa, IP 10.116.80.221) está respondendo normalmente, o problema está no serviço de destino.

- Verifiquei o host que o inventário aponta para o SIICO (LX0006 / 10.116.88.25) e não há nenhuma instância "siico" rodando nos servidores JBoss ativos desse domain — o que sugere que o app pode estar hospedado em outro lugar (outro host, ou containerizado em OKD).

Para continuar a investigação, preciso de:
1. Qual servidor/módulo real hospeda a API informacoes-corporativas-privadas (nome do host, ou se é uma app OKD/OpenShift)
2. O horário exato da chamada que retornou 500, e se possível o ID de correlação/trace da resposta (se houver no corpo ou headers)
3. Se possível, o print do Postman com a aba "Headers" enviados (pra confirmar qual API Key/header estão usando)

Com essas informações consigo seguir direto pros logs do backend.
