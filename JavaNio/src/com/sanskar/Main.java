package com.sanskar;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Pipe;

public class Main {
    public static void main(String[] args) {

        try {
            Pipe pipe = Pipe.open();

            Runnable writer = new Runnable() {
                @Override
                public void run() {
                    try {
                        Pipe.SinkChannel sinkChannel = pipe.sink();
                        ByteBuffer buffer = ByteBuffer.allocate(56);

                        for(int i=0; i<10; i++) {
                            String currentTime = "The time is " + System.currentTimeMillis();

                            buffer.put(currentTime.getBytes());
                            buffer.flip();

                            while(buffer.hasRemaining()) {
                                sinkChannel.write(buffer);
                            }
                            buffer.flip();
                            Thread.sleep(100);
                        }
                    } catch (IOException | InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            };

            Runnable reader = new Runnable() {
                @Override
                public void run() {
                    try {
                        Pipe.SourceChannel sourceChannel = pipe.source();
                        ByteBuffer buffer = ByteBuffer.allocate(56);

                        for(int i=0; i<10; i++) {
                            int bytesRead = sourceChannel.read(buffer);
                            byte[] timeString = new byte[bytesRead];
                            buffer.flip();
                            buffer.get(timeString);
                            System.out.println("Reader Thread: " + new String(timeString));
                            buffer.flip();
                            Thread.sleep(100);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            };

            new Thread(writer).start();
            new Thread(reader).start();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

//        try (FileOutputStream binFile = new FileOutputStream("data.dat");
//             FileChannel binChannel = binFile.getChannel()) {
//
//            ByteBuffer buffer = ByteBuffer.allocate(100);
//
////            byte[] outputBytes = "Hello World!".getBytes();
////            byte[] outputBytes2 = "Nice to meet you".getBytes();
////            buffer.put(outputBytes).putInt(245).putInt(-98765).put(outputBytes2).putInt(1000);
////            buffer.flip();
//
//            byte[] outputBytes = "Hello World!".getBytes();
//            buffer.put(outputBytes);
//            long int1Pos = outputBytes.length;
//            buffer.putInt(245);
//            long int2Pos = int1Pos + Integer.BYTES;
//            buffer.putInt(-98765);
//            byte[] outputBytes2 = "Nice to meet you".getBytes();
//            buffer.put(outputBytes2);
//            long int3Pos = int2Pos + Integer.BYTES + outputBytes2.length;
//            buffer.putInt(1000);
//            buffer.flip();
//
//            binChannel.write(buffer);
//
//            RandomAccessFile ra = new RandomAccessFile("data.dat","rwd");
//            FileChannel channel= ra.getChannel();
//
//            ByteBuffer intBuffer = ByteBuffer.allocate(Integer.BYTES);
//            channel.position(int3Pos);
//            channel.read(intBuffer);
//            intBuffer.flip();
//            System.out.println("Int3 = " + intBuffer.getInt());
//            intBuffer.flip();
//            channel.position(int2Pos);
//            channel.read(intBuffer);
//            intBuffer.flip();
//            System.out.println("Int2 = " + intBuffer.getInt());
//            intBuffer.flip();
//            channel.position(int1Pos);
//            channel.read(intBuffer);
//            intBuffer.flip();
//            System.out.println("Int1 = " + intBuffer.getInt());
//            intBuffer.flip();
//
//            RandomAccessFile copyFile = new RandomAccessFile("datacopy.dat","rw");
//            FileChannel copyChannel = copyFile.getChannel();
//            channel.position(0);
////            long numTransferred = copyChannel.transferFrom(channel, 0, channel.size());
//            long numTransferred = channel.transferTo(0, channel.size(), copyChannel);
//            System.out.println("Num transferred = " + numTransferred);
//
//
////            ByteBuffer readBuffer = ByteBuffer.allocate(100);
////            channel.read(readBuffer);
////            readBuffer.flip();
////            byte[] inputString = new byte[outputBytes.length];
////            readBuffer.get(inputString);
////            System.out.println("inputString = " + new String(inputString));
////            System.out.println("int1 = " + readBuffer.getInt());
////            System.out.println("int2 = " + readBuffer.getInt());
////            byte[] inputString2 = new byte[outputBytes2.length];
////            readBuffer.get(inputString2);
////            System.out.println("inputString2 = " + new String(inputString2));
////            System.out.println("int3 = " + readBuffer.getInt());
//

//        }
//        catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
