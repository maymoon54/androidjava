<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<div>    
${status.index + 1} <!-- º¯π¯ -->
${replyVO.writer}¥‘ ¥Ò±€ : ${replyVO.content}
<a href="delete3.do?no=${replyVO.no}&original=${replyVO.original}"><button>ªË¡¶</button></a>
<hr>
</div>