# Spring Flyway Sample

The project is an example of using Flyway to control your database version.

## Requirements

Java 11+

IntelliJ IDEA / Netbeans / Eclipse

PostgreSQL

## Usage

```python

1) Execute command: docker-compose up -d (the file docker-compose.yml will be executed).

2) Create a new database.

> docker exec {yourContainerId} psql -U admin -c "CREATE DATABASE spring_flyway_db"

3) Start project.
   
4) The scripts contained in "db.migration" will be executed, see below the prints of a visual interface of the database.

#imagem
  
```

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

## License
[MIT](https://choosealicense.com/licenses/mit/)