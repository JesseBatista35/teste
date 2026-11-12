Read the attached text
O SIEMP abriu: https://siemp.des.caixa/siemp/ carregou a tela de login da versão 14.37.0.6, e o cadeado agora aparece normal. Ou seja, DNS, VIP, certificado e esteira estão funcionando. O Denilson só testou com o caminho errado (/siemp_java).

Mensagem para o Denilson / sala
Bom dia, Denilson! O DNS siemp.des.caixa foi criado hoje (WO0000082275737) e já está funcionando. O 404 apareceu porque o teste foi em /siemp_java, mas o contexto da aplicação é /siemp.

O link correto é https://siemp.des.caixa/siemp/. Já abre a tela de login do SIEMP (versão 14.37.0.6). Pode seguir com a validação?

SIRUR: o banco ainda falha (OracleSirurDS)
O teste deu A conexão não é válida, o mesmo sintoma do SIBAN ontem. Antes do deploy da 3.55.51.01, vamos achar a credencial certa.

1. Na 473: o erro exato do Oracle

sudo grep -n "ORA-" /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | tail -5
2. Na 471: existe outro datasource do SIRUR no 7.4 que funciona (tipo _ORIGINAL)?

grep -n -iE '<(xa-)?datasource .*sirur' /opt/jboss/jboss-eap/dc/configuration/domain.xml
3. No 6.4 (10.116.88.20): URL e usuário do OracleSirurDS por profile (sem senha)

sudo awk '/<profile name=/{p=$0} /jndi-name="java:\/jdbc\/OracleSirurDS"/{d=1} d && /connection-url|user-name/ {print NR": "p" | "$0} d && /<\/datasource>/{d=0}' /opt/jboss/jboss-eap/dc/configuration/domain.xml
Me manda as três saídas:

Se no passo 2 aparecer um datasource alternativo, a gente testa e copia a credencial, como fizemos no SIBAN.
Senão, comparo usuário e URL com o 6.4 e te passo o ajuste.
O SICDT 3.24.3.004 continua pendente. Me diga se o download na 471 funcionou ou se vamos pela console.

Como o Claude está se saindo nesta sessão?
