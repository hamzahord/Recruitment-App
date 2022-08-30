import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { BehaviorSubject, map, Observable } from 'rxjs';
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
  public user!: Observable<User>;
  constructor(
    private httpClient: HttpClient,
  ) {}

  
  loginUser(loginUser: Login):Observable<User>{
    console.log(loginUser)
    return this.httpClient.put<User>(`${this.baseUrl}`, loginUser);
  }

}
