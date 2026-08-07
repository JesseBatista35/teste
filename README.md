<img width="1865" height="902" alt="image" src="https://github.com/user-attachments/assets/caf7a4e8-829d-4db8-9ada-f300185097c0" />


<img width="1904" height="878" alt="image" src="https://github.com/user-attachments/assets/2f42ca09-30b9-42cf-a0f3-bedb1f230981" />


não esta



no repo de config tem isso


location /sigsj/ {
    client_max_body_size 10M;
    proxy_set_header X-Forwarded-Host $host;
    proxy_set_header X-Forwarded-Server $host;
    proxy_set_header X-Forwarded-For $proxy_add_x_forwarded_for;
    rewrite ^/sigrr-api/?(.*) /$1 break;
    proxy_pass __HTTP_SERVICE_API__; 
    proxy_redirect off;
}
