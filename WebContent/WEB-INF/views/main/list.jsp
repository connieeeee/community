<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<style>
.post-list:link { color: black; text-decoration: none;}
.post-list:visited { color: darkgray; }

.board-list:link { color: black; text-decoration: none;}

.list-box{
	border: 1px solid black;
	max-width: 100%;
}
</style>

<div class="container">
	<div class="container">
		<span id="more" style="CURSOR: hand" onclick="show_list()">
			 <strong>></strong>목차보기
		</span>
		<div class="container list-box" id="story" style="display: none">
			<c:if test="${not empty list }">
				<c:forEach items="${list }" var="n">
					<span>
						<a href="board?category_seq=${cate_seq }&board_seq=${n.board_seq }"  class="text board-list">${n.board_name}</a>
					</span>
				</c:forEach>
			</c:if>
			<c:if test="${empty list }">
				<div>
					<span class="text">첫 게시판을 만들어보세요!</span>
				</div>
			</c:if>
		</div>
	</div>
	<div class="container">
		<div class="container wrap-table-1">
			<table id="table-1" class="table text table-hover">
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
						<c:forEach  items="${post}" var="p" varStatus="i">
							<tr style="text-align: center;">
								<fmt:parseDate var="parseRegDate" value="${p.wdate}" pattern="yyyy-MM-dd"/>
								<fmt:formatDate var="resultRegDt" value="${parseRegDate}" pattern="yyyy-MM-dd"/>
								<td>${i.count}</td>
								<td>${p.board_name}</td>
								<td>
									<a href="#" class="text post-list" onclick="goDetail(${p.post_seq})">${p.post_title}</a>
								</td>
								<td>${p.user_nickname}</td>
								<td>${resultRegDt }</td>
								<td>${p.readcount }</td>
							</tr>
						</c:forEach>
					</c:if>
					<c:if test="${empty post}">
					<tr>
						<td colspan="6" class="text" style="text-align: center;">
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
			<c:if test="${empty list }">
				<input type="button" value="작성" onclick="goPage('00')">
			</c:if>
			<c:if test="${not empty list }">
				<input type="button" value="작성" onclick="goPage(${cate_seq})">
			</c:if>
		</div>
	</div>
</div>

<script type="text/javascript">
function show_list(){
	if(story.style.display=='none'){
		story.style.display='';
		more.innerText='>접기'
	} else {
		story.style.display='none';
		more.innerText='>펼치기'
	}
}

function goPage(num){
	if(num == '00'){
		alert("게시판을 만들어주세요");
	}else{
		location.href="write?category_seq="+num;
	}
}

function goDetail(num){
	location.href="detail?post_seq="+num;
}

</script>