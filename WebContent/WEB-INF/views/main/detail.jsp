<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>



<fmt:parseDate var="parseRegDate" value="${post.wdate}" pattern="yyyy-MM-dd HH:mm"/>

<fmt:formatDate var="resultRegDt" value="${parseRegDate}" pattern="yyyy-MM-dd HH:mm"/>

<div class="container">
	<div class="detail-tbl">
		<table class="table">
			<tr>
				<td>${post.post_title }</td>
				<td>조회수 </td>
			</tr>
			<tr>
				<td>${post.user_nickname }</td>
				<td>${resultRegDt}</td>
			</tr>
			<tr>
				<td colspan="2">${post.post_content }</td>
			</tr>
			<tr style="text-align: center;">
				<td colspan="2">
					<a href="#">
						<i class="far fa-thumbs-up"></i>
					</a>
					<a href="#">
						<i class="far fa-thumbs-down"></i>
					</a>
				</td>
			</tr>
		</table>
	</div>
</div>