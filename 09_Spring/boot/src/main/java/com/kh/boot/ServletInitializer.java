package com.kh.boot;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/*
* ServletInitializer : 스프링부트 어플리케이션을 베포할 때 설정을 지정하는 역할
* war파일로 패키징하여 외부 플랫폼에 배포할 경우 필요함
* */
public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(BootApplication.class);
	}

}
