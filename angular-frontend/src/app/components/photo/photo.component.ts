import { Component, OnInit } from '@angular/core';
import { Photo } from 'src/app/models/photo';
import { PhotoDB, PhotoService } from 'src/app/services/photo.service';

@Component({
  selector: 'app-photo',
  templateUrl: './photo.component.html',
  styleUrls: ['./photo.component.css']
})
export class PhotoComponent implements OnInit {

  photoDB: PhotoDB[] = [];
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
      this.photoDB=result;
    });
    this.setPhotos(this.photoDB);
  }

  /** Set all url photos **/
  setPhotos(photoDB: PhotoDB[]): void {
    for (let element of this.photoDB) {
      this.photoList.push(new Photo(
        element.photoId,
        '../../../assets/images/square' + element.photoUrl,
        element.photoComment
      ));
    }
  }
  

}
