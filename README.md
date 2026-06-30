2026-06-30T19:29:27.2969920Z ##[section]Starting: Exporta SD_KEY_BIOMETRIA
2026-06-30T19:29:27.2979360Z ==============================================================================
2026-06-30T19:29:27.2979620Z Task         : Bash
2026-06-30T19:29:27.2979730Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-06-30T19:29:27.2979920Z Version      : 3.274.1
2026-06-30T19:29:27.2980030Z Author       : Microsoft Corporation
2026-06-30T19:29:27.2980180Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-06-30T19:29:27.2980360Z ==============================================================================
2026-06-30T19:29:27.4689120Z Generating script.
2026-06-30T19:29:27.4699730Z ========================== Starting Command Output ===========================
2026-06-30T19:29:27.4708510Z [command]/bin/bash /Users/runner/work/_temp/b82b52b9-af40-4300-89bf-d703cbcccbab.sh
2026-06-30T19:29:27.4775200Z  SD_KEY_BIOMETRIA = ***
2026-06-30T19:29:30.9058100Z Analyzing dependencies
2026-06-30T19:29:31.1279190Z 
2026-06-30T19:29:31.2162530Z ――― MARKDOWN TEMPLATE ―――――――――――――――――――――――――――――――――――――――――――――――――――――――――――
2026-06-30T19:29:31.2481230Z 
2026-06-30T19:29:31.3097670Z ### Command
2026-06-30T19:29:31.3192200Z 
2026-06-30T19:29:31.3199600Z ```
2026-06-30T19:29:31.3209100Z /usr/local/lib/ruby/gems/3.4.0/bin/pod install --project-directory=/Users/runner/work/r1/a/_SIFAM-iOS-Nativo
2026-06-30T19:29:31.3363030Z ```
2026-06-30T19:29:31.3365120Z 
2026-06-30T19:29:31.3918020Z ### Report
2026-06-30T19:29:31.3952850Z 
2026-06-30T19:29:31.3979580Z * What did you do?
2026-06-30T19:29:31.3992490Z 
2026-06-30T19:29:31.4019630Z * What did you expect to happen?
2026-06-30T19:29:31.4042830Z 
2026-06-30T19:29:31.4050250Z * What happened instead?
2026-06-30T19:29:31.4057360Z 
2026-06-30T19:29:31.4066160Z 
2026-06-30T19:29:31.4073980Z ### Stack
2026-06-30T19:29:31.4084810Z 
2026-06-30T19:29:31.4101430Z ```
2026-06-30T19:29:31.4111000Z    CocoaPods : 1.16.2
2026-06-30T19:29:31.4134000Z         Ruby : ruby 3.4.9 (2026-03-11 revision 76cca827ab) +PRISM [x86_64-darwin23]
2026-06-30T19:29:31.4151190Z     RubyGems : 4.0.14
2026-06-30T19:29:31.4158500Z         Host : macOS 26.4 (25E246)
2026-06-30T19:29:31.4190030Z        Xcode : 26.5 (17F42)
2026-06-30T19:29:31.4195750Z          Git : git version 2.54.0
2026-06-30T19:29:31.4213550Z Ruby lib dir : /usr/local/Cellar/ruby@3.4/3.4.9/lib
2026-06-30T19:29:31.4236940Z Repositories : 
2026-06-30T19:29:31.4265320Z ```
2026-06-30T19:29:31.4290230Z 
2026-06-30T19:29:31.4318940Z ### Plugins
2026-06-30T19:29:31.4401970Z 
2026-06-30T19:29:31.4506650Z ```
2026-06-30T19:29:31.4508780Z cocoapods-deintegrate : 1.0.5
2026-06-30T19:29:31.4512610Z cocoapods-plugins     : 1.0.0
2026-06-30T19:29:31.4555610Z cocoapods-s3-download : 0.0.3
2026-06-30T19:29:31.4580070Z cocoapods-search      : 1.0.1
2026-06-30T19:29:31.4585430Z cocoapods-trunk       : 1.6.0
2026-06-30T19:29:31.4626910Z cocoapods-try         : 1.2.0
2026-06-30T19:29:31.4643880Z ```
2026-06-30T19:29:31.4654500Z 
2026-06-30T19:29:31.4666260Z ### Podfile
2026-06-30T19:29:31.4672580Z 
2026-06-30T19:29:31.4682640Z ```ruby
2026-06-30T19:29:31.4688210Z platform :ios, '15.6'
2026-06-30T19:29:31.4710550Z 
2026-06-30T19:29:31.4716970Z source 'https://download-ofd.apps.topazevolution.com/ios-cdn-specs'
2026-06-30T19:29:31.4728700Z source 'https://cdn.cocoapods.org'
2026-06-30T19:29:31.4741390Z 
2026-06-30T19:29:31.4760500Z # Heartbeat
2026-06-30T19:29:31.4772900Z # source 'https://' + ENV['HEARTBEAT_AWS_CODECOMMIT_USERNAME'] + ':' + ENV['HEARTBEAT_AWS_CODECOMMIT_URLENCODED_PASSWORD'] + '@' + ENV['HEARTBEAT_AWS_CODECOMMIT_REPO_URL']
2026-06-30T19:29:31.4787670Z 
2026-06-30T19:29:31.4794920Z target 'SIFAM' do
2026-06-30T19:29:31.4801690Z   # Comment the next line if you don't want to use dynamic frameworks
2026-06-30T19:29:31.4827390Z   use_frameworks!
2026-06-30T19:29:31.4837990Z   
2026-06-30T19:29:31.4858640Z   # Pods for SIFAM
2026-06-30T19:29:31.4880990Z   pod 'AppAuth'
2026-06-30T19:29:31.4890450Z   pod 'RxSwift'
2026-06-30T19:29:31.4910820Z   pod 'RxCocoa'
2026-06-30T19:29:31.4939270Z   pod 'RxDataSources'
2026-06-30T19:29:31.4969390Z   pod 'KeychainAccess'
2026-06-30T19:29:31.4986080Z   pod 'Arcane'
2026-06-30T19:29:31.5008270Z   pod 'SideMenu'
2026-06-30T19:29:31.5024810Z   pod 'TLCustomMask'
2026-06-30T19:29:31.5048430Z   pod 'SQLite.swift', '~> 0.14.0'
2026-06-30T19:29:31.5060780Z   pod 'SnapKit'
2026-06-30T19:29:31.5094290Z   pod 'AppCenter'
2026-06-30T19:29:31.5128070Z   pod 'AppCenter/Analytics'
2026-06-30T19:29:31.5143060Z   pod 'AppCenter/Crashes'
2026-06-30T19:29:31.5150110Z   pod 'Heartbeat'
2026-06-30T19:29:31.5165090Z   pod 'XID', :path => File.expand_path('libs/XID', __dir__)
2026-06-30T19:29:31.5183010Z   
2026-06-30T19:29:31.5191870Z   resources = 'SIFAM/**/*.{xib,xcassets,xcdatamodeld,strings}'
2026-06-30T19:29:31.5202280Z end
2026-06-30T19:29:31.5215660Z 
2026-06-30T19:29:31.5232240Z post_install do |installer|
2026-06-30T19:29:31.5242830Z   
2026-06-30T19:29:31.5268010Z   api_key = ENV['SD_KEY_BIOMETRIA']
2026-06-30T19:29:31.5270590Z   puts "SD_KEY_BIOMETRIA = #{api_key}"
2026-06-30T19:29:31.5277900Z   
2026-06-30T19:29:31.5289350Z   installer.generated_projects.each do |project|
2026-06-30T19:29:31.5304150Z     project.targets.each do |target|
2026-06-30T19:29:31.5318550Z       target.build_configurations.each do |config|
2026-06-30T19:29:31.5340400Z         config.build_settings['IPHONEOS_DEPLOYMENT_TARGET'] = '15.6'
2026-06-30T19:29:31.5354910Z       end
2026-06-30T19:29:31.5368130Z     end
2026-06-30T19:29:31.5380520Z   end
2026-06-30T19:29:31.5384490Z 
2026-06-30T19:29:31.5404630Z   installer.pods_project.targets.each do |target|
2026-06-30T19:29:31.5414460Z     target.build_configurations.each do |config|
2026-06-30T19:29:31.5434960Z       config.build_settings['EXPANDED_CODE_SIGN_IDENTITY'] = ""
2026-06-30T19:29:31.5441710Z       config.build_settings['CODE_SIGNING_REQUIRED'] = "NO"
2026-06-30T19:29:31.5463220Z       config.build_settings['CODE_SIGNING_ALLOWED'] = "NO"
2026-06-30T19:29:31.5463850Z       config.build_settings['ONLY_ACTIVE_ARCH'] = "YES"
2026-06-30T19:29:31.5495230Z       config.build_settings['IPHONEOS_DEPLOYMENT_TARGET'] = '15.6'
2026-06-30T19:29:31.5527500Z       config.build_settings['DEBUG_INFORMATION_FORMAT'] = 'dwarf'
2026-06-30T19:29:31.5540940Z       config.build_settings['BUILD_LIBRARY_FOR_DISTRIBUTION'] = 'YES'
2026-06-30T19:29:31.5557790Z 
2026-06-30T19:29:31.5566990Z       if config.name == 'Debug'
2026-06-30T19:29:31.5569090Z         config.build_settings['OTHER_SWIFT_FLAGS'] = ['$(inherited)', '-Onone']
2026-06-30T19:29:31.5596230Z         config.build_settings['SWIFT_OPTIMIZATION_LEVEL'] = '-Owholemodule'
2026-06-30T19:29:31.5605830Z       end
2026-06-30T19:29:31.5625290Z     end
2026-06-30T19:29:31.5631440Z   end
2026-06-30T19:29:31.5654870Z 
2026-06-30T19:29:31.5667680Z   require 'xcodeproj'
2026-06-30T19:29:31.5675560Z   project_path = File.join(File.dirname(__FILE__), 'SIFAM.xcodeproj')
2026-06-30T19:29:31.5690000Z   project = Xcodeproj::Project.open(project_path)
2026-06-30T19:29:31.5697490Z   project.targets.select { |t| t.name == 'SIFAM' }.each do |target|
2026-06-30T19:29:31.5705080Z     target.build_configurations.each do |config|
2026-06-30T19:29:31.5705560Z       config.build_settings['EXCLUDED_ARCHS[sdk=iphonesimulator*]'] = 'arm64'
2026-06-30T19:29:31.5705930Z     end
2026-06-30T19:29:31.5706200Z   end
2026-06-30T19:29:31.5706480Z   project.save
2026-06-30T19:29:31.5706750Z end
2026-06-30T19:29:31.5707010Z ```
2026-06-30T19:29:31.5707100Z 
2026-06-30T19:29:31.5707430Z ### Error
2026-06-30T19:29:31.5707530Z 
2026-06-30T19:29:31.5707780Z ```
2026-06-30T19:29:31.5708150Z Nanaimo::Reader::ParseError - [!] Invalid character ";" in unquoted string
2026-06-30T19:29:31.5708560Z     #  -------------------------------------------
2026-06-30T19:29:31.5708910Z     #  					"@executable_path/Frameworks",
2026-06-30T19:29:31.5709240Z     #  				);
2026-06-30T19:29:31.5709530Z 2418>  				MARKETING_VERSION = ;
2026-06-30T19:29:31.5709830Z        				                    ^
2026-06-30T19:29:31.5710110Z     #  				MTL_ENABLE_DEBUG_INFO = NO;
2026-06-30T19:29:31.5710920Z     #  				PRODUCT_BUNDLE_IDENTIFIER = br.gov.caixa.bolsafamilia;
2026-06-30T19:29:31.5711310Z     #  -------------------------------------------
2026-06-30T19:29:31.5711490Z 
2026-06-30T19:29:31.5711900Z /usr/local/lib/ruby/gems/3.4.0/gems/nanaimo-0.4.0/lib/nanaimo/reader.rb:284:in 'Nanaimo::Reader#raise_parser_error'
2026-06-30T19:29:31.5712440Z /usr/local/lib/ruby/gems/3.4.0/gems/nanaimo-0.4.0/lib/nanaimo/reader.rb:150:in 'Nanaimo::Reader#parse_string'
2026-06-30T19:29:31.5712970Z /usr/local/lib/ruby/gems/3.4.0/gems/nanaimo-0.4.0/lib/nanaimo/reader.rb:140:in 'Nanaimo::Reader#parse_object'
2026-06-30T19:29:31.5713610Z /usr/local/lib/ruby/gems/3.4.0/gems/nanaimo-0.4.0/lib/nanaimo/reader.rb:193:in 'Nanaimo::Reader#parse_dictionary'
2026-06-30T19:29:31.5717460Z /usr/local/lib/ruby/gems/3.4.0/gems/nanaimo-0.4.0/lib/nanaimo/reader.rb:132:in 'Nanaimo::Reader#parse_object'
2026-06-30T19:29:31.5752210Z /usr/local/lib/ruby/gems/3.4.0/gems/nanaimo-0.4.0/lib/nanaimo/reader.rb:193:in 'Nanaimo::Reader#parse_dictionary'
2026-06-30T19:29:31.5794310Z /usr/local/lib/ruby/gems/3.4.0/gems/nanaimo-0.4.0/lib/nanaimo/reader.rb:132:in 'Nanaimo::Reader#parse_object'
2026-06-30T19:29:31.5795610Z /usr/local/lib/ruby/gems/3.4.0/gems/nanaimo-0.4.0/lib/nanaimo/reader.rb:193:in 'Nanaimo::Reader#parse_dictionary'
2026-06-30T19:29:31.5829440Z /usr/local/lib/ruby/gems/3.4.0/gems/nanaimo-0.4.0/lib/nanaimo/reader.rb:132:in 'Nanaimo::Reader#parse_object'
2026-06-30T19:29:31.5861130Z /usr/local/lib/ruby/gems/3.4.0/gems/nanaimo-0.4.0/lib/nanaimo/reader.rb:193:in 'Nanaimo::Reader#parse_dictionary'
2026-06-30T19:29:31.5871530Z /usr/local/lib/ruby/gems/3.4.0/gems/nanaimo-0.4.0/lib/nanaimo/reader.rb:132:in 'Nanaimo::Reader#parse_object'
2026-06-30T19:29:31.5885660Z /usr/local/lib/ruby/gems/3.4.0/gems/nanaimo-0.4.0/lib/nanaimo/reader.rb:107:in 'Nanaimo::Reader#parse!'
2026-06-30T19:29:31.5912650Z /usr/local/lib/ruby/gems/3.4.0/gems/xcodeproj-1.27.0/lib/xcodeproj/plist.rb:27:in 'Xcodeproj::Plist.read_from_path'
2026-06-30T19:29:31.5925520Z /usr/local/lib/ruby/gems/3.4.0/gems/xcodeproj-1.27.0/lib/xcodeproj/project.rb:211:in 'Xcodeproj::Project#initialize_from_file'
2026-06-30T19:29:31.5937660Z /usr/local/lib/ruby/gems/3.4.0/gems/xcodeproj-1.27.0/lib/xcodeproj/project.rb:113:in 'Xcodeproj::Project.open'
2026-06-30T19:29:31.5941770Z /usr/local/lib/ruby/gems/3.4.0/gems/cocoapods-1.16.2/lib/cocoapods/installer/analyzer.rb:1194:in 'block (2 levels) in Pod::Installer::Analyzer#inspect_targets_to_integrate'
2026-06-30T19:29:31.5953880Z /usr/local/lib/ruby/gems/3.4.0/gems/cocoapods-1.16.2/lib/cocoapods/installer/analyzer.rb:1193:in 'Hash#each'
2026-06-30T19:29:31.5971490Z /usr/local/lib/ruby/gems/3.4.0/gems/cocoapods-1.16.2/lib/cocoapods/installer/analyzer.rb:1193:in 'block in Pod::Installer::Analyzer#inspect_targets_to_integrate'
2026-06-30T19:29:31.5989950Z /usr/local/lib/ruby/gems/3.4.0/gems/cocoapods-1.16.2/lib/cocoapods/user_interface.rb:64:in 'Pod::UserInterface.section'
2026-06-30T19:29:31.6008370Z /usr/local/lib/ruby/gems/3.4.0/gems/cocoapods-1.16.2/lib/cocoapods/installer/analyzer.rb:1188:in 'Pod::Installer::Analyzer#inspect_targets_to_integrate'
2026-06-30T19:29:31.6018990Z /usr/local/lib/ruby/gems/3.4.0/gems/cocoapods-1.16.2/lib/cocoapods/installer/analyzer.rb:107:in 'Pod::Installer::Analyzer#analyze'
2026-06-30T19:29:31.6038680Z /usr/local/lib/ruby/gems/3.4.0/gems/cocoapods-1.16.2/lib/cocoapods/installer.rb:422:in 'Pod::Installer#analyze'
2026-06-30T19:29:31.6041030Z /usr/local/lib/ruby/gems/3.4.0/gems/cocoapods-1.16.2/lib/cocoapods/installer.rb:244:in 'block in Pod::Installer#resolve_dependencies'
2026-06-30T19:29:31.6065350Z /usr/local/lib/ruby/gems/3.4.0/gems/cocoapods-1.16.2/lib/cocoapods/user_interface.rb:64:in 'Pod::UserInterface.section'
2026-06-30T19:29:31.6098380Z /usr/local/lib/ruby/gems/3.4.0/gems/cocoapods-1.16.2/lib/cocoapods/installer.rb:243:in 'Pod::Installer#resolve_dependencies'
2026-06-30T19:29:31.6109350Z /usr/local/lib/ruby/gems/3.4.0/gems/cocoapods-1.16.2/lib/cocoapods/installer.rb:162:in 'Pod::Installer#install!'
2026-06-30T19:29:31.6125700Z /usr/local/lib/ruby/gems/3.4.0/gems/cocoapods-1.16.2/lib/cocoapods/command/install.rb:52:in 'Pod::Command::Install#run'
2026-06-30T19:29:31.6134980Z /usr/local/lib/ruby/gems/3.4.0/gems/claide-1.1.0/lib/claide/command.rb:334:in 'CLAide::Command.run'
2026-06-30T19:29:31.6142830Z /usr/local/lib/ruby/gems/3.4.0/gems/cocoapods-1.16.2/lib/cocoapods/command.rb:52:in 'Pod::Command.run'
2026-06-30T19:29:31.6165150Z /usr/local/lib/ruby/gems/3.4.0/gems/cocoapods-1.16.2/bin/pod:55:in '<top (required)>'
2026-06-30T19:29:31.6178150Z /usr/local/lib/ruby/site_ruby/3.4.0/rubygems.rb:305:in 'Kernel#load'
2026-06-30T19:29:31.6196750Z /usr/local/lib/ruby/site_ruby/3.4.0/rubygems.rb:305:in 'Gem.activate_and_load_bin_path'
2026-06-30T19:29:31.6212970Z /usr/local/lib/ruby/gems/3.4.0/bin/pod:25:in '<main>'
2026-06-30T19:29:31.6236630Z ```
2026-06-30T19:29:31.6248910Z 
2026-06-30T19:29:31.6265940Z ――― TEMPLATE END ――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――
2026-06-30T19:29:31.6282750Z 
2026-06-30T19:29:31.6285930Z [!] Oh no, an error occurred.
2026-06-30T19:29:31.6311780Z 
2026-06-30T19:29:31.6320460Z Search for existing GitHub issues similar to yours:
2026-06-30T19:29:31.6339570Z https://github.com/CocoaPods/CocoaPods/search?q=%5B%21%5D+Invalid+character+%22%3B%22+in+unquoted+string%0A++++%23++-------------------------------------------%0A++++%23++%09%09%09%09%09%22%40executable_path%2FFrameworks%22%2C%0A++++%23++%09%09%09%09%29%3B%0A2418%3E++%09%09%09%09MARKETING_VERSION+%3D+%3B%0A+++++++%09%09%09%09++++++++++++++++++++%5E%0A++++%23++%09%09%09%09MTL_ENABLE_DEBUG_INFO+%3D+NO%3B%0A++++%23++%09%09%09%09PRODUCT_BUNDLE_IDENTIFIER+%3D+br.gov.caixa.bolsafamilia%3B%0A++++%23++-------------------------------------------%0A&type=Issues
2026-06-30T19:29:31.6362500Z 
2026-06-30T19:29:31.6376810Z If none exists, create a ticket, with the template displayed above, on:
2026-06-30T19:29:31.6403380Z https://github.com/CocoaPods/CocoaPods/issues/new
2026-06-30T19:29:31.6424090Z 
2026-06-30T19:29:31.6431720Z Be sure to first read the contributing guide for details on how to properly submit a ticket:
2026-06-30T19:29:31.6435930Z https://github.com/CocoaPods/CocoaPods/blob/master/CONTRIBUTING.md
