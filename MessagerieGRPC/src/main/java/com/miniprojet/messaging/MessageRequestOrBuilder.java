// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Messaging.proto

package com.miniprojet.messaging;

public interface MessageRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:MessageRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string sender_id = 1;</code>
   */
  java.lang.String getSenderId();
  /**
   * <code>string sender_id = 1;</code>
   */
  com.google.protobuf.ByteString
      getSenderIdBytes();

  /**
   * <code>string receiver_id = 2;</code>
   */
  java.lang.String getReceiverId();
  /**
   * <code>string receiver_id = 2;</code>
   */
  com.google.protobuf.ByteString
      getReceiverIdBytes();

  /**
   * <code>string message_text = 3;</code>
   */
  java.lang.String getMessageText();
  /**
   * <code>string message_text = 3;</code>
   */
  com.google.protobuf.ByteString
      getMessageTextBytes();
}
