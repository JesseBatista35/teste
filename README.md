
Christian, validamos o TQS e ele usa o mesmo certificado do DES (cadeia AC Icptestes). O DES funcionou porque você aceitou o aviso do navegador para aquele endereço, e esse aceite não vale para o TQS.

A solução definitiva é instalar os dois certificados que enviei (AC_Icptestes_Raiz.cer em "Autoridades de Certificação Raiz Confiáveis" e AC_Icptestes_Sub.cer em "Autoridades de Certificação Intermediárias") e fechar todas as janelas do navegador antes de testar. Com isso, DES e TQS funcionam sem precisar aceitar avisos.
