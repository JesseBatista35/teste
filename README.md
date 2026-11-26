location /api/ {
    client_max_body_size 10M;
    proxy_set_header X-Forwarded-Host $host;
    proxy_set_header X-Forwarded-Server $host;
    proxy_set_header X-Forwarded-For $proxy_add_x_forwarded_for;
    rewrite ^/sidsc-api/?(.*) /$1 break;
    proxy_pass __HTTP_SERVICE_API__/; 
    proxy_redirect off;
}



coloquei assim na 22 igual tava na 19
