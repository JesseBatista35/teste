Todos os p12 gerados pelo HSM Dínamo possuem esse nome de chave interno, isso não deveria interferir no uso da chave, já que os demais funcionam normalmente nos diversos aplicativos nas diversas arquiteturas da Caixa.
Por ser um P12, a chave privada está no arquivo.
 
Quando você afirma "o keytool não consegue ler as informações normais de certificado", qual erro está ocorrendo?
 
Ele é um certificado A1, pois temos o PKCS#12. Certificados do tipo A3 são armazenados em hardwares criptográficos e a chave privada não pode ser exportada, impedindo de gerarmos um PKCS#12.
 
É um ICP Brasil porque foi emitido pelo SERPRO, cadeia Autoridade Certificadora do SERPRO Final SSL, vinculada à Autoridade Certificadora Raiz Brasileira v5:
 
