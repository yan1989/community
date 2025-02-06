<!DOCTYPE html>
<html lang="en">
<head>
    <#assign title="社区首页">
    <#include "../inc/head.ftl">
</head>
<body>
<!-- 用于插入 navbar 的容器 -->
<#include "../inc/navbar.ftl"/>
<!-- 页面内容 -->
<div class="layui-container">
 <div class="layui-row layui-col-space15">
  <div class="layui-col-md7 layui-col-md-offset1">
   <div class="layui-card community-updates">
    <div class="layui-card-header">社区动态</div>
    <div class="layui-card-body">
     <!-- 发帖按钮 -->
     <div class="layui-form-item">
      <a href="/post/createPost" class="layui-btn layui-btn-normal">发帖</a>
     </div>
     <!-- 帖子示例 -->
        <#list posts as p>
         <div class="post-item">
          <div class="post-header">
           <img src="/images/head.webp" alt="用户头像" class="post-avatar">
           <span class="post-author">${p.nickname}</span>
           <span class="post-time">${p.date}</span>
          </div>
          <div class="post-content">
              ${p.summary}
           <a href="/post-detail.html">全文</a>
          </div>
          <div class="post-meta">
           <span class="layui-badge layui-bg-blue">${p.sectionName}</span>
           <span class="post-views"><i class="layui-icon layui-icon-read"></i> ${p.viewTimes}</span>
           <span class="post-comments"><i class="layui-icon layui-icon-reply-fill"></i> ${p.commentsCount}</span>
          </div>
         </div>
        </#list>
     <!-- 更多帖子 -->
    </div>
   </div>
  </div>
  <div class="layui-col-md3">
   <!-- 登录、注册栏目 -->
   <div class="layui-card login-card">
       <#if SECURITY_CONTEXT??>
        <div class="layui-card-header">个人信息</div>
        <div class="layui-card-body">
         <div class="user-info">
          <img src="/images/head.webp" alt="用户头像" class="user-avatar">
          <div class="user-details">
           <span class="user-name">${SECURITY_CONTEXT.nickname}</span>
           <span class="user-register-time">注册时间: ${SECURITY_CONTEXT.regdate}</span>
          </div>
         </div>
         <div class="user-stats">
          <div class="stat-item">
           <span class="stat-label">发帖数</span>
           <span class="stat-value">123</span>
          </div>
          <div class="stat-item">
           <span class="stat-label">评论数</span>
           <span class="stat-value">456</span>
          </div>
          <div class="stat-item">
           <span class="stat-label">点赞数</span>
           <span class="stat-value">789</span>
          </div>
         </div>
         <div class="user-recent-activity">
          <div class="activity-header">最近活动</div>
          <div class="activity-item">
           <span class="activity-type">发布了帖子</span>
           <span class="activity-title">这是一个帖子标题</span>
           <span class="activity-time">2023-10-01 12:34</span>
          </div>
          <div class="activity-item">
           <span class="activity-type">评论了帖子</span>
           <span class="activity-title">这是另一个帖子标题</span>
           <span class="activity-time">2023-10-01 13:00</span>
          </div>
         </div>
         <div class="user-actions">
          <a href="/profile.html" class="layui-btn layui-btn-primary">编辑个人信息</a>
         </div>
        </div>
       <#else>
        <div class="layui-card-header">登录 / 注册</div>
        <div class="layui-card-body">
         <div class="layui-form-item">
          <a href="/login" class="layui-btn layui-btn-primary">登录</a>
         </div>
         <div class="layui-form-item">
          <a href="/register" class="layui-btn layui-btn-normal">注册</a>
         </div>
        </div>
       </#if>
   </div>

   <!-- 板块信息卡片 -->
   <div class="layui-card">
    <div class="layui-card-header">板块信息</div>
    <div class="layui-card-body">
     <div class="forum-section">
         <#list sections as s>
          <div class="section-item">
           <span class="section-name">${s.name}</span>
           <span class="section-post-count">帖子数: ${s.postCount}</span>
          </div>
         </#list>
     </div>
    </div>
   </div>
  </div>
 </div>
</div>
<#include "../inc/footer.ftl">
</body>
</html>