Passo 5 — Alteração no app (com o dev)

No app/build.gradle:

groovy
android {
    buildFeatures {
        buildConfig true   // obrigatório no AGP 8+
    }
    defaultConfig {
        def unicoKey = project.findProperty("unicoSdkKey") ?: ""
        buildConfigField "String", "UNICO_SDK_KEY", "\"${unicoKey}\""
    }
}

No código, onde o SDK Unico é configurado, a chave é lida via BuildConfig.UNICO_SDK_KEY. O ponto exato depende da versão do SDK, e a XID sabe onde fica.

Dois cuidados:

O ?: "" evita quebrar o build quando a chave não vem, por exemplo no Fortify, que roda assemble$(typeApp) sem o -P.
Peça para o dev remover a chave do repositório, caso ele tenha colocado hardcoded em algum .properties ou no código.
Passo 6 — Validar
Gere uma nova release para TQS.
No log da task Build Gradle, confira se aparece -PunicoSdkKey=***, ou seja, mascarado.
Instale o APK do Firebase (grupo teste-de-qualidade) e teste a câmera no XID.
