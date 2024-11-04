# Użyj oficjalnego obrazu Javy z OpenJDK 17
FROM openjdk:17-jdk-slim

# Ustaw katalog roboczy w kontenerze
WORKDIR /app

# Skopiuj wszystkie pliki projektu do kontenera
COPY . .

# Nadanie uprawnień do pliku mvnw
RUN chmod +x mvnw

# Zbuduj aplikację Spring Boot przy użyciu Mavena
RUN ./mvnw clean package -DskipTests

# Eksponuj port 8080 (Render przekaże właściwy port przez zmienną środowiskową)
EXPOSE 8080

# Uruchom aplikację Spring Boot
CMD ["java", "-jar", "target/demo-0.0.1-SNAPSHOT.jar"]
