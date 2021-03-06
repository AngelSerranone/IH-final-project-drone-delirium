import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PhotoService {

  constructor(
    private http: HttpClient
  ) { }

  // Methods

  getAllPhotos(): Observable<PhotoDB[]> {
    return this.http.get<PhotoDB[]>('http://localhost:8081/photo');
  }

  
}

// Interface

export interface PhotoDB {
  photoId: number,
  photoUrl: string,
  photoComment: string
}
