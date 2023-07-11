import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListarNuevosComponent } from './listar-nuevos.component';

describe('ListarNuevosComponent', () => {
  let component: ListarNuevosComponent;
  let fixture: ComponentFixture<ListarNuevosComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ListarNuevosComponent]
    });
    fixture = TestBed.createComponent(ListarNuevosComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
