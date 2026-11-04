
-sh-4.2$ oc version
oc v3.11.0+0cbc58b
kubernetes v1.11.0+d4cacc0
features: Basic-Auth GSSAPI Kerberos SPNEGO

Server https://api.nprd.caixa:6443
kubernetes v1.25.0-2824+27e744f55d2e99-dirty
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get node ceadecldlx071.nprd.caixa -o yaml
apiVersion: v1
kind: Node
metadata:
  annotations:
    csi.volume.kubernetes.io/nodeid: '{"rook-ceph.cephfs.csi.ceph.com":"ceadecldlx071.nprd.caixa","rook-ceph.rbd.csi.ceph.com":"ceadecldlx071.nprd.caixa"}'
    machineconfiguration.openshift.io/controlPlaneTopology: HighlyAvailable
    machineconfiguration.openshift.io/currentConfig: rendered-worker-e506794ea609b0794ddc2d628211da29
    machineconfiguration.openshift.io/desiredConfig: rendered-worker-e506794ea609b0794ddc2d628211da29
    machineconfiguration.openshift.io/desiredDrain: uncordon-rendered-worker-e506794ea609b0794ddc2d628211da29
    machineconfiguration.openshift.io/lastAppliedDrain: uncordon-rendered-worker-e506794ea609b0794ddc2d628211da29
    machineconfiguration.openshift.io/reason: ""
    machineconfiguration.openshift.io/ssh: accessed
    machineconfiguration.openshift.io/state: Done
    volumes.kubernetes.io/controller-managed-attach-detach: "true"
  creationTimestamp: 2024-07-12T16:56:26Z
  labels:
    beta.kubernetes.io/arch: amd64
    beta.kubernetes.io/os: linux
    kubernetes.io/arch: amd64
    kubernetes.io/hostname: ceadecldlx071.nprd.caixa
    kubernetes.io/os: linux
    node-role.kubernetes.io/worker: ""
    node.openshift.io/os_id: fedora
  managedFields:
  - apiVersion: v1
    fieldsType: FieldsV1
    fieldsV1:
      f:metadata:
        f:annotations:
          .: {}
          f:volumes.kubernetes.io/controller-managed-attach-detach: {}
        f:labels:
          .: {}
          f:beta.kubernetes.io/arch: {}
          f:beta.kubernetes.io/os: {}
          f:kubernetes.io/arch: {}
          f:kubernetes.io/hostname: {}
          f:kubernetes.io/os: {}
          f:node-role.kubernetes.io/worker: {}
          f:node.openshift.io/os_id: {}
    manager: Go-http-client
    operation: Update
    time: 2024-07-12T16:56:26Z
  - apiVersion: v1
    fieldsType: FieldsV1
    fieldsV1:
      f:status:
        f:allocatable:
          f:cpu: {}
          f:hugepages-1Gi: {}
        f:capacity:
          f:cpu: {}
          f:hugepages-1Gi: {}
    manager: Go-http-client
    operation: Update
    subresource: status
    time: 2025-05-26T15:31:37Z
  - apiVersion: v1
    fieldsType: FieldsV1
    fieldsV1:
      f:metadata:
        f:annotations:
          f:machineconfiguration.openshift.io/controlPlaneTopology: {}
          f:machineconfiguration.openshift.io/desiredConfig: {}
          f:machineconfiguration.openshift.io/lastAppliedDrain: {}
    manager: machine-config-controller
    operation: Update
    time: 2026-04-03T20:24:47Z
  - apiVersion: v1
    fieldsType: FieldsV1
    fieldsV1:
      f:metadata:
        f:annotations:
          f:machineconfiguration.openshift.io/currentConfig: {}
          f:machineconfiguration.openshift.io/desiredDrain: {}
          f:machineconfiguration.openshift.io/reason: {}
          f:machineconfiguration.openshift.io/ssh: {}
          f:machineconfiguration.openshift.io/state: {}
    manager: machine-config-daemon
    operation: Update
    time: 2026-04-03T20:24:55Z
  - apiVersion: v1
    fieldsType: FieldsV1
    fieldsV1:
      f:status:
        f:volumesAttached: {}
    manager: kube-controller-manager
    operation: Update
    subresource: status
    time: 2026-11-03T16:05:05Z
  - apiVersion: v1
    fieldsType: FieldsV1
    fieldsV1:
      f:metadata:
        f:annotations:
          f:csi.volume.kubernetes.io/nodeid: {}
      f:status:
        f:allocatable:
          f:ephemeral-storage: {}
          f:memory: {}
        f:capacity:
          f:memory: {}
        f:conditions:
          k:{"type":"DiskPressure"}:
            f:lastHeartbeatTime: {}
            f:lastTransitionTime: {}
            f:message: {}
            f:reason: {}
            f:status: {}
          k:{"type":"MemoryPressure"}:
            f:lastHeartbeatTime: {}
            f:lastTransitionTime: {}
            f:message: {}
            f:reason: {}
            f:status: {}
          k:{"type":"PIDPressure"}:
            f:lastHeartbeatTime: {}
            f:lastTransitionTime: {}
            f:message: {}
            f:reason: {}
            f:status: {}
          k:{"type":"Ready"}:
            f:lastHeartbeatTime: {}
            f:lastTransitionTime: {}
            f:message: {}
            f:reason: {}
            f:status: {}
        f:images: {}
        f:nodeInfo:
          f:bootID: {}
          f:containerRuntimeVersion: {}
          f:kernelVersion: {}
          f:kubeProxyVersion: {}
          f:kubeletVersion: {}
          f:osImage: {}
        f:volumesInUse: {}
    manager: kubelet
    operation: Update
    subresource: status
    time: 2026-11-04T12:42:27Z
  name: ceadecldlx071.nprd.caixa
  resourceVersion: "2302016301"
  uid: a2a2541a-7c96-4dd5-9bba-f0cb31e476b7
