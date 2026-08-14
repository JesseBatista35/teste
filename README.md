on:
  workflow_dispatch:
  push:
    branches:
    - main
    - develop
    paths-ignore:
    - '.github/**'
    - 'catalog-info.yaml'
  pull_request:
    branches:
    - main
    - develop
    paths-ignore:
    - '.github/**'
    - 'catalog-info.yaml'


    
