Jesse Mouta Pereira Batista
Gustavo Duarte Lepesteur da Costa, Edson Prokot e Matheus Rocha Nascimento, Bom dia, Estava investigando aqui com Thiago Jeferson de Sousa Silva e achamos a causa do 401 do ccr-api (consignado v8, to…
Antonio Coelho Guimaraes Filho, bom dia Tonin! Acho que aqui vale uma apreciação sua.
 
Jesse Mouta Pereira Batista
Gustavo Duarte Lepesteur da Costa, Edson Prokot e Matheus Rocha Nascimento, Bom dia, Estava investigando aqui com Thiago Jeferson de Sousa Silva e achamos a causa do 401 do ccr-api (consignado v8, to…
Prezado Jesse Mouta Pereira Batista bom dia! O Prokot está de férias. Eu sou o Arquiteto do SICCR. O ccr-api nasceu com a validação do token no web.xml, porém em função dos clientes Caixa Aqui (que usaram o SSO2 Internet) tivemos que alterar e colocar a validação do token na aplicação. Porém, o ccr-parametros (módulo tributário) usa a validação no web.xml. E me consta que esta API está funcionando já no 7.4. Com efeito, desconheço que o ccr-parametros use token realm intranet. 
 
O ccr-api tem que funcionar tanto para o realm intranet quanto para o realm internet. Na sua explicação, não me ficou claro como manter o a utilização dos dois tokens. Pelo que entendi, seria um ou outro. É isso?
 
Alessandro Ricardo Lima
Prezado Jesse Mouta Pereira Batista bom dia! O Prokot está de férias. Eu sou o Arquiteto do SICCR. O ccr-api nasceu com a validação do token no web.xml, porém em função dos clientes Caixa Aqui (que…
Retificando. Não me consta que o ccr-parametros use token realm internet.
 
Jesse Mouta Pereira Batista
Gustavo Duarte Lepesteur da Costa, Edson Prokot e Matheus Rocha Nascimento, Bom dia, Estava investigando aqui com Thiago Jeferson de Sousa Silva e achamos a causa do 401 do ccr-api (consignado v8, to…
Para manter o consumo da api ccr-api tanto para os realms intranet quanto intranet, a solução seria essa: "Igualar ao 6.4: remover o secure-deployment do ccr-api.war no 7.4. A aplicação volta a tratar o token como hoje no 6.4, mas o container deixa de validar."
 
