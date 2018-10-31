# AnnotationDemo
## 1. 反射机制

对于任意一个类，都能够知道这个类的所有属性和方法；对于任意一个对象，都能够调用它的任意一个方法和属性；这种动态获取的信息以及动态调用对象的方法的功能称为java语言的反射机制。

## 2. Java反射API

反射API用来生成JVM中的类、接口或则对象的信息。 
- Class类：反射的核心类，可以获取类的属性，方法等信息。 
- Field类：Java.lang.reflec包中的类，表示类的成员变量，可以用来获取和设置类之中的属性值。 
- Method类： Java.lang.reflec包中的类，表示类的方法，它可以用来获取类中的方法信息或者执行方法。 
- Constructor类： Java.lang.reflec包中的类，表示类的构造方法。


## 3. 步骤

- 获取想要操作的类的Class对象
- 调用Class类中的方法
- 使用反射API来操作这些信息

### 3.1 获取Class对象

- 调用某个对象的getClass()方法
``` java
Person p=new Person();
Class clazz=p.getClass();
```
- 调用某个类的class属性来获取该类对应的Class对象
```
Class clazz=Person.class;
```
- 使用Class类中的forName()静态方法; (最安全/性能最好)
```
Class clazz=Class.forName("com.xxx.xxx..."); (类的全路径，最常用)
```
### 3.2 获取Class类中的方法

#### 构造方法

1). 批量的方法： 	
```
//所有"公有的"构造方法
public Constructor[] getConstructors()

//获取所有的构造方法(包括私有、受保护、默认、公有)
public Constructor[] getDeclaredConstructors()
```

2). 获取单个的方法
```
//获取单个的"公有的"构造方法
public Constructor getConstructor(Class... parameterTypes)

//获取"某个构造方法"可以是私有的，或受保护、默认、公有
public Constructor getDeclaredConstructor(Class... parameterTypes)
```

3). 调用构造方法：
```
newInstance(Object... initargs)
```
#### 成员变量

1).批量的
```
//获取所有的"公有字段"
Field[] getFields()
//获取所有字段，包括：私有、受保护、默认、公有
Field[] getDeclaredFields()
```

2).获取单个的：
```
//获取某个"公有的"字段
public Field getField(String fieldName)
//获取某个字段(可以是私有的)
public Field getDeclaredField(String fieldName)
```

3).设置字段的值：
```
	Field --> public void set(Object obj,Object value):
```
参数说明：
- obj:要设置的字段所在的对象；
- value:要为字段设置的值；

#### 成员方法

1).批量的：
```
//获取所有"公有方法"；（包含了父类的方法也包含Object类）
public Method[] getMethods()
//获取所有的成员方法，包括私有的(不包括继承的)
public Method[] getDeclaredMethods()
 ```

2).获取单个的：
 ```
 //获取某个"公有的"方法
public Method getMethod(String name,Class<?>... parameterTypes):
//获取某个方法(可以是私有的)
public Method getDeclaredMethod(String name,Class<?>... parameterTypes)
 ```
参数说明
- name : 方法名；
- Class ... : 形参的Class类型对象

3). 调用方法：
 ```
Method --> public Object invoke(Object obj,Object... args):
```
参数说明：
- obj: 要调用方法的对象,如果方法是static静态的，所以为obj可以为null；
- args: 调用方式时所传递的实参；

### 3.3 使用反射API操作



###

f.setAccessible(true);//暴力反射，解除私有限定
