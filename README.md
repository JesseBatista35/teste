curl -ik -X OPTIONS https://agenciadigital2.des.caixa:8021/siavl-web/index.html -H "Origin: https://exemplo.com" | grep -i "access-control"
curl -ik -X OPTIONS https://agenciadigital3.des.caixa:8023/siavl-web/index.html -H "Origin: https://exemplo.com" | grep -i "access-control"
curl -ik -X OPTIONS https://agenciadigital4.des.caixa:8025/siavl-web/index.html -H "Origin: https://exemplo.com" | grep -i "access-control"
curl -ik -X OPTIONS https://agenciadigital5.des.caixa:8027/siavl-web/index.html -H "Origin: https://exemplo.com" | grep -i "access-control"
