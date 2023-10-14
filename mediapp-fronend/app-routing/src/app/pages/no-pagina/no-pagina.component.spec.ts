import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NoPaginaComponent } from './no-pagina.component';

describe('NoPaginaComponent', () => {
  let component: NoPaginaComponent;
  let fixture: ComponentFixture<NoPaginaComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [NoPaginaComponent]
    });
    fixture = TestBed.createComponent(NoPaginaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
