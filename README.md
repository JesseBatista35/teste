estava olhando a branch main pessoal da comunicdade me passou essa branhc e o PodFili ta ssim ver se precisa de algum ajuste

platform :ios, '15.6'

source 'https://cdn.cocoapods.org'

# Heartbeat
source 'https://' + ENV['HEARTBEAT_AWS_CODECOMMIT_USERNAME'] + ':' + ENV['HEARTBEAT_AWS_CODECOMMIT_URLENCODED_PASSWORD'] + '@' + ENV['HEARTBEAT_AWS_CODECOMMIT_REPO_URL']

target 'SIFAM' do
  # Comment the next line if you don't want to use dynamic frameworks
  use_frameworks!
  
  # Pods for SIFAM
  pod 'AppAuth'
  pod 'RxSwift'
  pod 'RxCocoa'
  pod 'RxDataSources'
  pod 'KeychainAccess'
  pod 'Arcane'
  pod 'SideMenu'
  pod 'TLCustomMask'
  pod 'SQLite.swift', '~> 0.14.0'
  pod 'SnapKit'
  pod 'AppCenter'
  pod 'AppCenter/Analytics'
  pod 'AppCenter/Crashes'
  pod 'Heartbeat'
  pod 'XID', :path => File.expand_path('libs/XID', __dir__)
  
  resources = 'SIFAM/**/*.{xib,xcassets,xcdatamodeld,strings}'
end

post_install do |installer|
  
  api_key = ENV['SD_KEY_BIOMETRIA']
  puts "SD_KEY_BIOMETRIA = #{api_key}"
  
  installer.generated_projects.each do |project|
    project.targets.each do |target|
      target.build_configurations.each do |config|
        config.build_settings['IPHONEOS_DEPLOYMENT_TARGET'] = '15.6'
      end
    end
  end

  installer.pods_project.targets.each do |target|
    target.build_configurations.each do |config|
      config.build_settings['EXPANDED_CODE_SIGN_IDENTITY'] = ""
      config.build_settings['CODE_SIGNING_REQUIRED'] = "NO"
      config.build_settings['CODE_SIGNING_ALLOWED'] = "NO"
      config.build_settings['ONLY_ACTIVE_ARCH'] = "YES"
      config.build_settings['IPHONEOS_DEPLOYMENT_TARGET'] = '15.6'
      config.build_settings['DEBUG_INFORMATION_FORMAT'] = 'dwarf'
      config.build_settings['BUILD_LIBRARY_FOR_DISTRIBUTION'] = 'YES'

      if config.name == 'Debug'
        config.build_settings['OTHER_SWIFT_FLAGS'] = ['$(inherited)', '-Onone']
        config.build_settings['SWIFT_OPTIMIZATION_LEVEL'] = '-Owholemodule'
      end
    end
  end

  require 'xcodeproj'
  project_path = File.join(File.dirname(__FILE__), 'SIFAM.xcodeproj')
  project = Xcodeproj::Project.open(project_path)
  project.targets.select { |t| t.name == 'SIFAM' }.each do |target|
    target.build_configurations.each do |config|
      config.build_settings['EXCLUDED_ARCHS[sdk=iphonesimulator*]'] = 'arm64'
    end
  end
  project.save
end
