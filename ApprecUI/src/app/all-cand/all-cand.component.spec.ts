import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AllCandComponent } from './all-cand.component';

describe('AllCandComponent', () => {
  let component: AllCandComponent;
  let fixture: ComponentFixture<AllCandComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AllCandComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AllCandComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
