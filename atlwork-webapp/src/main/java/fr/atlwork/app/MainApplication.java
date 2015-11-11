// package fr.atlwork.app;
//
// import javax.faces.webapp.FacesServlet;
//
// import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
// import
// org.springframework.boot.autoconfigure.web.DispatcherServletAutoConfiguration;
// import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration;
// import org.springframework.boot.builder.SpringApplicationBuilder;
// import org.springframework.boot.context.embedded.ServletRegistrationBean;
// import org.springframework.boot.context.web.SpringBootServletInitializer;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.ComponentScan;
// import org.springframework.context.annotation.Configuration;
// import
// org.springframework.transaction.annotation.EnableTransactionManagement;
//
// @Configuration
// @ComponentScan
// @EnableAutoConfiguration(exclude = { WebMvcAutoConfiguration.class,
// DispatcherServletAutoConfiguration.class })
// @EnableTransactionManagement
// public class MainApplication extends SpringBootServletInitializer {
//
// @Override
// protected SpringApplicationBuilder configure(SpringApplicationBuilder
// applicationBuilder) {
//
// return applicationBuilder.showBanner(false).sources(new Class[] {
// MainApplication.class, Initializer.class });
// }
//
// @Bean
// public ServletRegistrationBean servletRegistrationBean() {
// FacesServlet servlet = new FacesServlet();
// ServletRegistrationBean servletRegistrationBean = new
// ServletRegistrationBean(servlet, "*.faces");
// return servletRegistrationBean;
// }
//
// }
