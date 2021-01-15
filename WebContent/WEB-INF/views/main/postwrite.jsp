<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<div class="container">
	<div>
		<h2>${name }</h2>
	</div>
	<div class="write-tbl">
		<div class="table">
			<div>
				<select>
					<option value="null">카테고리</option>
					<c:forEach items="${list }" var="l">
						<option value="${l.board_seq }">${l.board_name }</option>					
					</c:forEach>
				</select>
				<input type="text" name="post_title">
			</div>			
			<div colspan="2">
				<textarea rows="5" cols="8" name="post_content"></textarea>
			</div>
		</div>
	</div>
	<div>
		<input type="button" value="취소">
		<input type="button" value="저장">
	</div>
</div>
	<script type="text/javascript">
		
	</script>