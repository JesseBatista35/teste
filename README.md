Alessandro, bom dia! Obrigado pelo retorno.

Respondendo sua dúvida: não, com a opção 1 os dois realms continuam funcionando. As outras opções é que obrigariam a escolher um ou outro.

Como funciona hoje no 6.4: o ccr-api não tem login-config no web.xml. Por isso o JBoss 6.4 ignora a configuração do Keycloak que existe no domínio para esse war, e a validação do token fica com a própria aplicação. É assim que ela aceita tanto o token intranet quanto o internet.
O que mudou no 7.4: o subsystem do Keycloak passou a aplicar essa configuração ao ccr-api.war automaticamente, mesmo sem login-config. O container valida o token antes da aplicação e aceita só o realm internet. O token intranet recebe 401 e nem chega ao código.
Correção: remover essa configuração do ccr-api.war no 7.4, deixando igual ao 6.4. A aplicação volta a validar os dois realms como faz hoje, sem mudança de código e sem novo pacote.

O ccr-parametros não é afetado: nele a validação via web.xml é intencional e continua como está.

Se estiverem de acordo, aplico no DES e peço ao Matheus para retestar com token intranet e com token internet. A mudança pode ser desfeita na hora, se necessário.
