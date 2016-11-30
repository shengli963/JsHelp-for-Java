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
### push 
#### `public <A> A push(A a)`
**向数组添加一个任意类型元素**
```Java
 arr.push(123);
 arr.push("SOME");
 arr.push(new Object());
```
<br />
### pop 
#### `public String pop()`
**删除数组最后面的一个元素**
```Java
 arr.pop();
```
<br />
### shift 
#### `public String shift()`
**删除数组最前面的一个元素**
```Java
 arr.shift();
```
<br />
### unshift 
#### `public <B> B unshift(B a)`
**向数组最前面添加一个任意元素**
```Java
 arr.unshift("some");
```
<br />

### get 
#### `public String get(int index)`
**获取指定下标的值**
```Java
 arr.get(2);
```
<br />

### set 
#### `public <C> String set(int index,C a)`
**设置指定下标的值**
```Java
 arr.set(1,"some");
```
<br />
### slice 
#### `public <D> Object slice(int n,int m)`
**获取n到m下标之间对应的值**
```Java
 arr.slice(1,5);
```
<br />
### remove
#### `public String remove(int n)`
**删除指定下标的值**
```Java
 arr.remove(1);
```
<br />
