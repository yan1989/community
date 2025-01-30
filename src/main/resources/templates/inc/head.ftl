<#if SPRING_SECURITY_CONTEXT??>
    <#assign SECURITY_CONTEXT=SPRING_SECURITY_CONTEXT.authentication.principal/>
<#else>
</#if>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>${title}</title>
<link href="/layui/css/layui.css" rel="stylesheet"/>
<link href="/css/style.css" rel="stylesheet">
<script src="/layui/layui.js"></script>
<script src="/js/jquery-3.6.0.min.js"></script>
<script src="/js/axios.js"></script>
<script src="/js/load.js"></script>