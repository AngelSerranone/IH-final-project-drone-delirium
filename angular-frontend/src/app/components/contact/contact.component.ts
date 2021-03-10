import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, FormGroupDirective, Validators } from '@angular/forms';
import { Contact } from 'src/app/models/contact';
import { ContactService } from 'src/app/services/contact.service';
import { CustomValidators } from 'src/app/utils/custom-validators';

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

  checked = false;

  constructor(
    private contactService: ContactService
  ) {
    
    // Initialize formControl
    this.name = new FormControl ('', [Validators.required, CustomValidators.nameValidator]);
    this.lastName = new FormControl ('', [Validators.required, CustomValidators.nameValidator]);
    this.telephoneNumber = new FormControl ('', []);
    this.email = new FormControl ('', [Validators.required, CustomValidators.emailValidator]);
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

  /** Method to store contacts in database */
  storeContact(formDirective: FormGroupDirective) : void {
    let contact: Contact = new Contact(this.name.value, this.lastName.value, this.telephoneNumber.value, this.email.value, this.message.value);
    this.contactService.storeContact(contact);
    this.contactService.sendMail(contact);
    this.form.reset();
    formDirective.resetForm();
    alert("Message sent successfully :)");
  }
}
