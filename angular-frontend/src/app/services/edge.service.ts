import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Contact } from '../models/contact';
import { Photo } from '../models/photo';
import { Video } from '../models/video';

@Injectable({
  providedIn: 'root'
})
export class EdgeService {

  constructor(
    private http: HttpClient
  ) { }

  // Method to get all photos from database
  getAllPhotos(): Observable<Photo[]> {
    return this.http.get<Photo[]>('http://localhost:8080/photos');
  }

  // Method to get all videos from database
  getAllVideos(): Observable<Video[]> {
    return this.http.get<Video[]>('http://localhost:8080/videos');
  }

  /** Method to store contacts in database **/
  storeContact(contact: Contact): void {
    this.http.post('http://localhost:8080/add-contact', this.body(contact)).subscribe(data =>
    console.log('Stored contact'));
  }  

  /** Method to send mail with contact info **/
  sendMail(contact: Contact): void {
    this.http.post('http://localhost:8080/send-mail', this.body(contact)).subscribe(data =>
    console.log('Sent email'));
  }

  body(contact: Contact): any{
    let contactBody: any = {
      name: contact.name,
      lastName: contact.lastName,
      telephoneNumber: contact.telephoneNumber,
      email: contact.email,
      message: contact.message
    }
    return contactBody;
  }



}
