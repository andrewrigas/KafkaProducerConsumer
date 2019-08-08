package com.kafkaConfig

object ProducerConfig {

  //Keys
  val BOOTSTRAP_SERVER_CONFIG = "bootstrap.servers"
  val KEY_SERIALIZER_CONFIG = "key.serializer"
  val VALUE_SERIALIZER_CONFIG = "value.serializer"
  val METADATA_BROKER_LIST_CONFIG = "metadata.broker.list"
  val PRODUCER_TYPE_CONFIG = "producer.type"
  val ACKS_CONFIG = "acks" //Getting a response from brokers receive the record
  val BUFFER_MEMORY_CONFIG = "buffer.memory" //The memory that producer will use to store the waiting records
  val COMPRESSION_TYPE_CONFIG =  "compression.type" //Compress records reduce network utilization and storage
  val RETRIES_CONFIG = "retries" //The tries of resend a record (No effect if ACKS is 0)
  val BATCH_SIZE_CONFIG = "batch.size" //Multiple records are sent to the same partition, the producer will batch them together
  val PARTITIONER_CLASS_CONFIG = "partitioner.class"

  //Values
  val BOOTSTRAP_SERVER_VALUE = "localhost:9092"
  val KEY_SERIALIZER_VALUE = "org.apache.kafka.common.serialization.StringSerializer"
  val VALUE_SERIALIZER_VALUE = "org.apache.kafka.common.serialization.StringSerializer"
  val METADATA_BROKER_LIST_VALUE = "localhost:9092"
  val PRODUCER_TYPE_VALUE = "async"
  val ACKS_VALUE = ("0","1","all")// Values 0 for no acknowledgement , 1 when leader received record, all when all replicas get the record
  val BUFFER_MEMORY_VALUE = "33554432" //Example
  val COMPRESSION_TYPE_VALUE = ("none","gzip","snappy","lz4","zstd") //Different ways of compression
  val RETRIES_VALUE = 3 //3 times resend
  val BATCH_SIZE_VALUE = "54432" //Will not wait to be full might send a half or single record

}
