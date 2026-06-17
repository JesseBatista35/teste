Solução via ConfigMap - Passo a Passo

PASSO 1: Criar o ConfigMap com o Certificado
bashoc create configmap ca-logintqs --from-file=/tmp/logintqs.pem -n sispl-tqs
Verifique:
bashoc get configmap ca-logintqs -n sispl-tqs -o yaml

PASSO 2: Editar o Deployment
bashoc edit deployment sispl-consulta-transacao-ocp4-tqs -n sispl-tqs
Vai abrir um editor. Localize a seção spec.template.spec.containers e adicione isso:
yaml        volumeMounts:
        - name: ca-logintqs
          mountPath: /etc/ca-certs
          readOnly: true
        env:
        - name: JAVA_TOOL_OPTIONS
          value: "-Djavax.net.ssl.trustStoreType=PEM -Djavax.net.ssl.trustStore=/etc/ca-certs/logintqs.pem"
E logo após containers: (no mesmo nível), adicione volumes::
yaml      volumes:
      - name: ca-logintqs
        configMap:
          name: ca-logintqs

PASSO 3: Salvar e Sair do Editor

Se for vi: :wq + Enter
Se for nano: Ctrl+X, Y, Enter


PASSO 4: Verificar se foi Aplicado
bashoc get deployment sispl-consulta-transacao-ocp4-tqs -n sispl-tqs -o yaml | grep -A10 "volumes:"

PASSO 5: Reiniciar o Deployment
bashoc rollout restart deployment sispl-consulta-transacao-ocp4-tqs -n sispl-tqs
Acompanhe:
bashoc get pods -w -n sispl-tqs | grep sispl-consulta-transacao-ocp4-tqs

PASSO 6: Verificar os Logs
Quando o pod voltar a rodar:
bashoc logs -f deployment/sispl-consulta-transacao-ocp4-tqs -n sispl-tqs --tail=100
Procure por:

❌ NÃO deve ter: PKIX path building failed
✅ DEVE ter: Conexão bem-sucedida com OIDC


Quer que eu te mostre como fica o YAML completo antes de salvar? Pode copiar a seção exata se quiser ser mais seguro.
