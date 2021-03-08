import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Contact } from '../models/contact';

@Injectable({
  providedIn: 'root'
})
export class ContactService {

  constructor(
    private http: HttpClient
  ) { }

  /** Method to store contacts in database **/
  storeContact(contact: Contact): void {
    this.http.post('http://localhost:8083/add-contact', this.body(contact)).subscribe(data =>
    console.log('Stored contact'));
  }  

  /** Method to ssend mail with contact info **/
  sendMail(contact: Contact): void {
    this.http.post('http://localhost:8083/send-mail', this.body(contact)).subscribe(data =>
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
