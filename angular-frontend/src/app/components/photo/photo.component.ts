import { Component, OnInit } from '@angular/core';
import { Photo } from 'src/app/models/photo';
import { PhotoService } from 'src/app/services/photo.service';

@Component({
  selector: 'app-photo',
  templateUrl: './photo.component.html',
  styleUrls: ['./photo.component.css']
})
export class PhotoComponent implements OnInit {

  
  photoList: Photo[] = [];


  constructor(
    private photoService: PhotoService
  ) { }

  ngOnInit(): void {
    this.getPhotos()
  }

  /** Get all photos **/
  getPhotos(): void {
    this.photoService.getAllPhotos().subscribe(result =>{
      this.photoList=result;
    });
  }
 

}
