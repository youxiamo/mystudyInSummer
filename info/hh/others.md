## kubernetes
基本概念:  
pod:
 - k8s的最小操作单元,
 - Pod内容器共享资源
 - 生命周期管理:挂起,运行,成功,失败,未知
 - 容器探测: LivenessProbe,ReadinessRrobe
 - 容器配额 : requests, limits
 ![](http://img.blog.csdn.net/20160712174508708)

每个pod上都有一个pause容器,是pod的网络接入点,  
挂起: Pod提交到Master,但一个或多个容器镜像尚未创建,包括调度


## dubbo
CAP定理
- 一致性（Consistency）
- 可用性（Availability）
- 分区容错性(Partition-Tolerance)

dubbo的解决方案使用zookeeper 进行

> 介绍: Dubbo :分布式服务框架 
> - 高性能和透明化的RPC远程服务调用方案
> - SOA服务治理方案

透明化的远程调用, 软负载均衡, 服务自动注册与发现;
#####　服务框架:
- Provider: 暴露服务的服务提供方。
- Consumer: 调用远程服务的服务消费方。
- Registry: 服务注册与发现的注册中心。
- Monitor: 统计服务的调用次调和调用时间的监控中心。
- Container: 服务运行容器

配置文件 schema配置的
```xml
<bean id="xxxService" class="com.alibaba.xxx.XxxServiceImpl"/>
<dubbo:application name="名字" />

<!-- 连接注册中心-->
<dubbo:registry address="url" username="admin" />

<!--服务提供者-->
<dubbo:service interface="com.alibaba.xxx.XxxService" ref="xxxservice" />

<!-- 服务消费方 引用远程服务-->
<dubbo:reference id="xxxService" interface="com.alibaba.xxx.XxxService" />

</bean>
```

## dubbo的高级功能
 
dubbo的节点路由

## nettty 学习
是一个NIO的框架,目的是当前NIO编程,开发起来不是很难,但稳定性不高安全性不强;所以开发了netty 从JBoss脱离出来的.

零拷贝,主要体现在以下三个方面:
- 1)使用堆外内存进行Socket读写，不需要进行字节缓冲区的二次拷贝。如果使用传统的堆内存(HEAP BUFFERS)进行读写，JVM会将堆内存Buffer拷贝一份到直接内存中，然后才写入Socket中。相比于堆外直接内存，消息在发送过程中多了一次缓冲区的内存拷贝。
- 2)Netty提供组合Buffer对象，可以聚合多个ByteBuffer对象，用户可以像操作一个Buffer那样方便的对组合Buffer进行操作，避免了传统通过内存拷贝的方式将几个小Buffer合并成一个大的Buffer。
- 3)Netty的文件传输采用了transferTo方法，它可以直接将文件缓冲区的数据发送到目标Channel，避免了传统通过循环write方式导致的内存拷贝问题。

Netty默认提供了对Google Protobuf的支持，通过拓展Netty的编解码接口，用户可以实现高性能的序列化框架
