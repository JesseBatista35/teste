Bom dia,
 
Obrigada pelo retorno.
 
Eu inclui a variável  _ENV.ASPNETCORE_ENVIRONMENT : dev e o erro persiste.
Fiz até outros testes com a variável, pois olhei como estava configurando um outro projeto em .net com usa o vault o SNOP-BACKEND.
A razão da variável _ENV.ASPNETCORE_ENVIRONMENT estar com aspas simples, é por conta do padrão que encontrei na apostila.
 
README 5.md
 


# VAULT BeyondTrust - Guia de Implementação

A solução **VAULT BeyondTrust** é uma biblioteca desenvolvida especificamente para **.NET** que integra aplicações com o sistema de gerenciamento de secrets da CAIXA. Esta solução automatiza o processo de recuperação de credenciais sensíveis diretamente do cofre BeyondTrust, eliminando a necessidade de armazenar senhas em código ou arquivos de configuração.

**Este projeto serve como aplicação de exemplo** para demonstrar a implementação completa da solução BeyondTrust em um ambiente .NET 8.

## 🔍 Como Funciona - Resumo

O sistema funciona através de um processo automatizado em três etapas:

1. **📂 Carregamento**: Durante o startup da aplicação, a biblioteca carrega automaticamente todos os secrets pela variável definida na library principal do projeto `_ENV.VAULT_LOCATION` vinculada ao diretório de armazenamento de variáveis no cofre.

2. **🔄 Resolução**: São identificadas as variáveis no formato `${variable_name}` declaradas na library do projeto principal e substituidas pelos valores reais do cofre

3. **⚙️ Integração**: Disponibiliza os secrets através do sistema nativo de configuração do .NET (`IConfiguration`), mantendo transparência total para o código da aplicação

## 🔧 Pré-requisitos

- **.NET 8.0** ou superior
- **Azure DevOps** com library groups configuradas
- Pré-Configurações de Libraries e Pipelines com serviços de T.I Caixa

