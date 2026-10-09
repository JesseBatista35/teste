O valor no cofre é idêntico ao que estava na Library. Os dois são OI8OTCQC8nJPq9vi9psPgSScWu/6RbezD1o2KzlHETg=. Então os dados já cifrados no Oracle e no Redis continuam legíveis e não precisa de teste de regressão por troca de chave.
O arquivo não tem quebra de linha no final. O prompt sh-4.4$ aparece colado no valor, e o tamanho de 44 bytes bate com os 32 bytes da chave em Base64. Uma quebra de linha sobrando é causa comum de “chave inválida” e não ocorreu aqui.
Os 9 secrets estão no diretório e foram gravados às 18:38, na subida da 316, com nomes em maiúsculo, exatamente como os placeholders agora esperam.
O SICLI está como subdiretório, como previsto. Se algum dia a aplicação precisar do SICLI_APIKEY, o caminho tem que entrar no VAULT_LOCATION.

O SIINP-nucleo em DES está resolvido, sem override manual e com todas as credenciais vindo do cofre. Pendente apenas orientar o Lucas a seguir o mesmo padrão em DES2, TQS e TQS2: remover a env var e usar placeholders em maiúsculo.
