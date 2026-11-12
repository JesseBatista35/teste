Rodrigo, o siemp.des.caixa está intermitente porque ficou com dois IPs no DNS: o antigo (10.116.80.1) e o novo da esteira 7.4 (10.116.180.9). Testamos os dois:

10.116.80.1 (antigo): 404 em /siemp e em /siemp_java. Ele não atende o SIEMP por esse nome; o certificado é de outro sistema (siecm).
10.116.180.9 (novo): 200, SIEMP 14.37.0.6 funcionando.
