import java.nio.file.Paths
import ch.so.agi.gretl.tasks.*
import ch.so.agi.gretl.api.*
import de.undercouch.gradle.tasks.download.Download

buildscript {
    repositories {
        maven { url "https://jars.interlis.ch" }
        maven { url "https://repo.osgeo.org/repository/release/" }
        maven { url "https://plugins.gradle.org/m2/" }
        maven { url "https://s01.oss.sonatype.org/service/local/repositories/releases/content/" }
        maven { url "https://s01.oss.sonatype.org/service/local/repositories/snapshots/content/" }
        mavenCentral()
    }
}

plugins {
  id "de.undercouch.download" version "4.1.2"
  //id "ch.so.agi.gretl" version "2.3.426"
  id "ch.so.agi.gretl" version "3.0.LOCALBUILD"
}

defaultTasks 'foo'

tasks.register('foo') {
    doLast {
        println("foo")
    }
}