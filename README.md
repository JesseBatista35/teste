PODFILE TEM ISSO

# Uncomment the next line to define a global platform for your project
platform :ios, '12.0'

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





E PODFILI.LOCK TEM ISSO

PODS:
  - AppAuth (1.6.0):
    - AppAuth/Core (= 1.6.0)
    - AppAuth/ExternalUserAgent (= 1.6.0)
  - AppAuth/Core (1.6.0)
  - AppAuth/ExternalUserAgent (1.6.0):
    - AppAuth/Core
  - AppCenter (5.0.3):
    - AppCenter/Analytics (= 5.0.3)
    - AppCenter/Crashes (= 5.0.3)
  - AppCenter/Analytics (5.0.3):
    - AppCenter/Core
  - AppCenter/Core (5.0.3)
  - AppCenter/Crashes (5.0.3):
    - AppCenter/Core
  - Arcane (2.1)
  - IBMMobileFirstPlatformFoundation (8.0.2021122816)
  - KeychainAccess (4.2.2)
  - RxSwift (6.5.0)
  - SideMenu (6.5.0)
  - SnapKit (5.6.0)
  - SQLite.swift (0.14.1):
    - SQLite.swift/standard (= 0.14.1)
  - SQLite.swift/standard (0.14.1)
  - TLCustomMask (2.0.0)

DEPENDENCIES:
  - AppAuth
  - AppCenter
  - AppCenter/Analytics
  - AppCenter/Crashes
  - Arcane
  - IBMMobileFirstPlatformFoundation
  - KeychainAccess
  - RxSwift
  - SideMenu
  - SnapKit
  - SQLite.swift (~> 0.14.0)
  - TLCustomMask

SPEC REPOS:
  trunk:
    - AppAuth
    - AppCenter
    - Arcane
    - IBMMobileFirstPlatformFoundation
    - KeychainAccess
    - RxSwift
    - SideMenu
    - SnapKit
    - SQLite.swift
    - TLCustomMask

SPEC CHECKSUMS:
  AppAuth: 8fca6b5563a5baef2c04bee27538025e4ceb2add
  AppCenter: a4070ec3d4418b5539067a51f57155012e486ebd
  Arcane: 3a2e2f773a112911693ad4dcf4bec4293fac63e7
  IBMMobileFirstPlatformFoundation: c30a5db9fac08e54e944a0b9cc9e565aea39f1b1
  KeychainAccess: c0c4f7f38f6fc7bbe58f5702e25f7bd2f65abf51
  RxSwift: 5710a9e6b17f3c3d6e40d6e559b9fa1e813b2ef8
  SideMenu: f583187d21c5b1dd04c72002be544b555a2627a2
  SnapKit: e01d52ebb8ddbc333eefe2132acf85c8227d9c25
  SQLite.swift: 2992550ebf3c5b268bf4352603e3df87d2a4ed72
  TLCustomMask: 32bcd873851167c2d2a3726b048766b737873710

PODFILE CHECKSUM: 70c928ebe09bf521fe35f6808e7f83d4819df05d

COCOAPODS: 1.12.1
