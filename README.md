# Backend REST para IT Academy Hackathon <br>

Backend REST creado para el IT Academy Hackathon.<br>
Creado con Java y Spring Boot para acceder a las informaciones sobre las terrazas guardadas en MongoDBAtlas.<br>

## Endpoints
GET http://localhost:8080/terrazas -> retorna todas las terrazas<br>
GET http://localhost:8080/terrazas?nom=El Raval -> retorna todas las terrazas del barrio<br>
GET http://localhost:8080/terrazas?nom=El Raval&sillas=10 -> retorna todas terrazas del barrio con mas o igual que el numero de sillas<br>
PUT http://localhost:8080/terrazas?id=62867287dd4b3f1eb67bdeb0 -> adiciona un like a la terraza con ese id.<br>
POST http://localhost:8080/terrazas -> adiciona una terraza pasada por el body en formato json.<br>