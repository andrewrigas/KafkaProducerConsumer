package com.kafkaTool

import collection.JavaConverters._
import java.util.Properties

import org.apache.kafka.clients.consumer.{ConsumerRecords, KafkaConsumer}


object kafkaConsumer  {

  def createConsumer[K,V](properties: Map[String , String]) ={
    val props = new Properties()
    for(property <- properties) props.put(property._1,property._2)
    new KafkaConsumer[K,V](props)
  }

  def subscribeToTopic[K,V](kafkaConsumer: KafkaConsumer[K,V],topics: Seq[String]) = {
    kafkaConsumer.subscribe(topics.asJava)
  }


  def consumerPoll[K,V](kafkaConsumer: KafkaConsumer[K,V],timeoutMS: Int = 100) = {
    while(true){
      val records: ConsumerRecords[K, V] = kafkaConsumer.poll(100)
      records.cd
    }
  }

}