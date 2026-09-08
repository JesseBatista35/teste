jesse [ ~ ]$ 
jesse [ ~ ]$ az network private-dns zone list -g rg-sipdd-des
[
  {
    "etag": "2f61f526-994d-44a6-b1c1-9f56ebabcd04",
    "id": "/subscriptions/ac793a00-3e83-4465-b8b0-0fb44a91b916/resourceGroups/rg-sipdd-des/providers/Microsoft.Network/privateDnsZones/aks-sipdd-des.privatelink.brazilsouth.azmk8s.io",
    "location": "global",
    "maxNumberOfRecordSets": 25000,
    "maxNumberOfVirtualNetworkLinks": 1000,
    "maxNumberOfVirtualNetworkLinksWithRegistration": 100,
    "name": "aks-sipdd-des.privatelink.brazilsouth.azmk8s.io",
    "numberOfRecordSets": 2,
    "numberOfVirtualNetworkLinks": 2,
    "numberOfVirtualNetworkLinksWithRegistration": 0,
    "provisioningState": "Succeeded",
    "resourceGroup": "rg-sipdd-des",
    "tags": {
      "Ambiente": "des",
      "EquipeInfra": "COE",
      "EquipeSolucao": "BOX",
      "Provimento": "Terraform",
      "Solucao": "sipdd",
      "Workload": "sipdd"
    },
    "type": "Microsoft.Network/privateDnsZones"
  },
  {
    "etag": "fec71583-06bf-4db8-96e7-3fe2cd9474aa",
    "id": "/subscriptions/ac793a00-3e83-4465-b8b0-0fb44a91b916/resourceGroups/rg-sipdd-des/providers/Microsoft.Network/privateDnsZones/des.sipdd.private.azure",
    "location": "global",
    "maxNumberOfRecordSets": 25000,
    "maxNumberOfVirtualNetworkLinks": 1000,
    "maxNumberOfVirtualNetworkLinksWithRegistration": 100,
    "name": "des.sipdd.private.azure",
    "numberOfRecordSets": 2,
    "numberOfVirtualNetworkLinks": 1,
    "numberOfVirtualNetworkLinksWithRegistration": 0,
    "provisioningState": "Succeeded",
    "resourceGroup": "rg-sipdd-des",
    "tags": {
      "Ambiente": "des",
      "EquipeInfra": "COE",
      "EquipeSolucao": "BOX",
      "Provimento": "Terraform",
      "Solucao": "sipdd",
      "Workload": "sipdd"
    },
    "type": "Microsoft.Network/privateDnsZones"
  }
]
jesse [ ~ ]$ az network private-dns record-set list -g rg-sipdd-des -z privatelink.brazilsouth.azmk8s.io --query "[].{name:name}"
(ParentResourceNotFound) Failed to perform 'read' on resource(s) of type 'privateDnsZones/all', because the parent resource '/subscriptions/ac793a00-3e83-4465-b8b0-0fb44a91b916/resourceGroups/rg-sipdd-des/providers/Microsoft.Network/privateDnsZones/privatelink.brazilsouth.azmk8s.io' could not be found.
Code: ParentResourceNotFound
Message: Failed to perform 'read' on resource(s) of type 'privateDnsZones/all', because the parent resource '/subscriptions/ac793a00-3e83-4465-b8b0-0fb44a91b916/resourceGroups/rg-sipdd-des/providers/Microsoft.Network/privateDnsZones/privatelink.brazilsouth.azmk8s.io' could not be found.
jesse [ ~ ]$ nslookup dns-aks-sipdd-des-ebg0b8an.aks-sipdd-des.privatelink.brazilsouth.azmk8s.io 168.63.129.16
Server:         168.63.129.16
Address:        168.63.129.16#53

** server can't find dns-aks-sipdd-des-ebg0b8an.aks-sipdd-des.privatelink.brazilsouth.azmk8s.io: NXDOMAIN

jesse [ ~ ]$ 
