## JQuery de 使用
> 由于每次想到用一下DOM操作就要翻一下锋利的Jquery书籍,实在很烦,
>> 就所以记录一下笔记

css选择器:
- 标签E{} 
- #ID{}
- .className{}
- E1,E2{} 群组选择器
- E F{}E的后面F的选择器
- E>F{} E的下的F元素
- *{} 所有的选择器 一般设定字体等

#### jQuery的选择和css差不多 都是$("上面的选择");
- 过滤选择器
> - :first第一个
> - :last
> - :not  $("input:not(.myClass)")选取class不是myClass的input
> - :even 偶数 索引从0开始
> - :odd 奇数
> - :eq(index) 选index的元素  :gt(index) 选大于gt  :lt(index)选小于,  
> - :focus 选择当前焦点的
- 内容过滤器
  - :contains("text") 选取含有文本内容text的元素 $("div:contains('郏俊龙')) 选取含有文本郏俊龙的div元素
  - :empty 选取不包含子元素或者文本的空元素, 
  - :has(E) 选取含有匹配元素的  $("div:has(p)")选取含有p的div
  - :parent 选取其父元素
- 可见性过滤器
   - :hidden 选取所有不可见
   - :visible 选取所有可见的元素
- 属性过滤
  - [attribute] 选取含有此属性的元素,$("div[id]") 选取拥有id的元素
  - [attribute=value] 选择此属性为value值的元素 $("div[tittle=test]")
  - != 不等于value
  - ^=以value开头的
  - $= 以value结束
  - *= 含有value
 - 子元素过滤器: 选择当前元素的__子元素__
   - :nth-child(index 或者even 或 odd 或 2N等)
   - :first-child
   - :last-child
   - :only-child 这个父元素只有一个子元素 子元素会被选择
- 表单的选择
:enable :disable :checked :selected


## jQuery DOM
##### 节点操作
- html 获取其子元素的html 和修改其html;
- append: 添加 $("ul").append($li)
  - appendTo: $(A).appendTo(B)将A追加到B中
  - prepend: 内置内容
- remove();删除节点
- detach: 删除节点 但是其元素不会再jquery对象中删除,还可以匹配到
- empty:清空后代节点 并不是删除节点,
- clone:复制
##### 内容替换
- replaceWith("<p1321 </p")替换节点
- wrap("<br </br"):用里面的<br>东西包裹选择的元素
- wraplnner("<br )方法:将<br放入他的值里面;
- attr("title")获取属性
- attr("title","jia jun long");设置属性
- removeAttr():删除属性
##### 样式修改
- attr("class","className")将class改为className
- addClass()
- removeClass();
- toggleClass("className");
- toggle(function(){} , function(){ });切换

##### html
html();获取和修改
val(),设置和获取元素的值

##### 遍历节点
children()
next()
prev()
siblings 同辈元素
##### css-DOM操作
改变css $(".className").css("hight","100px");
获取css("color");
height("")设置长度
widht()设置宽度
offset() 获取当前元素在当前视窗的相对偏移,

## 事件:
初始化加载
$(window).load(function(){
})
bind 绑定事件
unbind 移除事件

## Ajax
Ajax核心是XMLHttpRequest,是实现Ajax的关键-发送异步请求,接受响应及执行回调函数.

$("#id")load("jia.html")加载jia.html的插入至元素值里面

##### $.get()
$.get(url,[date] callback,type):
- data:object发送至服务器key/value作为QueryString附加到请求URL中
- callback : function类型 载入成功时回调函数,
- type: string类型, 服务器返回内容的格式 xml html json text等

##### $.post()
$.post(url, { name:"jia", hao:"ming"},function(data){ });
和get差不多的;

##### $.getScript()
动态加载script文件 不需要全部加载所以的js文件  
##### $.getJson() 
获取json文件 $.getJson(url,function(data){ 处理data};

#### $.ajax 自定义ajax请求
