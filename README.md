#!/bin/bash
echo "===== HEXDUMP DAS VARIAVEIS (checando espaços/quebras ocultas) ====="
echo -n "KIND_DEPLOY=[$(KIND_DEPLOY)]" | xxd | tail -5
echo -n "resource_app=[$(resource_app)]" | xxd | tail -5
echo "======================================================================"

echo ""
echo "===== EXECUTANDO O COMANDO REAL (com trace) ====="
set -x
oc set env $(KIND_DEPLOY) "$(resource_app)" -n $(PROJETO)-$(AMBIENTE) --list -c "$(resource_app)"
set +x
echo "=================================================="
