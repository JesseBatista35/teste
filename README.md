Jesse Mouta Pereira Batista, Pedro Henrique Paiva de Souza e Robson Batista da Costa.
 
Conseguimos avançar na integração entre o Control-M e o BeyondTrust. Identificamos um problema no script /tmp/teste_cofre.sh e, como não temos permissão para alterá-lo, criamos uma nova versão em /producao, mantendo o script versionado no repositório do projeto. Com isso, o problema foi corrigido e a integração passou a funcionar corretamente.
Como próximos passos, gostaríamos de destacar dois pontos de segurança que precisam ser avaliados:
Certificado SSL/TLS: identificamos o uso do parâmetro -k nas chamadas via curl. Esse parâmetro desabilita a validação do certificado do servidor. Recomendamos que a integração seja configurada no Application Integrator, com a validação adequada do certificado SSL/TLS.
Proteção do secret: observamos que a credencial está exposta nas configurações do AI. Por se tratar de uma informação sensível, recomendamos que seja configurada utilizando os mecanismos de proteção de credenciais/segredos disponibilizados pela ferramenta.
Assim, do ponto de vista funcional, a integração está operacional, ficando pendentes essas adequações para garantir maior segurança na solução. Mauro Shigueo Yamashita Marinalva Zelia de Sousa Lima Vinicius Azevedo Nunes Lucas Vinicius de Almeida Santos


 como que  oscript tava com problema se o meui script foi a suloção para p caso?
