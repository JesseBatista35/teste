
ID da Ordem de Trabalho	 WO0000082298767
Criado em	 16/11/2026 11:52:22
Criado por	 F733303
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Após o Login CAIXA reconhecer a sessão, o POST /api/autorizacao/parametros-portal retorna HTTP 500 em DES. Uma resposta anterior informou “parametroPortal é obrigatório”. No fluxo atual, o frontend envia {} com a autenticação inicial e só adiciona o header Parametro-Portal depois de receber os parâmetros; portanto, não parece seguro contornar isso alterando o header inicial.

Poderiam verificar a geração dos parâmetros SISGR no backend e a configuração/versão efetiva usada em DES, identificando a causa do 500? A PR 171612 adiciona diagnóstico sanitizado no frontend, mas não corrige o backend.

Separadamente, o Login CAIXA apresenta waitOFDB is not defined; esse erro está no tema hospedado pelo SSO e não há evidência de que cause o 500. Também não há evidência de que a mensagem genérica “Usuário sem acesso” comprove falta de perfil.
Impresso por P585600 em Terça-feira, 17/11/2026 09:18:52


Após autenticação SSO, o POST /api/autorizacao/parametros-portal retorna HTTP 500: “parametroPortal é obrigatório”.

No código analisado, a mensagem ocorre quando a geração SISGR retorna nulo. Poderiam confirmar a versão e a configuração efetivas em DES, o destino utilizado e o motivo do retorno? Se for necessário ajustar alguma variável, informar a chave e o valor correto.

Referência: REQ000147048554.


esse cara ta me enchendo a pacienicia já, esta com uam  mesmsa demadna apresenta varios problemas diferentes




