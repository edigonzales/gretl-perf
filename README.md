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