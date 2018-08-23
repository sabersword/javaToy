package org.ypq.netty;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

public class EchoClientHandler extends SimpleChannelInboundHandler<ByteBuf> {

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        System.out.println("客户端连接服务器，开始发送数据……");
        byte[] req = "请求当前服务端时间".getBytes();//消息

        ByteBuf buffer = Unpooled.buffer(req.length);
        buffer.writeBytes(req);

        ctx.writeAndFlush(buffer);
    }

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, ByteBuf msg) throws Exception {
        // TODO Auto-generated method stub
        System.out.println("client 读取server数据..");
        // 服务端返回消息后
        ByteBuf buf = (ByteBuf) msg;
        byte[] req = new byte[buf.readableBytes()];
        buf.readBytes(req);
        String body = new String(req, "UTF-8");
        System.out.println("服务端当前时间 :" + body);
    }

}
