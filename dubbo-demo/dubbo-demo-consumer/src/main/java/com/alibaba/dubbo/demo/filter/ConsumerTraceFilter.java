package com.alibaba.dubbo.demo.filter;

import com.alibaba.dubbo.rpc.*;

import java.util.UUID;

/**
 * @author listening
 * @description ConsumerTraceFilter:
 * @create 2017 05 17 13:01.
 */
public class ConsumerTraceFilter implements Filter {
    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        String traceId = UUID.randomUUID().toString();
        RpcContext.getContext().setAttachment("traceId", traceId);
        System.out.println("consumer post traceId: " + traceId);

        return invoker.invoke(invocation);
    }
}
