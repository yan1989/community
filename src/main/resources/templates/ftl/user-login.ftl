<!DOCTYPE html>
<html lang="zh">
<head>
    <#assign title="登录">
    <#include "../inc/head.ftl">
</head>
<body>
<!-- 用于插入 navbar 的容器 -->
<#include "../inc/navbar.ftl">
<div class="layui-container">
 <div class="layui-row layui-col-space15">
  <div class="layui-col-md8 layui-col-md-offset2">
   <div class="layui-card">
    <div class="layui-card-header">登录</div>
    <div class="layui-card-body">
     <form class="layui-form" method="POST">
      <div class="layui-form-item">
       <label class="layui-form-label">用户名</label>
       <div class="layui-input-block">
        <input type="text" name="username" required lay-verify="required"
               placeholder="请输入用户名" autocomplete="off" class="layui-input">
       </div>
      </div>
      <div class="layui-form-item">
       <label class="layui-form-label">密码</label>
       <div class="layui-input-block">
        <input type="password" name="password" required lay-verify="required"
               placeholder="请输入密码" autocomplete="off" class="layui-input">
       </div>
      </div>
      <div class="layui-form-item">
       <div class="layui-input-block">
        <button class="layui-btn" lay-submit lay-filter="login-form">登录</button>
        <a href="/register" class="layui-btn layui-btn-primary">注册</a>
       </div>
      </div>
     </form>
    </div>
   </div>
  </div>
 </div>
</div>
</body>
<script>
  layui.use(['form'], function () {
    const form = layui.form;
    // 监听表单提交事件
    form.on('submit(login-form)', function (data) {
      axios.post('/procssLogin', data.field, {
        headers: {
          'Content-Type': 'application/x-www-form-urlencoded'
        }
      }).then(function () {
        window.location.href = '/';
      }).catch(function (error) {
        layer.msg(error.response.data);
      });
      return false;
    });
  });
</script>
</html>