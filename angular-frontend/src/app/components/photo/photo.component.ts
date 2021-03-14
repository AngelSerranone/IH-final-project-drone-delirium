import { Component, Input, OnInit } from '@angular/core';
import { Photo } from 'src/app/models/photo';
import {MatDialog} from '@angular/material/dialog';
import { DialogComponent } from '../dialog/dialog.component';
import { EdgeService } from 'src/app/services/edge.service';



@Component({
  selector: 'app-photo',
  templateUrl: './photo.component.html',
  styleUrls: ['./photo.component.css']
})
export class PhotoComponent implements OnInit {
  
  squareList: Photo[] = [];
  panoList: Photo[] = [];

  @Input() animationSpeed: number=2; 
  @Input() imageSize: object={width: 500, height: 200, space: 3};
  @Input() autoSlide: object={interval: 5, stopOnHover: true}
  @Input() cellWidth: number=1920;
  @Input() cellsToShow: number=1;
  @Input() manageImageRatio: boolean = false;

  imageObject: Array<object> = [{
    image: '/assets/images/pano/pano1.jpg',
    thumbImage: '/assets/images/pano/pano1.jpg',
  }, {
    image: '/assets/images/pano/pano2.jpg',
    thumbImage: '/assets/images/pano/pano2.jpg',
  }, {
    image: '/assets/images/pano/pano3.jpg',
    thumbImage: '/assets/images/pano/pano3.jpg',
  }, {
    image: '/assets/images/pano/pano4.jpg',
    thumbImage: '/assets/images/pano/pano4.jpg',
  }, {
    image: '/assets/images/pano/pano5.jpg',
    thumbImage: '/assets/images/pano/pano5.jpg',
  }, {
    image: '/assets/images/pano/pano6.jpg',
    thumbImage: '/assets/images/pano/pano6.jpg',
  }, {
    image: '/assets/images/pano/pano7.jpg',
    thumbImage: '/assets/images/pano/pano7.jpg',
  }, {
    image: '/assets/images/pano/pano8.jpg',
    thumbImage: '/assets/images/pano/pano8.jpg',
  }, {
    image: '/assets/images/pano/pano9.jpg',
    thumbImage: '/assets/images/pano/pano9.jpg',
  }, {
    image: '/assets/images/pano/pano10.jpg',
    thumbImage: '/assets/images/pano/pano10.jpg',
  }
  
];

  constructor(
    private edgeService: EdgeService,
    public dialog: MatDialog
  ) {}

  ngOnInit(): void {
    this.getPhotos(),
    console.log(window.innerWidth)
  }

  /** Get all photos **/
  getPhotos(): void {
    this.edgeService.getAllPhotos().subscribe(result =>{
      for(let photo of result) {
        if (photo.photoUrl.startsWith("square")){
          this.squareList.push(photo);
        } 
      }
    });
  }

  openDialog(photo: Photo) {
    const dialogRef = this.dialog.open(DialogComponent, {
      width:'650px',
      data: {body: photo},
    });
  }

  

}

