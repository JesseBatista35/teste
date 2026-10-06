grep -n -B20 -A3 "<keepParamName" $X | grep -E "keepParamName|elementPath|extractFrom|regex|Header|cookie" 
grep -n "SESSIONID" $X
