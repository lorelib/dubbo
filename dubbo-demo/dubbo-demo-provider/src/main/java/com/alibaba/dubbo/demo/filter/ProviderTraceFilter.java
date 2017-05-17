package com.alibaba.dubbo.demo.filter;

import com.alibaba.dubbo.rpc.*;

/**
 * @author listening
 * @description ProviderTraceFilter:
 * @create 2017 05 17 13:01.
 */
public class ProviderTraceFilter implements Filter {
    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        String traceId = RpcContext.getContext().getAttachment("traceId");
        System.out.println("service get traceId: " + traceId);

        return invoker.invoke(invocation);
    }
}
