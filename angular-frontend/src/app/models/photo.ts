export class Photo {
    
    constructor(
        private _photoId: number,
        private _photoUrl: string,
        private _photoComment: string,
    ){}

    public get photoId(): number {
        return this._photoId;
    }

    public set photoId(value: number) {
        this._photoId=value;
    }

    public get photoUrl(): string {
        return this._photoUrl;
    }

    public set photoUrl(value: string) {
        this._photoUrl=value;
    }

    public get photoComment(): string {
        return this._photoComment;
    }

    public set photoComment(value: string) {
        this._photoComment=value;
    }

}
