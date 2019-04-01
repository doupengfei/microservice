package com.dpf.filter;

import javax.servlet.http.HttpServletRequest;

 
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

public class AccessFilter extends ZuulFilter {
	@Override
	public boolean shouldFilter() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public Object run() throws ZuulException {
		RequestContext ctx = RequestContext.getCurrentContext();
		HttpServletRequest request = ctx.getRequest();
		String parameter = request.getParameter("accessToken");
		System.out.println(request.getRequestURL().toString() + " 请求访问");
		if (parameter == null) {
			System.out.println("accessToken为空！");
			ctx.setSendZuulResponse(false);
			ctx.setResponseStatusCode(401);
			ctx.setResponseBody("{\"result\":\"accessToken is empty!\"}");
			return null;
		}
		// token判断逻辑
		System.out.println(request.getRequestURL().toString() + " 请求成功");
		return null;
	}

	@Override
	public String filterType() {
		// TODO Auto-generated method stub
		return "pre";
	}

	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 0;
	}

}
