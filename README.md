# JsHelp-for-Java
前端看起来很亲切的java的另一种写法（(⊙o⊙)…有点绕口）
<br />
## 目录
* [Console 控制台操作](#console) 
  * [log](#log) 
* [JArray 数组操作](#jarray) 
  * [push](#push) 
  * [pop](#pop)
  * [shift](#shift) 
  * [unshift](#unshift) 
  * [get](#get) 
  * [set](#set) 
  * [slice](#slice) 
  * [remove](#remove) 
  * [toArray](#toArray) 
  * [indexOf](#indexOf)
  
  
<br />

## Console 
### log 
#### `public static <T> void log(T a)`
**向控制台打印一句话**
```Java
 Console.log("hello!");
 Console.log(123456);
```
<br />

## JArray 
```Java
 JArray arr = new JArray();
```
<br />
### push 
#### `public <A> A push(A a)`
**向数组添加一个任意类型元素**
```Java
 arr.push(123);
 arr.push("SOME");
 arr.push(new Object());
```
<br />
