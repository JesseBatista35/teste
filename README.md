# confirma BOM e CRLF
for f in /producao/env_config.sh /producao/executa-job.sh /producao/configuration/custom.sh; do echo "$f: $(head -c3 $f | xxd -p) | $(file -b $f)"; done

# remove BOM (ef bb bf) e eventuais CRLF, mantendo dono/permissão
for f in /producao/env_config.sh /producao/executa-job.sh /producao/configuration/custom.sh; do cp -p $f $f.bkp.$(date +%Y%m%d%H%M); sed -i '1s/^\xEF\xBB\xBF//; s/\r$//' $f; done
head -c3 /producao/executa-job.sh | xxd -p     # não pode mais começar com efbbbf

# instala jq
dnf install -y jq && jq --version
