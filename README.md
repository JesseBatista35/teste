A imagem base (builder image) é quem faz as substituições, não o código.
Procura qual é a imagem base do vivavoz:
bashoc get bc sisou-vivavoz-okd-des -n sisou-des -o yaml | grep -i "from\|image"
E do sac para comparar:
bashoc get bc sisou-sac-okd-des -n sisou-des -o yaml | grep -i "from\|image"
Me passa os resultados.
