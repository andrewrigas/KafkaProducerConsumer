package Kafka

import org.apache.kafka.clients.consumer.KafkaConsumer


class kafkaConsumer()(implicit override val prop: Props) extends kafkaProps() {

  def createConsumer(group: String) ={
    props.put("group.id",group)
    props.put("key.deserializer","org.apache.kafka.common.serialization.StringDeserializer")
    props.put("value.deserializer","org.apache.kafka.common.serialization.StringDeserializer")
    new KafkaConsumer[String,String](props)
  }


}