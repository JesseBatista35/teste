2026-06-29T14:22:03.8698720Z ##[section]Starting: Exporta SD_KEY_BIOMETRIA
2026-06-29T14:22:03.8727570Z ==============================================================================
2026-06-29T14:22:03.8728340Z Task         : Bash
2026-06-29T14:22:03.8728540Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-06-29T14:22:03.8728870Z Version      : 3.274.1
2026-06-29T14:22:03.8729070Z Author       : Microsoft Corporation
2026-06-29T14:22:03.8729340Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-06-29T14:22:03.8729710Z ==============================================================================
2026-06-29T14:22:04.4375600Z Generating script.
2026-06-29T14:22:04.4395360Z ========================== Starting Command Output ===========================
2026-06-29T14:22:04.4448650Z [command]/bin/bash /Users/runner/work/_temp/b64bd567-763b-4d82-abd5-a78badd6cb1e.sh
2026-06-29T14:22:04.4496640Z  SD_KEY_BIOMETRIA = ***
2026-06-29T14:22:15.6362880Z Analyzing dependencies
2026-06-29T14:22:16.1139960Z 
2026-06-29T14:22:16.1557200Z ――― MARKDOWN TEMPLATE ―――――――――――――――――――――――――――――――――――――――――――――――――――――――――――
2026-06-29T14:22:16.1557910Z 
2026-06-29T14:22:16.1558450Z ### Command
2026-06-29T14:22:16.1558690Z 
2026-06-29T14:22:16.1559420Z ```
2026-06-29T14:22:16.1560260Z /usr/local/lib/ruby/gems/3.4.0/bin/pod install --project-directory=/Users/runner/work/r1/a/_SIFAM-iOS-Nativo
2026-06-29T14:22:16.1560960Z ```
2026-06-29T14:22:16.1561130Z 
2026-06-29T14:22:16.1565070Z ### Report
2026-06-29T14:22:16.1565320Z 
2026-06-29T14:22:16.1565800Z * What did you do?
2026-06-29T14:22:16.1565980Z 
2026-06-29T14:22:16.1566470Z * What did you expect to happen?
2026-06-29T14:22:16.1566680Z 
2026-06-29T14:22:16.1567170Z * What happened instead?
2026-06-29T14:22:16.1567430Z 
2026-06-29T14:22:16.1567570Z 
2026-06-29T14:22:16.1568170Z ### Stack
2026-06-29T14:22:16.1568460Z 
2026-06-29T14:22:16.1569630Z ```
2026-06-29T14:22:16.1570930Z    CocoaPods : 1.16.2
2026-06-29T14:22:16.1571510Z         Ruby : ruby 3.4.9 (2026-03-11 revision 76cca827ab) +PRISM [x86_64-darwin23]
2026-06-29T14:22:16.1572010Z     RubyGems : 4.0.14
2026-06-29T14:22:16.1572500Z         Host : macOS 26.4 (25E246)
2026-06-29T14:22:16.1573220Z        Xcode : 26.5 (17F42)
2026-06-29T14:22:16.1573620Z          Git : git version 2.54.0
2026-06-29T14:22:16.1574050Z Ruby lib dir : /usr/local/Cellar/ruby@3.4/3.4.9/lib
2026-06-29T14:22:16.1574470Z Repositories : 
2026-06-29T14:22:16.1574820Z ```
2026-06-29T14:22:16.1574970Z 
2026-06-29T14:22:16.1575310Z ### Plugins
2026-06-29T14:22:16.1575440Z 
2026-06-29T14:22:16.1584610Z ```
2026-06-29T14:22:16.1585410Z cocoapods-deintegrate : 1.0.5
2026-06-29T14:22:16.1586310Z cocoapods-plugins     : 1.0.0
2026-06-29T14:22:16.1587240Z cocoapods-s3-download : 0.0.3
2026-06-29T14:22:16.1588110Z cocoapods-search      : 1.0.1
2026-06-29T14:22:16.1588610Z cocoapods-trunk       : 1.6.0
2026-06-29T14:22:16.1589280Z cocoapods-try         : 1.2.0
2026-06-29T14:22:16.1589780Z ```
2026-06-29T14:22:16.1589930Z 
2026-06-29T14:22:16.1590390Z ### Podfile
2026-06-29T14:22:16.1590620Z 
2026-06-29T14:22:16.1591110Z ```ruby
2026-06-29T14:22:16.1591880Z platform :ios, '15.6'
2026-06-29T14:22:16.1592090Z 
2026-06-29T14:22:16.1592620Z source 'https://cdn.cocoapods.org'
2026-06-29T14:22:16.1592880Z 
2026-06-29T14:22:16.1593430Z # Heartbeat
2026-06-29T14:22:16.1594660Z source 'https://' + ENV['HEARTBEAT_AWS_CODECOMMIT_USERNAME'] + ':' + ENV['HEARTBEAT_AWS_CODECOMMIT_URLENCODED_PASSWORD'] + '@' + ENV['HEARTBEAT_AWS_CODECOMMIT_REPO_URL']
2026-06-29T14:22:16.1595200Z 
2026-06-29T14:22:16.1595690Z target 'SIFAM' do
2026-06-29T14:22:16.1596280Z   # Comment the next line if you don't want to use dynamic frameworks
2026-06-29T14:22:16.1597720Z   use_frameworks!
2026-06-29T14:22:16.1598200Z   
2026-06-29T14:22:16.1598580Z   # Pods for SIFAM
2026-06-29T14:22:16.1598950Z   pod 'AppAuth'
2026-06-29T14:22:16.1599620Z   pod 'RxSwift'
2026-06-29T14:22:16.1600090Z   pod 'RxCocoa'
2026-06-29T14:22:16.1600730Z   pod 'RxDataSources'
2026-06-29T14:22:16.1601560Z   pod 'KeychainAccess'
2026-06-29T14:22:16.1603490Z   pod 'Arcane'
2026-06-29T14:22:16.1604080Z   pod 'SideMenu'
2026-06-29T14:22:16.1604760Z   pod 'TLCustomMask'
2026-06-29T14:22:16.1605370Z   pod 'SQLite.swift', '~> 0.14.0'
2026-06-29T14:22:16.1606030Z   pod 'SnapKit'
2026-06-29T14:22:16.1606720Z   pod 'AppCenter'
2026-06-29T14:22:16.1607260Z   pod 'AppCenter/Analytics'
2026-06-29T14:22:16.1607790Z   pod 'AppCenter/Crashes'
2026-06-29T14:22:16.1608290Z   pod 'Heartbeat'
2026-06-29T14:22:16.1608870Z   pod 'XID', :path => File.expand_path('libs/XID', __dir__)
2026-06-29T14:22:16.1609620Z   
2026-06-29T14:22:16.1610380Z   resources = 'SIFAM/**/*.{xib,xcassets,xcdatamodeld,strings}'
2026-06-29T14:22:16.1611370Z end
2026-06-29T14:22:16.1611560Z 
2026-06-29T14:22:16.1612180Z post_install do |installer|
2026-06-29T14:22:16.1612710Z   
2026-06-29T14:22:16.1613200Z   api_key = ENV['SD_KEY_BIOMETRIA']
2026-06-29T14:22:16.1613740Z   puts "SD_KEY_BIOMETRIA = #{api_key}"
2026-06-29T14:22:16.1614200Z   
2026-06-29T14:22:16.1614720Z   installer.generated_projects.each do |project|
2026-06-29T14:22:16.1615380Z     project.targets.each do |target|
2026-06-29T14:22:16.1616390Z       target.build_configurations.each do |config|
2026-06-29T14:22:16.1617090Z         config.build_settings['IPHONEOS_DEPLOYMENT_TARGET'] = '15.6'
2026-06-29T14:22:16.1617670Z       end
2026-06-29T14:22:16.1618500Z     end
2026-06-29T14:22:16.1618980Z   end
2026-06-29T14:22:16.1619150Z 
2026-06-29T14:22:16.1620070Z   installer.pods_project.targets.each do |target|
2026-06-29T14:22:16.1621300Z     target.build_configurations.each do |config|
2026-06-29T14:22:16.1622140Z       config.build_settings['EXPANDED_CODE_SIGN_IDENTITY'] = ""
2026-06-29T14:22:16.1622660Z       config.build_settings['CODE_SIGNING_REQUIRED'] = "NO"
2026-06-29T14:22:16.1623510Z       config.build_settings['CODE_SIGNING_ALLOWED'] = "NO"
2026-06-29T14:22:16.1624370Z       config.build_settings['ONLY_ACTIVE_ARCH'] = "YES"
2026-06-29T14:22:16.1624920Z       config.build_settings['IPHONEOS_DEPLOYMENT_TARGET'] = '15.6'
2026-06-29T14:22:16.1625460Z       config.build_settings['DEBUG_INFORMATION_FORMAT'] = 'dwarf'
2026-06-29T14:22:16.1626350Z       config.build_settings['BUILD_LIBRARY_FOR_DISTRIBUTION'] = 'YES'
2026-06-29T14:22:16.1626640Z 
2026-06-29T14:22:16.1627000Z       if config.name == 'Debug'
2026-06-29T14:22:16.1627480Z         config.build_settings['OTHER_SWIFT_FLAGS'] = ['$(inherited)', '-Onone']
2026-06-29T14:22:16.1628040Z         config.build_settings['SWIFT_OPTIMIZATION_LEVEL'] = '-Owholemodule'
2026-06-29T14:22:16.1628480Z       end
2026-06-29T14:22:16.1628800Z     end
2026-06-29T14:22:16.1629220Z   end
2026-06-29T14:22:16.1629360Z 
2026-06-29T14:22:16.1629740Z   require 'xcodeproj'
2026-06-29T14:22:16.1630570Z   project_path = File.join(File.dirname(__FILE__), 'SIFAM.xcodeproj')
2026-06-29T14:22:16.1631170Z   project = Xcodeproj::Project.open(project_path)
2026-06-29T14:22:16.1631670Z   project.targets.select { |t| t.name == 'SIFAM' }.each do |target|
2026-06-29T14:22:16.1632160Z     target.build_configurations.each do |config|
2026-06-29T14:22:16.1632810Z       config.build_settings['EXCLUDED_ARCHS[sdk=iphonesimulator*]'] = 'arm64'
2026-06-29T14:22:16.1635860Z     end
2026-06-29T14:22:16.1636580Z   end
2026-06-29T14:22:16.1638430Z   project.save
2026-06-29T14:22:16.1639270Z end
2026-06-29T14:22:16.1641220Z ```
2026-06-29T14:22:16.1642030Z 
2026-06-29T14:22:16.1642590Z ### Error
2026-06-29T14:22:16.1642760Z 
2026-06-29T14:22:16.1643190Z ```
2026-06-29T14:22:16.1644130Z Nanaimo::Reader::ParseError - [!] Invalid character ";" in unquoted string
2026-06-29T14:22:16.1645170Z     #  -------------------------------------------
2026-06-29T14:22:16.1645980Z     #  					"@executable_path/Frameworks",
2026-06-29T14:22:16.1647260Z     #  				);
2026-06-29T14:22:16.1650580Z 2418>  				MARKETING_VERSION = ;
2026-06-29T14:22:16.1651170Z        				                    ^
2026-06-29T14:22:16.1651670Z     #  				MTL_ENABLE_DEBUG_INFO = NO;
2026-06-29T14:22:16.1652270Z     #  				PRODUCT_BUNDLE_IDENTIFIER = br.gov.caixa.bolsafamilia;
2026-06-29T14:22:16.1653990Z     #  -------------------------------------------
2026-06-29T14:22:16.1654240Z 
2026-06-29T14:22:16.1654940Z /usr/local/lib/ruby/gems/3.4.0/gems/nanaimo-0.4.0/lib/nanaimo/reader.rb:284:in 'Nanaimo::Reader#raise_parser_error'
2026-06-29T14:22:16.1655910Z /usr/local/lib/ruby/gems/3.4.0/gems/nanaimo-0.4.0/lib/nanaimo/reader.rb:150:in 'Nanaimo::Reader#parse_string'
2026-06-29T14:22:16.1656820Z /usr/local/lib/ruby/gems/3.4.0/gems/nanaimo-0.4.0/lib/nanaimo/reader.rb:140:in 'Nanaimo::Reader#parse_object'
2026-06-29T14:22:16.1657740Z /usr/local/lib/ruby/gems/3.4.0/gems/nanaimo-0.4.0/lib/nanaimo/reader.rb:193:in 'Nanaimo::Reader#parse_dictionary'
2026-06-29T14:22:16.1658650Z /usr/local/lib/ruby/gems/3.4.0/gems/nanaimo-0.4.0/lib/nanaimo/reader.rb:132:in 'Nanaimo::Reader#parse_object'
2026-06-29T14:22:16.1659550Z /usr/local/lib/ruby/gems/3.4.0/gems/nanaimo-0.4.0/lib/nanaimo/reader.rb:193:in 'Nanaimo::Reader#parse_dictionary'
2026-06-29T14:22:16.1660480Z /usr/local/lib/ruby/gems/3.4.0/gems/nanaimo-0.4.0/lib/nanaimo/reader.rb:132:in 'Nanaimo::Reader#parse_object'
2026-06-29T14:22:16.1661400Z /usr/local/lib/ruby/gems/3.4.0/gems/nanaimo-0.4.0/lib/nanaimo/reader.rb:193:in 'Nanaimo::Reader#parse_dictionary'
2026-06-29T14:22:16.1662350Z /usr/local/lib/ruby/gems/3.4.0/gems/nanaimo-0.4.0/lib/nanaimo/reader.rb:132:in 'Nanaimo::Reader#parse_object'
2026-06-29T14:22:16.1664870Z /usr/local/lib/ruby/gems/3.4.0/gems/nanaimo-0.4.0/lib/nanaimo/reader.rb:193:in 'Nanaimo::Reader#parse_dictionary'
2026-06-29T14:22:16.1667420Z /usr/local/lib/ruby/gems/3.4.0/gems/nanaimo-0.4.0/lib/nanaimo/reader.rb:132:in 'Nanaimo::Reader#parse_object'
2026-06-29T14:22:16.1669060Z /usr/local/lib/ruby/gems/3.4.0/gems/nanaimo-0.4.0/lib/nanaimo/reader.rb:107:in 'Nanaimo::Reader#parse!'
2026-06-29T14:22:16.1670540Z /usr/local/lib/ruby/gems/3.4.0/gems/xcodeproj-1.27.0/lib/xcodeproj/plist.rb:27:in 'Xcodeproj::Plist.read_from_path'
2026-06-29T14:22:16.1671870Z /usr/local/lib/ruby/gems/3.4.0/gems/xcodeproj-1.27.0/lib/xcodeproj/project.rb:211:in 'Xcodeproj::Project#initialize_from_file'
2026-06-29T14:22:16.1676180Z /usr/local/lib/ruby/gems/3.4.0/gems/xcodeproj-1.27.0/lib/xcodeproj/project.rb:113:in 'Xcodeproj::Project.open'
2026-06-29T14:22:16.1678330Z /usr/local/lib/ruby/gems/3.4.0/gems/cocoapods-1.16.2/lib/cocoapods/installer/analyzer.rb:1194:in 'block (2 levels) in Pod::Installer::Analyzer#inspect_targets_to_integrate'
2026-06-29T14:22:16.1680530Z /usr/local/lib/ruby/gems/3.4.0/gems/cocoapods-1.16.2/lib/cocoapods/installer/analyzer.rb:1193:in 'Hash#each'
2026-06-29T14:22:16.1681650Z /usr/local/lib/ruby/gems/3.4.0/gems/cocoapods-1.16.2/lib/cocoapods/installer/analyzer.rb:1193:in 'block in Pod::Installer::Analyzer#inspect_targets_to_integrate'
2026-06-29T14:22:16.1682720Z /usr/local/lib/ruby/gems/3.4.0/gems/cocoapods-1.16.2/lib/cocoapods/user_interface.rb:64:in 'Pod::UserInterface.section'
2026-06-29T14:22:16.1683790Z /usr/local/lib/ruby/gems/3.4.0/gems/cocoapods-1.16.2/lib/cocoapods/installer/analyzer.rb:1188:in 'Pod::Installer::Analyzer#inspect_targets_to_integrate'
2026-06-29T14:22:16.1684940Z /usr/local/lib/ruby/gems/3.4.0/gems/cocoapods-1.16.2/lib/cocoapods/installer/analyzer.rb:107:in 'Pod::Installer::Analyzer#analyze'
2026-06-29T14:22:16.1686200Z /usr/local/lib/ruby/gems/3.4.0/gems/cocoapods-1.16.2/lib/cocoapods/installer.rb:422:in 'Pod::Installer#analyze'
2026-06-29T14:22:16.1687820Z /usr/local/lib/ruby/gems/3.4.0/gems/cocoapods-1.16.2/lib/cocoapods/installer.rb:244:in 'block in Pod::Installer#resolve_dependencies'
2026-06-29T14:22:16.1689310Z /usr/local/lib/ruby/gems/3.4.0/gems/cocoapods-1.16.2/lib/cocoapods/user_interface.rb:64:in 'Pod::UserInterface.section'
2026-06-29T14:22:16.1690320Z /usr/local/lib/ruby/gems/3.4.0/gems/cocoapods-1.16.2/lib/cocoapods/installer.rb:243:in 'Pod::Installer#resolve_dependencies'
2026-06-29T14:22:16.1691270Z /usr/local/lib/ruby/gems/3.4.0/gems/cocoapods-1.16.2/lib/cocoapods/installer.rb:162:in 'Pod::Installer#install!'
2026-06-29T14:22:16.1692210Z /usr/local/lib/ruby/gems/3.4.0/gems/cocoapods-1.16.2/lib/cocoapods/command/install.rb:52:in 'Pod::Command::Install#run'
2026-06-29T14:22:16.1694380Z /usr/local/lib/ruby/gems/3.4.0/gems/claide-1.1.0/lib/claide/command.rb:334:in 'CLAide::Command.run'
2026-06-29T14:22:16.1695090Z /usr/local/lib/ruby/gems/3.4.0/gems/cocoapods-1.16.2/lib/cocoapods/command.rb:52:in 'Pod::Command.run'
2026-06-29T14:22:16.1695730Z /usr/local/lib/ruby/gems/3.4.0/gems/cocoapods-1.16.2/bin/pod:55:in '<top (required)>'
2026-06-29T14:22:16.1696310Z /usr/local/lib/ruby/site_ruby/3.4.0/rubygems.rb:305:in 'Kernel#load'
2026-06-29T14:22:16.1696900Z /usr/local/lib/ruby/site_ruby/3.4.0/rubygems.rb:305:in 'Gem.activate_and_load_bin_path'
2026-06-29T14:22:16.1697450Z /usr/local/lib/ruby/gems/3.4.0/bin/pod:25:in '<main>'
2026-06-29T14:22:16.1697850Z ```
2026-06-29T14:22:16.1698020Z 
2026-06-29T14:22:16.1698680Z ――― TEMPLATE END ――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――
2026-06-29T14:22:16.1698840Z 
2026-06-29T14:22:16.1699210Z [!] Oh no, an error occurred.
2026-06-29T14:22:16.1699410Z 
2026-06-29T14:22:16.1699810Z Search for existing GitHub issues similar to yours:
2026-06-29T14:22:16.1701270Z https://github.com/CocoaPods/CocoaPods/search?q=%5B%21%5D+Invalid+character+%22%3B%22+in+unquoted+string%0A++++%23++-------------------------------------------%0A++++%23++%09%09%09%09%09%22%40executable_path%2FFrameworks%22%2C%0A++++%23++%09%09%09%09%29%3B%0A2418%3E++%09%09%09%09MARKETING_VERSION+%3D+%3B%0A+++++++%09%09%09%09++++++++++++++++++++%5E%0A++++%23++%09%09%09%09MTL_ENABLE_DEBUG_INFO+%3D+NO%3B%0A++++%23++%09%09%09%09PRODUCT_BUNDLE_IDENTIFIER+%3D+br.gov.caixa.bolsafamilia%3B%0A++++%23++-------------------------------------------%0A&type=Issues
2026-06-29T14:22:16.1703050Z 
2026-06-29T14:22:16.1705610Z If none exists, create a ticket, with the template displayed above, on:
2026-06-29T14:22:16.1706950Z https://github.com/CocoaPods/CocoaPods/issues/new
2026-06-29T14:22:16.1707390Z 
2026-06-29T14:22:16.1708390Z Be sure to first read the contributing guide for details on how to properly submit a ticket:
2026-06-29T14:22:16.1709890Z https://github.com/CocoaPods/CocoaPods/blob/master/CONTRIBUTING.md
2026-06-29T14:22:16.1710280Z 
2026-06-29T14:22:16.1711200Z Don't forget to anonymize any private data!
2026-06-29T14:22:16.1712330Z 
2026-06-29T14:22:16.6703560Z Searching for inspections failed: undefined method 'map' for nil
2026-06-29T14:22:16.6717790Z Looking for related issues on cocoapods/cocoapods...
2026-06-29T14:22:16.7719900Z 
2026-06-29T14:22:16.7953650Z ##[error]Bash exited with code '1'.
2026-06-29T14:22:16.8100870Z ##[section]Finishing: Exporta SD_KEY_BIOMETRIA
