Evandro, segue a comprovação do backup do NSS do das01 (sspdeaplux0100).

Backup feito em 27/10, antes da tentativa de regerar o s1as:
/opt/SUNWas8/bin/bkp_nss_20261027/ (home do sjsas8), com datas originais preservadas: cert8.db e key3.db de 05/09/2024, secmod.db de 08/02/2021.

MD5 do backup:

cert8.db = 55f6195dad79cef4ae45841f95a1ad70
key3.db = c7165bf97a45c0a418ddefa151c1aae6
secmod.db = 05193a629755258413fd36840b864959

Como a master password não foi aceita, restauramos esse backup no config em 27/10. Isso se confirma pelas cópias cert8.db.20261028, key3.db.20261028 e secmod.db.20281028, que são idênticas ao backup. As cópias *.20251210 também têm o mesmo hash.

Os arquivos *.erro_20261027 (e cert8.db.atual_bkp, key3/secmod.db.teste) têm outro hash e não correspondem ao estado em que deixamos o ambiente. Os cert8.db, key3.db e secmod.db atuais também são diferentes, alterados depois de 28/10.

Para voltar ao estado original, basta usar o backup acima ou as cópias .20261028.
