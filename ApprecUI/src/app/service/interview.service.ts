import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { LoginComponent } from '../login/login.component';
import { Interview } from '../model/interview';
import { LoginserviceService, User } from './loginservice.service';

@Injectable({
  providedIn: 'root'
})
export class InterviewService {
  
  user!: User;


  private baseUrl = "http://localhost:8080/int/get";
  constructor(
    private httpClient: HttpClient,
  ) { }

  getInterviews(): Observable<Interview[]>{
    return this.httpClient.put<Interview[]>(`${this.baseUrl}`,this.user)
  }
}
