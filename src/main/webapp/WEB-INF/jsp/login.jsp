<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<style>

.form-signin {
  max-width: 330px;
  padding: 15px;
  margin: 0 auto;
}
.form-signin .form-signin-heading,
.form-signin .checkbox {
  margin-bottom: 10px;
}
.form-signin .checkbox {
  font-weight: normal;
}
.form-signin .form-control {
  position: relative;
  height: auto;
  -webkit-box-sizing: border-box;
     -moz-box-sizing: border-box;
          box-sizing: border-box;
  padding: 10px;
  font-size: 16px;
}
.form-signin .form-control:focus {
  z-index: 2;
}
.form-signin input[type="email"] {
  margin-bottom: -1px;
  border-bottom-right-radius: 0;
  border-bottom-left-radius: 0;
}
.form-signin input[type="password"] {
  margin-bottom: 10px;
  border-top-left-radius: 0;
  border-top-right-radius: 0;
}
</style>
<form name='f' class="form-signin" action='/login' method='POST'>
<h2 class="form-signin-heading">Please sign in</h2>
<table>    
	<tr><td><input type='text' class="form-control" name='username' placeholder="Name" required autofocus/></td></tr>
	<tr><td><input class="form-control" type='password' name='password' placeholder="Password" required/></td></tr>
	<tr><td colspan='2'><button  name="submit" class="btn btn-lg btn-primary btn-block" type="submit" value="Login">Sign in</button></td></tr>
	<input name="_csrf" type="hidden" value="${_csrf.token}" />
</table>
</form>
<!-- <form class="form-signin" action="/login" method="POST"> -->
<!--         <h2 class="form-signin-heading">Please sign in</h2> -->
<!--         <input type="text" name="j_username" id="inputEmail" class="form-control" placeholder="Name" required autofocus> -->
<!--         <input type="password" name="j_password" id="inputPassword" class="form-control" placeholder="Password" required> -->
<!--         <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button> -->
<%--          <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" /> --%>
<!--  </form> -->