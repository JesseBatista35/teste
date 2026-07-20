#!/usr/bin/python
# -*- coding: utf-8 -*-
import os
import sys
import time
import json
import urllib3
import requests
import subprocess
from netaddr import *

import isi_sdk_8_1_1 as isilon
from isi_sdk_8_1_1.rest import ApiException

# Disable SSL warnings
requests.packages.urllib3.disable_warnings()

#variaveis vindas do ADS
ambiente =  os.getenv("SISTEMAAMBIENTE", os.getenv("SISTEMA_AMBIENTE", "")).lower()
sistema = os.getenv("SISTEMANOME", os.getenv("SISTEMA_NOME", "")).lower()
site = os.getenv("SITE", "").lower()
 
funcao = str(sys.argv[1])
# URL Portal
url_portal = 'https://infradevops-novoportal-backend-prd.apps.produtos4.caixa/api.php'

home_ansible = os.getenv('HOME_ADS_AGENT','')+'/'+os.getenv('DIR_ANSIBLE','')

# Dados de Conexao AlocaIP
id_alocaip = os.getenv("ID_ALOCAIP","")
pw_alocaip = os.getenv("PW_ALOCAIP", "")

usuario =  os.getenv("USR_ISILON","")
senha = os.getenv("PW_ISILON","")

if len(sys.argv) >=10:
  sistema=str(sys.argv[2]).lower()
  ambiente=str(sys.argv[3]).lower()
  site=str(sys.argv[4]).lower()
  home_ansible=str(sys.argv[5])
  id_alocaip=str(sys.argv[6])
  pw_alocaip=str(sys.argv[7])
  usuario=str(sys.argv[8])
  senha=str(sys.argv[9])
  nfs_list_str=str(sys.argv[10])
  nfs_list_str=nfs_list_str.replace("\\","")
  nfs_list= json.loads(nfs_list_str)



# Variaveis Global
zona = ''
endpoint_isilon = ''
api_instance = ''

def get_variables_with_prefix(prefix):
  variables = {}
  for key, value in os.environ.items():
    if key.startswith(prefix):
        variables[key] = value
  return variables

def get_variables_with_prefix(prefix, obj):
    variables = {}

    for item in obj:
        for key, value in item.items():
            if key.startswith(prefix):
                variables[key] = value

    return variables


# Interacao com o Portal Infra.DevOps
def consultaPortal(url_portal,payload, tipo):
  try:
    request = requests.get(url_portal, params=payload,verify=False)
    request.raise_for_status()
    if 'info' in request.json():
      if tipo == "nfs_link":
        print("Sem compartilhamentos configurados")
        sys.exit(0)
      raise Exception("Variavel Sistema ou Ambiente inexistente")

    return request.json()

  except requests.exceptions.HTTPError as http_error:
    print("HTTP Error:", http_error)
  except requests.exceptions.ConnectionError as con_error:
    print("Erro de conexao:",con_error)
  except requests.exceptions.Timeout as time_error:
    print("Conexao expirada", time_error)
  except requests.exceptions.RequestException as error:
    print("Erro:",error)
  except Exception as e:
    print ("Error:", e.args[0])
    sys.exit(1)

def ip_backup():
  payload_sistema = (('acao','listarServidoresCadastrados'),('sistema',sistema),('ambiente',ambiente),('status','ativado'),('site', site))
  tipo = "backup"
  sistemas = consultaPortal(url_portal,payload_sistema, tipo)['dados']

  servidores_sem_bkp = {}

  for servidor in sistemas:
    if servidor['ipbackup'] == "" or servidor['ipbackup'] == None:
      servidores_sem_bkp[servidor['servidores_json'][0]['nome']] = aloca_ip()

  if len(servidores_sem_bkp) != 0:
    # Atualiza Portal com os IPs

    for servidor,ip in servidores_sem_bkp.items():
      try:
        atualiza_portal(servidor, ip, sistema, ambiente)
      except Exception as e:
        print ("Erro ao atalizar o portal:", e)
        desaloca_ip(ip)
        sys.exit(1)


def atualiza_portal(hostname, ipbackup, sistema, ambiente):
  url_atualiza = url_portal+'?acao=editarServidor'
  payload = {
    "dados": {
    "ipbackup": ipbackup,
    },
    "consulta": {
        "sistema": sistema,
        "ambiente": ambiente,
        "hostname": hostname,
        "site": site
    }
  }
  retorno = requests.post(url_atualiza, data=json.dumps(payload),verify=False)
  print("{:<35} {:<35} {:<35} {:<35}".format(hostname, ipbackup, sistema, ambiente))

  return retorno.json()['retorno']['status']


