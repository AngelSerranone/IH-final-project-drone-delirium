import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import {MatTabsModule} from '@angular/material/tabs';
import {MatInputModule} from '@angular/material/input';
import {MatFormFieldModule} from '@angular/material/form-field';
import {MatCheckboxModule} from '@angular/material/checkbox';
import {MatButtonModule} from '@angular/material/button';
import {MatDialogModule} from '@angular/material/dialog';





import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { PhotoComponent } from './components/photo/photo.component';
import { VideoComponent } from './components/video/video.component';
import { ContactComponent } from './components/contact/contact.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { AboutMeComponent } from './components/about-me/about-me.component';
import { DialogComponent } from './components/dialog/dialog.component';
import { LegalDialogComponent } from './components/legal-dialog/legal-dialog.component';


@NgModule({
  declarations: [
    AppComponent,
    PhotoComponent,
    VideoComponent,
    ContactComponent,
    AboutMeComponent,
    DialogComponent,
    LegalDialogComponent,
   
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    MatTabsModule,
    MatInputModule,
    MatFormFieldModule,
    MatCheckboxModule,
    MatButtonModule,
    MatDialogModule,
 
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
