sed -n '480,860p' $X | grep -inE "<name|restURLPath|header|cookie|SESSIONID|TOKEN|authoriz|extract" | grep -v "client_secret"
