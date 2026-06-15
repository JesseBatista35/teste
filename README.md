-sh-4.2$ oc port-forward svc/siinp-nucleo-web-tqs 8080:8080 &
[2] 52946
-sh-4.2$ sleep 2
Unable to listen on port 8080: All listeners failed to create with the following errors: Unable to create listener: Error listen tcp4 127.0.0.1:8080: bind: address already in use, Unable to create listener: Error listen tcp6 [::1]:8080: bind: address already in use
error: Unable to listen on any of the requested ports: [{8080 8080}]

[2]+  Concluído(1)           oc port-forward svc/siinp-nucleo-web-tqs 8080:8080
-sh-4.2$ curl -X POST http://localhost:8080/inic-pagto/nucleo/v1/jornada \
>   -H "Content-Type: application/json" \
>   -d '{"valor": "25.00"}'
Handling connection for 8080
<html>
<head><title>405 Not Allowed</title></head>
<body>
<center><h1>405 Not Allowed</h1></center>
<hr><center>nginx/1.24.0</center>
</body>
</html>
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc port-forward svc/siinp-nucleo-web-tqs 8080:8080 &
[2] 52971
-sh-4.2$ sleep 2
Unable to listen on port 8080: All listeners failed to create with the following errors: Unable to create listener: Error listen tcp4 127.0.0.1:8080: bind: address already in use, Unable to create listener: Error listen tcp6 [::1]:8080: bind: address already in use
error: Unable to listen on any of the requested ports: [{8080 8080}]
[2]+  Concluído(1)           oc port-forward svc/siinp-nucleo-web-tqs 8080:8080
-sh-4.2$ curl -X POST http://localhost:8080/inic-pagto/nucleo/v1/jornada \
>   -H "Content-Type: application/json" \
>   -d '{"valor": "25.00"}'
