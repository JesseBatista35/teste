Configura .netrc para Heartbeat



cat > ~/.netrc << 'EOF'
machine download-ofd.apps.topazevolution.com
  login $(HEARTBEAT_AWS_CODECOMMIT_USERNAME)
  password $(HEARTBEAT_AWS_CODECOMMIT_URLENCODED_PASSWORD)
machine git-codecommit.us-east-1.amazonaws.com
  login $(HEARTBEAT_AWS_CODECOMMIT_USERNAME)
  password $(HEARTBEAT_AWS_CODECOMMIT_URLENCODED_PASSWORD)
EOF
chmod 600 ~/.netrc





