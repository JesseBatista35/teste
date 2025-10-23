<?php
//script para testar regra de firewall fiva client oc.
/*
1 - usa-se && entre comandos sequenciais
2 - usar escapeshellarg() nos argumentos enviados pelo usuario para nao permitir injeção de comandos.
*/
 
if(strtoupper(substr(PHP_OS, 0,3)) == 'WIN'){
    //funcao para windows
   $output=null;
$retval=null;
exec('.\oc.exe login --token', $output, $retval);
echo "Retornou com estado $retval e saída:\n";
exec('.\oc.exe get pods --namespace=default', $output, $retval);
exec('.\oc.exe logout', $output, $retval);
print_r($output);
}else{
    //funcao para linux
 
 
oc get netNamespace - listar namespaces e egress ip
 
oc run -n {{projeto selecionado pelo usuário}} {{nome do pod sugerido: infrafacil}} --image={{imagem a ser definida}} --restart=Never - criar pod no namespace selecionado pelo usuário
 
oc exec -n {{namespace}} {{pod criado}} -- /bin/sh -c 'curl -t "DUMMY=1" -s --connect-timeout 2 telnet://{{destino}}:{{porta}} </dev/null >/dev/null 2>&1; echo $?' - rodar comando para testar regra dentro do pod criado
 
oc delete pod {{nome do pod sugerido: infrafacil}} -n {{projeto selecionado pelo usuário}} - deletar o pod criado para o teste
 
