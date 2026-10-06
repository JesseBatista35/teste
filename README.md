LOG=$(grep -l "client_secret=" /opt/ctmage/ctm/cm/AI/CustomerLogs/*.xml | tail -1)
BODY=$(grep -o "client_id=[^<]*" $LOG | head -1 | sed 's/&amp;/\&/g')
echo "credencial carregada: ${#BODY} caracteres"
