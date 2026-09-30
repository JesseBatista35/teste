-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc logs $POD -n sispl-des -c secrets-agent-sidecar
2026-09-28 10:45:59,524 INFO Getting secrets just once, POLLING_WAIT_BETWEEN_REQUESTS_MINUTES was not configured
2026-09-28 10:45:59,525 INFO (cac66c48-bb29-11f1-aad4-0a5819810668) APP VERSION: 2.1.0
2026-09-28 10:45:59,525 INFO (cac66c48-bb29-11f1-aad4-0a5819810668) Starting Execution...cac66c48-bb29-11f1-aad4-0a5819810668
2026-09-28 10:45:59,525 INFO (cac66c48-bb29-11f1-aad4-0a5819810668) You are using: <,> as List delimiter
2026-09-28 10:45:59,525 WARNING (cac66c48-bb29-11f1-aad4-0a5819810668) InsecureRequestWarning: Unverified HTTPS request is being made to host https://sicsn.caixa/BeyondTrust/api/public/v3'. Adding certificate verification isstrongly advised. See: https://urllib3.readthedocs.io/en/1.26.x/advanced-usage.html#ssl-warnings
2026-09-28 10:45:59,525 INFO (cac66c48-bb29-11f1-aad4-0a5819810668) Certificate was not configured
2026-09-28 10:45:59,528 DEBUG (cac66c48-bb29-11f1-aad4-0a5819810668) How long to wait for the server to connect and send data before giving up: connection timeout: 30 seconds, request timeout 30 seconds
2026-09-28 10:45:59,528 WARNING (cac66c48-bb29-11f1-aad4-0a5819810668) verify_ca=false is insecure, it instructs the caller to not verify the certificate authority when making API calls.
Traceback (most recent call last):
  File "/usr/local/lib/python3.13/site-packages/urllib3/connection.py", line 198, in _new_conn
    sock = connection.create_connection(
        (self._dns_host, self.port),
    ...<2 lines>...
        socket_options=self.socket_options,
    )
  File "/usr/local/lib/python3.13/site-packages/urllib3/util/connection.py", line 85, in create_connection
    raise err
  File "/usr/local/lib/python3.13/site-packages/urllib3/util/connection.py", line 73, in create_connection
    sock.connect(sa)
    ~~~~~~~~~~~~^^^^
TimeoutError: timed out

The above exception was the direct cause of the following exception:

Traceback (most recent call last):
  File "/usr/local/lib/python3.13/site-packages/urllib3/connectionpool.py", line 787, in urlopen
    response = self._make_request(
        conn,
    ...<10 lines>...
        **response_kw,
    )
  File "/usr/local/lib/python3.13/site-packages/urllib3/connectionpool.py", line 488, in _make_request
    raise new_e
  File "/usr/local/lib/python3.13/site-packages/urllib3/connectionpool.py", line 464, in _make_request
    self._validate_conn(conn)
    ~~~~~~~~~~~~~~~~~~~^^^^^^
  File "/usr/local/lib/python3.13/site-packages/urllib3/connectionpool.py", line 1093, in _validate_conn
    conn.connect()
    ~~~~~~~~~~~~^^
  File "/usr/local/lib/python3.13/site-packages/urllib3/connection.py", line 753, in connect
    self.sock = sock = self._new_conn()
                       ~~~~~~~~~~~~~~^^
  File "/usr/local/lib/python3.13/site-packages/urllib3/connection.py", line 207, in _new_conn
    raise ConnectTimeoutError(
    ...<2 lines>...
    ) from e
urllib3.exceptions.ConnectTimeoutError: (<urllib3.connection.HTTPSConnection object at 0x7f40d32c4cd0>, 'Connection to sicsn.caixa timed out. (connect timeout=30)')

The above exception was the direct cause of the following exception:

