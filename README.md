awk '
skipblank && /^$/ { skipblank=0; next }
/<Location \/siavl-web>/ { collecting=1 }
collecting { loc = loc $0 "\n"; if (/<\/Location>/) { collecting=0; skipblank=1 }; next }
/RewriteCond %{REQUEST_METHOD} =OPTIONS/ && !inserted {
  printf "%s", loc
  inserted=1
}
{ print }
' siavl.conf > siavl.conf.NOVO

diff siavl.conf siavl.conf.NOVO

cp siavl.conf backup/siavl.conf.$(date +%Y%m%d).WO<numero_da_WO>
mv siavl.conf.NOVO siavl.conf
apachectl configtest
