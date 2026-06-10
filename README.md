# Antes do pod install, adiciona isso:
export SD_KEY_BIOMETRIA="$(SD_KEY_BIOMETRIA)"

# E imprime para confirmar que pegou o valor:
echo "✅ SD_KEY_BIOMETRIA agora é: $SD_KEY_BIOMETRIA"

# Depois executa:
pod install --project-directory=$(System.DefaultWorkingDirectory)/$(Release.PrimaryArtifactSourceAlias)
