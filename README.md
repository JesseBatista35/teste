root@sspdeaplux0100:/opt/SUNWas8/bin/bkp_nss_20261027# cd $(getent passwd sjsas8 | cut -d: -f6)/bkp_nss_20261027/
root@sspdeaplux0100:/opt/SUNWas8/bin/bkp_nss_20261027# digest -a md5 cert8.db key3.db secmod.db
(cert8.db) = 55f6195dad79cef4ae45841f95a1ad70
(key3.db) = c7165bf97a45c0a418ddefa151c1aae6
(secmod.db) = 05193a629755258413fd36840b864959
root@sspdeaplux0100:/opt/SUNWas8/bin/bkp_nss_20261027#
root@sspdeaplux0100:/opt/SUNWas8/bin/bkp_nss_20261027#
root@sspdeaplux0100:/opt/SUNWas8/bin/bkp_nss_20261027# cd /opt/SUNWas8/domains/das01/config
root@sspdeaplux0100:/opt/SUNWas8/domains/das01/config# digest -a md5 cert8.db key3.db secmod.db cert8.db.erro_20261027 secmod.db.erro_20261027
(cert8.db) = de5ae50baa2221ea60a6b8f6567537db
(key3.db) = ccdbf7bf49b44cc56fa4dd1ac867d22a
(secmod.db) = dc09ed5bedec0c611620dd3b26fb0196
(cert8.db.erro_20261027) = 5309c9c69c2ee75928026150a97641ed
(secmod.db.erro_20261027) = ffb1e9067393490d7a7bbc684f253bfc
root@sspdeaplux0100:/opt/SUNWas8/domains/das01/config#
root@sspdeaplux0100:/opt/SUNWas8/domains/das01/config#
root@sspdeaplux0100:/opt/SUNWas8/domains/das01/config# cd /opt/SUNWas8/domains/das01/config
root@sspdeaplux0100:/opt/SUNWas8/domains/das01/config# digest -a md5 cert8.db.* key3.db* secmod.db.*
(cert8.db.20210208) = 15566a807c6c0e0712a898896c1e165d
(cert8.db.20251210) = 55f6195dad79cef4ae45841f95a1ad70
(cert8.db.20261028) = 55f6195dad79cef4ae45841f95a1ad70
(cert8.db.atual_bkp) = 5309c9c69c2ee75928026150a97641ed
(cert8.db.erro_20261027) = 5309c9c69c2ee75928026150a97641ed
(cert8.db.teste) = 55f6195dad79cef4ae45841f95a1ad70
(key3.db) = ccdbf7bf49b44cc56fa4dd1ac867d22a
(key3.db.20210208) = c7165bf97a45c0a418ddefa151c1aae6
(key3.db.20251210) = c7165bf97a45c0a418ddefa151c1aae6
(key3.db.20261028) = c7165bf97a45c0a418ddefa151c1aae6
(key3.db.erro_20261027) = 23fdf3c2de83a51ce3d47c4ab35fbbd4
(key3.db.teste) = 23fdf3c2de83a51ce3d47c4ab35fbbd4
(secmod.db.20210208) = 05193a629755258413fd36840b864959
(secmod.db.20251210) = 05193a629755258413fd36840b864959
(secmod.db.20281028) = 05193a629755258413fd36840b864959
(secmod.db.erro_20261027) = ffb1e9067393490d7a7bbc684f253bfc
(secmod.db.teste) = ffb1e9067393490d7a7bbc684f253bfc
root@sspdeaplux0100:/opt/SUNWas8/domains/das01/config#
root@sspdeaplux0100:/opt/SUNWas8/domains/das01/config#
root@sspdeaplux0100:/opt/SUNWas8/domains/das01/config# ls -l /opt/SUNWas8/bin/bkp_nss_20261027/
total 771
-rw-------   1 sjsas8   sunjava   131072 set  5  2024 cert8.db
-rw-------   1 sjsas8   sunjava   131072 set  5  2024 key3.db
-rw-------   1 sjsas8   sunjava   131072 fev  8  2021 secmod.db
root@sspdeaplux0100:/opt/SUNWas8/domains/das01/config#

