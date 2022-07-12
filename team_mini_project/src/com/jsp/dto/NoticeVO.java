package com.jsp.dto;

import java.util.Date;

public class NoticeVO {
	
	private int nno;          // �Խ��ǹ�ȣ
	private String title="";     // ����
	private String writer;	  // �ۼ��� (ȸ��)
	private String content="";   // ���� (html)
	private int viewcnt=0;      // ��ȸ��
	private Date regDate=new Date();     // ��ϳ�¥	
	private int fixed;
	
	public int getNno() {
		return nno;
	}
	public void setNno(int nno) {
		this.nno = nno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getViewcnt() {
		return viewcnt;
	}
	public void setViewcnt(int viewcnt) {
		this.viewcnt = viewcnt;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public int getFixed() {
		return fixed;
	}
	public void setFixed(int fixed) {
		this.fixed = fixed;
	}
	@Override
	public String toString() {
		return "NoticeVO [nno=" + nno + ", title=" + title + ", writer=" + writer + ", content=" + content
				+ ", viewcnt=" + viewcnt + ", regDate=" + regDate + ", fixed=" + fixed + "]";
	}
	
}
