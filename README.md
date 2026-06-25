- task: Bash@3
  displayName: 'Prepare Tests - Install Chromium'
  inputs:
    targetType: inline
    script: |
      set -e
      
      echo "==== Instalando Chromium (RHEL 7) ===="
      yum install -y chromium
      
      echo "==== Instalando karma-chrome-launcher ===="
      npm install --save-dev karma-chrome-launcher
      
      echo "==== Configurando Chrome ===="
      export CHROME_BIN=/usr/bin/chromium-browser
      
      echo "==== Rodando testes ===="
      npm test
