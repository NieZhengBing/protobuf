package com.nzb.netty.protobuftest.java;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class JAVA2Bytes {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		byte[] bytes = toBytes();
		toPlayer(bytes);
	}

	private static byte[] toBytes() throws IOException {
		Player player = new Player(101L, 20, "peter");
		player.getSkills().add(10101);
		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);

		objectOutputStream.writeObject(player);

		byte[] byteArray = byteArrayOutputStream.toByteArray();
		System.out.println(Arrays.toString(byteArray));
		return byteArray;
	}

	private static void toPlayer(byte[] bs) throws IOException, ClassNotFoundException {
		ObjectInputStream inputStream = new ObjectInputStream(new ByteArrayInputStream(bs));
		Player player = (Player) inputStream.readObject();
		System.out.println("playerId: " + player.getPalyerId());
		System.out.println("age: " + player.getAge());
		System.out.println("name: " + player.getName());
		System.out.println("skills: " + player.getSkills());
	}

}
