import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { RiNiMeiComponent } from './ri-ni-mei/ri-ni-mei.component';
import { KengbiYaComponent } from '..//app/kengbi-ya/kengbi-ya.component';
import { TtteComponent } from '..//app/ttte/ttte.component';

@NgModule({
  declarations: [
    AppComponent,
    RiNiMeiComponent,
    KengbiYaComponent,
    TtteComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
