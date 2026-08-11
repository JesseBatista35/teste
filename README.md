Executando Build S2I Binary

View raw log

STEP 3/9: ENV OPENSHIFT_BUILD_NAME="siavl-gerencial-frontend-7"     OPENSHIFT_BUILD_NAMESPACE="build-images-ads"
STEP 4/9: USER root
STEP 5/9: COPY upload/src /tmp/src
STEP 6/9: RUN chown -R 1001:0 /tmp/src
STEP 7/9: USER 1001
STEP 8/9: RUN /usr/libexec/s2i/assemble
---> Installing application source
---> Copying nginx start-hook scripts...
STEP 9/9: CMD /usr/libexec/s2i/run
COMMIT temp.builder.openshift.io/build-images-ads/siavl-gerencial-frontend-7:04b1abe6
time="2026-08-10T18:25:27Z" level=warning msg="Adding metacopy option, configured globally"
Getting image source signatures
Copying blob sha256:6f79bbfebf48364efd0ee3ed27d355380a7ebd15516440724189b73bf89a898d
Copying blob sha256:2e13e6e57bf250c2e818300c9fe7e92d505d2afb34eaecfb37af42f4b13e05b1
Copying blob sha256:67dc1f48d5dbaba415af7e891a3014324a0ae663b30e16b0549640180c53bd1b
Copying blob sha256:af2b91009ef3cec0b2621c2771ae32eb678077a030c98f53c6e48a7632f8ea5f
Copying blob sha256:a63f5ea9737826675b2a76a3f5f8b06479679b039a113ba9fa69b3157088900b
Copying config sha256:03618e7724d98c9b0f9b482c7273962ad8dd13a8d121f98cf9600f63140ef10a
Writing manifest to image destination
Storing signatures
--> 03618e7724d
Successfully tagged temp.builder.openshift.io/build-images-ads/siavl-gerencial-frontend-7:04b1abe6
03618e7724d98c9b0f9b482c7273962ad8dd13a8d121f98cf9600f63140ef10a

Pushing image image-registry.openshift-image-registry.svc:5000/build-images-ads/siavl-gerencial-frontend:latest ...
Getting image source signatures
Copying blob sha256:61f0eaeb660bd0d6eff07f8be5fba2f03b4f72a3f7ad08d00c8ae04fa0e9c1d8
Copying blob sha256:56b2ec53eb90753f4259bc1fd55c9b03d2aeb15f32351977d3513cdfc735b78c
Copying blob sha256:f3a0a6a8ea4545905d33eb87655162747fd714d34cf25f3e50a63f1c05579a59
Copying blob sha256:f0009e4ec8f56c589d29f2fe5d0b4d3bafdfec0b15b5e11b4f1d1112d1fa7b33
Copying blob sha256:a63f5ea9737826675b2a76a3f5f8b06479679b039a113ba9fa69b3157088900b
Copying config sha256:03618e7724d98c9b0f9b482c7273962ad8dd13a8d121f98cf9600f63140ef10a
Writing manifest to image destination
Storing signatures
Successfully pushed image-registry.openshift-image-registry.svc:5000/build-images-ads/siavl-gerencial-frontend@sha256:920d8f232da0073eacbf78baa7df7915edef3df8e9a163653e62bf1e6dfa7f8d
Push successful
Finishing: Executando Build S2I Binary
