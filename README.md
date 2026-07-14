#!/bin/bash
IFS=$'\n'
for OUTPUT in `printenv | sort`
do
if [[ "$OUTPUT" =~ ^_ENV_.*  ]]; then
    Enviroment="${Enviroment} ${OUTPUT#"_ENV_"}"
    echo ${OUTPUT#"_ENV_"}
fi
done
echo "##vso[task.setvariable variable=Enviroment;]$Enviroment"
