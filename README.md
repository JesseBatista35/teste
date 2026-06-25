- task: Bash@3
  displayName: 'Detectar SO do Agente'
  inputs:
    targetType: inline
    script: |
      echo "=== Detectando SO ==="
      cat /etc/os-release || cat /etc/issue || uname -a
      
      echo "=== Testando package managers ==="
      command -v apt-get && echo "Distro: Debian/Ubuntu (apt-get)"
      command -v yum && echo "Distro: CentOS/RHEL (yum)"
      command -v apk && echo "Distro: Alpine (apk)"
      command -v pacman && echo "Distro: Arch (pacman)"
      
      echo "=== Testando browsers ==="
      which firefox && echo "Firefox já instalado"
      which chromium && echo "Chromium já instalado"
      which google-chrome && echo "Chrome já instalado"
