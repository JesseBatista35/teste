set -e

DIR="/opt/jboss-eap/standalone/configuration/pdfa"
ARQ_ORIGEM="/opt/jboss-eap/standalone/configuration/logoTreePdfA.png"
ARQ_DESTINO="$DIR/logoTreePdfA.png"

# Verifica se o arquivo de origem existe
if [ ! -f "$ARQ_ORIGEM" ]; then
    echo "ERRO: Arquivo de origem não encontrado: $ARQ_ORIGEM"
    exit 1
fi

# Cria o diretório somente se não existir
if [ ! -d "$DIR" ]; then
    mkdir -p "$DIR"
    echo "Diretório criado: $DIR"
else
    echo "Diretório já existe: $DIR"
fi

# Ajusta dono e permissões do diretório
chown jboss:jboss "$DIR"
chmod 777 "$DIR"

# Copia o arquivo
cp "$ARQ_ORIGEM" "$ARQ_DESTINO"

# Ajusta dono e permissões do arquivo copiado
chown jboss:jboss "$ARQ_DESTINO"
chmod 777 "$ARQ_DESTINO"

echo "Diretório configurado e arquivo copiado com sucesso."
ls -ld "$DIR"
ls -l "$ARQ_DESTINO"

#Realiza  instalação bibliotecas libldap_r-2.4.so.2 apache
dnf install -y openldap-compat
