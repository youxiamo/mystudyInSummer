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