spec: {}
status:
  addresses:
  - address: 10.116.208.91
    type: InternalIP
  - address: ceadecldlx071.nprd.caixa
    type: Hostname
  allocatable:
    cpu: 31500m
    ephemeral-storage: "288342967022"
    hugepages-1Gi: "0"
    hugepages-2Mi: "0"
    memory: 64680544Ki
    pods: "250"
  capacity:
    cpu: "32"
    ephemeral-storage: 314037228Ki
    hugepages-1Gi: "0"
    hugepages-2Mi: "0"
    memory: 65831520Ki
    pods: "250"
  conditions:
  - lastHeartbeatTime: 2026-11-04T12:42:27Z
    lastTransitionTime: 2025-10-08T10:36:10Z
    message: kubelet has sufficient memory available
    reason: KubeletHasSufficientMemory
    status: "False"
    type: MemoryPressure
  - lastHeartbeatTime: 2026-11-04T12:42:27Z
    lastTransitionTime: 2025-10-08T10:36:10Z
    message: kubelet has no disk pressure
    reason: KubeletHasNoDiskPressure
    status: "False"
    type: DiskPressure
  - lastHeartbeatTime: 2026-11-04T12:42:27Z
    lastTransitionTime: 2025-10-08T10:36:10Z
    message: kubelet has sufficient PID available
    reason: KubeletHasSufficientPID
    status: "False"
    type: PIDPressure
  - lastHeartbeatTime: 2026-11-04T12:42:27Z
    lastTransitionTime: 2025-10-08T10:36:10Z
    message: kubelet is posting ready status
    reason: KubeletReady
    status: "True"
    type: Ready
  daemonEndpoints:
    kubeletEndpoint:
      Port: 10250
  images:
  - names:
    - default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sispb-backend@sha256:15aaa54d9cf38a6b745f816fccddddf10ed861b518730112be8660925732c74b
    - default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sispb-backend:3.2.4.5
    sizeBytes: 3740348464
  - names:
    - default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sispb-backend@sha256:1449a555dc2c7289f8e19ba32ed38103f049a3d8beb5aca8bd88a25a0e106662
    - default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sispb-backend:3.3.5.12
    sizeBytes: 3734860847
  - names:
    - default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sispb-backend@sha256:fb7b9a62e11f7e650311de4fc013dadf93043db42bbfebb73b2f29c2e8f7e1c2
    - default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sispb-backend:3.3.1.2
    sizeBytes: 3734343728
  - names:
    - default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sispb-backend@sha256:9db93a09c2638ca9ac192bbf70b05d0817bde3ab532ff82b7c969138e8e89dd8
    - default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sispb-backend:3.1.0.4
    sizeBytes: 3734045742
  - names:
    - default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sisei-mgi@sha256:8d3da0b5c2bdb6c9d94c6227797a04d2cfd415c556ba8e0e3b801cb4538ce737
    - default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sisei-mgi:5.0.4.15
    sizeBytes: 3551292613
  - names:
    - default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/siico-api-segmento-operacional@sha256:5494541c5c1be993467bda90ffc9eae204b9457504a3717fd89fb8af214340c6
    - default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/siico-api-segmento-operacional:0.0.0.6-SNAPSHOT
    sizeBytes: 3393392672
  - names:
    - default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/siico-api-segmento-operacional@sha256:ccbd2806b59f41eb76c42d77eaf9288ae03683765dc49e934f1e56241de21c62
    sizeBytes: 3393392671
  - names:
    - default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/siico-api-segmento-operacional@sha256:c1bc854a2d14524f174da9a54661d11bf69837a7bc26c042a065dfd2db2b114d
    sizeBytes: 3393392670
  - names:
    - default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/siico-api-tipo-canal@sha256:8e214d143ef09d285e02248bba51a21c2ac4cb77056e427f42278a6b34418c9c
    - default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/siico-api-tipo-canal:0.0.0.9-SNAPSHOT
    sizeBytes: 3393082880
  - names:
    - default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/siico-api-segmento-atendimento@sha256:d7e5ac21df7401d2ae3fe31648e716e9354943755211585fc1b064377894deba
    - default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/siico-api-segmento-atendimento:0.0.0.4-SNAPSHOT
    sizeBytes: 3392973850
  - names:
    - default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sisou-sac-okd@sha256:36a6c948343b79f00d7a8205157afcccfb54beee0f663718dcbdaa18c1213355
    - default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sisou-sac-okd:2.6.0.13-SNAPSHOT
    sizeBytes: 3373758911
  - names:
    - default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sisou-sac-okd@sha256:cf8e383c8625623bc6f68285613a5137036d1bdda4c529898e796bf06cc10931
    - default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sisou-sac-okd:2.6.0.9-SNAPSHOT
    sizeBytes: 3373757887
  - names:
    - default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sisou-sac-okd@sha256:979495c8b897e28be974b6d7587027bba9cc968c1430d3d1bde33bfe487c1aed
    - default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sisou-sac-okd:2.5.0.35
    sizeBytes: 3373733309
  - names:
    - default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sisou-sac-okd@sha256:fa28c9436f5112657c19303c776e00e9b5b1f9d3018fc9891ba51f94944eb52e
    - default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sisou-sac-okd:2.2.0.17-SNAPSHOT
    sizeBytes: 3373275580
  - names:
    - default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sisou-sac-okd@sha256:d30385f5b2835c0d130a6ce8056ce7171b1723fb9d65400573217249993d7bb4
    - default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sisou-sac-okd:2.1.0.36-SNAPSHOT
    sizeBytes: 3373185467
  - names:
    - default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sisou-ouvidoria-okd@sha256:224165eeeccb0311be067267e78fc16ccfa0ccaadb7b9ce23e5fd73759da2cd1
    - default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sisou-ouvidoria-okd:2.5.0.10
    sizeBytes: 3373072848
  - names:
    - default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sisou-ouvidoria-okd@sha256:a8beea3b0808c46d97e61beae33d61be635f0dff6dace0569f7b1827363739d8
    - default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sisou-ouvidoria-okd:2.5.0.6
    sizeBytes: 3373063632
  - names:
    - default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sisou-ouvidoria-okd@sha256:71f56a3e347ee0dc5c685cd40de184d921343b70d314222311ead63d2469e45f
    - default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sisou-ouvidoria-okd:2.2.0.1-SNAPSHOT
    sizeBytes: 3373046221
  - names:
    - default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sisou-ouvidoria-okd@sha256:da7ce616da62e5ea5e5a8b1ac18a8f545361a9e4eba9d9cc0795fe43b54065df
    - default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sisou-ouvidoria-okd:2.5.0.1-SNAPSHOT
    sizeBytes: 3373044177
  - names:
    - default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sisou-ouvidoria-okd@sha256:d5d28fd70fa08d98279a58f7daa1b47899a2eb52fb235ac33690b97dd20d8019
    - default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sisou-ouvidoria-okd:2.3.0.11-SNAPSHOT
    sizeBytes: 3373027789
  - names:
    - default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sigts-seguridade@sha256:4df24617707b71409f4a5d78eb2f01b50d9e718e9c3ca45bc182c05dd8ffaead
    - default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sigts-seguridade:0.0.0-2-SNAPSHOT
    sizeBytes: 3359622638
  - names:
    - default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sigsj-assincrono@sha256:c57fae9e6e026c26d041eeff76170d67e78834b2bae5649a077a7fa207d3017b
    - default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sigsj-assincrono:20261104.0915-1.0.0-SNAPSHOT
    sizeBytes: 3324497915
  - names:
    - default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sipii-jboss@sha256:6d6c4975a832b6f537c1a6df9df9c120b3b90490412c911e9e635a09e0bd2dc5
    - default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sipii-jboss:7.0.0.25
    sizeBytes: 3284619188
  - names:
    - default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sipii-jboss@sha256:808603c31ea1745a5d2a3c0f48765c4dfc9a64aa75d4579348ed422ab48c3b5e
    - default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sipii-jboss:7.0.0.8
    sizeBytes: 3284617139
  - names:
    - default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sipnl-senhagestor-backend@sha256:462dc652b60ae55d91cc953a4c6e9fe27ad5d98d7ffe18bdca6e2e61b68438a6
    - default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sipnl-senhagestor-backend:20261027.1335-0.0.0.8-SNAPSHOT
    sizeBytes: 3272097813
  - names:
    - default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sisam-backend-internet@sha256:2ea17ec9067e7f4d4254869315a9633013f84b0859b57c47269826f60874a5de
    - default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sisam-backend-internet:1.0.0.16-SNAPSHOT
    sizeBytes: 3270374908
  - names:
    - default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sisam-backend-internet@sha256:42d9011573db8e193473c657755f046c5e119f5b0d3753198be1ea7055b8e3d5
    - default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sisam-backend-internet:1.0.0.13-SNAPSHOT
    sizeBytes: 3270358524
  - names:
    - default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/siico-bff-tipo-publico-alvo@sha256:9f250e59c7cafed0b6d94e0d2809fd3d5a5257e100deaee86e7b8f7222bab064
    - default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/siico-bff-tipo-publico-alvo:0.0.0.8-SNAPSHOT
    sizeBytes: 3217357332
  - names:
    - default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/siico-bff-tipo-publico-alvo@sha256:2ae795f9a6b130b70265e6185ca348845ea77a323a32ec8cfdb3860a86b5926f
    - default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/siico-bff-tipo-publico-alvo:0.0.1.0-SNAPSHOT
    sizeBytes: 3217357332
  - names:
    - default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/siico-bff-tipo-publico-alvo@sha256:e8fc1f07f11ddee3cc57eb1e145b1462a57316a9b5e02766f84e27b8d07b76ce
    sizeBytes: 3217356821
  - names:
    - default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/siico-bff-tipo-publico-alvo@sha256:6eea16c47bd1abddc1685bcedee14255784c3f33920b99dfed34524beca75da7
    - default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/siico-bff-tipo-publico-alvo:0.0.0.6-SNAPSHOT
    sizeBytes: 3217356817
  - names:
    - default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/siabe-micro@sha256:7cc147b8a57ed9d51d421e8308d4d5b6e31d2dfcc26e8f79b59e42bb583296fc
    - default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/siabe-micro:20260925.1109-1.0.0-SNAPSHOT
    sizeBytes: 2991193069
  - names:
    - default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/siabe-micro@sha256:9aec250a05def417a5dfdbe30d844ced8a792124e496e864d766b4a622fc7cb7
    - default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/siabe-micro:20260925.1039-1.0.0-SNAPSHOT
    sizeBytes: 2991193068
  - names:
    - default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/siabe-micro@sha256:445b04af25f940fd30121f56a3aa3faecece9be3ad1bcd7b89558b1f94a8acd7
    - default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/siabe-micro:20260925.1206-1.0.0-SNAPSHOT
    sizeBytes: 2991193067
  - names:
    - default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/siavl-atdremoto-backend@sha256:ecb3ed596a27b44234e455041fa14f5242cb7b76c889d42c5417616db134b7e6
    - default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/siavl-atdremoto-backend:1.18.0.1
    sizeBytes: 2792862000
  - names:
    - default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/simil-precificacao-queue@sha256:513a179d7694b7d6a3cc5c816915e83751929fd110e3814023965646665bd7dc
    - default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/simil-precificacao-queue:20261009.1331-0.0.0.1-SNAPSHOT
    sizeBytes: 2724652409
  - names:
    - default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sired-backend-intranet@sha256:de7be709ee69f66621cb486479c366f336ca58a221653de54661e7c7cefab940
    - default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sired-backend-intranet:5.15.0.16
    sizeBytes: 2712026487
  - names:
    - default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sired-backend-intranet@sha256:0489338afbe220f183ff7d91ab8b74431f546b69f4c28c2ff4a380d8034b0ab4
    - default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sired-backend-intranet:5.15.0.12
    sizeBytes: 2711975283
  - names:
    - default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sired-backend-intranet@sha256:a478be4069212a5b0e16a5c56f2e46b8d03d45f116fbf14d0c8f4b309509b41e
    - default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sired-backend-intranet:5.13.0.16
    sizeBytes: 2709326198
  - names:
    - default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sired-backend-intranet@sha256:eec82dd01efb6670d6b112262c1b057ecd0b018a6773e5699c08898b7a855f97
    - default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sired-backend-intranet:5.13.0.14
    sizeBytes: 2709301622
  - names:
    - default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/siacg-analise-api@sha256:41670b3662464a216954bddbb64cc2680caf712225881721212961b54e684e0a
    - default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/siacg-analise-api:1.3.9.6
    sizeBytes: 2705235304
  - names:
    - default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sired-backend-internet@sha256:9e06a4e9e4484a7498e7ffb340d6aba79fa7bffc549548cacf8f2c2cfd139582
    - default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sired-backend-internet:5.15.0.1
    sizeBytes: 2694239603
  - names:
    - default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sired-backend-internet@sha256:0bfec110ea78de37e3ea7553df4679d2c7224673aa568ae73ecc0ae381e82ff5
    - default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sired-backend-internet:5.13.0.15
    sizeBytes: 2694115698
  - names:
    - default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sired-backend-internet@sha256:9ab109499d731466efc11a720f3313696afb094d7e1b0555a5b3424f7e673a8f
    - default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sired-backend-internet:5.12.0.15
    sizeBytes: 2692718963
  - names:
    - default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/siavl-gestaonotas-backend@sha256:ff7360734ceb9d5e8c5e79c53d75bcd3c91a686a801dcedb420b46832ddb2a3e
    - default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/siavl-gestaonotas-backend:0.5.1.1
    sizeBytes: 2675817854
  - names:
    - default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sisgf-backend@sha256:bd77f0bb0bb36220cd19366941409303542d5c93248209370b8241fc22ead816
    - default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sisgf-backend:20261022.1336-11.01.01.01-SNAPSHOT
    sizeBytes: 2669814108
  - names:
    - default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sisgf-backend@sha256:170e8ee611b44be8edd786df72b6ae06e9e0093b2f954b1eaac0b7a3c893b6ed
    - default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sisgf-backend:20260925.0846-11.01.01.01-SNAPSHOT
    sizeBytes: 2669540700
  - names:
    - default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sisgf-backend@sha256:5f03c7fee598aa4d21d58efbb71cfb280f0b2dbdd3896808bfbf293d8de9a411
    - default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sisgf-backend:14.0.6.16
    sizeBytes: 2669504860
  - names:
    - default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sisgf-backend@sha256:41ed0bcde7b597aae7eac5ec410bd39ee520f381969966a6e54c07b10f05c777
    - default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sisgf-backend:14.0.0.77
    sizeBytes: 2668982619
  - names:
    - default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sisgf-backend@sha256:0bfced42cff9d01d6886975ed3f695efe1584a5896b7adcf0192cef2fcbf7098
    - default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sisgf-backend:14.0.6.9
    sizeBytes: 2668982619
  nodeInfo:
    architecture: amd64
    bootID: b0276c58-5f88-4990-86d1-55cfc265aaed
    containerRuntimeVersion: cri-o://1.25.1
    kernelVersion: 6.1.18-200.fc37.x86_64
    kubeProxyVersion: v1.25.8+27e744f
    kubeletVersion: v1.25.8+27e744f
    machineID: c8cff331fc644a8cb4a32f331bdd5bd1
    operatingSystem: linux
    osImage: Fedora CoreOS 37.20230322.3.0
    systemUUID: 40d90242-9d69-6564-9bdf-bb4b52d0b672
  volumesAttached:
  - devicePath: ""
    name: kubernetes.io/csi/rook-ceph.rbd.csi.ceph.com^0001-0009-rook-ceph-0000000000000002-f93e938c-723d-4c96-99e9-bd96f72c3305
  volumesInUse:
  - kubernetes.io/csi/rook-ceph.rbd.csi.ceph.com^0001-0009-rook-ceph-0000000000000002-f93e938c-723d-4c96-99e9-bd96f72c3305
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get netnamespace -o wide | grep 192.168.236
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
