## spring boot 学习记录

这是对spring的一次化简，配置上进行各种化简，主推java 注解的方式进行配置和注册

由于项目使用spring cloud微服务的方式，所以

有一个服务注册中心用于管理各种注册服务的，在配置中的bootstrap.yml 或者application.properties中进行设置.

- bootstrap.yml文件具有层次结构
```xml
server:
  port: 8090

eureka:
  instance:
    prefer-ip-address: true
  client:
    serviceUrl:
      defaultZone: http://10.252.20.103:1111/eureka/
//相当于 application中的 eureka.client.serviceUrl.defaultZone=http:
```
- 成为注册中心:  
  对于@EnableEurekaServer
  ```xml
  加入一个配置 使端口1111成为注册中心
  server.port=1111
  eureka.client.register-with-eureka=false
  eureka.client.fetch-registry=false
  eureka.client.serviceUrl.defaultZone=http://localhost:${server.port}/eureka/
  ```
- 服务方:主类中成为@EnableDiscoveryClient 然后在进行一些配置,设置自己的服务名spring.appliction.name=compute-server  
server.port=2333 eureka.client.serviceUrl.defaultZone=url

- 服务消费者:调用服务提供方的  
  @EnableDiscoveryClient注解来添加发现服务能力,创建RestTemlate实例,并通过LoadBalanced注解来开启均衡负载能力. 调用restTemplate.getForEntity("http://COMPUTE-SERVICE/add?a=10&b=20",String.class).getBody();
- feign 是一个声明式的web service客户端,它使得编写web service客户端变得更加简单,我们只需要使用feign来创建一个接口并用注解来配置它既可完成,它具备可插拔的注解支持.也是用于服务消费者的
  - @EnableFeignCLients 注解开启Feign功能.定义sompute-service服务的接口,
    ``` java
    @FeignClient("computer-service")
    public interface ComputeClient{
	@RequestMapping(method = RequestMethod.GET,value="/add")
	Integer add(@RequestParam(value="a".......);
    }
	//使用@FeignClient("compute-service")注解来绑定该接口对应compute-service服务
    ```
  - 使用就直接调用既可,ComputeClient computeClient; computeClient.add(10,20);

## 实践使用
- Restful是一种设计风格.将网络上的任何事认作为资源,通过url进行获取.rest指一组架构约束条件和原则,满足约束条件和原则的应用是Restful
  - 架构约束:
    > 客户端与服务器架构  
    > 资源:表现层状态转化,表现层指的是资源的表现层. 资源是网络上的一个实体.url指向它,每种资源对应一个特定的URL.要获取这个资源,访问URL即可   
    > 表现层:资源是一种信息实体,可以有多种外在表现形式.  
    > 状态转化:http协议是无状态的,状态必须保存在服务器端,而客户端通过get post head put delete进行状态操作

## 导入其他xml配置bean
@ImportResource({"classpath:dubbo.xml", "classpath:security.xml"})







## Spring boot 
@SpringBootAppliction 把@Configcation(配置) 和@ComponentScan(扫描包)和EnableAutoConfiguration 自动配置

## 自定义配置
spring的security 进行安全配置;每个都是用Configration进行定义式配置;
在application.yml 或者application.properties中进行配置
  
- __配置参数__:在类中使用@ConfigurationProperties("加前缀: spring.http")
在这个类中的每个变量都会在application.yml 类似于前缀加变量名=变量值的形式:
- __配置Bean__:使用类注解:使用条件完成注解的方式,当ConditionalOnclass 判断类是否在.



## 开启缓存
@Configuration
@EnableCaching
public class AppConfig{}
使用时: @Cacheable 有数据就返回缓存数据,没有就添加进数据
@CachePut 无论如何


## spring 数据模板
- thymleaf 渲染html的
- json 渲染 一般都是对象直接渲染出来, 使用@responseBody  在RequestMapping中加=produces={"application/json"} 即可渲染出json数据
- json 可以用json]view渲染 先配置成bean 然后通过名称使用,数据加载model 中 即可返回写 名称  
```java
@Bean
    public BeanNameViewResolver beanNameViewResolver(){
        return new BeanNameViewResolver();
    }

    @Bean
    public MappingJackson2JsonView jsonView(){
        MappingJackson2JsonView jsonView= new MappingJackson2JsonView();
        return jsonView;
    }

@RequestMapping(value = "/jj",produces = {MediaType.APPLICATION_JSON_VALUE})
    public String getJson(Model model){
        model.addAttribute("sign","wori");
        model.addAttribute("hao","dfsadf");
        return "jsonView";
    }
```

- 这是
- 


## mysql及spring-data-jpa学习  
> 数据库的学习和使用
## jpa
jpa 可以使用函数名称进行查询,自动的
> T save(T entity);//保存单个实体  
Iterable<T> save(Iterable<? extends T> entities);//保存集合  
T findOne(ID id);//根据id查找实体  
boolean exists(ID id);//根据id判断实体是否存在  
Iterable<T> findAll();//查询所有实体,不用或慎用!  
long count();//查询实体数量  
void delete(ID id);//根据Id删除实体  
void delete(T entity);//删除一个实体  
void delete(Iterable<? extends T> entities);//删除一个实体的集合  
void deleteAll();//删除所有实体,不用或慎用!  
使用query也是可以的

>>使用分页  
> Iterable<T> findAll(Sort sort);//排序  
Page<T> findAll(Pageable pageable);//分页查询（含排序功能）  
可以加Query然后也进行排序和分页

@Query自定义查询
 @Query与 @Modifying 执行更新操作
