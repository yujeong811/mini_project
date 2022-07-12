package com.jsp.command;

import com.jsp.dto.NoticeVO;

public class NoticeRegistCommand {
	private String nno;
	private String title;
	private String content;
	private String writer;
	private String fixed;
	
	public String getNno() {
		return nno;
	}
	public void setNno(String nno) {
		this.nno = nno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getFixed() {
		return fixed;
	}
	public void setFixed(String fixed) {
		this.fixed = fixed;
	}
	
	public NoticeVO tonoticeVO() {
		NoticeVO notice = new NoticeVO();
		
		notice.setTitle(this.title);
		notice.setContent(this.content);
		notice.setWriter(this.writer);
		
		if(this.fixed == null) this.fixed = "0"; 
		
		notice.setFixed(Integer.parseInt(this.fixed));
		
		return notice;
	}
	
}
