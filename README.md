Ao iniciar, a rotina RSADB001 do SIRSA precisa se conectar ao SSO da Caixa (login.des.caixa). Para essa conexão ser aceita, a aplicação lê um arquivo de certificados que fica no servidor e indica que o certificado do SSO é confiável.

Esse arquivo é instalado pela esteira com acesso restrito ao usuário do Control-M, que executa a rotina no fluxo normal. Como a execução foi feita manualmente com o usuário f517263, a aplicação não conseguiu ler o arquivo. Sem ele, usou os certificados padrão do Java, que não reconhecem os certificados internos da Caixa, e ocorreu o erro de certificado.

O que foi feito

Liberamos a leitura do arquivo de certificados para o usuário f517263, sem alterar o acesso do Control-M.
Confirmamos que o usuário consegue ler o arquivo e que ele contém os certificados corretos para o SSO.
Removemos do grupo de variáveis SIRSA-batch-tqs a variável JAVA_TOOL_OPTIONS, que apontava para um arquivo de certificados na pasta pessoal do usuário e não era necessária.
Realizamos um novo deploy e validamos que a permissão se manteve.

Próximos passos
Favor executar a rotina novamente e validar. Caso o erro volte a ocorrer, favor nos acionar
