// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Messaging.proto

package com.miniprojet.messaging;

public final class MessagingProto {
  private MessagingProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MessageRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MessageRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UserRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UserRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MessageResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MessageResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Message_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Message_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MessagesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MessagesResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017Messaging.proto\"N\n\016MessageRequest\022\021\n\ts" +
      "ender_id\030\001 \001(\t\022\023\n\013receiver_id\030\002 \001(\t\022\024\n\014m" +
      "essage_text\030\003 \001(\t\"\036\n\013UserRequest\022\017\n\007user" +
      "_id\030\001 \001(\t\"%\n\017MessageResponse\022\022\n\nmessage_" +
      "id\030\001 \001(\t\"[\n\007Message\022\022\n\nmessage_id\030\001 \001(\t\022" +
      "\021\n\tsender_id\030\002 \001(\t\022\023\n\013receiver_id\030\003 \001(\t\022" +
      "\024\n\014message_text\030\004 \001(\t\".\n\020MessagesRespons" +
      "e\022\032\n\010messages\030\001 \003(\0132\010.Message2\200\001\n\020Messag" +
      "ingService\0220\n\013sendMessage\022\017.MessageReque" +
      "st\032\020.MessageResponse\022:\n\027retrieveMessages" +
      "ForUser\022\014.UserRequest\032\021.MessagesResponse" +
      "B,\n\030com.miniprojet.messagingB\016MessagingP" +
      "rotoP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_MessageRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MessageRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MessageRequest_descriptor,
        new java.lang.String[] { "SenderId", "ReceiverId", "MessageText", });
    internal_static_UserRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_UserRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UserRequest_descriptor,
        new java.lang.String[] { "UserId", });
    internal_static_MessageResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_MessageResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MessageResponse_descriptor,
        new java.lang.String[] { "MessageId", });
    internal_static_Message_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_Message_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Message_descriptor,
        new java.lang.String[] { "MessageId", "SenderId", "ReceiverId", "MessageText", });
    internal_static_MessagesResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_MessagesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MessagesResponse_descriptor,
        new java.lang.String[] { "Messages", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
