import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Video } from '../models/video';

@Injectable({
  providedIn: 'root'
})
export class VideoService {

  constructor(
    private http: HttpClient
  ) { }

  // Methods

  getAllVideos(): Observable<Video[]> {
    return this.http.get<Video[]>('http://localhost:8082/videos');
  }

}
