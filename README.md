*********************************************************************
End of banner message from server
Keyboard-interactive authentication prompts from server:
| Verification code:
End of keyboard-interactive prompts from server
    ┌──────────────────────────────────────────────────────────────────────┐
    │               • MobaXterm Professional Edition v24.2 •               │
    │               (SSH client, X server and network tools)               │
    │                                                                      │
    │ ⮞ SSH session to p585600@10.122.150.31                               │
    │   • Direct SSH      :  ✓                                             │
    │   • SSH compression :  ✓                                             │
    │   • SSH-browser     :  ✓                                             │
    │   • X11-forwarding  :  ✓  (remote display is forwarded through SSH)  │
    │                                                                      │
    │ ⮞ For more info, ctrl+click on help or visit our website.            │
    └──────────────────────────────────────────────────────────────────────┘

Last login: Tue Nov  3 10:02:16 2026 from 10.111.14.33
[p585600@cadsvitrlx100 ~]$ ssh 10.116.82.43
The authenticity of host '10.116.82.43 (10.116.82.43)' can't be established.
ED25519 key fingerprint is SHA256:NzkgMlqQ9kvH3F3VTiSAMVbiQFAqKKDdc6E1T45NVUY.
This host key is known by the following other names/addresses:
    ~/.ssh/known_hosts:8: 10.116.94.221
    ~/.ssh/known_hosts:10: 10.116.94.206
    ~/.ssh/known_hosts:49: 10.116.89.0
    ~/.ssh/known_hosts:107: 10.116.94.211
    ~/.ssh/known_hosts:113: 10.116.94.212
    ~/.ssh/known_hosts:155: 10.116.94.210
Are you sure you want to continue connecting (yes/no/[fingerprint])? yes
Warning: Permanently added '10.116.82.43' (ED25519) to the list of known hosts.
***********************************************************************
(1) - Este e um computador privado de propriedade da Caixa Economica
Federal. Usuarios autorizados e nao autorizados nao possuem direitos de
divulgar as informacoes contidas aqui.
(2) - Ao fazer uso do sistema, o usuario esta ciente que pode estar
sendo monitorado, interceptado e auditado pelo departamento competente
da Caixa Economica Federal.
(3) - O uso nao autorizado ou improprio deste sistema pode resultar em
um processo disciplinar administrativo e/ou punicao atraves de acoes
civis ou criminais. Ao continuar o uso deste sistema, indica que voce
esta ciente e concordando com os termos e condicoes acima descritos.

