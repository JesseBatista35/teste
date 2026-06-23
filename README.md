Oi pessoal! 👋
Temos uma dúvida sobre a melhor prática para comunicação entre sistemas backend que usam certificados TLS auto-assinados internos da Caixa.
Cenário: Sistema A precisa se comunicar com Sistema B via https://api.chat.caixa, mas o certificado é auto-assinado. Sem tratamento, a comunicação falha com erro SSL.

Questões Principais

Qual é o padrão na Caixa para integração entre backends com certificados auto-assinados?
Existe um repositório/secret centralizado com o certificado CA interno?
Como vocês recomendam fazer a gestão desses certificados?
É melhor:

Incorporar na imagem Docker (build arg)?
Gerenciar via Kubernetes Secret + volume mount?
Outra abordagem já consolidada?


Se abrirmos uma REQ para padronizar isso, qual seria a solução mais aderente aos padrões da Caixa?
