package com.scala.core

object CaseClassWorking extends App {
  
  //To create a Object
val order = Order2.apply(1, "2013-10-01 00:00:00.000", 100, "COMPLETE")

}

// case 1 : Here if we don't declare var or val then by default it considers as val
case class Order2(orderId: Int, orderDate: String, orderCustomerId: Int, orderStatus: String) 
{
  println("I am inside Order Constructor")
  override def toString = "Order(" + orderId + "," + orderDate + "," + orderCustomerId + "," + orderStatus + " )"
}

// case 2 : Here if we declare var or val 
case class Order1(var orderId: Int, var orderDate: String, var orderCustomerId: Int, var orderStatus: String)
{
    println("I am inside Order111 Constructor")
    override def toString = "Order(" + orderId + "," + orderDate + "," + orderCustomerId + "," + orderStatus + " )"
}

/*
 * On Executing case 1 of Case class
 * i) command:  :javap -p Order
O/P:
public class Order implements scala.Product,scala.Serializable {
  // Serializable will help you transfer over the network or save as bytestream in filesystem
  // Product will give helper methods where it will give you access to the attributes of the Objects easily using different approaches
  private final int orderId;  //final beacuase variables are val
  private final java.lang.String orderDate;
  private final int orderCustomerId;
  private final java.lang.String orderStatus;
  public int orderId();
  public java.lang.String orderDate();
  public int orderCustomerId();
  public java.lang.String orderStatus();
  public java.lang.String toString();
  public Order copy(int, java.lang.String, int, java.lang.String);
  public int copy$default$1();
  public java.lang.String copy$default$2();
  public int copy$default$3();
  public java.lang.String copy$default$4();
  public java.lang.String productPrefix();
  public int productArity();
  public java.lang.Object productElement(int);
  public scala.collection.Iterator<java.lang.Object> productIterator();
  public boolean canEqual(java.lang.Object);
  public int hashCode();
  public boolean equals(java.lang.Object);
  public Order(int, java.lang.String, int, java.lang.String);
}

O/P: Command :javap -p Order$
public class Order$ extends scala.runtime.AbstractFunction4<java.lang.Object, java.lang.String, java.lang.Object, java.lang.String, Order> implements scala.Serializable {
 public static final Order$ MODULE$;
 public static {};
 public final java.lang.String toString();
 public Order apply(int, java.lang.String, int, java.lang.String);  //By default creates apply methods
 public scala.Option<scala.Tuple4<java.lang.Object, java.lang.String, java.lang.Object, java.lang.String>> unapply(Order);
 private java.lang.Object readResolve();
 public java.lang.Object apply(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object);
 public Order$();
}*/


/*
 * On Executing case 2 of Case class
 * i) command:  :javap -p Order1
O/P:Command :javap -p Order
public class Order implements scala.Product,scala.Serializable {
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
  public Order copy(int, java.lang.String, int, java.lang.String);
  public int copy$default$1();
  public java.lang.String copy$default$2();
  public int copy$default$3();
  public java.lang.String copy$default$4();
  public java.lang.String productPrefix();
  public int productArity();
  public java.lang.Object productElement(int);
  public scala.collection.Iterator<java.lang.Object> productIterator();
  public boolean canEqual(java.lang.Object);
  public int hashCode();
  public boolean equals(java.lang.Object);
  public Order(int, java.lang.String, int, java.lang.String);
} */
