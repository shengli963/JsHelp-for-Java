#简单修改了JArray的一些功能.

# JsHelp-for-Java

前端看起来很亲切的java的另一种写法（(⊙o⊙)…有点绕口）
##如何开始
```Java
import JsHelp.*;
```
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
* [JMap 哈希表操作](#JMap) 
  * [set](#set) 
  * [get](#get)
  * [remove](#remove) 
  * [unshift](#unshift) 
  * [forEach](#forEach) 
  * [setStart](#setStart) 
  * [next](#next) 

  
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
### clear
#### `public void clear()`
**删除数组所有元素**
```Java
 arr.clear();
```
<br />
### toArray
#### `public Object[] toArray()`
**将此伪数组转换成真正的数组**
```Java
 arr.toArray();
```
<br />
### clone
#### `public Object clone()`
**克隆一份数组**
```Java
 arr.clone();
```
<br />
### indexOf
#### `public <F> int indexOf(F a)`
**测试指定值在数组的下标位置，如果指定值不存在则返回-1**
```Java
 arr.indexOf("hello");
```
<br />
## JMap
```Java
 JMap hash = new JMap();
```
### set 
#### `public <K,V> String set(K a,V b)`
**设置哈希表key和value任意类型的值**
```Java
  hash.set("name", "aaa");
		hash.set("age", 15);
```
<br />
### get 
#### `public <K> Object get(K a)`
**获取key对应的value**
```Java
  Console.log(hash.get("name"));
```
<br />
### remove 
#### `public <K> boolean remove (K a)`
**删除key对应的值和value**
```Java
  hash.remove("name");
```
<br />
### forEach 
### next 
#### `public Object[] forEach()`
#### `public Object[] next()`
**forEach遍历哈希表，和next结合使用**
```Java
		while(hash.forEach().length>0){
			Console.log(hash.next()[0]);
			Console.log(hash.next()[1]);
		}
```
<br />
### setStart 
#### `public void setStart()`

**某些特殊情况下，可手动设置遍历下标指向0**
```Java
	hash.setStart()
```
<br />
