# Remove TODOS os comentários dessa seção
sed -i '/<vault>/s/<!--//g; /<vault>/,/<\/vault>/s/-->//g' standalone-full-ha.xml

# Verifica
grep -A 8 "<vault>" standalone-full-ha.xml | head -10
