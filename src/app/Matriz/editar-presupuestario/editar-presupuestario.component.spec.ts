import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EditarPresupuestarioComponent } from './editar-presupuestario.component';

describe('EditarPresupuestarioComponent', () => {
  let component: EditarPresupuestarioComponent;
  let fixture: ComponentFixture<EditarPresupuestarioComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EditarPresupuestarioComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(EditarPresupuestarioComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
