Oi pessoal! 👋
Temos uma dúvida sobre a melhor prática para integração entre sistemas que usam certificados TLS auto-assinados da Caixa (como https://api.chat.caixa).
Identificamos 3 possíveis abordagens e gostaria de contar com a expertise de vocês para escolher a melhor:

Contexto
Sistema A (MCP Server) precisa se comunicar com Sistema B via HTTPS, mas o certificado é auto-assinado e interno da Caixa. Sem tratamento, a comunicação falha com erro SSL.

Soluções Propostas
Opção 1: Incorporar na Imagem Docker (Build Arg)

✅ Certificado é buildado junto com a imagem
✅ Funciona imediatamente
❌ Certificado fica acoplado à imagem
❌ Atualização de certificado = novo build

dockerfileARG CUSTOM_CA_CERT_B64=""
RUN if [ -n "$CUSTOM_CA_CERT_B64" ]; then \
      echo "$CUSTOM_CA_CERT_B64" | base64 -d > /usr/local/share/ca-certificates/custom-ca.crt; \
      update-ca-certificates; \
    fi

Opção 2: Kubernetes Secret + Volume Mount

✅ Certificado gerenciado como Secret K8s
✅ Separação entre imagem e credenciais
✅ Atualização sem rebuild
✅ Escalável para vários certificados
⚠️ Requer configuração no Helm Chart

yamlvolumes:
  - name: ca-cert
    secret:
      secretName: caixa-ca-cert
      
volumeMounts:
  - name: ca-cert
    mountPath: /etc/ssl/certs/caixa-ca.crt
    subPath: ca.crt

env:
  - name: SSL_CERT_FILE
    value: /etc/ssl/certs/caixa-ca.crt

Opção 3: Init Container

✅ Muito flexível
✅ Certificado injetado no runtime
⚠️ Mais complexo de manter


Nossas Dúvidas

Qual abordagem vocês recomendam?
Existe um padrão já estabelecido na Caixa para outros serviços?
Há um repositório/secret centralizado com o certificado CA interno?
Como vocês fazem essa gestão atualmente?
Se abrir uma REQ para automatizar isso, qual solução seria mais aderente?


Contexto da Aplicação

🐍 Stack: Python (FastMCP)
☸️ Orquestração: Kubernetes (AKS)
📦 CI/CD: GitHub Actions + ArgoCD
🌍 Ambientes: DES, TQS, NPRD


Informações Úteis

Dockerfile já tem suporte a certificados customizados
Aplicação usa requests e aiohttp (ambos respeitam SSL_CERT_FILE)
Helm Chart centralizado permite injeção de volumes


Agradeço antecipadamente a ajuda! 🙏
Quando tiverem um retorno, a gente abre a REQ com a solução escolhida.

Cc: [outros times relevantes, se necessário]
 
