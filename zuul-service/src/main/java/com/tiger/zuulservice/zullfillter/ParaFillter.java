package com.tiger.zuulservice.zullfillter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.http.HttpServletRequest;

public class ParaFillter extends ZuulFilter {
    private Log logger = LogFactory.getLog(ParaFillter.class);
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        logger.info("hahah");
        RequestContext requestContext = RequestContext.getCurrentContext();
        HttpServletRequest request =requestContext.getRequest();
        logger.info("send "+request.getMethod()+"to "+request.getRequestURL().toString());
        Object token = request.getParameter("token");
        if(token==null){
            requestContext.setSendZuulResponse(false);
            requestContext.setResponseBody("error no token");
            requestContext.setResponseStatusCode(401);
            return null;
        }
        return null;
    }
}