def aloca_ip():
  url_alocaip = 'https://api.alocaip.telecom.caixa/ApiAlocaIP/Gerar'
  header = {'Content-Type': 'application/json', 'cache-control': 'no-cache'}
  data = {"id": id_alocaip,
          "senha": pw_alocaip,
          "site":"CTC",
          "vertical": "",
          "ambiente": "",
          "unidade": "",
          "categoria":"Linux",
          "descricao":"Projeto Esteiras - interfaces-bkp",
          "red_num": "",
          "par":"S",
          "parCriado":"S"
          
         }
  try:
    if ambiente.lower() == "prd":
      #red_num = "829" # nfsctc.ctc.caixa - Rede backup 10.122.16.0/20
                      # 2nfs20.ctc.caixa - Rede backup 10.122.32.0/20 
      endpoint_decisao = nfs_list[0]['NFS_ENDPOINT_VM'] 
      if endpoint_decisao.startswith("hyperprd"):
        data["red_num"] = "14201"
        data["unidade"] = "CEPTIBR"
        data["vertical"] = "Backup"
        data["ambiente"] = "Backup"
        data["inicioRange"] = "10.187.240.0" 
        data["fimRange"] = "10.187.255.254"
        
      else: 
        data["red_num"] = "4088"
        data["unidade"] = "CEPTIBR"
        data["vertical"] = "Backup"
        data["ambiente"] = "Backup"
      
    else:
      data["vertical"] = "Desenvolvimento"
      data["ambiente"] = 'Backup'
      data["red_num"] = '4718'
      data["unidade"] = 'CETAD'
      
    print("Informacoes da Rede:\nVertical:{}\nAmbiente:{}\nRede:{}\nUnidade:".format(data['vertical'], data['ambiente'], data['red_num'], data['unidade']))
    response = requests.post(url_alocaip, data=json.dumps(data), headers=header,timeout = 60, verify=False)
    #alocaip = []
    
    try:
      if response.status_code in (200,299):
        resposta = response.content.decode('utf-8-sig')
        dados = json.loads(resposta)
        alocaip = [str(item) if item is not None else "" for item in dados['Gerar']] 
        print("Dados Retornados AlocaIP:{}".format(dados))
    except Exception as error:
      print("A api nao retornou um IP de Backup:\n{}".format(error))
    
    if  len(alocaip) >= 1:
      hostname = alocaip[0]
      ip = alocaip[1]
      ip_n_conv = alocaip[2]
      gw = alocaip[3]
      if alocaip[3] == "10.184.0.1":
        #mask = alocaip[4]
        mask= "255.252.0.0"
      else:
        mask = alocaip[4]
      vlan = alocaip[5]
      descricao = alocaip[6]

       
      subnet = IPNetwork(ip+'/'+mask)

      # Valida Retorno do AlocaIP

      retorna_ip = False

      if not IPAddress(mask).is_netmask():
        print("Mascara Incorreta ", mask)
        retorna_ip = True

      if IPAddress(ip) == subnet.network:
        print("Erro, IP de Host e de Rede sao iguais: ", ip)
        retorna_ip = True

      if IPAddress(ip) == subnet.broadcast:
        print("Erro, IP de Host e de Broadcast sao iguais: ", ip)
        retorna_ip = True
      
      if not IPAddress(ip).is_private():
        print("IP Incorreto ", ip)
        retorna_ip = True

      if gw != "":
        if IPAddress(ip) == IPAddress(gw):
          print("Ip do Host e o Gateway sao o mesmo")
          print("IP: ",ip)
          print("Gateway: ",gw)
          retorna_ip = True

      if retorna_ip:
        desaloca_ip(ip)

      return ip
    else:
      print("Lista retornada pela api nao tem os dados necessarios:\n{}".format(alocaip))
      return ""
    
  except Exception as error:
    print("Ocorreu error ao tentar alocar IP de Backup:\n{}".format(error))
    return ""

def desaloca_ip(ip):
  url_desalocaip = 'https://api.alocaip.telecom.caixa/ApiAlocaIP/Desalocar'
  header = {'Content-Type': 'application/json', 'cache-control': 'no-cache'}

  ip_decimal = int(IPAddress(ip))

  data = {"id": id_alocaip,
          "senha": pw_alocaip,
          "IpConvertido":ip,
          "IpnaoConvertido":ip_decimal
         }

  desalocaip = requests.post(url_desalocaip, data = json.dumps(data), headers=header, verify=False)
  desaloca_status=desalocaip.json()['Desalocar'][0]
  print(desaloca_status.capitalize()+" ao desalocar o IP "+ip)

