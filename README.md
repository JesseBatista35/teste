# Entra no diretorio do Repo.
cd $(System.DefaultWorkingDirectory)/$(Release.PrimaryArtifactSourceAlias)
#Altera o valor do campo SD_KEY_BIOMETRIA por $(SD_KEY_BIOMETRIA)
SD_KEY_BIOMETRIA=$(SD_KEY_BIOMETRIA)
#Altera o valor do campo SD_KEY_BIOMETRIA por $(SD_KEY_BIOMETRIA)
sed -i '' -e 's/SD_KEY_BIOMETRIA =\s*.*/SD_KEY_BIOMETRIA = $(SD_KEY_BIOMETRIA);/g' $(APP_NAME).xcodeproj/project.pbxproj
Sequence=$(CURRENT_PROJECT_VERSION)
SequenceNew=$((Sequence + $(N)))
echo "##vso[task.setvariable variable=SequenceNew]$SequenceNew"
#Altera o valor do campo MARKETING_VERSION por $(VERSION)
sed -i '' -e 's/MARKETING_VERSION =\s*.*/MARKETING_VERSION = $(VERSION);/g' $(APP_NAME).xcodeproj/project.pbxproj
#Altera o valor do campo CURRENT_PROJECT_VERSION por $(CURRENT_PROJECT_VERSION)
sed -i '' -e "s~CURRENT_PROJECT_VERSION =\s*.*~CURRENT_PROJECT_VERSION = $SequenceNew;~g" $(APP_NAME).xcodeproj/project.pbxproj
#Exibe os valores alterados dentro do arquivo.
echo "version e build alterada"
cat $(APP_NAME).xcodeproj/project.pbxproj | grep CURRENT_PROJECT_VERSION
cat $(APP_NAME).xcodeproj/project.pbxproj | grep MARKETING_VERSION

# Configura .netrc para Heartbeat
cat > ~/.netrc << EOF
machine download-ofd.apps.topazevolution.com
  login $(HEARTBEAT_AWS_CODECOMMIT_USERNAME)
  password $(HEARTBEAT_AWS_CODECOMMIT_URLENCODED_PASSWORD)
machine git-codecommit.us-east-1.amazonaws.com
  login $(HEARTBEAT_AWS_CODECOMMIT_USERNAME)
  password $(HEARTBEAT_AWS_CODECOMMIT_URLENCODED_PASSWORD)
EOF
chmod 600 ~/.netrc
