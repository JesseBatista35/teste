Pedi a criação de pastas no NFS, em DES e TQS, para o SIORF usar no processamento de arquivos (o gestor fará o upload do arquivo via aplicação). 

/siorf/Convenio/Processar
/siorf/Convenio/Resultado

Através das REQ000144998295 e REQ000144998297.

Preciso confirmar:

1. Aa pastas abaixo foram criadas em DES e TQS:
/siorf/Convenio/Processar
/siorf/Convenio/Resultado

2. O usuário de serviço está com acesso 777 nestas pastas? 
SORFDB01 e SORFTB01

3. O Jboss já foi configurado com estes paths? 
Podemos criar apenas um path e em tempo de execução completar com a pasta que se deseja usar? neste caso, somente um path seria criado. Em outro sistema que trabalho, cada pasta foi criado em path no jboss.
