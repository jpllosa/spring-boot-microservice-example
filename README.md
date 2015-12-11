# spring-boot-microservice-example
sample code for spring boot microservice by joel patrick llosa
for a stackhunter.com blog

here is the output when you run the service then invoke http://localhost:8080/log?m=segmentation%20fault&s=out.of.memory.error:

<pre>
  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v1.2.7.RELEASE)

2015-12-11 10:46:14.732  INFO 3952 --- [           main] example.LogService                       : Starting LogService on asus_k43s with PID 3952 (D:\oracle_com-java\refresher\workspace\spring-boot-microservice-example\target\classes started by jpllosa in D:\oracle_com-java\refresher\workspace\spring-boot-microservice-example)
2015-12-11 10:46:14.785  INFO 3952 --- [           main] ationConfigEmbeddedWebApplicationContext : Refreshing org.springframework.boot.context.embedded.AnnotationConfigEmbeddedWebApplicationContext@22d9d: startup date [Fri Dec 11 10:46:14 CST 2015]; root of context hierarchy
2015-12-11 10:46:15.192  INFO 3952 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Overriding bean definition for bean 'beanNameViewResolver': replacing [Root bean: class [null]; scope=; abstract=false; lazyInit=false; autowireMode=3; dependencyCheck=0; autowireCandidate=true; primary=false; factoryBeanName=org.springframework.boot.autoconfigure.web.ErrorMvcAutoConfiguration$WhitelabelErrorViewConfiguration; factoryMethodName=beanNameViewResolver; initMethodName=null; destroyMethodName=(inferred); defined in class path resource [org/springframework/boot/autoconfigure/web/ErrorMvcAutoConfiguration$WhitelabelErrorViewConfiguration.class]] with [Root bean: class [null]; scope=; abstract=false; lazyInit=false; autowireMode=3; dependencyCheck=0; autowireCandidate=true; primary=false; factoryBeanName=org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration$WebMvcAutoConfigurationAdapter; factoryMethodName=beanNameViewResolver; initMethodName=null; destroyMethodName=(inferred); defined in class path resource [org/springframework/boot/autoconfigure/web/WebMvcAutoConfiguration$WebMvcAutoConfigurationAdapter.class]]
2015-12-11 10:46:16.189  INFO 3952 --- [           main] s.b.c.e.t.TomcatEmbeddedServletContainer : Tomcat initialized with port(s): 8080 (http)
2015-12-11 10:46:16.361  INFO 3952 --- [           main] o.apache.catalina.core.StandardService   : Starting service Tomcat
2015-12-11 10:46:16.379  INFO 3952 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet Engine: Apache Tomcat/8.0.28
2015-12-11 10:46:16.767  INFO 3952 --- [ost-startStop-1] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2015-12-11 10:46:16.767  INFO 3952 --- [ost-startStop-1] o.s.web.context.ContextLoader            : Root WebApplicationContext: initialization completed in 1985 ms
2015-12-11 10:46:18.397  INFO 3952 --- [ost-startStop-1] o.s.b.c.e.ServletRegistrationBean        : Mapping servlet: 'dispatcherServlet' to [/]
2015-12-11 10:46:18.459  INFO 3952 --- [ost-startStop-1] o.s.b.c.embedded.FilterRegistrationBean  : Mapping filter: 'characterEncodingFilter' to: [/*]
2015-12-11 10:46:18.461  INFO 3952 --- [ost-startStop-1] o.s.b.c.embedded.FilterRegistrationBean  : Mapping filter: 'hiddenHttpMethodFilter' to: [/*]
2015-12-11 10:46:18.814  INFO 3952 --- [           main] s.w.s.m.m.a.RequestMappingHandlerAdapter : Looking for @ControllerAdvice: org.springframework.boot.context.embedded.AnnotationConfigEmbeddedWebApplicationContext@22d9d: startup date [Fri Dec 11 10:46:14 CST 2015]; root of context hierarchy
2015-12-11 10:46:18.865  INFO 3952 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/log]}" onto public void example.LogService.log(java.lang.String,java.lang.String)
2015-12-11 10:46:18.866  INFO 3952 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/error]}" onto public org.springframework.http.ResponseEntity<java.util.Map<java.lang.String, java.lang.Object>> org.springframework.boot.autoconfigure.web.BasicErrorController.error(javax.servlet.http.HttpServletRequest)
2015-12-11 10:46:18.866  INFO 3952 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/error],produces=[text/html]}" onto public org.springframework.web.servlet.ModelAndView org.springframework.boot.autoconfigure.web.BasicErrorController.errorHtml(javax.servlet.http.HttpServletRequest)
2015-12-11 10:46:18.885  INFO 3952 --- [           main] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/webjars/**] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
2015-12-11 10:46:18.886  INFO 3952 --- [           main] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/**] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
2015-12-11 10:46:18.921  INFO 3952 --- [           main] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/**/favicon.ico] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
2015-12-11 10:46:18.989  INFO 3952 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Registering beans for JMX exposure on startup
2015-12-11 10:46:19.188  INFO 3952 --- [           main] s.b.c.e.t.TomcatEmbeddedServletContainer : Tomcat started on port(s): 8080 (http)
2015-12-11 10:46:19.189  INFO 3952 --- [           main] example.LogService                       : Started LogService in 4.657 seconds (JVM running for 5.248)
2015-12-11 10:46:40.769  INFO 3952 --- [nio-8080-exec-1] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring FrameworkServlet 'dispatcherServlet'
2015-12-11 10:46:40.769  INFO 3952 --- [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : FrameworkServlet 'dispatcherServlet': initialization started
2015-12-11 10:46:40.885  INFO 3952 --- [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : FrameworkServlet 'dispatcherServlet': initialization completed in 116 ms
message:segmentation fault, stacktrace: out.of.memory.error
</pre>
