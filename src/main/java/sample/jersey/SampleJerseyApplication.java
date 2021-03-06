/*
 * Copyright 2012-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package sample.jersey;

import org.glassfish.jersey.servlet.ServletContainer;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class SampleJerseyApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SampleJerseyApplication.class);
	}

//	@Bean
//	public ServletContainer dispatcherServlet() {
//		return new ServletContainer();
//	}
//
//	@Bean
//	public ServletRegistrationBean dispatcherServletRegistration() {
//		ServletRegistrationBean registration = new ServletRegistrationBean(dispatcherServlet());
//		Map<String,String> params = new HashMap<String,String>();
//		params.put("jersey.config.server.provider.classnames","org.glassfish.jersey.media.multipart.MultiPartFeature");
//		registration.setInitParameters(params);
//		return registration;
//	}

	public static void main(String[] args) {
		new SampleJerseyApplication()
				.configure(new SpringApplicationBuilder(SampleJerseyApplication.class))
				.run(args);
	}

}
