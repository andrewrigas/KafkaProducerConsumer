package Kafka

import kafka.zk.AdminZkClient
import org.apache.kafka.common

object Topic {

  def createTopic(topicName: String, partitions: Int = 3, replicationFactor: Int = 3)(implicit zkClient: AdminZkClient): Unit = {
    zkClient.createTopic(topicName,partitions,replicationFactor)
  }

  def requestTopic() = ???

}
