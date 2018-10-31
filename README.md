# AnnotationDemo

## 2. Java反射API

反射API用来生成JVM中的类、接口或则对象的信息。 
- Class类：反射的核心类，可以获取类的属性，方法等信息。 
- Field类：Java.lang.reflec包中的类，表示类的成员变量，可以用来获取和设置类之中的属性值。 
- Method类： Java.lang.reflec包中的类，表示类的方法，它可以用来获取类中的方法信息或者执行方法。 
- Constructor类： Java.lang.reflec包中的类，表示类的构造方法。


## 3. 步骤

获取想要操作的类的Class对象
调用Class类中的方法
使用反射API来操作这些信息

### 3.2 获取Class对象的方法

- 调用某个对象的getClass()方法
```
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
