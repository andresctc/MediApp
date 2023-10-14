import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SubAComponent } from './sub-a.component';

describe('SubAComponent', () => {
  let component: SubAComponent;
  let fixture: ComponentFixture<SubAComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [SubAComponent]
    });
    fixture = TestBed.createComponent(SubAComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
