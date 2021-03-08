import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Photo } from '../models/photo';

@Injectable({
  providedIn: 'root'
})
export class PhotoService {

  constructor(
    private http: HttpClient
  ) { }

  // Methods

  getAllPhotos(): Observable<Photo[]> {
    return this.http.get<Photo[]>('http://localhost:8081/photos');
  }

  
}


