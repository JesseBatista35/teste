
-sh-4.1$
-sh-4.1$
-sh-4.1$ CLI="sudo /opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=10.116.88.20:9999"; for h in $($CLI --command="ls /host"); do $CLI --command="/host=$h:read-children-resources(child-type=server-config)" | grep -B3 '"group" => "sifec-intranet5"' | grep -oE '"[a-z0-9_-]+" => \{' | sed "s/^/$h: /"; done
azure_teste_dr_sbrdeapllx067: "sifec-intranet5_lx0067" => {
-sh-4.1$ ^C
-sh-4.1$ ^C
-sh-4.1$





-sh-4.1$
-sh-4.1$ hostname -f
sbrdeapllx067.extra.caixa.gov.br
-sh-4.1$
-sh-4.1$
-sh-4.1$




networks
hosts
      networks VLANs lines AS CM import/export manage help
search result

GestióIP
#interno.todos



IP	hostname	description-SD	site	type	AI	comment	reservado	vendor	hostname_Manual	OS	CM	model	Localização	network			

    	10.116.94.187	 SBRDEAPLLX067	CRQ000000270931	CTC											

    	10.184.18.201	 SBRDEAPLLX067	WO0000080221544	Estendido_DTC-CTC			CTC_NPRDXF2488HV7_NPRD								

    	192.168.229.81	 SBRDEAPLLX067					10.116.94.187								

 


  editdelete   descriptionsitetypecommentAIUTreservadovendorhostname_ManualOSCMmodelLocalização

          GestióIP v3.1
