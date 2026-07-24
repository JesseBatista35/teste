-sh-4.2$ oc exec -n sipcs-des sipcs-digital-pay-provisionamento-visa-des-17-dmq9x -- curl -s -o /dev/null -w "porta 9000 /q/health/live: %{http_code}\n" http://localhost:9000/q/health/live
porta 9000 /q/health/live: 000
command terminated with exit code 7
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc exec -n sipcs-des sipcs-digital-pay-provisionamento-visa-des-17-dmq9x -- curl -s -o /dev/null -w "raiz: %{http_code}\n" http://localhost:8080/
raiz: 404
-sh-4.2$ oc exec -n sipcs-des sipcs-digital-pay-provisionamento-visa-des-17-dmq9x -- curl -s http://localhost:8080/q/openapi 2>&1 | head -30
---
openapi: 3.1.0
components:
  schemas:
    ApplicationInfo:
      type: object
      properties:
        supportsTokenNotifications:
          type: boolean
        supportsFPANNotifications:
          type: boolean
        transactionServiceURL:
          type: string
        messageServiceURL:
          type: string
        transactionPushTopic:
          type: string
        messagePushTopic:
          type: string
        appLaunchURL:
          type: string
        appLaunchURLScheme:
          type: string
        associatedStoreIdentifiers:
          type: array
          items:
            type: string
        associatedApplicationIdentifiers:
          type: array
          items:
-sh-4.2$ oc exec -n sipcs-des sipcs-digital-pay-provisionamento-visa-des-17-dmq9x -- env | grep -iE "QUARKUS_HTTP|QUARKUS_MANAGEMENT|ROOT_PATH"
-sh-4.2$
