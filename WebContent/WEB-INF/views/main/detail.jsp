<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<style>
a:link { color: black; text-decoration: none;}
</style>

<fmt:parseDate var="parseRegDate" value="${post.wdate}" pattern="yyyy-MM-dd HH:mm"/>

<fmt:formatDate var="resultRegDt" value="${parseRegDate}" pattern="yyyy-MM-dd HH:mm"/>

<div class="container text">
	<div>
		<h2><a href="#">${post.category_name }</a>
			>
			<a href="#">${post.board_name }</a>
		</h2>
	</div>
	<div class="detail-tbl">
		<div class="table">
			<div class="1-line">
				<span>${post.post_title }</span>
				<span>${resultRegDt}</span>
			</div>
			<div class="2-line">
				<span>${post.user_nickname }</span>
				<span>${post.readcount } </span>
			</div>
			<div>
			${post.post_content }
			<c:if test="${not empty post.post_image }">
				<img alt="" src="./resources/upload/${post.post_image }">
			</c:if>
			</div>
			
			<div style="text-align: center;">
				<div>
					<a href="#">
						<i class="far fa-thumbs-up"></i>
					</a>
					<a href="#">
						<i class="far fa-thumbs-down"></i>
					</a>
				</div>
			</div>
		</div>
	</div>
</div>