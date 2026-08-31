curl -ik -X OPTIONS https://agenciadigital2.des.caixa/siavl-web/index.html -H "Origin: https://exemplo.com" | grep -i "access-control"
curl -ik -X OPTIONS https://agenciadigital3.des.caixa/siavl-web/index.html -H "Origin: https://exemplo.com" | grep -i "access-control"
curl -ik -X OPTIONS https://agenciadigital4.des.caixa/siavl-web/index.html -H "Origin: https://exemplo.com" | grep -i "access-control"
curl -ik -X OPTIONS https://agenciadigital5.des.caixa/siavl-web/index.html -H "Origin: https://exemplo.com" | grep -i "access-control"
