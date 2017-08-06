import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { RiNiMeiComponent } from './ri-ni-mei.component';

describe('RiNiMeiComponent', () => {
  let component: RiNiMeiComponent;
  let fixture: ComponentFixture<RiNiMeiComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ RiNiMeiComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(RiNiMeiComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should be created', () => {
    expect(component).toBeTruthy();
  });
});
