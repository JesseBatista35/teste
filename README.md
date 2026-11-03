Unable to connect due to unrecognised server certificate
Subject    - CN=eap74-nprd.des.caixa,O=Caixa Economica Federal,C=BR
Issuer     - CN=AC Icptestes Sub, O=Caixa Economica Federal, C=BR
Valid From - Wed Sep 09 09:35:28 BRT 2026
Valid To   - Tue Sep 09 09:45:28 BRT 2031
MD5 : af:90:b6:9c:29:3f:be:83:ff:5f:ec:ff:10:bb:14:93
SHA1 : 3b:40:fb:23:dc:e4:77:e9:1a:74:f0:f9:c6:46:65:94:ba:27:be:48

Accept certificate? [N]o, [T]emporarily, [P]ermanently : p
[domain@localhost:9443 /]
[domain@localhost:9443 /]
[domain@localhost:9443 /]
[domain@localhost:9443 /] /host=*/server-config=*:read-attribute(name=status)
{
    "outcome" => "success",
    "result" => [
        {
            "address" => [
                ("host" => "hc_cbrdeapllx473"),
                ("server-config" => "sifec-intranet2_node1_llx473")
            ],
            "outcome" => "success",
            "result" => "STARTED"
        },
        {
            "address" => [
                ("host" => "hc_cbrdeapllx473"),
                ("server-config" => "sifec-intranet_node1_lx473")
            ],
            "outcome" => "success",
            "result" => "STARTED"
        },
        {
            "address" => [
                ("host" => "hc_cbrdeapllx472"),
                ("server-config" => "sifec-intranet_node1_lx472")
            ],
            "outcome" => "success",
            "result" => "STOPPED"
        },
        {
            "address" => [
                ("host" => "hc_cbrdeapllx465"),
                ("server-config" => "siemp_node1_lx465")
            ],
            "outcome" => "success",
            "result" => "STARTED"
        },
        {
            "address" => [
                ("host" => "hc_cbrdeapllx409"),
                ("server-config" => "sipen_node1_DES_llx409")
            ],
            "outcome" => "success",
            "result" => "STARTED"
        }
    ]
}

[domain@localhost:9443 /]


