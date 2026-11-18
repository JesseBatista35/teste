Achar a configuração no 6.4

O ls não achou porque o caminho no 6.4 é outro. Vamos descobrir pelo processo, no 10.116.88.20 como root:

bash
ps -ef | grep -oE 'jboss\.home\.dir=[^ ]+|jboss\.domain\.[a-z.]*dir=[^ ]+' | sort -u

Me mande a saída que eu monto o grep com o caminho certo.

Se demorar para achar, a correção padrão para esse caso é:

idle-timeout-minutes (por exemplo, 5 minutos), para fechar a conexão parada antes de o IDMS derrubá-la;
validação na hora de entregar a conexão.

Mas prefiro copiar o que está no 6.4, porque lá funciona há anos e o driver IDMS pode exigir um SQL de validação específico.

Como o Claude está se saindo nesta sessão?
