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
	<form action="${pageContext.request.contextPath}/login" method="post">
		<h2>Tạo tài khoản mới</h2>

		<c:if test="${not empty alert}">
			<h3 class="alert alert-danger">${alert}</h3>
		</c:if>

		<section>
			<label class="input login-input">
				<div class="input-group">
					<span class="input-group-addon"> <i class="fa fa-user"></i>
					</span> <input type="text" name="username" placeholder="Tài khoản"
						class="form-control" required>
				</div>
			</label>
		</section>

		<!-- ví dụ thêm password + nút submit -->
		<section>
			<div class="input-group">
				<span class="input-group-addon"><i class="fa fa-lock"></i></span> <input
					type="password" name="password" placeholder="Mật khẩu"
					class="form-control" required>
			</div>
		</section>

		<button type="submit" class="btn btn-primary">Đăng nhập</button>
	</form>
</body>
</html>