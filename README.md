-sh-4.2$ echo "==MODULOS CARREGADOS==" &&
> /opt/jbcs-httpd24-2.4/httpd/sbin/apachectl -M 2>/dev/null &&
> echo "==CONF.D==" &&
> ls -la /opt/jbcs-httpd24-2.4/httpd/conf.d/
==MODULOS CARREGADOS==
Loaded Modules:
 core_module (static)
 so_module (static)
 http_module (static)
 access_compat_module (shared)
 actions_module (shared)
 alias_module (shared)
 allowmethods_module (shared)
 auth_basic_module (shared)
 auth_digest_module (shared)
 authn_anon_module (shared)
 authn_core_module (shared)
 authn_dbd_module (shared)
 authn_dbm_module (shared)
 authn_file_module (shared)
 authn_socache_module (shared)
 authz_core_module (shared)
 authz_dbd_module (shared)
 authz_dbm_module (shared)
 authz_groupfile_module (shared)
 authz_host_module (shared)
 authz_owner_module (shared)
 authz_user_module (shared)
 autoindex_module (shared)
 cache_module (shared)
 cache_disk_module (shared)
 data_module (shared)
 dbd_module (shared)
 deflate_module (shared)
 dir_module (shared)
 dumpio_module (shared)
 env_module (shared)
 expires_module (shared)
 ext_filter_module (shared)
 filter_module (shared)
 headers_module (shared)
 include_module (shared)
 info_module (shared)
 log_config_module (shared)
 logio_module (shared)
 mime_magic_module (shared)
 mime_module (shared)
 negotiation_module (shared)
 remoteip_module (shared)
 reqtimeout_module (shared)
 rewrite_module (shared)
 setenvif_module (shared)
 slotmem_plain_module (shared)
 slotmem_shm_module (shared)
 socache_dbm_module (shared)
 socache_memcache_module (shared)
 socache_shmcb_module (shared)
 status_module (shared)
 substitute_module (shared)
 suexec_module (shared)
 unique_id_module (shared)
 unixd_module (shared)
 userdir_module (shared)
 version_module (shared)
 vhost_alias_module (shared)
 watchdog_module (shared)
 usertrack_module (shared)
 request_module (shared)
 speling_module (shared)
 dav_module (shared)
 dav_fs_module (shared)
 dav_lock_module (shared)
 mpm_worker_module (shared)
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
 xml2enc_module (shared)
 proxy_html_module (shared)
 ssl_module (shared)
 systemd_module (shared)
 cgid_module (shared)
 ldap_module (shared)
 authnz_ldap_module (shared)
 session_module (shared)
 session_cookie_module (shared)
 session_dbd_module (shared)
 auth_form_module (shared)
 auth_kerb_module (shared)
 security2_module (shared)
==CONF.D==
total 92
drwxr-xr-x  2 apache apache  4096 Dez 10  2020 .
drwxr-xr-x 20 apache apache  4096 Abr 27  2022 ..
-rw-r--r--  1 apache apache   329 Dez 18  2019 manual.conf
-rw-r--r--  1 apache apache   379 Mar  5  2018 mod_bmx.conf.sample
-rw-r--r--  1 apache apache   671 Dez 18  2019 mod_cluster.conf.disabled
-rw-r--r--  1 apache apache   959 Abr  9  2018 mod_jk.conf.sample
-rw-r--r--  1 apache apache    40 Mar  5  2018 mod_rt.conf.sample
-rw-r--r--  1 apache apache  2303 Mai 10  2018 mod_security.conf.sample
-rw-r--r--  1 apache apache   509 Mai 31  2018 proxy_ajp.conf
-rw-r--r--  1 apache apache   366 Mai 31  2018 README
-rw-r--r--  1 apache apache 10348 Dez 18  2019 ssl.conf.disabled
-rw-r--r--  1 apache apache    90 Abr  9  2018 uriworkermap.properties.sample
-rw-r--r--  1 apache apache  1252 Mai 31  2018 userdir.conf
-rw-r--r--  1 apache apache   546 Mai  5  2020 welcome.conf
-rw-r--r--  1 apache apache   547 Jan 20  2020 .welcome.conf.20200120100130.a412811
-rw-r--r--  1 apache apache   546 Jan 20  2020 .welcome.conf.20200120100155.a412811
-rw-r--r--  1 apache apache   550 Jan 20  2020 .welcome.conf.20200120110115.a412811
-rw-r--r--  1 apache apache   644 Jan 20  2020 .welcome.conf.20200120110126.a412811
-rw-r--r--  1 apache apache   644 Jan 20  2020 .welcome.conf.20200120130137.a412811
-rw-r--r--  1 apache apache   546 Jan 20  2020 .welcome.conf.20200120130140.a412811
-rw-r--r--  1 apache apache   323 Abr  9  2018 workers.properties.sample
-sh-4.2$
