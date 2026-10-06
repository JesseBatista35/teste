sed -n '245,300p' $X | grep -vE "^\s*$" | grep -v client_secret
