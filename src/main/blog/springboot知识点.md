## springboot自动装配原理
SpringBoot自动装配以约定优于配置的理念，自动加载符合条件的Bean到IOC容器。<br>
SpringBoot的启动入口是@SpringBootApplication，使用此注解相当于同时使用了@SpringBootConfiguration和@EnableAutoConfiguration等重要注解。<br>
其中@EnableAutoConfiguration注解用来开启自动装配，@EnableAutoConfiguration注解导入AutoConfigurationImportSelector，该Selector负责加载自动装配类。<br>
具体扫描自动装配类的原理是，扫描META-INF/spring.factories文件，读取EnableAutoConfiguration配置项，加载所声明的自动装配类。<br>
AutoConfigurationImportSelector中通过SpringFactoriesLoader加载spring.factories中的配置类，实现SPI机制。<br>
AutoConfigurationImportSelector实现了‌ImportSelector接口，可以动态选择需要导入的配置类，可以根据条件筛选有效的自动装配类。<br>
自动装配完整流程可认为是：
1. 通过SpringApplication.run()触发自动装配
2. 通过AutoConfigurationImportSelector加载自动装配配置
3. 根据条件注解过滤出符合条件的配置类
4. 将筛选后的配置类中定义的Bean注册到IOC容器
5. 通过@AutoConfigureOrder等注解控制加载顺序

## springboot的Starter是怎么实现的
springboot的Starter本质是一组maven的pom，里面定义了组件所需的所有传递性依赖。<br>
Starter通过SPI机制来实现自动配置，通过@ConfigurationProperties注解实现外部配置的注入。<br>
Starter的官方Starter为spring-boot-starter-*，第三方Starter为*-spring-boot-starter。<br>
可自己创建Starter来实现自动装配。

