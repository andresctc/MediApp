import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CompCComponent } from './comp-c.component';

describe('CompCComponent', () => {
  let component: CompCComponent;
  let fixture: ComponentFixture<CompCComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [CompCComponent]
    });
    fixture = TestBed.createComponent(CompCComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
