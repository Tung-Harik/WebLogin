<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="jakarta.tags.core"%>

<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Đăng nhập</title>
  <link rel="stylesheet"
        href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css">
</head>
<body class="container py-5" style="max-width:480px">
  <h2 class="mb-3">Đăng nhập</h2>

  <c:if test="${alert != null}">
    <div class="alert alert-danger">${alert}</div>
  </c:if>

  <form action="${pageContext.request.contextPath}/login" method="post">
    <div class="mb-3">
      <label class="form-label">Tài khoản</label>
      <input type="text" class="form-control" name="username" required>
    </div>
    <div class="mb-3">
      <label class="form-label">Mật khẩu</label>
      <input type="password" class="form-control" name="password" required>
    </div>
    <div class="form-check mb-3">
      <input class="form-check-input" type="checkbox" name="remember" id="remember">
      <label class="form-check-label" for="remember">Ghi nhớ tôi</label>
    </div>
    <button class="btn btn-primary w-100" type="submit">Đăng nhập</button>
  </form>
</body>
</html>