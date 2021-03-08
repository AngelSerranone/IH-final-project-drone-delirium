import { AbstractControl, ValidationErrors } from "@angular/forms";

export class CustomValidators {

    static nameValidator(control: AbstractControl): ValidationErrors | null {
        const value = control.value;
        const regex = /\d/;
        if (regex.test(value)) {
            return { invalidname: true }
        }
        return null;
    }

    static emailValidator(control: AbstractControl): ValidationErrors | null {
        const value = control.value;
        const regex = /^[a-z0-9]{1,}(\.|\-|\_)?([a-z0-9]{0,})\@[a-z0-9]+\.[a-z]{2,}/;
        if (!regex.test(value)) {
            return { invalidemail: true }
        }
        return null;
    }
}
