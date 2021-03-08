export class Contact {

    constructor(
        private _name: string,
        private _lastName: string,
        private _telephoneNumber: string,
        private _email: string,
        private _message: string,
    ){}

    public get name(): string {
        return this._name;
    }

    public set photoUrl(value: string) {
        this._name=value;
    }

    public get lastName(): string {
        return this._lastName;
    }

    public set lastName(value: string) {
        this._lastName=value;
    }

    public get telephoneNumber(): string {
        return this._telephoneNumber;
    }

    public set telephoneNumber(value: string) {
        this._telephoneNumber=value;
    }

    public get email(): string {
        return this._email;
    }

    public set email(value: string) {
        this._email=value;
    }

    public get message(): string {
        return this._message;
    }

    public set message(value: string) {
        this._message=value;
    }
}
