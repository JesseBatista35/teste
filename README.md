Falta saber de que lado está o problema, e isso se responde vendo se as variáveis de API chegam ao pod:

oc get route -A | grep -i bec3

Com o namespace da primeira coluna:

oc get deploy,dc -n <NAMESPACE_DA_ROTA> | grep -i bec3
oc set env deploy/<NOME> -n <NAMESPACE_DA_ROTA> --list | grep -E "^API_|HORARIO|SSO_|REALM"

Troque os <...> pelos valores reais. Se for DeploymentConfig, use dc/<NOME>.

Interpretação:

SSO_ aparecem, mas API_ e HORARIO_* não:** é configuração da esteira. No grupo SIEPR-CURSO-BEC3-FRONTEND-DES, essas variáveis provavelmente estão sem o prefixo _ENV. (ou não existem). Só o que tem _ENV. vai para o pod. Corrija o nome, ou peça os valores ao dev, e rode uma release alinhada com eles.
API_ aparecem no pod:* as variáveis chegam, e o script de inicialização da imagem não substitui os chunks. Aí é correção de código com o dev (talvez a PR 169663, em build agora).

Se o oc estiver chato, um print do grupo na Library já resolve a primeira hipótese: basta ver se as variáveis API_* têm o _ENV. na frente.

Como o Claude está se saindo nesta sessão?
