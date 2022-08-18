import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { LoginComponent } from './login/login.component';
import { HomeComponent } from './home/home.component';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { LayoutComponent } from './layout/layout.component';
import { RoleComponent } from './role/role.component';
import { AllCVComponent } from './all-cv/all-cv.component';
import { MyCVComponent } from './my-cv/my-cv.component';
import { AllCandComponent } from './all-cand/all-cand.component';
import { MyCandComponent } from './my-cand/my-cand.component';
import { MyinterviewsComponent } from './myinterviews/myinterviews.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    HomeComponent,
    LayoutComponent,
    RoleComponent,
    AllCVComponent,
    MyCVComponent,
    AllCandComponent,
    MyCandComponent,
    MyinterviewsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NgbModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
