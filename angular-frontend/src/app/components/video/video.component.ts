import { Component, OnInit } from '@angular/core';
import { Video } from 'src/app/models/video';
import { EdgeService } from 'src/app/services/edge.service';


@Component({
  selector: 'app-video',
  templateUrl: './video.component.html',
  styleUrls: ['./video.component.css']
})
export class VideoComponent implements OnInit {

  videoList: Video[] = [];

  constructor(
    private edgeService: EdgeService
  ) { }

  ngOnInit(): void {
    this.getVideos()
  }

  /** Get all videos **/
  getVideos(): void {
    this.edgeService.getAllVideos().subscribe(result =>{
      this.videoList=result;
      console.log(result);
    });
  }

}
