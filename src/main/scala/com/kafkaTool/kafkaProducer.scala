package com.kafkaTool

import java.util.concurrent.Future

import org.apache.kafka.clients.producer.Callback
import org.apache.kafka.clients.producer.{KafkaProducer, ProducerRecord, RecordMetadata}
import java.util.Properties

class producerCallback extends Callback {
  override def onCompletion(metadata: RecordMetadata, exception: Exception): Unit =
    if(exception == null) exception.printStackTrace()
}

object kafkaProducer {
  def createProducer[K,V](properties: Map[String,String]): KafkaProducer[K, V] = {
    val props = new Properties()
    for(property <- properties) props.put(property._1,property._2)
    new KafkaProducer[K,V](props)
  }

  def createRecord[K,V](topic: String ,key: K, value: V ): ProducerRecord[K, V] = {
    new ProducerRecord(topic,key,value)
  }

  def sendAsynchRecord[K,V](producer: KafkaProducer[K,V],record: ProducerRecord[K,V]): Future[RecordMetadata] = {
      producer.send(record,new producerCallback)
  }

  def sendSynchRecord[K,V](producer: KafkaProducer[K,V],record: ProducerRecord[K,V]): RecordMetadata = {
    producer.send(record).get()
  }

}
