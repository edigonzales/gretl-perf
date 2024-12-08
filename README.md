# gretl-perf

GRETL 3 lokal installieren:

```
./gradlew gretl:build gretl:publishPluginMavenPublicationToMavenLocal gretl:publishGretlPluginPluginMarkerMavenPublicationToMavenLocal -x test
```

- GRETL 2.3 mit Gradle 5.1.1
- GRETL 3 mit Gradle 8.11.1

```
gradle --no-daemon
```

println("foo"):

- GRETL 2.3: 3s: Init und Config je circa 2 Sekunden.
- GRETL 3: 6s: Init und Config je 3-4 Sekunden.
- GRETL 3 mit Configuration Cache: Gemäss "scan" ist Initialization 0.0 dafür Configuration langsamer als ohne Cache. Insgesamt circa eine Sekunde schneller.


- Official Dockerimage latest (8.11.1): 10s (ohne GRETL-Plugin)
- Official Dockerimage 5.1.1: 8s (ohne GRETL-Plugin)
- GRETL-Image 2.4 (5.1.1): 9s 
- GRETL-Image latest (8.11.1): 24s Auch ohne apply dauert es 23s. Die Libraries werden wohl irgendwie bereits berücksichtigt. classpath -> filetree (ist ja alles drin)
- GRETL-Image latest: 8-9s: mit nur Download-Plugin-Libs


```
docker run --rm -u gradle -v "$PWD":/home/gradle/project -v "$PWD".gradle:/home/gradle/.gradle -w /home/gradle/project gradle:7.6.4-jdk11 gradle -i
```