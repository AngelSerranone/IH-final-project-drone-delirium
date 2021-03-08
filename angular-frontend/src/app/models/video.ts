export class Video {

    constructor(
        private _videoId: number,
        private _videoUrl: string,
        private _videoComment: string,
    ){}

    public get videoId(): number {
        return this._videoId;
    }

    public set videoId(value: number) {
        this._videoId=value;
    }

    public get videoUrl(): string {
        return this._videoUrl;
    }

    public set videoUrl(value: string) {
        this._videoUrl=value;
    }

    public get videoComment(): string {
        return this._videoComment;
    }

    public set videoComment(value: string) {
        this._videoComment=value;
    }
}
