package org.ypq.netty;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

import java.util.Date;

public class EchoServerHandler extends ChannelInboundHandlerAdapter {

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        System.out.println("server 开始读取数据。。。");

        ByteBuf buf = (ByteBuf)msg;

        byte[] req = new byte[buf.readableBytes()];

        buf.readBytes(req);

        String body = new String(req, "UTF-8");

        System.out.println("接收客户端数据:" + body);
        //向客户端发送数据
        System.out.println("server向client发送数据。。。");
        String currentTime = new Date(System.currentTimeMillis()).toString();
        System.out.println("服务端当前的时间:"+currentTime);
        ByteBuf resp = Unpooled.copiedBuffer(currentTime.getBytes());
        ctx.writeAndFlush(resp).addListener(new ChannelFutureListener() {
            @Override
            public void operationComplete(ChannelFuture future) throws Exception {
                System.out.println("服务端writeAndFlush完成");
            }
        });
    }

    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
        System.out.println("server 调用channelReadComplete");
//        ctx.flush();
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        cause.printStackTrace();
        ctx.close();
    }
}