## 📋 Índice
- [1ª Etapa - Configurações de Libraries e Pipelines](#️-1ª-etapa---configurações-de-libraries-e-pipelines)
- [2ª Etapa - Configuração no projeto .NET](#️-2ª-etapa---configuração-no-projeto-net-8)
- [Variáveis de Debug](#-variáveis-de-debug)
- [Utilização no Projeto](#-utilização-no-projeto)
- [Troubleshooting](#-troubleshooting)
- [Resumo da Implementação](#-resumo-da-implementação)
- [HealthCheck (Opcional)](#-healthcheck-opcional)
- [Referências](#-referências)

## 🏗️ 1ª Etapa - Configurações de Libraries e Pipelines

Antes de implementar a solução BeyondTrust, é necessário criar e configurar o VAULT no ambiente da CAIXA através do [servicos.caixa](https://servicos.caixa/). Para este manual, utilizaremos como exemplo a aplicação SISOU-api-ouvidoria baseada em .NET 8, disponível em [SISOU-api-ouvidoria](https://devops.caixa/projetos/Caixa/_git/SISOU-api-ouvidoria). Siga os passos abaixo:

### Passo 1: Abertura da REQ TE191 - Usuário de Sistema

Para cada ambiente da aplicação desejado (DES | TQS | HMP | PRD), abra uma **REQ TE191** em [servicos.caixa](https://servicos.caixa/):

- **Tipo de Requisição**: `Tecnologia da Informação e Comunicação > Segurança Tecnológica > Acesso > TE191 - Usuário de Sistema`

<div align="center">
  <img src="BeyondTrust-VAULT-AspNetCore/docs/TE191.png" alt="TE191">
</div>

<div align="center"><em>Tela de abertura da requisição TE191 - Usuário de Sistema</em></div>
<br/>

Siga como base o padrão de solicitação abaixo **REQ000141352353** com as informações necessárias para a criação do cofre de senhas e libraries:

![Exemplo-TE191](BeyondTrust-VAULT-AspNetCore/docs/Exemplo-TE191.png)

<div align="center"><em>Exemplo de requisição TE191 aberta para o sistema SISOU-api-ouvidoria</em></div>
<br/>

**Observação:**
- Para verificação de quais variáveis são necessárias para armazenamento no cofre de senhas, assim como o padrão/formato Alias, siga como base o documento oficial em [Padrões de Produção de TI - Aplicação - Vault](https://caixa.sharepoint.com/sites/PPTI/SitePages/Padrao-Vault.aspx?csf=1&web=1&e=Z8e7r6&CID=c3f302b3-c161-4379-9194-593163ed42dd)

Após aprovação e finalização das requisições, verifique se a library com o contexto **BT-VAULT** foi devidamente criada:

![SISOU-API-OUVIDORIA-BT-VAULT-DES](BeyondTrust-VAULT-AspNetCore/docs/SISOU-API-OUVIDORIA-BT-VAULT-DES.png)

<div align="center"><em>Exemplo de Library BeyondTrust VAULT - SISOU API Ouvidoria</em></div>
<br/>

Também confirme se as variáveis vinculadas ao cofre na library do projeto principal foram alteradas conforme os nomes definidos na requisição:

![SISOU-API-OUVIDORIA-DES](BeyondTrust-VAULT-AspNetCore/docs/SISOU-API-OUVIDORIA-DES.png)

<div align="center"><em>Exemplo de variáveis vinculadas ao cofre cadastradas na Library do projeto principal com o padrão '${variavel}' - SISOU API Ouvidoria DES</em></div>


### Passo 2: Solicitar adição de tasks vinculadas ao BeyondTrust

Solicite a adição de tasks vinculadas ao BeyondTrust na release do projeto após a task Cria_APP_OKD, utilizando a requisição **Suporte ao ambiente de aplicação nas esteiras DevOps**. Seguindo o exemplo do sistema SISOU API OUVIDORIA, utilize como base a requisição **REQ000141433825**.

Confirme se as tasks foram devidamente criadas na etapa no ambiente de release do projeto:

![RELEASE-SISOU-API-OUVIDORIA](BeyondTrust-VAULT-AspNetCore/docs/RELEASE-SISOU-API-OUVIDORIA.png)

<div align="center"><em>Tasks vinculadas ao BeyondTrust criadas por equipe de esteiras</em></div>
<br/>

### 🔄 Adição de Novas Senhas em Libraries Existentes

Para adição de novas senhas em libraries já existentes, utilize a requisição:

**Tipo**: `Tecnologia da Informação e Comunicação > Segurança Tecnológica > Acesso > Inserir senha de usuário de serviço`

---

## ⚙️ 2ª Etapa - Configuração no projeto .NET 8

### Passo 1: Copiar a pasta Infrastructure/BeyondTrust para seu projeto

1. **Localize a pasta neste repositório**: `src/Infrastructure/BeyondTrust/`
2. **Copie toda a estrutura** para o seu projeto na mesma localização
3. **Verifique se todos os arquivos foram copiados**:
   - `BeyondTrustService.cs`
   - `BeyondTrustVariableResolver.cs`
   - `BeyondTrustConfigurationSource.cs`
   - `BeyondTrustWebApplicationBuilderExtensions.cs`

> **📁 Estrutura esperada no seu projeto:**
> ```
> seu-projeto/
>   src/
>     Infrastructure/
>       
>         ├── BeyondTrustService.cs
>         ├── BeyondTrustVariableResolver.cs
>         ├── BeyondTrustConfigurationSource.cs
>         ├── BeyondTrustWebApplicationBuilderExtensions.cs
>         └── README.md
> ```

### Passo 2: Adicionar BeyondTrust ao Program.cs

No arquivo `Program.cs`, adicione a configuração do BeyondTrust **após** o carregamento das configurações base:

```csharp
var builder = WebApplication.CreateBuilder(args);

// 1. Carrega configurações para utilização de variáveis de ambiente no arquivo appsettings.json
builder.Configuration
    .SetBasePath(Directory.GetCurrentDirectory())
    .AddJsonFile("appsettings.json", optional: false, reloadOnChange: true)
    .AddJsonFile($"appsettings.{builder.Environment.EnvironmentName}.json", optional: true, reloadOnChange: true)
    .AddEnvironmentVariables();

// 2. ✅ ADICIONAR ESTA LINHA - Configurar BeyondTrust
builder.AddBeyondTrust();

// 3. Resto da configuração da aplicação...
```

### Passo 3: Configurar Library do Azure DevOps

Na **Library do Azure DevOps**, configure as seguintes variáveis obrigatórias:

#### Variáveis Obrigatórias:

```yaml
# Certifique-se que a variável BeyondTrust está cadastrada (obrigatória)
_ENV.VAULT_LOCATION: '/usr/src/app/secrets_files'

# Registre a variável de logging do BeyondTrust
_ENV.BEYONDTRUST_LOGGING_ENABLED: 'true'
```

#### Padrão para Variáveis com Secrets:

Para cada variável que deve ser resolvida pelo cofre, use o padrão `'${nome_da_variavel_do_cofre}'`:

```yaml
# ✅ EXEMLO DE PADRÃO CORRETO: Variáveis que serão resolvidas pelo cofre
_ENV.DB_PASSWORD: '${ssoudb03_oracle}'
_ENV.SSO_SISOU_CLIENT_SECRET: '${sso_client_secret}'
```

onde ssoudb03_oracle e sso_client_secret são as variáveis solicitadas para armazenamento no cofre via requisição `TE191 - Usuário de Sistema`.

### Passo 4: Configurar appsettings.json

No arquivo `appsettings.json`, mantenha as referências às variáveis que serão injetadas:

```json
{
  "ConnectionStrings": {},
  "Logging": {
    "LogLevel": {
      "Default": "Information",
      "Microsoft.AspNetCore": "Warning"
    }
  },
  "AllowedHosts": "*",
  
  // ✅ Configurações BeyondTrust
  "VAULT_LOCATION": "DEVE_SER_CONFIGURADO_NA_LIBRARY_DEVOPS",
  "BEYONDTRUST_LOGGING_ENABLED": "BEYONDTRUST_LOGGING_ENABLED",
  
  // ✅ Variáveis que serão resolvidas pelo cofre
  "DB_PASSWORD": "DB_PASSWORD", 
  "SSO_SISOU_CLIENT_SECRET": "SSO_SISOU_CLIENT_SECRET",
}
```

## 🐛 Variáveis de Debug

Para facilitar o debug e monitoramento, utilize a variável:

```yaml
# Controla se o BeyondTrust deve exibir logs detalhados
BEYONDTRUST_LOGGING_ENABLED: 'true'
```

### Logs de Debug do BeyondTrust:

Quando `BEYONDTRUST_LOGGING_ENABLED: 'true'`, você verá logs como:

```
[BT] Configurando BeyondTrust - Ambiente: Production
[BT] Carregando secrets do diretório: /usr/src/app/secrets_files
[BT] Encontrados 15 arquivos para processar
[BT] Carregamento concluído: 15 secrets processados
[BT-RESOLVER] Resolvendo 8 variáveis com padrões ${}
[BT-RESOLVER] DB_PASSWORD: '${ssoudb03_oracle}' → resolvido
[BT-RESOLVER] Resolução concluída: 8/8 variáveis resolvidas
[BT] BeyondTrust configurado com sucesso
```

## 💻 Utilização no Projeto

### Como Usar as Variáveis Resolvidas:

Após a configuração, use as variáveis normalmente via `IConfiguration` **(RECOMENDADO)**:

```csharp
public class MinhaService
{
    private readonly IConfiguration _configuration;
    
    public MinhaService(IConfiguration configuration)
    {
        _configuration = configuration;
    }
    
    public void ConfigurarBanco()
    {
        // ✅ Estes valores serão automaticamente resolvidos pelo BeyondTrust
        var dbPassword = _configuration["DB_PASSWORD"]; // Valor real do cofre
        var sisouClienteSecret = _configuration["SSO_SISOU_CLIENT_SECRET"]; // Valor real do cofre

    }
}
```

### Ambiente de Desenvolvimento:

Em ambiente de **Development**, o BeyondTrust é automaticamente desabilitado:

```
[DEV] BeyondTrust desabilitado - usando configurações locais
```

Neste caso, as variáveis usam os valores do `appsettings.Development.json`.



## 🔧 Troubleshooting

### Problemas Comuns:

#### 1. "VAULT_LOCATION não configurada na library do DevOps"
```
❌ Erro: VAULT_LOCATION não configurada na library do DevOps
✅ Solução: Configure VAULT_LOCATION: '/usr/src/app/secrets_files' na library do DevOps
```

#### 2. "Diretório de secrets não encontrado"
```
❌ Erro: Diretório de secrets não encontrado: /usr/src/app/secrets_files
✅ Solução: Verifique se o volume está montado corretamente no container
```

#### 3. "Variável não encontrada no cofre"
```
❌ Log: [BT-RESOLVER] Variável 'minha_variavel' não encontrada no cofre
✅ Solução: Verifique se a variável existe no cofre com o nome exato
```

---

## 📖 Resumo da Implementação

1. **Copie** a pasta `Infrastructure/BeyondTrust` para seu projeto
2. **Adicione** `builder.AddBeyondTrust()` no `Program.cs`
3. **Configure** `_ENV.VAULT_LOCATION` na library do DevOps
4. **Use padrão** `'${variavel_cofre}'` para secrets na library
5. **Mantenha referências** no `appsettings.json`

A solução funciona automaticamente em produção e usa fallback local em desenvolvimento! 🚀

## 🏥 HealthCheck (Opcional)

O **HealthCheck do BeyondTrust** é um recurso opcional que permite monitorar o estado dos secrets e verificar a conectividade com o cofre. Este componente é útil para:

- **Monitoramento de infraestrutura**: Verificar se todos os secrets críticos estão disponíveis
- **Detecção proativa de problemas**: Identificar falhas na conectividade com o cofre
- **Observabilidade**: Ter visibilidade do status da integração BeyondTrust
- **Ambiente específico**: Comporta-se diferente em Development vs Production

### Configuração do HealthCheck:

#### Passo 1: Copiar arquivo HealthCheck

Copie o arquivo de HealthCheck para seu projeto:
```bash
# Copie de:
C:\Desenvolvimento\VAULT\TEMP\modelo-dortnetcore-bt\BeyondTrust-VAULT-AspNetCore\Shared\HealthChecks\BeyondTrustSecretsHealthCheck.cs

# Para seu projeto em:
seu-projeto/Shared/HealthChecks/BeyondTrustSecretsHealthCheck.cs
```

#### Passo 2: Habilitar HealthChecks na aplicação

O **HealthCheck do BeyondTrust já é automaticamente configurado** pela extensão `builder.AddBeyondTrust()`, mas você precisa habilitar os endpoints de HealthCheck no seu `Program.cs`:

```csharp
// Adiciona serviços de Health Check gerais (se ainda não tiver)
builder.Services.AddHealthCheckServices();

var app = builder.Build();

// Configure the HTTP request pipeline...

// ✅ ADICIONAR - Configura endpoints de Health Check
app.UseHealthCheckEndpoints();

app.Run();
```

### Endpoints Disponíveis:

Após a configuração, os seguintes endpoints estarão disponíveis:

- **`GET /health`** - Status básico da aplicação e BeyondTrust
- **`GET /health/detailed`** - Informações detalhadas de todos os health checks

### Exemplo de Resposta do HealthCheck:

**Production (usando BeyondTrust):**
```json
{
  "status": "Healthy",
  "environment": "Production",
  "configurationSource": "BeyondTrust",
  "checks": [
    {
      "name": "beyondtrust-secrets",
      "status": "Healthy",
      "description": "Todos os secrets do BeyondTrust estão disponíveis",
      "duration": 120.5,
      "data": {
        "Environment": "Production",
        "ConfigurationSource": "BeyondTrust",
        "SecretsDirectoryExists": true,
        "DB_PASSWORD_Available": true,
        "SSO_SISOU_CLIENT_SECRET_Available": true,
        "SISOU_API_KEY_Available": true
      }
    }
  ]
}
```

### 📊 **Monitoramento:**

- **Status Healthy**: Todos os secrets estão disponíveis
- **Status Degraded**: Alguns secrets não estão disponíveis (não crítico)
- **Status Unhealthy**: Falha grave na conectividade com o cofre

### 📚 **Referências:**

#### **Documentação Oficial:**
- **[Padrões de Produção de TI - Aplicação - Vault](https://caixa.sharepoint.com/sites/PPTI/SitePages/Padrao-Vault.aspx?csf=1&web=1&e=Z8e7r6&CID=c3f302b3-c161-4379-9194-593163ed42dd)** - Documento oficial da CAIXA com padrões e formatos para variáveis do VAULT

#### **Sistemas e Portais:**
- **[servicos.caixa](https://servicos.caixa/)** - Portal para abertura de requisições TE191 e suporte
- **[Azure DevOps - SISOU API Ouvidoria](https://devops.caixa/projetos/Caixa/_git/SISOU-api-ouvidoria)** - Repositório de exemplo baseado em .NET 8

#### **Requisições de Exemplo:**
- **REQ000141352353** - Exemplo de requisição TE191 para criação de cofre de senhas e libraries
- **REQ000141433825** - Exemplo de requisição para suporte ao ambiente de aplicação nas esteiras DevOps

#### **Recursos Adicionais:**
- **[Configuração BeyondTrust Quarkus](https://devops.caixa/projetos/Caixa/_wiki/wikis/Caixa.wiki/1935/Configura%C3%A7%C3%A3o-Beyondtrust-Quarkus)** - Wiki interno com configurações específicas para outras tecnologias
