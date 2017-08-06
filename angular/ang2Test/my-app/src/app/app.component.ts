import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'app';
  keng= '真心坑比';
  kengBi: Jia= {
    name: 'jia',
    desc: 'jjjj'
  };
}

export class Jia {
  name: string;
  desc: string;
}
