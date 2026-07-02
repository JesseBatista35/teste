-sh-4.2$ oc get dc sibec-arquivos-tqs -n sibec-tqs -o yaml | sed -n '690,742p'
        resources: {}
        terminationMessagePath: /dev/termination-log
        terminationMessagePolicy: File
        volumeMounts:
        - mountPath: /usr/src/app/secrets_files
          name: secrets
        - mountPath: /script
          name: script-bt-volume
      restartPolicy: Always
      schedulerName: default-scheduler
      securityContext: {}
      terminationGracePeriodSeconds: 30
      volumes:
      - name: sibec-arquivos-fgw-data-tqs
        persistentVolumeClaim:
          claimName: sibec-arquivos-fgw-data-tqs
      - emptyDir:
          medium: Memory
        name: secrets
      - configMap:
          defaultMode: 420
          name: sibec-arquivos-tqs-script-bt-check
        name: script-bt-volume
      - name: caixa-truststore-acteste-nprd
        secret:
          defaultMode: 420
          secretName: caixa-truststore-acteste-nprd
  test: false
  triggers: []
status:
  availableReplicas: 1
  conditions:
  - lastTransitionTime: 2026-07-02T19:19:05Z
    lastUpdateTime: 2026-07-02T19:19:05Z
    message: Deployment config has minimum availability.
    status: "True"
    type: Available
  - lastTransitionTime: 2026-07-02T19:19:06Z
    lastUpdateTime: 2026-07-02T19:19:10Z
    message: replication controller "sibec-arquivos-tqs-110" successfully rolled out
    reason: NewReplicationControllerAvailable
    status: "True"
    type: Progressing
  details:
    causes:
    - type: Manual
    message: manual change
  latestVersion: 110
  observedGeneration: 5266
  readyReplicas: 1
  replicas: 1
  unavailableReplicas: 0
  updatedReplicas: 1
-sh-4.2$
