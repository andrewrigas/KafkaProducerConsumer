package com.kafkaTool

import java.util.Properties

import com.clients.zookeeperClient
import kafka.admin.AdminUtils

object TopicsTool {

  def createTopic(topicName: String, partitions: Int = 3, replicationFactor: Int = 3): Boolean = {
    val zkUtils = zookeeperClient().getZkUtils
    try{
      if(AdminUtils.topicExists(zkUtils,topicName)) false
      else{
        AdminUtils.createTopic(zkUtils, topicName, partitions, replicationFactor, new Properties)
        true
      }
    }finally {
      zkUtils.close()
    }
  }

  def getTopics: Seq[String] = {
    val zkUtils = zookeeperClient().getZkUtils
    try{
      zkUtils.getAllTopics()
    }finally {
      zkUtils.close()
    }
  }

  def deleteTopic(topicName: String): Boolean = {
    val zkUtils = zookeeperClient().getZkUtils
    try{
      if(!AdminUtils.topicExists(zkUtils,topicName)) false
      else{
        AdminUtils.deleteTopic(zkUtils,topicName)
        true
      }
    }finally {
      zkUtils.close()
    }
  }

}
