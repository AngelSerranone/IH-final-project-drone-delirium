import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, FormGroupDirective, Validators } from '@angular/forms';
import { Contact } from 'src/app/models/contact';
import { ContactService } from 'src/app/services/contact.service';

@Component({
  selector: 'app-contact',
  templateUrl: './contact.component.html',
  styleUrls: ['./contact.component.css']
})
export class ContactComponent implements OnInit {

  form: FormGroup;

  name: FormControl;
  lastName: FormControl;
  telephoneNumber: FormControl;
  email: FormControl;
  message: FormControl;

  constructor(
    private contactService: ContactService
  ) {
    
    // Initialize formControl
    this.name = new FormControl ('', [Validators.required]);
    this.lastName = new FormControl ('', [Validators.required]);
    this.telephoneNumber = new FormControl ('', []);
    this.email = new FormControl ('', [Validators.required]);
    this.message = new FormControl ('', [Validators.required]);

    // Initialize formGroup
    this.form = new FormGroup({
      name: this.name,
      lastName: this.lastName,
      telephoneNumber: this.telephoneNumber,
      email: this.email,
      message: this.message,
    });
   }

  ngOnInit(): void {
  }

  submit(formDirective: FormGroupDirective): void {

  }

  /** Method to store contacts in database */
  storeContact() : void {
    let contact: Contact = new Contact(this.name.value, this.lastName.value, this.telephoneNumber.value, this.email.value, this.message.value);
    this.contactService.storeContact(contact);
    alert("message sent successfully");
  }

  storeContactEnter(event: KeyboardEvent): void {
    if (event.key === "Enter") {
      this.storeContact();
    }
  }

}
