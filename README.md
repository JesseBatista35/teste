Pessoal, bom dia.

Aproveitando para separar dois pontos que estão sendo discutidos aqui na sala, para não misturarmos os atendimentos:

1. Erro do JConnector no SISGR (module.xml)

Esse ponto já foi identificado e o ajuste (inclusão da dependência do módulo jconnector) já foi aplicado manualmente, direto no servidor. A correção funciona, mas é temporária: como foi feita direto na VM e não está persistida em nenhum lugar da pipeline, se a VM passar por um destroy/recriação, a alteração se perde e o erro volta a acontecer. Esse ponto já está encaminhado para que a correção seja aplicada na origem do módulo SISGR, de forma definitiva - assunto já de conhecimento de vocês.

2. REQ que estou atendendo agora

É um problema diferente, que já vínhamos investigando separadamente: ao acionar funcionalidades do menu do SICMU, a tela fica em branco ou cai por timeout. A causa identificada é uma contenção de lock no cache de sessões (Infinispan), erro ISPN000299 - uma transação trava o lock de uma sessão específica e bloqueia todas as tentativas de acesso seguintes, até o lock ser liberado.

O padrão é intermitente (ocorre em rajadas ao longo do dia), então já deixamos um monitoramento automático rodando no servidor, que vai capturar o thread dump exatamente no momento da próxima ocorrência - isso vai nos permitir identificar qual transação está retendo o lock e travando o acesso.

Seguimos atualizando conforme avançarmos nas duas frentes.
