<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<script src="https://cdn.ckeditor.com/ckeditor5/24.0.0/classic/ckeditor.js"></script>

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
				<input type="text" name="post_title" placeholder="제목">
			</div>			
			<div id="editor">
				<textarea id="editor" rows="5" cols="8" name="post_content"></textarea>
			</div>
		</div>
	</div>
	<div>
		<input type="button" value="취소">
		<input type="button" value="저장">
	</div>
</div>

	
<script>
    ClassicEditor
        .create( document.querySelector( '#editor' ) )
        .catch( error => {
            console.error( error );
        } );
</script>