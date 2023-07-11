import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EditarFisicoComponent } from './editar-fisico.component';

describe('EditarFisicoComponent', () => {
  let component: EditarFisicoComponent;
  let fixture: ComponentFixture<EditarFisicoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EditarFisicoComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(EditarFisicoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
