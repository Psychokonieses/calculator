package calculator.model

class Divide(calculator: Calculator) extends State(calculator) {

  override def displayNumber(): Double = {
    calculator.displayed.toDouble
  }

  override def clearPressed(): Unit = {
    calculator.state = new Initial(calculator)
    calculator.LHS = 0
    calculator.RHS = 0

  }

  override def numberPressed(number: Int): Unit = {
    calculator.rightMan += number.toString
    calculator.RHS = calculator.rightMan.toDouble
    calculator.displayed = calculator.rightMan

  }

  override def dividePressed(): Unit = {
    calculator.LHS /= calculator.RHS
    calculator.displayed = calculator.LHS.toString
    calculator.RHS = 1
    calculator.rightMan = "0"
  }

  override def multiplyPressed(): Unit = {
    calculator.LHS /= calculator.RHS
    calculator.displayed = calculator.LHS.toString
    calculator.state = new Multiply(calculator)
    calculator.RHS = 1
    calculator.rightMan = "0"
  }

  override def subtractPressed(): Unit = {
    calculator.LHS /= calculator.RHS
    calculator.displayed = calculator.LHS.toString
    calculator.state = new Subtract(calculator)
    calculator.RHS = 0
    calculator.rightMan = "0"
  }

  override def addPressed(): Unit = {
    calculator.LHS /= calculator.RHS
    calculator.displayed = calculator.LHS.toString
    calculator.state = new Add(calculator)
    calculator.RHS = 0
    calculator.rightMan = "0"
  }

  override def equalsPressed(): Unit = {
    calculator.LHS = calculator.LHS / calculator.RHS
    calculator.displayed = calculator.LHS.toString
    calculator.RHS = 1
    calculator.rightMan = "0"
    calculator.state = new equalsAft(calculator)
  }

  override def decimalPressed(): Unit = {
    calculator.rightMan += "."
    calculator.state = new DecimalDiv(calculator)
  }
}