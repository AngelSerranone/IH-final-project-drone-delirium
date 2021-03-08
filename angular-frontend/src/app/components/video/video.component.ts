import { Component, OnInit } from '@angular/core';
import { Video } from 'src/app/models/video';
import { VideoService } from 'src/app/services/video.service';

@Component({
  selector: 'app-video',
  templateUrl: './video.component.html',
  styleUrls: ['./video.component.css']
})
export class VideoComponent implements OnInit {

  videoList: Video[] = [];

  constructor(
    private videoService: VideoService
  ) { }

  ngOnInit(): void {
    this.getVideos()
  }

  /** Get all videos **/
  getVideos(): void {
    this.videoService.getAllVideos().subscribe(result =>{
      this.videoList=result;
      console.log(result);
    });
  }

}
