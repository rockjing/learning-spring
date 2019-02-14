> update on 2019.02.03 
- add a test case of command pattern
- using IOC and testNg

> update on 2019.02.04
- 一个接口多种实现的情况，采用哪种类 
总结：
- @Autowired 是通过 byType 的方式去注入的， 使用该注解，要求接口只能有一个实现类。
- @Resource 可以通过 byName 和 byType的方式注入， 默认先按 byName的方式进行匹配，如果匹配不到，再按 byType的方式进行匹配。
- @Qualifier 注解可以按名称注入， 但是注意是 类名。
--------------------- 
作者：baigp 
来源：CSDN 
原文：https://blog.csdn.net/u010476994/article/details/80986435 
版权声明：本文为博主原创文章，转载请附上博文链接！