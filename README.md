cd /opt/apache/jbcs-httpd24-2.4/httpd/conf.d/siavl

sudo awk '
skipblank && /^$/ { skipblank=0; next }
/<Location \/siavl-web>/ { collecting=1 }
collecting { loc = loc $0 "\n"; if (/<\/Location>/) { collecting=0; skipblank=1 }; next }
/RewriteCond %{REQUEST_METHOD} =OPTIONS/ && !inserted {
  printf "%s", loc
  inserted=1
}
{ print }
' siavl.conf | sudo tee siavl.conf.NOVO > /dev/null

diff siavl.conf siavl.conf.NOVO



sudo cp siavl.conf backup/siavl.conf.$(date +%Y%m%d).WO<numero_da_WO>
sudo mv siavl.conf.NOVO siavl.conf
sudo apachectl configtest
