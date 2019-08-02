


def combin(list: List[Int],money: Int,temp: List[Int]): Map[Int,Int] = {
  if(money == 0) collector(temp)
  else if(money < 0) Map()
  else{
    list match {
      case Nil => Map()
      case x :: xs => combin(list,money-x,x :: temp) ++ combin(xs,money,temp)
    }
  }
}

def collector(list: List[Int],map: Map[Int,Int] = Map()): Map[Int,Int] = {
  list match {
    case Nil => map
    case x :: xs =>{
      val tuple = list.partition(_ == x)
      collector(tuple._2,map ++ Map(x ->tuple._1.size))
    }
  }
}