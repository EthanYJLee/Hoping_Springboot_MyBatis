<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import = "java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>후기상세</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.9.1/font/bootstrap-icons.css">
<link rel="stylesheet" href="http://code.jquery.com/ui/1.8.18/themes/base/jquery-ui.css" type="text/css" />
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.9.0/css/bootstrap-datepicker.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.4.1/css/bootstrap.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/2.3.2/css/bootstrap-responsive.css">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="css/Design.css">
<link rel="stylesheet" href="css/HostCard.css">
<link rel="stylesheet" href="css/TableCenter.css">
<link rel="stylesheet" href="css/HostStyle.css">
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.js"></script>
<script src="https://https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.bundle.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.9.0/js/bootstrap-datepicker.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.4.1/js/bootstrap.js"></script>

</head>

<body>

<%-- nav include --%>
<%@ include file = "hnav2.jsp" %>


<form action="reply_review" method="post">

<div class="container py-3">
<nav class="navbar navbar-expand-md bg-light">
	<div class="container-fluid">
		<h2 class="display-9 fw-bold">후기상세</h2>
		<a class="d-flex align-items-center mb-3 mb-md-0 me-md-auto text-dark text-decoration-none">
		</a>
	</div>
</nav>
</div>

<main>

<input type="hidden" name="rvSeq" value="${review_content_view.rvSeq}">
<div class="container py-2 justify-content-md-center">
<div class="row justify-content-md-center py-1">
	<div class="col-md-8 py-1">
		<div class="h-100 p-1 bg-light border rounded-3">
			<div class="container text-center">
<div class="row g-2">
<div class="col-6">
<div class="p-1 border bg-light">캠핑장명 : ${review_content_view.regName}</div>
</div>
<div class="col-6">
<div class="p-1 border bg-light">작성자 : ${review_content_view.rvCName} (${review_content_view.rvCId})</div>
</div>
<div class="col-6">
<div class="p-1 border bg-light">후기제목 : ${review_content_view.rvTitle}</div>
</div>
<div class="col-6">
<div class="p-1 border bg-light">작성날짜 : ${review_content_view.rvTime}</div>
</div>
</div>
</div>
</div>
</div>
	<div class="col-md-8 py-1">
		
		<div class="h-100 p-1 bg-light border rounded-3">
			<p>내용</p>
			${review_content_view.rvContent}
			<br>
			
		</div>
	</div>
	<div class="col-md-8 py-1">
		<div class="form-floating">
			<textarea class="form-control" name="replyContent" placeholder="Leave a comment here" id="floatingTextarea2" style="height: 100px"></textarea>
			<label for="floatingTextarea2">Comment</label>
			
		</div>
	</div>
</div>
</div>
<div style="text-align: center;">
<input type="submit" id="PrevSubmit" value="Preview" name="preview" style="display:none;" />
<a class="u-link-v5 g-color-gray-dark-v4 g-color-primary--hover" href="javascript:void(0)" onclick="document.getElementById('PrevSubmit').click();">
<i class="fa fa-reply g-pos-rel g-top-1 g-mr-3"></i>
답변 작성
</a>
</div>
</main>


</form>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
</body>
</html>