[1. Abra a API direto no navegador. Foi a sugestão do Prokot. Na mesma janela InPrivate onde o SIFEC está logado, abra uma aba nova com:

https://migracaosifec.des.caixa/workflow-credito-pj-web/api/perfil-acesso-usuario
Redirecionar para a tela de login: o PJ está protegido e não reconhece o login do SIFEC. É problema de autenticação entre as aplicações.
Página em branco: o PJ deixou entrar, mas sem usuário, ou com usuário e sem perfil. Aí o próximo passo é o log de acesso (abaixo).
Aparecer um JSON com perfil: a API funciona, e o problema é a forma como a tela chama a API.

2. Peça ao Pablo o F12 do 6.4. Ele abre o PJ no 6.4, clica na chamada perfil-acesso-usuario e manda print de Cabeçalhos (Request headers / Cookie) e Resposta, com os valores dos cookies borrados. Assim comparamos quais cookies o 6.4 envia (só JSESSIONID/JSESSIONIDSSO ou algum do Keycloak, como KEYCLOAK_ADAPTER_STATE) e o que ele responde.


<img width="1898" height="1079" alt="image" src="https://github.com/user-attachments/assets/d91a3195-52d1-4aa0-97a0-81b2438d22a0" />


agente consegue enstar aqui no 6.4 me madna a url ao usaioa e ssanha deve ser a mesma
](https://sifec.des.caixa/fec-web/
https://sifec1.des.caixa/fec-web/

Para ver qual existe, rode no PowerShell:

nslookup sifec.des.caixa
nslookup sifec1.des.caixa

O usuário de teste é o c891903, e a senha é a mesma que o Pablo passou na sala.

Teste no 6.4, na mesma ordem do 7.4:

Login no SIFEC 6.4 e abrir o PJ (Serviços → Crédito Comercial → Pessoa Jurídica → Consulta Clientes).
Na mesma janela, abrir uma aba nova com a API direto (troque o host pelo que funcionou):
https://sifec.des.caixa/workflow-credito-pj-web/api/perfil-acesso-usuario
No F12 dessa chamada, tire print de Cabeçalhos (Request headers / Cookie, borrando os valores) e Resposta.

O resultado decide o caminho:

No 6.4 vem JSON com perfil: a diferença é de ambiente, em como a sessão ou o usuário chega ao PJ, e comparamos os cookies.
No 6.4 também vem em branco nessa chamada direta: o teste direto não serve de comparação, e o caminho é o log de acesso com usuário (%u) no 7.4.)
