import { Component, Inject, OnInit } from '@angular/core';
import { MatDialogRef, MAT_DIALOG_DATA } from '@angular/material/dialog';
import { Photo } from 'src/app/models/photo';
import { PhotoComponent } from '../photo/photo.component';

@Component({
  selector: 'app-dialog',
  templateUrl: './dialog.component.html',
  styleUrls: ['./dialog.component.css']
})
export class DialogComponent implements OnInit{

  constructor(
    public dialogRef: MatDialogRef<PhotoComponent>,
    @Inject(MAT_DIALOG_DATA) public data: { body:Photo },
  ) { }

  ngOnInit(): void {
    
  }

  

}
