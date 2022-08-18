import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Login } from '../model/login';
import { AuthService } from '../service/auth.service';
import { LoginserviceService, User } from '../service/loginservice.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  userIds: Login = new Login();
  
  constructor(
    private loginserviceService : LoginserviceService,
    private auth : AuthService,
    private router: Router
  ) { }

  ngOnInit(): void {
    if(this.auth.isLoggedIn()){
      this.router.navigate(['']);
    }
  }

  userLogin(){

    this.loginserviceService.loginUser(this.userIds).subscribe(data=>this.auth.login().then(()=>{this.router.navigate([''])}), error=>alert("Please enter correct Email and Password"));
    
    
  }

  /*getRole(){
    this.loginserviceService.loginUser(this.)
  }*/

}
