## Bootstrap 的第N次 学习
bootstrap的js 使用函数(function (){}(参数));  
例如:  +function($){"USE STRICT";}(jQuery) 声明一个函数立即执行,传入jquery作为参数.  

- 基础样式: 定义按钮,文本等样式的
- 颜色样式:状态: primary(重点蓝) success(成功橙),info(信息蓝),warning(警告橙),danger(危险红);一般使用都是组件-primary等
- 尺寸样式: xs超小,sm小,md普通,lg 大型. 使用 组件-lg -md
- 状态样式:active disable 等
- 特殊元素样式 : 某些具体的标签nov 下的li等;
- 并列元素:
- 嵌套子元素样式: 嵌套一起做出一个组合
- 动画元素

## js的插件
实现步骤:  
- 声明立即调用的函数: +function($){"use string";}(jQuery);
- 定义插件类及相关的原型方法 例如Alert,prototype.close
- 在jQuery上定义插件并重设插件的构造函数. $.fn.alert.COnstructor=Alert
- 防冲突处理
- 绑定各种触发事件  

内部代码全部都是私有代码,外部代码无法访问,只有第三部的设置插件形式,通过$变量把插件暴露出去.+防止有未正常结束的代码 把这部分代码变成一体

通用技术:
在js下的实现:  
在内部使用JQuery代替$; 
JQuery.fn.extend() ;   
jQUery.extend():用于设置默认函数: 
```javaScript
function foo(options){
 options=jQuery.extend({ name:"bar",length:5,dataType:"xml"},options);
};

调用 foo({name:"啊打发",length:1})
或 foo({name:"发的说法") 其他默认完成
```
 编写插件
```

;(function($){
// 代码编写区
$.fn.extend({
	函数名:function(value){
		return this.css("color",value);
	}
})
$("div").函数名(value);即可调用

})(jQuery);

;(function($){
// 代码编写区
$.fn.extend({
	"color":function(value){
		return this.css("color",value);
	}
})
})(jQuery);
```

封装全局的函数插件  
放在jQuery的 命名空间里面,
`{ 函数名: function(value){   },函数名: function(value){}}`

居中设置: container 
pull-right:右对齐

