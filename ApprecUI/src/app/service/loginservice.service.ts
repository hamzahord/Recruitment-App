import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Login } from '../model/login';

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
  private baseUrl = "http://localhost:8080/login";
  constructor(
    private httpClient: HttpClient
  ) { }
  
  loginUser(loginUser: Login):Observable<Object>{
    console.log(loginUser)
    return this.httpClient.put(`${this.baseUrl}`, loginUser);
  }

}
