# RESOLUÇÃO DE WORK ORDER - Deploy Azure DevOps

**Data:** 16/06/2026  
**Ambiente:** Desenvolvimento (DES)  
**Pipeline:** Alocando o IP (AlocaIP e Infradevops)  
**Status:** ✅ RESOLVIDO

---

## PROBLEMA IDENTIFICADO

O pipeline de deploy estava falhando no step **"Alocando o IP (AlocaIP e Infradevops)"** com os seguintes erros:

### Erro 1 - Python Version
```
Exception: Python 3.10 or newer is required (found 3.9)
```
- O script `vcenter-mark-as-template.py` dependia da biblioteca `pyVmomi`
- A biblioteca `pyVmomi` requer Python 3.10 ou superior
- O agente `linux-okd4` tinha apenas Python 3.9 instalado

### Erro 2 - Módulo Python Faltante
```
ModuleNotFoundError: No module named 'isi_sdk_8_1_1'
```
- O script `nfs.py` tentava importar a biblioteca `isi_sdk_8_1_1`
- A biblioteca não estava instalada no agente `linux-okd4`

---

## CAUSA RAIZ

O agente Azure DevOps **`linux-okd4`** utilizado no pipeline possuía um **ambiente desatualizado**:
- Python 3.9.x (desatualizado)
- Dependências Python não instaladas
- Focado em ambientes OKD/Containers, não adequado para este tipo de infraestrutura

---

## SOLUÇÃO IMPLEMENTADA

**Remover o agente `linux-okd4` do pool de agentes**  
**Utilizar apenas o agente `linux` padrão**

O agente Linux padrão possui:
- ✅ Python 3.10+ ou 3.11+
- ✅ Dependências de sistema instaladas
- ✅ Bibliotecas Python necessárias (`pyVmomi`, `isi_sdk_8_1_1`, etc)
- ✅ Suporte adequado para infraestrutura virtualizada

---

## RESULTADO

Após a mudança do agente, o pipeline **executou com sucesso**:
- ✅ Todas as tasks foram executadas
- ✅ VM criada conforme esperado
- ✅ IP alocado corretamente
- ✅ Scripts Python executados sem erros

---

## RECOMENDAÇÕES FUTURAS

1. **Adicionar instalação de dependências** no pipeline para maior robustez:
   ```yaml
   - script: |
       python3 -m pip install pyvmomi isi-sdk-8-1-1
     displayName: 'Instalar dependências Python'
   ```

2. **Documentar requirements.txt** com todas as dependências Python necessárias

3. **Manter agentes atualizados** com versões recentes de Python e bibliotecas

4. **Testar pipeline** após qualquer atualização de agentes

---

## CONCLUSÃO

O problema foi resolvido através da utilização de um agente Azure DevOps com ambiente adequadamente configurado. O deploy em desenvolvimento está funcionando corretamente.

**Responsável:** DevOps Team  
**Data de Resolução:** 16/06/2026
