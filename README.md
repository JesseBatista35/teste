sudo sh -c 'grep "03/Nov/2026" /logs/apache2/SIFEC-INTRANET/sifec1.des.caixa-access.log > /tmp/migracaosifec-access.log'
sudo sh -c 'grep "Nov 03" /logs/apache2/SIFEC-INTRANET/sifec1.des.caixa-error.log > /tmp/migracaosifec-error.log'
sudo chmod 644 /tmp/migracaosifec-*.log
wc -l /tmp/migracaosifec-*.log
