package com.nzb.netty.protobuftest.proto;

public final class PlayerModule {
	private PlayerModule() {
	}

	public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
	}

	public interface PBPlayerOrBuilder extends com.google.protobuf.MessageOrBuilder {

		// required int64 playerId = 1;
		boolean hasPlayerId();

		long getPlayerId();

		// required int32 age = 2;
		boolean hasAge();

		int getAge();

		// required string name = 3;
		boolean hasName();

		String getName();

		// repeated int32 skills = 4;
		java.util.List<java.lang.Integer> getSkillsList();

		int getSkillsCount();

		int getSkills(int index);
	}

	public static final class PBPlayer extends com.google.protobuf.GeneratedMessage implements PBPlayerOrBuilder {
		// Use PBPlayer.newBuilder() to construct.
		private PBPlayer(Builder builder) {
			super(builder);
		}

		private PBPlayer(boolean noInit) {
		}

		private static final PBPlayer defaultInstance;

		public static PBPlayer getDefaultInstance() {
			return defaultInstance;
		}

		public PBPlayer getDefaultInstanceForType() {
			return defaultInstance;
		}

		public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
			return com.nzb.netty.protobuftest.proto.PlayerModule.internal_static_PBPlayer_descriptor;
		}

		protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
			return com.nzb.netty.protobuftest.proto.PlayerModule.internal_static_PBPlayer_fieldAccessorTable;
		}

		private int bitField0_;
		// required int64 playerId = 1;
		public static final int PLAYERID_FIELD_NUMBER = 1;
		private long playerId_;

		public boolean hasPlayerId() {
			return ((bitField0_ & 0x00000001) == 0x00000001);
		}

		public long getPlayerId() {
			return playerId_;
		}

		// required int32 age = 2;
		public static final int AGE_FIELD_NUMBER = 2;
		private int age_;

		public boolean hasAge() {
			return ((bitField0_ & 0x00000002) == 0x00000002);
		}

		public int getAge() {
			return age_;
		}

		// required string name = 3;
		public static final int NAME_FIELD_NUMBER = 3;
		private java.lang.Object name_;

		public boolean hasName() {
			return ((bitField0_ & 0x00000004) == 0x00000004);
		}

		public String getName() {
			java.lang.Object ref = name_;
			if (ref instanceof String) {
				return (String) ref;
			} else {
				com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
				String s = bs.toStringUtf8();
				if (com.google.protobuf.Internal.isValidUtf8(bs)) {
					name_ = s;
				}
				return s;
			}
		}

		private com.google.protobuf.ByteString getNameBytes() {
			java.lang.Object ref = name_;
			if (ref instanceof String) {
				com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((String) ref);
				name_ = b;
				return b;
			} else {
				return (com.google.protobuf.ByteString) ref;
			}
		}

		// repeated int32 skills = 4;
		public static final int SKILLS_FIELD_NUMBER = 4;
		private java.util.List<java.lang.Integer> skills_;

		public java.util.List<java.lang.Integer> getSkillsList() {
			return skills_;
		}

		public int getSkillsCount() {
			return skills_.size();
		}

		public int getSkills(int index) {
			return skills_.get(index);
		}

		private void initFields() {
			playerId_ = 0L;
			age_ = 0;
			name_ = "";
			skills_ = java.util.Collections.emptyList();
			;
		}

		private byte memoizedIsInitialized = -1;

		public final boolean isInitialized() {
			byte isInitialized = memoizedIsInitialized;
			if (isInitialized != -1)
				return isInitialized == 1;

			if (!hasPlayerId()) {
				memoizedIsInitialized = 0;
				return false;
			}
			if (!hasAge()) {
				memoizedIsInitialized = 0;
				return false;
			}
			if (!hasName()) {
				memoizedIsInitialized = 0;
				return false;
			}
			memoizedIsInitialized = 1;
			return true;
		}

		public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
			getSerializedSize();
			if (((bitField0_ & 0x00000001) == 0x00000001)) {
				output.writeInt64(1, playerId_);
			}
			if (((bitField0_ & 0x00000002) == 0x00000002)) {
				output.writeInt32(2, age_);
			}
			if (((bitField0_ & 0x00000004) == 0x00000004)) {
				output.writeBytes(3, getNameBytes());
			}
			for (int i = 0; i < skills_.size(); i++) {
				output.writeInt32(4, skills_.get(i));
			}
			getUnknownFields().writeTo(output);
		}

		private int memoizedSerializedSize = -1;

		public int getSerializedSize() {
			int size = memoizedSerializedSize;
			if (size != -1)
				return size;

			size = 0;
			if (((bitField0_ & 0x00000001) == 0x00000001)) {
				size += com.google.protobuf.CodedOutputStream.computeInt64Size(1, playerId_);
			}
			if (((bitField0_ & 0x00000002) == 0x00000002)) {
				size += com.google.protobuf.CodedOutputStream.computeInt32Size(2, age_);
			}
			if (((bitField0_ & 0x00000004) == 0x00000004)) {
				size += com.google.protobuf.CodedOutputStream.computeBytesSize(3, getNameBytes());
			}
			{
				int dataSize = 0;
				for (int i = 0; i < skills_.size(); i++) {
					dataSize += com.google.protobuf.CodedOutputStream.computeInt32SizeNoTag(skills_.get(i));
				}
				size += dataSize;
				size += 1 * getSkillsList().size();
			}
			size += getUnknownFields().getSerializedSize();
			memoizedSerializedSize = size;
			return size;
		}

		private static final long serialVersionUID = 0L;

		@java.lang.Override
		protected java.lang.Object writeReplace() throws java.io.ObjectStreamException {
			return super.writeReplace();
		}

		public static com.nzb.netty.protobuftest.proto.PlayerModule.PBPlayer parseFrom(
				com.google.protobuf.ByteString data) throws com.google.protobuf.InvalidProtocolBufferException {
			return newBuilder().mergeFrom(data).buildParsed();
		}

		public static com.nzb.netty.protobuftest.proto.PlayerModule.PBPlayer parseFrom(
				com.google.protobuf.ByteString data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return newBuilder().mergeFrom(data, extensionRegistry).buildParsed();
		}

		public static com.nzb.netty.protobuftest.proto.PlayerModule.PBPlayer parseFrom(byte[] data)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return newBuilder().mergeFrom(data).buildParsed();
		}

		public static com.nzb.netty.protobuftest.proto.PlayerModule.PBPlayer parseFrom(byte[] data,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return newBuilder().mergeFrom(data, extensionRegistry).buildParsed();
		}

		public static com.nzb.netty.protobuftest.proto.PlayerModule.PBPlayer parseFrom(java.io.InputStream input)
				throws java.io.IOException {
			return newBuilder().mergeFrom(input).buildParsed();
		}

		public static com.nzb.netty.protobuftest.proto.PlayerModule.PBPlayer parseFrom(java.io.InputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
			return newBuilder().mergeFrom(input, extensionRegistry).buildParsed();
		}

		public static com.nzb.netty.protobuftest.proto.PlayerModule.PBPlayer parseDelimitedFrom(
				java.io.InputStream input) throws java.io.IOException {
			Builder builder = newBuilder();
			if (builder.mergeDelimitedFrom(input)) {
				return builder.buildParsed();
			} else {
				return null;
			}
		}

		public static com.nzb.netty.protobuftest.proto.PlayerModule.PBPlayer parseDelimitedFrom(
				java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws java.io.IOException {
			Builder builder = newBuilder();
			if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
				return builder.buildParsed();
			} else {
				return null;
			}
		}

		public static com.nzb.netty.protobuftest.proto.PlayerModule.PBPlayer parseFrom(
				com.google.protobuf.CodedInputStream input) throws java.io.IOException {
			return newBuilder().mergeFrom(input).buildParsed();
		}

		public static com.nzb.netty.protobuftest.proto.PlayerModule.PBPlayer parseFrom(
				com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws java.io.IOException {
			return newBuilder().mergeFrom(input, extensionRegistry).buildParsed();
		}

		public static Builder newBuilder() {
			return Builder.create();
		}

		public Builder newBuilderForType() {
			return newBuilder();
		}

		public static Builder newBuilder(com.nzb.netty.protobuftest.proto.PlayerModule.PBPlayer prototype) {
			return newBuilder().mergeFrom(prototype);
		}

		public Builder toBuilder() {
			return newBuilder(this);
		}

		@java.lang.Override
		protected Builder newBuilderForType(com.google.protobuf.GeneratedMessage.BuilderParent parent) {
			Builder builder = new Builder(parent);
			return builder;
		}

		public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder>
				implements com.nzb.netty.protobuftest.proto.PlayerModule.PBPlayerOrBuilder {
			public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
				return com.nzb.netty.protobuftest.proto.PlayerModule.internal_static_PBPlayer_descriptor;
			}

			protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
				return com.nzb.netty.protobuftest.proto.PlayerModule.internal_static_PBPlayer_fieldAccessorTable;
			}

			// Construct using
			// com.nzb.netty.protobuftest.proto.PlayerModule.PBPlayer.newBuilder()
			private Builder() {
				maybeForceBuilderInitialization();
			}

			private Builder(BuilderParent parent) {
				super(parent);
				maybeForceBuilderInitialization();
			}

			private void maybeForceBuilderInitialization() {
				if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
				}
			}

			private static Builder create() {
				return new Builder();
			}

			public Builder clear() {
				super.clear();
				playerId_ = 0L;
				bitField0_ = (bitField0_ & ~0x00000001);
				age_ = 0;
				bitField0_ = (bitField0_ & ~0x00000002);
				name_ = "";
				bitField0_ = (bitField0_ & ~0x00000004);
				skills_ = java.util.Collections.emptyList();
				;
				bitField0_ = (bitField0_ & ~0x00000008);
				return this;
			}

			public Builder clone() {
				return create().mergeFrom(buildPartial());
			}

			public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
				return com.nzb.netty.protobuftest.proto.PlayerModule.PBPlayer.getDescriptor();
			}

			public com.nzb.netty.protobuftest.proto.PlayerModule.PBPlayer getDefaultInstanceForType() {
				return com.nzb.netty.protobuftest.proto.PlayerModule.PBPlayer.getDefaultInstance();
			}

			public com.nzb.netty.protobuftest.proto.PlayerModule.PBPlayer build() {
				com.nzb.netty.protobuftest.proto.PlayerModule.PBPlayer result = buildPartial();
				if (!result.isInitialized()) {
					throw newUninitializedMessageException(result);
				}
				return result;
			}

			private com.nzb.netty.protobuftest.proto.PlayerModule.PBPlayer buildParsed()
					throws com.google.protobuf.InvalidProtocolBufferException {
				com.nzb.netty.protobuftest.proto.PlayerModule.PBPlayer result = buildPartial();
				if (!result.isInitialized()) {
					throw newUninitializedMessageException(result).asInvalidProtocolBufferException();
				}
				return result;
			}

			public com.nzb.netty.protobuftest.proto.PlayerModule.PBPlayer buildPartial() {
				com.nzb.netty.protobuftest.proto.PlayerModule.PBPlayer result = new com.nzb.netty.protobuftest.proto.PlayerModule.PBPlayer(
						this);
				int from_bitField0_ = bitField0_;
				int to_bitField0_ = 0;
				if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
					to_bitField0_ |= 0x00000001;
				}
				result.playerId_ = playerId_;
				if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
					to_bitField0_ |= 0x00000002;
				}
				result.age_ = age_;
				if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
					to_bitField0_ |= 0x00000004;
				}
				result.name_ = name_;
				if (((bitField0_ & 0x00000008) == 0x00000008)) {
					skills_ = java.util.Collections.unmodifiableList(skills_);
					bitField0_ = (bitField0_ & ~0x00000008);
				}
				result.skills_ = skills_;
				result.bitField0_ = to_bitField0_;
				onBuilt();
				return result;
			}

			public Builder mergeFrom(com.google.protobuf.Message other) {
				if (other instanceof com.nzb.netty.protobuftest.proto.PlayerModule.PBPlayer) {
					return mergeFrom((com.nzb.netty.protobuftest.proto.PlayerModule.PBPlayer) other);
				} else {
					super.mergeFrom(other);
					return this;
				}
			}

			public Builder mergeFrom(com.nzb.netty.protobuftest.proto.PlayerModule.PBPlayer other) {
				if (other == com.nzb.netty.protobuftest.proto.PlayerModule.PBPlayer.getDefaultInstance())
					return this;
				if (other.hasPlayerId()) {
					setPlayerId(other.getPlayerId());
				}
				if (other.hasAge()) {
					setAge(other.getAge());
				}
				if (other.hasName()) {
					setName(other.getName());
				}
				if (!other.skills_.isEmpty()) {
					if (skills_.isEmpty()) {
						skills_ = other.skills_;
						bitField0_ = (bitField0_ & ~0x00000008);
					} else {
						ensureSkillsIsMutable();
						skills_.addAll(other.skills_);
					}
					onChanged();
				}
				this.mergeUnknownFields(other.getUnknownFields());
				return this;
			}

			public final boolean isInitialized() {
				if (!hasPlayerId()) {

					return false;
				}
				if (!hasAge()) {

					return false;
				}
				if (!hasName()) {

					return false;
				}
				return true;
			}

			public Builder mergeFrom(com.google.protobuf.CodedInputStream input,
					com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
				com.google.protobuf.UnknownFieldSet.Builder unknownFields = com.google.protobuf.UnknownFieldSet
						.newBuilder(this.getUnknownFields());
				while (true) {
					int tag = input.readTag();
					switch (tag) {
					case 0:
						this.setUnknownFields(unknownFields.build());
						onChanged();
						return this;
					default: {
						if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
							this.setUnknownFields(unknownFields.build());
							onChanged();
							return this;
						}
						break;
					}
					case 8: {
						bitField0_ |= 0x00000001;
						playerId_ = input.readInt64();
						break;
					}
					case 16: {
						bitField0_ |= 0x00000002;
						age_ = input.readInt32();
						break;
					}
					case 26: {
						bitField0_ |= 0x00000004;
						name_ = input.readBytes();
						break;
					}
					case 32: {
						ensureSkillsIsMutable();
						skills_.add(input.readInt32());
						break;
					}
					case 34: {
						int length = input.readRawVarint32();
						int limit = input.pushLimit(length);
						while (input.getBytesUntilLimit() > 0) {
							addSkills(input.readInt32());
						}
						input.popLimit(limit);
						break;
					}
					}
				}
			}

			private int bitField0_;

			// required int64 playerId = 1;
			private long playerId_;

			public boolean hasPlayerId() {
				return ((bitField0_ & 0x00000001) == 0x00000001);
			}

			public long getPlayerId() {
				return playerId_;
			}

			public Builder setPlayerId(long value) {
				bitField0_ |= 0x00000001;
				playerId_ = value;
				onChanged();
				return this;
			}

			public Builder clearPlayerId() {
				bitField0_ = (bitField0_ & ~0x00000001);
				playerId_ = 0L;
				onChanged();
				return this;
			}

			// required int32 age = 2;
			private int age_;

			public boolean hasAge() {
				return ((bitField0_ & 0x00000002) == 0x00000002);
			}

			public int getAge() {
				return age_;
			}

			public Builder setAge(int value) {
				bitField0_ |= 0x00000002;
				age_ = value;
				onChanged();
				return this;
			}

			public Builder clearAge() {
				bitField0_ = (bitField0_ & ~0x00000002);
				age_ = 0;
				onChanged();
				return this;
			}

			// required string name = 3;
			private java.lang.Object name_ = "";

			public boolean hasName() {
				return ((bitField0_ & 0x00000004) == 0x00000004);
			}

			public String getName() {
				java.lang.Object ref = name_;
				if (!(ref instanceof String)) {
					String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
					name_ = s;
					return s;
				} else {
					return (String) ref;
				}
			}

			public Builder setName(String value) {
				if (value == null) {
					throw new NullPointerException();
				}
				bitField0_ |= 0x00000004;
				name_ = value;
				onChanged();
				return this;
			}

			public Builder clearName() {
				bitField0_ = (bitField0_ & ~0x00000004);
				name_ = getDefaultInstance().getName();
				onChanged();
				return this;
			}

			void setName(com.google.protobuf.ByteString value) {
				bitField0_ |= 0x00000004;
				name_ = value;
				onChanged();
			}

			// repeated int32 skills = 4;
			private java.util.List<java.lang.Integer> skills_ = java.util.Collections.emptyList();;

			private void ensureSkillsIsMutable() {
				if (!((bitField0_ & 0x00000008) == 0x00000008)) {
					skills_ = new java.util.ArrayList<java.lang.Integer>(skills_);
					bitField0_ |= 0x00000008;
				}
			}

			public java.util.List<java.lang.Integer> getSkillsList() {
				return java.util.Collections.unmodifiableList(skills_);
			}

			public int getSkillsCount() {
				return skills_.size();
			}

			public int getSkills(int index) {
				return skills_.get(index);
			}

			public Builder setSkills(int index, int value) {
				ensureSkillsIsMutable();
				skills_.set(index, value);
				onChanged();
				return this;
			}

			public Builder addSkills(int value) {
				ensureSkillsIsMutable();
				skills_.add(value);
				onChanged();
				return this;
			}

			public Builder addAllSkills(java.lang.Iterable<? extends java.lang.Integer> values) {
				ensureSkillsIsMutable();
				super.addAll(values, skills_);
				onChanged();
				return this;
			}

			public Builder clearSkills() {
				skills_ = java.util.Collections.emptyList();
				;
				bitField0_ = (bitField0_ & ~0x00000008);
				onChanged();
				return this;
			}

			// @@protoc_insertion_point(builder_scope:PBPlayer)
		}

		static {
			defaultInstance = new PBPlayer(true);
			defaultInstance.initFields();
		}

		// @@protoc_insertion_point(class_scope:PBPlayer)
	}

	public interface PBResourceOrBuilder extends com.google.protobuf.MessageOrBuilder {

		// required int64 gold = 1;
		boolean hasGold();

		long getGold();

		// required int32 energy = 2;
		boolean hasEnergy();

		int getEnergy();
	}

	public static final class PBResource extends com.google.protobuf.GeneratedMessage implements PBResourceOrBuilder {
		// Use PBResource.newBuilder() to construct.
		private PBResource(Builder builder) {
			super(builder);
		}

		private PBResource(boolean noInit) {
		}

		private static final PBResource defaultInstance;

		public static PBResource getDefaultInstance() {
			return defaultInstance;
		}

		public PBResource getDefaultInstanceForType() {
			return defaultInstance;
		}

		public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
			return com.nzb.netty.protobuftest.proto.PlayerModule.internal_static_PBResource_descriptor;
		}

		protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
			return com.nzb.netty.protobuftest.proto.PlayerModule.internal_static_PBResource_fieldAccessorTable;
		}

		private int bitField0_;
		// required int64 gold = 1;
		public static final int GOLD_FIELD_NUMBER = 1;
		private long gold_;

		public boolean hasGold() {
			return ((bitField0_ & 0x00000001) == 0x00000001);
		}

		public long getGold() {
			return gold_;
		}

		// required int32 energy = 2;
		public static final int ENERGY_FIELD_NUMBER = 2;
		private int energy_;

		public boolean hasEnergy() {
			return ((bitField0_ & 0x00000002) == 0x00000002);
		}

		public int getEnergy() {
			return energy_;
		}

		private void initFields() {
			gold_ = 0L;
			energy_ = 0;
		}

		private byte memoizedIsInitialized = -1;

		public final boolean isInitialized() {
			byte isInitialized = memoizedIsInitialized;
			if (isInitialized != -1)
				return isInitialized == 1;

			if (!hasGold()) {
				memoizedIsInitialized = 0;
				return false;
			}
			if (!hasEnergy()) {
				memoizedIsInitialized = 0;
				return false;
			}
			memoizedIsInitialized = 1;
			return true;
		}

		public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
			getSerializedSize();
			if (((bitField0_ & 0x00000001) == 0x00000001)) {
				output.writeInt64(1, gold_);
			}
			if (((bitField0_ & 0x00000002) == 0x00000002)) {
				output.writeInt32(2, energy_);
			}
			getUnknownFields().writeTo(output);
		}

		private int memoizedSerializedSize = -1;

		public int getSerializedSize() {
			int size = memoizedSerializedSize;
			if (size != -1)
				return size;

			size = 0;
			if (((bitField0_ & 0x00000001) == 0x00000001)) {
				size += com.google.protobuf.CodedOutputStream.computeInt64Size(1, gold_);
			}
			if (((bitField0_ & 0x00000002) == 0x00000002)) {
				size += com.google.protobuf.CodedOutputStream.computeInt32Size(2, energy_);
			}
			size += getUnknownFields().getSerializedSize();
			memoizedSerializedSize = size;
			return size;
		}

		private static final long serialVersionUID = 0L;

		@java.lang.Override
		protected java.lang.Object writeReplace() throws java.io.ObjectStreamException {
			return super.writeReplace();
		}

		public static com.nzb.netty.protobuftest.proto.PlayerModule.PBResource parseFrom(
				com.google.protobuf.ByteString data) throws com.google.protobuf.InvalidProtocolBufferException {
			return newBuilder().mergeFrom(data).buildParsed();
		}

		public static com.nzb.netty.protobuftest.proto.PlayerModule.PBResource parseFrom(
				com.google.protobuf.ByteString data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return newBuilder().mergeFrom(data, extensionRegistry).buildParsed();
		}

		public static com.nzb.netty.protobuftest.proto.PlayerModule.PBResource parseFrom(byte[] data)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return newBuilder().mergeFrom(data).buildParsed();
		}

		public static com.nzb.netty.protobuftest.proto.PlayerModule.PBResource parseFrom(byte[] data,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return newBuilder().mergeFrom(data, extensionRegistry).buildParsed();
		}

		public static com.nzb.netty.protobuftest.proto.PlayerModule.PBResource parseFrom(java.io.InputStream input)
				throws java.io.IOException {
			return newBuilder().mergeFrom(input).buildParsed();
		}

		public static com.nzb.netty.protobuftest.proto.PlayerModule.PBResource parseFrom(java.io.InputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
			return newBuilder().mergeFrom(input, extensionRegistry).buildParsed();
		}

		public static com.nzb.netty.protobuftest.proto.PlayerModule.PBResource parseDelimitedFrom(
				java.io.InputStream input) throws java.io.IOException {
			Builder builder = newBuilder();
			if (builder.mergeDelimitedFrom(input)) {
				return builder.buildParsed();
			} else {
				return null;
			}
		}

		public static com.nzb.netty.protobuftest.proto.PlayerModule.PBResource parseDelimitedFrom(
				java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws java.io.IOException {
			Builder builder = newBuilder();
			if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
				return builder.buildParsed();
			} else {
				return null;
			}
		}

		public static com.nzb.netty.protobuftest.proto.PlayerModule.PBResource parseFrom(
				com.google.protobuf.CodedInputStream input) throws java.io.IOException {
			return newBuilder().mergeFrom(input).buildParsed();
		}

		public static com.nzb.netty.protobuftest.proto.PlayerModule.PBResource parseFrom(
				com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws java.io.IOException {
			return newBuilder().mergeFrom(input, extensionRegistry).buildParsed();
		}

		public static Builder newBuilder() {
			return Builder.create();
		}

		public Builder newBuilderForType() {
			return newBuilder();
		}

		public static Builder newBuilder(com.nzb.netty.protobuftest.proto.PlayerModule.PBResource prototype) {
			return newBuilder().mergeFrom(prototype);
		}

		public Builder toBuilder() {
			return newBuilder(this);
		}

		@java.lang.Override
		protected Builder newBuilderForType(com.google.protobuf.GeneratedMessage.BuilderParent parent) {
			Builder builder = new Builder(parent);
			return builder;
		}

		public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder>
				implements com.nzb.netty.protobuftest.proto.PlayerModule.PBResourceOrBuilder {
			public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
				return com.nzb.netty.protobuftest.proto.PlayerModule.internal_static_PBResource_descriptor;
			}

			protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
				return com.nzb.netty.protobuftest.proto.PlayerModule.internal_static_PBResource_fieldAccessorTable;
			}

			// Construct using
			// com.nzb.netty.protobuftest.proto.PlayerModule.PBResource.newBuilder()
			private Builder() {
				maybeForceBuilderInitialization();
			}

			private Builder(BuilderParent parent) {
				super(parent);
				maybeForceBuilderInitialization();
			}

			private void maybeForceBuilderInitialization() {
				if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
				}
			}

			private static Builder create() {
				return new Builder();
			}

			public Builder clear() {
				super.clear();
				gold_ = 0L;
				bitField0_ = (bitField0_ & ~0x00000001);
				energy_ = 0;
				bitField0_ = (bitField0_ & ~0x00000002);
				return this;
			}

			public Builder clone() {
				return create().mergeFrom(buildPartial());
			}

			public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
				return com.nzb.netty.protobuftest.proto.PlayerModule.PBResource.getDescriptor();
			}

			public com.nzb.netty.protobuftest.proto.PlayerModule.PBResource getDefaultInstanceForType() {
				return com.nzb.netty.protobuftest.proto.PlayerModule.PBResource.getDefaultInstance();
			}

			public com.nzb.netty.protobuftest.proto.PlayerModule.PBResource build() {
				com.nzb.netty.protobuftest.proto.PlayerModule.PBResource result = buildPartial();
				if (!result.isInitialized()) {
					throw newUninitializedMessageException(result);
				}
				return result;
			}

			private com.nzb.netty.protobuftest.proto.PlayerModule.PBResource buildParsed()
					throws com.google.protobuf.InvalidProtocolBufferException {
				com.nzb.netty.protobuftest.proto.PlayerModule.PBResource result = buildPartial();
				if (!result.isInitialized()) {
					throw newUninitializedMessageException(result).asInvalidProtocolBufferException();
				}
				return result;
			}

			public com.nzb.netty.protobuftest.proto.PlayerModule.PBResource buildPartial() {
				com.nzb.netty.protobuftest.proto.PlayerModule.PBResource result = new com.nzb.netty.protobuftest.proto.PlayerModule.PBResource(
						this);
				int from_bitField0_ = bitField0_;
				int to_bitField0_ = 0;
				if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
					to_bitField0_ |= 0x00000001;
				}
				result.gold_ = gold_;
				if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
					to_bitField0_ |= 0x00000002;
				}
				result.energy_ = energy_;
				result.bitField0_ = to_bitField0_;
				onBuilt();
				return result;
			}

			public Builder mergeFrom(com.google.protobuf.Message other) {
				if (other instanceof com.nzb.netty.protobuftest.proto.PlayerModule.PBResource) {
					return mergeFrom((com.nzb.netty.protobuftest.proto.PlayerModule.PBResource) other);
				} else {
					super.mergeFrom(other);
					return this;
				}
			}

			public Builder mergeFrom(com.nzb.netty.protobuftest.proto.PlayerModule.PBResource other) {
				if (other == com.nzb.netty.protobuftest.proto.PlayerModule.PBResource.getDefaultInstance())
					return this;
				if (other.hasGold()) {
					setGold(other.getGold());
				}
				if (other.hasEnergy()) {
					setEnergy(other.getEnergy());
				}
				this.mergeUnknownFields(other.getUnknownFields());
				return this;
			}

			public final boolean isInitialized() {
				if (!hasGold()) {

					return false;
				}
				if (!hasEnergy()) {

					return false;
				}
				return true;
			}

			public Builder mergeFrom(com.google.protobuf.CodedInputStream input,
					com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
				com.google.protobuf.UnknownFieldSet.Builder unknownFields = com.google.protobuf.UnknownFieldSet
						.newBuilder(this.getUnknownFields());
				while (true) {
					int tag = input.readTag();
					switch (tag) {
					case 0:
						this.setUnknownFields(unknownFields.build());
						onChanged();
						return this;
					default: {
						if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
							this.setUnknownFields(unknownFields.build());
							onChanged();
							return this;
						}
						break;
					}
					case 8: {
						bitField0_ |= 0x00000001;
						gold_ = input.readInt64();
						break;
					}
					case 16: {
						bitField0_ |= 0x00000002;
						energy_ = input.readInt32();
						break;
					}
					}
				}
			}

			private int bitField0_;

			// required int64 gold = 1;
			private long gold_;

			public boolean hasGold() {
				return ((bitField0_ & 0x00000001) == 0x00000001);
			}

			public long getGold() {
				return gold_;
			}

			public Builder setGold(long value) {
				bitField0_ |= 0x00000001;
				gold_ = value;
				onChanged();
				return this;
			}

			public Builder clearGold() {
				bitField0_ = (bitField0_ & ~0x00000001);
				gold_ = 0L;
				onChanged();
				return this;
			}

			// required int32 energy = 2;
			private int energy_;

			public boolean hasEnergy() {
				return ((bitField0_ & 0x00000002) == 0x00000002);
			}

			public int getEnergy() {
				return energy_;
			}

			public Builder setEnergy(int value) {
				bitField0_ |= 0x00000002;
				energy_ = value;
				onChanged();
				return this;
			}

			public Builder clearEnergy() {
				bitField0_ = (bitField0_ & ~0x00000002);
				energy_ = 0;
				onChanged();
				return this;
			}

			// @@protoc_insertion_point(builder_scope:PBResource)
		}

		static {
			defaultInstance = new PBResource(true);
			defaultInstance.initFields();
		}

		// @@protoc_insertion_point(class_scope:PBResource)
	}

	private static com.google.protobuf.Descriptors.Descriptor internal_static_PBPlayer_descriptor;
	private static com.google.protobuf.GeneratedMessage.FieldAccessorTable internal_static_PBPlayer_fieldAccessorTable;
	private static com.google.protobuf.Descriptors.Descriptor internal_static_PBResource_descriptor;
	private static com.google.protobuf.GeneratedMessage.FieldAccessorTable internal_static_PBResource_fieldAccessorTable;

	public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
		return descriptor;
	}

	private static com.google.protobuf.Descriptors.FileDescriptor descriptor;
	static {
		java.lang.String[] descriptorData = { "\n\022proto/player.proto\"G\n\010PBPlayer\022\020\n\010play"
				+ "erId\030\001 \002(\003\022\013\n\003age\030\002 \002(\005\022\014\n\004name\030\003 \002(\t\022\016\n"
				+ "\006skills\030\004 \003(\005\"*\n\nPBResource\022\014\n\004gold\030\001 \002("
				+ "\003\022\016\n\006energy\030\002 \002(\005B\031\n\tcom.nzb.netty.protobuftest.protoB\014PlayerMo"
				+ "dule" };
		com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner = new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
			public com.google.protobuf.ExtensionRegistry assignDescriptors(
					com.google.protobuf.Descriptors.FileDescriptor root) {
				descriptor = root;
				internal_static_PBPlayer_descriptor = getDescriptor().getMessageTypes().get(0);
				internal_static_PBPlayer_fieldAccessorTable = new com.google.protobuf.GeneratedMessage.FieldAccessorTable(
						internal_static_PBPlayer_descriptor,
						new java.lang.String[] { "PlayerId", "Age", "Name", "Skills", },
						com.nzb.netty.protobuftest.proto.PlayerModule.PBPlayer.class,
						com.nzb.netty.protobuftest.proto.PlayerModule.PBPlayer.Builder.class);
				internal_static_PBResource_descriptor = getDescriptor().getMessageTypes().get(1);
				internal_static_PBResource_fieldAccessorTable = new com.google.protobuf.GeneratedMessage.FieldAccessorTable(
						internal_static_PBResource_descriptor, new java.lang.String[] { "Gold", "Energy", },
						com.nzb.netty.protobuftest.proto.PlayerModule.PBResource.class,
						com.nzb.netty.protobuftest.proto.PlayerModule.PBResource.Builder.class);
				return null;
			}
		};
		com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData,
				new com.google.protobuf.Descriptors.FileDescriptor[] {}, assigner);
	}

	// @@protoc_insertion_point(outer_class_scope)
}
