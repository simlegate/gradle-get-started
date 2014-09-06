package com.quanyibao.cnepay;

import io.netty.buffer.ByteBuf;

import io.netty.channel.ChannelHandlerAdapter;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.http.HttpRequest;
import io.netty.util.ReferenceCountUtil;
import io.netty.channel.SimpleChannelInboundHandler;


public class EchoServerHandler extends SimpleChannelInboundHandler<HttpRequest> {

    @Override
    public void messageReceived(ChannelHandlerContext ctx, HttpRequest req) {
        System.out.println(req);
        ctx.write("Hello World");
        ctx.flush();
    }

    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
        ctx.flush();
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
        cause.printStackTrace();
        ctx.close();
    }
}


