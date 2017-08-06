import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { KengbiYaComponent } from './kengbi-ya.component';

describe('KengbiYaComponent', () => {
  let component: KengbiYaComponent;
  let fixture: ComponentFixture<KengbiYaComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ KengbiYaComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(KengbiYaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should be created', () => {
    expect(component).toBeTruthy();
  });
});
