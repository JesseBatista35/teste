mkdir -p ~/bkp_nss_20261027 && cp -p cert8.db key3.db secmod.db ~/bkp_nss_20261027/


# home do sjsas8
getent passwd sjsas8 | cut -d: -f6

# conteúdo do backup
ls -l $(getent passwd sjsas8 | cut -d: -f6)/bkp_nss_20261027/

# hash para comparar com os arquivos atuais e com os .erro_20261027
cd $(getent passwd sjsas8 | cut -d: -f6)/bkp_nss_20261027/
digest -a md5 cert8.db key3.db secmod.db
cd /opt/SUNWas8/domains/das01/config
digest -a md5 cert8.db key3.db secmod.db cert8.db.erro_20261027 secmod.db.erro_20261027
