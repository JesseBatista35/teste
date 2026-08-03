<img width="1659" height="871" alt="image" src="https://github.com/user-attachments/assets/6eeb08d9-d1d5-4ce8-a57c-6ca0e939fc35" />


achei o problema ela esta referenciando duas vezes nas pipilne variabeles e nas varaibel grupos tirei das pipline de variaveis e deixei so o da varaibles grupos


-Dproject.settings=NONE -Dsonar.branch.name=$(sonar_branch) -Dsonar.java.binaries=$(SONAR_JAVA_BINARIES) -Dsonar.java.coveragePlugin=$(SONAR_JAVA_COVERAGEPLUGIN) -Dsonar.java.libraries=$(SONAR_JAVA_LIBRARIES) -Dsonar.coverage.jacoco.xmlReportPaths=`find . -path '*jacoco.xml' | sed 's/.*/&/' | tr '\n' ','` -Dsonar.junit.reportPaths=`find . -type d -name 'surefire-reports' | sed 's/.*/&/' | tr '\n' ','` -X


E passou deu certo 

<img width="1876" height="897" alt="image" src="https://github.com/user-attachments/assets/77933dfd-f7b2-45ee-be71-3d47b32b2e24" />
