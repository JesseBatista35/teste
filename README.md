Prezados,

Informamos que a configuração do novo NFS para integração SIHDG x SINAF foi concluída com sucesso no ambiente DES.

Resumo das ações realizadas:

Criados o PersistentVolume e o PersistentVolumeClaim sihdg-sinaf-data-des no namespace sihdg-des, apontando para o compartilhamento liberado pelo time de armazenamento:
Servidor: nprdnfs01.ad.caixa
Path: /ifs/cpwsprd01/nprd/fs_sihdg_sinaf
Capacidade: 50GB
Volume associado ao DeploymentConfig sihdg-jboss8-des, montado no path /sihdg_sinaf, sem impacto no ponto de montagem já existente (/sihdg_des, utilizado na integração SIHDG x PowerCenter).
Variáveis correspondentes atualizadas no variable group SIHDG-JBOSS8-DES (Azure DevOps).
Novo release executado com sucesso via esteira, e validado que o mount /sihdg_sinaf persiste corretamente após o deploy:
sihdg-sinaf-data-des    /sihdg_sinaf
sihdg-jboss8-data-des   /sihdg_des

Confirmado via df -h que o volume está montado e disponível com 50GB para uso.

Observação — problema identificado durante a validação (não relacionado a esta demanda):

Durante os testes de deploy, identificamos que a aplicação está apresentando falha ao conectar no banco de dados SQL Server (10.116.93.91:1433, datasource sihdgDS), impedindo a inicialização completa dos componentes CacheConfig e SecurityConfig:

com.microsoft.sqlserver.jdbc.SQLServerException: "encrypt" property is set to "true" and 
"trustServerCertificate" property is set to "true" but the driver could not establish a 
secure connection to SQL Server by using Secure Sockets Layer (SSL) encryption: 
Error: (unsupported_certificate) Certificates do not conform to algorithm constraints.
...
Caused by: java.security.cert.CertPathValidatorException: Algorithm constraints check 
failed on signature algorithm: SHA1withRSA

O certificado do SQL Server está assinado com o algoritmo SHA1withRSA, que o Java 21 (utilizado na imagem jboss-eap8/eap8-openjdk21) bloqueia por padrão devido a restrições de segurança. Isso já ocorria antes desta demanda e não impede o funcionamento do NFS configurado, mas recomendamos encaminhamento ao time de banco de dados/DBA para renovação do certificado do SQL Server com um algoritmo de assinatura mais forte (SHA-256 ou superior).

Considerando concluída a demanda de configuração da esteira. Encaminhamos para validação/encerramento.

Atenciosamente,
Jessé Batista (P585600)
CTIS/CESTI/ESTEIRA - APLICAÇÃO/DEVOPS
