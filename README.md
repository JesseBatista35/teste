export LD_LIBRARY_PATH=/opt/ctmage/ctm/exe
ag_ping

Se ainda reclamar da lib, use o caminho real:

export LD_LIBRARY_PATH=/opt/ctmage/ctm/exe_9.0.19.200
ag_ping

O esperado é “Server is alive”.
