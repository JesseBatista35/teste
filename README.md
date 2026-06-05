Vamos entrar no pod para ver o que está acontecendo. Execute isto:
bashoc debug pod -n sicbc-des sicbc-backend-des-15-mstdb -it --image=busybox
Depois dentro do container, rode:
bashls -la /deployments/
