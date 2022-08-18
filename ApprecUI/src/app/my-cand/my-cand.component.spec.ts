import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MyCandComponent } from './my-cand.component';

describe('MyCandComponent', () => {
  let component: MyCandComponent;
  let fixture: ComponentFixture<MyCandComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MyCandComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(MyCandComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
