import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { LayoutComponent } from './layout/layout.component';
import { AuthGuard } from './auth.guard';
import { AllCVComponent } from './all-cv/all-cv.component';
import { MyCVComponent } from './my-cv/my-cv.component';
import { AllCandComponent } from './all-cand/all-cand.component';
import { MyCandComponent } from './my-cand/my-cand.component';
import { MyinterviewsComponent } from './myinterviews/myinterviews.component';

const routes: Routes = [
  {
    path: '', component: LayoutComponent, canActivate:[AuthGuard], children: [
      {path: '', component: HomeComponent},
      {path: 'allcv', component: AllCVComponent},
      {path: 'mycv', component: MyCVComponent},
      {path: 'allcand', component: AllCandComponent},
      {path: 'mycand', component: MyCandComponent},
      {path: 'interview', component: MyinterviewsComponent}
    ]
  },
  {path: "login", component: LoginComponent},
  { path: '**', redirectTo: '' }
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
