
# Errors

#  need commons logging
java.lang.NoClassDefFoundError: org/apache/commons/logging/LogFactory  
at com.taobao.api.internal.util.TaobaoLogger.<clinit>(TaobaoLogger.java:15)  

```  
    <dependency>
      <groupId>commons-logging</groupId>
      <artifactId>commons-logging</artifactId>
      <version>1.2</version>
    </dependency>
```  


# 编辑阿里大鱼SDK    

```  
	<dependency>
		 <groupId>javax.servlet</groupId>
		 <artifactId>javax.servlet-api</artifactId>
		 <version>3.1.0</version>
	</dependency>
		
	<dependency>
		 <groupId>log4j</groupId>
		 <artifactId>log4j</artifactId>
		 <version>1.2.17</version>
	</dependency>


	<dependency>
		 <groupId>org.jboss.netty</groupId>
		 <artifactId>netty</artifactId>
		 <version>3.2.4.Final</version>
	</dependency>


	<dependency>
		 <groupId>org.jboss.aerogear</groupId>
		 <artifactId>aerogear-netty-codec-sockjs</artifactId>
		 <version>0.12.1</version>
	</dependency>

```  

