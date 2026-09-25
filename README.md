env | grep JAVA_OPTIONS_APPEND

tr '\0' ' ' < /proc/1/cmdline | grep -o 'javaagent[^ ]*'
