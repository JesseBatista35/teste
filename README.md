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
root@sspdeaplux0100:/opt/SUNWas8/domains/das01/config#


