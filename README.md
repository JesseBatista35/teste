Solicitamos realizar upload do arquivo anexo, no repositório NEXUS CAIXA.

Criar pastas com o nome "Promon" para colocar os arquivos.


Obs: Como referência de execução temos esse chamado atendido anteriormente REQ000143807621

Realizar upload do arquivo anexo, no repositório NEXUS CAIXA na seguinte instância:

ZIMPERIUM/ZDefend.aar

Criar pastas conforme especificado acimaÀ CAIXA,

Realizado upload no repositório binário.caixa conforme seguem evidências em:

https://binario.caixa/repository/caixa-repo/zdefend/zdefend/5.10/zdefend-5.10-zdefend.aar.aar 

Para implementação:
implementation("zdefend:zdefend:5.10:zdefend.aar@aar")


Atenciosamente,
Murilo Silva Andrade Souza
Analista
CTIS / CESTI Esteira DEVOPS DES TQS NPRD


soa esse dois arquivos


# RELEASE NOTES - Shield for Android, Version 9.2.0, 2026-09-30

Shield for Android, version 9.2 includes a major update to Code Protect that
addresses an important security vulnerability while adding other Code Protect
feature improvements and configuration changes. Refer to the documentation for
help on upgrading:
https://docs.promon.io/code-protect-for-native/9.2.x/#upgrading-from-previous-versions

Version 9.2 also adds support for Insight for App Risk, AI Protect, and trusting
system-installed keyboards and screen readers. Additional improvements have been
made to Shield's code injection, hooking framework, and emulator detections.


## Upgrade Strategy

Version 9.2.0 is a Current release. If you are already using a Current version
(e.g., 9.1.1), then upgrade to this version. If your goal is to maintain
predictable stability, then stay on the Stable track (e.g., 9.0.1). Do not
upgrade to this version unless you specifically need one of the new features
described below.


## Highlights

* Major Code Protect changes

* Insight for App Risk

* AI Protect

* Security detection improvements

* Trusting system-installed keyboards and screen readers


## Security Notice 

This release builds on the Shield for Android hardening described in the Promon
security advisory of 9 September 2026. Upgrading to this version and
re-shielding your app enables code-injection detection automatically, with no
configuration needed. A small number of additional protections require an
explicit configuration step — review the following: 

* Code injection detection has been improved and is enabled by default. No
  configuration change is required. 

* For Code Protect licenses, the protection against memory dump attacks added in
  Promon Jigsaw v2.1.1 applies when both Section Encryption and Control Flow
  Obfuscation are enabled. Enable both in your Code Protect configuration. Refer
  to the documentation for details:
  https://docs.promon.io/code-protect-for-native/latest/

* The binding best practices further strengthen Shield's protection. Please
  refer to this for the recommended configuration: 
  https://docs.promon.io/shield-for-android/latest/rules/binding/#best-practices 


## Supported Platforms
 
* Shield is officially supported for Android versions 5.0 (API 21) through
  Android 17 (API 37).

* The Shielder tool is supported on 64-bit Java 17 on Windows 10, Mac OSX
  (10.9+), and Ubuntu Linux LTS 22.04 or 24.04.

* Shield Gradle Plugin version 3.0.x is supported. The plugin is available from
  Maven Central. Refer to the documentation for more details:
  https://docs.promon.io/gradle-plugin/latest/


## New Features

* Added the `trustSystemKeyboards` configuration option, which controls whether
  system-installed keyboards are trusted automatically when
  `checkTrustedKeyboard` is enabled. Defaults to `true`, which keeps the
  existing behavior. If set to `false`, then system keyboards must match an
  `addTrustedKeyboardSigner` entry like any third-party keyboard.
  _(Resolves issue SHAND-6055)_

* Added the `trustSystemScreenreaders` configuration option, which controls
  whether screen readers installed as system apps (e.g., TalkBack) are trusted
  automatically when `checkTrustedScreenreaders` is enabled. Defaults to `true`.
  If set to `false`, then system screen readers must match an
  `addTrustedScreenreaderSigner` entry like any third-party screen reader.

  This feature changes the default behavior for trusting screen readers. See
  "Changes and Deprecations" for more details.
  _(Resolves issue SHAND-6056)_

