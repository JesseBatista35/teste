export App=$(nameApp)-$(versionApp)-$(typeApp).$(versionBuild).$(extApp)

cd /opt/temp/$(nameApp)/app-$(versionApp).$(versionBuild)

firebase appdistribution:distribute ${App} \
--app $(FIREBASE_ID_APP) \
--groups "$(FIREBASE_GROUPS)" \
--release-notes "$(FIREBASE_NOTES)"  \
--token $(FIREBASE_TOKEN)

\\DEBUG
