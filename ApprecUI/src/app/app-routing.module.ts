import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { LayoutComponent } from './layout/layout.component';
import { AuthGuard } from './auth.guard';

const routes: Routes = [
  {
    path: "", component: LayoutComponent, canActivate:[AuthGuard], children: [
      {path: '', component: HomeComponent},
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
