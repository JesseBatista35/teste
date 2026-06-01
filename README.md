cd "$BUILD_SOURCESDIRECTORY"
echo "==== conteudo de target/ ===="
ls -la target/
echo "==== target/quarkus-app/ ===="
ls -la target/quarkus-app/ 2>/dev/null || echo "NAO EXISTE quarkus-app"