* For Code Protect licenses, the Promon Jigsaw engine has been upgraded to
  v2.1.1, which adds protection against memory dump attacks when both Section
  Encryption and Control Flow Abstraction are enabled.

* Shield now supports Insight for App Risk, a Promon Insight offering that lets
  you define risk scores for a scoreboard of suspicious devices.
  _(Resolves issue SHC-1020)_

* Shield now supports AI Protect, a Promon extension that protects the embedded
  AI models (e.g., vision, audio, and classifier models) in your app. 


## Fixes and Improvements

* Improved code injection detection to detect Vulkan layer injection, where a
  malicious Vulkan layer is used to inject code into the app.
  _(Resolves issue SHAND-5573)_

* Improved hooking framework detection to detect the Frida injection loader.
  _(Resolves issue SHAND-5926)_

* Improved emulator detection to detect Linux container-based emulators, such
  as VMOS.
  _(Resolves issue SHAND-6018)_

* Improved trusted keyboard checking to continue trusting a system installed
  keyboard after it has been updated.
  _(Resolves issue SHAND-6072)_

* Fixed an issue where protected apps would sometimes hang at launch on certain
  devices.
  _(Resolves issue SHAND-6030)_

* Fixed an issue with ActivityGuard where the app's splash screen could flicker
  or briefly disappear during launch on Android 12 and above.
  _(Resolves issue SHAND-6084)_

* Fixed an incorrect Kotlin dependency in the `ShieldSDK-activity-guard` Maven
  dependency, which resulted in a "Module was compiled with an incompatible
  version of Kotlin" error.
  _(Resolves issue SHAND-5927)_

* Fixed an issue where `bindingStyle` max limits were being applied globally
  instead of per method or class.
  _(Resolves issue INT-552)_

* For Promon Insight licenses, improved Shield's exiting behavior so that an
  immediate shutdown (set via the `shutdownImmediately` config option) no
  longer waits for pending Insight reporting to complete.
  _(Resolves issue SHAND-6185)_

* For Code Protect licenses, the Promon Jigsaw engine has been upgraded to
  v2.1.1, which includes the following improvements:

  * Improved the obfuscation of the decryption logic for Section Encryption.

  * Improved the security of Control Flow Abstraction for ARM by making it
    harder to exfiltrate its data.

  * Removed internal temporary file paths from the Shielder log output.

  * Failure to generate a protection report no longer halts the protection
    process.

  * Fixed an issue with Section Encryption not preserving utilized registers.

  * Fixed a potential runtime issue that could occur with Section Encryption
    executing stale instructions on arm64 binaries.

  * Fixed a protection settings failure when `integrityCheck` was specified
    without a `rules` array.

  * Fixed an overlapping blocks disassembly failure for arm32 and x86_64 Flutter
    binaries.

  * Fixed a non-string panic payload error that could appear when an internal
    failure occurred during protection.


## Changes and Deprecations

* Screen readers installed as system apps are now trusted by default when
  `checkTrustedScreenreaders` is enabled, without requiring an
  `addTrustedScreenreaderSigner` entry.
  
  To restore the previous behavior, set `trustSystemScreenreaders` to `false`
  and specify the list of known trustworthy screen readers. You can find
  `addTrustedScreenreaderSigner` suggestions in the packaged
  `config-template.xml` file.

* For Code Protect licenses, the following changes apply:

  * Configurations no longer use the `report` option. Native protection reports
    are now part of Shielder's integration reports.

  * The `stripping` config object is now called `debugStripping`.

  * The `sectionHeaders` and `sectionRules` options are removed from Debug
    Stripping and are now part of their own configuration object called
    `sectionHeaderStripping`.

  * The top-level `checksum` configuration, which was deprecated in an earlier
    version of Code Protect, is removed completely. `checksum` must now be
    specified as a child object under `controlFlow`.

  * The top-level `exclude` and `runtime_logs` options are removed.

  * The Section Encryption config options, `minimumRange` and `excludeRanges`,
    are removed.

  * Section Encryption's `sectionRules` option is now optional and can be
    omitted from configurations.

  * The `event` option for Integrity Checking has changed from a string to an
    array of strings/rules. For example, `"event": "_integrity_checked"` is now
    `"event": [ "_integrity_checked" ]`.

  * The syntax for configuration filter rules is now better defined, but this
    introduces the following possible breaking changes:

    * Inclusion rules must be specified first and exclusion rules specified
      last. For example: `[ "debug_*", "!*Test" ]`. Specifying these out of
      order (e.g., `[ "!*Test", "debug_*" ]`) is no longer valid.

    * To specify none, or no matches, use an empty array (i.e., `[]`). The
      previous syntax, `[ "!*" ]`, is no longer valid.


