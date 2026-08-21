getent passwd 20003846
# ou, se não retornar (usuário de domínio/AD):
id 20003846 2>/dev/null
grep 20003846 /etc/passwd

# Ver mais contexto da sessão (login, tty, horário de entrada)
ausearch -ui 20003846 --start today | grep -i "acct=\|USER_LOGIN\|USER_START" | tail -20
