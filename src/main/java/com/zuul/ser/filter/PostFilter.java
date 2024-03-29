package com.zuul.ser.filter;

import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;

@Component
public class PostFilter extends ZuulFilter{

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		System.out.println("this is PostFilter :"+this.getClass().getName());
		return null;
	}

	@Override
	public String filterType() {
		
		return FilterConstants.POST_TYPE;
	}

	@Override
	public int filterOrder() {
		return 0;
	}

	
}
