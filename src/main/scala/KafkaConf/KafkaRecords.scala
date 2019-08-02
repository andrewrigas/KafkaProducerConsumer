package KafkaConf

import java.time.OffsetDateTime

import scala.concurrent.duration.Duration

sealed trait record

case class Start(userId: String,contentId: String,eventTimestamp: OffsetDateTime) extends record

case class Stop(userid: String,eventTimestamp: OffsetDateTime) extends record

case class ContentWatchedEvents(userId: String, contentId: String, startTimestamp: OffsetDateTime, timeWatched: Duration) extends record

class KafkaRecords {

}
