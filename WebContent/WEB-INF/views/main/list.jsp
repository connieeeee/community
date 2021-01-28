<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>


<div class="container">
	<div class="container">
		<c:forEach items="${list }" var="n">
			<span>
				<a href="board?board_seq=${n.board_seq }">${n.board_name }</a>
			</span>
		</c:forEach>
	</div>
	<div class="container">
		<div class="container wrap-table-1">
			<table id="table-1" class="table table-hover">
				<thead class="table-light">
					<tr  style="text-align: center;">
						<th>번호</th>
						<th>분류</th>
						<th>제목</th>
						<th>작성자</th>
						<th>날짜</th>
						<th>조회수</th>
					</tr>
				</thead>
				<tbody>
						<c:if test="${not empty post }">
							<c:forEach  items="${post}" var="list" varStatus="i">
								<tr style="text-align: center;">
									<fmt:parseDate var="parseRegDate" value="${list.wdate}" pattern="yyyy-MM-dd"/>
									<fmt:formatDate var="resultRegDt" value="${parseRegDate}" pattern="yyyy-MM-dd"/>
									<td>${i.count}</td>
									<td>${list.board_name}</td>
									<td>
										<a href="#" onclick="goDetail(${list.post_seq})">${list.post_title}</a>
									</td>
									<td>${list.user_nickname}</td>
									<td>${resultRegDt }</td>
									<td>${list.readcount }</td>
								</tr>
							</c:forEach>
						</c:if>
						<c:if test="${empty post}">
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
	<div class="container">
		<div>
			<select>
				<option>선택하세요</option>
			</select>
		</div>
		<div>
			<input type="text">
			<input type="button" class="btn btn-primary" value="검색">
		</div>
		<div>
			<input type="button" value="작성${cate_seq}" onclick="goPage(${cate_seq})">
		</div>
	</div>
</div>

<script type="text/javascript">

function goPage(num){
	location.href="write?category_seq="+num;
}

function goDetail(num){
	location.href="detail?post_seq="+num;
}

</script>