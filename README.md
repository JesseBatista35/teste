sudo -u sjsas8 /opt/SUNWas8/bin/asadmin list-domains
sudo -u sjsas8 netstat -an | grep 14848
sudo -u sjsas8 /opt/SUNWas8/bin/asadmin list-instances --host 10.116.89.101 --port 14848 --user ASadmin --passwordfile /opt/SUNWas8/config/passwordfile.conf


sudo -u sjsas8 /opt/SUNWas8/bin/asadmin start-domain <nome_do_domain>

