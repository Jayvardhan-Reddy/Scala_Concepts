package com.scala.core

/* All the counter parts to the primitive types(int, float..) of Java in Scala are called Value classes (Int, Float..), you can see that on 
 * compilation from scala to java. using the command :javap -p ClassName
 * The Value classes convert according to the requirement i.e either to Java primitive types(int,float) or classes (Integer,FLoat) and the
 * conversion part is hidden from the user
 */


object ScalaClassAndAttributes {
 def main(args: Array[String]){
  val depValObj = new DepartmentVal(23, "creep")
  println(depValObj.deptId)
  
  val depDefaultConstructors = new Department(23, "creep")
//  println(depDefaultConstructors.deptId)  // You cannot call the getter method as it does not exist
  
// case 4:
  val depOverrideToString = new DepartmentVarOverride(23, "creep")
  println(depOverrideToString)
  
 }
}

// Case 1: On declaring a class without a variable var or val it is considered as a constructor with parameters as shown below

class Department(deptId: Int, deptName: String)

/*scala> :javap -p Department
Compiled from "<console>"
public class Department {
  public Department(int, java.lang.String);
}*/

// Case 2: On declaring a class with a variable of type val it creates a class level immutable variable and constructor for the same and getter methods.

class DepartmentVal(val deptId: Int, val deptName: String)

/*scala> :javap -p DepartmentVal
Compiled from "<console>"
public class DepartmentVal {
  private final int deptId;	// immutable variables
  private final java.lang.String deptName;
  public int deptId();	// getter method for immutable varaible deptId
  public java.lang.String deptName();
  public DepartmentVal(int, java.lang.String);
}*/

// Case 3: On declaring a class with a variable of type var it creates a class level mutable variable and constructor for the same and getter setter methods.

class DepartmentVar(var deptId: Int, var deptName: String)

/*scala> :javap -p DepartmentVar
Compiled from "<console>"
public class DepartmentVar {
  private int deptId;
  private java.lang.String deptName;
  public int deptId();
  public void deptId_$eq(int);	// setter methods 
  public java.lang.String deptName();
  public void deptName_$eq(java.lang.String);
  public DepartmentVar(int, java.lang.String);
}*/

// Case 4: Overriding toString method

class DepartmentVarOverride(var deptId: Int, var deptName: String){
  println("departmentId is "+ deptId + " and department name is "+ deptName)
  override def toString = "Department(" + deptId + "," + deptName + ")" 
}

/*scala> :javap -p DepartmentVarOverride
Compiled from "<console>"
public class DepartmentVarOverride {
  private int deptId;
  private java.lang.String deptName;
  public int deptId();
  public void deptId_$eq(int);
  public java.lang.String deptName();
  public void deptName_$eq(java.lang.String);
  public java.lang.String toString();
  public DepartmentVarOverride(int, java.lang.String);
}*/