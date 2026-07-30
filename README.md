oc get secret -n sispl-tqs | grep -i vault
oc describe pod sispl-canal-webhook-pix-tqs-6dffbbcc6c-5drxz -n sispl-tqs | grep -A10 Mounts
oc get deployment sispl-canal-webhook-pix-tqs -n sispl-tqs -o yaml | grep -B5 -A15 vaultcaixa
