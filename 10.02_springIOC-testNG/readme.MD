> update on 2019.02.03 
- add a test case of command pattern
- using IOC and testNg

> update on 2019.02.04
- 一个接口多种实现的情况，采用哪种类 
总结：
- @Autowired 是通过 byType 的方式去注入的， 使用该注解，要求接口只能有一个实现类。
- @Resource 可以通过 byName 和 byType的方式注入， 默认先按 byName的方式进行匹配，如果匹配不到，再按 byType的方式进行匹配。
- @Qualifier 注解可以按名称注入， 但是注意是 类名。

参考：
[Spring注解——同一接口有多个实现类，如何注入？@Resource、@Autowired、@Qualifier](https://blog.csdn.net/u010476994/article/details/80986435) 


- 请见 SpringUtilTest 利用一个继承ApplicationContextAware的类实现动态获取某个Interface下面所有的实例
但只能在spring应用中使用
- 在Servlet容器中 则集成  implements ServletContextListener，使用 WebApplicationContextUtils
```$xslt
ApplicationContext ac = WebApplicationContextUtils.getWebApplicationContext(sc);
Map<String, IMsgHandler> result = ac.getBeansOfType(IMsgHandler.class);
```

参考：
*   [获取实现某个接口的所有实现类集合](https://blog.csdn.net/cyxinda/article/details/78586739) 
*  [SpringBoot 之 普通类获取Spring容器中的bean](https://www.cnblogs.com/s648667069/p/6489557.html)

> 2019.02.24 
[Spring 生命周期 各种初始化方法 执行顺序 ](https://blog.csdn.net/z69183787/article/details/78414659)

通过 postConstruct 后期加载方式就替换了IUserProvider的真实实现，而改用一个我们定义的Mock实例了。
```java
@PostConstruct
    public void postConstruct() {

        this.userProvider = new AnotherUserProviderImpl();
    }
```
还有一种方式：
[spring中使用mockito](https://www.cnblogs.com/syxchina/p/4150879.html)
替换 
```java
private TestApiService spyTestApiService;
     @Autowired
     private TestApiService testApiService;

```
在 @Before
  public void initMocks() throws Exception {
  进行替换
```java

  ReflectionTestUtils.setField(AopTargetUtils.getTarget(apiService), "testApiService", spyTestApiService);
  when(spyTestApiService.connect()).thenReturn("ok");
```
