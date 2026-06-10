Display name: Export SD_KEY_BIOMETRIA
Script location: Inline
Inline script:

export SD_KEY_BIOMETRIA="$(SD_KEY_BIOMETRIA)"
echo "##vso[task.setvariable variable=SD_KEY_BIOMETRIA]$SD_KEY_BIOMETRIA"
echo "✅ SD_KEY_BIOMETRIA exportada: $SD_KEY_BIOMETRIA"
