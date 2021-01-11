<%@page import="bit.com.a.dto.MemberDto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--
// 1

	List<MemberDto> list = (List<MemberDto>)request.getAttribute("list");
	
	for(MemberDto mem : list){
		System.out.println(mem.toString());
	}
--%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>
<body>

<h1>hello</h1>

<script type="text/javascript">
$(document).ready(function(){

	$.ajax({
		url:"getMembers.do",
		type:"get",
		success:function(list){
		//	alert('success');
		//	alert(list);
			alert( JSON.stringify(list) );
		},
		error:function(){
			alert('error');
		}

	});	
	
});



</script>



</body>
</html>








