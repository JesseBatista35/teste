cara na verdade a demadna é pro ecapt-bancario  acabamos que resolvemos o problema do social.

o que tava acontecendo no infradevops as duas maquinas esavam com mesmo ip, na hora da variavel rodar ela pegar o mesmo ip.. o que eu fiz apageui no infrafaci le rodei a release
com vm destry true pra ele criar um novo apartir daqui o ecpa social pegou: caddeapllx2598.agil.nprd.caixa.gov.br



agora ta dano esse erro no setp terraform aply


2026-06-17T18:44:32.8319371Z vsphere_virtual_machine.vm["caddeapllx2598.agil.nprd.caixa.gov.br"] (remote-exec): apache:x:1001:1001:apache:/home/apache:/bin/bash
2026-06-17T18:44:32.8319789Z vsphere_virtual_machine.vm["caddeapllx2598.agil.nprd.caixa.gov.br"] (remote-exec): polkitd:x:990:990:User for polkitd:/:/sbin/nologin
2026-06-17T18:44:32.8320624Z vsphere_virtual_machine.vm["caddeapllx2598.agil.nprd.caixa.gov.br"] (remote-exec): rtkit:x:172:172:RealtimeKit:/:/sbin/nologin
2026-06-17T18:44:32.8320980Z vsphere_virtual_machine.vm["caddeapllx2598.agil.nprd.caixa.gov.br"] (remote-exec): geoclue:x:989:989:User for geoclue:/var/lib/geoclue:/sbin/nologin
2026-06-17T18:44:32.8321470Z vsphere_virtual_machine.vm["caddeapllx2598.agil.nprd.caixa.gov.br"] (remote-exec): pipewire:x:988:988:PipeWire System Daemon:/run/pipewire:/usr/sbin/nologin
2026-06-17T18:44:32.8321816Z vsphere_virtual_machine.vm["caddeapllx2598.agil.nprd.caixa.gov.br"] (remote-exec): flatpak:x:987:987:User for flatpak system helper:/:/sbin/nologin
2026-06-17T18:44:32.8351436Z vsphere_virtual_machine.vm["caddeapllx2598.agil.nprd.caixa.gov.br"] (remote-exec):   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-06-17T18:44:32.8352057Z vsphere_virtual_machine.vm["caddeapllx2598.agil.nprd.caixa.gov.br"] (remote-exec):                                  Dload  Upload   Total   Spent    Left  Speed
2026-06-17T18:44:32.8366146Z vsphere_virtual_machine.vm["caddeapllx2598.agil.nprd.caixa.gov.br"] (remote-exec):   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-06-17T18:44:32.8366499Z vsphere_virtual_machine.vm["caddeapllx2598.agil.nprd.caixa.gov.br"] (remote-exec): 100   883  100   883    0     0   862k      0 --:--:-- --:--:-- --:--:--  862k
2026-06-17T18:44:32.8488333Z vsphere_virtual_machine.vm["caddeapllx2598.agil.nprd.caixa.gov.br"] (remote-exec): Backup armazenado em /var/lib/authselect/backups/2026-06-17-18-44-32.TQASRI
2026-06-17T18:44:32.8488564Z vsphere_virtual_machine.vm["caddeapllx2598.agil.nprd.caixa.gov.br"]: Still creating... [7m20s elapsed]
2026-06-17T18:44:32.8770820Z vsphere_virtual_machine.vm["caddeapllx2598.agil.nprd.caixa.gov.br"] (remote-exec): Perfil "sssd" Foi selecionado.
2026-06-17T18:44:32.8771209Z vsphere_virtual_machine.vm["caddeapllx2598.agil.nprd.caixa.gov.br"] (remote-exec): Os seguintes mapas nsswitch são sobrescritos pelo perfil:
2026-06-17T18:44:32.8771490Z vsphere_virtual_machine.vm["caddeapllx2598.agil.nprd.caixa.gov.br"] (remote-exec): - passwd
2026-06-17T18:44:32.8771739Z vsphere_virtual_machine.vm["caddeapllx2598.agil.nprd.caixa.gov.br"] (remote-exec): - group
2026-06-17T18:44:32.8771983Z vsphere_virtual_machine.vm["caddeapllx2598.agil.nprd.caixa.gov.br"] (remote-exec): - netgroup
2026-06-17T18:44:32.8772227Z vsphere_virtual_machine.vm["caddeapllx2598.agil.nprd.caixa.gov.br"] (remote-exec): - automount
2026-06-17T18:44:32.8772678Z vsphere_virtual_machine.vm["caddeapllx2598.agil.nprd.caixa.gov.br"] (remote-exec): - services
2026-06-17T18:44:32.8772756Z 
2026-06-17T18:44:32.8773040Z vsphere_virtual_machine.vm["caddeapllx2598.agil.nprd.caixa.gov.br"] (remote-exec): Make sure that SSSD service is configured and enabled. See SSSD documentation for more information.
2026-06-17T18:44:32.8773165Z 
2026-06-17T18:44:32.8809809Z vsphere_virtual_machine.vm["caddeapllx2598.agil.nprd.caixa.gov.br"] (remote-exec): Created symlink /etc/systemd/system/multi-user.target.wants/oddjobd.service → /usr/lib/systemd/system/oddjobd.service.
2026-06-17T18:44:33.5932450Z vsphere_virtual_machine.vm["caddeapllx2598.agil.nprd.caixa.gov.br"] (remote-exec):  Teste o Openldap antes do reboot com o comando id axxxxxx
2026-06-17T18:44:33.5983965Z vsphere_virtual_machine.vm["caddeapllx2598.agil.nprd.caixa.gov.br"] (remote-exec): sed: não foi possível ler /etc/nslcd.conf: Arquivo ou diretório inexistente
2026-06-17T18:44:33.6769054Z vsphere_virtual_machine.vm["caddeapllx2598.agil.nprd.caixa.gov.br"]: Creation complete after 7m21s [id=4202db4a-ea78-1fe5-b3f9-6a61196b198b]
2026-06-17T18:44:35.0587327Z 
2026-06-17T18:44:35.0587840Z Apply complete! Resources: 1 added, 0 changed, 1 destroyed.
2026-06-17T18:44:35.0671082Z ##[error]Bash wrote one or more lines to the standard error stream.
2026-06-17T18:44:35.0672588Z ##[error][DEPRECATION WARNING]: [defaults]callback_whitelist option, normalizing names 
to new standard, use callbacks_enabled instead. This feature will be removed 
from ansible-core in version 2.15. Deprecation warnings can be disabled by 
setting deprecation_warnings=False in ansible.cfg.

2026-06-17T18:44:35.0673235Z ##[error][WARNING]: Unhandled error in Python interpreter discovery for host localhost:
Failed to connect to the host via ssh: ssh: connect to host localhost port 22:
Connection refused

2026-06-17T18:44:35.0680901Z ##[section]Finishing: Terraform apply