## Known Limitations

* Shield supports Android 17 but not its new post-quantum cryptography features,
  including ML-DSA keystore keys and v3.2 APK signature schemes. Using these
  features will result in a repackaging detection. Use classical keys and
  existing signature schemes for now. Support for these features will be added
  in a future release of Shield for Android.


## Other Notices

* Some virtual space apps use techniques similar to malware (e.g., native code
  hooking), which can trigger Shield security protections. As Shield's detection
  capabilities improve, additional virtual space apps might be restricted.


## Highlights from Previous Versions

### Version 9.1.1

* ANR fixes

* VPN callback fixes

### Version 9.1.0

* Improved startup performance

* Improved file integrity performance

* Native code hook false positives

### Version 9.0.0

* Android 17 support

* VMOS Cloud detection

* JNIEnv integrity checks

* New pull binding options

* Improved APK repackaging detection

* Improved hooking detection

* Virtual space deprecations

* Output filename change


<img width="1169" height="537" alt="image" src="https://github.com/user-attachments/assets/3a0f3ad2-e0b7-40b6-acab-b77960c4353d" />
<img width="1458" height="590" alt="image" src="https://github.com/user-attachments/assets/47917477-9c39-483c-ba21-fbdcabe47378" />

# RELEASE NOTES - Shield for Android, Version 9.2.0, 2026-09-30

Shield for Android, version 9.2 includes a major update to Code Protect that
addresses an important security vulnerability while adding other Code Protect
feature improvements and configuration changes. Refer to the documentation for
help on upgrading:
https://docs.promon.io/code-protect-for-native/9.2.x/#upgrading-from-previous-versions

Version 9.2 also adds support for Insight for App Risk, AI Protect, and trusting
system-installed keyboards and screen readers. Additional improvements have been
made to Shield's code injection, hooking framework, and emulator detections.


## Upgrade Strategy

Version 9.2.0 is a Current release. If you are already using a Current version
(e.g., 9.1.1), then upgrade to this version. If your goal is to maintain
predictable stability, then stay on the Stable track (e.g., 9.0.1). Do not
upgrade to this version unless you specifically need one of the new features
described below.


## Highlights

* Major Code Protect changes

* Insight for App Risk

* AI Protect

* Security detection improvements

* Trusting system-installed keyboards and screen readers


## Security Notice 

This release builds on the Shield for Android hardening described in the Promon
security advisory of 9 September 2026. Upgrading to this version and
re-shielding your app enables code-injection detection automatically, with no
configuration needed. A small number of additional protections require an
explicit configuration step — review the following: 

* Code injection detection has been improved and is enabled by default. No
  configuration change is required. 

* For Code Protect licenses, the protection against memory dump attacks added in
  Promon Jigsaw v2.1.1 applies when both Section Encryption and Control Flow
  Obfuscation are enabled. Enable both in your Code Protect configuration. Refer
  to the documentation for details:
  https://docs.promon.io/code-protect-for-native/latest/

* The binding best practices further strengthen Shield's protection. Please
  refer to this for the recommended configuration: 
  https://docs.promon.io/shield-for-android/latest/rules/binding/#best-practices 


## Supported Platforms
 
* Shield is officially supported for Android versions 5.0 (API 21) through
  Android 17 (API 37).

* The Shielder tool is supported on 64-bit Java 17 on Windows 10, Mac OSX
  (10.9+), and Ubuntu Linux LTS 22.04 or 24.04.

* Shield Gradle Plugin version 3.0.x is supported. The plugin is available from
  Maven Central. Refer to the documentation for more details:
  https://docs.promon.io/gradle-plugin/latest/


## New Features

* Added the `trustSystemKeyboards` configuration option, which controls whether
  system-installed keyboards are trusted automatically when
  `checkTrustedKeyboard` is enabled. Defaults to `true`, which keeps the
  existing behavior. If set to `false`, then system keyboards must match an
  `addTrustedKeyboardSigner` entry like any third-party keyboard.
  _(Resolves issue SHAND-6055)_

