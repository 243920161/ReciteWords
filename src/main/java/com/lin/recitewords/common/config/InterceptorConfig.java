package com.lin.recitewords.common.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Configuration
public class InterceptorConfig implements WebMvcConfigurer {
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new HandlerInterceptor() {
			@Override
			public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
				HttpSession session = request.getSession();
				String context = request.getServletContext().getContextPath();
				if (session.getAttribute("user") == null) {
					response.sendRedirect(context + "/login");
					return false;
				}
				return true;
			}
		})
		.addPathPatterns("/**")
		.excludePathPatterns("/login")
		.excludePathPatterns("/register")
		.excludePathPatterns("favicon.ico")
		.excludePathPatterns("/css/**")
		.excludePathPatterns("/img/**")
		.excludePathPatterns("/js/**")
		.excludePathPatterns("/lib/**");
	}
}
