import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EditarPagadoComponent } from './editar-pagado.component';

describe('EditarPagadoComponent', () => {
  let component: EditarPagadoComponent;
  let fixture: ComponentFixture<EditarPagadoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EditarPagadoComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(EditarPagadoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
