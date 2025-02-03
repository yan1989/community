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
  const layer = layui.layer;
  const {createEditor, createToolbar} = window.wangEditor;
  const editorConfig = {
    MENU_CONF: {
      uploadImage: {
        server: '/user/uploadImage',
        fieldName: 'imageFile',
        maxFileSize: 1024 * 1024, // 1M
        allowedFileTypes: ['image/jpeg', 'image/png', 'image/gif'],
        onFailed(file, res) {
          layer.alert(res.message, {title: '上传错误', icon: 2});
        },
        onError(file, err, res) {
          layer.alert(err.message, {title: '上传错误', icon: 2});
        },
      }
    }
  }

  const toolbarConfig = {
    toolbarKeys: [
      {
        key: 'group-font-style', // 必填，要以 group 开头
        title: '字体', // 必填
        menuKeys: ["fontFamily", "fontSize"], // 下级菜单 key ，必填
      },
      "blockquote", "bold", "underline", "italic", "through",
      "color", "bgColor", "clearStyle", "bulletedList", "numberedList",
      "justifyLeft", "justifyRight", "justifyCenter", "insertLink",
      {
        "key": "group-image",
        "title": "图片",
        "iconSvg": "<svg viewBox=\"0 0 1024 1024\"><path d=\"M959.877 128l0.123 0.123v767.775l-0.123 0.122H64.102l-0.122-0.122V128.123l0.122-0.123h895.775zM960 64H64C28.795 64 0 92.795 0 128v768c0 35.205 28.795 64 64 64h896c35.205 0 64-28.795 64-64V128c0-35.205-28.795-64-64-64zM832 288.01c0 53.023-42.988 96.01-96.01 96.01s-96.01-42.987-96.01-96.01S682.967 192 735.99 192 832 234.988 832 288.01zM896 832H128V704l224.01-384 256 320h64l224.01-192z\"></path></svg>",
        "menuKeys": [
          "insertImage",
          "uploadImage"
        ]
      },
      "insertTable", "codeBlock"
    ]
  }


  const editor = createEditor({
    config: editorConfig,
    selector: '#editor-container',
    html: '<p><br></p>',
    mode: 'default',
  })

  const toolbar = createToolbar({
    editor,
    selector: '#toolbar-container',
    config: toolbarConfig,
    mode: 'simple'
  })
  console.log(toolbar.getConfig())
</script>
</html>