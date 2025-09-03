<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<c:choose>
    <!-- Nếu chưa đăng nhập -->
    <c:when test="${sessionScope.account == null}">
        <div class="col-sm-6">
            <ul class="list-inline right-topbar pull-right">
                <li>
                    <a href="${pageContext.request.contextPath}/login">Đăng nhập</a>
                    |
                    <a href="${pageContext.request.contextPath}/register">Đăng ký</a>
                </li>
                <li class="search fa fa-search search-button"></li>
            </ul>
        </div>
    </c:when>

    <!-- Nếu đã đăng nhập -->
    <c:otherwise>
        <div class="col-sm-6">
            <ul class="list-inline right-topbar pull-right">
                <li>
                    <a href="${pageContext.request.contextPath}/member/myaccount">
                        ${sessionScope.account.fullName}
                    </a>
                    |
                    <a href="${pageContext.request.contextPath}/logout">Đăng Xuất</a>
                </li>
                <li class="search fa fa-search search-button"></li>
            </ul>
        </div>
    </c:otherwise>
</c:choose>


</body>
</html>