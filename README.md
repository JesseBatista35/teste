Estamos fazendo a integração do JCA/JCE do hsm no siabm-autenticação-api.
Estamos usando a versão 4.10.2 da lib do HSM. 

Conseguimos fazer funcionar localmente após fazer como é pedido no manual .

Mas de acordo com a instalação, precisamos levar essa lib para a pasta ext do Jre do ambiente.

Instalação - Docs DINAMO

O Dev fez esse ajuste localmente e conseguiu utilizar  JCA/JCE ai estou querendo validar para pedir para esteira.

Consegue nos ajudar?

consegue me ajudar acredito que esse arqvuio ja ta aqui



-sh-4.2$ oc login --token=sha256~HjnOtBkODRoLJ53GKDv8gyzmE8kFlCH78sAGRzuBCzI --server=https://api.nprd.caixa:6443
Logged into "https://api.nprd.caixa:6443" as "p981778@corp.caixa.gov.br" using the token provided.

You have access to 969 projects, the list has been suppressed. You can list all projects with 'oc projects'

Using project "sisam-tqs".
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get project siabm-des
NAME        DISPLAY NAME   STATUS
siabm-des                  Active
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$


