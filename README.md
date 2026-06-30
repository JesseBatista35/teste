cd $(System.DefaultWorkingDirectory)/$(Release.PrimaryArtifactSourceAlias)
sudo gem install cocoapods-s3-download
export SD_KEY_BIOMETRIA="$(SD_KEY_BIOMETRIA)" 
echo " SD_KEY_BIOMETRIA = $SD_KEY_BIOMETRIA"



source 'https://download-ofd.apps.topazevolution.com/ios-cdn-specs'

