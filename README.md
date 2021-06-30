### Example Springboot App with JPA and Postgres SQL

#### Clone
Goto terminal or CMD and clone from this repository.

```
git clone https://github.com/edhiuchiha/simple-crud-springboot
```

#### Build 
Build the Project with maven command below
```
mvn clean package -DskipTests
```

#### Build the docker image
```
docker build -t crud-user .
```

#### Check the built docker images
```
docker images
```

### API

##### Insert new Users ( method : POST )
```
http://localhost:8080/users
```
Request Body : 
```javascript
{
  "first_name"    : "Edi",
  "last_name"     : "Murwanto",
  "email"         : "edhi@mail.com",
  "avatar"        : "-",
  "job"           : "Developer"
}
```


##### Get List of Users ( method : GET )
```
http://localhost:8080/users
```
Sample Output : 
```javascript
[
    {
        "id"            : 1,
        "first_name"    : "Edi",
        "last_name"     : "Murwanto",
        "email"         : "edhi@mail.com",
        "avatar"        : "-",
        "job"           : "Developer"
    }
]
```