<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<div>    
${status.index + 1} <!-- ���� -->
${replyVO.writer}�� ��� : ${replyVO.content}
<a href="delete3.do?no=${replyVO.no}&original=${replyVO.original}"><button>����</button></a>
<hr>
</div>