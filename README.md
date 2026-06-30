o que preciso fazer para funcionar local?


Delineated setup steps para funcionamento local
Delineated setup steps para funcionamento local
Passa isso para ele:

1. Edita o Podfile e remove essa linha:

ruby
source 'https://' + ENV['HEARTBEAT_AWS_CODECOMMIT_USERNAME'] + ':' + ENV['HEARTBEAT_AWS_CODECOMMIT_URLENCODED_PASSWORD'] + '@' + ENV['HEARTBEAT_AWS_CODECOMMIT_REPO_URL']
Deixa só:

ruby
source 'https://download-ofd.apps.topazevolution.com/ios-cdn-specs'
source 'https://cdn.cocoapods.org'
2. Configura o .netrc local:

bash
cat > ~/.netrc << 'EOF'
machine download-ofd.apps.topazevolution.com
  login <usuario_codecommit>
  password <senha_codecommit>
machine git-codecommit.us-east-1.amazonaws.com
  login <usuario_codecommit>
  password <senha_codecommit>
EOF
chmod 600 ~/.netrc
(Substitui <usuario_codecommit> e <senha_codecommit> pelas credenciais reais)

3. Roda:

bash
pod install --repo-update
Pronto. Sem pedir username.

Passa isso aí!

