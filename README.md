public static String converteURLComoBase64(String url) throws Exception {

    // ignora verificação de hostname (ESSENCIAL)
    System.setProperty("jdk.internal.httpclient.disableHostnameVerification", "true");

    HttpClient client = createUnsafeClient();

    HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(url))
            .GET()
            .build();

    HttpResponse<byte[]> response =
            client.send(request, HttpResponse.BodyHandlers.ofByteArray());

    return Base64.getEncoder().encodeToString(response.body());
}


public static HttpClient createUnsafeClient() throws Exception {

    TrustManager[] trustAllCerts = new TrustManager[]{
        new X509TrustManager() {
            public void checkClientTrusted(X509Certificate[] chain, String authType) {}
            public void checkServerTrusted(X509Certificate[] chain, String authType) {}
            public X509Certificate[] getAcceptedIssuers() {
                return new X509Certificate[0];
            }
        }
