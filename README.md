
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]# ls -l gec-ear.ear
-rwxrw-rw- 1 jboss jboss 117261708 nov 18 10:13 gec-ear.ear
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]# unzip -p gec-ear.ear gec-web.war > /tmp/gw.war
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]# echo "=== poi no war ==="; unzip -l /tmp/gw.war | grep -i "poi\|xmlbeans\|commons-compress"
=== poi no war ===
        0  11-18-2026 10:04   servicos/tipoIndiceRemuneracao/
        0  11-18-2026 10:04   servicos/tipoIndiceRemuneracao/colecao/
        0  11-18-2026 10:04   servicos/tipoIndiceRemuneracao/controle/
        0  11-18-2026 10:04   servicos/tipoIndiceRemuneracao/modelo/
        0  11-18-2026 10:04   servicos/tipoIndiceRemuneracao/visao/
     2956  11-18-2026 10:04   WEB-INF/classes/br/gov/caixa/sigec/rest/ManterTipoIndiceRemuneracaoRest.class
  2976945  11-17-2026 09:32   WEB-INF/lib/poi-5.2.5.jar
  2027116  11-17-2026 09:32   WEB-INF/lib/poi-ooxml-5.2.5.jar
  5946257  11-17-2026 09:32   WEB-INF/lib/poi-ooxml-lite-5.2.5.jar
  2198521  11-17-2026 09:36   WEB-INF/lib/xmlbeans-5.2.0.jar
  1080823  11-17-2026 10:52   WEB-INF/lib/commons-compress-1.25.0.jar
      819  11-18-2026 10:03   layout/fontawesome-free-6.0.0-web/svgs/regular/file-powerpoint.svg
     1524  11-18-2026 10:03   layout/fontawesome-free-6.0.0-web/svgs/regular/hand-point-down.svg
     1531  11-18-2026 10:03   layout/fontawesome-free-6.0.0-web/svgs/regular/hand-point-left.svg
     1518  11-18-2026 10:03   layout/fontawesome-free-6.0.0-web/svgs/regular/hand-point-right.svg
     1520  11-18-2026 10:03   layout/fontawesome-free-6.0.0-web/svgs/regular/hand-point-up.svg
     1733  11-18-2026 10:03   layout/fontawesome-free-6.0.0-web/svgs/regular/hand-pointer.svg
      670  11-18-2026 10:03   layout/fontawesome-free-6.0.0-web/svgs/solid/arrow-pointer.svg
      686  11-18-2026 10:03   layout/fontawesome-free-6.0.0-web/svgs/solid/feather-pointed.svg
      680  11-18-2026 10:03   layout/fontawesome-free-6.0.0-web/svgs/solid/file-powerpoint.svg
     1077  11-18-2026 10:03   layout/fontawesome-free-6.0.0-web/svgs/solid/hand-point-down.svg
     1089  11-18-2026 10:03   layout/fontawesome-free-6.0.0-web/svgs/solid/hand-point-left.svg
     1125  11-18-2026 10:03   layout/fontawesome-free-6.0.0-web/svgs/solid/hand-point-right.svg
     1122  11-18-2026 10:03   layout/fontawesome-free-6.0.0-web/svgs/solid/hand-point-up.svg
     1019  11-18-2026 10:03   layout/fontawesome-free-6.0.0-web/svgs/solid/hand-pointer.svg
      146  11-18-2026 10:03   servicos/tipoIndiceRemuneracao/colecao/TipoIndiceRemuneracaoColecao.js
      154  11-18-2026 10:03   servicos/tipoIndiceRemuneracao/colecao/TipoIndiceRemuneracaoColecaoPaginada.js
      418  11-18-2026 10:03   servicos/tipoIndiceRemuneracao/controle/TipoIndiceRemuneracaoControle.js
      706  11-18-2026 10:03   servicos/tipoIndiceRemuneracao/controle/TipoIndiceRemuneracaoEditarControle.js
     1142  11-18-2026 10:03   servicos/tipoIndiceRemuneracao/modelo/TipoIndiceRemuneracaoModelo.js
     1690  11-18-2026 10:03   servicos/tipoIndiceRemuneracao/visao/tipoIndiceRemuneracaoEditar.html
     1226  11-18-2026 10:03   servicos/tipoIndiceRemuneracao/visao/tipoIndiceRemuneracaoLista.html
      429  11-18-2026 10:03   servicos/tipoIndiceRemuneracao/visao/tipoIndiceRemuneracaoListaItem.html
     1168  11-18-2026 10:03   servicos/tipoIndiceRemuneracao/visao/tipoIndiceRemuneracaoVisualizar.html
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]# echo "=== causas no .failed ==="
grep -o "was not found: [A-Za-z0-9_.]*" gec-ear.ear.failed | sort | uniq -c
grep -o "Unsatisfied dependencies for type [A-Za-z0-9_.]*" gec-ear.ear.failed | sort | uniq -c
=== causas no .failed ===
      1 Unsatisfied dependencies for type TransferenciaEletronicaLegacyCallNCR
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]# grep -o "Unsatisfied dependencies for type [A-Za-z0-9_.]*" gec-ear.ear.failed | sort | uniq -c
      1 Unsatisfied dependencies for type TransferenciaEletronicaLegacyCallNCR
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]#
