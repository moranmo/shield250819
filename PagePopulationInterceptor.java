//package com.jwt.controller;
//
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.method.HandlerMethod;
//import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
//
//import com.jwt.service.CustomerService;
//
//public class PagePopulationInterceptor extends HandlerInterceptorAdapter {
//	
//	@Autowired
//    private CustomerService customerService;
//
//    @Override
//    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
//        if(modelAndView != null) {
//            User user = customerService.findOne(request);
//            modelAndView.addObject("myUserProfile", user);
//        }
//    }
//
//}
