
unzip -p sijur-v2-35.jar 'BOOT-INF/lib/SIJUR-componentes-1.0.25-SNAPSHOT.jar' > sijur-componentes.jar
unzip -l sijur-componentes.jar | grep -i 'model/Log'
unzip -p sijur-componentes.jar 'br/com/sijur/componentes/model/Log.class' | grep -a -o -E '(javax|jakarta)/persistence/[A-Za-z]+' | sort -u


unzip -l sijur-v2-35.jar | grep -i -E 'persistence-api|javax.persistence|jakarta.persistence'

