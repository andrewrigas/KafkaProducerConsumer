package com.kafkaConfig

object ProducerConfig {

  //Keys
  val BOOTSTRAP_SERVER_CONFIG = "bootstrap.servers"
  val KEY_SERIALIZER_CONFIG = "key.serializer"
  val VALUE_SERIALIZER_CONFIG = "value.serializer"
  val METADATA_BROKER_LIST_CONFIG = "metadata.broker.list"
  val PRODUCER_TYPE_CONFIG = "producer.type"
  val REQUEST_REQUIRED_ACKS_CONFIG = "request.required.acks"
  val PARTITIONER_CLASS_CONFIG = "partitioner.class"

  //Values
  val BOOTSTRAP_SERVER_VALUE = "localhost:9092"
  val KEY_SERIALIZER_VALUE = "io.confluent.kafka.serializers.KafkaAvroSerializer"
  val VALUE_SERIALIZER_VALUE = "io.confluent.kafka.serializers.KafkaAvroSerializer"
  val METADATA_BROKER_LIST_VALUE = "localhost:9092"
  val PRODUCER_TYPE_VALUE = "async"
  val REQUEST_REQUIRED_ACKS_CONFIG_VALUE = "1"


}