def create_ip_bck(nfs_endpoints, nfs_mount_points):

  print("{:<35} {:<35} {:<35} {:<35} {:<35} {:<35}".format('Nome', 'Endpoint', 'Mountpoint', 'Tipo', 'Ip', 'Ambiente'))
  print("{:-<210}".format("-"))
  print("NFS ENDPOINT: " + str(nfs_endpoints) + " | NFS MOUNTPOINTS: " + str(nfs_mount_points))
  combined_variables = sorted(zip(nfs_endpoints.items(), nfs_mount_points.items()), key=lambda x: x[0][0])

  print("Variaveis combinadas"+str(combined_variables))
  for (endpoint_name, nfs_endpoint), (mount_point_name, nfs_mount_point) in combined_variables:

    if '/' in nfs_endpoint:
      nome = nfs_endpoint.upper().strip().split(":")[0].lower()
    else:
      nome = nfs_endpoint.upper().strip()

    endpoint = nfs_endpoint.strip().split(":")[1]
    mountpoint = nfs_mount_point.strip()
    tipo = endpoint_name.strip().split("_")[2]
    ip = nfs_endpoint.strip().split(":")[0]
    ambiente_portal = ambiente
    print("Variaveis que chegam "+str(endpoint)+str(mountpoint)+str(tipo)+str(ip)+str(ambiente_portal))
    if tipo.lower().startswith('isilon') or tipo.lower().startswith('huawei') or tipo.lower().startswith('vm'):

      ip_backup()

    if not tipo.lower().startswith('isilon') and not tipo.lower().startswith('vm') and not tipo.lower().startswith('huawei') :
      print("Tipo Inexistente para Montagem")

    print("{:<35} {:<35} {:<35} {:<35} {:<35} {:<35}".format(nome, endpoint, mountpoint, tipo, ip, ambiente_portal))

def mount(nfs_endpoints, nfs_mount_points):

  print("{:<35} {:<35} {:<35} {:<35} {:<35} {:<35}".format('Nome', 'Endpoint', 'Mountpoint', 'Tipo', 'Ip', 'Ambiente'))
  print("{:-<210}".format("-"))

  combined_variables = sorted(zip(nfs_endpoints.items(), nfs_mount_points.items()), key=lambda x: x[0][0])


  for (endpoint_name, nfs_endpoint), (mount_point_name, nfs_mount_point) in combined_variables:

    if '/' in nfs_endpoint:
      nome = nfs_endpoint.upper().strip().split(":")[0].lower()
    else:
      nome = nfs_endpoint.upper().strip()

    endpoint = nfs_endpoint.strip().split(":")[1]
    mountpoint = nfs_mount_point.strip()
    tipo = endpoint_name.strip().split("_")[2]
    ip = nfs_endpoint.strip().split(":")[0]
    ambiente_portal = ambiente

    print("{:<35} {:<35} {:<35} {:<35} {:<35} {:<35}".format(nome, endpoint, mountpoint, tipo, ip, ambiente_portal))


    if ambiente_portal == ambiente:

      if tipo.lower().startswith('isilon'):

        escolhaIsilon(nome)

        instanciaIsilon(endpoint_isilon)

        configuracao_nfs, nfs_id = getConfiguracao(zona, endpoint)

        lista_servidores = pega_lista_servidores(sistema,ambiente)

        updateNfs(configuracao_nfs, nfs_id, lista_servidores)

        montagem(mountpoint, nome, endpoint)

      if tipo.lower().startswith('vm'):
        montagem(mountpoint, ip, endpoint)

      if not tipo.lower().startswith('isilon') and not tipo.lower().startswith('vm') :
        print("Tipo Inexistente para Montagem")

    print("{:<35} {:<35} {:<35} {:<35} {:<35} {:<35}".format(nome, endpoint, mountpoint, tipo, ip, ambiente_portal))

# Interacao Isilon

