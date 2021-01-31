<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
    
<div class="container">
	<table class="table table-hover" style="text-align: center;">
		<thead>
			<tr>
				<td>번호</td>
				<td>카테고리</td>
				<td>게시판 이름</td>
				<td>게시판 설명</td>
				<td>확정</td>
				<td>삭제</td>
				<td>만든이</td>
			</tr>
		</thead>
		<tbody>
			<c:if test="${not empty list }">
						<c:forEach  items="${list}" var="list" varStatus="i">
							<tr>
								<td>${i.count}</td>
								<td>${list.category_name}</td>
								<td>${list.board_name}</td>
								<td>${list.board_inform}</td>
								<td>
									<c:if test="${list.board_confirm eq 0 }">
										<input type="button" value="승인" onclick="confirm(${list.board_seq},'c')">
									</c:if>
									<c:if test="${list.board_confirm eq 1 }">
										완료
									</c:if>
								</td>
								<td>
									<input type="button" value="삭제" onclick="confirm(${list.board_seq},'d')">
								</td>
								<td>${list.user_nickname }</td>
							</tr>
						</c:forEach>
					</c:if>
					<c:if test="${empty list}">
					<tr>
						<td colspan="6" style="text-align: center;">
							목록이 비었습니다
						</td>
					</tr>
					</c:if>
		</tbody>
	</table>
</div>
<script type="text/javascript">
	function confirm(num,alpha){
		console.log(alpha);
		$.ajax({
			url:"./board_confirm",
			type:"get",
			data:{"board_seq":num,
					"a":alpha},
			async:false,
			success:function(){
				alert("승인했습니다");
				location.reload();
			},
			error:function(){}
		});
			
	}
</script>