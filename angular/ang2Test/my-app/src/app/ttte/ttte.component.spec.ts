import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TtteComponent } from './ttte.component';

describe('TtteComponent', () => {
  let component: TtteComponent;
  let fixture: ComponentFixture<TtteComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TtteComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TtteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should be created', () => {
    expect(component).toBeTruthy();
  });
});
