name := "Kafka-Producer-Consumer"

version := "0.1"

scalaVersion := "2.11.8"

// https://mvnrepository.com/artifact/org.apache.kafka/kafka
libraryDependencies += "org.apache.kafka" %% "kafka" % "2.3.0"

libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.1.3" % Runtime