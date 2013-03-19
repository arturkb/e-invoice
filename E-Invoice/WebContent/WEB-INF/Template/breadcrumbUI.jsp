<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
			<!-- breadcrumb -->
			<div>
				<ul class="breadcrumb">
					<c:forEach var="element" items="${page.body.breadcrumb.elements}"> 
    					<li><a href="${element.address}">${element.title}</a></li>
					</c:forEach>
				</ul>
			</div>
			<!-- breadcrumb  ends -->