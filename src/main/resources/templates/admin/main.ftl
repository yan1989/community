<!DOCTYPE html>
<html lang="en">
<head>
 <meta charset="UTF-8">
 <title>Admin</title>
</head>
<body>
<h1>Welcome to Admin Page</h1>
<h2>User:${SPRING_SECURITY_CONTEXT.authentication.principal.username}</h2>
<h3>Role:
    <#list SPRING_SECURITY_CONTEXT.authentication.principal.authorities as role>
     <span>${role}<#if role_has_next>,</#if></span>
    </#list>
</h3>
</body>
</html>