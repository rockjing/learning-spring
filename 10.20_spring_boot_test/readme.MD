注意查看
OutSideApiServiceTest

```java
// 通过classes 指定加载的类，否则，无法创建 bean - outSideApiService 
@SpringBootTest(classes = OutSideApiService.class)


@Autowired
 private OutSideApiService outSideApiService;
```

比较：PackageScanIssueTest 尽管与OutSideApiServiceTest 代码很接近，
但它无法获取 outSideApiService bean
主要原因还是其包扫描的地方为： hello.api ,而尽管与OutSideApiService 在hello.service 下面
> --- IntelliJ IDEA coverage runner ---- 
  sampling ...
  include patterns:
  hello\.api\..*  --- 注意这里
  exclude patterns:验证 package 包的bean是无法扫描到的。
  

