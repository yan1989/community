<!DOCTYPE html>
<html lang="en">

<head>
    <#assign title="用户设置">
    <#include "../inc/head.ftl">
</head>

<body>
<#include "../inc/navbar.ftl">
<div class="layui-container">
 <div class="layui-row layui-col-space15">
  <div class="layui-col-md8 layui-col-md-offset2">
   <div class="layui-card">
    <div class="layui-card-header">个人中心</div>
    <div class="layui-card-body">
     <form class="layui-form" action="/update-profile" method="POST">
      <div class="layui-form-item">
       <label class="layui-form-label">用户名</label>
       <div class="layui-input-block">
        <input type="text" name="username" required lay-verify="required"
               placeholder="请输入用户名" autocomplete="off" class="layui-input" value="用户昵称1">
       </div>
      </div>
      <div class="layui-form-item">
       <label class="layui-form-label">邮箱</label>
       <div class="layui-input-block">
        <input type="email" name="email" required lay-verify="email" placeholder="请输入邮箱"
               autocomplete="off" class="layui-input" value="user@example.com">
       </div>
      </div>
      <div class="layui-form-item">
       <label class="layui-form-label">头像</label>
       <div class="layui-input-block">
        <input type="file" name="avatar" class="layui-input">
       </div>
      </div>
      <div class="layui-form-item">
       <div class="layui-input-block">
        <button class="layui-btn" lay-submit lay-filter="formDemo">保存</button>
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