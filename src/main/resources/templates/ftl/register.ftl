<!DOCTYPE html>
<html lang="en">
<head>
    <#include "../inc/head.ftl">
    <@head title="用户注册"></@head>
</head>
<body>
<#include "../inc/navbar.ftl">
<div class="layui-container">
 <div class="layui-row layui-col-space15">
  <div class="layui-col-md6 layui-col-md-offset3">
   <div class="layui-card">
    <div class="layui-card-header">注册</div>
    <div class="layui-card-body">
     <form class="layui-form" action="/register" method="POST">
      <div class="layui-form-item">
       <label class="layui-form-label">用户名</label>
       <div class="layui-input-block">
        <input type="text" name="username" required lay-verify="required" placeholder="请输入用户名" autocomplete="off" class="layui-input">
       </div>
      </div>
      <div class="layui-form-item">
       <label class="layui-form-label">密码</label>
       <div class="layui-input-block">
        <input type="password" name="password" required lay-verify="required" placeholder="请输入密码"
               autocomplete="off" class="layui-input">
       </div>
      </div>
      <div class="layui-form-item">
       <label class="layui-form-label">确认密码</label>
       <div class="layui-input-block">
        <input type="password" name="confirm_password" required lay-verify="required" placeholder="请再次输入密码" autocomplete="off" class="layui-input">
       </div>
      </div>
      <div class="layui-form-item">
       <div class="layui-input-block">
        <button class="layui-btn" lay-submit lay-filter="formDemo">注册</button>
        <a href="/login" class="layui-btn layui-btn-primary">登录</a>
       </div>
      </div>
     </form>
    </div>
   </div>
  </div>
 </div>
</div>
</body>
</html>