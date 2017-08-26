import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-ttte',
  templateUrl: './ttte.component.html',
  styleUrls: ['./ttte.component.css']
})
export class TtteComponent implements OnInit {

  nameData = [{name:"wo" , desc : "jia"}]
  constructor() { }

  ngOnInit() {
  }

}
export class Jj1 {
  name: string;
}
