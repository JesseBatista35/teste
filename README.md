X=/opt/ctmage/ctm/cm/AI/apps-repo/IIFX/IIFX.xml
grep -n "<name type=\"string\">" $X | head -10
sed -n '300,480p' $X | grep -inE "<name|extractFrom|SESSIONID|TOKEN|regex|startsWith|endsWith|Set-Cookie|cookie|paramName|expression|jsonPath" | grep -v client_secret
