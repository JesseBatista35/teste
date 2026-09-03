Pessoal, bom dia! Alguns esclarecimentos:

Livia, essa configuração de proxy do CETEL não é pra estarção de trabalho/notebook — é uma configuração que precisa ser feita dentro do pod da API no OKD (variável de ambiente HTTP_PROXY/HTTPS_PROXY no DeploymentConfig). Não precisa mexer no proxy do Windows, pode deixar como está.

Wilson, a regra que foi liberada (REQ000145689716) se aplica apenas ao servidor/pod que hospeda o módulo do PGC na esteira DES (saída do namespace sipgc-des para login.microsoftonline.com). Não tem relação com o ambiente de IDE local de desenvolvimento — isso é só pro processo que roda no OKD.

Próximo passo: vamos abrir uma REQ para ajustar o DeploymentConfig dos três serviços (sipgc-api-agrupamento-des, sipgc-api-papel-des, sipgc-api-membros-des) incluindo as variáveis HTTP_PROXY/HTTPS_PROXY/NO_PROXY apontando para proxydes.caixa:80, conforme orientação do CETEL. Assim que abrir, compartilho o número aqui.
