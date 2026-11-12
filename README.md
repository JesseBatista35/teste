Falta conferir o terceiro sintoma, o __API_DADOS_FAMILIA_PATH__ no bundle. No Linux:

URL=https://siepr-curso-bec3-frontend-des.apps.nprd.caixa
for f in $(curl -sk $URL/ | grep -oE '[A-Za-z0-9._-]+\.js' | sort -u); do
  echo "$f: $(curl -sk $URL/$f | grep -c __API_DADOS_FAMILIA_PATH__)"
done


<img width="1876" height="1026" alt="image" src="https://github.com/user-attachments/assets/2279e9e1-a7ef-4c7c-90ff-f35e73f1a209" />




-sh-4.2$
-sh-4.2$ for f in $(curl -sk $URL/ | grep -oE '[A-Za-z0-9._-]+\.js' | sort -u); do
>   echo "$f: $(curl -sk $URL/$f | grep -c __API_DADOS_FAMILIA_PATH__)"
> done
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ exit
logout
Connection to 10.122.155.62 closed.
[p585600@cadsvitrlx100 ~]$ for f in $(curl -sk $URL/ | grep -oE '[A-Za-z0-9._-]+\.js' | sort -u); do
  echo "$f: $(curl -sk $URL/$f | grep -c __API_DADOS_FAMILIA_PATH__)"
done
[p585600@cadsvitrlx100 ~]$
[p585600@cadsvitrlx100 ~]$
[p585600@cadsvitrlx100 ~]$
[p585600@cadsvitrlx100 ~]$



ta comlcoiado essese seus compando jhoje nada funciona
