import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EditarCertificadoComponent } from './editar-certificado.component';

describe('EditarCertificadoComponent', () => {
  let component: EditarCertificadoComponent;
  let fixture: ComponentFixture<EditarCertificadoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EditarCertificadoComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(EditarCertificadoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
