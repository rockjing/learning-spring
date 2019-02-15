
-  结论一：尽可能的减小try块！！！
-  结论二：保证所有资源都被正确释放。充分运用finally关键词。
-  结论三：catch语句应当尽量指定具体的异常类型
    * 而不应该指定涵盖范围太广的Exception类。 
    * 不要一个Exception试图处理所有可能出现的异常。
 
 >那么怎么改进呢？有四种选择：
 - 1、处理异常。
   * 对所发生的的异常进行一番处理，如修正错误、提醒。再次申明ex.printStackTrace()算不上已经“处理好了异常”.
 - 2、重新抛出异常。
 - 3、 封装异常
 
 - 异常信息不明确
   * java.io.FileNotFoundException 。。。不好的方式
   * The Config File not Exist!                       好的方式
   
   * ex.printStackTrace();               不好的方式
   * logger.error("说明问题本质")  好的方式           
   
