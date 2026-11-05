Copyright (C) Microsoft Corporation. All rights reserved.

PS C:\Users\p585600> cd $HOME\Downloads
PS C:\Users\p585600\Downloads> tar -tf arqref-services-3.28.0.jar | findstr /i "ContratoSifbnServiceIface consultacontratos"
br/gov/caixa/arqrefservices/dominio/consignet/consultaContratos/
br/gov/caixa/arqrefservices/dominio/consignet/consultaContratos/ConsultaContratosDadosREQ.class
PS C:\Users\p585600\Downloads> tar -tf workflow-credito-pj-ear-8.40.1-20261105.100217-6.ear | findstr /i "arqref"
lib/arqref-web-3.1.0.1.jar
lib/arqref-core-3.8.0-SNAPSHOT.jar
lib/arqref-services-3.28.0.jar
lib/arqref-business-2.0.1.jar
PS C:\Users\p585600\Downloads>
