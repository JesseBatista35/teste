Skip to content
GitHub Enterprise
Users managed by Caixa Economica Federal
android-actions
setup-android
Repository navigation
Code
Issues
17
 (17)
Pull requests
11
 (11)
Actions
Projects
Security and quality
Insights
android-actions
setup-android
Public
Use this GitHub action with your project
Add this Action to an existing workflow or create a new one
Go to file
t
T
ViliusSutkus89
ViliusSutkus89
[2/2] Update setup-android version in README.md
4d90f94
 · 
5 months ago
Name		
.github
Bump actions/checkout from 5 to 6
6 months ago
.idea
[Issue #384] Implement silent licence agreement.
3 years ago
.vscode
Make index.js executable
7 years ago
__tests__
Run prettier, to pass format-check
6 years ago
dist
Update dependencies and rebuild
5 months ago
src
Add cmdline-tools version 20.0 ( 14742923 )
6 months ago
.gitignore
Initial changes for setup-android
6 years ago
.prettierignore
Initial changes for setup-android
6 years ago
.prettierrc.json
Initial changes for setup-android
6 years ago
LICENSE
Create LICENSE
6 years ago
README.md
[2/2] Update setup-android version in README.md
5 months ago
action.yml
Add cmdline-tools version 20.0 ( 14742923 )
6 months ago
eslint.config.js
Update (not all) deps, migrate eslint to new format. compile to es2024
6 months ago
jest.config.js
Initial changes for setup-android
6 years ago
matchers.json
Move all matchers to a single file
6 years ago
package-lock.json
Update dependencies and rebuild
5 months ago
package.json
Update dependencies and rebuild
5 months ago
tsconfig.json
Migrate from ncc to esbuild
6 months ago
Repository files navigation
README
MIT license
setup-android
Build & Test

This action sets up the Android SDK tools by:

Downloading the SDK commandline tools, if the current version (16.0) is not found in either $ANDROID_SDK_ROOT or $HOME/.android/sdk.
Accepting the SDK licenses.
Installing tools and platform-tools.
Adding platform-tools (contains adb) and cmdline-tools/16.0/bin (contains sdkmanager) to $PATH.
Setting up problem matchers.
On Windows 2016 runners, this action also checks if $ANDROID_SDK_ROOT path contains spaces. If it does - it moves SDK to a path without spaces. This is needed because spaces are highly problematic:

C:\windows\system32\cmd.exe /D /S /C ""C:\Program Files (x86)\Android\android-sdk\cmdline-tools\3.0\bin\sdkmanager.bat" --licenses"
Error: Could not find or load main class Files
Usage
See action.yml

Basic
steps:
- uses: actions/checkout@v4

- name: Set up JDK 17
  uses: actions/setup-java@v4
  with:
    java-version: '17'
    distribution: 'temurin'

- name: Setup Android SDK
  uses: android-actions/setup-android@v4

- name: Build SampleApplication
  run: ./gradlew --no-daemon build
Additional packages
Input parameter packages controls which packages this action will install from Android SDK.

Default value is tools platform-tools, supply an empty string to skip installing additional packages.

Additional packages can be installed at a later time by calling sdkmanager manually.

- name: Setup Android SDK
  uses: android-actions/setup-android@v4
  with:
    packages: ''

# ...

- run: sdkmanager tools platform-tools
SDK Version selection
Command line tools are versioned using two variables - short and long. Long one is the build number, used in the zip URL, short one is the human friendly version name.

By default, setup-android installs version 14742923 (short version 20.0).

To install a different version, call setup-android with desired long version as the input parameter cmdline-tools-version:

- name: Setup Android SDK
  uses: android-actions/setup-android@v4
  with:
    cmdline-tools-version: 8512546
Version table
Short version	Long version
20.0	14742923
16.0	12266719
13.0	11479570
12.0	11076708
11.0	10406996
10.0	9862592
9.0	9477386
8.0	9123335
7.0	8512546
Current cmdline tools version can be found at https://developer.android.com/studio#command-line-tools-only

Android SDK Licenses
Android SDK is not public domain software, it comes with a license.

Input parameter accept-android-sdk-licenses decides if Android SDK licenses should be agreed to on behalf of the user of this action. Default option is 'yes', because otherwise SDK is unusable until said licenses are agreed to.

licenses are quite long, to prevent a wall of text in the action output, licenses can be agreed to silently. Input parameter log-accepted-android-sdk-licenses controls whether license texts should be printed or omitted from the text output. Defaults to 'true'.

Thanks
Based on the project android-problem-matchers-action from @jonasb

About
Android SDK setup for GitHub Actions

Topics
Resources
Readme
MIT license
Activity
Custom properties
Stars
300 stars
Watchers
4 watching
Forks
92 forks
Report repository
Releases
18
 (18)
v4.0.1
Latest
5 months ago
+ 17 releases
Packages
No packages published
Used by
25K
 (25K)
@veyloris@4Luke4@joenikkai@Irdanwen@fahim9778
+ 25.479
Contributors
14
 (14)
@ViliusSutkus89
@dependabot[bot]
@daveol
@jonasb
@xom9ikk
@Denubis
@TWiStErRob
@warting
@mikehardy
@navarroaxel
@OmarShehata
@SimonMarquis
@AceCoderLaura
@vil02
Languages
TypeScript
59.6%
JavaScript
40.4%
Footer
© 2026 GitHub, Inc.
Footer navigation
Terms
Privacy
Security
Status
Community
Docs
Contact
Manage cookies
Do not share my personal information
 
