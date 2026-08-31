date
echo "TESTE_MARCADOR_$(date +%s)" > /tmp/teste_jesse.txt
cat /tmp/teste_jesse.txt
rm /tmp/teste_jesse.txt


echo "MARCADOR_TESTE_12345" >> siavl.conf
tail -3 siavl.conf


