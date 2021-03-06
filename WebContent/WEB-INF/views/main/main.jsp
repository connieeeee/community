<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<style>
a:link { color: black; text-decoration: none;}
a:visited { color: darkgray; }

.wrap-table-1{
	float: left;
	width: 50%;
}
.wrap-table-2{
	float: right;
	width: 50%;
}
</style>
    
<div class="container">
	<div class="container wrap-table-1">
		<table id="table-1" class="table table-hover"  style="text-align: center;">
			<thead class="table-light">
				<tr>
					<th>번호</th>
					<th>분류</th>
					<th>제목</th>
					<th>작성자</th>
					<th>날짜</th>
					<th>조회수</th>
				</tr>
			</thead>
			<tbody>
					<c:if test="${not empty list }">
							<c:forEach  items="${list}" var="list" varStatus="i">
								<tr style="text-align: center;">
									<fmt:parseDate var="parseRegDate" value="${list.wdate}" pattern="yyyy-MM-dd"/>
									<fmt:formatDate var="resultRegDt" value="${parseRegDate}" pattern="yyyy-MM-dd"/>
									<td>${i.count}</td>
									<td>${list.board_name}</td>
									<td>
										<a href="#" onclick="goPage(${list.post_seq})">${list.post_title}</a>
									</td>
									<td>${list.user_nickname}</td>
									<td>${resultRegDt }</td>
									<td>${list.readcount }</td>
								</tr>
							</c:forEach>
						</c:if>
					<c:if test="${empty list}">
						<td colspan="6" style="text-align: center;">
							목록이 비었습니다
						</td>
					</tr>
				</c:if>
				</tr>
			</tbody>
		</table>
	</div>
	<div class="container wrap-table-2">
		<table id="table-2" class="table table-hover">
			<thead class="table-light">
				<tr>
					<th>번호</th>
					<th>분류</th>
					<th>제목</th>
					<th>작성자</th>
					<th>날짜</th>
					<th>조회수</th>
				</tr>
			</thead>
			<tbody>
					<c:if test="${not empty list }">
						<c:forEach  items="${list}" var="list" varStatus="i">
							<tr>
								<td>{i.count}</td>
								<td>{list.category_name}</td>
								<td>
									<a href="#" onclick="goPage(${list.post_seq})" style="font-family: black">{list.post_title}</a>
								</td>
								<td>{list.post_title}</td>
								<td>{list.wdate}</td>
								<td>0</td>
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
</div>
<script type="text/javascript">

function goPage(num){
	location.href="detail?post_seq="+num;
}

</script>