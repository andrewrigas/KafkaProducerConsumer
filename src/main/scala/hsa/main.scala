package hsa

import java.util.Properties

import Kafka.{Props, kafkaConsumer, kafkaProducer}

object main extends App {

  implicit val props: Properties = new Properties()

  implicit val properties = new Props("bootstrap.servers","broker1:9092,broker2:9092")

  val producerCreator = new kafkaProducer()
  val avroSerializer = "io.confluent.kafka.serializers.KafkaAvroSerializer"

  val consumerCreator = new kafkaConsumer()

  val prod1 = producerCreator.createProducer()
  val prod2 = producerCreator.createProducer()

  val cons1 = consumerCreator.createConsumer("Group1")
  val cons2 = consumerCreator.createConsumer("Group2")





}
