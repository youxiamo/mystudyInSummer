## agular2 学习笔记

### angular思想

组件化: component设计每个组件有一个css,html,js; 比以往的按照资源分的内容(css一个文件夹, html一个文件夹)要方便很多,而且组件是可以重用的 尤其是表格信息;

### 目录结构

### 数据绑定
单项: 从数据源到视图 {{name}} 或[class]="name"  
<div class="woClass" [class.woClass]=" testClass == 'woClass' ">wowow</div>
<div [class]="testClass">class 测试数据</div>

单项: 从视图模板到组件:一般都是事件绑定 (用括号)(click)="dianji()"

双向: [(ngModel)]:
例如[(ngModel)]="shuang"  
相当于[ngModel]="shuang" (ngModelChange)="shuang=$event";

### 对象
```
user: User={
    your:"1",
    sex:'male',
    userName : "jia",
    desc:"wode shen",
    interest:[{type:'1',name:"jia"},{type:'2',name:"wo"},{type:'3',name:"shen"}]
}
class User{
  your:string;
  sex:string;
  userName:string;
  desc:string;
  interest:{type:string,name:string}[];
}
``` 


### 内置指令
ngClass
ngStyle
ngIf 用*ngIf
ngFor 用 *ngFor

### 表单
管道: pipe 让输出的数据按照一定的格式
{{ expression | data: "y-MM-dd EEEE"}} 将expression



### 模块
declarations: 指定属于这个模块的视图类,组件的加入就是在这里
exports: 导出视图类
imports: 引入该模块依赖的其他模块或路由,引入外包的组件和指令,管道
provider: 指定模块的依赖服务

使用exports 元数据对外暴露这些组件,指令或管道;[组件]
providers 服务引入
#### 组件的交互
子组件与父组件
@Input() 输入数据 父组件会影响到子组件 ,子组件的修改影响不了父组件 要用输出,
@Output()
inputs: [数组]
outputs: [数组]



```TypeScript
// 子组件: 
export class ListItemComponent implements OnInit{
@Input() contact: any = {};
@Output() router : string ='dddd';
}
// 父组件中

<app-list-tiem [contact]="name" (router)="jia"></app-list-tiem>
// 	contact="这个值只能是angular的变量" {{}}的
```
@ViewChild实现数据交互

`@ViewChild(ComTeComponent) comte : ComTeComponent;`  
即可调用数据及方法

内容嵌套:

#### 组件的生命周期
ngOnchanges  : 响应组件输入值改变时出发的事件,接受一个simpleChanges
ngOnInit     : 绑定输入之后值初始化组件,一般是获取数据
ngDoCheck : 变化检测,每次变化检测发生时调用, 一般不和ngOnChanges一起用
ngAfterContentChecked : 使用ng-content 时,在ngDoCheck之后调用,只调用一次
ngAfterViewInit : 上面一样 但是每次变化后都调用
ngAfterViewChecked : 创建里视图调用
ngOnDestroy : 

ngZone是一种监听变化的机制,

### 指令
[ngClass]={ className: 表达式}
[ngStyle]="{'background-color':'green'}"

