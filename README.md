
-sh-4.2$
-sh-4.2$ oc rsh siorf-backend-tqs-123-c7d5w ls -la /siorf/Convenio/
ls: cannot access /siorf/Convenio/: No such file or directory
command terminated with exit code 2
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc rsh siorf-backend-tqs-123-c7d5w stat /siorf/Convenio/Resultado
stat: cannot stat '/siorf/Convenio/Resultado': No such file or directory
command terminated with exit code 1
-sh-4.2$ oc rsh siorf-backend-tqs-123-c7d5w stat /siorf/Convenio/Processar
stat: cannot stat '/siorf/Convenio/Processar': No such file or directory
command terminated with exit code 1
-sh-4.2$
