import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AllCVComponent } from './all-cv.component';

describe('AllCVComponent', () => {
  let component: AllCVComponent;
  let fixture: ComponentFixture<AllCVComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AllCVComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AllCVComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
