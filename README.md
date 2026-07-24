oc delete pod -n sisou-des -l job-name --field-selector=status.phase=Failed
