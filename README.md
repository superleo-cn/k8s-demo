## how to reproduce the case

### build all the images

> eval $(minikube docker-env)
> 
> mvn clean package dockerfile:build  

### deploy all the deployments and services

> sh k8s/startup.sh

## how to shut down

> sh k8s/shutdown.sh