Traceback (most recent call last):
  File "/usr/local/lib/python3.13/site-packages/requests/adapters.py", line 667, in send
    resp = conn.urlopen(
        method=request.method,
    ...<9 lines>...
        chunked=chunked,
    )
  File "/usr/local/lib/python3.13/site-packages/urllib3/connectionpool.py", line 871, in urlopen
    return self.urlopen(
           ~~~~~~~~~~~~^
        method,
        ^^^^^^^
    ...<13 lines>...
        **response_kw,
        ^^^^^^^^^^^^^^
    )
    ^
  File "/usr/local/lib/python3.13/site-packages/urllib3/connectionpool.py", line 871, in urlopen
    return self.urlopen(
           ~~~~~~~~~~~~^
        method,
        ^^^^^^^
    ...<13 lines>...
        **response_kw,
        ^^^^^^^^^^^^^^
    )
    ^
  File "/usr/local/lib/python3.13/site-packages/urllib3/connectionpool.py", line 871, in urlopen
    return self.urlopen(
           ~~~~~~~~~~~~^
        method,
        ^^^^^^^
    ...<13 lines>...
        **response_kw,
        ^^^^^^^^^^^^^^
    )
    ^
  File "/usr/local/lib/python3.13/site-packages/urllib3/connectionpool.py", line 841, in urlopen
    retries = retries.increment(
        method, url, error=new_e, _pool=self, _stacktrace=sys.exc_info()[2]
    )
  File "/usr/local/lib/python3.13/site-packages/urllib3/util/retry.py", line 519, in increment
    raise MaxRetryError(_pool, url, reason) from reason  # type: ignore[arg-type]
    ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
urllib3.exceptions.MaxRetryError: HTTPSConnectionPool(host='sicsn.caixa', port=443): Max retries exceeded with url: /BeyondTrust/api/public/v3/Auth/connect/token (Caused by ConnectTimeoutError(<urllib3.connection.HTTPSConnection object at 0x7f40d32c4cd0>, 'Connection to sicsn.caixa timed out. (connect timeout=30)'))

During handling of the above exception, another exception occurred:

Traceback (most recent call last):
  File "/usr/src/app/get_secrets_from_secret_safe.py", line 78, in main
    get_api_access_response = authentication_obj.get_api_access()
  File "/usr/local/lib/python3.13/site-packages/secrets_safe_library/authentication.py", line 159, in get_api_access
    oauth_response = self.oauth()
  File "/usr/local/lib/python3.13/site-packages/secrets_safe_library/authentication.py", line 125, in oauth
    response = self._req.post(
        endpoint_url,
    ...<3 lines>...
        timeout=(self._timeout_connection_seconds, self._timeout_request_seconds),
    )
  File "/usr/local/lib/python3.13/site-packages/requests/sessions.py", line 637, in post
    return self.request("POST", url, data=data, json=json, **kwargs)
           ~~~~~~~~~~~~^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
  File "/usr/local/lib/python3.13/site-packages/requests/sessions.py", line 589, in request
    resp = self.send(prep, **send_kwargs)
  File "/usr/local/lib/python3.13/site-packages/requests/sessions.py", line 703, in send
    r = adapter.send(request, **kwargs)
  File "/usr/local/lib/python3.13/site-packages/requests/adapters.py", line 688, in send
    raise ConnectTimeout(e, request=request)
requests.exceptions.ConnectTimeout: HTTPSConnectionPool(host='sicsn.caixa', port=443): Max retries exceeded with url: /BeyondTrust/api/public/v3/Auth/connect/token (Caused by ConnectTimeoutError(<urllib3.connection.HTTPSConnection object at 0x7f40d32c4cd0>, 'Connection to sicsn.caixa timed out. (connect timeout=30)'))
2026-09-28 10:48:00,875 ERROR (cac66c48-bb29-11f1-aad4-0a5819810668) There was an error in the execution: HTTPSConnectionPool(host='sicsn.caixa', port=443): Max retries exceeded with url: /BeyondTrust/api/public/v3/Auth/connect/token (Caused by ConnectTimeoutError(<urllib3.connection.HTTPSConnection object at 0x7f40d32c4cd0>, 'Connection to sicsn.caixa timed out. (connect timeout=30)'))
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get $POD -n sispl-des -o jsonpath='{.status.initContainerStatuses[0].state.terminated.exitCode}'; echo
0
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc logs $POD -n sispl-des -c secrets-check --previous | tail -20
unable to retrieve container logs for cri-o://229a138b358a4d8c5a19a04a2d5db982d8de33f7e7964984fe8e830ce106f57e-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc run nettest -n sispl-des --rm -it --restart=Never \
>   --image=default-route-openshift-image-registry.apps.produtos4.caixa/openshift/ubi:9.3-1552 \
>   --overrides='{"spec":{"imagePullSecrets":[{"name":"registry-secret"}]}}' -- \
>   bash -c 'timeout 10 bash -c "</dev/tcp/sicsn.caixa/443" && echo TCP_OK || echo TCP_FALHA; curl -sk -o /dev/null -w "HTTP %{http_code}\n" --connect-timeout 10 https://sicsn.caixa/BeyondTrust/api/public/v3/Auth/connect/token'
If you don't see a command prompt, try pressing enter.


TCP_FALHA
HTTP 000
pod "nettest" deleted
pod sispl-des/nettest terminated (Error)
-sh-4.2$
