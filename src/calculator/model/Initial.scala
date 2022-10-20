package calculator.model

class Initial(calculator : Calculator) extends State(calculator) {

  override def displayNumber(): Double = {
    calculator.displayed.toDouble

  }

  override def clearPressed(): Unit = {
    calculator.LHS = 0
    calculator.RHS = 0
  }

  override def numberPressed(number: Int): Unit = {
    calculator.displayed += number.toString
    calculator.LHS = calculator.displayed.toDouble

  }

  override def dividePressed(): Unit = {
    calculator.RHS = 1
    calculator.state = new Divide(calculator)
  }

  override def multiplyPressed(): Unit = {
    calculator.RHS = 1
    calculator.state = new Multiply(calculator)
  }

  override def subtractPressed(): Unit = {
    calculator.state = new Subtract(calculator)
  }

  override def addPressed(): Unit = {
    calculator.state = new Add(calculator)
  }

  override def equalsPressed(): Unit = {

  }

  override def decimalPressed(): Unit = {
    calculator.displayed += "."
    calculator.state = new Decimal(calculator)

  }



}