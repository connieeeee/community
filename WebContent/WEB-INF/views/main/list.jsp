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

<%
String choice = (String)request.getAttribute("choice");
if(choice == null) choice = "";

String searchWord = (String)request.getAttribute("searchWord");
if(searchWord == null) searchWord = "";

if(searchWord.equals("")){
	choice = "";
}
%>

<script>
let choice = "<%=choice %>";
let searchWord = "<%=searchWord %>";
$(document).ready(function(){
	$("#_choice").val(choice);

	// $("#_searchWord").val(searchWord);
	document.frmForm1.searchWord.value = searchWord;
});
</script>

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
		<!-- paging -->
		<div id="paging_wrap">
			<jsp:include page="/WEB-INF/views/main/paging.jsp" flush="false">
				<jsp:param name="totalRecordCount" value="${totalRecordCount }"/>
				<jsp:param name="pageNumber" value="${pageNumber }"/>
				<jsp:param name="pageCountPerScreen" value="${pageCountPerScreen }"/>
				<jsp:param name="recordCountPerPage" value="${recordCountPerPage }"/>	
			</jsp:include>
		</div>
				 
	</div>
	<div class="container">
		<form action="" name="frmForm1" id="_frmFormSearch" method="get">

			<table style="margin-left: auto; margin-right: auto; margin-top: 3px; margin-bottom: 3px">
			<tr>
				<td>검색</td>
				<td style="padding-left: 5px">
					<select id="_choice" name="choice">
						<option value="title" selected="selected">제목</option>
						<option value="content">내용</option>
						<option value="writer">작성자</option>		
					</select>
				</td>
				<td style="padding-left: 5px">
					<input type="text" id="_searchWord" name="searchWord">		
				</td>
				<td style="padding-left: 5px">
					<span class="button blue">
						<button type="button" id="btnSearch">검색</button>
					</span>
				</td>
			</tr>
			</table>
			
			<!-- 추가 기입 -->
			<input type="hidden" name="pageNumber" id="_pageNumber" value="${(empty pageNumber)?0:pageNumber }">
			
			<input type="hidden" name="recordCountPerPage" id="_recordCountPerPage" value="${(empty recordCountPerPage)?0:recordCountPerPage }">

		</form>
		<div>
			<input type="text">
			<input type="button" class="btn btn-primary" value="검색">
		</div>
		<div>
			<c:if test="${empty list }">
				<input type="button" value="작성" onclick="go_write('00')">
			</c:if>
			<c:if test="${not empty list }">
				<input type="button" value="작성" onclick="go_write(${cate_seq})">
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


function goPage( pageNumber ){
	$("#_pageNumber").val( pageNumber );
	$("#_frmFormSearch").attr("action", "board").submit();	
}

function go_write(num){
	if(num == '00'){
		alert("게시판을 만들어주세요");
	}else{
		location.href="write?category_seq="+num;
	}
}

function goDetail(num){
	location.href="detail?post_seq="+num;
}

$("#btnSearch").click(function(){
	//alert('btnSearch');
	
	$("#_frmFormSearch").attr("action", "board").submit();	
});

</script>