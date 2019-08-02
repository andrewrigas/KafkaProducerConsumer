


def combinations(list: List[Int],money: Int,temp: List[Int]): Int = {
  if(money == 0) 1
  else if(money < 0) 0
  else{
    list match {
      case Nil => 0
      case x :: xs => combinations(list,money-x,x :: temp) + combinations(xs,money,temp)
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


