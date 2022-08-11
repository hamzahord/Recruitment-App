import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

export class User{
  constructor(
      public userId: string,
      public userFirstname : string,
      public userLastname : string,
      public userEmail : string,
      public userPassword : string,
      public isHashed : string,
      public roles : string
  ){}
}

@Injectable({
  providedIn: 'root'
})
export class LoginserviceService {

  constructor(
    private httpClient: HttpClient
  ) { }
  
  getUsers(){
    console.log('Test call');
    return this.httpClient.get<User[]>('http://localhost:8080/users');
  }

}
