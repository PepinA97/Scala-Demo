object ScalaDemo {
    def main(args: Array[String]) {
        if (args.length != 0) {
            println(sum(args(0).toInt))
        }
        else {
            println("Useage: Demo.scala [integer]")
        }
    }

    def sum(xs: Int) : Int = 
        xs match {
            case 0 => 0
            case _ => xs + sum(xs - 1)
        }
}