* Added the `trustSystemScreenreaders` configuration option, which controls
  whether screen readers installed as system apps (e.g., TalkBack) are trusted
  automatically when `checkTrustedScreenreaders` is enabled. Defaults to `true`.
  If set to `false`, then system screen readers must match an
  `addTrustedScreenreaderSigner` entry like any third-party screen reader.

  This feature changes the default behavior for trusting screen readers. See
  "Changes and Deprecations" for more details.
  _(Resolves issue SHAND-6056)_

* For Code Protect licenses, the Promon Jigsaw engine has been upgraded to
  v2.1.1, which adds protection against memory dump attacks when both Section
  Encryption and Control Flow Abstraction are enabled.

* Shield now supports Insight for App Risk, a Promon Insight offering that lets
  you define risk scores for a scoreboard of suspicious devices.
  _(Resolves issue SHC-1020)_

* Shield now supports AI Protect, a Promon extension that protects the embedded
  AI models (e.g., vision, audio, and classifier models) in your app. 


## Fixes and Improvements

* Improved code injection detection to detect Vulkan layer injection, where a
  malicious Vulkan layer is used to inject code into the app.
  _(Resolves issue SHAND-5573)_

* Improved hooking framework detection to detect the Frida injection loader.
  _(Resolves issue SHAND-5926)_

* Improved emulator detection to detect Linux container-based emulators, such
  as VMOS.
  _(Resolves issue SHAND-6018)_

* Improved trusted keyboard checking to continue trusting a system installed
  keyboard after it has been updated.
  _(Resolves issue SHAND-6072)_

* Fixed an issue where protected apps would sometimes hang at launch on certain
  devices.
  _(Resolves issue SHAND-6030)_

* Fixed an issue with ActivityGuard where the app's splash screen could flicker
  or briefly disappear during launch on Android 12 and above.
  _(Resolves issue SHAND-6084)_

* Fixed an incorrect Kotlin dependency in the `ShieldSDK-activity-guard` Maven
  dependency, which resulted in a "Module was compiled with an incompatible
  version of Kotlin" error.
  _(Resolves issue SHAND-5927)_

* Fixed an issue where `bindingStyle` max limits were being applied globally
  instead of per method or class.
  _(Resolves issue INT-552)_

* For Promon Insight licenses, improved Shield's exiting behavior so that an
  immediate shutdown (set via the `shutdownImmediately` config option) no
  longer waits for pending Insight reporting to complete.
  _(Resolves issue SHAND-6185)_

* For Code Protect licenses, the Promon Jigsaw engine has been upgraded to
  v2.1.1, which includes the following improvements:

  * Improved the obfuscation of the decryption logic for Section Encryption.

  * Improved the security of Control Flow Abstraction for ARM by making it
    harder to exfiltrate its data.

  * Removed internal temporary file paths from the Shielder log output.

  * Failure to generate a protection report no longer halts the protection
    process.

  * Fixed an issue with Section Encryption not preserving utilized registers.

  * Fixed a potential runtime issue that could occur with Section Encryption
    executing stale instructions on arm64 binaries.

  * Fixed a protection settings failure when `integrityCheck` was specified
    without a `rules` array.

  * Fixed an overlapping blocks disassembly failure for arm32 and x86_64 Flutter
    binaries.

  * Fixed a non-string panic payload error that could appear when an internal
    failure occurred during protection.


## Changes and Deprecations

* Screen readers installed as system apps are now trusted by default when
  `checkTrustedScreenreaders` is enabled, without requiring an
  `addTrustedScreenreaderSigner` entry.
  
  To restore the previous behavior, set `trustSystemScreenreaders` to `false`
  and specify the list of known trustworthy screen readers. You can find
  `addTrustedScreenreaderSigner` suggestions in the packaged
  `config-template.xml` file.

