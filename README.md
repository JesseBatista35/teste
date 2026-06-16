sed -i 's|value="MASK-lHQotGsUSmQ5YQRzdtNLD361rwn0c0oJ"|value="changeit"|g' standalone-full-ha.xml

# Verifica
grep -A 6 "<vault>" standalone-full-ha.xml
