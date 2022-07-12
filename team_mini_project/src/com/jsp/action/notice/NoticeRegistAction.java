package com.jsp.action.notice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.action.Action;
import com.jsp.command.NoticeRegistCommand;
import com.jsp.controller.XSSHttpRequestParameterAdapter;
import com.jsp.dto.NoticeVO;
import com.jsp.service.NoticeService;

public class NoticeRegistAction implements Action {

   private NoticeService noticeService;

   public void setNoticeService(NoticeService noticeService) {
      this.noticeService = noticeService;
   }

   @Override
   public String process(HttpServletRequest request, HttpServletResponse response) throws Exception {
      String url = "/notice/regist_success";

//      NoticeVO notice = HttpRequestParameterAdapter.execute(request, NoticeVO.class);
//      
//      String title = HTMLInputFilter.htmlSpecialChars(notice.getTitle());

      NoticeRegistCommand noticereq = XSSHttpRequestParameterAdapter.execute(request, NoticeRegistCommand.class, true);
      NoticeVO notice = noticereq.tonoticeVO();
//      System.out.println(request.getParameter("fixed"));
      
//      NoticeVO notice = XSSHttpRequestParameterAdapter.execute(request, NoticeVO.class, true);

//      if(request.getParameter("fixed") == null) {
//			notice.setFixed(0);
//	  }
      
      // smartEditor parameter 제외
      notice.setContent(request.getParameter("content"));

      noticeService.regist(notice);

      return url;
   }

}