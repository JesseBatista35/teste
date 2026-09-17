Carlos Augusto, o certificado eco.dataprev.des.caixa.gov.br.p12 que você disponibilizou já está instalado no servidor, mas identificamos um problema antes de reiniciar o server: ele aparece no keystore com alias "dinamo hsm" e o keytool não consegue ler as informações normais de certificado (owner, issuer, serial, validade) — indício de que a chave privada não está embutida no arquivo .p12, e sim referenciada externamente via HSM da Dinamo.

Conferimos no servidor srjtqapllx0021 e não existe nenhum provider PKCS#11/Dinamo configurado nessa JVM, nem nenhum driver ou arquivo relacionado ao HSM instalado no host. Como é um HSM, sabemos que não é possível simplesmente converter esse .p12 para um formato com a chave embutida — a chave não sai de dentro do HSM por design.

Diante disso, temos duas dúvidas antes de prosseguir com o reinício do server SIFUG:

1) Existe algum passo a passo de configuração do provider PKCS#11 do Dinamo pra esse tipo de ambiente (JBoss EAP 7.0.0 legado, Java 8)? Se sim, poderia nos encaminhar, ou nos colocar em contato com quem já configurou isso em outro ambiente?

2) Como alternativa, seria possível gerar/disponibilizar um certificado nesse mesmo domínio (ECO.DATAPREV.DES.CAIXA.GOV.BR) em um formato .p12 tradicional, com a chave privada embutida, sem depender do HSM? O app legado SIFUG não foi desenhado pra esse modelo de integração.

Ficamos no aguardo pra definir o caminho antes de reiniciar o server, já que sem essa configuração o mais provável é trocarmos o erro atual por uma falha ao carregar a chave privada.
