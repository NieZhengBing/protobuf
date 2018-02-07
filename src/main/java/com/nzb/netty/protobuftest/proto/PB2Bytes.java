package com.nzb.netty.protobuftest.proto;

import java.util.Arrays;

import com.google.protobuf.InvalidProtocolBufferException;
import com.nzb.netty.protobuftest.proto.PlayerModule.PBPlayer;
import com.nzb.netty.protobuftest.proto.PlayerModule.PBPlayer.Builder;

public class PB2Bytes {
	public static void main(String[] args) throws InvalidProtocolBufferException {
		byte[] bytes = toBytes();
		toPlayer(bytes);
	}

	private static void toPlayer(byte[] bytes) throws InvalidProtocolBufferException {
		PBPlayer player = PlayerModule.PBPlayer.parseFrom(bytes);

		System.out.println("playerId: " + player.getPlayerId());
		System.out.println("age: " + player.getAge());
		System.out.println("name: " + player.getName());
		System.out.println("skillsCount: " + player.getSkillsCount());
		System.out.println("skills: " + Arrays.toString(player.getSkillsList().toArray()));
	}

	private static byte[] toBytes() {
		Builder builder = PlayerModule.PBPlayer.newBuilder();
		builder.setPlayerId(101).setAge(20).setName("peter").addSkills(1001);

		PBPlayer player = builder.build();
		byte[] byteArray = player.toByteArray();

		System.out.println(Arrays.toString(byteArray));

		return byteArray;
	}

}
