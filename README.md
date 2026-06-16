# Remove o <!-- do <vault>
sed -i 's|<!--     <vault>|    <vault>|g' standalone-full-ha.xml

# Remove o --> do </vault>
sed -i 's|</vault> -->|</vault>|g' standalone-full-ha.xml

# Verifica
grep -A 7 "<vault>" standalone-full-ha.xml
