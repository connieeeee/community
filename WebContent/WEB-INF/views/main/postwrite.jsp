<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
 
 <!-- summber editor -->
  <link href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  <link href="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote.min.js"></script>

<div class="container">
	<div>
		<h2>${name }</h2>
	</div>
	<div class="write-tbl">
		<div class="table">
			<form id="write_frm" method="post"  enctype="multipart/form-data">
				<input type="hidden" value="${category_seq }" name="category_seq">
				<div style="position:relative ;height: 38px">
					<select style="width: 12%; float: left;" name="board_seq">
						<option>카테고리</option>
						<c:forEach items="${list }" var="l">
							<option value="${l.board_seq }">${l.board_name }</option>					
						</c:forEach>
					</select>
					<input type="text" class="form-control" name="post_title" placeholder="제목" style="width: 87%; float: right;">
				</div>			
				<div>
					<textarea id="summernote" rows="5" cols="8" name="post_content">
						<p id="image_container"></p>
					</textarea>
				</div>
				<div>
					<input type="file" accept="image/*" name="fileload" onchange="setThumbnail(event);">
				</div>
				<div>
					<input type="button" class="note-btn btn btn-default note-btn-underline" value="취소">
					<input type="submit" id="submit" class="note-btn btn btn-default note-btn-underline" value="저장">
				</div>
			</form>
		</div>
	</div>
</div>
<script> 

$("#submit").click(function() {	

	$("#write_frm").attr({ "target":"_self", "action":"writeAf" }).submit();	
});

/* 게시글에 사진 첨부 */
function setThumbnail(event) { 
	var reader = new FileReader(); 
	reader.onload = function(event) { 
		var img = document.createElement("img"); 
		img.setAttribute("src", event.target.result); 
		document.querySelector("p#image_container").appendChild(img); 
		};
		 reader.readAsDataURL(event.target.files[0]); 
}


/* 에디터 설정 */
$('#summernote').summernote({
	  tabsize: 2,
	  height: 400,
	  lang: 'ko-KR',
	  toolbar: [
	      ['style', ['style']],
	      ['font', ['bold', 'underline', 'clear']],
	      ['color', ['color']],
	      ['para', ['ul', 'ol', 'paragraph']],
	      ['table', ['table']],
	      ['view', ['fullscreen', 'codeview', 'help']]
	    ]
});

</script>



