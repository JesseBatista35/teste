oc logs pod/agendamento-sisou-29747520-qjlwn


oc delete pod -n sisou-des -l job-name --field-selector=status.phase=Failed


