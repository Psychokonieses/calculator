package calculator.model

class equalsAft(calculator: Calculator) extends State(calculator) {

    override def displayNumber(): Double = {
      calculator.displayed.toDouble
    }

    override def clearPressed(): Unit = {
      println("Done")
    }

    override def numberPressed(number: Int): Unit = {
      calculator.LHS = 0
      calculator.RHS = 0
      calculator.rightMan = "0"
      calculator.LHS += number.toDouble
      calculator.displayed = number.toString
      println(calculator.displayed)
      calculator.state = new Initial(calculator)
    }

    override def dividePressed(): Unit = {
      calculator.state = new Divide(calculator)
    }

    override def multiplyPressed(): Unit = {
      println("dog multiply")

      calculator.state = new Multiply(calculator)
    }

    override def subtractPressed(): Unit = {
      calculator.state = new Subtract(calculator)
    }

    override def addPressed(): Unit = {
      calculator.state = new Add(calculator)
    }

    override def equalsPressed(): Unit = {
      println("Done")
    }

    override def decimalPressed(): Unit = {
      calculator.LHS = 0
      calculator.RHS = 0
      calculator.rightMan = "0"
      println("why are we still here")
      //calculator.equalsAns = calculator.equalsAns + "."
      //println(calculator.equalsAns)
      //calculator.displayed = calculator.equalsAns
      calculator.displayed = "0."
      println("here")
      calculator.state = new Decimal(calculator)

    }


  }