package com.qwerty.springcloudconfigserversvn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringcloudConfigServerSvnApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudConfigServerSvnApplication.class, args);
	}

}
