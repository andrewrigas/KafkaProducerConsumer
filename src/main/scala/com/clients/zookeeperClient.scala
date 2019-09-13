package com.clients

import kafka.utils.ZkUtils


final case class zookeeperClient(zookeeperConnect: String = "localhost:2181",sessionTimeoutMs: Int = 10000,connectionTimeoutMs: Int = 10000){
  def getZkUtils = ZkUtils.apply(zookeeperConnect,sessionTimeoutMs,connectionTimeoutMs,false)
}
