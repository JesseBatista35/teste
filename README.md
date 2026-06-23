na brach dev ta assim:

Skip to content
GitHub Enterprise
Users managed by Caixa Economica Federal
caixagithub
siacx-chatcaixa-mcp-server
Repository navigation
Code
Issues
Pull requests
Actions
Projects
Models
Wiki
Security and quality
2
 (2)
Insights
Settings
Owner avatar
siacx-chatcaixa-mcp-server
Private
caixagithub/siacx-chatcaixa-mcp-server
Go to file
t
T
This branch is 14 commits ahead of main.
Name		
Victor Augusto Souza ResendeVictor Augusto Souza Resende
Victor Augusto Souza Resende
and
Victor Augusto Souza Resende
padronizacoes necessarias
d7df5d1
 · 
yesterday
.github/workflows
hotfix: pipelines
yesterday
src
padronizacoes necessarias
yesterday
.env.example
documentacao: readme e env.example
last month
.gitignore
novo mcp server, estudo template
2 months ago
Dockerfile
padronizacoes necessarias
yesterday
README.md
ajustes nas variaveis de ambiente
4 days ago
catalog-info.yaml
add healthz route
yesterday
mkdocs.yaml
arquivos faltantes
yesterday
pyproject.toml
padronizacoes necessarias
yesterday
requirements.txt
azure ai search - busca_ai tool
last month
Repository files navigation
README
ChatCaixa MCP Server
Servidor MCP em Python que disponibiliza a ferramenta de integração com o Azure AI Search para consultas de conteúdos Caixa.

Requisitos
Python 3.10 ou superior
Instalação
python -m venv .venv
.venv\Scripts\activate
pip install -r requirements.txt
Configuração
O projeto lê variáveis de ambiente a partir do arquivo .env na raiz.

Execução
Para iniciar o servidor MCP:

python -m src.mcp_server
Para testar:

Via interface, execute:
npx @modelcontextprotocol/inspector uv run server_mcp.py
Via ChatCaixa:
Executar repositório do orquestrador ChatCaixa posteriormente da execução desse servidor MCP.
About
Adicionando aplicação:

Topics
backend coeinteligenciaartificial
Resources
 Readme
 Activity
 Custom properties
Stars
 0 stars
Watchers
 0 watching
Forks
 0 forks
Releases
No releases published
Create a new release
Deployments
8
 DES
+ 7 deployments
Packages
No packages published
Publish your first package
Contributors
No contributors
Languages
Java
71.1%
 
Dockerfile
28.9%

dokerfile

FROM python:3.12-slim

ENV PYTHONDONTWRITEBYTECODE=1 \
    PYTHONUNBUFFERED=1

WORKDIR /app

# Dependencias minimas para HTTPS e certificados customizados.
RUN apt-get update && apt-get install -y --no-install-recommends \
    ca-certificates \
    curl \
 && rm -rf /var/lib/apt/lists/*

# Certificado CA customizado opcional (em base64) para ambientes corporativos.
# Exemplo no build: --build-arg CUSTOM_CA_CERT_B64="$(base64 -w0 meu-certificado.crt)"
ARG CUSTOM_CA_CERT_B64=""
RUN if [ -n "$CUSTOM_CA_CERT_B64" ]; then \
      echo "$CUSTOM_CA_CERT_B64" | base64 -d > /usr/local/share/ca-certificates/custom-ca.crt; \
      update-ca-certificates; \
    fi

COPY requirements.txt .
RUN pip install --no-cache-dir -r requirements.txt

COPY . .

RUN adduser --disabled-password --gecos "" appuser && \
    chown -R appuser:appuser /app

USER appuser

EXPOSE 8080

CMD ["python", "-m", "src.main"]



requieremnets.txt


azure-core
azure-search-documents
fastmcp
httpx
openai
pydantic
pydantic-settings

