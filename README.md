
-sh-4.1$ sudo awk '/<profile name=/{p=$0} /secure-deployment name="ccr-api/{s=1; print NR": "p} s && /<realm>|<resource>|auth-server-url|bearer-only/{print NR":   "$0} s && /<\/secure-deployment>/{s=0}' /opt/jboss/jboss-eap/dc/configuration/domain.xml | sed 's/^ *//' | cut -c1-150
[sudo] password for p585600:
20560:         <profile name="full-ha-sifec-intranet">
20561:                       <realm>internet</realm>
20562:                       <resource>cli-ser-fec_api</resource>
20563:                       <bearer-only>true</bearer-only>
22204:         <profile name="full-ha-sifec-intranet2">
22205:                       <realm>internet</realm>
22206:                       <resource>cli-ser-fec_api</resource>
22207:                       <bearer-only>true</bearer-only>
23850:         <profile name="full-ha-sifec-intranet3">
23851:                       <realm>internet</realm>
23852:                       <resource>cli-ser-fec_api</resource>
23853:                       <bearer-only>true</bearer-only>
25500:         <profile name="full-ha-sifec-intranet4">
25501:                       <realm>internet</realm>
25502:                       <resource>cli-ser-fec_api</resource>
25503:                       <bearer-only>true</bearer-only>
27144:         <profile name="full-ha-sifec-intranet5">
27145:                       <realm>internet</realm>
27146:                       <resource>cli-ser-fec_api</resource>
27147:                       <bearer-only>true</bearer-only>
28610:         <profile name="full-ha-sifec-batch">
28611:                       <realm>internet</realm>
28612:                       <resource>cli-ser-fec_api</resource>
28613:                       <bearer-only>true</bearer-only>
52746:         <profile name="full-ha-sifec-api">
52747:                       <realm>internet</realm>
52748:                       <resource>cli-ser-fec_api</resource>
52749:                       <bearer-only>true</bearer-only>
-sh-4.1$
-sh-4.1$
-sh-4.1$
-sh-4.1$
-sh-4.1$ sudo grep -n -E 'deployment name="SIFEC-CCR[0-9]*"' /opt/jboss/jboss-eap/dc/configuration/domain.xml
56855:        <deployment name="SIFEC-CCR4" runtime-name="SIFEC-CCR-4.24.1-b4437.ear">
56963:        <deployment name="SIFEC-CCR2" runtime-name="SIFEC-CCR-6.5.0-b4597.ear">
56987:        <deployment name="SIFEC-CCR3" runtime-name="SIFEC-CCR-6.5.0-b4605.ear">
56996:        <deployment name="SIFEC-CCR5" runtime-name="SIFEC-CCR-6.5.0-b4606.ear">
57005:        <deployment name="SIFEC-CCR" runtime-name="SIFEC-CCR-6.4.0-b4607.ear">
57759:                <deployment name="SIFEC-CCR" runtime-name="SIFEC-CCR-6.4.0-b4607.ear"/>
58083:                <deployment name="SIFEC-CCR2" runtime-name="SIFEC-CCR-6.5.0-b4597.ear"/>
58387:                <deployment name="SIFEC-CCR3" runtime-name="SIFEC-CCR-6.5.0-b4605.ear"/>
58686:                <deployment name="SIFEC-CCR4" runtime-name="SIFEC-CCR-4.24.1-b4437.ear"/>
58993:                <deployment name="SIFEC-CCR5" runtime-name="SIFEC-CCR-6.5.0-b4606.ear"/>
-sh-4.1$
