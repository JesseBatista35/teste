1. Para teste gerado a branch cesti-teste01 a partir da da TAG 2.1.0.7.
 
2. Feito os seguintes ajustes:
 
2.1. no arquivo assemble alterado:
 
DE:
mv $DEPLOY_DIR/dist/*  $DEPLOY_DIR/.
 
PARA:
mv $DEPLOY_DIR/dist/browser/*  $DEPLOY_DIR/.
 
2.2. No arquivo angular.json
 
DE:
          "builder": "@angular/build:application",
          "options": {
            "outputPath": {
              "base": "dist/sigrm-frontend",
              "browser": ""
            },
            "index": "src/index.html",
PARA:
          "builder": "@angular/build:application",
          "options": {
            "outputPath": "dist/sigrm-frontend",
            "index": "src/index.html",
            "browser": "src/main.ts",
