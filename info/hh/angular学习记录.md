
## angular 与 bootstrap 的结合使用

- 指令记载 :ng-repeat 迭代输出用于表格输出
   ``` html
   <tr ng-repeat ="stud in students>
   <td>{{stud.name}}</td>
   <td>{{stud.id}}</td>
   </tr>
   ```
	经常用于表格，在js中用ajax进行数据获取，双向绑定的不用担心其他的问题

ng-show ng-hiden 后面= 一个false 或者true 可以设置`ng-show=flag` 通过设置$scope.flag=true false即可;

```html
ng-switch on="person.sex></div>
ng-switch-when="1">
ng-switch-when="2">

ng-if="person.sex==1">
ng-show="person.sex==2">
```

ng-options:下拉框标签；`<select ng-model="youselect" ng-options="person.id as person.name in person"></select>`

ng-style:控制css的标签：`<ng-style=“myCss”> 使用$scope.myCss={color:'blue'};`

```javascript
<tr ng-repeat="item in dataTe">
            <td ng-class="$odd ? 'odd':'even'">{{$index +1 }}</td>
            <td>{{item.name}}</td>
            <td>{{item.des}}</td>
            <td><input type="checkbox" ng-model="item.complete"></td>
        </tr>
```
