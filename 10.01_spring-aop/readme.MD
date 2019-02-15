 
> @Component VS @Service
从源码级别来看， @Repository、@Service、@Controller是@Component的别名。 参看源码： 
```$xslt
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface Repository {
    @AliasFor(
        annotation = Component.class
    )
    String value() default "";
}

```
--------------------- 
作者：kingmax54212008 
来源：CSDN 
原文：https://blog.csdn.net/kingmax54212008/article/details/82525963 
版权声明：本文为博主原创文章，转载请附上博文链接！

Spring 2.5 中除了提供 @Component 注释外，还定义了几个拥有特殊语义的注释，它们分别是：@Repository、@Service 和 @Controller。
在目前的 Spring 版本中，这 3 个注释和 @Component 是等效的，但是从注释类的命名上，很容易看出这 3 个注释分别和持久层、业务层和控制层（Web 层）相对应。
虽然目前这3 个注释和 @Component 相比没有什么新意，但 Spring 将在以后的版本中为它们添加特殊的功能。
所以，如果 Web 应用程序采用了经典的三层分层结构的话，最好在持久层、业务层和控制层分别采用上述注解对分层中的类进行注释。

- @Service用于标注业务层组件
- @Controller用于标注控制层组件（如struts中的action）
- @Repository用于标注数据访问组件，即DAO组件
- @Component泛指组件，当组件不好归类的时候，我们可以使用这个注解进行标注。

 > 通过 component-scan base-package 的方式来进行类注入识别
 
 >  通过两个特殊的注解来实现初始化和销毁
   
  ```java
   @PostConstruct
    public void init() {
    }
    @PreDestroy
    public void destory() {

    }
```

