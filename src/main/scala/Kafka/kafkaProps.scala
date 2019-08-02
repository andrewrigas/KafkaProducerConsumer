package Kafka



case class Props(server: String,host: String )

abstract class kafkaProps(implicit val prop: Props) {
  val props = new Properties()
  props.put(prop.server,prop.host)
}
