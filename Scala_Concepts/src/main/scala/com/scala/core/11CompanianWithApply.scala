package com.scala.core

object CompanianWithApply extends App {

  // apply is a special method as part of companian objects
  
  def apply(orderId: Int, orderDate: String, orderCustomerId: Int, orderStatus: String): CompanianWithApply = {
    new CompanianWithApply(orderId, orderDate, orderCustomerId, orderStatus)
  }

  // apply is a special method as part of companian objects
  
  def apply(orderId: String, orderDate: String, orderCustomerId: String, orderStatus: String): CompanianWithApply = {
    new CompanianWithApply(orderId.toInt, orderDate, orderCustomerId.toInt, orderStatus) // We can typecast since the class Order is of type Int
  }

  // You can invoke apply method 2 always

//i)  
    var CompanianWithApplyUsingApply = CompanianWithApply.apply("1", "2013-10-01 00:00:00.000", "100", "CompanianWithApplyUsingApply")
    println(CompanianWithApplyUsingApply +"\n")
    
//ii) 
    var CompanianWithApplyDirect = CompanianWithApply("1", "2013-10-01 00:00:00.000", "100", "CompanianWithApplyDirect")
    println(CompanianWithApplyDirect)

    
// When we use the command to check the compiled code , it creates 2 classes
/*i) command:  :javap -p CompanianWithApply
O/P:
public class CompanianWithApply {
  private int orderId;
  private java.lang.String orderDate;
  private int orderCustomerId;
  private java.lang.String orderStatus;
  public int orderId();
  public void orderId_$eq(int);
  public java.lang.String orderDate();
  public void orderDate_$eq(java.lang.String);
  public int orderCustomerId();
  public void orderCustomerId_$eq(int);
  public java.lang.String orderStatus();
  public void orderStatus_$eq(java.lang.String);
  public java.lang.String toString();
  public CompanianWithApply(int, java.lang.String, int, java.lang.String);
}    
    
 ii) command :javap -p CompanianWithApply$
O/P:
public class CompanianWithApply$ {
  public static final CompanianWithApply$ MODULE$;
  public static {};
  public CompanianWithApply apply(int, java.lang.String, int, java.lang.String);
  public CompanianWithApply apply(java.lang.String, java.lang.String, java.lang.String, java.lang.String);
  public CompanianWithApply$();
}*/
    
}

class CompanianWithApply(var orderId: Int, var orderDate: String, var orderCustomerId: Int, var orderStatus: String) {
  println("I am inside CompanianWithApply Constructor")
  override def toString = "CompanianWithApply(" + orderId + "," + orderDate + "," + orderCustomerId + "," + orderStatus + " )"
}