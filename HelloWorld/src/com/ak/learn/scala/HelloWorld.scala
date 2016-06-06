package com.ak.learn.scala

import com.ak.learn.scala.utils.FunctionUtil
import java.util.Arrays.ArrayList
import java.util.ArrayList
import scala.collection.mutable.ListBuffer
import scala.collection.mutable.SetBuilder

object HelloWorld {
  def main(args: Array[String]): Unit = {
    // unit equivalent to java void
    println("Hello World!!!");
    println(HelloUtil.rev("a string")); // tried calling a java function

    var (a, b, c, d, e, f, g, h, i, j) = Tuple10(1, 2.1f, 1, 2, 3, 4, 5, 6, 7, 8);
    // tried definging a tuple
    println(a.getClass());
    println(b.getClass());
    println(c.getClass());

    println(FunctionUtil.f2(FunctionUtil.add(a, h)));
    // sample function call
    println(FunctionUtil.f4(FunctionUtil.f3(101)));

    FunctionUtil.printMultiString("a", "aa", "aaa");
    // equivalent to java ... array args
    
    println(FunctionUtil.multiply(a, c));
    println(FunctionUtil.multiply(a))
    println(FunctionUtil.multiply())
    // function with default args

    println(FunctionUtil.caller(FunctionUtil.callee, 10));
    // function as an argument
    
    println(FunctionUtil.caller(FunctionUtil.genericToString, 10));
    // generic types

    println(FunctionUtil.mul(2, 51));

    FunctionUtil.noArg();

    println(FunctionUtil.plus("arun")(" ak"));
    // currying

    var array1 = new Array[String](3);
    array1(0) = "1";
    array1(1) = "11";
    array1(2) = "111";
    // array creation is scala

    var list1: List[String] = List("apple", "orange");
    // list is immutable
    
    var fruits = new ListBuffer[String]();
    fruits += "apple";
    fruits += "orange";
// list buffer is mutable
    
    println(list1.equals(fruits));
    
    
  for( s <- fruits){
    println("Fruit is "+s);
  }
  
  var set1 : Set[String] = Set();
  set1+="apple";
  set1+="apple";
  set1+="orange"
  println("Size is "+set1.size);
  // creating and using a mutable set
  
  
  var map1 : Map[String,Int] = Map();
  map1+=("apple"->1);
  map1+=("orange"->2);
  for(e <- map1.keySet){
    println(e+" has value "+map1(e));
  }
  
  // creating and using a mutable map
  
  }

}