def escolhaIsilon(nome):

  global zona
  global endpoint_isilon

  storages_isilon = {
        'CADSVISISD1':[{'nomes':['nfsdtc.dtc.caixa','nfsccp.dtc.caixa','1nfs20.dtc.caixa'],'ip_gerencia':'isilondtc.dtc.caixa','zona':'ZONEINTRA'}],
        'CADSVISISD2':[{'nomes':['nfsctc.ctc.caixa','nfsdcp.ctc.caixa','2nfs20.ctc.caixa'],'ip_gerencia':'isilonctc.ctc.caixa','zona':'SERVIDORES'}],
        'CADSVISISD3':[{'nomes':['nfsprdctc3.ctc.caixa','nfsprddcp3.ctc.caixa'],'ip_gerencia':'isilonhdfsctc.prd.bigdata.caixa','zona':'SERVIDORES-PRD'}],
        'CADSVISISD4':[{'nomes':['nfsctcnprd.ctc.caixa'],'ip_gerencia':'10.122.148.76','zona':'SERVIDORES'}]
  }

  for storage in storages_isilon.keys():
    if nome in storages_isilon[storage][0]['nomes']:
      zona = storages_isilon[storage][0]['zona']
      endpoint_isilon = storages_isilon[storage][0]['ip_gerencia']


# Configura Instancia Isilon
def instanciaIsilon(endpoint_isilon):
  global api_instance
  configuration = isilon.Configuration()
  configuration.host = endpoint_isilon
  configuration.username =  usuario
  configuration.password = senha
  configuration.verify_ssl = False
  api_instance = isilon.ProtocolsApi(isilon.ApiClient(configuration))

def getExportId(zone,path):
  try:
    api_response_id = api_instance.list_nfs_exports(zone=zone, path=path.strip())

  except ApiException as e:
    print("Exception when callin ProtocolsApi->list_nfs_exports: %s\n" % e)

  return api_response_id.exports[0].id

def getConfiguracao(zone,path):
  nfs_export_id = getExportId(zone,path)
  try:
    nfs_response = api_instance.get_nfs_export(nfs_export_id, zone=zone)
  except ApiException as e:
    print("Exception when callin ProtocolsApi->list_nfs_exports: %s\n" % e)

  return nfs_response, nfs_export_id

# Pega informacoes do Portal IIF e Decide por Storage ou Servidor NFS em VM

def pega_lista_servidores(sistema,ambiente):
  payload_sistema = (('acao','listarServidoresCadastrados'),('sistema',sistema),('ambiente',ambiente),('status','ativado'))
  tipo = "backup"
  sistemas = consultaPortal(url_portal,payload_sistema, tipo)['dados']

  lista_servidores = []

  for servidor in sistemas:
    lista_servidores.append(servidor['ipbackup'])

  return lista_servidores

def updateNfs(instancia_nfs, id_nfs, clientes_nfs):
  updated_clients = updateClientes(instancia_nfs,list(clientes_nfs))
  nfs_export = isilon.NfsExport()
  if len(updated_clients) > 0:
    nfs_export.clients = updated_clients
    nfs_export.read_write_clients = updated_clients
    nfs_export.root_clients = updated_clients
  try:
    api_instance.update_nfs_export(nfs_export, id_nfs, zone=zona)
  except ApiException as e:
    print("Exception when callin ProtocolsApi->get_nfs_expor: %s\n" % e)

def updateClientes(instancia_nfs, clientes):
  clientes_cadastrados = instancia_nfs.exports[0].clients
  if len(clientes_cadastrados) > 0:
    for cliente in clientes:
      if cliente not in clientes_cadastrados:
        clientes_cadastrados.append(cliente)
  return clientes_cadastrados

def dicionario_servidores(sistema, ambiente):
  payload_sistema = (('acao','listarServidoresCadastrados'),('sistema',sistema),('ambiente',ambiente),('status','ativado'))
  tipo = "backup"
  sistemas = consultaPortal(url_portal,payload_sistema, tipo)['dados']

  servidores = {}

  for servidor in sistemas:
    servidores[servidor['servidores_json'][0]['nome'].encode('utf-8')] =  servidor['ipbackup']

  return servidores

def montagem(mountpoint, ip, endpoint):

  servidores = {'servidores':dicionario_servidores(sistema,ambiente)}
  print('nfs_path={}'.format(mountpoint))
  print('nfs_src={0}:{1}'.format(ip,endpoint))
  # try:

  #   subprocess.check_call(['ansible-playbook', '{}/roles/nfs/tasks/stack_nfs.yml'.format(home_ansible), '-e', 'nfs_path={}'.format(mountpoint),  '-e', '{}'.format(servidores), '-e', 'nfs_src="{0}:{1}"'.format(ip,endpoint)])

  # except subprocess.CalledProcessError:
  #   print("Erro ao montar {0}:{1}, vericar o infradevops.caixa".format(ip,endpoint))
  #   sys.exit(2)

