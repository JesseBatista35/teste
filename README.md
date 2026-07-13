#!/bin/bash
echo "===== TESTANDO BLOCO 3 (overwrite) ====="
echo "Enviroment (raw) = [$(Enviroment)]"
echo ""
echo "Comando que seria montado:"
echo "oc set env $(Enviroment) $(KIND_DEPLOY) \"$(resource_app)\" -c \"$(resource_app)\" --overwrite=true -n $(PROJETO)-$(AMBIENTE)"
echo ""
set -x
if [[ -n '$(Enviroment)' ]]; then 
   oc set env $(Enviroment) $(KIND_DEPLOY) "$(resource_app)" -c "$(resource_app)" --overwrite=true -n $(PROJETO)-$(AMBIENTE)
fi
set +x
echo "=========================================="
