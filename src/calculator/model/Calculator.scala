package calculator.model


class Calculator() {

  var RHS : Double = 0
  var LHS : Double = 0
  //var ANS : Double = 0
  var displayed : String = "0"
  var rightMan : String = "0"
  var equalsAns: String = "0"

  var state : State = new Initial(this)


  // Accessed by View. You should edit this method as you build functionality
  def displayNumber(): Double = {
    println("LHS: " + this.LHS + "  " + "RHS: " + this.RHS)
    this.state.displayNumber()
  }

  def clearPressed(): Unit = {
    this.displayed = "0"
    this.RHS = 0
    this.LHS = 0
    this.rightMan = "0"
    this.state = new Initial(this)

  }

  def numberPressed(number: Int): Unit = {
    this.state.numberPressed(number)
  }

  def dividePressed(): Unit = {
    this.state.dividePressed()
  }

  def multiplyPressed(): Unit = {
    this.state.multiplyPressed()
  }

  def subtractPressed(): Unit = {
    this.state.subtractPressed()
  }

  def addPressed(): Unit = {
    this.state.addPressed()
  }

  def equalsPressed(): Unit = {
    this.state.equalsPressed()
  }

  def decimalPressed(): Unit = {
    this.state.decimalPressed()
  }


}