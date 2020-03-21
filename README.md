# Football Api

## API

The Api for getting the standings of a team is 

```
http://localhost:8080/standings?country_name=England&league_name=Championship&team_name=Swansea
```

and the response is in JSON in the below format

```
{
    "countryId": 41,
    "countryName": "England",
    "leagueId": 149,
    "leagueName": "Championship",
    "teamId": 2618,
    "teamName": "Swansea",
    "leaguePos": 11
}
```

### Build fat jar
To build a fat jar (jar + all dependencies), execute:

```
./mvnw clean install
```

### Docker build
```
docker build -t footballapi .
e.g: docker build -t footballapi .

```

## Configuration

Configuration file 'application.properties' is present in resources directory. 

## Running the app

### Maven
```
./mvnw spring-boot:run
```

### Docker run
```
docker run -p 8080:8080 footballapi
```

