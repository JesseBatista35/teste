Carlos Augusto, vimos o print que você mandou do certificado aberto - a cadeia está correta e válida mesmo, CN=ECO.DATAPREV.DES.CAIXA.GOV.BR, emitido pela Autoridade Certificadora do SERPRO Final SSL, válido até 22/12/2026. Sobre o ponto do HSM, faz sentido, deve ser só a convenção de nome interno do alias mesmo.

Aqui do nosso lado, no servidor, o problema é outro: testamos o arquivo eco.dataprev.des.caixa.gov.br.p12 com senha em branco (não recebemos a senha junto com o arquivo) e o openssl retornou "Mac verify error: invalid password" - ou seja, a senha vazia está incorreta, e é isso que está impedindo a leitura completa do certificado por aqui, não o HSM.

Poderia nos passar a senha correta do arquivo .p12? Assim que confirmarmos que abre certo no servidor, seguimos com o reinício do server SIFUG.
