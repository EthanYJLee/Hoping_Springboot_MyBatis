<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:set var="date" value="<%=new Date()%>"/>
<%@ page import = "java.sql.*"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>후기관리</title>
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
<script type="text/javascript" src="https://cdn.jsdelivr.net/npm/chart.js"></script>




</head>

<body>
<%-- nav include --%>
<%@ include file = "hnav2.jsp" %>


<%--search바 --%>
<div class="container myscontainer">
	<div class="row myhtitle">
		<div><b>후기관리</b></div>
	</div>
	<div class="row">
		<%-- 콤보박스 --%>
		<select class="col-2 form-select form-select-sm" aria-label=".form-select-sm example">
		  <option value="">캠핑장을 선택해주세요</option>
			<c:forEach var="reglist" items="${regName_list}">
			<option value="${reglist}"<c:if test ="${reglist eq selectedRegName}">selected="selected"</c:if>>${reglist}</option>
			</c:forEach>
		</select>
		<%-- 달력입니당. --%>
		<form class="col-10" action="host_review_list?page=1">
			<div class="row">
			<div class="col-4" autocomplete="off">
					<div class="input-group input-daterange">
						<input name="startDate" value="start" type="date" style="background-color: white; border-radius: 13px; height: 33px; font-size: 13px;" class="mydinput form-control" placeholder="Start">
						&nbsp;&nbsp;&nbsp;
						<input name="endDate" type="date" style="border-radius: 13px; height: 33px; font-size: 13px;" class="secondary form-control" placeholder="End">
					</div>
			</div>
			<%-- search --%>
			<div class="col-7" role="search">
				<input name="strSearch" style="width: 450px;" type="search" class="mysearch " aria-label="Search">
			</div>
			<button type="submit" class="text-decoration-none col-1" style="background-color:transparent; border: 0px solid black;">
				<svg class="mysvg" xmlns="http://www.w3.org/2000/svg" width="25" height="25" fill="currentColor" class="bi bi-search" viewBox="0 0 16 16">
					  <path d="M11.742 10.344a6.5 6.5 0 1 0-1.397 1.398h-.001c.03.04.062.078.098.115l3.85 3.85a1 1 0 0 0 1.415-1.414l-3.85-3.85a1.007 1.007 0 0 0-.115-.1zM12 6.5a5.5 5.5 0 1 1-11 0 5.5 5.5 0 0 1 11 0z"/>
				</svg>
			</button>
	        </div>
	    </form>
        </div>
	</div>

<%-- 테이블 --%>
<div class="container">
	<div class="card myhcard" style="border-radius: 20px;">
		<table>
			<tr class="myhtr">
				<td class="myth">후기번호</td><td class="myth">캠핑장</td><td class="myth">작성자 ID</td><td class="myth">작성자 이름</td><td class="myth">후기제목</td><td class="myth">후기일자</td>
			</tr>
			<%-- 후기 내역 list for문 돌리기 --%>
			<c:forEach items="${review_list}" var="rl">
				
				<tr class="myhtr">
					<td class="mytd"><a href="review_content?rvSeq=${rl.rvSeq}">${rl.rvSeq}</a></td>
					<td class="mytd">${rl.regName}</td>
					<td class="mytd">${rl.rvCId}</td>
					<td class="mytd">${rl.rvCName}</td>
					<td class="mytd">${rl.rvTitle}</td>
					<td class="mytd">${rl.rvTime}</td>
				
				</tr>
			</c:forEach>
		</table>	  
	</div>
</div>


  
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>