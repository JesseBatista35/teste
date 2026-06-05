Vamos investigar a imagem. Cria um container que não executa nada:
bashoc run -it --image=default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sicbc-backend:00.00.01.04 -n sicbc-des debug-container --command -- sh
Se entrar, rode:
bashls -la /deployments/
cat /deployments/quarkus-run.jar
