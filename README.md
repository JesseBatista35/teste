#!/bin/bash
# Script para verificar qual VM está ativa e em uso
# Uso: ./verificar_vms.sh

set -e

echo "╔════════════════════════════════════════════════════════════════╗"
echo "║  ANÁLISE DE VMs DUPLICADAS - CADDEAPLLX2520 vs CADDEAPLLX2673  ║"
echo "╚════════════════════════════════════════════════════════════════╝"
echo ""

VM1="caddeapllx2520.agil.nprd.caixa.gov.br"
VM2="caddeapllx2673.agil.nprd.caixa.gov.br"
IP="10.116.201.129"

# Cores
RED='\033[0;31m'
GREEN='\033[0;32m'
YELLOW='\033[1;33m'
BLUE='\033[0;34m'
NC='\033[0m' # No Color

check_connectivity() {
    local vm=$1
    local name=$2
    
    echo -e "${BLUE}─── Verificando: $name ($vm) ───${NC}"
    
    # Teste de ping
    if timeout 2 ping -c 1 "$vm" &>/dev/null; then
        echo -e "${GREEN}✓${NC} Ping: OK"
        ping_ok=1
    else
        echo -e "${RED}✗${NC} Ping: FALHOU"
        ping_ok=0
    fi
    
    # Teste SSH
    if timeout 5 ssh -o StrictHostKeyChecking=no -o ConnectTimeout=2 "root@$vm" "hostname" &>/dev/null; then
        echo -e "${GREEN}✓${NC} SSH: Acessível"
        ssh_ok=1
    else
        echo -e "${RED}✗${NC} SSH: Indisponível"
        ssh_ok=0
    fi
    
    if [ $ssh_ok -eq 1 ]; then
        # Verificar status JBoss
        jboss_status=$(ssh -o StrictHostKeyChecking=no "root@$vm" "systemctl is-active jboss" 2>/dev/null || echo "unknown")
        if [ "$jboss_status" = "active" ]; then
            echo -e "${GREEN}✓${NC} JBoss: RODANDO"
        else
            echo -e "${YELLOW}⚠${NC} JBoss: $jboss_status"
        fi
        
        # Verificar Apache
        apache_status=$(ssh -o StrictHostKeyChecking=no "root@$vm" "systemctl is-active apache2" 2>/dev/null || echo "unknown")
        if [ "$apache_status" = "active" ]; then
            echo -e "${GREEN}✓${NC} Apache: RODANDO"
        else
            echo -e "${YELLOW}⚠${NC} Apache: $apache_status"
        fi
        
        # Verificar uptime
        uptime=$(ssh -o StrictHostKeyChecking=no "root@$vm" "uptime -p" 2>/dev/null || echo "N/A")
        echo -e "${BLUE}℃${NC} Uptime: $uptime"
        
        # Verificar processos JBoss
        jboss_procs=$(ssh -o StrictHostKeyChecking=no "root@$vm" "ps aux | grep -i jboss | grep -v grep | wc -l" 2>/dev/null || echo "0")
        echo -e "${BLUE}℃${NC} Processos JBoss: $jboss_procs"
        
        # Verificar mount NFS
        nfs_mounts=$(ssh -o StrictHostKeyChecking=no "root@$vm" "mount | grep nfs | wc -l" 2>/dev/null || echo "0")
        echo -e "${BLUE}℃${NC} Mounts NFS: $nfs_mounts"
    fi
    
    echo ""
}

check_port_443() {
    echo -e "${BLUE}─── Teste de Porta 443 ───${NC}"
    if timeout 2 nc -zv "$IP" 443 &>/dev/null; then
        echo -e "${GREEN}✓${NC} Porta 443: ABERTA"
    else
        echo -e "${RED}✗${NC} Porta 443: FECHADA (conforme REQ000144492006)"
    fi
    echo ""
}

check_dns() {
    echo -e "${BLUE}─── Verificação de DNS ───${NC}"
    
    dns1=$(nslookup "$VM1" 2>/dev/null | grep "Address:" | tail -1 | awk '{print $2}' || echo "FALHOU")
    dns2=$(nslookup "$VM2" 2>/dev/null | grep "Address:" | tail -1 | awk '{print $2}' || echo "FALHOU")
    
    echo "DNS $VM1 → $dns1"
    echo "DNS $VM2 → $dns2"
    
    if [ "$dns1" = "$dns2" ]; then
        echo -e "${RED}✗ PROBLEMA: Ambos resolvem para o mesmo IP!${NC}"
    fi
    echo ""
}

check_load_balancer() {
    echo -e "${BLUE}─── Teste Load Balancer ───${NC}"
    echo "Testando HTTPS com certificado APT-BANCARIO..."
    
    if timeout 5 curl -k -v https://apt-bancario.tqs.caixa/ &>/dev/null; then
        echo -e "${GREEN}✓${NC} Load Balancer: Respondendo"
    else
        echo -e "${RED}✗${NC} Load Balancer: Não respondendo"
    fi
    echo ""
}

check_filesystem() {
    local vm=$1
    local name=$2
    
    echo -e "${BLUE}─── Espaço em Disco: $name ───${NC}"
    
    if timeout 5 ssh -o StrictHostKeyChecking=no "root@$vm" "df -h / /opt /var" 2>/dev/null; then
        echo ""
    else
        echo -e "${RED}Não foi possível verificar.${NC}"
        echo ""
    fi
}

# Execução
echo "Iniciando verificações em ambas as VMs..."
echo ""

check_connectivity "$VM1" "CADDEAPLLX2520 (SOCIAL)"
check_connectivity "$VM2" "CADDEAPLLX2673 (BANCARIO)"

check_dns
check_port_443

echo -e "${BLUE}═══════════════════════════════════════════════════════════════${NC}"
echo -e "${YELLOW}RESUMO E RECOMENDAÇÃO:${NC}"
echo -e "${BLUE}═══════════════════════════════════════════════════════════════${NC}"
echo ""
echo "Baseado na documentação do deployment:"
echo "  • Pipeline ECAPT-BANCARIO-TQS criou: CADDEAPLLX2673"
echo "  • CADDEAPLLX2520 é para ECAPT-SOCIAL-TQS"
echo ""
echo -e "${GREEN}RECOMENDAÇÃO: Manter CADDEAPLLX2673 (BANCARIO)${NC}"
echo -e "${RED}DELETAR: CADDEAPLLX2520 (SOCIAL)${NC}"
echo ""
echo "⚠️  ANTES DE DELETAR:"
echo "   1. Confirme que os serviços acima estão OK em CADDEAPLLX2673"
echo "   2. Faça backup de CADDEAPLLX2520"
echo "   3. Consulte responsável pela aplicação SOCIAL-TQS"
echo ""