if __name__ == "__main__":

  if nfs_list is None:
    nfs_endpoints = get_variables_with_prefix('NFS_ENDPOINT', os.environ.items())
    nfs_mount_points = get_variables_with_prefix('NFS_MOUNT_POINT', os.environ.items())
  else:
    print(nfs_list)
    nfs_endpoints = get_variables_with_prefix('NFS_ENDPOINT', nfs_list)
    nfs_mount_points = get_variables_with_prefix('NFS_MOUNT_POINT', nfs_list)

  if nfs_endpoints or nfs_mount_points:
    if funcao == "create_ip_bck":
      create_ip_bck(nfs_endpoints,nfs_mount_points)
    if funcao == "montagem":
      mount(nfs_endpoints,nfs_mount_points)


<img width="1886" height="968" alt="image" src="https://github.com/user-attachments/assets/667ca111-8cdd-4675-950f-9c805b196af3" />





o aruivo ta aqui mais ele é do repositro de infraestrutura.. o que posso fazer e crirar uma task de teste.. mais pelo que vi o problema nao é nesse aqruivo e nos endpoisnt que el fez 


MANUAL 


Skip to main content
Azure DevOps
projetos
/
Caixa
/
Overview
/
Wiki
/
Azure Wiki
/
NFS VM Terraform - Montagem de Compartilhamento
Search


Caixa

Overview
Summary
Dashboards
Wiki

Boards

Repos

Pipelines

Test Plans

Artifacts
Project settings

Caixa.wiki

NFS


New page
NFS VM Terraform - Montagem de Compartilhamento

Follow
3

Edit

Thiago Jorge Araujo
2 de jul. de 2025
1. Introdução
Procedimento para montagem automatizada de compartilhamentos NFS na Esteira DevOps. Esta automação interage diretamente com o Portal Infra.DevOps , com as VMs criadas pelo ADS e com o storage Dell Isilon.

Futuras versões incluirão interação com storages Huawei e montagem de automática em projetos OKD.

O sucesso da automação depende do cadastro correto realizado pelo usuário. Caso tenha dúvidas pergunte, não faça cadastros incompletos, pois pode prejudicar a implantação ou atualização do sistema.

Leia com atenção os avisos.

2. Avisos
A automação não cria o compartilhamento nos storages ou servidores NFS, ela habilita a utilização de um compartilhamento existente.
Antes de cadastrar um novo servidor, verifique se este já não está cadastrado. Essa ação evita duplicatas e inconsistências.
Compartilhamentos que utilizam servidores NFS (que não são storage) devem ter regras de firewall e de exports criadas. Neste caso, segue-se o procedimento tradicional.
3.Processo
Uma vez que tenha caminho a ser montado no servidor, o primeiro passo é cadastrar um Backend NFS no devops.caixa. O cadastro deve ser realizado criando as variáveis de NFS nas libraries do sistema.
Lembre que o disco já precisa ter sido solicitado por meio de WO à equipe de armazenamento através do FREI - Formulário de Requisição de Espaço em ISILON.docx e a mesma já ter sido atendida.

3.1. Cadastro de endpoint e mountpoint no ADS.
O cadastro de endpoint e mountpoint devem seguir a seguinte nomenclatura para o correto funcionamento da esteira:

Compartilhamento ISILON:
NFS_ENDPOINT_ISILON
NFS_MOUNT_POINT_ISILON
Segue abaixo um exemplo de cadastro no ADS:
image.png

Caso exista mais de um compartilhamento basta seguir a nomenclatura acima e acrescentar um número na variável, Ex: NFS_ENDPOINT_ISILON_2, NFS_ENDPOINT_ISILON_2, NFS_MOUNT_POINT_ISILON_3, NFS_MOUNT_POINT_ISILON_3, NFS_ENDPOINT_VM_2,NFS_MOUNT_POINT_VM_2.

Compartilhamento VM:

NFS_ENDPOINT_VM
NFS_MOUNT_POINT_VM
Segue abaixo um exemplo de cadastro no ADS:
image.png
Nomenclatura para servidores VM -> h6007v020.ad.caixa:/

4. Linkar Variable Groups Compartilhamentos.
compatilhamento.png

86 visits in last 30 days
Marcio Correia de Oliveira
commented 12 de mar. de 2024

O texto ficou dificíl de entender não tem um passo a passo, e confuso. Se puderem reescrever de forma sequencial.
Exemplo:

1 - Solicitar criação da VM via infra devops
2- Solicitar a criação do servidor NFS.
3- Solicitar a criação do compartilhamento NFS.


👍7

Collapsed

Expanded

Showing filters 1 through 6

Showing filters 1 through 6

Collapsed

Expanded

Showing filters 1 through 1

683 results found

79 results found

7 results found

Expanded

Collapsed
