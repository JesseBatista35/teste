
Certificados_Dataprev.zip  hapi-bancos.dataprev.gov.br.crt  IF104_CONFIG.cnf  IF104_crt.pem  IF104.key  keystoreIF104_1.pkcs12  keystoreIF104Chain.cer
[root@srjtqapllx0021 sifug]# keytool -list -keystore /infra_app/config/sifug/IF104.p12 -storetype PKCS12 -storepass
Command option -storepass needs an argument.
keytool -list [OPTION]...

Lists entries in a keystore

Options:

 -rfc                            output in RFC style
 -alias <alias>                  alias name of the entry to process
 -keystore <keystore>            keystore name
 -storepass <arg>                keystore password
 -storetype <storetype>          keystore type
 -providername <providername>    provider name
 -providerclass <providerclass>  provider class name
 -providerarg <arg>              provider argument
 -providerpath <pathlist>        provider classpath
 -v                              verbose output
 -protected                      password through protected mechanism

Use "keytool -help" for all available commands
[root@srjtqapllx0021 sifug]#