* For Code Protect licenses, the following changes apply:

  * Configurations no longer use the `report` option. Native protection reports
    are now part of Shielder's integration reports.

  * The `stripping` config object is now called `debugStripping`.

  * The `sectionHeaders` and `sectionRules` options are removed from Debug
    Stripping and are now part of their own configuration object called
    `sectionHeaderStripping`.

  * The top-level `checksum` configuration, which was deprecated in an earlier
    version of Code Protect, is removed completely. `checksum` must now be
    specified as a child object under `controlFlow`.

  * The top-level `exclude` and `runtime_logs` options are removed.

  * The Section Encryption config options, `minimumRange` and `excludeRanges`,
    are removed.

  * Section Encryption's `sectionRules` option is now optional and can be
    omitted from configurations.

  * The `event` option for Integrity Checking has changed from a string to an
    array of strings/rules. For example, `"event": "_integrity_checked"` is now
    `"event": [ "_integrity_checked" ]`.

  * The syntax for configuration filter rules is now better defined, but this
    introduces the following possible breaking changes:

    * Inclusion rules must be specified first and exclusion rules specified
      last. For example: `[ "debug_*", "!*Test" ]`. Specifying these out of
      order (e.g., `[ "!*Test", "debug_*" ]`) is no longer valid.

    * To specify none, or no matches, use an empty array (i.e., `[]`). The
      previous syntax, `[ "!*" ]`, is no longer valid.


## Known Limitations

* Shield supports Android 17 but not its new post-quantum cryptography features,
  including ML-DSA keystore keys and v3.2 APK signature schemes. Using these
  features will result in a repackaging detection. Use classical keys and
  existing signature schemes for now. Support for these features will be added
  in a future release of Shield for Android.


## Other Notices

* Some virtual space apps use techniques similar to malware (e.g., native code
  hooking), which can trigger Shield security protections. As Shield's detection
  capabilities improve, additional virtual space apps might be restricted.


## Highlights from Previous Versions

### Version 9.1.1

* ANR fixes

* VPN callback fixes

### Version 9.1.0

* Improved startup performance

* Improved file integrity performance

* Native code hook false positives

### Version 9.0.0

* Android 17 support

* VMOS Cloud detection

* JNIEnv integrity checks

* New pull binding options

* Improved APK repackaging detection

* Improved hooking detection

* Virtual space deprecations

* Output filename change

<img width="1896" height="988" alt="image" src="https://github.com/user-attachments/assets/432fa3bc-766e-4e13-a7e9-b796824a06fe" />


Sonatype
Sonatype Nexus RepositoryOSS 3.70.1-02
Search components
Upload
Upload content to the hosted repository

Filter
URL	Select Row
analytics-artifacts	raw	


Arquitetura_TI	maven2	


artefato-prd	raw	


artefato-prd-snapshot	raw	


br	maven2	


caixa-adapters	raw	


caixa-adapters-zip	maven2	


caixa-apps	raw	


caixa-cartoes-maven-releases	maven2	


caixa-componentes-android	maven2	


caixa-componentes-topaz-android	maven2	


caixa-componentes-topaz-ios	raw	


caixa-dotnet-releases	raw	


caixa-dotnet-snapshots	raw	


caixa-habitacao-maven-releases	maven2	


caixa-ios-releases	raw	


caixa-ios-snapshots	raw	


caixa-libs	raw	


caixa-npm-releases	npm	


caixa-npm-snapshots	npm	


caixa-php-releases	raw	


caixa-php-snapshots	raw	


caixa-qa	raw	


caixa-qa-evidencia	raw	


caixa-qa-produtos	raw	


caixa-raw-evidence	raw	


caixa-raw-releases	raw	


caixa-raw-snapshots	raw	


caixa-raw-thirdparty	raw	


caixa-repo	maven2	


caixa-repo-dma-maven-releases	maven2	


caixa-repo-topaz	maven2	


Canais_Parceiros	maven2	


cepem	maven2	


cepem2	maven2	


curso-openshift	maven2	


design_system_caixa	npm	


dll-internal	raw	


Financeiro	maven2	


habitacao	maven2	


internet-banking	raw	


loterias	raw	


maven-releases	maven2	


npm-internal	npm	


npm-internal2	npm	


nuget-hosted	nuget	


nuget-release	nuget	


nuget-snapshot	nuget	


pip-hosted	pypi	


releases	maven2	


releases-pdgo	maven2	


s3-releases	maven2	


sa	maven2	


siavl	maven2	


SIBOT-motor-oracle	maven2	


SIFRS-MAP-PWC	raw	


SISRH-MAP-PWC	raw	


sp	maven2	


teste-openshift	maven2	


thirdparty	maven2	


yum-internal	yum	


yum-sitdf	yum	


ME AJDUA A FAZER ISSO



