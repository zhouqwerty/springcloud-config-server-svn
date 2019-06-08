package com.qwerty.springcloudconfigserversvn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
/*
*  /actuator/refresh:刷新自己当前这个节点
* /actuator/bus-refresh:刷新所有节点
* /actuator/bus-refresh/appName:port:刷新某个节点 如果port位置是** 刷新指定appName服务的所有节点
* */
@SpringBootApplication
@EnableConfigServer
public class SpringcloudConfigServerSvnApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudConfigServerSvnApplication.class, args);
	}

}
