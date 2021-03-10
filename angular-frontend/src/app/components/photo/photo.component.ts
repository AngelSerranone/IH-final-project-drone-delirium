import { Component, OnInit } from '@angular/core';
import { Photo } from 'src/app/models/photo';
import { PhotoService } from 'src/app/services/photo.service';
import {MatDialog} from '@angular/material/dialog';
import { DialogComponent } from '../dialog/dialog.component';



@Component({
  selector: 'app-photo',
  templateUrl: './photo.component.html',
  styleUrls: ['./photo.component.css']
})
export class PhotoComponent implements OnInit {
  
  photoList: Photo[] = [];

  constructor(
    private photoService: PhotoService,
    public dialog: MatDialog
  ) {}

  ngOnInit(): void {
    this.getPhotos()
  }

  /** Get all photos **/
  getPhotos(): void {
    this.photoService.getAllPhotos().subscribe(result =>{
      this.photoList=result;
    });
  }

  openDialog(photo: Photo) {
    const dialogRef = this.dialog.open(DialogComponent, {
      width:'650px',
      data: {body: photo},
    });
  }

  
}

