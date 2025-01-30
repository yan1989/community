<!DOCTYPE html>
<html lang="zh">
<head>
    <#assign title="发布帖子">
    <#include "../inc/head.ftl">
 <link href="https://unpkg.com/@wangeditor/editor@latest/dist/css/style.css" rel="stylesheet"/>
 <script src="https://unpkg.com/@wangeditor/editor@latest/dist/index.js"></script>
 <style>
     #editor—wrapper {
         border: #eeeeee 1px solid;
     }

     #toolbar-container {
         border-bottom: #eeeeee 1px solid;;
     }

     #editor-container {
         height: 500px;
     }
 </style>
</head>

<body>
<#include "../inc/navbar.ftl">
<div class="layui-container">
 <div class="layui-row layui-col-space15">
  <div class="layui-col-md10 layui-col-md-offset1">
   <div class="layui-card">
    <div class="layui-card-header">发帖</div>
    <div class="layui-card-body">
     <form class="layui-form" action="/create-post" method="POST">
      <div class="layui-form-item">
       <label class="layui-form-label">标题</label>
       <div class="layui-input-block">
        <input type="text" name="title" required lay-verify="required" placeholder="请输入标题"
               autocomplete="off" class="layui-input">
       </div>
      </div>
      <div class="layui-form-item">
       <label class="layui-form-label">内容</label>
       <div class="layui-input-block">
        <div id="editor—wrapper">
         <div id="toolbar-container"><!-- 工具栏 --></div>
         <div id="editor-container"><!-- 编辑器 --></div>
        </div>
       </div>
      </div>
      <div class="layui-form-item">
       <label class="layui-form-label">板块</label>
       <div class="layui-input-inline">
        <select name="section" lay-verify="required">
         <option value="">请选择板块</option>
         <option value="技术讨论">技术讨论</option>
         <option value="生活杂谈">生活杂谈</option>
         <option value="资源共享">资源共享</option>
         <option value="站务公告">站务公告</option>
        </select>
       </div>
      </div>
      <div class="layui-form-item">
       <div class="layui-input-block">
        <button class="layui-btn" lay-submit lay-filter="formDemo">发布</button>
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
  const {createEditor, createToolbar} = window.wangEditor

  const editor = createEditor({
    selector: '#editor-container',
    html: '<p><br></p>',
    //config: editorConfig,
    mode: 'default', // or 'simple'
  })

  const editorConfig = {
    placeholder: 'Type here...',
  }
  const toolbarConfig = {
    toolbarKeys: ['headerSelect']
  }

  const toolbar = createToolbar({
    editor,
    selector: '#toolbar-container',
    config: toolbarConfig,
    mode: 'simple', // or 'simple'
  })
  console.log(toolbar.getConfig())
</script>
</html>