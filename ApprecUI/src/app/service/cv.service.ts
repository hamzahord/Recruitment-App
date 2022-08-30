import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Candidate } from '../model/candidate';
import { LoginserviceService } from './loginservice.service';

@Injectable({
  providedIn: 'root'
})
export class CvService {

  private baseUrl = "http://localhost:8080/getnullstatus"
  constructor(
    private httpClient: HttpClient,
  ) { }

  getNullCandidates(): Observable<Candidate[]>{
    return this.httpClient.get<Candidate[]>(`${this.baseUrl}`);
  }
}
