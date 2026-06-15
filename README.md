A rota integra.iniciadora.caixa.gov.br precisa servir tanto o frontend quanto a API. A solução dele é inteligente:

Manter o /api no backend
Usar rewrite-target na rota para remover o /api antes de chegar no backend
Assim a mesma rota externa serve os dois
