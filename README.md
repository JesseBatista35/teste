cd ~/verificacao_sicmu
unzip -p SICMU-web.war template/template.xhtml | grep -i "vendor\|modernizr\|plugins.js"

unzip -p SICMU-web.war template/template2.xhtml | grep -i "vendor\|modernizr\|plugins.js"

unzip -p SICMU-web.war template/cabecalho.xhtml | grep -i "vendor\|modernizr\|plugins.js"

unzip -p SICMU-web.war template/rodape.xhtml | grep -i "vendor\|modernizr\|plugins.js"

unzip -p SICMU-web.war template/rodape2.xhtml | grep -i "vendor\|modernizr\|plugins.js"

