ng run sdsc:build-storybook --output-dir=dist && npm test -- --no-watch --coverage


# 1. Ver como a cota está hoje e se é gerenciada por algum operador ou template
oc get resourcequota quota-resources -n sidsc-des -o yaml

# 2. Aumentar memória e CPU
oc patch resourcequota quota-resources -n sidsc-des --type merge \
  -p '{"spec":{"hard":{"limits.memory":"8Gi","limits.cpu":"8"}}}'

# 3. Conferir
oc describe quota quota-resources -n sidsc-des
