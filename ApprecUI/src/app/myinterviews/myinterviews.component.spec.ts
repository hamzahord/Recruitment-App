import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MyinterviewsComponent } from './myinterviews.component';

describe('MyinterviewsComponent', () => {
  let component: MyinterviewsComponent;
  let fixture: ComponentFixture<MyinterviewsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MyinterviewsComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(MyinterviewsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
