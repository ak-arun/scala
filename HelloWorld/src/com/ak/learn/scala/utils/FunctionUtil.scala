package com.ak.learn.scala.utils


object FunctionUtil {
  
  def add(a:Int,b:Int): Int = {
    a+b;
  }
  
  
  def f1(a:Int) : Unit={
    println("value is "+a);
  }
  
  
  def f2(b: => Int) ={
    val const = b+10;
    f1(const);
     const;
  }
  
  
  def f3(k:Int):Int={
    k+10;
  }
  
  
  def f4(l: => Int):Int={
    
  println("l val is "+l);
  
  l;
    
  }
  

  
  def printMultiString(string : String*){
    for(s <-string){
      println("String is "+s);
    }
  }
  
  
  def multiply(a:Int = 0, b:Int=1):Int={
    a*b;
  }
  
  def multiply1(a:Int , b:Int):Int={
    a*b;
  }
  
  
  def caller( a : Int => String, b: Int)=a(b);
  
  def callee(c:Int): String={
  "Stringified "+c.toString();
  }
  
  
   def genericToString[MYTYPE](arg: MYTYPE) = "[" + arg.toString() + "]"
   
   
   var mul = (x: Int, y: Int) => x*y;
   
   var noArg = () => { println("a no arg function") }
   
   
   def plus(s1:String)(s2:String)={
     s1+s2;
     }
  
}