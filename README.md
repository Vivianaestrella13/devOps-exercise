# devOps-exercise
Ejercicio de DevOps


- Se realizó un microservicio empleando SpringBoot, exponiendo la funcionalidad requerida en el path /DevOps a través de un método POST
 ```
 localhost:80/DevOps
 ```
-  Para todos los demás métodos GET, PUT, etc se retorna el string de "ERROR"

- Se habilitó la seguridad del MicroServicio empleando el API-KEY mencionado. Unicamente se dejaron habilitados los paths correspondientes al 
  actuator para que se pueda verificar la salud del microservicio.
  
 ```
 localhost:80/actuator/health
 ```
- Se creo un Dockerfile.
 
- Se creo un pipeline con git actions, el cual se puede apreciar en este mismo repositorio, este pipeline en resumen realiza lo siguiente
 ```
 - Checkout del código
 - Descarga del JDK correspodiente
 - Compilación con maven
 - Login con Registry de AZ
 - Build y Push de la Imagen
 - Login en AZ
 - Deploy del en el Cluster de Kubernetes
 ```
- Para el despliegue en el Cluster de Kubernetes fue necesario crear lo siguiente

 ```
 - Crear un Resorse Group
 - Crear un Container Registry y un Repository
 - Crear un Cluster de Kubernetes
 - Crear un Service Principal
 - Asociación del AKS con el Registry (attach)
 - Crear un AKS manifest en el cual se estable la necesidad de tener 2 NODOS activos.
 - Crear un Balanceador de carga para el balanceo de los 2 NODOS.
 ```
- Para acceder al ejercicio puede emplear la IP Publica
```
20.237.121.179
```
- Se puede emplear el siguiente comando a través de curl
```
curl -X POST \
  -H "X-Parse-REST-API-Key: 2f5ae96c-b558-4c7b-a590-a501ae1c3f6c" \
  -H "Content-Type: application/json" \
  -d '{
    "message":"This is a test",
    "to":"Juan Perez",
    "from":"Rita Asturia",
    "timeToLifeSec":45
}' \
  http://20.237.121.179:80/DevOps```
```
