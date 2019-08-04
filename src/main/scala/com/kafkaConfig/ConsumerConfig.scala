package com.kafkaConfig

object ConsumerConfig {

  //Keys
  val BOOTSTRAP_SERVER_CONFIG = "bootstrap.servers"
  val KEY_DESERIALIZER_CONFIG= "key.deserializer"
  val VALUE_DESERIALIZER_CONFIG = "value.deserializer"
  val ENABLE_AUTO_COMMIT_CONFIG = "enable.auto.commit"
  val AUTO_COMMIT__INTERNAL_MS_CONFIG = "auto.commit.interval.ms"
  val AUTO_OFFSET_RESET_CONFIG = "auto.offset.reset"
  val SESSION_TIMEOUT_MS_CONFIG = "session.timeout.ms"
  val GROUP_ID_CONFIG = "group.id"

  //Values
  val BOOTSTRAP_SERVER_CONFIG_VALUE = "localhost:9092"
  val KEY_DESERIALIZER_VALUE = "io.confluent.kafka.serializers.KafkaAvroDeserializer"
  val VALUE_DESERIALIZER_VALUE = "io.confluent.kafka.serializers.KafkaAvroDeserializer"
  val ENABLE_AUTO_COMMIT_VALUE = "true"
  val AUTO_COMMIT__INTERNAL_MS_VALUE  = "1000"
  val AUTO_OFFSET_RESET_VALUE  = "earliest"
  val SESSION_TIMEOUT_MS_VALUE  = "30000"
}
