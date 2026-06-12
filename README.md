O terminal ficou confuso! Limpe e tente novamente:
bashclear

# COMANDO CORRETO - com o nome "quota-resources"
oc patch resourcequota quota-resources -n sicia-tqs -p '{"spec":{"hard":{"limits.cpu":"10"}}}' --type merge
Se não funcionar, tente este formato alternativo:
bashoc edit resourcequota quota-resources -n sicia-tqs
Isso vai abrir um editor. Procure por limits.cpu: "4" e mude para limits.cpu: "10".
Depois salve e saia (:wq se for vi/vim).

OU use este comando direto:
bashoc patch resourcequota quota-resources -n sicia-tqs --type='json' -p='[{"op": "replace", "path": "/spec/hard/limits.cpu", "value":"10"}]'
Tenta um desses! 👆