Pressione <Control+D> IMEDIATAMENTE se voce nao concorda com as
condicoes deste aviso
***********************************************************************
p585600@10.116.82.43's password:
Creating home directory for p585600.
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$  /server-group=sigec-portabilidade-batch:read-attribute(name=profile)
-sh: syntax error near unexpected token `name=profile'
-sh-4.2$
-sh-4.2$
-sh-4.2$  /server-group=sigec-portabilidade-batch:read-attribute(name=profile)
-sh: syntax error near unexpected token `name=profile'
-sh-4.2$
-sh-4.2$
-sh-4.2$ /server-group=sigec-portabilidade2:read-attribute(name=profile)
-sh: syntax error near unexpected token `name=profile'
-sh-4.2$    /profile=<perfil>/subsystem=modcluster:read-resource(recursive=true)
-sh: syntax error near unexpected token `('
-sh-4.2$    /profile=<perfil>/subsystem=undertow/server=default-server/host=default-host:read-attribute(name=alias)
-sh: syntax error near unexpected token `('
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ curl -vk --resolve sigec.des.caixa:443:10.116.78.14 https://sigec.des.caixa/<contexto>/
-sh: contexto: No such file or directory
-sh-4.2$





Last login: Tue Nov  3 09:18:20 2026 from 10.111.14.33
[p585600@cadsvitrlx100 ~]$ ssh 10.116.78.14
The authenticity of host '10.116.78.14 (10.116.78.14)' can't be established.
ED25519 key fingerprint is SHA256:4KTbGun90zU6LwmTUGfb5C01N+fU8TW+klOMtKiAZBk.
This key is not known by any other names
Are you sure you want to continue connecting (yes/no/[fingerprint])? yes
Warning: Permanently added '10.116.78.14' (ED25519) to the list of known hosts.
***********************************************************************
(1) - Este e um computador privado de propriedade da Caixa Economica
Federal. Usuarios autorizados e nao autorizados nao possuem direitos de
divulgar as informacoes contidas aqui.
(2) - Ao fazer uso do sistema, o usuario esta ciente que pode estar
sendo monitorado, interceptado e auditado pelo departamento competente
da Caixa Economica Federal.
(3) - O uso nao autorizado ou improprio deste sistema pode resultar em
um processo disciplinar administrativo e/ou punicao atraves de acoes
civis ou criminais. Ao continuar o uso deste sistema, indica que voce
esta ciente e concordando com os termos e condicoes acima descritos.

Pressione <Control+D> IMEDIATAMENTE se voce nao concorda com as
condicoes deste aviso
***********************************************************************
p585600@10.116.78.14's password:
[p585600@caddeapllx2794 ~]$
[p585600@caddeapllx2794 ~]$
[p585600@caddeapllx2794 ~]$
[p585600@caddeapllx2794 ~]$ httpd -S
(13)Permission denied: AH00086: httpd: could not open error log file /opt/httpd/logs/httpd.log.
[Tue Nov 03 10:02:55.696183 2026] [so:warn] [pid 4146302:tid 4146302] AH01574: module proxy_module is already loaded, skipping
[Tue Nov 03 10:02:55.696282 2026] [so:warn] [pid 4146302:tid 4146302] AH01574: module slotmem_shm_module is already loaded, skipping
[Tue Nov 03 10:02:55.698192 2026] [so:warn] [pid 4146302:tid 4146302] AH01574: module proxy_cluster_module is already loaded, skipping
[Tue Nov 03 10:02:55.698250 2026] [so:warn] [pid 4146302:tid 4146302] AH01574: module cluster_slotmem_module is already loaded, skipping
[Tue Nov 03 10:02:55.698279 2026] [so:warn] [pid 4146302:tid 4146302] AH01574: module manager_module is already loaded, skipping
[Tue Nov 03 10:02:55.698312 2026] [so:warn] [pid 4146302:tid 4146302] AH01574: module advertise_module is already loaded, skipping
VirtualHost configuration:
10.116.78.14:6666      MODCLUSTER.CAIXA (/opt/httpd/conf.d/mod_cluster.conf:15)
*:80                   is a NameVirtualHost
         default server sigec-comercial.des.caixa (/opt/httpd/conf.d/httpd-sigec-comercial.conf:2)
         port 80 namevhost sigec-comercial.des.caixa (/opt/httpd/conf.d/httpd-sigec-comercial.conf:2)
         port 80 namevhost sigec-csc.des.caixa (/opt/httpd/conf.d/httpd-sigec-csc.conf:2)
         port 80 namevhost sigec.des.caixa (/opt/httpd/conf.d/httpd-sigec.des.conf:4)
                 alias sigec.des.caixa
         port 80 namevhost sigecpor2.des.caixa (/opt/httpd/conf.d/httpd-sigecpor2.conf:3)
                 alias sigecpor2.des.caixa
ServerRoot: "/opt/httpd"
Main DocumentRoot: "/opt/httpd/www/html"
Main ErrorLog: "/opt/httpd/logs/error_log"
Mutex authdigest-opaque: using_defaults
Mutex watchdog-callback: using_defaults
Mutex rewrite-map: using_defaults
Mutex ssl-stapling-refresh: using_defaults
Mutex authdigest-client: using_defaults
Mutex ssl-stapling: using_defaults
Mutex proxy: using_defaults
Mutex ldap-cache: using_defaults
Mutex authn-socache: using_defaults
Mutex ssl-cache: using_defaults
Mutex default: dir="/opt/httpd/run/" mechanism=default
PidFile: "/opt/httpd/run/httpd.pid"
Define: DUMP_VHOSTS
Define: DUMP_RUN_CFG
Define: MODSEC_2.5
Define: MODSEC_2.9
User: name="apache" id=891 not_used
Group: name="apache" id=30000435 not_used
[p585600@caddeapllx2794 ~]$
[p585600@caddeapllx2794 ~]$
[p585600@caddeapllx2794 ~]$
[p585600@caddeapllx2794 ~]$
[p585600@caddeapllx2794 ~]$ httpd -M | grep -Ei 'cluster|jk|proxy'
(13)Permission denied: AH00086: httpd: could not open error log file /opt/httpd/logs/httpd.log.
[Tue Nov 03 10:03:06.089042 2026] [so:warn] [pid 4146306:tid 4146306] AH01574: module proxy_module is already loaded, skipping
[Tue Nov 03 10:03:06.089089 2026] [so:warn] [pid 4146306:tid 4146306] AH01574: module slotmem_shm_module is already loaded, skipping
[Tue Nov 03 10:03:06.091035 2026] [so:warn] [pid 4146306:tid 4146306] AH01574: module proxy_cluster_module is already loaded, skipping
[Tue Nov 03 10:03:06.091055 2026] [so:warn] [pid 4146306:tid 4146306] AH01574: module cluster_slotmem_module is already loaded, skipping
[Tue Nov 03 10:03:06.091065 2026] [so:warn] [pid 4146306:tid 4146306] AH01574: module manager_module is already loaded, skipping
[Tue Nov 03 10:03:06.091072 2026] [so:warn] [pid 4146306:tid 4146306] AH01574: module advertise_module is already loaded, skipping
 proxy_module (shared)
 proxy_connect_module (shared)
 proxy_express_module (shared)
 proxy_fcgi_module (shared)
 proxy_fdpass_module (shared)
 proxy_ftp_module (shared)
 proxy_http_module (shared)
 proxy_scgi_module (shared)
 proxy_wstunnel_module (shared)
 proxy_ajp_module (shared)
 proxy_html_module (shared)
 cluster_slotmem_module (shared)
 proxy_cluster_module (shared)
 proxy_http2_module (shared)
[p585600@caddeapllx2794 ~]$
[p585600@caddeapllx2794 ~]$
[p585600@caddeapllx2794 ~]$
[p585600@caddeapllx2794 ~]$
[p585600@caddeapllx2794 ~]$
[p585600@caddeapllx2794 ~]$ grep -RniE 'ProxyPass|BalancerMember|balancer://|JkMount|ManagerBalancerName|EnableMCPMReceive|ServerAdvertise|AdvertiseGroup' /etc/httpd/conf /etc/httpd/conf.dgrep: /etc/httpd/conf: No such file or directory
grep: /etc/httpd/conf.d: No such file or directory
[p585600@caddeapllx2794 ~]$
[p585600@caddeapllx2794 ~]$
[p585600@caddeapllx2794 ~]$
[p585600@caddeapllx2794 ~]$
[p585600@caddeapllx2794 ~]$

<img width="1891" height="948" alt="image" src="https://github.com/user-attachments/assets/d6e309d6-0ab6-4231-901a-537beb71df84" />

