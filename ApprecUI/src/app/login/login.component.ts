import { Component, OnInit } from '@angular/core';
import { LoginserviceService, User } from '../service/loginservice.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  users!: User[];

  constructor(
    private loginserviceService : LoginserviceService
  ) { }

  ngOnInit(): void {
    this.loginserviceService.getUsers().subscribe(
      response => this.handleSuccessfulResponse(response)
    );
  }

  handleSuccessfulResponse(response: User[]) {
    this.users = response;
}

}
