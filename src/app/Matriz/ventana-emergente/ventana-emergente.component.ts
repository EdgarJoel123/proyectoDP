import { Component, Inject } from '@angular/core';
import { MatDialogRef, MAT_DIALOG_DATA } from '@angular/material/dialog';



@Component({
  selector: 'app-ventana-emergente',
  templateUrl: './ventana-emergente.component.html',
  styleUrls: ['./ventana-emergente.component.css']
})
export class VentanaEmergenteComponent {

  title: string;
  message: string;

  constructor(public dialogRef: MatDialogRef<VentanaEmergenteComponent>,
              @Inject(MAT_DIALOG_DATA) public data: { title: string, message: string }) {
    this.title = data.title;
    this.message = data.message;
  }

  cancelar(): void {
    this.dialogRef.close(false);
  }

  confirmar(): void {
    this.dialogRef.close(true);
  }

}
