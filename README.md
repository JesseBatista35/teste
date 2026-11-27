sudo su -
# qual charset o response está declarando
curl -sI "http://localhost:8080/sigsj_intranet/" | grep -i content-type
# qual charset a página declara no HTML (meta)
curl -s "http://localhost:8080/sigsj_intranet/" | grep -i "charset" | head
