Pessoal, bom dia!

O desbloqueio funcionou (não aparece mais ORA-28000), mas agora ao subir o JBoss aparece um novo erro na conexão do KeycloakDS:

ORA-01017: invalid username/password; logon denied

A senha desse usuário (SSO_TQS_LOGX) está guardada de forma criptografada no Vault do JBoss desse servidor. Se durante o desbloqueio a senha também foi alterada/resetada, preciso que me passem a senha nova em texto para regerar a entrada no Vault - a senha antiga não funciona mais.

A senha do SSO_TQS_LOGX foi alterada nesse processo?
