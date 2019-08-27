
def collector(list: List[Int],map: Map[Int,Int] = Map()): List[Map[Int,Int]]= {
  list match {
    case Nil => List(map)
    case x :: xs =>{
      val tuple = list.partition(_ == x)
      collector(tuple._2,map ++ Map(x ->tuple._1.size))
    }
  }
}

def combinations(list: List[Int],money: Int,temp: List[Int] = Nil): List[Map[Int,Int]]  = {
  if(money == 0) collector(temp)
  else if(money < 0) Nil
  else{
    list match {
      case Nil => Nil
      case x :: xs => combinations(list,money-x,x :: temp) ::: combinations(xs,money,temp)
    }
  }
}

combinations(List(1,2,3,4,5),10)

