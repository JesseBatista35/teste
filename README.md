# Uncomment the next line to define a global platform for your project
platform :ios, '12.0'

source 'https://download-ofd.apps.topazevolution.com/ios-cdn-specs'
source 'https://cdn.cocoapods.org'

target 'SIFAM' do
  # Comment the next line if you don't want to use dynamic frameworks
  use_frameworks!
  
  # Pods for SIFAM
  
  pod 'AppAuth'
  pod 'IBMMobileFirstPlatformFoundation'
  pod 'RxSwift'
  pod 'KeychainAccess'
  pod 'Arcane'
  pod 'SideMenu'
  pod 'TLCustomMask'
  pod 'SQLite.swift', '~> 0.14.0'
  pod 'SnapKit'
  pod 'AppCenter'
  pod 'AppCenter/Analytics'
  pod 'AppCenter/Crashes'
  pod 'Heartbeat', '~> 4.6.1'
  
  resources = 'SIFAM/**/*.{xib,xcassets,xcdatamodeld,strings}'
  
end
post_install do |installer|
  installer.pods_project.targets.each do |target|
    target.build_configurations.each do |config|
      config.build_settings['EXPANDED_CODE_SIGN_IDENTITY'] = ""
      config.build_settings['CODE_SIGNING_REQUIRED'] = "NO"
      config.build_settings['CODE_SIGNING_ALLOWED'] = "NO"
      config.build_settings['ONLY_ACTIVE_ARCH'] = "YES"
      config.build_settings['IPHONEOS_DEPLOYMENT_TARGET'] = '12.0'
    end
  end
end
