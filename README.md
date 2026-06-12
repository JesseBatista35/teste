# AUMENTAR CPU DE 4 PARA 10 CORES
oc patch resourcequota quota-resources -n sicia-tqs -p \
  '{"spec":{"hard":{"limits.cpu":"10"}}}' --type merge

# AUMENTAR MEMORIA TAMBÉM (de 8Gi para 16Gi)
oc patch resourcequota quota-resources -n sicia-tqs -p \
  '{"spec":{"hard":{"limits.memory":"16Gi"}}}' --type merge

# AUMENTAR POD LIMIT (de 8 para 20)
oc patch resourcequota quota-resources -n sicia-tqs -p \
  '{"spec":{"hard":{"pods":"20"}}}' --type merge

# VERIFICAR DEPOIS
oc describe resourcequota quota-resources -n sicia-tqs
