<img width="1683" height="897" alt="image" src="https://github.com/user-attachments/assets/469c6501-3d5f-49f0-a4d3-3e6ace1b05b1" />

Sequence e Version

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


Install an Apple certificate

ios_dist_12112026.p12
Certificate (P12) password
$(P12password)
Advanced
Keychain
Temporary Keychain
Certificate signing identity
Set up partition_id ACL for the imported private key
OpenSSL arguments for PKCS12
-legacy
Control Options

Hearbeat pod setup

# Entra no diretorio do Repo.
cd $(System.DefaultWorkingDirectory)/$(Release.PrimaryArtifactSourceAlias)

# Add enviroment variables to 'Heartbeat' pod
export AWS_ACCESS_KEY=$(AWS_ACCESS_KEY)
export AWS_SECRET_ACCESS_KEY=$(AWS_SECRET_ACCESS_KEY)
export AWS_REGION=$(AWS_REGION)

export HEARTBEAT_AWS_CODECOMMIT_REPO_URL=$(HEARTBEAT_AWS_CODECOMMIT_REPO_URL)
export HEARTBEAT_AWS_CODECOMMIT_USERNAME=$(HEARTBEAT_AWS_CODECOMMIT_USERNAME)
export HEARTBEAT_AWS_CODECOMMIT_URLENCODED_PASSWORD=$(HEARTBEAT_AWS_CODECOMMIT_URLENCODED_PASSWORD)

# Install Cocoapod plugin to download files from AWS S3
sudo gem install cocoapods-s3-download

Exporta SD_KEY_BIOMETRIA

export SD_KEY_BIOMETRIA="$(SD_KEY_BIOMETRIA)" 
echo " SD_KEY_BIOMETRIA = $SD_KEY_BIOMETRIA"  
pod install --project-directory=$(System.DefaultWorkingDirectory)/$(Release.PrimaryArtifactSourceAlias) 

Display name
pod install
Working directory
$(System.DefaultWorkingDirectory)/$(Release.PrimaryArtifactSourceAlias)
Advanced
Force repo update
Project directory
$(System.DefaultWorkingDirectory)/$(Release.PrimaryArtifactSourceAlias)
Control Options



# Add PlistBuddy to PATH
export PATH="/usr/libexec:$PATH"

# Generate exportOptions plist
PlistBuddy -c "Add :method string app-store" $(System.DefaultWorkingDirectory)/$(Release.PrimaryArtifactSourceAlias)/exportOptions.plist
PlistBuddy -c "Add :teamID string ${APPLE_TEAM_ID_CAIXA}" $(System.DefaultWorkingDirectory)/$(Release.PrimaryArtifactSourceAlias)/exportOptions.plist
PlistBuddy -c "Add :provisioningProfiles:${APP_BUNDLE_IDENTIFIER} string ${APPLE_PROV_PROFILE_UUID}" $(System.DefaultWorkingDirectory)/$(Release.PrimaryArtifactSourceAlias)/exportOptions.plist
