<div class="navbar">
    <ul class="layui-nav" lay-filter="" lay-bar="disabled">
        <li class="layui-nav-item"><a href="/">首页</a></li>
        <li class="layui-nav-item"><a href="">产品</a></li>
        <li class="layui-nav-item"><a href="">大数据</a></li>
        <li class="layui-nav-item">
            <a href="javascript:">解决方案</a>
            <dl class="layui-nav-child">
                <dd><a href="">移动模块</a></dd>
                <dd><a href="">后台模版</a></dd>
                <dd><a href="">电商平台</a></dd>
            </dl>
        </li>
        <li class="layui-nav-item"><a href="">社区</a></li>
        <li class="layui-nav-item search-container">
            <form class="layui-form" action="/search" id="searchForm">
                <input type="text" name="search" required lay-verify="required" placeholder="搜索" autocomplete="off"
                       class="layui-input search-input">
                <i class="layui-icon layui-icon-search search-icon" id="searchIcon"></i>
            </form>
        </li>
        <li class="layui-nav-item layui-nav-item-right">
            <a href="javascript:"><img src="/images/head.webp" class="layui-nav-img" alt="我的头像">我</a>
            <dl class="layui-nav-child">
                <dd><a href="/user/profile">个人中心</a></dd>
                <dd><a href="/user/setting">设置</a></dd>
                <dd><a href="/logout">退出</a></dd>
            </dl>
        </li>
        <li class="layui-nav-item layui-nav-item-right">
            <a href="/messages.html"><i class="layui-icon layui-icon-notice"></i>消息中心<span
                        class="layui-badge-dot"></span></a>
        </li>
    </ul>
</div>