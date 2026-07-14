find / -iname "*taccon*" 2>/dev/null
find / -iname "*dinamo*" -not -path "*/proc/*" 2>/dev/null
find / -iname "*.ini" -o -iname "*hsm*" 2>/dev/null | grep -v proc


env | grep -i hsm
env | grep -i dinamo
env | grep -i tac

find /opt -iname "*.properties" | xargs grep -li "hsm\|dinamo\|taccon" 2>/dev/null
