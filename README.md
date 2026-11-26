H=/opt/jbcs-httpd24-2.4/httpd
grep -RniE 'LimitRequestBody|SecRequestBodyLimit|Timeout' $H/conf $H/sites-available/*sigec-csc* 2>/dev/null
ls /logs/apache2/sigec-csc/
