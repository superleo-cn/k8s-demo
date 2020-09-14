#!/bin/bash

kubectl create namespace k8s-demo
kubectl apply -f k8s/confmap.yml
kubectl get configmap gateway -n k8s-demo
kubectl describe configmap gateway -n k8s-demo

kubectl apply -f k8s/role_binding.yaml
kubectl get role -n k8s-demo
kubectl get rolebinding -n k8s-demo
kubectl get serviceaccount -n k8s-demo

kubectl apply -f k8s/cfd-deployment.yaml -n k8s-demo
kubectl apply -f k8s/cfd-service.yaml -n k8s-demo
kubectl apply -f k8s/gateway-deployment.yaml -n k8s-demo
kubectl apply -f k8s/gateway-service.yaml -n k8s-demo
kubectl get svc -n k8s-demo
minikube service gateway-service -n k8s-demo