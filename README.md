

-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc delete pod sijur-middleware-backend-v2-des-35-debug -n sijur-des
pod "sijur-middleware-backend-v2-des-35-debug" deleted
-sh-4.2$ unzip -p sijur-v2-35.jar 'BOOT-INF/lib/SIJUR-componentes-1.0.25-SNAPSHOT.jar' > sijur-componentes.jar
[1]+  Concluído              oc debug rc/sijur-middleware-backend-v2-des-35 -n sijur-des -- sleep 900 > /tmp/debug.log 2>&1
-sh-4.2$ unzip -l sijur-componentes.jar | grep -i 'model/Log'
     2987  09-11-2026 08:57   br/com/sijur/componentes/model/Log$LogBuilder.class
     7794  09-11-2026 08:57   br/com/sijur/componentes/model/Log.class
-sh-4.2$ unzip -p sijur-componentes.jar 'br/com/sijur/componentes/model/Log.class' | grep -a -o -E '(javax|jakarta)/persistence/[A-Za-z]+' | sort -u
javax/persistence/Column
javax/persistence/Entity
javax/persistence/GeneratedValue
javax/persistence/GenerationType
javax/persistence/Id
javax/persistence/Table
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ unzip -l sijur-v2-35.jar | grep -i -E 'persistence-api|javax.persistence|jakarta.persistence'
   165250  02-25-2022 11:15   BOOT-INF/lib/jakarta.persistence-api-3.1.0.jar
-sh-4.2$
-sh-4.2$
-sh-4.2$
