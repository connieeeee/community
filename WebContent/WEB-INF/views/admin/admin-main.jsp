<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div>
	<input type="button" value="게시판 관리" onclick="goPage(1)">
	
</div>
<script type="text/javascript">
function goPage(num){
	if(num == 1){
		location.href="board_setting";
	}
}
</script>