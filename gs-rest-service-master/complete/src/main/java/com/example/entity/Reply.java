package com.example.entity;

public class Reply {
  private int rid;
  private int postId;
  private String username;
  private String Text;
  private int replyTo;
  Reply(){}

  public Reply(int postId, String username, String text, int replyTo) {
    this.postId = postId;
    this.username = username;
    Text = text;
    this.replyTo = replyTo;
  }

  public int getRid() {
    return rid;
  }

  public void setRid(int rid) {
    this.rid = rid;
  }

  public int getPostId() {
    return postId;
  }

  public void setPostId(int postId) {
    this.postId = postId;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getText() {
    return Text;
  }

  public void setText(String text) {
    Text = text;
  }

  public int getReplyTo() {
    return replyTo;
  }

  public void setReplyTo(int replyTo) {
    this.replyTo = replyTo;
  }

  @Override
  public String toString() {
    return "Reply{" +
            "rid=" + rid +
            ", postId=" + postId +
            ", username='" + username + '\'' +
            ", Text='" + Text + '\'' +
            ", replyTo=" + replyTo +
            '}';
  }
}
